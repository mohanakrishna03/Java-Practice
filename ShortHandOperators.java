/*  JFM1T2_Assignment4:

    Perform the following operations where a = 10 and b =20 using shorthand assignment operators and print the value of a in console for each expression.
     1. a*= b
     2. a-= b
     3. a/= b
     4. a%= b
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first value: 
    10
    Enter second value: 
    20
    
    Expected Output:
    a*=b is: 200
    a-=b is: 180
    a/=b is: 9
    a%=b is: 9
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class ShortHandOperators {

//main method
public static void main(String args[])
  {
    //Use the scanner class to provide input at execution time using scanner object
    Scanner sc=new Scanner(System.in);
    //Take input from user
     System.out.println("Enter first number: ");
  int a=sc.nextInt();
    System.out.println("Enter second number: ");
  int b=sc.nextInt();
    //print appropriate result for assignment operators
    int c =a*=b;
    System.out.println("a*=b is:"+c);
    int d=a-=b;
    System.out.println("a-=b is:"+d);
    int e=a/=b;
    System.out.println("a/=b is:"+e);
    int h=a%=b;
    System.out.println("a%=b is:"+h);
  }
}
//Should write comments properly
