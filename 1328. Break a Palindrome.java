class Solution {
    public String breakPalindrome(String palindrome) {
        char[] s = palindrome.toCharArray();
        int n = s.length;
        
        for(int i = 0; i < n/2; i++){
            if(s[i] != 'a'){
                s[i] = 'a';
                return String.valueOf(s);
            }
        }
        s[n-1] = 'b';
        return n < 2? "": String.valueOf(s);
    }
}

// var breakPalindrome = function(pal) {
//     if(pal.length <= 1) return '';
//     const s = pal.split('');
//     for(let i = 0; i < Math.floor(s.length/2); i++){
//           if(s[i] != 'a'){
//                 s[i] = 'a';
//                 return s.join('')
//             }      
//     }
//      s[s.length-1] = 'b';
//     return s.join('');
// };
