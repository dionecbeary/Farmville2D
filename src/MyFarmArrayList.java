import java.util.ArrayList;
public class MyFarmArrayList {

    public ArrayList<Plot>row = new ArrayList<Plot>();
    public Plot[] arr = new Plot[10];
    public void myFarmArrayList(){
        System.out.println("my farm using array list");

        arr[0] = new Plot();

        for(int p = 0; p < 10; p++){
            row.add(new Plot());
            row.get(p).printPlot();
        }
    }
}
