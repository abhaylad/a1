import java.util.Scanner;

public class Question3 {
	
	private static Scanner sc;
	private static double ci;

	public static void main(String[] args) {
		
		int principal,time=3,rate=2,amount;
		double si;
		sc = new Scanner(System.in);
		
		amount=sc.nextInt();
		principal=amount;
		
		si=principal * rate * time;
		
		ci=principal*((Math.pow((1+rate),time))-1);
		
		
		System.out.println(si);
		System.out.println(ci);
		
		
		
		
	}

}
