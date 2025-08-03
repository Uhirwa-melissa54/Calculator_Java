import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hello!, Welcome to our fantastic calculator\nWhich Operation do You want to work on");
        System.out.println("1.Addition \n 2.Subtraction 3. \n Multiplication \n  4.Division \n 5.Exit");
        Scanner input1 = new Scanner(System.in);
        int option = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        int number1 = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        int number2 = input3.nextInt();
        double result = 0;
        while (option != 5) {
            switch (option) {
                case 1:
                    result = number1 + number2;
                    break;
                case 2:
                    result = number1 - number2;
                    break;
                case 3:
                    result = number1 * number2;
                    break;
                case 4:
                    result = (double) number1 / (double) number2;
                    break;


                default:
                    System.out.println("Invalid option");
                    continue;


            }
            System.out.println(result);
            break;


        }
       
    }
}