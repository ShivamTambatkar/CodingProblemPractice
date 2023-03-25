package string_problems;

public class StringFunctionsInfo {


	public static void main(String[] args) {
		// 1.  .length(); used return the length of String
		
		String s= "Shivam";
//		System.out.println(s.length());//6
//	
//	
//	// 2.    .toLowercase() usedto return new String has all the lowercase characte
//	    
// System.out.println(s.toLowerCase());	// shivam
// // 3.    .toUppercase() used to return new String has all the Uppercase character String
// System.out.println(s.toUpperCase());  // SHIVAM
// 
// // 4.     .trim()  remove leading and tailing spaces
//    System.out.println(s.trim());// remove leading and tailing spaces Shivam
//    
    // 5. .substring (int start) returns  a subtring from start to the end
    
//    System.out.println(s.substring(2));//ivam
//    
//    // 6   .substring (int start ind last) returns  a subtring from start to the end
// 
// 
//    System.out.println(s.substring(2,4));// iv
//    
    // 7.replace('r','p') retuens a new string after replacing r with p. Harry is return as happy
 
    String h= "Harry";
    System.out.println(h.replace('r','p'));//happy
    
    // 8. replace("rry","ier") replace substring
      System.out.println(h.replace("rry","ier"));//Haier
      
      //9. startsswith("ha") returns true if nae stars with string "ha"returns true
      System.out.println(h.startsWith("Ha")); // false
      
    
     //10. endswith("ha") returns true if nae ends eith string "ha"returns true
      System.out.println(h.endsWith("Ha")); // false
      
  
    //11. .charat(0) returns character of given position
      System.out.println(h.charAt(0));//'H'
      // .indexof('H') returns index of character
      System.out.println(h.indexOf("Harr",1)); //0
 
      //12. .equals("Harry") returns true false checke the contain of string
      
      System.out.println(h.equals("Harry"));// True
      
     // 13. .equalsIgnoreCase("HarrY") ignores case
      System.out.println(h.equalsIgnoreCase("HarrY"));// True
 
 
 
 
 
 
 
 
 
}
}