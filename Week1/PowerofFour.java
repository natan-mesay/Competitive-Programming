package Week1;


public class PowerofFour {
    public boolean isPowerOfFour(int n) {
        /* 
        while(n >= 1){
            if(n == 1) return true;

            else if(n%4 == 0) n/=4;

            else break;
        }
        return false;
        */

        if( n < 1) return false;

        if (n%4==0)return isPowerOfFour(n/4);

        return n == 1;
    }
}
