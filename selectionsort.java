public class selectionsort{
        static void selectionsorting(int[] arr, int N){
            int i,l,minidx;
            for(i=0;i<n-1;i++)
            {
                minidx = i;
                for(j = i+1;j<n;j++)
                if(arr[j]<arr[minidx])
                minidx=j;

                if(minidx!=i)
                swap(arr[minidx],arr[i]);
            }
            public void swap(int x, int y)
            {
                int temp = x;
                x = y;
                y = temp;
                
            }
            //comment for branch updating
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
            selectionsort(arr, N);
            System.out.println("Sorted Array");
            
        }
}