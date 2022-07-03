import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                char respond;
                Double num1, num2, result;


                Scanner input = new Scanner(System.in);

                System.out.println("Enter the first number");
                num1 = input.nextDouble();

                System.out.println("Enter your second number");
                num2 = input.nextDouble();

                System.out.println("what operator you wanted to use? +, -, *, /");
                respond = input.next().charAt(0);

                switch (respond){

                    case '+':
                        result = num1 + num2;
                        System.out.println(result);
                        break;

                    case '-':
                        result = num1 + num2;
                        System.out.println(result);
                        break;

                    case '*':
                        result = num1 * num2;
                        System.out.println(result);
                        break;

                    case '/':
                        result = num1 / num2;
                        System.out.println(result);
                        break;
                }

            }
        }
    }
}
