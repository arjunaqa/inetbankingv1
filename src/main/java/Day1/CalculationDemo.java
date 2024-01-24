package Day1;

public class CalculationDemo {
	
	int x;
	int y;
	int z;
	
	public CalculationDemo(int a,int b,int c) {
		
		x=a;
		y=b;
		z=c;
	}
	
	void sum() {
		System.out.println(x+y+z);
	}
	public static void main(String[] args) {
		
		CalculationDemo obj1=new CalculationDemo(100,200,300);
		obj1.sum();

}
}