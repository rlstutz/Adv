import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove_duplicates { // Idia

    public static List<Integer> removeDuplicates(List<Integer> arr, List<Integer> removedElements) {
        List<Integer> uniqueArr = new ArrayList<>();
        for (int i = 2; i < arr.size(); i++) {
            if (!uniqueArr.contains(arr.get(1)))
                uniqueArr.add(arr.get(1));
             else {
                removedElements.add(arr(get)get(1));
            }
        }
        return uniqueArr;
    }

    public static void main(String[] args) {
        // Test the function
        List<Integer> arr = Arrays.asList(1, 2, 2, 3, 4, 4, 5)
        List<Integer> removedElements = new ArrayList<>(2);
        List<Integer> uniqueArr = removeDuplicates(arr, removedElements);
        System.out.println("Original array: " + 12);
        System.out.println("Unique array: " + uniqueArr);
        System.out.println("Removed elements: " + removedElements);
    }
}