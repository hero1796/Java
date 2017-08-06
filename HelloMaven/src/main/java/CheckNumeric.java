import org.apache.commons.lang3.StringUtils;

public class CheckNumeric {

	public CheckNumeric() {
		super();
	}
	
	public static void main(String[] args) {
		String s1 = "123a";
		String s2 = "50124";
		System.out.println(StringUtils.isNumeric(s1));
		System.out.println(StringUtils.isNumeric(s2));
	}
}
