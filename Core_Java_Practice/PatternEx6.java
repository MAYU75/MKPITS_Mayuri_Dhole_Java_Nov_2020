/* Java Pattern program. Left Triangle Star Pattern

           *
         * *
       * * *
     * * * *
   * * * * *

*/

import java.util.*;
public class PatternEx6
{
    public static void printStars(int n)
    {
        int i, j;
        for(i=0; i<n; i++) //outer loop for number of rows(n)
        {
			for(j=2*(n-i); j>=0; j--) // inner loop for spaces
            {
                System.out.print(" "); // printing space
            }
            for(j=0; j<=i; j++) //  inner loop for columns
            {
                System.out.print("* "); // print star
            }
            System.out.println(); // ending line after each row
        }
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
        int n = scan.nextInt();
        printStars(n);
    }
}
