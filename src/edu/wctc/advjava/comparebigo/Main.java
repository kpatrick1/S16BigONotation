package edu.wctc.advjava.comparebigo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter a number under 100: ");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        long wholeNumber = Long.parseLong(input);
        int c = 0;

        System.out.println("What is 'C'");
        c = keyboard.nextInt();

        System.out.printf("%9s     %9s     %9s     %9s     %9s     %9s     %9s     %8s\n",
                "O(1)","O(log n)","O(n)","O(n2)","O(nc)", "O(2n)","O(cn)", "O(n!)");
        System.out.printf("%9s     %9s     %9s     %9s     %9s     %9s     %9s     %9s\n",
                "--------","--------","--------","--------","--------", "--------","--------", "--------");
        for (int i=0; i<wholeNumber; i++) {

            System.out.printf("%9s     %9s     %9s     %9s     %9s     %9s     %9s     %9s\n",
                    1,
                    String.format("%.2f",two(i)),
                    String.format("%.2f",three(i)),
                    String.format("%.2f",four(i)),
                    String.format("%.2f",five(i,c)),
                    String.format("%.2f",six(i)),
                    String.format("%.2f",seven(i,c)),
                    String.format("%.2f",eight(i))
            );
        }
    }


    private static double two(int num) {
        Double d = new Double(num);
        return Math.log(d);
    }

    private static double three(int num) {
        return num;
    }

    private static double four(int num) {
        return num * num;
    }

    private static double five(int num, int c) {
        //WHAT IS THE C
        //2 RAISED TO N
        return Math.pow(num, c);

    }

    private static double six(int num) {
        //WHAT IS THE C > 2
        //2 RAISED TO N
        return Math.pow(2,num);
    }

    private static double seven(int num, int c) {
        //WHAT IS THE C
        //2 RAISED TO N
        return Math.pow(c, num);
    }

    private static double eight(int num) {
        //WHAT IS THE C
        //2 RAISED TO N
        return factorial(num) ;
    }

    private static double factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
