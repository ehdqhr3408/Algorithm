public class Quick {

    public void quicksort(int[] data, int start, int end) {
        if(start>=end) return;

        int mid = partition(data, start, end);
        quicksort(data, start, mid-1);
        quicksort(data, mid, end);
    }
    public int partition(int[] data, int start, int end){
        int pivot = data[(start+end)/2];
        while(start<end){
            while(data[start]<data[pivot]) start++;
            while(data[pivot]<data[end]) end--;
            if(start<end){
                swap(data, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    public void swap(int[]data, int i, int j){
        int temp = data[i];
        data[i]=data[j];
        data[j]=temp;
    }

    public static void main(String[] args) {

        int[] data = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        Quick quick = new Quick();
        quick.quicksort(data, 0, data.length - 1);
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", data[i]);
        }
    }
}