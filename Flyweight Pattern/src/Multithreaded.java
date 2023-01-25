public class Multithreaded implements Runnable{
    Thread t;
    public static void runMultithreaded(){
        Multithreaded mt = new Multithreaded();
    }

    public Multithreaded() {
        String names[] = {"John", "Jane", "James"};
        int ids[] = {1, 2, 3};
        double scores[] = {45, 55, 65};

        double total = 0;

        for(int i = 0; i < scores.length; i++){
            total += scores[i];
        }

        double averageScore = total / scores.length;

        StudentMultithreaded student = StudentMultithreaded.getInstance();
        student.setAverageScore(averageScore);

        student.setName(names[0]);
        student.setScore(scores[0]);
        student.setId(ids[0]);
        t = new Thread(this, "second");
        t.start();
        System.out.println("Name: " + student.getName());
        System.out.println("Standing: " + Math.round(student.getStanding()));
        System.out.println("");
    }

    public void run() {
        System.out.println("Running Second thread...");
        StudentMultithreaded student = StudentMultithreaded.getInstance();
        System.out.println("Name: "+ student.getName());
        System.out.println("Standing: " + Math.round(student.getStanding()));
        System.out.println("");
    }
}
