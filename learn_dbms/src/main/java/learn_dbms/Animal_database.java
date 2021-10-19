package learn_dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Animal_database {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:h2:~/test";
		try (Connection con = DriverManager.getConnection(url); Statement stmt = con.createStatement();) {
			// stmt.executeUpdate("create table Animal(ID integer, name varchar(100),dob
			// date)");
			stmt.executeUpdate("insert into Animal values(1,'Monkey','2000-03-13')");
			stmt.executeUpdate("insert into Animal values(2,'Lion','2001-04-14')");
			stmt.executeUpdate("insert into Animal values(3,'Fox','2002-05-15')");
			System.out.println(stmt.executeQuery("select name from Animal"));
			stmt.executeUpdate("delete from Animal where ID=3");
			stmt.executeUpdate("update Animal set name = 'Giraffe' where ID=2");
			try (ResultSet rs = stmt.executeQuery("select * from Animal")) {
				while (rs.next())
					System.out.println(rs.getString(2));
			}
		}

	}

}
