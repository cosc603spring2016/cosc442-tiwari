public class JamesBond {

	public static Boolean bondRegex(String str) {
		String digits ="(\\d*|\\(*|\\)*)*";
		String regex = digits + "[(]" + digits + "007" + digits + "[)]" + digits;
		
		return str.matches(regex);
	}
}
