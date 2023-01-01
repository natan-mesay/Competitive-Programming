package Week1;

public class PowerofThree {
    public boolean isPowerOfThree(int n) {
        /* 
        while(n>=1){
            if(n == 1) return true;

            else if(n % 3 == 0) n/=3;

            else break;

        }
        return false;
        */

        if(n < 1) return false;

        if(n%3 == 0) return isPowerOfThree(n/3);

        return n == 1;
    }

}
