package eduExercises;
import java.util.InputMismatchException;
import java.util.Scanner;
public class BandApp {

    public static void createObjects(){
        Singer s1 = new Singer("lana");
        Singer s2 =    new Singer("xrs");

        Song ss1 = new Song("ultra violence",s1);
        Song ss2 = new Song("pipa",s2);
    }

    public static void main ( String[] args ){

        Scanner input = new Scanner(System.in);
        createObjects();
        boolean flag = true;

        do{
            try{
                System.out.println("menu: 1 all songs,2 all singers,3 new singer");
                System.out.println("whats your choice;");

                int choice = input.nextInt();

                if (choice==1){
                    Song.printSongs();
                }else if(choice==2){
                    Singer.printSingers();
                }else if(choice==3){
                    Singer.createSinger();
                }else if(choice==0){
                    flag=false;
                }
            } catch(InputMismatchException e){
                System.out.println("only int");
            }
        } while(flag==true);
    }

}
