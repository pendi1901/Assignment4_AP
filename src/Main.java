import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;




public class Main {
    //Should make something out of this by associating or using composition do to something
    public class Softtoy{
        private final String name;
        Softtoy(String name) {
            this.name = name;
        }
    }

    //Generic class List for the Toys list!!
    public static class MyGenericList <T>{
        private ArrayList softtoys;
        public MyGenericList(){
            softtoys = new ArrayList();
        }
        public void add(Object o){
            softtoys.add(o);
        }
        public void get(){
            int a = softtoys.size();
            for (Object softtoy : softtoys) {
                System.out.println(softtoy);
            }

        }
    }
    //Methods from here on

    //creating the string
    public static String genString(int n) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++){
            int index =(int)(AlphaNumericString.length()*Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }

    //Asking a Question in the String
    public static String askQuestionString() throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        String str1 =genString(4);
        String str2 = genString(4);
        System.out.println("Calculate the concatenation of the strings: "  + str1 + " and " + str2);
        String str3 = br.readLine();
        String str4 = str1+str2;
        if(str4.equals(str3)){
            return "Correct Answer ";
        }
        else{
            return "Incorrect Answer ";
        }
    }

    //Generating the numbers
    public static int genBiggerInteger(){
        Random rand = new Random();
        int no1 = rand.nextInt(10000) + 1000;
//        int no2 = rand.nextInt(100) + 1;
        return no1;
//        return no2;
    }
    public static int genSmallerInteger(){
        Random rand = new Random();
        int no2 = rand.nextInt(100) + 1;
        return no2;
    }
    //Asking the Integers Question
    public static String askQuestionInteger(){
        Scanner sc = new Scanner(System.in);
        int no1  = genBiggerInteger();
        int no2 = genSmallerInteger();
        System.out.println("Calculate the result of: " + no1 + " and " + no2);
        int no3 = sc.nextInt();
        int no4 = no1/no2;
        if(no3 == no4){
            return "Correct Answer ";
        }
        else{
            return "Incorrect Answer ";
        }
    }

    //hop method
    public static int hop() throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        Random rand = new Random();
        br.readLine();
        int hoptile = rand.nextInt(25) + 1;
        if(hoptile>20){
            System.out.println("You are too energetic and zoomed past all the tiles. Muddy Puddle Splash!");
        }
        else {
            return hoptile;
        }
        return 0;
    }
    public static void main(String [] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        MyGenericList softtoys = new MyGenericList();
        System.out.println("Hit Enter to Initialise the game ");
        br.readLine();
        System.out.println("Game is Ready");
        System.out.println("Hit enter for your first hop");
        int a = hop();
        System.out.println("You landed on tile: "+ a);
        if (a % 2 == 0) {


        }
        else{
            System.out.println("Question answer round, Integer or Strings?");
            String str2 = br.readLine();
            //for asking Integer Question
            if(str2.equals("Integer")){
                String str7 = askQuestionInteger();
                System.out.println(str7);
                if(str7.equals("Correct Answer ")){
                    System.out.println("softtoy");
                }
                else{
                    System.out.println("no softtoy");
                }
            }
            //for asking the String Question
            else if(str2.equals("String")){
                String str6 = askQuestionString();
                System.out.println(str6);
                if(str6.equals("Correct Answer ")){
                    System.out.println("softtoy");
                }
                else{
                    System.out.println("no softtoy");
                }
            }
            else{
                //Try some error handling here
            }






        }

        System.out.println("Hit enter for your second hop");
        int b = hop();
        System.out.println("You landed on tile: "+ b);
        if (b % 2 == 0) {

        }
        else{

        }
        System.out.println("Hit enter for your third hop");
        int c = hop();
        System.out.println("You landed on tile: "+ c);
        if (c % 2 == 0) {

        }
        else{

        }

        System.out.println("Hit enter for your fourth  hop");
        int d = hop();
        System.out.println("You landed on tile: "+ d);
        if (d % 2 == 0) {

        }
        else{

        }
        System.out.println("Hit enter for your fifth hop");
        int e = hop();
        System.out.println("You landed on tile: "+ e);
        if (e % 2 == 0) {

        }
        else{

        }
        System.out.println("Game Over");
        System.out.println("Soft toys won by you are");



        //for asking String Question
        String str6 = askQuestionString();
        System.out.println(str6);
        if(str6.equals("Correct Answer ")){
            System.out.println("softtoy");
        }
        else{
            System.out.println("no softtoy");
        }

        //for asking Integer Question
        String str7 = askQuestionInteger();
        System.out.println(str7);
        if(str6.equals("Correct Answer ")){
            System.out.println("softtoy");
        }
        else{
            System.out.println("no softtoy");
        }




    }
}
