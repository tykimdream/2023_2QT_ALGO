package 프로그래머스;

public class 접두사인지확인하기 {
    public int solution(String my_string, String is_prefix) {
        int answer = my_string.startsWith(is_prefix) ? 1 : 0;
        return answer;
    }
}
