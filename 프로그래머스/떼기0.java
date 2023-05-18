package 프로그래머스;

public class 떼기0 {
//    0떼기
    public String solution(String n_str) {
        String answer = "";
        int index = 0;
        for(int i = 0; i < n_str.length(); i++){
            if(n_str.charAt(i) == '0') index = i+1;
            else break;
        }
        System.out.println(index);
        return n_str.substring(index);
    }
}
