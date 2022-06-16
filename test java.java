package eraser;

public class Eraser {

	public static void main(String[] args) {
		String str = erase("Cou cou  J M  B");
		System.out.println(str);
	}
	
    public static String erase(String str) {
        //throw new UnsupportedOperationException("Unimplemented");
    	
    	String s1 = "";
    	
    	if(str.length() > 1) {
		if(str.charAt(0) != ' ' || str.charAt(0) == ' ' && str.charAt(1) == ' ') {
	    		s1 += String.valueOf(str.charAt(0));
	    	}
    	}
    	
    	
	for(int i = 1; i < str.length() - 1 ; i++) {
    		if(str.charAt(i) != ' ' || (str.charAt(i-1) == ' ' || str.charAt(i+1) == ' ')) {
    			s1 += String.valueOf(str.charAt(i));
    		}
    	}
		
		
	if(str.length() > 1) {
		if(str.charAt(str.length() - 1) != ' ' || str.charAt(str.length() - 2) == ' ') {
			s1 += String.valueOf(str.charAt(str.length() - 1));		
	    	}
	}
		
    		
	return s1;
        
    }
}
