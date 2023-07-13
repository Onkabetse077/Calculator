import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int cal;
        int quotient;
        int remainder;

        System.out.println("Enter Two Numbers!!"); 
        System.out.println("Enter First Number:");
        Scanner aInput = new Scanner(System.in);
        num1 = aInput.nextInt();

        System.out.println("Enter Second Number:");
        num2 = aInput.nextInt();

        System.out.println("Please Select An Operation:-");
        System.out.println("1 -Add +");
        System.out.println("2 -Minus -");
        System.out.println("3 -Multiple *");
        System.out.println("4 -divide /");

        System.out.println("Please Enter The Operation Number:-");
        num3=aInput.nextInt();

        if(num3 == 1){
            cal = num1 + num2;
            System.out.println("Addition of Two Numbers:-" + cal);
        }
        else if(num3 == 2){
            cal = num1 - num2;
            System.out.println("Difference of Two Numbers:-" + cal);
        }
         else if(num3 == 3){
            cal = num1 * num2;
            System.out.println("Product of Two Numbers:-" + cal);
        }
        else if(num3 == 4){
            quotient= num1 / num2;
            remainder = num1 % num2;
            System.out.println("quotient of Two Numbers:-" + quotient);
            System.out.println("quotient of Two Numbers:-" + remainder);
        }
    }
}
