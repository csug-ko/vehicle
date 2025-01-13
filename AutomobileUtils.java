public class AutomobileUtils {
    public static void printResults(Automobile obj) {
        try {
            System.out.println("\nAuto ID: " + obj.autoID + "\nAuto Make: " + obj.autoMake
                    + "\nAuto Model: " + obj.autoModel + "\nAuto Color: "
                    + obj.autoColor + "\nAuto Year: " + obj.autoYear);
            if (obj.onSale) {
                System.out.println("Auto Listing Price: " + obj.autoSalePrice);
            } else {
                System.out.println("Auto Listing Price: " + obj.autoListedPrice);
            }
        } catch (Exception e) {
            System.out.println("No automobile found here" + e.getMessage());
        }
    }
}