import java.util.Scanner;

public class Main {

 

Scanner sc = new Scanner(System.in);

 

           //function to checkPalindrome

       public void checkPalindrome()  {
    	   System.out.println("Enter number:");
    	   Scanner sc = new Scanner(System.in);
    	   int num = sc.nextInt();
    	   
    	   int actNum = num;
    	   int revNum = 0, remainder;
    	   while(num>0) {
    		   remainder = num % 10;
    		   revNum = revNum * 10 + remainder;
    		   num = num/10;
    	   }
    	   
    	   if(revNum == actNum) {
    		   System.out.println("Entered num " + actNum + " is Palindrome\n");
    	   }
    	   else {
    		   System.out.println("Entered num " + actNum + " is not Palindrome\n");
    	   }

      }

 

            //function to printPattern

       public void printPattern() {
    	   System.out.println("Enter a number to print pattern:");
    	   Scanner sc = new Scanner(System.in);
    	   int num = sc.nextInt();
    	   
    	   for(int i = num; i>0; i--) {
    		   for(int j=i; j>0; j--) {
    			   System.out.print("*");
    		   }
    		   System.out.println();
    	   }

      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
        	System.out.println("Enter a number to check for Prime:");
        	Scanner sc = new Scanner(System.in);
        	int num = sc.nextInt();
        	int count = 0;
        	
        	if (num==1 || num == 0) {
        		System.out.println("Not a Prime number.");
        	}
        	else {
        		for(int i=2; i<num/2; i++)
        		{
        			if(num%i == 0) {
        				System.out.println(num + " is not a Prime number.");
        				count += 1;
        				break;
        			}
        		}
        		if(count == 0) {
        			System.out.println(num + " is a Prime number.");
        		}
        	}
        }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.
        	  System.out.println("Enter a number to print Fibonacci series:");
              Scanner sc = new Scanner(System.in);
              int num = sc.nextInt();
              int first = 0, second = 1, num3;
              System.out.print("Fibonacci Series:" + first +", "+ second);
              for(int i=3; i<=num; i++) {
            	  num3 = first+second;
            	  System.out.print(", "+num3);
            	  first = second;
            	  second = num3;
              }
              System.out.println();
          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}
