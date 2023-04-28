public class myFarm {
    public static void main(String[] args) {
        myFarm fruit = new  myFarm();
    }
    public Plot[][] grid;
    public myFarm(){
        grid = new Plot [4][3];
        for (int a = 0; a < grid.length; a++){
            for (int b =0; b < grid[a].length; b++){
                grid [a][b] = new Plot();
                //grid [a][b].printPlot();
            }
        }
        totalPlants();
        printPlantNames();
        totalCarrots();
        averageNumberOfPlants();
        numberOfTomatoPlots();
        numberOfEmptyPlots();
    }
    public void totalPlants(){
        int sumOfPlants = 0;
        for (int e = 0; e < grid.length; e++){
            for (int f =0; f < grid[e].length; f++){
                sumOfPlants += grid [e][f].numberOfPlant;
            }
        }
        System.out.println("Total number of plants: " + sumOfPlants);
    }
    public void printPlantNames(){
        for (int a = 0; a < grid.length; a++){
            for (int b =0; b < grid[a].length; b++){
                System.out.println("row: "+ a + " column: " + b + " " +grid[a][b].plantName);
            }
        }
    }
    public void totalCarrots(){
        int sumOfCarrots = 0;
        for (int a = 0; a < grid.length; a++){
            for (int b =0; b < grid[a].length; b++){
                if (grid[a][b].plantName == "carrots"){
                    sumOfCarrots += grid[a][b].numberOfPlant;
                }
            }
        }
        System.out.println("Number of carrots: "+sumOfCarrots);
    }
    public void averageNumberOfPlants(){
        int sumOfPlants = 0;
        int numberOfPlots = 0;
        for (int a = 0; a < grid.length; a++){
            for (int b =0; b < grid[a].length; b++){
                if (grid[a][b].plantName == "carrots"){
                    sumOfPlants += grid[a][b].numberOfPlant;
                    numberOfPlots += 1;
                }
            }
        }
        System.out.println("Average number of plants: "+ sumOfPlants / numberOfPlots);
    }
    public void numberOfTomatoPlots(){
        int sumOfTomatoPlots = 0;
        for (int a = 0; a < grid.length; a++){
            for (int b =0; b < grid[a].length; b++){
                if (grid[a][b].plantName == "tomatoes"){
                    sumOfTomatoPlots += 1;
                }
            }
        }
        System.out.println("Number of tomato plots: "+sumOfTomatoPlots);
    }
    public void numberOfEmptyPlots(){
        int sumOfEmptyPlots = 0;
        for (int a = 0; a < grid.length; a++){
            for (int b =0; b < grid[a].length; b++){
                if (grid[a][b].plantName == "empty"){
                    sumOfEmptyPlots += 1;
                }
            }
        }
        System.out.println("Number of empty plots: "+sumOfEmptyPlots);
    }

}