package 프로그래머스;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

public class 작은수제거하기 {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) return new int[]{ -1 };
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
