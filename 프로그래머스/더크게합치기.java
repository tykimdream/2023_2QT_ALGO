package 프로그래머스;

public class 더크게합치기 {
    public int solution(int a, int b) {
        String front = Integer.toString(a);
        String back = Integer.toString(b);
        int x = Integer.parseInt(front + back);
        int y = Integer.parseInt(back + front);
        return Math.max(x, y);
    }
}
