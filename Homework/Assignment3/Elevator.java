
/*************************************************************************
 *  Compilation:  javac Elevator.java
 *  Execution:    java Elevator 'number of floors' 'floor requests' 'number of restricted floors' 'optional passcode'
 *
 *  @author Pooja Kedia
 *  @author Vidushi Jindal
 *
 *************************************************************************/
public class Elevator {
    
    public static void main ( String[] args ) {

        int numFloors = Integer.parseInt(args[0]);
        int floorReq = Integer.parseInt(args[1]);
        int bannedFloors = Integer.parseInt(args[2]);
        int passcode = Integer.parseInt(args[3]);
        int elevatorA = 1;
        int elevatorB = 1;
        int[] restrictedFloors = new int[bannedFloors];
        int numFloorsRequested = 0;
        for (int i = 0; i < 6; i++) {
            int temp = (int) (floorReq%(Math.pow(10, i)));
            if(temp<floorReq) {
                // System.out.println("This is temp: " + temp);
                
                // System.out.println("This is i: " + i);
                numFloorsRequested++;
            }
            
            else {}

            
        }
        //HEY DIPSHIT START HERE. You finished printing out when the elevator is at what floor, you need to implement the passcode and banned floor functions.
       
        // System.out.println(numFloorsRequested);
        int elevator;
        int goToFloor;
        int tempFloor = floorReq;
        // boolean spotReplaced;
        // for (int b = 0; b< numFloorsRequested; b++) {
        //     if (bannedFloors >0) {
        //         // for(int k = 0; k<bannedFloors; k++) {
        //         tempFloor = (int) (tempFloor%10);
        //         // }
        //         for (int j=0; j<bannedFloors; j++) {
        //             spotReplaced = false;
        //             while (!spotReplaced) {
        //                 for (int g = 0; g< numFloorsRequested; g++) {
        //                     if (restrictedFloors[g] < tempFloor ) {
        //                         restrictedFloors[g] = tempFloor;
        //                         spotReplaced = true;
        //                     }
        //                 }
        //             }
        //         }

    
                
        //     tempFloor/=10;
        //     }
        // }
        for (int i = 0; i< numFloorsRequested; i++) {
            // boolean locked = false;

            goToFloor = (int) (floorReq%10); //3165%10^1)
            
            for (int w=0; w<bannedFloors; w++) {
                if(restrictedFloors[w] == goToFloor){
                    locked =true;
                }
            }
            // if (locked && !((passcode%numFloors==goToFloor)||(passcode%numFloors))) {}
            if ((Math.abs(elevatorA-goToFloor))<Math.abs(elevatorB-goToFloor)) {
                elevatorA = goToFloor;
                elevator=1;
            }
            else if ((Math.abs(elevatorB-goToFloor))<Math.abs(elevatorA-goToFloor)) {
                elevatorB = goToFloor;
                elevator = 2;
            }
            else{
                elevatorA = goToFloor;
                elevator = 1;
            }
            System.out.println(elevator + " " + goToFloor);
            floorReq/=10;
        }
        // if (floorReq <= numFloors) {
        //     for(int i = 0; i<floorReq.length; i++) {

        //     }
        // }
    }
}
