public class bubblesort{
        static void bubblesorting(int[] arr){
            int n =arr.length;
            int temp=0;
            for(int i =0;i<n;i++)
            {
                for(int j = 1;j<(n-1);j++)
                {
                    if(arr[j-1]>arr[j])
                    {
                        temp=arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }

        public static void main(String[] args)
        {
            int arr = {6,70,33,1,48,120,9};
            System.out.println("Array")
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            bubblesorting(arr);

            System.out.println("Array after sort");
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]+" ");
            }
        }
}