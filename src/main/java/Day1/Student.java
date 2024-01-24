package Day1;

public class Student {
	
	int sid;
	String sname;
	char Grade;
	
	void getValues(int id,String name,char g) {
		sid=id;
		sname=name;
		Grade=g;
	}
	
	Student(int id,String name,char g){
		sid=id;
		sname=name;
		Grade=g;
	}
	
	public void display() {
		
		System.out.println(sid+" "+sname+" "+Grade);		
		
	}
			
	
	

}
