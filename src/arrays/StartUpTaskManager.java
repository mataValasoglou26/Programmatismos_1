package arrays;

import java.util.ArrayList;

public class StartUpTaskManager {

    public static void main(String[] args) {


        ArrayList<String> tasksList = new ArrayList<String>();

        tasksList.add("sxediasmos");
        tasksList.add("analish");
        tasksList.add("dhmiourgia");
        tasksList.add("meleth");

        System.out.println("number of tasks: " + tasksList.size());

        tasksList.remove("dhmiourgia");

        for( String eachTask : tasksList ){
            System.out.println(eachTask);
        }
    }
}
