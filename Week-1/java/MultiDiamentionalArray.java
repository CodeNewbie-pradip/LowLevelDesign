import java.util.Scanner;

public class MultiDiamentionalArray {
    public static void main(String[] args) {
        int arr[][]=new int[4][4];
//        Scanner sc=new Scanner(System.in);
//        for (int i=0; i<4; i++)
//        {
//            for(int j=0; j<4; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }

        int brr[][]={
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 11, 22, 33},
                {44, 55, 66, 77}
        };
        int sum=0;
        int row=brr.length;
        int col=brr[0].length;
        System.out.println("Using for loop");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(" "+brr[i][j]);
                sum+=brr[i][j];
            }
            System.out.println();
        }
        System.out.println("using for each loop");
        for(int[] i: brr)
        {
            for(int j: i)
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }
        System.out.println("Total sum of array: "+sum);
    }
}
