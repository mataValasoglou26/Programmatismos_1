package eduExercises;

import java.util.ArrayList;

public class Song {

    private String title;
    private Singer singer;

    static ArrayList<Song> allSongs = new ArrayList<Song>();

    public Song ( String title , Singer singer ){

        this.title = title;
        this.singer = singer;

        allSongs.add(this);

    }

    public Singer getSinger(){

        return singer;

    }

    public String toString(){

        return singer.toString() + " song title: " + title;

    }

    public static void printSongs(){

        for( Song eachSong : allSongs ){

                System.out.println(eachSong);

        }
    }
}
