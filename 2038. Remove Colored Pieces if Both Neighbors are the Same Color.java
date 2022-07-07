class Solution {
    public boolean winnerOfGame(String colors) {
        int Amoves = 0;
        int Bmoves = 0;
        int A = 0;
        int B = 0;
        for(char c: colors.toCharArray()){
            if(c == 'A'){
                Amoves++;
                if(Amoves >= 3){
                    A++;
                }
                Bmoves = 0;
            }else {
                Bmoves++;
                if(Bmoves >= 3){
                    B++;
                }
                Amoves = 0;
            }
        }
        
        return A > B;
    }
}
