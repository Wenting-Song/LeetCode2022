//LC 462
class Solution {
     public int minMoves2(int[] nums) {
        int operations = 0, mid = quickSelect(nums, 0, nums.length-1, nums.length/2);
        for (int num: nums) operations += Math.abs(mid - num);
        return operations;
    }
    
       private int quickSelect(int[] nums, int left, int right, int k) {
        if (left == right) return nums[left];

        int pIndex = new Random().nextInt(right - left + 1) + left;
        pIndex = partition(nums, left, right);

        if (pIndex == k) return nums[k];
        else if (pIndex < k) return quickSelect(nums, pIndex+1, right, k);
        return quickSelect(nums, left, pIndex-1, k);
    }
    
    private int getPivotIndex(int left, int right){
        return left + (int)(Math.random() * (right - left + 1));
    }
    
    public int partition(int[] array, int left, int right){
        int pivotIndex = getPivotIndex(left, right);
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, right);
        int leftIndex = left;
        int rightIndex = right - 1;
        while(leftIndex <= rightIndex){
            if(array[leftIndex] < pivot){
                leftIndex++;
            }else {
                swap(array, leftIndex, rightIndex--);
            }
        }
        swap(array, leftIndex, right);
        return leftIndex;
    }
    private void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
  }
    
}
