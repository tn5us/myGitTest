package ch14;

import java.util.Stack;

public class StackExam {
	public static void main(String[] args) {
		String[] nation = {"한국","일본","중국","미국","영국"};
		Stack<String> s = new Stack<>();
		for(String str : nation) {
			s.push(str);//스택에 값을 입력할땐.push()
		}
		
		for(int i=0; i<nation.length; i++) {
			System.out.println(s.pop());
		}//집어넣은 반대 순서로 나옴 LIFO
	}
}
