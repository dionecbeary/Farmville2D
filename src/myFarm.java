public class myFarm {
    public static void main(String[] args) {
        myFarm fruit = new  myFarm();
    }
    public myFarm(){
        Plot [][] grid = new Plot [10][2];
        for (int a = 0; a < grid.length; a++){
            for (int b =0; b < grid[a].length; b++){
                grid [a][b] = new Plot();
                grid [a][b].printPlot();
            }
        }
    }
}