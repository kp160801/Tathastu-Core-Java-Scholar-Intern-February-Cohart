package core_java;

// Program 2. Write a Java program to calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
public class Program_2
{
	  public static void main(String[] args) 
	  {
         int n;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number upto which you want to print fibonacci numbers");
         n = sc.nextInt();
	     int firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) 
	    {
	      System.out.print(firstTerm + ", ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	  }
}
