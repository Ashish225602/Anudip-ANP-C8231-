package hellow;

public class SecondLargestNUM {

    public static int findSecondLargest(int[] arr) {
        int firstLarge = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLarge) {
            	secondLarge = firstLarge;
                firstLarge = num;
            } else if (num > secondLarge && num != firstLarge) {
            	secondLarge = num;
            }
        }

        if (secondLarge == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
            return Integer.MIN_VALUE; 
        }

        return secondLarge;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7, 9};
        int secondLargest = findSecondLargest(arr);
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
