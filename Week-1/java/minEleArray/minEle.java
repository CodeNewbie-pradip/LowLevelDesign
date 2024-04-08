package minEleArray;

public class minEle {
    public static void main(String[] args) {
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        int arr[]={10, -2, 500, 400, 0, 11};
        System.out.println("Printing the array");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println("\nMinimun Element in array");
        for(int i: arr)
        {
            if(mini>i) {
                mini = i;
            }
            if(maxi<i)
            {
                maxi=i;
            }
        }
        System.out.println(mini);
        System.out.println("Maximum Element in array");
        System.out.println(maxi);


    }
}
