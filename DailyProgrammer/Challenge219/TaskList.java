package DailyProgrammer.Challenge219;

import java.util.ArrayList;

/**
 * Created by dom on 6/19/2015.
 */
public class TaskList {

    ArrayList<String> tskList;

    public TaskList() {
        tskList = new ArrayList();
    }

    public void add(String task) {
        tskList.add(task);
    }

    public void remove(String task) {
        tskList.remove(task);
    }

    public void printList() {
        System.out.println("To Do List:");
        for(String s: tskList) {
            System.out.println("- " + s);
        }
    }
}
