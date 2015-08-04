package com.test;

import java.text.DecimalFormat;

public class TestFormatText {
	
    public static void main(String[] argv) {

    	System.out.println();
    	System.out.println("main-TEST 1");
    	String strNumber = null; //$0.00
    	System.out.println("Before Format=" + strNumber);
    	strNumber = formatDecimalForDisplay(strNumber);
    	//
    	System.out.println("After Format=" + strNumber);

    	System.out.println();
    	System.out.println("main-TEST 2");
    	strNumber = " 200.0000   "; //$2.00
    	System.out.println("Before Format=" + strNumber);
    	strNumber = formatDecimalForDisplay(strNumber);
    	//
    	System.out.println("After Format=" + strNumber);
    	
    	System.out.println();
    	System.out.println("main-TEST 3");
    	strNumber = "19246.00"; //$192.46
    	System.out.println("Before Format=" + strNumber);
    	strNumber = formatDecimalForDisplay(strNumber);
    	//
    	System.out.println("After Format=" + strNumber);

    	System.out.println();
    	System.out.println("main-TEST 4");
    	strNumber = "2060.00"; //$20.60
    	System.out.println("Before Format=" + strNumber);
    	strNumber = formatDecimalForDisplay(strNumber);
    	//
    	System.out.println("After Format=" + strNumber);
    	
    	System.out.println();
    	System.out.println("main-TEST 5");
    	strNumber = "000.00"; //$0.00
    	System.out.println("Before Format=" + strNumber);
    	strNumber = formatDecimalForDisplay(strNumber);
    	//
    	System.out.println("After Format=" + strNumber);

    	System.out.println();
    	System.out.println("main-TEST 6");
    	strNumber = "-50023"; //$-523.23
    	System.out.println("Before Format=" + strNumber);
    	strNumber = formatDecimalForDisplay(strNumber);
    	//
    	System.out.println("After Format=" + strNumber);

    }
    
    private static String formatDecimalForDisplay(String aNumber) {

    	System.out.println("formatDecimalForDisplay() Enter <-");
    //NCR POSReady2009
    //To allow showing of values when cents are 0, i.e. $20.0 to $20.00
    //What is the limit of an account that can be paid or past due?
    	DecimalFormat df = new DecimalFormat("#,###,###,##0.00");

    //DEBUG Block
    	
    //DEBUG Block

    	String result = "";
    	if(null == aNumber || aNumber.trim().equals("")){
    //NCR POSReady2009 - When the value is Null or empty send back 0.00		
    		//return result;
        	System.out.println("formatDecimalForDisplay() Exit ->");
    		return "0.00";
    	}
//	
    	System.out.println("aNumber with spaces=" + aNumber);
  
    	aNumber = aNumber.trim();

//    	
    	System.out.println("aNumber after String.trim()=" + aNumber);
    	try{
    		double d = Double.parseDouble(aNumber);
//
    		System.out.println("The double variable d=" + d);
    		System.out.println("The df: " +df.format(d));

    		d = d/100;
//    		
			System.out.println("The String variable d/100=" + d);
    		System.out.println("The df: " +df.format(d));

    		System.out.println("result + d, value of result before format=" + result);
    		System.out.println("result + d, value of d before format=" + d);
    		result = result + df.format(d);
//    		
			System.out.println("The String variable result + d=" + result);

			
    	}catch(NumberFormatException e){
    		e.printStackTrace();
    		result = "";
    	}

    	System.out.println("formatDecimalForDisplay() Exit ->");
    	return result;
    }

}
