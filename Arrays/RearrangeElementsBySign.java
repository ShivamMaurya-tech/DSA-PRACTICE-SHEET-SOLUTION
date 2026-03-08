package Arrays;

// import java.util.ArrayList;

//     Brute force approach---?
// Rearranging the elements of an array by sign-->
public class RearrangeElementsBySign {
    public static void rearrangeelements(int arr[]) {
        // ArrayList<Integer> ls=new ArrayList<>();
        int positive[] = new int[arr.length / 2];
        int negative[] = new int[arr.length / 2];
        int posIndex = 0, negIndex = 0;

        // Separate positive and negative numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive[posIndex] = arr[i];
                posIndex++;
            } else {
                negative[negIndex] = arr[i];
                negIndex++;
            }
        }

        // Merge back with alternating sign
        posIndex = 0;
        negIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = positive[posIndex++];
            } else {
                arr[i] = negative[negIndex++];
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 3, 1, -2, -5, 2, -4 };
        System.out.println("Arranged elements are :");
        rearrangeelements(arr);
        for (int num : arr) {
            System.out.print(num + "");
        }
    }

}
