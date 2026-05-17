


public class Student {
    int id;
    String Name;
    int age;
    int marks[];
    double average;
    char grade;
}

class StudentDetails {
    void main (String [] args){
        Student s1 = new Student ();
            s1.id = 101;
            s1.Name = "Ananya";
            s1.age = 23;
            s1.marks= new int [3];
            s1.marks[0] = 90;
            s1.marks[1] = 87;
            s1.marks[2] = 80;
        
        Student s2 = new Student();
            s2.id = 102;
            s2.Name = "priya";
            s2.age = 22;
            s2.marks= new int [3];
            s2.marks[0] = 90;
            s2.marks[1] = 97;
            s2.marks[2] = 60;

        Student s3 = new Student();
            s3.id = 103;
            s3.Name = "John";
            s3.age = 23;
            s3.marks= new int [3];
            s3.marks[0] = 90;
            s3.marks[1] = 67;
            s3.marks[2] = 70;

        Student s4 = new Student();
            s4.id = 104;
            s4.Name = "Piyush";
            s4.age = 21;
            s4.marks= new int [3];
            s4.marks[0] = 70;
            s4.marks[1] = 87;
            s4.marks[2] = 89;

        Student s5 = new Student();
            s5.id = 105;
            s5.Name = "Neha";
            s5.age = 24;
            s5.marks= new int [3];
            s5.marks[0] = 80;
            s5.marks[1] = 57;
            s5.marks[2] = 60;

        int total = 0;
        for(int i=0;i<3;i++){
            total = total + s1.marks[i] / 3;
        }
        System.out.println(total);

        int total1 = 0;
        for(int i=0;i<3;i++){
            total1 = total1 + s2.marks[i] / 3;
        }
        System.out.println(total1);
        
        int total2 = 0;
        for(int i=0;i<3;i++){
            total2 = total2 + s3.marks[i] / 3;
        }
        System.out.println(total2);

        int total3 = 0;
        for(int i=0;i<3;i++){
            total3 = total3 + s4.marks[i] / 3;
        }
        System.out.println(total3);
        
        int average = 0;
        if(average > 90){
            System.out.println("A");
        }else if (average > 75 && average < 89){
            System.out.println("B");
        }else if(average > 60 && average < 74){
            System.out.println("C");
        }else if(average > 40 && average < 59){
            System.out.println("D");
        }else{
            System.out.println("F");
        }


        
    }

}
