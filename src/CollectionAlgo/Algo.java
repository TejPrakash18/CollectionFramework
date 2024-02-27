package CollectionAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algo {
    public static void main(String[] args) {
        int arr[] = {5,9,11,20,21,25,27};

        int arr1[] = {5,1,3,6,9,20};

        System.out.println(Arrays.binarySearch(arr, 20));
        System.out.println("sort");
        Arrays.sort(arr1);
        for (int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }

        System.out.println("Fill ");
        Arrays.fill(arr1, 1);
        for (int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(11);
        nums.add(10);
        nums.add(16);
        nums.add(12);
        Collections.reverse(nums);
        System.out.println(nums);
        System.out.println(Collections.min(nums));
        System.out.println(Collections.max(nums));
        System.out.println(Collections.frequency(nums, 12));
        Collections.sort(nums);
        System.out.println(nums);
        Collections.swap(nums, 1, 3);
        System.out.println(nums);


    }
}
