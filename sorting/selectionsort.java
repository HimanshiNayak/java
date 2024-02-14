package sorting;

public class Selectionsort {
    public void selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min_in = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_in]){
                    min_in = j;
                }
            }
            int min_el = arr[min_in];
            arr[min_in] = arr[i];
            arr[i] = min_el;
        }
        for(int i=0;i=arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
