import java.util.Random;
import java.util.Scanner;
 class Random_num{
	public static void main(String[]args){
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		int random_num=r.nextInt(100)+1;
		//System.out.println(random_num);
		
		int no_guesses=1,num=0;
		while(num!=random_num){

		System.out.println("Enter a number to 1 to 100:");
	    num=sc.nextInt();
		
		if(num>random_num){
			System.out.println("Please enter a low number !");
		}
		else if(num<random_num){
			System.out.println("Please enter a high number !");
		}
		else{
			System.out.printf("Congratulations !");
			break;
		}
		no_guesses++;
	}
		System.out.println(" You guess the right number in :"+no_guesses+" attempts .");
	}
}