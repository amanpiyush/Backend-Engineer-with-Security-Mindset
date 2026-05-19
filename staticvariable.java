class Mobile{
    String Brand;
    int Price;
    static String type;


    public void show(){
    System.out.println(Brand + " : " + Price + " : " + type );
    }
    //static variable : static variable shared across all the objects in the class.
}
public class staticvariable {
    
    void main (String[] a){
        Mobile obj = new Mobile();
        obj.Brand = "Apple";
        obj.Price = 78000;
        Mobile.type = "Smartphone";

        Mobile obj1 = new Mobile();
        obj1.Brand = "Samsung";
        obj1.Price = 72000;
        Mobile.type = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.Brand = "Xiomi";
        obj2.Price = 60000;
        Mobile.type = "Smartphone";

        Mobile obj3 = new Mobile();
        obj3.Brand = "Huwai";
        obj3.Price = 62000;
        Mobile.type = "Flagship Phone";
        // Mobile.type = "Flagship Phone";

        obj.show();
        obj1.show();
        obj2.show();
        obj3.show();

    }
}
