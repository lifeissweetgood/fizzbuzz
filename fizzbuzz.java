import java.util.*;

// To compile:
//      $ javac fizzbuzz.java
// To run:
//      $ java fizzbuzz

public class fizzbuzz
{
    public static void main(String args[])
    {
        System.out.print("Gimme a number and then hit 'enter' : ");
        Scanner rdrInput = new Scanner(System.in);
        int rdrNum = rdrInput.nextInt();

        for(int i=1; i <= rdrNum; i++)
        {
            if( i % 15 == 0 )
            {
                System.out.println("fizzbuzz");
            }
            else if( i % 5 == 0 )
            {
                System.out.println("buzz");
            }
            else if( i % 3 == 0 )
            {
                System.out.println("fizz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
