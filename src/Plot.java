public class Plot {
    public String plantName;
    public int numberOfPlant;
    public boolean needsWater;

    public Plot(){
        needsWater = false;
        numberOfPlant = (int)(Math.random() * 100)+10;
        int num = (int)(Math.random() * 5);
        if(num == 0){
            plantName = "carrots";
        }else if(num == 1){
            plantName = "sunflowers";
        }else if(num == 2){
            plantName = "corn";
        }else if(num == 3){
            plantName = "tomatoes";
        }else if(num == 4){
            plantName = "empty";
            numberOfPlant = 0;
        }
    }

    public void printPlot(){
        System.out.println("The plot has "+numberOfPlant+" "+ plantName+" and it is "+needsWater+" that it needs water.");
    }
}
