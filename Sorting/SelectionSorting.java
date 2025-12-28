public class SelectionSorting{

    static void selectionSort(int arr[]){
        // int arr [] = {21,34,56,43,67,75};
        for(int i = 0; i<arr.length-1; i++){
            int minElement = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[minElement]){
                    minElement = j;
                }
            }
            int temp = arr[minElement];
            arr[minElement] = arr[i];
            arr[i] = temp;
        }
        
    }

    public static void main(String args[]){
        int arr [] = {21,34,56,43,67,75};
        selectionSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}