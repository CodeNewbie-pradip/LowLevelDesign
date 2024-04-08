import java.util.Scanner;
public class sumArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i: arr)
        {
            System.out.println(i);
        }
        int sum=0;
        for(int i: arr)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}
