import java.util.Scanner;

public class Question4 {
	
	public static void main(String[] args) {
		
		int subject1,subject2,subject3;
		
		System.out.println("Enter Marks of three Subjects");
		
		Scanner sc= new Scanner(System.in);
		subject1= sc.nextInt();
		
		Scanner sc1= new Scanner(System.in);
		subject2= sc1.nextInt();

		Scanner sc2= new Scanner(System.in);
		subject3= sc2.nextInt();

		
		if(( subject1 > 60) && ( subject2 > 60) &&( subject3 > 60)) {
			System.out.println(" Is Passed");
		}
		
		else if((( subject1 < 60) && ( subject2 > 60) &&( subject3 > 60))||(( subject1 > 60) && ( subject2 < 60) &&( subject3 > 60)) ||(( subject1 > 60) && ( subject2 > 60) &&( subject3 < 60))) {
			System.out.println(" Is Promoted");
		}
		
		else if(( subject1 < 60) || ( subject2 < 60) ||( subject3 < 60)|| (( subject1 < 60) && ( subject2 < 60) &&( subject3 < 60))) {
			System.out.println("is failed");
			
		}
		
	}

}
