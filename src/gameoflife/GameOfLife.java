package gameoflife;

public class GameOfLife {
    public static void main(String[] args) {
        int [][] Grid = new int [10][10];
            for (int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    Grid[i][j] = 0;
                    System.out.print(Grid[i][j]+" ");
                   
                }
                System.out.println("");
            }
            
            
    }
    
}
