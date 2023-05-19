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


}