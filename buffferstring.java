public class buffferstring {
    public static void main (String [] args){
        StringBuffer sb = new StringBuffer("amanseczx");
        sb.append( " piyush");
        sb.insert(0, "java ," );
        sb.ensureCapacity(0);
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        //string methods

        System.out.println(sb.substring(0,4));
        
        //stringbuffer and string builder
        
    }
}
