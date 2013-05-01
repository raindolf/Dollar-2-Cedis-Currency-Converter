/* ----------------------------------------------------------------------------
 Authored by Raindolf Owusu. Copyright (c) March 2013. All rights reserved.
 Email: iraindolf@gmail.com , raindolf@oasiswebsoft.com | Web: www.oasiswebsoft.com
 Github: https://github.com/raindolf 
 ----------------------------------------------------------------------------
 */

 /* This is a java console program that calculates the Currency Exchange rate from Cedi to 
 dollar and likewise.These figures are likely to change so kindly fork this project and update 
 these variables ( $dollar , cedis )to suit the latest rates. 
 */
 
import java.util.Scanner;  // imported this package to allow user data input

public class dollar2cedis

{
public static void main ( String [] args )
{

Scanner datainput = new Scanner (System.in);

double $var;
double $dollar = 0.51;
double result = 0;
int option;
double cedis = 1.94;


do{ // This loop allows the program to repeat the same task untill a user inputs zero to exist the loop

System.out.println( "This is a program that converts Cedis to USD Dollar and likewise :)");
System.out.print( "Enter one to convert from Cedis to Dollars or enter two to convert from \ndollar to cedis: ");
option = datainput.nextInt();
System.out.println( "   " );
if ( option == 1 )  // Conditions
{

System.out.print( "Please enter your digits in cedis : ");
$var = datainput.nextDouble();
result = $var * $dollar ;
System.out.println( $var + " is equivalent to " + result + " United States Dollars");
System.out.println( "   " );
}
else if ( option == 2 )
{
System.out.print( "Please enter your digits in dollars : ");
$var = datainput.nextDouble();
result = $var * cedis ;
System.out.println( $var + " is equivalent to " + result + " Ghana Cedis");
System.out.println( "   " );
}
else 
{
System.out.println ("Be Serious and read the instruction above!!"); 
// A couple of users love to have try some fun stuff so i've put this in place for them to read instructions..Cheers
}

} while ( option > 0 );

}

}
