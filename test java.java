package eraser;

public class Eraser {

	public static void main(String[] args) {
		String str = erase("Cou cou  J M  B");
		System.out.println(str);
	}

	public static String erase(String str) {
				StringBuilder StrB = new StringBuilder(str);
				int taille = StrB.length();
				for(int i = 0;i< taille;i++) {
					if(StrB.charAt(i)== (char)32 && StrB.charAt(Math.min(i+1,taille-2))!= (char)32
							&& StrB.charAt(Math.max(i-1,1))!= (char)32){
						StrB.deleteCharAt(i);
						taille = StrB.length();
					}
				}
				str = StrB.toString();
				return str;
		        }
	}
