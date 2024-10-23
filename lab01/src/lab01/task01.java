package lab01;

public class task01 {
//---------------task 01------------------------
    //---------------selection sort--------------
    public static void selectionSort(int[] arr) {
        int x = arr.length;

        for (int i = 0; i < x - 1; i++) {
          
        	int min = i;
            for (int j = i + 1; j < x; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

           int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

   public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    
   public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        printArray(arr);
        
        selectionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
	
//------------------------task 02--------------------------	
	
	
	
	
}


