package handsOn.prog2.services;

import java.sql.ResultSet;

import handsOn.prog2.dao.StudentDAO;
import handsOn.prog2.models.Student;

public class StudentService {

	public String insertStudent(Student st) {
		StudentDAO dao = new StudentDAO();
		return dao.insertStudent(st);
	}

	public ResultSet showStudents(int roll) {
		StudentDAO dao = new StudentDAO();
		return dao.showStudents(roll);

	}

	public ResultSet showStudents() {
		StudentDAO dao = new StudentDAO();
		return dao.showStudents();

	}

}
