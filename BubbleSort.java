//In this sorting method element get its appropriate place in array after completion of loop
// worst case complexity is O(n^2)
import java.lang.*;
import java.util.*;
public class BubbleSort {

    static Scanner scan = new Scanner(System.in);

    public static int[] sort(int[] arr, int n)
    {  int m=0;
        for(int a=0; a<n-1; a++)   // for every 'a'  arr[a] element will git it's perfect place
        {
            for(int b=0; b<n-1; b++)
            {
                if(arr[b]>arr[b+1])     // compare arr[b] to arr[b+1]
                {
                    int temp = arr[b+1];
                    arr[b+1] = arr[b];
                    arr[b] = temp;
                    m=1;
                }
            }
            if(m==0)      // it breaks if, 'if' statement will not execute mean all values are in sorted form
                break;
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
