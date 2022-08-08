package handsOn.prog2.models;

public class Student {
	private int rollNo;
	private int fees;
	private String studName;
	private String standard;
	private String dob;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public Student(int rollNo, int fees, String studName, String standard, String dob) {
		super();
		this.rollNo = rollNo;
		this.fees = fees;
		this.studName = studName;
		this.standard = standard;
		this.dob = dob;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}
