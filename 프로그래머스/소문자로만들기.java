package 프로그래머스;

public class 소문자로만들기 {
    public String solution(String myString) {
        String answer = "";
        for(int i =0; i < myString.length(); i++){
            answer+=Character.toLowerCase(myString.charAt(i));
        }
        return answer;
    }
}
