package ua.nure.Vyrvykvost.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactorympl implements ConnectionFactory {

	@Override
	public Connection createConnection() throws DatabaseException {
		String driver = "org.hsqldb.jdbcDriver";
		String url = "jdbc:hsqldb:file:db/usermanagment";
		String user = "sa";
		String password = "";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException();
		}

		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new DatabaseException();
		}
	}

}
