import java.util.*;

class Automobile {
    // Declarations
    private int autoYear;
    private int autoID;
    private String autoMake;
    private String autoModel;
    private String autoColor;
    private boolean isClean;
    private boolean onSale;
    public double autoListedPrice;
    private double autoSalePrice;
    private double autoDiscountedAmount;
    public static int autoCounter;
    public static int totalCount;
    private static ArrayList<Automobile> autoInventoryList = new ArrayList<>();

    // Setters 
    public void setAutoYear(int year) { this.autoYear = year;System.out.println("Success"); }
    public void setAutoMake(String make) { this.autoMake = make;System.out.println("Success"); }
    public void setAutoModel(String model) { this.autoModel = model; System.out.println("Success");}
    public void setAutoColor(String color) { this.autoColor = color; System.out.println("Success");}
    public void setIsClean(boolean clean) { this.isClean = clean;System.out.println("Success"); }
    public void setAutoID() { this.autoID = totalCount + 1000; System.out.println("Success");}
    public  void setOnSale(boolean sale) {
        this.onSale = sale;
        if (sale==true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the display sale price?");
            double salePrice = scanner.nextDouble();
            scanner.close();
            setAutoSalePrice(salePrice);
            System.out.println("Success");
        }
    }
    public void setAutoListedPrice(double listPrice) { this.autoListedPrice = listPrice;System.out.println("Success"); }
    public void setAutoSalePrice(double salePrice) {
        this.autoSalePrice = salePrice;
        setAutoDiscountedAmount(autoListedPrice - salePrice);
        System.out.println("Success");
    }
    public void setAutoDiscountedAmount(double discountedAmount) 
    { this.autoDiscountedAmount = discountedAmount;System.out.println("Success"); }

    // Getters
    public int getAutoYear() { return this.autoYear; }
    public String getAutoMake() { return this.autoMake; }
    public String getAutoModel() { return this.autoModel; }
    public String getAutoColor() { return this.autoColor; }
    public boolean getIsClean() { return this.isClean; }
    public boolean getOnSale() { return this.onSale; }
    public double getAutoListedPrice() { return this.autoListedPrice; }
    public double getAutoSalePrice() { return this.autoSalePrice; }
    public double getAutoDiscountedAmount() { return this.autoDiscountedAmount; }
    public int getAutoID() { return this.autoID; }

    // Remove vehicle function
    public void removeAuto(Automobile myAuto2) {
        int indexRemoval = autoInventoryList.indexOf(myAuto2);
        if (indexRemoval != -1) {
            autoInventoryList.remove(indexRemoval);
            autoCounter = autoInventoryList.size();
            System.out.println("Successfully removed vehicle from the Inventory List!");
        } else {
            System.out.println("Vehicle not found in the Inventory List!");
        }
    }

    // Print results
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

    // Default constructor
    Automobile() {
        ++totalCount;
        this.autoID = totalCount + 1000;
        this.autoYear = 9999;
        this.autoMake = "unknown";
        this.autoModel = "unknown";
        this.autoColor = "unknown";
        this.isClean = false;
        this.onSale = false;
        this.autoListedPrice = -1.00;
        this.autoSalePrice = 0.00;
        this.autoDiscountedAmount = 0.00;
        autoInventoryList.add(this);
        autoCounter = autoInventoryList.size();
    }

    // Fully entered constructor
    Automobile(String autoMake, String autoModel, int autoYear, String autoColor, Double autoListedPrice,
               Boolean isClean, Boolean onSale) {
        ++totalCount;
        this.autoID = totalCount + 1000;
        this.autoYear = autoYear;
        this.autoMake = autoMake;
        this.autoModel = autoModel;
        this.autoColor = autoColor;
        this.autoListedPrice = autoListedPrice;
        this.isClean = isClean;
        this.onSale = onSale;
        autoInventoryList.add(this);
        autoCounter = autoInventoryList.size();
    }

    // Main function
    public static void main(String[] args) {
        new Automobile("Chevrolet", "Bolt", 2017, "silver", 12999.99, false, false);
        new Automobile("Chevrolet", "Bolt", 2018, "gray", 13999.99, false, false);
        Automobile myAutomobile = new Automobile();
        myAutomobile.setAutoListedPrice(19223.45);
        myAutomobile.setAutoMake("Dodge");
        myAutomobile.setAutoModel("RAM");
        myAutomobile.setIsClean(true);
        myAutomobile.setAutoID();


        // Print the inventory before removal
        System.out.println("Inventory before removal:");
        for (Automobile auto : autoInventoryList) {
            printResults(auto);
        }

        // Remove an automobile
        Automobile autoToRemove = autoInventoryList.get(1); // Example: remove the second automobile
        myAutomobile.removeAuto(autoToRemove);

        // Print the inventory after removal
        System.out.println("Inventory after removal:");
        for (Automobile auto : autoInventoryList) {
            printResults(auto);
        }
    
    for (Automobile auto : autoInventoryList) {
      if (auto.getIsClean() == true) {
          auto.setOnSale(true);
         // auto.setAutoSalePrice(auto.getAutoListedPrice()*.9);
          System.out.println("Updated automobile with autoID 1004 to be on sale with the new sale price.");
          break;
      }
  }
}}