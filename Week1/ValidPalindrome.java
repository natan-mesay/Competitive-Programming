package Week1;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        s =  s.toLowerCase();
        int l = 0, r = s.length()-1;
        while (l < r){
            while(! Character.isLetterOrDigit( s.charAt(l)) && l < r){
                l++;
            }

            while(! Character.isLetterOrDigit( s.charAt(r)) && l < r){
                r--;
            }

            if(s.charAt(l) != s.charAt(r))
                return false;

            l++;
            r--;
        }
        
    return true;

        
    }


}
