package JavaInterviewQuestions;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		
		String s = "Macbook%$$$#*&&&@^&Pro";
		System.out.println(s.replaceAll("[^0-9, a-z, A-Z]", ""));


	}

}
