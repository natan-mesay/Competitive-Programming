package Week1;

public class PowerofThree {
    public boolean isPowerOfThree(int n) {
        while(n>=1){
            if(n == 1) return true;

            else if(n % 3 == 0) n/=3;

            else break;

        }
        return false;
    }

}
