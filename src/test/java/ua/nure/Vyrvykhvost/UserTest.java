package ua.nure.Vyrvykhvost;

import org.junit.Test;

import junit.framework.TestCase;

public class UserTest extends TestCase {
	@Test
	public void testFullName(){
		User user = new User();
		user.setFirstName("Oleg");
		user.setLastName("Vyrvyj");
		String fullName = user.getFullName();
	assertEquals("Oleg Vyrvyj", fullName);
	User age = new User();
	age.setDateOfBirth("17");
	String age = 
	
	}
}
