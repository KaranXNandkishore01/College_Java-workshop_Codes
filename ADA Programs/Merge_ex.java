// WAP for Merge sort.

public class Merge_ex {
    public static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        while (i < left.length) {
            merged[k++] = left[i++];
        }

        while (j < right.length) {
            merged[k++] = right[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] left = {1, 3, 5};
        int[] right = {2, 4, 6};
        int[] result = merge(left, right);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
