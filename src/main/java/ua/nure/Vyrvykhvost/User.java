package ua.nure.Vyrvykhvost;

import java.util.Date;

public class User {
	

	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private Long id;
	
	public User(User user) {
		this.id = user.getId();
		this.firstName= user.getFirstName();
		this.lastName = user.getLastName();
		this.dateOfBirth = user.getDateOfBirth();
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getAge() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
