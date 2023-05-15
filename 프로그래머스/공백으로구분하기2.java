package 프로그래머스;

public class 공백으로구분하기2 {
    public String[] solution(String my_string) {
//        String[] answer = my_string.split(" ");
//        int result = 0;
//        String[] arr;
//        for (int i = 0; i < answer.length; i++) {
//            if (!answer[i].equals("")) result++;
//        }
//        arr = new String[result];
//        for (int i = 0, j = 0; i < result; i++) {
//            if (!answer[i].equals(""))
//                arr[j++] = answer[i];
//        }
//        return arr;
        return  my_string.trim().split("\\s+");
    }
}
