package Project;
import java.util.*;			//1.import 
import java.util.random.*;
import java.util.Scanner;
class start{             
	int roleChoice;      //2.Data-type
	int t;
	int u;
	int o;
	Scanner sc =new Scanner(System.in);           //3.Scanner
	start() {
		
		while(true) {                              //4.loop
	        	System.out.println("-------------------------------------------------------------------------------");
	        	System.out.println("1. Front End role");
		        System.out.println("2. Back End role");
		        System.out.println("3. DataBase role");
		        System.out.println("Enter any one from the above three roles by indicating the number:");
		        System.out.println("-------------------------------------------------------------------------------");
		         roleChoice = sc.nextInt();			
		        
		        switch(roleChoice) {                   //5.Switch case
		            case 1:
		                System.out.println("You have chosen Front-End Role");
		                timeslot();
		                break;						//6.Break
		            case 2:
		                System.out.println("You have chosen Back-End Role");
		                timeslot();
		                break;
		            case 3:
		                System.out.println("You have chosen DataBase Role");
		                timeslot();
		                break;
		            default:
		                System.out.println("Enter the correct role...");
		          
		    }
		        System.exit(0);
		}
	}
	 public  void timeslot() {                       //7.Method
	        System.out.println("-------------------------------------------------------------------------------");
	        System.out.println("Select your Time slot...");
	        System.out.println("1. 10:00 A.M\n2. 12:00 P.M\n3. 2:00 P.M");
	        System.out.println("-------------------------------------------------------------------------------");
	        t = sc.nextInt();
	        switch(t) {
	            case 1:
	                System.out.println("You have chosen 10 A.M slot");
	                break;
	            case 2:
	                System.out.println("You have chosen 12 P.M slot");
	                break;
	            case 3:
	                System.out.println("You have chosen 2 P.M slot");
	                break;
	            default:
	                System.out.println("Kindly enter the correct time slot...");
	               return;
	        }
	        
	        System.out.println("----Thank you for choosing your JobRole and timeslot----");
	        System.out.println("----Kindly fill up the upcoming details----");
	        getUserInfo();
	        System.out.println("----The choice you have chosen in shown below----");
	        System.out.println("RoleChoice :"+roleChoice);
	        System.out.println("TimeSlot   :"+t);
	        if(roleChoice==1 && t==1) {			//If condition
	        	System.out.println("----We Selected you Question Paper A");
	        	questionSetA();
	        }
	        else if(roleChoice==2 && t==2) {    
	        	System.out.println("----We Selected you Question Paper A");
	        	questionSetA();
	        }
	        else if(roleChoice==3 && t==3) {	
	        	System.out.println("----We Selected you Question Paper A");
	        	questionSetA();
	        }
	        else if(roleChoice==1 && t==2) {
	        	System.out.println("----We Selected you Question Paper B");
	        	questionSetB();
	        }
	        else if(roleChoice==2 && t==3) {
	        	System.out.println("----We Selected you Question Paper B");
	        	questionSetB();
	        }
	        else if(roleChoice==3 && t==1) {
	        	System.out.println("----We Selected you Question Paper B");
	        	questionSetB();
	        }
	        else if(roleChoice==1 && t==3){
	        	System.out.println("----We Selected you Question Paper C");
	        	questionSetC();
	        }
	        else if(roleChoice==2 && t==1){
	        	System.out.println("----We Selected you Question Paper C");
	        	questionSetC();
	        }
	        else if(roleChoice==3 && t==2){
	        	System.out.println("----We Selected you Question Paper C");
	        	questionSetC();
	        }
}
	 public  void getUserInfo() {
	        Scanner inf = new Scanner(System.in);
	        System.out.println("-------------------------------------------------------------------------------");
	        System.out.println("Kindly Enter your information...");
	        System.out.print("Enter your Name: ");
	        String N = inf.nextLine();
	        System.out.print("Enter your Gender: ");
	        String G = inf.nextLine();
	        System.out.print("Enter your Age: ");
	        int A = inf.nextInt();
	        System.out.print("Enter your Mobile Number: ");
	        long M = inf.nextLong();
	        System.out.println("-------------------------------------------------------------------------------");

	        
	        System.out.println("\nUser Details:");
	        System.out.println("Name    : " + N);
	        System.out.println("Gender  : " + G);
	        System.out.println("Age     : " + A);
	        System.out.println("Mobile  : " + M);
	        System.out.println("-------------------------------------------------------------------------------");
	    }
	 	public  void questionSetA() {
	 		Scanner ans1 =new Scanner(System.in);
	        System.out.println("Question A\n");
	        System.out.println (" ");
	        System.out.println("Q1: A train 150 meters long is running at a speed of 50 km/h. How much time will it take to pass a pole?");	
	        System.out.println("a) 10.8 seconds\r\n"+ "b) 7.2 seconds\r\n"+ "c) 15  seconds\r\n"+ "d) 12  seconds");
	        System.out.println("Enter Your Answer: ");
	        String A1 = ans1.nextLine();
	        System.out.println (" ");
	        System.out.println("Q2: Find the odd one out: 3, 5, 7, 12, 17, 19.");
	        System.out.println("a) 3\r\n"+ "b) 12\r\n"+ "c) 17\r\n"+ "d) 19");
	        System.out.println("Enter Your Answer: ");
	        String A2 = ans1.nextLine();
	        System.out.println (" ");
	        System.out.println("Q3: Choose the correctly spelled word:");
	        System.out.println("a) Neccessary\r\n"+ "b) Necessary\r\n"+ "c) Necesary\r\n"+ "d) Nacessary");
	        System.out.println("Enter Your Answer: ");
	        String A3 = ans1.nextLine();
	        System.out.println (" ");
	        System.out.println ("Q4: A survey shows 70% of people like movies, 40% like sports, and 20% like both. What percentage like either movies or sports?");
	        System.out.println("Enter Your Answer: ");
	        String A4 = ans1.nextLine();
	        System.out.println();
	        System.out.println("The answers you have entered ");
	        System.out.println(A1);
	        System.out.println(A2);
	        System.out.println(A3);
	        System.out.println(A4);
	        System.out.println("-------------------------------------------------------------------------------");
	        generateOtp();
	        comp();
	        ans1.close();
	 	}

