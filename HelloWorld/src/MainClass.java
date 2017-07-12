import java.util.Scanner;

/**
 * Created by Gateway on 7/10/2017.
 */
public class MainClass
{
 public static void main (String[] args)
 {  int num1;
    String userName;

     // Input
     Scanner scan = new Scanner(System.in);

     System.out.println("Hello, please enter your name:");
     userName = scan.next();
     scan.nextLine();

     System.out.println("Thank you " + userName + " Please enter a number: ");

  num1 = scan.nextInt();

  scan.nextLine();


  //processing
   if (num1 % 2 != 0 && num1 < 60)
   {
       System.out.println(userName + "your number: " + num1 + " is Odd");
   }

   else if (num1 % 2 == 0)
   {
       System.out.println(userName +" your number " + num1 + " is Even");
   }

   else if ((num1 % 2 == 0) && (num1 >= 2) && (num1 < 25))
   {
       System.out.println(userName + " your number is " + num1 + " Even and less than 25");
   }

   else if ((num1 % 2 ==0) && (num1 >= 26) && (num1 <= 60))
     {
         System.out.println(userName + " your number " + num1 + " Even");
     }
   else if ((num1 % 2 == 0) && (num1 > 60))
   {
       System.out.println(userName + "your number " + num1 + " is even");
   }

   else if ((num1 != 0) && (num1 > 60))
     {
         System.out.println(userName + " your number " + num1 + " is Odd and over 60");
     }









 }
}
