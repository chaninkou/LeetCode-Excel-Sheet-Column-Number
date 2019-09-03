package excelsheet;

public class Main {
	public static void main(String[] args) {
		String s = "AA";
		
		System.out.println("Input: " + s);
		
		FindTitleToNumberFunction solution = new FindTitleToNumberFunction();
		
		System.out.println("Solution: " + solution.titleToNumber(s));
	}
}
