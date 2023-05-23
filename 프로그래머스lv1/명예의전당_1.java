package 프로그래머스lv1;
import java.util.*;
public class 명예의전당_1 {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();

        int days = score.length;
        for(int i = 0; i < days; i++){
            if(list.size() < k){
                list.add(score[i]);
                Collections.sort(list);
            }
            else if(list.size() == k){
                list.set(0, Math.max(list.get(0), score[i]));
                Collections.sort(list);

            }
            scores.add(list.get(0));
        }

        int[] answer = new int[score.length];
        for(int i = 0; i < score.length; i++){
            answer[i] = scores.get(i);
        }

        return answer;
    }
}
