import java.util.Scanner;

public class Question6 {
public static void main(String[] args) {
		
		String loginId="abhay",password="lad";
		
		
		
		
		int count=0;
		
		while(count<3) {
			
			System.out.println("Enter login name");
			Scanner sc= new Scanner(System.in);
			String login= sc.nextLine();
			
			System.out.println("Enter Passsword");
			Scanner sc1= new Scanner(System.in);
			String password1= sc1.nextLine();
			if((loginId.equals(login)) && (password.equals(password1))) {
				System.out.println("Welcome");
				count=3;
			}
			
			else
			{
				System.out.println("invalid ");
				count++;
			}
			
				
			}
		}
		
		
		
		
		
		
		
		
		
}
