import java.util.*;
import java.io.*;

class IDwise_sumwithhashmap {
    public static void main(String[] args) {
        File f1 = new File("SalesEVESession (1).txt");
        Scanner inp;
        String dl;
        HashMap<String, Double> hmID = new HashMap<>();
        try {
            inp = new Scanner(f1);
            dl = inp.nextLine(); // Header skip
            while (inp.hasNextLine()) {
                dl = inp.nextLine();
                String[] parts = dl.split("\t");
                String id = parts[0];
                double amt = Double.parseDouble(parts[2]) * Double.parseDouble(parts[3]);

                if (hmID.containsKey(id)) {
                    hmID.put(id, hmID.get(id) + amt);
                } else {
                    hmID.put(id, amt);
                }
            }
            inp.close();
        } catch (Exception e) {
            System.out.println("Processing ID Sum...");
        } finally {
            for (Map.Entry<String, Double> entry : hmID.entrySet()) {
                System.out.println("Item Code: " + entry.getKey() + " --- Total: " + entry.getValue());
            }
        }
    }
}