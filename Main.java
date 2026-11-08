public class Main {
    
    public static double average(double[] list) {
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum / list.length;
    }

    public static char letter(double avg) {
        char grade;
        if (avg >= 80) {
            grade = 'A';
        } else if (avg >= 70) {
            grade = 'B';
        } else if (avg >= 60) {
            grade = 'C';
        } else if (avg >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args) {
        // Store 5 scores in an array
        double[] myScores = {72.0, 85.5, 63.0, 91.0, 58.5};

        System.out.println("Listing all exam scores:");
        for (int i = 0; i < myScores.length; i++) {
            System.out.println("Score " + (i + 1) + ": " + myScores[i]);
        }

        double finalAvg = average(myScores);
        char finalGrade = letter(finalAvg);

        System.out.printf("\nAverage: %.2f (%c)\n", finalAvg, finalGrade);
    }
}