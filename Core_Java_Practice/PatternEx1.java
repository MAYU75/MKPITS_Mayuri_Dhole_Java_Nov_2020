/*Java pattern program. Right Triangle Star Pattern

*
* *
* * *
* * * *
* * * * *

*/

import java.util.*;
public class PatternEx1
{
    public static void pyramidPattern(int n)
    {
		int i,j;
        for (i=0; i<n; i++) //outer loop for number of rows(n)
        {
            System.out.print(" "); //print space
			for (j=0; j<=i; j++ ) //inner loop for number of columns
            {
                System.out.print("* "); //print star
            }
			System.out.println();
		}
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = scan.nextInt();
        pyramidPattern(n);
    }
}
