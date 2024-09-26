public class ArrayIsSortedOrNot{

    static boolean checkIfArrayIsSorted(int arr[]){
        for (int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;
    }
    public static void main(String [] args)
    {

        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,7,8,3,4,5};
        System.err.println(checkIfArrayIsSorted(arr1));
        System.err.println(checkIfArrayIsSorted(arr2));

    } 
}