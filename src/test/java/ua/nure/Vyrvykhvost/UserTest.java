package ua.nure.Vyrvykhvost;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;


import junit.framework.TestCase;

public class UserTest extends TestCase {
	private static final int getTime = 2017-1984;
	private static final String ETALONE_AGE = null;
	private static final int YEAR_OF_BIRTH = 0;
	private static final int MONTH_OF_BIRTH = 0;
	private static final int DAY_OF_BIRTH = 0;
	private static final String ETALONE_AGE2 = null;
	private static final int MONTH_OF_BIRTH2 = 0;
	private static final int MONTH_OF_BIRTH3 = 0;
	private static final int DAY_OF_BIRTH3 = 0;
	private User user;
	private Date dateOfBirth;
	protected void setUp() throws Exception{
	 super.setUp();
	user= new User();
	Calendar calendar = Calendar.getInstance();
	calendar.set(1984,Calendar.MAY,26);
	dateOfBirth=calendar.getTime();
	
	}
	
	public void testFullName(){
		User user = new User();
		user.setFirstName("Oleg");
		user.setLastName("Vyrvyj");
		String fullName = user.getFullName();
	aseertEquals("Oleg Vyrvyj", fullName);
	
	}

	//����(1) ���� �������� ��� ������, � ����� ��� ���
	public void testGetAge1() {
		Calendar calendar=Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH,MONTH_OF_BIRTH,DAY_OF_BIRTH);
		dateOfBirth=calendar.getTime();
		user.setBirthday(dateOfBirth);
		aseertEquals(ETALONE_AGE, user.getAge());
	}
	//����(2) ���� �������� ��� ������ � ���� ����
	public void testAge2() {
		Calendar calendar=Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH2, DAY_OF_BIRTH);
		dateOfBirth=calendar.getTime();
		user.setBirthday(dateOfBirth);
		aseertEquals(ETALONE_AGE, user.getAge());
	
	}
	//����(3) ���� �������� �������
	public void testAge3() {
		Calendar calendar=Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH, DAY_OF_BIRTH);
		dateOfBirth = calendar.getTime();
		user.setDateOfBirth(dateOfBirth);
		aseertEquals(ETALONE_AGE,user.getAge());
	}
	//����(4) ����� �������� ���, �� ���� �������� ��� � ������.
	public void testAge4(){
	Calendar calendar=Calendar.getInstance();
	calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH, DAY_OF_BIRTH3);
	dateOfBirth=calendar.getTime();
	user.setBirthday(dateOfBirth);
	aseertEquals(ETALONE_AGE2,user.getAge());
		}
	//����(5) ����� �������� ��� �� �������
	public void testAge5() {
		Calendar calendar=Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH+1, MONTH_OF_BIRTH3, DAY_OF_BIRTH);
		dateOfBirth=calendar.getTime();
		user.setBirthday(dateOfBirth);
		aseertEquals(ETALONE_AGE2, user.getAge());
	}
	//����(6)��� ��������� ��� �� �������
	public void testAge6() {
		Calendar calendar=Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH-1, MONTH_OF_BIRTH, DAY_OF_BIRTH);
		dateOfBirth=calendar.getTime();
		user.setDateOfBirth(dateOfBirth);
		aseertEquals(ETALONE_AGE2,user.getAge());
	}
	//����(7) ��� �������� ���� �� ����� � ���� ��� � ������
	public void testAge7() {
		Calendar calendar=Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH3, DAY_OF_BIRTH3);
		dateOfBirth=calendar.getTime();
		user.setBirthday(dateOfBirth);
		aseertEquals(ETALONE_AGE2,user.getAge());
	}

	private void aseertEquals(String etaloneAge, Object age) {
		// TODO Auto-generated method stub
		
	}
}