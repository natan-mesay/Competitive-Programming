package Week1;

public class PowerofThree {
    public boolean isPowerOfThree(int n) {
        long i =1;
        while(i < n){
            i *=3;

        }
        return i == n;
    }

}
