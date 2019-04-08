  class MegaBytesConverter{
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
	    if(kiloBytes<0){System.out.println("Invalid Value");}
	    else{
	    int MB = kiloBytes/1024;
	    int KB = kiloBytes%1024;
	    
	    System.out.println(kiloBytes+" KB = "+MB+" MB and "+KB+" KB");
	    }
    }
    
    }
    
    class BarkingDog{
    
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
    if(barking)
    	{
    	if((hourOfDay>22 && hourOfDay<=23) || (hourOfDay<8 && hourOfDay>=0)){
    	return true;
    	}else{return false;}
    	}
    	else {return false;}
    
    }
    
    }
    
    
    
    class LeapYear{
    
    
    public static boolean isLeapYear(int year){
    if(year>=1 && year<=9999)
    {
    if((year%4)==0){
    if((year%100)==0){
    if((year%400)==0){
    return true;
    }else{return false;}
    }else{return false;}
    }else{return false;}
    }else{return false;}
    }
    
    
    
    }
    
    
    class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
    	    
    	if(a*b>=0){
    	if((Math.round(a*1000)/1000)==(Math.round(b*1000))/1000){
    	return true;}
    	else{return false;}
    	
    	}else{return false;}
    	    
    	}
    
    }
    
    public class DecimalComparator{
 
    	public static boolean areEqualByThreeDecimalPlaces(double a, double b){
    	    
    	if(a*b>=0){
    	if(((int)(a*1000))==((int)(b*1000))){
    	return true;}
    	else{return false;}
    	
    	}else{return false;}
    	    
    	}
}

public class EqualSumChecker {

	public static boolean hasEqualSum(int a, int b, int c){
	if((a+b)==c){return true;}
	else {return false;}
	
	} 
}


public class TeenNumberChecker {
 
    public static boolean hasTeen(int a, int b, int c){
    if((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19)){
    return true;
    }else {return false;}
    }
    
    public static boolean isTeen(int a){
        if((a>=13 && a<=19)){
    return true;
    }else {return false;}

        
    }
    
}



