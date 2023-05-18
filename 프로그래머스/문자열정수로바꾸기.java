package 프로그래머스;

public class 문자열정수로바꾸기 {
    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);

        // if(s.charAt(0) == '-'){
        //     answer = Integer.parseInt(s.substring(1));
        //     answer *= -1;
        // } else if(s.charAt(0) == '+'){
        //     answer = Integer.parseInt(s.substring(1));
        // }else{
        //     answer = Integer.parseInt(s.substring(0));
        // }

        return answer;
    }
}
