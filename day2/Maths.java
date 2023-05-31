package week1.day2;

public class Maths {
	
	public int addition(int a, int b) {
	return a + b;
	}
	
	public int subtraction( int a, int b) {
		return a - b;
	}
	
	public int division( int a, int b) {
		return a%b;
	}
	public static void main(String[] args) {
		
		Maths oper = new Maths();
		System.out.println(oper.addition(10, 5));
		System.out.println(oper.subtraction(20,10));
		System.out.println(oper.division(50,3));
		}

}
