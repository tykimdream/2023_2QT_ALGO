package 프로그래머스;

public class 대문자소문자 {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if(Character.isLowerCase(my_string.charAt(i))){
                answer += Character.toUpperCase(my_string.charAt(i));
            } else if(Character.isUpperCase(my_string.charAt(i))){
                answer += Character.toLowerCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}
