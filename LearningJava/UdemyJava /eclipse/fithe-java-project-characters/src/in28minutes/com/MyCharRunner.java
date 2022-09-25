package in28minutes.com;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('A');

		System.out.println(myChar.isVcowel());// vowels are a, e, i, o, u and Capitals


		System.out.println(myChar.isDigit());

		System.out.println(myChar.isAlphabet()); // between 'a' and 'z' and 'A' and 'Z'

		System.out.println(myChar.isConsonant());

		MyChar.printLowerCaseAlphabets();

		MyChar.printUpperCaseAlphabets();
	}

}