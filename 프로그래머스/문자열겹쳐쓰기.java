package 프로그래머스;

public class 문자열겹쳐쓰기 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int size = overwrite_string.length();

        answer += my_string.substring(0, s);
        answer += overwrite_string;
        answer += my_string.substring(s+size);
        return answer;
    }
}
