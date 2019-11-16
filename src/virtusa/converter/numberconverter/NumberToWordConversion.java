/**
 * Converts given number to word for range [1-999,999,999]
 */
package virtusa.converter.numberconverter;

/**
 * @author srinivasgajjala
 *
 */
public class NumberToWordConversion {

String[] one_digit = new String[] 
	          {"","one","two","three","four","five","six","seven","eight","nine"};
String[] two_digit = new String[] 
	   {"","ten","eleven","tweleve","thirteen","fourteen","fifteen",
		"sixteen","seventeen","eighteen","nineteen"};
String[] ten_multiples = new String[] 
	   {"ten","twenty","thrity","fourty","fifty","sixty",
		"seventy","eighty","ninety"};
String[] powerof_tens = new String[] {"hundred","thousand","million"}; 



public String threeDigitSplitter (String threedigit) {
    StringBuffer sb = new StringBuffer();
	 for (int i= 0; i < threedigit.length() ; i++ ) {
      if (i==0) {
       System.out.println(threedigit.toCharArray()[i]);
      sb.append(threedigit.toCharArray()[i]);  
      sb.append(powerof_tens[i]);
      sb.append("and");
      }      
      if (i==1) {
    	  System.out.println(threedigit.toCharArray()[i]);
    	  int index = Integer.parseInt(threedigit.toCharArray()[i],10);
          System.out.println(ten_multiples[index]);
      }
      
      if (i==2) {
          sb.append(one_digit[threedigit.toCharArray()[i]]);
      }
     }
	
	return sb.toString();
}

public String twoDigitSplitter (String twodigit) {
	
	
	
	return null;
}


public String singleDigit (String singleDigit) {
	
	
	
	return null;
}
	
		
	public void convertToWord (String number) {		
	   int numberlength = number.length();
	    if (numberlength <= 0 || numberlength > 9) {	    	
	    	System.out.println("please enter number within range [1-999,999,999]");
	    } else {
	    	if (numberlength== 1) {
		    	System.out.println("Single digit");		    	
	    	}
	    	if (numberlength== 2) {
		    	System.out.println("two digit");		    	
	    	}
	    	if (numberlength== 3) {
		    	System.out.println("three digit");		    	
	    	}
	    	if (numberlength== 4) {
		    	System.out.println("four digits");		    	
	    	}
	    	if (numberlength== 5) {
		    	System.out.println("five digits");		    	
	    	}
	    	if (numberlength== 6) {
		    	System.out.println("six digits");		    	
	    	}
	    	if (numberlength== 7) {
		    	System.out.println("seven digits");		    	
	    	}
	    	if (numberlength== 8) {
		    	System.out.println("eight digits");		    	
	    	}
	    	if (numberlength== 9) {	    	        
    	    	String FirstSplit = number.substring(0,3);
    	    	System.out.println("First Split" + FirstSplit );
    	    	 String wordConvertedString = threeDigitSplitter (FirstSplit) +  "million and" ;
    	    	 
     	    	String secondSplit = number.substring(3,6);
    	    	System.out.println("Second Split" + secondSplit );
    	    	wordConvertedString += threeDigitSplitter (secondSplit) +  "thousand and" ;

      	    	String thirdSplit = number.substring(6,9);	  
    	    	System.out.println("third Split" + thirdSplit );
                wordConvertedString += threeDigitSplitter (secondSplit) ;
		    	
		    	System.out.println("Final Converted word " + wordConvertedString);
	    	}
          }
		
	}
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = "569457815";
		
		for (char c : number.toCharArray()) {
			System.out.println("single char" + c);
		}
		System.out.println("number to char array" + number.toCharArray().toString());
		NumberToWordConversion numberConversion = new NumberToWordConversion();
		numberConversion.convertToWord(number);
		
	}

}
