import java.util.List;

public class Viewer {

    public void displayTitle() {
        System.out.println(" ___  ___ ___ ");
        System.out.println("| _ \\/ __/ __|");
        System.out.println("|  _/\\__ \\__ \\");
        System.out.println("|_|  |___/___/\n");
    }
    
    public void displaySchedule(List<Task> list) {
        System.out.println();
        System.out.println("====Schedule====");
        System.out.println();

        // Case there are no tasks
        if (list.size() == 0) {
            System.out.println("Error: There are No Tasks");
            //---- Could throw an Exception here ----
        } else {
            // sort list here. By Date.
            list.forEach((task) -> displayTask(task));
        }
    }

    private void displayTask(Task task) {
        task.print();
        System.out.println("---------------");
    }

    public void displayMenu() {
        System.out.println("------------Menu------------\n");
        System.out.println("1) Create Task");
        System.out.println("2) View Task");
        System.out.println("3) Edit Task");
        System.out.println("4) Delete Task");
        System.out.println("5) Read schedule from a file");
        System.out.println("6) Write schedule to a file");
        System.out.println("7) View Schedule");
        System.out.println("8) Exit session");
        System.out.println("------------------------------");
    }
}
