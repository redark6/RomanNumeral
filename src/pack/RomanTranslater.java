package pack;

public class RomanTranslater {
	
	public static String translateArabicNumberToRomanNumber(int numberToTranslate) {
		if(numberToTranslate <= 0) {
			return "the programme is unable tot treate number less than 1";
		}
		String result = "";
		for (RomanNumber number : RomanNumber.values()) {
			int proportion = numberToTranslate/number.value;
			if( proportion >= 1) {
				numberToTranslate -= (proportion * number.value);
				for (int i =0; i< proportion; i++)
					result+= number;
			}
		}
		return result;
		
	}

}
