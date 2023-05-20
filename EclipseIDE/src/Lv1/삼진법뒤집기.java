package Lv1;

import java.util.ArrayList;

public class 삼진법뒤집기 {
    public int solution(int n) {
        int answer = 0;
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(n > 0){
            arr.add(n % 3);
            n/=3;
        }
        int bias = 1;
        for(int i = arr.size() - 1; i >= 0 ; i--){
            answer += arr.get(i) * bias;
            bias *= 3;
        }
        
        return answer;
    }
}
