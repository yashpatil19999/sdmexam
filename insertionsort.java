public class insertionsort{
        static void insertionsorting(int[] arr, int N){
            int i, key, l;

            while(j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1]=key;
        }

        public static void main(String[] args)
        {
            int arr = {6,70,33,1,48,120,9};
            int N = sizeof(arr) / sizeof(arr[0]);
            insertionsort(arr, N);

        }
}