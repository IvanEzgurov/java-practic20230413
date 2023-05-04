package HomeWork5;

public class HeapSort {
    public void sort(int arr[]){
        int n = arr.length;

        for(int i = n/2 - 1; i>=0; i--){
            heapify(arr, n, i);
        }
        for (int i= n-1; i>=0; i--) {
            //перемещаем текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i , 0);
        }
    }
    private static void heapify (int arr [], int n, int i) {

            int largest = i; // Инициализируем наибольший элемент
            int l = 2*i +1; // левый = 2*i +1
            int r = 2*i +2; // правый = 2*i + 2
            // Если левый дочерний элемент больше корневого
            if(l < n && arr[1] > arr[largest])
                largest = 1 ;
            // Если правый дочерний элемент, чем самый большой элемент на данный момент
            if(r < n && arr[r] > arr[largest])
                largest = r;
            // Если самый большой элемент не корень
            if (largest != i){
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;
                //Рекурсивно преобразуем в двоичную кучу затронутое поддерево
                heapify(arr, n, largest);
            }
        }
    static void printArray(int arr[]){
            int n = arr.length;
            for (int i = 0; i< n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    public static void main(String[] args) {
        int arr[] = {12, 11 , 13, 5, 6, 7 };
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);

    }
}
