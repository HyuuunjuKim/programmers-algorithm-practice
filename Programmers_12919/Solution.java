package Programmers_12919;

public class Solution {
	public String solution(String[] seoul) {
	    String answer = "";
	   
	    for (int i = 0 ; i< seoul.length ; i++) {
	    	if(seoul[i].equals("Kim")) { //�ڹٿ��� ��Ʈ�� �񱳴� equals
	    		answer = "�輭���� " + i + "�� �ִ�";
	    	}
	    }
	    return answer;
	}

}