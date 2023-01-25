public class SingleThread {
    public static void runSingleThread() {
        String names[] = {"John", "Jane", "James"};
        int ids[] = {1, 2, 3};
        double scores[] = {45, 55, 65};

        double total = 0;

        for(int i = 0; i < scores.length; i++){
            total += scores[i];
        }

        double averageScore = total / scores.length;

        Student student = new Student();
        student.setAverageScore(averageScore);

        /* The same student object with various swapped configurations is used. This gives an effect of many objects existing in
        * the system, but in reality, this is just the same, singleton object.*/
        for(int i = 0; i < scores.length; i++){
            student.setName(names[i]);
            student.setId(ids[i]);
            student.setScore(scores[i]);

            System.out.println("Name: " + student.getName());

            System.out.println("Standing: " + Math.round(student.getStanding()));
            System.out.println("");
        }
    }
}
