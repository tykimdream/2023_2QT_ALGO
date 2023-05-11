package 프로그래머스;
import java.util.*;
public class 중앙값구하기 {
    public int solution(int[] array) {
        int mid = array.length / 2;
        Arrays.sort(array);
        return array[mid];
    }
}
