public class Loop {
    public static void main (String [] args)
    {
        for( int i = 1;i <= 10; i++)
        {
            System.out.println("Day " + i);

            for(int j = 1; j<=9 ;j++)
            {
                System.out.println("Hours " + (j+8) + "-" + (j+9));
            }
        }

        
        // int i = 0;
        // while (i <= 10)
        // {
        //     System.out.println("Hello" + " "+ i);
        //     i++;
        // }
    }
}
