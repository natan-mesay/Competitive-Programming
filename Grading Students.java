public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    List<Integer> answer = new ArrayList<>();

    for(int i : grades)
    {
        if(i < 38 || i % 5 < 3){
            answer.add(i);
        }
        else{
            int nextNumber = i / 5 + 1;
            
            if(nextNumber * 5 - i < 3)
            {
                answer.add(nextNumber * 5);
            } 
        }
    }
    return answer;
        
    }
