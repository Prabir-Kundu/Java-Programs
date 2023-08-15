/*
* Find the max occurrence element in the array
* Like var arr = arraylisyof(1,2,3,2,3,2)
* */
public class MaxOccurrence {
    public static void main(String[] args) {
        int[] arr= new int[]{5,2,0,7,12,2,5,4,8,33,2};
        printMaxOccurrence(arr);
    }

    public static void printMaxOccurrence(int[] arr){
        int length= arr.length;
        int max=0;

        for (int i=0;i<length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        int[] arr2= new int[max+1];

        for (int i=0; i<arr2.length; i++) {
            arr2[i]=0;
        }
        for (int i=0;i<length; i++){
            arr2[arr[i]]++;
        }
        max=0;
        int maxIndex=0;
        for (int i=0;i<arr2.length; i++){
            if (arr2[i]>max){
                max = arr2[i];
                maxIndex=i;
            }
        }
        System.out.println("Max Occurrence element "+maxIndex);

    }
}
