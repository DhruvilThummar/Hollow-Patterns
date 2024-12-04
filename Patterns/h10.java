
import java.util.Scanner;

class Dhruvil{
    
    public static void main(String[] args){
       
        int n = 5;
        for(int i = 1;i <= n;i++){
            for(int j = i;j <= n;j++){
                if((j ==n)||(i == 1) || (j == i)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
    
}