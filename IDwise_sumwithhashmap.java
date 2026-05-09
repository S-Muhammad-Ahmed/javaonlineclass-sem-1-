import java.util.Scanner;
import java.io.File;

class RepSum_NoHM {

    public static void main(String[] args) {

        File f1 = new File("c:\\temp\\products.txt");
        Scanner inp;
        String dl;

        String[] repIDs = {"E011", "E012", "E013", "E014"};
        double[] totals = {0, 0, 0, 0};

        try {
            inp = new Scanner(f1);
            dl = inp.nextLine();

            while (inp.hasNextLine()) {
                dl = inp.nextLine();
                if (dl.trim().length() == 0) continue;

                String[] parts = dl.split("\t");
                String repID = parts[5];
                double qty = Double.parseDouble(parts[3]);
                double uPrice = Double.parseDouble(parts[2]);
                double amt = qty * uPrice;

                for (int i = 0; i < repIDs.length; i++) {
                    if (repIDs[i].equals(repID)) {
                        totals[i] += amt;
                        break;
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("=== Rep ID-wise Sales Total (No HashMap) ===");
        for (int i = 0; i < repIDs.length; i++) {
            System.out.println(repIDs[i] + " --- " + totals[i]);
        }
    }
}
