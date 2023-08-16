import java.util.*;
public class Main {
    public static void main(String[] args) {

        char[][] b=new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j]=' ';
            }
        }
        boolean won=false;
        char player='X';
        while(!won){
            printboard(b);
            Scanner sc=new Scanner(System.in);
            int r=sc.nextInt();
            int c=sc.nextInt();
            if(b[r][c]==' '){
                b[r][c]=player;
                if(gamewon(b,player)){
                    System.out.println(player+" has won");
                    won=true;
                    printboard(b);
                }
                else{
                    if(player=='X'){
                        player='O';
                    }
                    else{
                        player='X';
                    }
                }
            }
            else{
                System.out.println("invalid move");
            }

        }
    }
    public static void printboard(char[][] b){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(b[i][j]+"|");
            }
            System.out.println();
        }
    }
    public static boolean gamewon(char[][] b,char player){
        for(int i=0;i<3;i++){
            if(b[i][0]==player&&b[i][1]==player&&b[i][2]==player){
                return true;
            }
        }
        for(int c=0;c<3;c++){
            if(b[0][c]==player&&b[1][c]==player&&b[2][c]==player) {
                return true;
            }
        }
        if(b[0][0]==player&&b[1][1]==player&&b[2][2]==player){
            return true;
        }
        if(b[0][2]==player&&b[1][1]==player&&b[2][0]==player){
            return true;
        }
        return false;
    }
}