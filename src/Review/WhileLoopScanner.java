package Review;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) {
        /*
        you need to ask user to enter numbers 1 by 1
        until user enters not integer value- then loop should stop

        Inside loop we need to calculate the sum of all entered numbers
         */
        Scanner sc=new Scanner((System.in));
        int sum=0; //nije bitno gde stavit
        System.out.println("Please enter integer values");
        while(sc.hasNextInt()) {
            int num = sc.nextInt();
            sum = sum + num;
        }
        System.out.println("Sum ="+sum);
    }
}
