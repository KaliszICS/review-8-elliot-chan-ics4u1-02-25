public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static String pluralize(String s) {
		
		String w = s.toLowerCase();
		if(w.endsWith("ey"))
			return "eys";
		else if(w.endsWith("y")) 
			return "ies";
		else if(w.endsWith("ife"))
			return "ives";
		else
			return "s";
		}
	public static int min(int x, int y, int z) {
		return Math.min(x, Math.min(y, z));
	}
	public static boolean isLeapYear(int year) {
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					return true;
				}
			}else{
				return true;
			}
		}
		return false;
		
	}

}
