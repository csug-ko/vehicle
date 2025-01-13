import java.util.Scanner;

public class AutomobileSetters {
    public static void setAutoYear(Automobile auto, int year) { 
        auto.autoYear = year;
        System.out.println("Success");
    }

    public static void setAutoMake(Automobile auto, String make) { 
        auto.autoMake = make;
        System.out.println("Success");
    }

    public static void setAutoModel(Automobile auto, String model) { 
        auto.autoModel = model;
        System.out.println("Success");
    }

    public static void setAutoColor(Automobile auto, String color) { 
        auto.autoColor = color;
        System.out.println("Success");
    }

    public static void setIsClean(Automobile auto, boolean clean) { 
        auto.isClean = clean;
        System.out.println("Success");
    }

    public static void setAutoID(Automobile auto) { 
        auto.autoID = Automobile.totalCount + 1000;
        System.out.println("Success");
    }

    public static void setOnSale(Automobile auto, boolean sale) {
        auto.onSale = sale;
        if (sale) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the display sale price?");
            double salePrice = scanner.nextDouble();
            scanner.close();
            setAutoSalePrice(auto, salePrice);
            System.out.println("Success");
        }
    }

    public static void setAutoListedPrice(Automobile auto, double listPrice) { 
        auto.autoListedPrice = listPrice;
        System.out.println("Success");
    }

    public static void setAutoSalePrice(Automobile auto, double salePrice) {
        auto.autoSalePrice = salePrice;
        setAutoDiscountedAmount(auto, auto.autoListedPrice - salePrice);
        System.out.println("Success");
    }

    public static void setAutoDiscountedAmount(Automobile auto, double discountedAmount) { 
        auto.autoDiscountedAmount = discountedAmount;
        System.out.println("Success");
    }
}