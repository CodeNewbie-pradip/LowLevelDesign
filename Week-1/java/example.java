public class example
{
    public static void main(String[] args)
    {
        // 1) CONST with reference
        int x=5;
        //final int[] ref=5;
        final int[] ref = {x}; // Reference to a constant integer
        System.out.println("value pointed by ref: "+ref[0]); //output: 5

        // 2) CONST reference, but NON-CONST data
        int y=15;
        final int[] ref2={y}; // Reference to a constant integer
        ref2[0]=20; // Allowed, modifying the data through the reference
        System.out.println("value is pointed by reference: "+ref2[0]);
        
        // 3) CONST reference, CONST data
        int z=25;
        final int[] ref3={z};
        System.out.println("value is pointed by reference: "+ref3[0]);
    }
}