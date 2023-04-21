public class Plot {
    public String plantName;
    public int numberOfPlant;
    public boolean needsWater;

    public Plot(){
        needsWater = true;
        numberOfPlant = (int)(Math.random() * 100)+10;
        int num = (int)(Math.random() * 5);
        if(num == 0){
            plantName = "basil";
        }
    }
}
