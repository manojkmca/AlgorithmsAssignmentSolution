import java.util.Arrays;
import java.util.Scanner;

public class MainDriverClass {

	public static void main(String[] args) {
		int i;

		System.out.println("Enter the Number of Companies: ");
		Scanner sc = new Scanner(System.in);
		int TotalCompanyCount=sc.nextInt();
		System.out.println("Total company count is : " + TotalCompanyCount);
		System.out.println();
		//Scanner sc = new Scanner(System.in);

		double[] stockValues = new double [TotalCompanyCount]; 
		for(i=0; i<TotalCompanyCount;i++) {
			System.out.println("Enter current stock price of the company "+ (i+1));
			stockValues[i]=sc.nextDouble();
			System.out.println(stockValues[i]);}


		/* ================== */
		String s1="1. Display the companies stock prices in ascending order";
		String s2="2. Display the companies stock prices in descending order";
		String s3="3. Display the total no of companies for which stock prices rose today";
		String s4="4. Display the total no of companies for which stock prices declined today";
		String s5="5. Search a specific stock price";
		String s6="6. press 0 to exit";

		System.out.println("\"Enter the operation that you want to perform ! \n" + s1 +"\n"+
				s2+ "\n" + s3+"\n" + s4+"\n" +s5+"\n"+s6+"\n");

		//Options code starts here
		int option = sc.nextInt();

		if (option==1) {			
			for(i=0; i<stockValues.length;i++) {
				Arrays.sort(stockValues, 0, TotalCompanyCount);
				System.out.println(stockValues[i]);
			}
			System.out.println();

		}
		//New Code added here

		else if (option==2) {

			for(i=0; i<stockValues.length-1;i++) {

				for(int j = 0; j <stockValues.length-1; j++)
				{
					if(stockValues[j] < stockValues[j + 1])
					{
						double temp = stockValues[j];
						stockValues[j] = stockValues[j + 1];
						stockValues[j + 1] = temp;
					}
				}
				for(i=0; i<stockValues.length;i++)
				{
					System.out.println(stockValues[i]);
				}
			}
			System.out.println();
		}

		//New Code added here

		else if (option==3) {

			int count=0;
			for(i=0; i<TotalCompanyCount;i++) {
				String str= sc.next();
				//System.out.println(str.toLowerCase());
				String s11="true";
				if (str.equalsIgnoreCase(s11)) {
					count++;
				}				 

			}
			System.out.println("Total no of companies for which stock prices rose today " + count);
			System.out.println();

		}	//New Code added here

		else if (option==4) {

			int count=0;
			for(i=0; i<TotalCompanyCount;i++) {
				String str= sc.next();
				String s11="false";
				if (str.equalsIgnoreCase(s11)) {
					count++;
				}				 

			}
			System.out.println("Total no of companies for which stock prices declined today " + count);
			System.out.println();


		}
		else if (option==5) {
			double searchPrice = sc.nextDouble();
			for(i=0;i<stockValues.length;i++)
			{
				if(stockValues[i]==searchPrice) {
					System.out.println( "Stock having value "+ searchPrice+ " is present");
					break;}
				else {System.out.println( "Stock having value is not present");
				break;}
			}
		}


		else if(option==0 ||option<0 || option>6){
			System.out.println("Please enter a valid option between 1 to 6 only!");
		}
		else {
			System.out.println("Good Bye !!!");
		}
		System.out.println("Final Good Bye !!!");
	}


}

