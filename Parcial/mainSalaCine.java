package Parcial;

public class SalaCine{
    public static void main(String[] args) throws Exception {

        String[][] sala1 = {{" ","1","2","3","4","5","6"},
                            {"G"," ","_","X","X","_"," "},
                            {"F"," ","_","_","_","_"," "},
                            {"E","_","_","_","X","X","_"},
                            {"D","_","_","_","_","_","_"}};
        for(int i = 0; i < sala1.length; i++){
            for(int j = 0; j < sala1[0].length; j++){
                System.out.print(sala1[i][j] + " ");        
            }
            System.out.println("\n");
        }

    
}
