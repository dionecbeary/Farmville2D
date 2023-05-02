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
        everyOtherNeedsWater();
        plantWithMaxNumber();
        plantWithMinNumber();
        greaterThan50();
        plantWithMaxNumberNeedsWater();
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
                if (grid[a][b].plantName.equals("carrots")){
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
    public void everyOtherNeedsWater(){
        // change the value of needsWater to be true for every other plot
        // print the value of needs water for all plots row by row
        boolean alt = false;
        for (int a = 0; a < grid.length; a++){
            System.out.print("Row "+a+" needs water: ");
            for (int b =0; b < grid[a].length; b++){
                if (alt == false){
                    grid[a][b].needsWater = true;
                    alt = true;
                }else{
                    grid[a][b].needsWater = false;
                    alt = false;
                }
                System.out.print(grid[a][b].needsWater+" ");
            }
            System.out.println();
        }
    }
    public void plantWithMaxNumber() {
        // which plant type has the most total plants?
        int carrots = 0;
        int sunflowers = 0;
        int corn = 0;
        int tomatoes = 0;
        int empty = 0;
        for (int a = 0; a < grid.length; a++){
            for (int b =0; b < grid[a].length; b++){
                if (grid[a][b].plantName == "carrots"){
                    carrots += 1;
                }
                if (grid[a][b].plantName == "sunflowers"){
                    sunflowers += 1;
                }
                if (grid[a][b].plantName == "corn"){
                    corn += 1;
                }
                if (grid[a][b].plantName == "tomatoes"){
                    tomatoes += 1;
                }
                if (grid[a][b].plantName == "empty"){
                    empty += 1;
                }
            }
        }
        System.out.print("The plant type that has the most plants is ");
        if (carrots >= sunflowers && carrots >= corn && carrots >= tomatoes && carrots >= empty){
            System.out.println("carrots");
        }
        if (sunflowers >= carrots && sunflowers >= corn && sunflowers >= tomatoes && sunflowers >= empty){
            System.out.println("sunflowers");
        }
        if (corn >= carrots && corn >= sunflowers && corn >= tomatoes && corn >= empty){
            System.out.println("corn");
        }
        if (tomatoes >= carrots && tomatoes >= sunflowers && tomatoes >= corn && tomatoes >= empty){
            System.out.println("tomatoes");
        }
        if (empty >= carrots && empty >= sunflowers && empty >= corn && empty >= tomatoes){
            System.out.println("empty");
        }
    }
    public void plantWithMinNumber() {
        // which plant type has the least total plants (not counting empty plots)?
        int carrots = 0;
        int sunflowers = 0;
        int corn = 0;
        int tomatoes = 0;
        int empty = 0;
        for (int a = 0; a < grid.length; a++){
            for (int b =0; b < grid[a].length; b++){
                if (grid[a][b].plantName == "carrots"){
                    carrots += 1;
                }
                if (grid[a][b].plantName == "sunflowers"){
                    sunflowers += 1;
                }
                if (grid[a][b].plantName == "corn"){
                    corn += 1;
                }
                if (grid[a][b].plantName == "tomatoes"){
                    tomatoes += 1;
                }
                if (grid[a][b].plantName == "empty"){
                    empty += 1;
                }
            }
        }
        System.out.print("The plant type that has the least plants is ");
        if (carrots <= sunflowers && carrots <= corn && carrots <= tomatoes && carrots <= empty){
            System.out.println("carrots");
        }
        if (sunflowers <= carrots && sunflowers <= corn && sunflowers <= tomatoes && sunflowers <= empty){
            System.out.println("sunflowers");
        }
        if (corn <= carrots && corn <= sunflowers && corn <= tomatoes && corn <= empty){
            System.out.println("corn");
        }
        if (tomatoes <= carrots && tomatoes <= sunflowers && tomatoes <= corn && tomatoes <= empty){
            System.out.println("tomatoes");
        }
        if (empty <= carrots && empty <= sunflowers && empty <= corn && empty <= tomatoes){
            System.out.println("empty");
        }
    }
    public void greaterThan50() {
        // how many plots have more than 50 plants in the plot?
        int carrots = 0;
        int sunflowers = 0;
        int corn = 0;
        int tomatoes = 0;
        int empty = 0;
        int moreThan50 = 0;
        for (int a = 0; a < grid.length; a++){
            for (int b =0; b < grid[a].length; b++){
                if (grid[a][b].plantName == "carrots"){
                    carrots += 1;
                }
                if (grid[a][b].plantName == "sunflowers"){
                    sunflowers += 1;
                }
                if (grid[a][b].plantName == "corn"){
                    corn += 1;
                }
                if (grid[a][b].plantName == "tomatoes"){
                    tomatoes += 1;
                }
                if (grid[a][b].plantName == "empty"){
                    empty += 1;
                }
            }
        }
        if (carrots > 50){
            moreThan50 += 1;
        }
        if (sunflowers > 50){
            moreThan50 += 1;
        }
        if (corn > 50){
            moreThan50 += 1;
        }
        if (tomatoes > 50){
            moreThan50 += 1;
        }
        if (empty > 50){
            moreThan50 += 1;
        }
        System.out.println("The number of plots with more than 50 plants is "+moreThan50);
    }
    public void plantWithMaxNumberNeedsWater(){
        // which plant type has the most total plants (not counting empty plots) that needs water?
        int carrots = 0;
        int sunflowers = 0;
        int corn = 0;
        int tomatoes = 0;
        for (int a = 0; a < grid.length; a++){
            for (int b =0; b < grid[a].length; b++){
                if (grid[a][b].needsWater == true){
                    if (grid[a][b].plantName == "carrots"){
                        carrots += 1;
                    }
                    if (grid[a][b].plantName == "sunflowers"){
                        sunflowers += 1;
                    }
                    if (grid[a][b].plantName == "corn"){
                        corn += 1;
                    }
                    if (grid[a][b].plantName == "tomatoes"){
                        tomatoes += 1;
                    }
                }
            }
        }
        System.out.print("The plant type with the most plants that need watering is ");
        if (carrots >= sunflowers && carrots >= corn && carrots >= tomatoes){
            System.out.println("carrots");
        }
        if (sunflowers >= carrots && sunflowers >= corn && sunflowers >= tomatoes){
            System.out.println("sunflowers");
        }
        if (corn >= carrots && corn >= sunflowers && corn >= tomatoes){
            System.out.println("corn");
        }
        if (tomatoes >= carrots && tomatoes >= sunflowers && tomatoes >= corn){
            System.out.println("tomatoes");
        }

    }
    public void averageRows() {
        //find the average number of plants for every row. place the average of every row into a new array
        int[] rowAverages = new int[grid[a].length];
        for (int a = 0; a < grid.length; a++){
            int rowSum = 0;
            for (int b =0; b < grid[a].length; b++){
                rowSum += grid[a][b].numberOfPlant;
            }
            rowAverages[a] = rowSum / grid[a].length;
        }
    }

}