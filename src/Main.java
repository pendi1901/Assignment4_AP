import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;




public class Main {
    public static int hop() throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        Random rand = new Random();
        br.readLine();
        int upperbound= 25;
        int hoptile = rand.nextInt(upperbound);
        if(hoptile>20){
            System.out.println("You are too energetic and zoomed past all the tiles. Muddy Puddle Splash!");
        }
        else {
            return hoptile;
        }
        return 0;
    }
    public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.println("Hit Enter to Initialise the game ");
        br.readLine();
        System.out.println("Game is Ready");
        System.out.println("Hit enter for your first hop");
        int a = hop();
        System.out.println("You landed on tile: "+ a);

        System.out.println("Hit enter for your second hop");
        System.out.println("Hit enter for your third hop");
        System.out.println("Hit enter for your fourth  hop");
        System.out.println("Hit enter for your fifth hop");
    }
}
