import java.util.*;
import java.lang.*;
public class selectionSort {
    static Scanner sc = new Scanner(System.in);
    private static int[] sort(int arr[], int n)  //methode declaration  take array and size of array as perameter
    {
       for(int a=0; a<n-1; a++)          //index 'a' will get minimum element after completing this loop
       {   int min = arr[a];
           for(int b=a+1; b<n; b++)      // this loop compare arr[a] element to complete array
           {
               if(min>arr[b])     
               {
                   int temp = arr[b];
                   arr[b] = min;
                   arr[a] = temp;
                   min = temp;
               }
           }
       }
        return arr;
    }
    public static void main(String[] args)
    {
        System.out.println("number of elements in array: ");
        int n = sc.nextInt();      // number of elements in a array
        int[] arr = new int[n];

        for(int i=0; i<n; i++)   // insert unsorted array elements
        {
            arr[i] = sc.nextInt();
        }

        arr = sort(arr, n); // call sort methode to sorting elements

        for(int i=0; i<n; i++)    // print sorted array
        {
            System.out.print(arr[i]+" ");
        }

    }
}
