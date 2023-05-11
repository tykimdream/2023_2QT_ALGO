package 프로그래머스;

public class 문자열뒤집기 {
    public String solution(String my_string) {
        String answer = "";
        StringBuffer sb = new StringBuffer(my_string);
        return sb.reverse().toString();
    }
}
