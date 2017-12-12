package ua.nure.Vyrvykhvost.db;

import java.util.Collection;
import java.util.Date;

import javax.xml.crypto.Data;

import org.dbunit.DatabaseTestCase;
import org.dbunit.dataset.IDataSet;

import ua.nure.Vyrvykhvost.User;
import ua.nure.Vyrvykvost.db.ConnectionFactory;
import ua.nure.Vyrvykvost.db.DatabaseException;
import ua.nure.Vyrvykvost.db.HsqldbUserDAO;

public abstract class HsqldbUserDaoTest extends DatabaseTestCase {
	private HsqldbUserDAO dao;
	private static final String FIRST_NAME = "Oleg";
	private static final String LAST_NAME = "Vyrvyj";
	private ConnectionFactory connectionFactory;

	protected void setUp() throws Exception {
		super.setUp();
		dao = new HsqldbUserDAO(connectionFactory);
	}

	public void testCreate() throws DatabaseException {
		User user = new User();
		User resUser;
		Date dateOfBirth = new Date();
		user.setFirstName(FIRST_NAME);
		user.setLastName(LAST_NAME);
		user.setDateOfBirth(dateOfBirth);
		assertNull(user.getId());
		resUser = new User();
		assertNotNull(resUser);
		assertNotNull(resUser.getId());
		assertEquals(FIRST_NAME, resUser.getFirstName());
		assertEquals(LAST_NAME, resUser.getLastName());
		assertEquals(dateOfBirth, resUser.getDateOfBirth());
	}

	public void testFindAll() {
		Collection<User> collection;
		try {
			collection = dao.findAll();
			assertNotNull(collection);
			assertEquals(2, collection.size());
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
