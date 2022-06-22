import java.util.Scanner;

class Calculator{

    public static void main(String[] args) {
        
        Scanner brain = new Scanner(System.in);
        char operator;
        double num1, num2 ;
        System.out.print("ENTER THE OPERATOR (+, -, *, /): ");
        operator = brain.next().charAt(0);

        System.out.println("ENTER FIRST NUMBER: ");
        num1 = brain.nextDouble();

        System.out.println("ENTER SECOND NUMBER: ");
        num2 = brain.nextDouble();

        brain.close();

        switch(operator){
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1+num2));
                break;

            case '-':
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1-num2));
                break;

            case '*':
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1*num2));
                break;

            case '/':
                if(num2 != 0)
                System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1/num2));
                else
                System.out.println("DIVIDED BY ZERO = ERROR");
                break;

        }        
    }
}