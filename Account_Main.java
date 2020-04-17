package pkg_2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;


public class Account_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<String>();

		Scanner s1 = new Scanner(System.in);

		int i=0;

		System.out.println("Do you want to create the account: ");

		String A = s1.nextLine();

		if (A.equals("Y")) {

			System.out.println("Enter the number of accounts to be created: ");

			i = s1.nextInt();

			s1.nextLine();

		}

		for(int j = 1 ; j <= i;j++) {
	

		switch(A) {

		case "Y":

			{

			Account acc = new Account();

			System.out.println("Please enter the Options for Account type" + "\n"+" A - Savings "+"\n"+" B - Current");

			String a = s1.nextLine();

			if (a.contains("A")) {

				arr.add("Savings");

			} else if(a.contains("B")) {

				arr.add("Current");

			} else {

				System.out.println("Invalied input" );

				System.exit(0);

			}

			System.out.println("Please enter the customer name");

			arr.add(s1.nextLine());

			

			System.out.println("Please enter the account number");
			
			long accNum = s1.nextLong();
			
			s1.nextLine();

			String r = accNum+"";

			arr.add(r);		

			

			System.out.println("Please enter the account balance");
			
			BigDecimal AccBal= s1.nextBigDecimal();

			s1.nextLine();

			String s = AccBal+"";

			arr.add(s);	

			

			System.out.println("Please enter the Currency");

			arr.add(s1.nextLine());			

			continue;

			}
				

			case "N":

			System.exit(0);

			}		
		
		
		}

		System.out.println("*********************************************************");


			for( int j=0; j<=arr.size()-1;j+=5) {

				

				System.out.println("Account Type: "+ arr.get(j)+"\n"+"User Name:" + arr.get(j+1) +"\n"+"Account Number:"+arr.get(j+2)+"\n"+

								 "Account Balance:"+arr.get(j+3)+"\n"+

					        		"Currency:"+arr.get(j+4)+"\n");

			


	}

}
}
