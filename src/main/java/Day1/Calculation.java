package Day1;

public class Calculation {
	
	 int x=20;
	 int y=40;
	
	
	/*void sum() {  //case 1-not taking parameters,not returning any value
		System.out.println(x+y);
	}*/
	
	/*int sum(){ //not taking parameters,returning a value
	return(x+y);	
	}*/
	 
	/* void sum(int a,int b) {  // taking parameters,not returning any value
		 System.out.println(a+b);
	 }*/

	 int sum(int a,int b) { //case 4-taking parameters,returning value
		 return(a+b);
	 }
	 
	public static void main(String[] args) {
		
		Calculation cal=new Calculation();
		System.out.println(cal.sum(200,300));
		
		
	}	

}
