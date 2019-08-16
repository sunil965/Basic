package java_8_features;

public class Student {

	public String fName;
	public String lName;
	public int rollNo;
	public boolean isPreseent;
	
	
	public Student(String fName, String lName, int rollNo, boolean isPreseent) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.rollNo = rollNo;
		this.isPreseent = isPreseent;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [fName=" + fName + ", lName=" + lName + ", rollNo=" + rollNo + ", isPreseent=" + isPreseent
				+ "]";
	}

	
}
