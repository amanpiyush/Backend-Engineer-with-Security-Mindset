public class praticalenhancedloop {
    void main(String[]args){


        int arr [] = {4,9,2,15,7};
        // int maxvalue = arr[0];
        // for(int n : arr ){
        //     maxvalue = Math.max(maxvalue,n);
        // }
        //     System.out.println(maxvalue);

        for(int i = 0;i <= arr.length;i++){
            int max = arr[0];
            max = Math.max(max, i);
            System.out.println(max);
        }
        }
    }

