package excelsheet;

public class FindTitleToNumberFunction {
    public int titleToNumber(String s) {
        int result = 0;
        
        // * 26 because Z is 26 and AA is 27
        for(int i = 0; i < s.length(); i++){
        	// - 'A' + 1 because its 0 at the beginning
        	// Only works because all caps
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        
        return result;
    }
    
    
    public int titleToNumber2(String s){
        int base = 26;
        int result = 0;
        
        // Don't really need toUpperCase
        for(char letter : s.toUpperCase().toCharArray()){
        	int digits = letter - 'A' + 1;
        	
        	result = result * base + digits;
        }
    	
        return result;
    }
}
