package lecture13;

public class CreditCardUtils {

	public static String mask(String ccNumber) {
		
		return "XXXXXXXXXXXX" + ccNumber.substring(ccNumber.length() - 4);
	}
}
