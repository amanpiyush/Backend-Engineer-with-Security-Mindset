class calculator 
{
    int a;

    public int add(int num1, int num2)
    {
        int sum = num1 + num2;
        return sum;
    }
}


class computer
{
    public void music()
    {
        System.out.println("playing music.........");
    }

    public String givemepen ()
    {
        return "Here is your pen";
    }
}

class Maths
{
    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public double add(double n1, int n2)
    {
        return (int) n1 + n2;
    }
}


//Types of variable 

public class object {
    void main (String [] args){
        int num1 = 18;
        int num2 = 56;

        computer comp = new computer();
        comp.music();

        calculator calc = new calculator();
        int result = calc.add(num1, num2);
        // int sum = num1 * num2;
        
        Maths math = new Maths();
        int result2 = math.add(3, 5, 8);

        System.out.println("The Result is " + result);
        System.out.println("The Result is " + result2);
    }
}


//object have multiple properties and behavior. It is an instance of a class. It can be created using the new keyword. It can have multiple methods and variables. It can be used to store data and perform operations on that data.