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

	//Тест(1) день рождение уже прошел, а месяц еще идёт
	public void testGetAge1() {
		Calendar calendar=Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH,MONTH_OF_BIRTH,DAY_OF_BIRTH);
		dateOfBirth=calendar.getTime();
		user.setBirthday(dateOfBirth);
		aseertEquals(ETALONE_AGE, user.getAge());
	}
	//Тест(2) день рождение уже прошёл в этом году
	public void testAge2() {
		Calendar calendar=Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH2, DAY_OF_BIRTH);
		dateOfBirth=calendar.getTime();
		user.setBirthday(dateOfBirth);
		aseertEquals(ETALONE_AGE, user.getAge());
	
	}
	//Тест(3) день рождение сегодня
	public void testAge3() {
		Calendar calendar=Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH, DAY_OF_BIRTH);
		dateOfBirth = calendar.getTime();
		user.setDateOfBirth(dateOfBirth);
		aseertEquals(ETALONE_AGE,user.getAge());
	}
	//Тест(4) месяц рождения идёт, но день рождения ещё в переди.
	public void testAge4(){
	Calendar calendar=Calendar.getInstance();
	calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH, DAY_OF_BIRTH3);
	dateOfBirth=calendar.getTime();
	user.setBirthday(dateOfBirth);
	aseertEquals(ETALONE_AGE2,user.getAge());
		}
	//Тест(5) месяц рождения ещё не начался
	public void testAge5() {
		Calendar calendar=Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH+1, MONTH_OF_BIRTH3, DAY_OF_BIRTH);
		dateOfBirth=calendar.getTime();
		user.setBirthday(dateOfBirth);
		aseertEquals(ETALONE_AGE2, user.getAge());
	}
	//Тест(6)год рожждения ещё не начался
	public void testAge6() {
		Calendar calendar=Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH-1, MONTH_OF_BIRTH, DAY_OF_BIRTH);
		dateOfBirth=calendar.getTime();
		user.setDateOfBirth(dateOfBirth);
		aseertEquals(ETALONE_AGE2,user.getAge());
	}
	//Тест(7) год рождения идётб но месяц и день ещё в переди
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