public class Pratical {
    public static void main(String[] args) 
    {
        //conditional statement
        int x = 8;
        int y = 7;
        // if (x > 10)
        // {
        //     System.out.println("Hello");
        // }else
        // {
        //     System.out.println("Bye");
        // }
        if ( x > y)
            System.out.println("x is greater than y");
        else
            System.out.println("x is less than y");


        //Ternary Operator
        int a = 10;
        int result = 0;
        // result = a%2==0  ? "Even" : "Odd"; //condition ? value if true : value if false
        System.out.println(result);



        //Switch case
        int day = 1;
        switch (day) 
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        
    }
}
