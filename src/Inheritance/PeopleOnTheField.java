package Inheritance;

public class PeopleOnTheField {

    private String name;
    private String ability;

    public PeopleOnTheField(String name , String ability){

        this.name = name;
        this.ability = ability;
    }

    public String toString(){
        return "player:" + name + " talents: " + ability;
    }
}
