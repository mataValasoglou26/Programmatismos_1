public class BarChartDemo {
    public static void main(String[] args) {

        // Πίνακας συχνοτήτων: Πόσοι έβαλαν 1, 2, 3, 4 ή 5 αστέρια.
        // (Η θέση 0 αγνοείται για ευκολία)
        int[] frequency = { 0, 2, 4, 3, 10, 25 };

        System.out.println("=== ΚΑΤΑΝΟΜΗ ΚΡΙΤΙΚΩΝ (ONYX STORM) ===");

        // Ο εξωτερικός βρόχος διατρέχει τις βαθμολογίες (από 1 έως 5)
        for (int count = 1; count < frequency.length; count++) {
            System.out.print(count + " Αστέρια: ");

            // Ο εσωτερικός βρόχος διαβάζει τη συχνότητα και τυπώνει τα αντίστοιχα αστεράκια (*)
            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            }

            // Αλλαγή γραμμής στο τέλος κάθε μπάρας του γραφήματος[cite: 8]
            System.out.println();
        }
    }
}
