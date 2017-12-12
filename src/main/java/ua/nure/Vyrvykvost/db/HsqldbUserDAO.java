package ua.nure.Vyrvykvost.db;

import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;

import org.omg.CORBA.Any;
import org.omg.CORBA.Object;
import org.omg.CORBA.TypeCode;
import org.omg.DynamicAny.DynAny;
import org.omg.DynamicAny.DynAnyOperations;
import org.omg.DynamicAny.DynAnyPackage.InvalidValue;
import org.omg.DynamicAny.DynAnyPackage.TypeMismatch;

import ua.nure.Vyrvykhvost.User;

public class HsqldbUserDAO implements DAO<User> {
	private static final String INSERT_QUERY = "INSERT INTO users (firstname, lastname, dateofbirth) VALUSE (?,?,?)";
	HsqldbUserDAO dao;
	private ConnectionFactory connectionFactory;
	
	public HsqldbUserDAO(ConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
	}


	public User create(User user) throws DatabaseException {
		try {
			User resultUser = new User(user);
			Connection connection = connectionFactory.createConnection(); 
			PreparedStatement statment = connection.prepareStatement(
					INSERT_QUERY);
			statment.setString(1, user.getFirstName());
			statment.setString(2, user.getLastName());
			statment.setDate(3, new java.sql.Date(user.getDateOfBirth().getTime()));
			int n = statment.executeUpdate();
			if (n != 1) {
			    throw new DatabaseException("Mumber of the inserted rows: "+ n);
			}
			CallableStatement callableStatement = connection.prepareCall("call IDENTITY()");
			ResultSet id = callableStatement.executeQuery();
			if (id.next()){
				resultUser.setId(new Long(id.getLong(1)));
			}
			id.close();
			callableStatement.close();
			statment.close();
			connection.close();
			return resultUser;
		} catch (SQLException e) {
		    throw new DatabaseException(e);
		}
	}


	@Override
	public User update(User t) throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void delete(User t) throws DatabaseException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Collection<User> findAll() throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User find(Long id) throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

}
