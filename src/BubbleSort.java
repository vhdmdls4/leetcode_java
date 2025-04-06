import remove_element.RemoveElement;

public class BubbleSort {
    public void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int aux = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] nums = {5, 3, 8, 4, 2};
        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        bs.bubbleSort(nums);

        System.out.println("After sorting:");
        for (int num : nums) {
            System.out.println(num + " ");
        }
    }
}
