package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int a= 11;
		for(int i=2;i<=a-1;i++){
			if(a%i==0) {
				System.out.println(a + "is a prim number");
				break;
			}
			else if(a%i!=0)
{
				System.out.println(a + "is not a prime number");
				break;
}
	
			}
		}

	}

