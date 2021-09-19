package gameoflife;

public class GameOfLife {
    public static void main(String[] args) {
        int [][] Grid = new int [10][10];
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
        
            
            
    }   
}