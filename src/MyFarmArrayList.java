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
    }

    public void totalPlants() {
        // how many total plants are there in the row?
        int total = 0;
        for (Plot a : row){
            total += a.numberOfPlant;
        }
        System.out.println("Total plants in my farm is "+total);
    }

}