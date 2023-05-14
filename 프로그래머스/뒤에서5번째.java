package 프로그래머스;
import java.util.*;

public class 뒤에서5번째 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
        for(int i =0; i < 5; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}
