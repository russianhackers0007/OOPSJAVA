
public class RevString {

	public static void main(String[] args) {
		String NormalString = "Sanket", RevString = "";

		System.out.println("The Normal String is :" + NormalString);

		for (int i = 0; i < NormalString.length(); i++) {
			char ch = NormalString.charAt(i); 
			RevString = ch + RevString;

		}
		System.out.println("Reverse of a String is : " + RevString);

	}

}
