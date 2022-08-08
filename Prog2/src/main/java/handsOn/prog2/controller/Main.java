package handsOn.prog2.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import handsOn.prog2.models.Student;
import handsOn.prog2.services.StudentService;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student roll no");
		int roll = sc.nextInt();
		System.out.println("Enter student fees");
		int fees = sc.nextInt();
		System.out.println("Enter student Name");
		String name = sc.next().toUpperCase();
		sc.nextLine();
		System.out.println("Enter student standard");
		String standard = sc.next();
		sc.nextLine();
		System.out.println("Enter student dob");
		String dob = sc.next();
		sc.close();

		Student st = new Student(roll, fees, name, standard, dob);
		StudentService svr = new StudentService();
		System.out.println(svr.insertStudent(st));
//		Without RollNo Passed will display all the records
		ResultSet rs = svr.showStudents();
//		With RollNo will display particular record
//		ResultSet rs = svr.showStudents(9896);

		try {
			while (rs.next()) {
				System.out.println(rs.getInt("Rollno") + " " + rs.getString(2) + " " + rs.getString(3) + " "
						+ rs.getDate(4) + " " + rs.getInt(5));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
