package 프로그래머스;

public class 숨어있는숫자_2 {
    public int solution(String my_string) {
        int answer = 0;
        int len = my_string.length();
        int temp = 0;
        for(int i =0; i < len; i++){
            char x = my_string.charAt(i);
            if(x >= '0' && x <= '9'){
                temp *= 10;
                temp += Integer.parseInt(x +"");
            } else{
                answer += temp;
                temp = 0;
            }
        }
        if(temp != 0) answer += temp;
        return answer;
    }
}
