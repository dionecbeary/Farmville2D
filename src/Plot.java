public class Plot {
    public String plantName;
    public int numberOfPlant;
    public boolean needsWater;

    public Plot(){
        needsWater = true;
        numberOfPlant = (int)(Math.random() * 100)+10;
        int num = (int)(Math.random() * 5);
        if(num == 0){
            plantName = "carrots";
        }
        if(num == 1){
            plantName = "sunflowers";
        }
        if(num == 2){
            plantName = "corn";
        }
        if(num == 3){
            plantName = "tomato";
        }
        if(num == 4){
            plantName = "empty";
        }
    }

    public void printPlot(){
        System.out.println(plantName+", "+numberOfPlant+", "+needsWater);
    }
}
