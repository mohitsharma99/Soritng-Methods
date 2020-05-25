//In this sorting method element get its appropriate place in array after completion of loop
// worst case complexity is O(n^2)
import java.lang.*;
import java.util.*;
public class InsertionSort {

    static Scanner scan = new Scanner(System.in);

    public static int[] sort(int[] arr, int n)
    {
         for(int a=1; a<n; a++) // for every 'a' arr[a] element will get perfect sorted place.
         {
             int value = arr[a];
             int i=a;
             while(i>0 && arr[i-1] > arr[i])  // this loop compare arr[a] element to every previous (0,1,2...a-2,a-1) element. 
             {
                 int temp = arr[i-1];
                 arr[i-1] = arr[i];
                 arr[i] = temp;
                 i--;
             }

         }
        return arr;
    }
    public static void main(String[] args)
    {
        System.out.println("number of elements in array: ");
        int n = scan.nextInt();      // number of elements in a array
        int[] arr = new int[n];

        for(int i=0; i<n; i++)   // insert unsorted array elements
        {
            arr[i] = scan.nextInt();
        }

        arr = sort(arr, n); // call sort methode to sorting elements

        for(int i=0; i<n; i++)    // print sorted array
        {
            System.out.print(arr[i]+" ");
        }

    }
}