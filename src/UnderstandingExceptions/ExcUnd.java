package UnderstandingExceptions;

import java.util.Scanner;

public class ExcUnd {
    public static void main(String[] args) {


        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        func(n);

        func2(n);


    }

    private static void func2(int n) {

        while (n-- > 0) {
            try {
                System.out.println(n);
                if (n == 6) {
                    throw new Exception("n==6 found");
                }
            } catch (Exception e) {
                System.out.println("came out");
            }
        }

    }

    private static void func(int n) {
        try {
            if (n == 5) {
                throw new Exception("ye kya kar rha hai");
            }

            while (n-- > 0) {
                System.out.println("no exception was found");
            }
        } catch (Exception e) {
            System.out.println("catch block");
        }


    }


}
