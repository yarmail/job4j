package ru.job4j.array;
/**
 * Merge two sorted arrays into one
 */
public class Merge  {
    int[] left;
    int[] right;
    boolean more;
    /**
     *  constructor method
     */
    public Merge(int[] left, int[] right) {
        this.left = left;
        this.right = right;
    }
    /**
     * result method
     * 1) if possible do add array (tested)
     * 2) if not possible add do merge
     */
    public int[] rls() {
        int[] result =  new int[left.length + right.length];
        if (possibleAdd()) {
            result = add();
        } else {
            if (more) {
                result = merge(left, right);
            } else {
                result = merge(right, left);
            }
        }
        return result;
    }
    /**
     *  test method
     *  which array is bigger
     */
    public void more() {
        if (left.length <= right.length) {
            more = true;
        }
        if (left.length > right.length) {
            more = false;
        }
    }
    /**
     * test method
     * is it possible to add arrays
     * tested
     */
    public boolean possibleAdd() {
        boolean result = false;
        if (cycle(left, right) | cycle(right, left)) {
            result = true;
        }
        return result;
    }
    /**
     * test method
     * comparing array and variable
     * tested
     */
    public boolean cycle(int[] first, int[] second) {
        boolean result = true;
        for (int i = 0; i < first.length; i++) {
            if (first[i] >= second[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
    /**
     * performer method
     * add arrays if left[i] < right [0]
     * tested
     */
    public int[] add() {
        int[] add = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            add[i] = left[i];
        }
        for (int i = 0; i < right.length; i++) {
            add[i + left.length] = right[i];
        }
        return add;
    }
    /**
     * performer method
     * merge arrays if first <= second
     */
    public int[] merge(int[] first, int[] second) {
        int lenghtMerge = first.length + second.length;
        int[] merge = new int[lenghtMerge];
        int i = 0, j = 0, k = 0;
        for (; i < lenghtMerge; i++) {
            for (; j < first.length; j++) {
                merge[i] = min(first[j], second[j]);
                i++;
                merge[i] = max(first[j], second[j]);
                i++; k++;
            }
            for (; k < second.length; k++) {
                merge[i] = second[k];
                i++;
            }
        }
    return merge;
    }
    /**
     * test performer method
     * min of first, second
     */
    public int min(int first, int second) {
        int result = first <= second ? first : second;
        return result;
    }
    /**
     * test performer method
     * max of first, second
     */
    public int max(int first, int second) {
        int result = first >= second ? first : second;
        return result;
    }
}