/**
 * Class represents solar panels, street map, and
 * an array of parking lot projects.
 * 
 * @author Jessica De Brito
 * @author Kal Pandit
 */
public class SolarPanels {
    
    private Panel[][] panels;
    private String[][] streetMap;
    private ParkingLot[] lots;

    /**
     * Default constructor: initializes empty panels and objects.
     */
    public SolarPanels() {
        panels = null;
        streetMap = null;
        lots = null;
        StdRandom.setSeed(2023);
    }

    /**
     * Updates the instance variable streetMap to be an l x w
     * array of Strings. Reads each label from input file in parameters.
     * 
     * @param streetMapFile the input file to read from
     */
    public void setupStreetMap(String streetMapFile) {

        StdIn.setFile(streetMapFile);
        int l = StdIn.readInt();
        int w = StdIn.readInt();
        streetMap = new String[l][w];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < w; j++) {
                streetMap[i][j] = StdIn.readString();
            }
        }

    }

    /**
     * Adds parking lot information to an array of parking lots.
     * Updates the instance variable lots to store these parking lots.
     * 
     * @param parkingLotFile the lot input file to read
     */
    public void setupParkingLots(String parkingLotFile) {
        StdIn.setFile(parkingLotFile);
        int n = StdIn.readInt();
        lots = new ParkingLot[n];
        for (int i = 0; i<n; i++) {
            
            String lotName = StdIn.readString();
            int maxPanels = StdIn.readInt();
            double budget = StdIn.readDouble();
            int energyCapacity = StdIn.readInt();
            double panelEfficiency = StdIn.readDouble();
            ParkingLot x = new ParkingLot(lotName, maxPanels, budget, energyCapacity, panelEfficiency);
            lots[i]= x;
            
        }
    }

    /**
     * Insert panels on each lot as much as space and budget allows.
     * Updates the instance variable panels to be a 2D array parallel to
     * streetMap, storing panels placed.
     * 
     * Panels have a 95% chance of working. Use StdRandom.uniform(); if
     * the resulting value is < 0.95 the panel works.
     * 
     * @param costPerPanel the fixed cost per panel, as a double
     */
    public void insertPanels(double costPerPanel) {
        int l = streetMap.length;
        int w = streetMap[0].length;
        panels = new Panel[l][w];
        int count = 0;
        
        for (int i = 0; i < lots.length; i++) {
            double budg = lots[i].getBudget();
            for(int j = 0; j<l; j++) {
                for (int k = 0; k<w; k++) {
                    if (lots[i].getLotName().equals(streetMap[j][k])) {
                        if(budg-costPerPanel>=0) {
                            if (count<=lots[i].getMaxPanels()) {
                                double ratedEfficiency = lots[i].getPanelEfficiency();
                                int maxOutput=lots[i].getEnergyCapacity();
                                boolean works = true;
                                if (StdRandom.uniform()>.95) {
                                    works = false;
                                }
                                Panel test = new Panel(ratedEfficiency,maxOutput, works);

                                panels[j][k]=test;
                                budg-=costPerPanel;
                            }

                        }
                    }
                }
            }



        }

    }

    /**
     * Given a temperature and coefficient, update panels' actual efficiency
     * values. Panels are most optimal at 77 degrees F.
     * 
     * Panels perform worse in hotter environments and better in colder ones.
     * worse = efficiency loss, better = efficiency gain.
     * 
     * Coefficients are usually negative to represent energy loss.
     * 
     * @param temperature the current temperature, in degrees F
     * @param coefficient the coefficient to use
     */
    public void updateActualEfficiency(int temperature, double coefficient) {
        double tempEf;
        double actEf;
        double drop = coefficient * (temperature-77);
        for (int k = 0; k < lots.length; k++){
            for (int i=0; i<streetMap.length; i++) {
                for (int j = 0; j<streetMap[i].length; j++) {
                    if (panels[i][j] != null) {
                        tempEf = panels[i][j].getRatedEfficiency();
                        actEf = (tempEf-drop);
                        panels[i][j].setActualEfficiency(actEf);

                    }
                    
                }
                
            }
        }
        
    }

    /**
     * For each WORKING panel, update the electricity generated for 4 hours 
     * of sunlight as follows:
     * 
     * (actual efficiency / 100) * 1500 * 4
     * 
     * RUN updateActualEfficiency BEFORE running this method.
     */
    public void updateElectricityGenerated() {
        double temp1;
        double temp2;
        double temp3;
        double Final;
        
        for (int i = 0; i < lots.length; i++){
            for (int j=0; j<streetMap.length; j++) {
                for (int k = 0; k<streetMap[i].length; k++) {
                    if ((panels[j][k] != null)&&panels[j][k].isWorking()) {
                        
                        temp1 = panels[j][k].getActualEfficiency();
                        temp2= (temp1/100.0);
                        temp3 = temp2*1500.0;
                        Final= temp3*4;
                        panels[j][k].setElectricityGenerated((int)Final);



                    }
                    
                    
                }
                
            }
        }
    }

    /**
     * Count the number of working panels in a parking lot.
     * 
     * @param parkingLot the parking lot name
     * @return the number of working panels
     */
    public int countWorkingPanels(String parkingLot) {
        int count = 0;
        for (int i = 0; i < streetMap.length; i++){
            for (int j = 0; j<streetMap[0].length; j++){
                // System.out.println(streetMap[0].length);
                if (parkingLot.equals(streetMap[i][j]) ) {
                    if (panels[i][j] != null &&panels[i][j].isWorking()) {
                        count++;

                    }
                }
            }
            
            

                    
                    
                
            
           }
        
        
        return count; // PLACEHOLDER TO AVOID COMPILATION ERROR - REPLACE WITH YOUR CODE
    }

    /**
     * Find the broken panels in the map and repair them.
     * @return the count of working panels in total, after repair
     */
    public int updateWorkingPanels() {
        int workingPanels=0;
        for (int i = 0; i < streetMap.length; i++){
            for (int j = 0; j<streetMap[0].length; j++){
                if(panels[i][j] != null) {
                     panels[i][j].setIsWorking(true);
                }
               
            }
        }
        for (int i = 0; i<lots.length;i++) {
            workingPanels+=lots[i].getMaxPanels();

        }

        return workingPanels;
    }

    /**
     * Calculate Rutgers' savings on energy by using
     * these solar panels.
     * 
     * ASSUME:
     * - Multiply total electricity generated by 0.001 to convert to KwH.
     * - There are 365 days in a year.
     * 
     * RUN electricityGenerated before running this method.
     */
    public double calculateSavings() {
        double totalSavings = 0;
        double totalEnergy = 0;
        for (int i = 0; i < streetMap.length; i++){
            for (int j = 0; j<streetMap[0].length; j++){
                if(panels[i][j] != null) {
                    totalEnergy+=panels[i][j].getElectricityGenerated();
                }
               
            }
        }
        totalEnergy/=1000.0;
        totalEnergy*=365.0;
        totalEnergy/=4270000.0;
        totalSavings=totalEnergy*60000000.0;
        return totalSavings;
        
    }

    /*
     * Getter and Setter methods
     */
    public Panel[][] getPanels() {
        // DO NOT TOUCH THIS METHOD
        return this.panels;
    }

    public void setPanels(Panel[][] panels) {
        // DO NOT TOUCH THIS METHOD
        this.panels = panels;
    }

    public String[][] getStreetMap() {
        // DO NOT TOUCH THIS METHOD
        return this.streetMap;
    }

    public void setStreetMap(String[][] streetMap) {
        // DO NOT TOUCH THIS METHOD
        this.streetMap = streetMap;
    }

    public ParkingLot[] getLots() {
        // DO NOT TOUCH THIS METHOD
        return this.lots;
    }

    public void setLots(ParkingLot[] lots) {
        // DO NOT TOUCH THIS METHOD
        this.lots = lots;
    }
}
