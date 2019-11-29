
public class Student {
	String name;
	int rollno;
	final String cname = "Qspiders";
	final int cid;
	
	Student(){
		this.cid = 300;
	}
	
	Student(String name, int rollno, int cid){
		this.cid = 0;
		this.name = name;
		this.rollno = rollno;
	}
	
	final void printDetails() {
		System.out.println("Hi " + name + ", Welcome to " + cname);
	}
	
	final void printDetails(String name) {
		System.out.println("Hi " + name + ", Welcome to " + cname);
	}
}
