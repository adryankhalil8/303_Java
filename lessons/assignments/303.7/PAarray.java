import java.util.Arrays;
import java.util.Scanner;

public class PAarray {
    public static void main(String[] args) {
//        int[] nums = new int[3];
//
//        nums[0] = 1;
//        nums[1] = 2;
//        nums[2] = 3;
//
//        System.out.println(nums[0]);
//        System.out.println(nums[1]);
//        System.out.println(nums[2]);
        // Task 2
//        int[] nums = {13, 5, 7, 68, 2};
//
//        int middle = nums[nums.length / 2];
//        System.out.println(middle);
        // Task 3
//        String[] colors = {"red", "green", "blue", "yellow"};
//
//        System.out.println("Length: " + colors.length);
//        String[] copy = colors.clone();
//        System.out.println("Copy: " + Arrays.toString(copy));

        // Task 4
//        int[] nums = {1, 2, 3, 4, 5};
//        System.out.println("First element: " + nums[0]);
//        System.out.println("Last element: " + nums[nums.length - 1]);
//
//        try {
//            nums[5] = 999;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception when assigning nums[5] = 999:" + e);
//        }

        //Task 5
//        int[] arr = new int[5];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }
//
//        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 3, 4]

        //Task 6
//        int[] arr = new int[5];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i * 2;
//        }
//        System.out.println(Arrays.toString(arr));

        //Task 7
//        int [] arr = {1, 2, 3, 4, 5};
//        for (int i = 0; i < arr.length; i++){
//            if(i== 2) continue;
//            System.out.println(arr[i]);
//        }

        //Task 8
//        String[] arr = {"red", "green", "blue", "yellow", "purple"};
//
//        int mid = arr.length / 2; // for length 5, this is 2
//
//        String temp = arr[0];
//        arr[0] = arr[mid];
//        arr[mid] = temp;
//
//        System.out.println(Arrays.toString(arr));
        // Task 9
//        int [] nums = {4, 2, 9, 13, 1, 0};
//        Arrays.sort(nums);
//        System.out.println("Sorted array: " + Arrays.toString(nums));

        //Task 10
//        Object[] arr = {42, "bool", "taco", "fufu", 3.14 };
//        System.out.println("Mixed Array: " + Arrays.toString(arr));
        //Task 11
        Scanner sc = new Scanner(System.in);

        System.out.print("How many favorite things do you have? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        if (n <= 0) {
            System.out.println("You must enter a number greater than 0.");
            sc.close();
            return;
        }

        String[] favorites = new String[n];

        for (int i = 0; i < favorites.length; i++) {
            System.out.print("Enter favorite thing #" + (i + 1) + ": ");
            favorites[i] = sc.nextLine();
        }

        sc.close();

        System.out.println("\nYour favorite things are:");
        for (String item : favorites) {
            System.out.println(item);
        }


    }
}