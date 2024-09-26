public class MaximumElementInAnArray{

    public static void main(String[] args)
    {
        int arr1[]= {1,2,54,67,23,33,13,22,57};

        System.out.println(maximumElementInAnArray(arr1));
        
    }

    static int maximumElementInAnArray(int arr[])
    {
        int max = arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}