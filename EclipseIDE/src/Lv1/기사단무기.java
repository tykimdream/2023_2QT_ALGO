package Lv1;

public class 기사단무기 {
	class Solution {
	    public int solution(int number, int limit, int power) {
	        int answer = 0;
	        
	        for(int i = 1; i <= number; i++){
	            int cur = require(i, limit, power);
	            answer += cur;
	        }
	        return answer;
	    }
	    public int require(int num, int limit, int power){
	        int result = 1;
	        for(int i = 1; i < (num / 2) + 1; i++){
	            if(num % i == 0){
	                result++;
	            }
	            if(result > limit) return power;
	        }
	        return result;
	    }
	}
}
