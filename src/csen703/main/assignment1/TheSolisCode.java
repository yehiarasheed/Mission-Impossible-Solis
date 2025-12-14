package csen703.main.assignment1;

public class TheSolisCode{
	public static Integer SolisDecodeDiv(String Code) {
		if(Code == null)
			return 0;
		if(Code.length() == 0)
			return 1;
		if(Code.length() == 1) {
			if(Code.charAt(0) == '0') {
				return 0;
			}
			return 1;
		}
		int ways = 0;
		if(Code.charAt(0) != '0')
			ways = SolisDecodeDiv(Code.substring(1));
		int wayTwo = Integer.parseInt(Code.substring(0,2));
		if(wayTwo >= 1 && wayTwo <= 26) {
			ways += SolisDecodeDiv(Code.substring(2));
		}
		return ways;
	}
	public static void main(String[] args) {
		System.out.println(SolisDecodeDiv("30"));
	}
}