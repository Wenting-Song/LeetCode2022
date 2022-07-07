class Solution {
    public int[] sumZero(int n) {
        int num = 1;
        int[] res = new int[n];
        if(n == 0) return new int[1];
        int left = 0;
        int right = n-1;
        if(n % 2 != 0) {
            int mid = n/2;
            res[mid] = 0;
            while(left != right){
                res[left] = num;
                res[right] = -num;
                num++;
                left++;
                right--;
            }
        }else{
             while(left < right){
                res[left] = num;
                res[right] = -num;
                num++;
                left++;
                right--;
            }
        }
    
        return res;
    }
}
