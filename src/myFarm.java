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
        plotWithMaxNumber();
        plantWithMaxNumber();
        plantWithMinNumber();
        greaterThan50();
        plantWithMaxNumberNeedsWater();
        averageRows();
        averageColums();
//        updateNeedsWater();
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
    public void plotWithMaxNumber(){
        int maxNumber = grid[0][0].numberOfPlant;
        String name = grid[0][0].plantName;
        for(int b = 0; b<grid[b].length; b++){
            for(int g = 0; g<grid[b].length; g++){
                if (grid[b][g].numberOfPlant > maxNumber){
                    maxNumber = grid[b][g].numberOfPlant;
                    name = grid[b][g].plantName;
                }
            }
        }
        System.out.println("The plot with the most plants is a "+name+" plot with a number of "+maxNumber);
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
                switch(grid[a][b].plantName){
                    case "carrots":
                        carrots += grid[a][b].numberOfPlant;
                        break;
                    case "sunflowers":
                        sunflowers += grid[a][b].numberOfPlant;
                        break;
                    case "corn":
                        corn += grid[a][b].numberOfPlant;
                        break;
                    case "tomatoes":
                        tomatoes += grid[a][b].numberOfPlant;
                        break;
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
        int[] rowAverages = new int[grid.length];
        for (int y = 0; y < grid.length; y++){
            int rowSum = 0;
            for (int x =0; x < grid[y].length; x++){
                rowSum += grid[y][x].numberOfPlant;
            }
            rowAverages[y] = rowSum / grid[y].length;
        }
        for (int n = 0; n < rowAverages.length; n++){
            System.out.println("Row " + (n+1) + "'s average number of plants is " + rowAverages[n]);
        }
    }
    public void averageColums() {
        //find the average number of plants for every col. place the average of every column into a new array
        int[] columnAverages = new int[grid[0].length];
        for (int x =0; x < grid[x].length; x++){
            int columnSum = 0;
            for (int y = 0; y < grid.length; y++){
                columnSum += grid[y][x].numberOfPlant;
            }
            columnAverages[x] = columnSum / grid[x].length;
        }
        for (int n = 0; n < columnAverages.length; n++){
            System.out.println("Column " + (n+1) + "'s average number of plants is " + columnAverages[n]);
        }
    }
    public void updateNeedsWater() {
        //if 2 or more of the adjacent plots need water (left, right, up, down) make the current plot needs water to be true
        for (int a = 0; a < grid.length; a++){
            for (int b =0; b < grid[a].length; b++){
                int adjPlotsNeedingWater = 0;
                if (grid[a][b].needsWater == false){
                    if (grid[a-1][b].needsWater == true){
                        adjPlotsNeedingWater+=1;
                    }
                    if (grid[a+1][b].needsWater == true){
                        adjPlotsNeedingWater+=1;
                    }
                    if (grid[a][b-1].needsWater == true){
                        adjPlotsNeedingWater+=1;
                    }
                    if (grid[a][b+1].needsWater == true){
                        adjPlotsNeedingWater+=1;
                    }
                    if (adjPlotsNeedingWater >= 2){
                        grid[a][b].needsWater = true;
                    }
                }
            }
        }
    }
//    public void updateNumberOfPlants() {
//        //change the value of number of plants so it is the average of the 8 surrounding plots (top, bottom, left, right, top-right, top-left, bottom-left, bottom-right)
//        for (int a = 0; a < grid.length; a++){
//            for (int b =0; b < grid[a].length; b++){
//                grid[a][b].numberOfPlant = (grid[a-1][b-1].numberOfPlant + grid[a][b-1].numberOfPlant + grid[a+1][b-1].numberOfPlant + grid[a-1][b].numberOfPlant + grid[a+1][b].numberOfPlant + grid[a-1][b+1].numberOfPlant + grid[a][b+1].numberOfPlant + grid[a+1][b+1].numberOfPlant)/8;
//            }
//        }
//        for (int a = 0; a < grid.length; a++){
//            System.out.println("Row "+a+": ");
//            for (int b =0; b < grid[a].length; b++){
//                System.out.print(grid[a][b].numberOfPlant + " ");
//            }
//        }
//    }


}