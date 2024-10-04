public class reversestring {

public static void main(String arg[]) {
        int[] arr = {1, 2, 3, 4, 5};
	System.out.println("The array");
	System.out.println("==============");
	for (int num : arr) {
        System.out.print(num + " ");

        }

	
        int k = 2; 

        k = k % arr.length;

        int[] arr2 = new int[k];
        for (int i = 0; i < k; i++) {
            arr2[i] = arr[arr.length - k + i];
        }
        for (int i = arr.length - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        
        for (int i = 0; i < k; i++) {
            arr[i] = arr2[i];
        }


	System.out.println("");
        System.out.println("rotated array");
	System.out.println("==============");
        for (int num : arr) {
            System.out.print(num + " ");

        }

    }
}