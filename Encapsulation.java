class Human{
    private int age = 21;  //private it accessable in the same class
    String Name;


    public int getage(){
        return age;
    }

    public String getName (){
        return Name;
    }

    public void setage(int a){
        age = a;
    }

    public void setName (String n){
        Name = n;
    }
}


public class Encapsulation {
    void main (String [] args){
        Human obj = new Human();
        obj.setage(23);
        obj.setName("Rahul");


        System.out.println(obj.getage());
        System.out.println(obj.getName());
    }
}
