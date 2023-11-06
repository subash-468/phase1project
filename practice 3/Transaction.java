package jdbcDemo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class transaction {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		Connection conn = DriverManager.getConnection(dburl, username, password);
		System.out.println("Succesfully connected");

		String q1 = "insert into movies values('Leo','Anaimation','vijay', 2023)";
		String q2 = "update movies set Director='lokesh' where Title='managaram'";
		String q3 = "delete from movies where title='master'";

		boolean flag = false;

		conn.setAutoCommit(false);

		Statement stmt = conn.createStatement();

		stmt.addBatch(q1);
		stmt.addBatch(q2);
		stmt.addBatch(q3);

		int[] result = stmt.executeBatch();

		for (int i = 0; i < result.length; i++) {

			System.out.println(i);

			if (result[i] == 0) {

				flag = true;
				break;
			}

		}
		if (flag == false) {

			conn.commit();
			System.out.println("Transaction Successful");
		} else {

			conn.rollback();
			System.out.println("Transaction is not Successful");
		}

		conn.close();

	}

}