public class Missing_Number {
    public static int findMissingNumber(int[] arr, int n) {
        java.util.Arrays.sort(arr);
        for(int i=1;i<arr.length;i++)
        {
            if(n==i+1)
            {
                System.out.println(n);

            }
            else {
                System.out.println("Check here");
            }
        }


        return n;
    }


    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,5};

    }
}

