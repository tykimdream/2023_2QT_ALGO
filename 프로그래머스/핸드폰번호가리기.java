package 프로그래머스;

public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }
}
