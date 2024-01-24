package Day1;

public class ConstructorDemo {
	
	int x;
	int y;
	
	public ConstructorDemo() {
		x=20;
		y=30;
	}
	
	public ConstructorDemo(int a,int b) {
		
		x=a;
		y=b;
	}
	
	void display() {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		ConstructorDemo cd=new ConstructorDemo();
		cd.display();
		
		ConstructorDemo cd1=new ConstructorDemo(100,200);
		cd1.display();
	}

}
