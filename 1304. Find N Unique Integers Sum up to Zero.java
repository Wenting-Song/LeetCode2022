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
// class Solution {
//     public int[] sumZero(int n) {
//         int[] result = new int[n];
//         int right = n - 1;
//         int left = 0;
//         int num = n / 2;
//         while (left < right) {
//             result[left] = num*-1;
//             result[right] = num;
//             num--;
//             left++;
//             right--;
//         }
//         //Update middle index of odd length array to 0
//         if (n % 2 == 1) result[left] = 0;
//         return result;
//     }
// }
