import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6};
        int arr3[] = {5, 6, 7};
        List<Integer> x_element = findX(arr1, arr2);
        List<Integer> y_element = findY(arr2, arr3);

        // Printing the elements found in x_element and y_element lists
        System.out.println("Elements in x_element: " + x_element);
        System.out.println("Elements in y_element: " + y_element);
    }

    public static List<Integer> findX(int[] array1, int[] array2) {
        List<Integer> x_elem = new ArrayList<>();
        for (int e : array1) {
            boolean found = false;
            for (int elem : array2) {
                if (e == elem) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                x_elem.add(e);
            }
        }
        return x_elem;
    }

    public static List<Integer> findY(int[] array2, int[] array3) {
        List<Integer> y_elem = new ArrayList<>();
        for (int e : array2) {
            boolean found = false;
            for (int elem : array3) {
                if (e == elem) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                y_elem.add(e);
            }
        }
        return y_elem;
    }
}


// Elements in x_element: [1, 2]
// Elements in y_element: [3, 4]




