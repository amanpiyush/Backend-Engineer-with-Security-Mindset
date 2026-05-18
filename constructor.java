
    //default value for string is Null
    //default value for Int is 0

class Human
{
    private int age; 
    private String Name;

    public Human(int age, String Name)  //Constructor
    {
        this.age = age;
        this.Name = Name;
    }

    public String getName (){  //getter
        return Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;  //instance varibale using "This"
    }

    public void setName (String name){
        this.Name = name;
    }
}


public class constructor { 
    public static void main (String []a){

        Human obj = new Human(9, "Rahul");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());

    }
    
}

