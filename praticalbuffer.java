public class praticalbuffer {
    //string : String is asequnce of character which is represnted as text.
    //Why use it : To store the text format data.
    //Where use it : ?

    void main (String[]args){
        StringBuffer sb = new StringBuffer("amanseczx");
        sb.append(" Richa");
        sb.reverse();
        System.out.println(sb);


        String Name = "Vardhana";
        System.out.println(Name.length());
        System.out.println(Name.charAt(4));
        Name.concat("Singh");
        System.out.println(Name);


    }
}
