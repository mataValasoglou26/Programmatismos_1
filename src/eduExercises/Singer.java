package eduExercises;
import java.util.Scanner;
public class Singer {

    private String name;
    private int id;
    private static int counter = 0;

    static Singer[] allSingers = new Singer[20];

    public Singer( String name ){

        this.name = name;
        this.id=counter+1;

        allSingers[counter]=this;

        counter = counter+1;

    }

    public String getName(){

        return name;

    }

    public String toString(){

        return "Singer's name: " + name + " id: "  + id;
    }

    public static void createSinger(){

        Scanner input = new Scanner(System.in);

        System.out.println("what name do you want ;");

        String name = input.nextLine();

        Singer singer = new Singer(name);

    }

    public static void printSingers() {
        for (Singer eachSinger : allSingers) {
            if (eachSinger != null) {
                System.out.println(eachSinger);
            }
        }
    }

    public static void printSongs(){
        for ( Singer eachSinger : allSingers){
            if ( eachSinger != null ){
                System.out.println( eachSinger.getName() + ": ");

                for ( Song eachSong : Song.allSongs ){
                    if ( eachSinger.getName() == eachSong.getSinger().getName() ) {

                        System.out.println(eachSong.toString());
                    }
                }
            }
        }
    }

}
