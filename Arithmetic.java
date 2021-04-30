import java.util.Scanner;
class Arithmetic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first operand: ");
        int operand1=sc.nextInt();
        System.out.println("Enter the second operand: ");
        int operand2=sc.nextInt();
        System.out.println("Enter the operator");
        char c1=sc.next().charAt(0);
        if(c1=='+')
        {
            System.out.println(operand1+operand2);

        }
        else if(c1=='-')
        {
            System.out.println(operand1-operand2);

        }
         else if(c1=='*')
        {
            System.out.println(operand1*operand2);

        }
         else if(c1=='/')
        {
            System.out.println(operand1/operand2);

        }
         else 
        {
            System.out.println("Invalid operator");

        }

    }
}