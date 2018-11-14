import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		
		int income;
		
		System.out.println("Enter Income CTC to know payable tax amount");
		
		Scanner sc= new Scanner(System.in);
		income= sc.nextInt();
		
		if(income<180000 && income>0) {
			System.out.println("Payable tax amount is NIL");
		}
		
		else if(income>181001 && income<300000)
		{
			System.out.println("Payable tax amount is 10%");
		}
		else if (income>300001 && income<500000)
		{
			System.out.println("Payable tax amount is 20%");
		}
		else if(income>500001 && income<1000000) {
			System.out.println("Payable tax amount is 30%");
		}
	}

}
