package Week1;

import java.util.*;

class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> match = new LinkedList<String>();
        for (int i = 1; i <= n; i++) {
            
            if(i % 15 == 0){
                match.add("FizzBuzz");
            }
            else if( i % 5 == 0){
                match.add("Buzz");
            }
            else if(i % 3 == 0){
                match.add("Fizz");
            }
            else{
                match.add(""+i);
            }
}
        return match;
    }

    public static void main(String[] args) {
        
    }
}
