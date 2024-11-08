public class buddiedUp {
    public static boolean letsSee (int[] a) {
        
        boolean valid = false;
       
        int[] yes = new int[a.length];
        
        int buddyCount = 0;
        for (int i = 0; i < a.length; i++) {
            boolean left = false;
            boolean right = false;

            if (a.length==1) {
                //Makes sure the calcs after don't proceed array length
                return valid;
            }
            
            else if (a[i] == 3) {
                buddyCount++;
                if(i>0||i==(a.length-1)){
                    // System.out.println("checking left");
                    if(a[i-1] ==3) {
                        // yes[i] = 1;
                        left = true;
                        // System.out.println("buddy on left");
                    }
                    else {
                        // yes[i] = 0;
                        left = false;
                        // System.out.println("no buddy on left");
                    }

                }
                if ((i<(a.length-1)&& yes[i] == 0)||i==0) {
                    // System.out.println("Checking right");
                    if(a[i+1] == 3) {
                        // yes[i] = 1;
                        right = true;
                        // System.out.println("Buddy on Right");

                    }
                    else {
                        
                            // yes[i] = 0;
                            right = false;

                        
                        
                    }
                    
                }
                if(left||right) {
                    yes[i]=1;
                }
                if(!left&&!right) {
                    yes[i] = 0;
                }

            }
           
        
        
        }
        int sum = 0; 
        for(int j = 0; j < yes.length; j++) {
            sum= sum + yes[j];
            // System.out.print("j:"+ j + " yes[j]: " + yes[j] + " Sum: " + sum + " ");
            
        }
        if (sum == (buddyCount)) {
            valid = true;
        }
        return valid;

    }
    public static void main(String[] args) {
        int[] test = {9, 3, 3, 9};
        boolean check = letsSee(test);
        System.out.println(check);

        
    }
    
}
