
 class speedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }else if(kilometersPerHour>=0){
            return Math.round(kilometersPerHour/1.609);
            
        }
        return -1;
    }
    
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour>=0){
        long MPH = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour+" km/h = "+MPH+" mi/h");
        }
        else{
            System.out.println("Invalid Value");
            
        }
    }
    
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
    	    
    	if(a*b>=0){
System.out.println("a*1000 = "+(a*1000)+" after typecasting to int= "+(int)(a*1000)+" after devide by 1000 = "+(Math.round(a*1000)));
    	
System.out.println("b*1000 = "+(b*1000)+" after typecasting to int = "+(int)(b*1000)+" after devide by 1000 = "+(Math.round(b*1000)));
    	
    	if((int)(a*1000)==(int)(b*1000)){
    	return true;}
    	else{return false;}
    	
    	}else{return false;}
    	    
    	}
    
	public static boolean hasEqualSum(int a, int b, int c){
	if((a+b)==c){return true;}
	else {return false;}
	
	}
    
    public static boolean hasTeen(int a, int b, int c){
    if((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19)){
    return true;
    }else {return false;}
    }
    
    public static void main(String args[]){
    printConversion(1.5);
    System.out.println("-3.1756 & -3.175 = "+areEqualByThreeDecimalPlaces(-3.1756,-3.175));
    System.out.println("3.175 & 3.176 = "+areEqualByThreeDecimalPlaces(3.175,3.176));
    System.out.println("3.0 & 3.0 = "+areEqualByThreeDecimalPlaces(3.0,3.0));
    System.out.println("-3.123 & 3.123 = "+areEqualByThreeDecimalPlaces(-3.123,3.123));
    }
    
    // write your code here
    }
    
  
