package lecture13;

public class CreditCardUtils {

	public static String mask(String ccNumber) {
		
		if(ccNumber == null) {
			throw new IllegalArgumentException("Null Credit Card Number!");
		}
		
		return "XXXXXXXXXXXX" + ccNumber.substring(ccNumber.length() - 4);
	}
}
