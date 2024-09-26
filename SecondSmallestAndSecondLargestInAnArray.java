public class SecondSmallestAndSecondLargestInAnArray{

    public static void main(String[] args) {
        int arr[] = {1,2,34,54,12,32,16,46,77,89,62,44};
        int n = arr.length;  
        System.err.println("Second Largest : "+secondLargest(arr,n));
        System.err.println("Second Smallest : "+secondSmallest(arr,n));      
    }

    static int secondLargest(int arr[],int n){
        n = arr.length;
        int largest = arr[0];
        int secondLargest = -1;
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secondLargest = largest;
                largest=arr[i];
            }else if (arr[i]!=largest && arr[i]>secondLargest) {
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
    
    
    static int secondSmallest(int sArr[],int n){
        
        n=sArr.length;

        int smallest = sArr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=1;i<n;i++)
        {
            if(sArr[i]<smallest)
            {
                secondSmallest=smallest;
                smallest=sArr[i];
            }else if (sArr[i]!=smallest && sArr[i]<secondSmallest) {
                secondSmallest=sArr[i];
            }
        }
        return secondSmallest;
    }

    


}