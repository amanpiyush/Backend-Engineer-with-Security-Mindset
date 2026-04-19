public class Operator {
    public static void main(String[] args) 
    {
        int Num1 = 7;
        int Num2 = 3;

        //Num1 += 2; //Num1 = Num1 + 2 //Incrementing Num1 by 2
        Num2++; //Num2 = Num2 + 1 //Incrementing Num2 by 1

        int sum = Num1 + Num2; //Addition
        int diff = Num1 - Num2; //Subtraction
        int product = Num1 * Num2; //Multiplication
        int quotient = Num1 / Num2; //Division
        int remainder = Num1 % Num2; //Modulus
        System.out.println("Sum         : " + sum);
        System.out.println("Difference  : " + diff);
        System.out.println("Product     : " + product);
        System.out.println("Quotient    : " + quotient);
        System.out.println("Remainder   : " + remainder);

        int result = ++Num1;
        System.out.println("Result      : " + result);

        if (Num1 == Num2)
        {
            System.out.println("Num1 is equal to Num2");
        }
        else if (Num1 > Num2)
        {
            System.out.println("Num1 is greater than Num2");
        }
        else
        {
            System.out.println("Num1 is less than Num2");
        }

    }
}
