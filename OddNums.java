public class OddNums {
    public static void main(String[]args){
        /* v1
        int i = 1;
        do{
            System.out.println(i);
            i+=2;
        }while(i < 100);
        */

        /* v2
        for(int i = 1; i <100; i++){
            System.out.println(i);
            i++;
        }
        */

        //v 2.1 - using modulus validation for odd numbers
        for(int i = 1; i <100; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }

    }
}