	    public  void questionSetB() {
	    	Scanner ans2 =new Scanner(System.in);
	        System.out.println("Question B\n");
	        System.out.println (" ");
	        System.out.println("Q1:If 15 workers can build a wall in 10 days, how many workers are needed to build the same wall in 5 days?");	
	        System.out.println("a) 20\r\n"+ "b) 25\r\n"+ "c) 30\r\n"+ "d) 35");	
	        System.out.println("Enter Your Answer: ");
	        String B1 = ans2.nextLine();
	        System.out.println (" ");
	        System.out.println("Q2:A is the mother of B, and B is the sister of C. How is A related to C?");
	        System.out.println("a) Sister\r\n"+ "b) Mother\r\n"+ "c) Aunt\r\n"+ "d) Grandmother");
	        System.out.println("Enter Your Answer: ");
	        String B2 = ans2.nextLine();
	        System.out.println (" ");
	        System.out.println("Q3:Replace the underlined word with a suitable alternative: She is _fond of_ music.");
	        System.out.println("a) Caring for\r\n"+ "b) Addicted to\r\n"+ "c) Interested in\r\n"+ "d) Fond about");
	        System.out.println("Enter Your Answer: ");
	        String B3 = ans2.nextLine();
	        System.out.println (" ");
	        System.out.println ("Q4: The average of 4 numbers is 60. If the fifth number is added, the average becomes 64. What is the fifth number?");
	        System.out.println("Enter Your Answer: ");
	        String B4 = ans2.nextLine();
	        System.out.println();
	        System.out.println("The answers you have entered ");
	        System.out.println(B1);
	        System.out.println(B2);
	        System.out.println(B3);
	        System.out.println(B4);
	        System.out.println("-------------------------------------------------------------------------------");
	        generateOtp();
	        comp();
	        ans2.close();
	    }

	    public  void questionSetC() {
	    	Scanner ans3 =new Scanner(System.in);
	        System.out.println("Question C\n");
	        System.out.println (" ");
	        System.out.println("Q1: A man bought an article for ₹240 and sold it for ₹300. What is his profit percentage?");	
	        System.out.println("a) 20%\r\n"+ "b) 25%\r\n"+ "c) 30%\r\n"+ "d) 35%");	
	        System.out.println("Enter Your Answer: ");
	        String C1 = ans3.nextLine();
	        System.out.println (" ");
	        System.out.println("Q2:In a certain code language, \"BEAR\" is written as \"CDCS.\" How will \"LION\" be written?");
	        System.out.println("a) MNQP\r\n"+ "b) MNJN\r\n"+ "c) MJPO\r\n"+ "d) MOJN");
	        System.out.println("Enter Your Answer: ");
	        String C2 = ans3.nextLine();
	        System.out.println (" ");
	        System.out.println("Q3:Find the synonym for \"Abundant\":");
	        System.out.println("a) Rare\r\n"+ "b) Scarce\r\n"+ "c) Plentiful\r\n"+ "d) Small");
	        System.out.println("Enter Your Answer: ");
	        String C3 = ans3.nextLine();
	        System.out.println (" ");
	        System.out.println ("Q4:  A bar chart shows the sales of a product over 5 months: 100, 120, 150, 130, and 140 units. What is the average sales per month?");
	        System.out.println("Enter Your Answer: ");
	        String C4 = ans3.nextLine();
	        System.out.println();
	        System.out.println("The answers you have entered ");
	        System.out.println(C1);
	        System.out.println(C2);
	        System.out.println(C3);
	        System.out.println(C4);
	        System.out.println("-------------------------------------------------------------------------------");
	        generateOtp();
	        comp();
	        ans3.close();
	    }
	    
	    public int generateOtp() {
	    	 Random ot1 = new Random();			//Inbuilt method
	         o = ot1.nextInt(9000) + 1000; // Generates 4-digit OTP
	         System.out.println("Generated OTP: " + o);
	         
	         return 0;    
	         
	    }

	    public  void comp() {
	    	System.out.println("Enter the OTP you Recived: ");
	    	 u=sc.nextInt();
	    	if (u==o) {
	    		System.out.println("Successfully Submitted");
		        System.out.println("-------------------------------------------------------------------------------");
	    	}
	    	else {
	    		comp();
	    	}
	    }
	    

}

public class Console {
public static void main(String args[]) {        //Main Method
start st = new start();     //Object Creation
System.out.println("Enter the OTP you Recived: ");

	}
}

