class Student
{
    private String name;
    private int Age;
    private int Marks;

    public Student(String name, int Age, int Marks){
        this.name = name;
        this.Age = Age;
        this.Marks =Marks;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){  //setter   
        this.name = name;
    }

    public int getAge(){  //getter  
        return Age;
    }

    public void setAge(int Age){
        this.Age = Age;
    }

    public int getMarks(){
        return Marks;
    }

    public void setMarks(int a, int b, int c){
        this.Marks = a;
        this.Marks = b;
        this.Marks = c;
    }
}

class BankAccount
{
    private String AccountName;
    private int Balance;

    public String getAccountName(){
        return AccountName;
    }

    public void setAccountName(String AccountName){
        this.AccountName = AccountName;
    }

    public int getBalance(){
        return Balance;
    }

    public void setBalance(int Balance){
        this.Balance = Balance;
    }
}

class Employee_management{
    private String emply_Name;
    private int emply_age;
}

class Product{
    private String Name;
    private int price;
}

class Authentication{
    private String Name;
    private int age;
    private String City;
    
}

public class Encapproject {

    public static void main(String[]args){

        Student s = new Student("Rhaul", 23, 99);
        // s.setName("Rahul");
        // s.setAge(23);
        // s.setMarks(89, 85, 70);

        System.out.println(s.getName());
        System.out.println(s.getMarks());

        BankAccount a = new BankAccount();
        a.setAccountName("SBI");
        a.setBalance(700000000);

        System.out.println(a.getBalance());
    }
    
}
