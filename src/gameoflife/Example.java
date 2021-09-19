package gameoflife;
class Example {
    public void Oscillator(){
        int [][] Grid = new int [10][10];
        System.out.println("First Example: Oscillator");
        //initial cell
            for (int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    Grid[i][j] = 0;
                    System.out.print(Grid[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
            
        //add 1 person alive
        System.out.println("Add 1 person alive");
            for (int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    Grid[i][j] = 0;
                    Grid[6][4] = 1;
                    System.out.print(Grid[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
            
        //add 2 neighbors between 1 person alive
        System.out.println("Add 2 neighbours between 1 person alive");
            for (int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    Grid[i][j] = 0;
                    Grid[6][4] = 1;
                    Grid[6][3] = 1;
                    Grid[6][5] = 1;
                    System.out.print(Grid[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
            
        //forward to next generation step 1
        System.out.println("If 1 alive person has less than 2 neighbours, they died");
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(Grid[6][3] == 1 && Grid[6][5] == 1){
                        Grid[6][3] = 0;
                        Grid[6][5] = 0;
                    } 
                    System.out.print(Grid[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
            
        //forward to next generation step 2
        System.out.println("If an empty cell has more than 2 neighbours, 1 alive person will be born");
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(Grid[6][4] == 1){
                        Grid[5][4] = 1;
                        Grid[7][4] = 1;
                    }
                    System.out.print(Grid[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
    }
    
    public void ReverseOscillator(){
        int [][] Grid = new int [10][10];
        System.out.println("Second Example: Reverse Oscillator");
        //initial cell
            for (int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    Grid[i][j] = 0;
                    System.out.print(Grid[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
            
        //add 1 person alive
        System.out.println("Add 1 person alive");
            for (int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    Grid[i][j] = 0;
                    Grid[6][4] = 1;
                    System.out.print(Grid[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        
        //add 2 neighbors between 1 person alive
        System.out.println("Add 2 neighbours between 1 person alive");
            for (int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    Grid[i][j] = 0;
                    Grid[6][4] = 1;
                    Grid[5][4] = 1;
                    Grid[7][4] = 1;
                    System.out.print(Grid[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        
        //forward to next generation step 1
        System.out.println("If 1 alive person has less than 2 neighbours, they died");
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(Grid[5][4] == 1 && Grid[7][4] == 1){
                        Grid[5][4] = 0;
                        Grid[7][4] = 0;
                    } 
                    System.out.print(Grid[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        
        //forward to next generation step 2
        System.out.println("If an empty cell has more than 2 neighbours, 1 alive person will be born");
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(Grid[6][4] == 1){
                        Grid[6][3] = 1;
                        Grid[6][5] = 1;
                    }
                    System.out.print(Grid[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");   
        }
    public void Beehive(){
        int [][] Grid = new int [10][10];
        System.out.println("Third Example: Beehive");
        //initial cell
            for (int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    Grid[i][j] = 0;
                    System.out.print(Grid[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("");
    }
}