package handsOn.prog2.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import handsOn.prog2models.Student;

public class StudentDAO {

	Connection con;
	PreparedStatement prep;

	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/students";
		String username = "root";
		String pass = "root";
		con = DriverManager.getConnection(url, username, pass);
		return con;

	}

	public String insertStudent(Student st) {

		String query = "insert into student values (?,?,?,?,?)";
		int i = 0;
		try {

			prep = getConnection().prepareStatement(query);
			prep.setInt(1, st.getRollNo());
			prep.setString(2, st.getStudName());
			prep.setString(3, st.getStandard());
			prep.setString(4, st.getDob());
			prep.setInt(5, st.getFees());
			i = prep.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}

		if (i > 0)
			return "Insertion Successfully";
		else
			return "Some insertion problem";

	}

	public ResultSet showStudents() {
		String query = "select * from student";
		ResultSet rs;

		try {
			prep = getConnection().prepareStatement(query);
			rs = prep.executeQuery();
			return rs;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;

	}

	public ResultSet showStudents(int rollNo) {
		String query = "select * from student where RollNo = ?";
		ResultSet rs;

		try {
			prep = getConnection().prepareStatement(query);
			prep.setInt(1, rollNo);
			rs = prep.executeQuery();
			return rs;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;

	}

}
