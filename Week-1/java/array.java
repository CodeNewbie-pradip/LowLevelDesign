import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        //declaration
        int arr[];
        //Scanner sc=new Scanner();
        //allocaion         //---------------------------------
        arr=new int[10];    //| 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |
                            //---------------------------------

        //initialisation
        int brr[]={10, 20, 30, 40, 50};

        for(int i=0; i<5; i++)
        {
            System.out.println("Element index is "+i+" & element value is "+brr[i]);
        }

        //for each loop
        for(int i:brr)
        {
            System.out.println(i);
        }
    }
}
