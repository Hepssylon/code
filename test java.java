package eraser;

public class Eraser {

	public static void main(String[] args) {
		erase("Cou cou  J M  B");
	}


	public static void erase(String txt) {
		StringBuilder str = new StringBuilder(txt.trim());
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				if(str.charAt(i+1) != ' ' && str.charAt(i-1) != ' ') {
					str.deleteCharAt(i);
				}
			}
		}
		System.out.println(str);
	}
}
