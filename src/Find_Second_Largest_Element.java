//TODO: Find the second largest element in an array.

public interface Find_Second_Largest_Element {
    public static void main(String args[]){
        int[] arr = {12,50,71,11,24,27,100};
        findSecondLargestElement(arr);
    }

    public static void findSecondLargestElement(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        int largest = -1;
        int secondLargest = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest Number: "+secondLargest);
    }
}
