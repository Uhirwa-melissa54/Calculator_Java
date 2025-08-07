import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        while(true) {
            System.out.println("Hello!, Welcome to our fantastic calculator\nWhich Operation do You want to work on");
            System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Exit");
            Scanner input1 = new Scanner(System.in);
            System.out.println("Chooose an option");
            int option = input1.nextInt();
            if (option == 5) {
                System.out.println("Thank you for using our calculator");
                break;

            }
            else{
            System.out.println("Enter first number and second number");
            int number1 = input1.nextInt();

            int number2 = input1.nextInt();
            double result = 0;


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
                        if (number2 == 0) {
                            System.out.println("Error");
                            break;
                        }
                        result = (double) number1 / (double) number2;
                        break;


                    default:
                        System.out.println("Invalid option");
                        break;


                }
                System.out.println(result);
            }
        }

        }
       
    }