import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        StreamMain.main();
        int arr1[] = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        int [] arr2 = getArr(arr1);
        System.out.println(Arrays.toString(arr2));
        selectionSort(arr2);
    }

    public static int[] getArr(int[] arr) {
        int numberOfElementsInResultArr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 2 == 0) {
                numberOfElementsInResultArr++;
            }
        }
        int[] resultArr = new int[numberOfElementsInResultArr];
        int a = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0 && arr[j] % 2 == 0) {
                resultArr[a] = arr[j];
                a++;
            }
        }
        return resultArr;
    }

    public static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int min_i = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}