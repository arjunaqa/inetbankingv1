package Day1;

public class StudentDemo {
	
	
	int SID;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;
	
	
	public void getStuData(int id,String name) {
		SID=id;
		Sname=name;
		
			}
	
	void getvalues() {
		System.out.println(SID+" "+Sname);
	}
	
	public void getStuMarks(int marks1,int marks2,int marks3) {
		Sub1=marks1;
		Sub2=marks2;
		Sub3=marks3;
		
	}
	
	public void totalmarks() {
		System.out.println(Sub1+Sub2+Sub3);
	}
	
	void display() {
		System.out.println(SID+" "+Sname);
	}

	public static void main(String[] args) {
		
		
		StudentDemo stu1=new StudentDemo();
		
		stu1.SID=101;
		stu1.Sname="Shanu";
		stu1.getvalues();
		stu1.getStuData(101,"John");
		stu1.getStuMarks(100,200,300);
		stu1.totalmarks();
		stu1.display();
		
		StudentDemo stu2=new StudentDemo();
		stu2.getStuData(102,"Raju");
		stu2.getStuMarks(200,300,400);
		stu2.totalmarks();
		stu2.display();
	}

}
