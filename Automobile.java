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
    private static AutoInventoryList autoInventoryList = new AutoInventoryList();

    // Remove vehicle function
    public void removeAuto(Automobile myAuto2) {
        autoInventoryList.removeAutomobile(myAuto2);
        autoCounter = autoInventoryList.size();
        System.out.println("Successfully removed vehicle from the Inventory List!");
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
        autoInventoryList.addAutomobile(this);
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
        autoInventoryList.addAutomobile(this);
        autoCounter = autoInventoryList.size();
    }
}