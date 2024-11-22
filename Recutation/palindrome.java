public class palindrome {

    public static boolean isPalindrome (String str) {

        if (str.length()==0||str.length()==1) {
        
            return true;
                
                
        }
        else{
            if (str.charAt(0)==str.charAt(str.length()-1)){
            
                String newString = str.substring(1, (str.length()-1));
                return(isPalindrome(newString));
            }
            else {
                return false;
                
            }
        
        
        }
        

        

        
        

    }
    public static void main(String[] args) {
       System.out.println(isPalindrome(args[0]));
        
    }
    
}
