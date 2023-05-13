package 프로그래머스;

public class 제곱수판별하기 {
    public int solution(int n) {
        double x = Math.sqrt(n);
        if(x == (int)x) return 1;
        return 2;
    }

    public int solution2(int n) {
        if(n % Math.sqrt(n) == 0) return 1;
        return 2;
    }
}
