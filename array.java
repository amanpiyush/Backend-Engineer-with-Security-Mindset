public class array {
    void main (String [] args)
    {
        int [] num = {1, 3 , 5, 7, 9};
        num[1] = 4;
        // System.out.println(num[0]);

        int [][] num2 = {{1,2,3,4,5,6,7},{8,9,10,11,12,13,14},{15,16,17,18,19,20,21}}; 
        // System.out.println(num2[0][4]+ " " + num2[1][4]);

        

        int [][] num3 = new int [3][4]; // Multi-dimensional array
        // int [][] num3 = new int [3][]; // jagged array
        //int [][][] num3 = new inr [2][3][4];  //Three dimensional Array (can create multiple , and we need create multiple loop)
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<4;j++)
            {
                num3[i][j] = (int)(Math.random() * 10);
                System.out.print(num3[i][j] + " ");
            }
            System.out.println();
        }

        //Enhanced Loops in array
        for (int n[]: num3)
        {
            for (int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
