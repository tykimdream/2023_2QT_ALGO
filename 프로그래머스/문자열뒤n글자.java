package 프로그래머스;

public class 문자열뒤n글자 {
    public String solution(String my_string, int n) {
        String answer = "";
        int len = my_string.length();
        return my_string.substring(len-n, len);
    }
}
