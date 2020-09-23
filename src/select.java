public class select{
    public static void main(String[] args){
        int[] arr = {1,10,5,8,7,6,4,3,2,9};

        int i, j;
        int temp, min;
        int index = 0;
        for(i=0;i<arr.length;i++){
            min = arr[i];
            for(j=i+1;j<arr.length;j++) {
                if(min>arr[j]){
                    min=arr[j];
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for(i =0;i<arr.length;i++)
            System.out.printf("%d ", arr[i]);
    }
}