package eduExercises;

public class IntApp {

    public boolean isEven(int number){

        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
         IntApp app = new IntApp();
        System.out.println(app.isEven(55));
    }
}
