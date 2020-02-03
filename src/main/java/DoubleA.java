import java.util.Scanner;

public class DoubleA

{
    public static void main(String Args[])
    {

        // Read the command-line input
        Scanner scanner = new Scanner(System.in);

        // get their input as a String
        String input = scanner.next();

        boolean isPresent = input.indexOf("aa") != -1 ? true : false;

        if(isPresent)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }


    }



}
