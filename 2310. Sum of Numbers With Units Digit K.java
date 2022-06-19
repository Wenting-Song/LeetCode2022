class Solution {
    public int minimumNumbers(int sum, int k) {
        if(sum == 0) return 0;
        for(int i = 1; i <= 10; i++){
            if((i*k) % 10 == sum % 10 && i * k <= sum) return i;
        }
        
        return -1;
    }
}
