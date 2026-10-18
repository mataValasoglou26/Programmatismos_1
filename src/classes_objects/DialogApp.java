package classes_objects;

import javax.swing.JOptionPane;

    public class DialogApp {

        public static void main(String[] args) {


            String name = JOptionPane.showInputDialog("Πώς σε λένε;");


            String message = String.format("Συγχαρητήρια %s! Ολοκλήρωσες το Κεφάλαιο 3 και είσαι ένα βήμα πιο κοντά στο να κατακτήσεις την Java!", name);

            JOptionPane.showMessageDialog(null, message);

        }
    }

