import java.util.Scanner;

public class DoubleA {


    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);

        // String input
        String input = sc.nextLine();

        final int outState0 = 0;
        final int outState1 = 1;
        final int outState2 = 2;
        int state = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);


            switch (state)
            {
                case outState0:
                    if (c == 'a') {
                        state = outState1;
                    } else {
                       state = outState0;
                    }
                    break;

                case outState1:
                    if(c == 'a')
                    {
                        state = outState2;
                    }
                    else
                    {
                        state = outState0;
                    }
                    break;

                case outState2:
                    if(c == 'a')
                    {
                        state = outState2;
                    }
                    else
                    {
                       state = outState2;
                    }
                    break;

            }

        }

        if(state == outState0 || state == outState1) System.out.println("YES");
        else System.out.println("NO");
    }

}