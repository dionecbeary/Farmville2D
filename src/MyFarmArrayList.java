import java.util.ArrayList;
public class MyFarmArrayList {

    public ArrayList<Plot>row = new ArrayList<Plot>();
    public Plot[] arr = new Plot[10];
    public MyFarmArrayList(){
        System.out.println("my farm using array list");

        arr[0] = new Plot();

        for(int p = 0; p < 10; p++){
            System.out.println(row.size());
            row.add(new Plot());
            row.get(p).printPlot();
        }

        row.add(new Plot());
        System.out.println(row.size());
        totalPlants();
        printPlantNames();
        addSunflower();
        printPlantNames();
        addCorn();
        printPlantNames();
        tomatoLocations();
        totalCarrots();
        averageNumberOfPlants();
        numberOfCarrotPlots();
        numberOfEmptyPlots();
        everyOtherNeedsWater();
        plantWithMaxNumber();
        plantWithMinNumber();
    }

    public void totalPlants() {
        // how many total plants are there in the row?
        int total = 0;
        for (Plot a : row){
            total += a.numberOfPlant;
        }
        System.out.println("Total plants in my farm is "+total);
    }
    public void printPlantNames() {
        // print the name of each plant in each row and column
        // row: 0 col: 0 corn
        for(int k = 0; k < row.size(); k++){
            System.out.print(k + ": "+row.get(k).plantName + "\t");
        }
        System.out.println();
    }
    public void addSunflower() {
        // add a lettuce plot to the end of the row with 42 plants that need water
        // call printPlantNames() method before and after your addition to make sure it worked
        Plot sunflower = new Plot();
        sunflower.plantName = "sunflower";
        sunflower.numberOfPlant = 42;
        sunflower.needsWater = true;
        sunflower.printPlot();
        row.add(sunflower);
    }
    public void addCorn() {
        // at index 3, add a new tulip plot with 70 plants that do not need water
        // call printPlantNames() method before and after your addition to make sure it worked
        Plot corn = new Plot();
        corn.plantName = "corn";
        corn.numberOfPlant = 70;
        corn.needsWater = false;
        corn.printPlot();
        row.add(3,corn);
    }
    public void tomatoLocations() {
        // print indexes of all tomato plants
        // call printPlantNames() method to make sure you're getting the correct indexes
        System.out.print("Tomatoes are located in the following plots: ");
         for(int m = 0; m < row.size(); m++){
             if(row.get(m).plantName == "tomatoes"){
                 System.out.print(m+" ");
             }
         }
         System.out.println();
    }

    public void totalCarrots() {
        // how many total carrot plants are there?
        int totalCarrots = 0;
        for(Plot b: row){
            if(b.plantName == "carrots"){
                totalCarrots += b.numberOfPlant;
            }
        }
        System.out.println("The total number of carrot plants is "+totalCarrots);
    }
    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole row?
        int totalPlants = 0;
        for(Plot b: row){
            totalPlants += b.numberOfPlant;
        }
        System.out.println("Average number of plants is "+totalPlants/row.size());
    }

    public void numberOfCarrotPlots() {
        // how many plots have carrots on them
// call printPlantNames() method to check
        int carrotPlots = 0;
        for (Plot a: row){
            if(a.plantName == "carrots"){
                carrotPlots += 1;
            }
        }
        System.out.println("The numberr of plots with carrots is "+carrotPlots);
        printPlantNames();
    }
    public void numberOfEmptyPlots() {
        // how many plots are empty
// call printPlantNames() method to check
        int emptyPlots = 0;
        for(Plot n: row){
            if(n.plantName == "empty"){
                emptyPlots += 1;
            }
        }
        System.out.println("The number of empty plots is "+emptyPlots);
        printPlantNames();
    }
    public void everyOtherNeedsWater(){
        // change the value of needsWater to be true for every other plot
        for (int i=0; i < row.size(); i++){
            if (i%2 == 1){
                row.get(i).needsWater = true;
            }
        }
    }

    public void plantWithMaxNumber() {
        // which plant type has the most total plants?
        int carrots = 0;
        int sunflowers = 0;
        int corn = 0;
        int tomatoes = 0;
        for(Plot i : row){
            if (i.plantName == "carrots"){
                carrots += 1;
            }
            if (i.plantName == "sunflowers"){
                sunflowers += 1;
            }
            if (i.plantName == "corn"){
                corn += 1;
            }
            if (i.plantName == "tomatoes"){
                tomatoes += 1;
            }
        }
        if (carrots > sunflowers && carrots > corn && carrots > tomatoes){
            System.out.println("Carrots have the most total plants.");
        }
        if (sunflowers > carrots && sunflowers > corn && sunflowers > tomatoes){
            System.out.println("Sunflowers have the most total plants.");
        }
        if (corn > carrots && corn > sunflowers && corn > tomatoes){
            System.out.println("Corn has the most total plants.");
        }
        if (tomatoes > carrots && tomatoes > sunflowers && tomatoes > corn){
            System.out.println("Tomatoes have the most total plants.");
        }
    }
    public void plantWithMinNumber() {
        // which plant type has the least total plants (not counting empty plots)?
        int carrots = 0;
        int sunflowers = 0;
        int corn = 0;
        int tomatoes = 0;
        for(Plot i : row){
            if (i.plantName == "carrots"){
                carrots += 1;
            }
            if (i.plantName == "sunflowers"){
                sunflowers += 1;
            }
            if (i.plantName == "corn"){
                corn += 1;
            }
            if (i.plantName == "tomatoes"){
                tomatoes += 1;
            }
        }
        if (carrots < sunflowers && carrots < corn && carrots < tomatoes){
            System.out.println("Carrots have the least total plants.");
        }
        if (sunflowers < carrots && sunflowers < corn && sunflowers < tomatoes){
            System.out.println("Sunflowers have the least total plants.");
        }
        if (corn < carrots && corn < sunflowers && corn < tomatoes){
            System.out.println("Corn has the least total plants.");
        }
        if (tomatoes < carrots && tomatoes < sunflowers && tomatoes < corn){
            System.out.println("Tomatoes have the least total plants.");
        }
    }

    public void greaterThan10() {
        // how many plots have more than 10 plants in the plot?
    }

    public void plantWithMaxNumberNeedsWater(){
        // which plant type has the most total plants (not counting empty plots) that needs water?

    }


}