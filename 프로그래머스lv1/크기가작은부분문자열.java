package 프로그래머스lv1;

public class 크기가작은부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        int main_len = t.length();
        int sub_len = p.length();
        long target = Long.parseLong(p);

        for(int i = 0 ; i <= main_len - sub_len; i++){
            long temp = Long.parseLong(t.substring(i, i+sub_len ));
            if(temp <= target) {
                answer++;
                // System.out.println(temp);
            }
        }
        return answer;
    }
}
