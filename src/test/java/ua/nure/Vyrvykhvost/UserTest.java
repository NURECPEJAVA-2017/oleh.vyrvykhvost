package ua.nure.Vyrvykhvost;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;


import junit.framework.TestCase;

public class UserTest extends TestCase {
	private static final int getTime = 2017-1984;
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
	assertEquals("Oleg Vyrvyj", fullName);
	


	
	}
	public void testGetAge(){
		user.setDateOfBirth(dateOfBirth);
		assertEquals(2017-1984,user.getAge());
	}
}
