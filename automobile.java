import java.util.List;
import java.util.Scanner;

class Automobile
{                                        //open class
                                        // declarations
public int autoYear;                               //
public int autoID = 0;                            //
public String autoMake;                            //
public String autoModel;                          //
public String autoColor;                           //
public boolean isClean;                           //
public boolean onSale;                            //
public double autoListedPrice;                   //
public double autoSalePrice;                      //
public double autoDiscountedAmount;              //
public int autoCounter = 0;                       //
public int totalCount=0;                         //
public ArrayList <Automobile> autoInventoryList  
= new ArrayList<>;                    //  
                                               // FIXME add mileage assign, set, get ******FIXME******


                                                  //*******************************     //setters
                                          
public void setAutoYear(int year){this.autoYear=year;}
public void setAutoMake(String make){this.autoMake=make;}
public void setAutoModel(String model){this.autoModel=model;}
public void setAutoColor(String color){this.autoColor=color;}
public void setIsClean(boolean clean){this.isClean=clean;}
public void setOnSale(boolean sale){this.onSale=sale;if(sale=true){Scanner scanner = new Scanner(System.in);System.out.println("What is the display sale price?");int sale = scanner.nextInt();setAutoSalePrice(sale);}
public void setAutoListedPrice(double listPrice){this.autoListedPrice=listPrice;}
public void setAutoSalePrice(double salePrice){this.autoSalePrice=salePrice;setAutoDiscountedAmount(autoListedPrice-salePrice);}
public void setAutoDiscountedAmount(double discountedAmount){this.autoDiscountedAmount=discountedAmount;}
public void printResults(Automobile obj)
{try{System.out.println("Auto ID: "+self.autoID+"\nAuto Make: "+self.autoMake+"\nAuto Model: "+self.autoModel+"\nAuto Color: "+self.autoColor+"\nAuto Year: "+self.autoYear)
if(self.onSale==true;){System.out.println("Auto Listing Price: "+self.autoSalePrice)}
else{System.out.println("Auto Listing Price: "+self.autoListedPrice+"\n")}}
catch( Exception e){System.out.println("No automobile found here" + e.Message());}

   // ********************************************************************************   //getters
public int getAutoYear(){return this.autoYear;}
public String getAutoMake(){return this.autoMake;}
public String getAutoModel(){return this.autoModel;}
public String getAutoColor(){return this.autoColor;}
public boolean getIsClean(){return this.isClean;}
public boolean getOnSale(){return this.onSale;}
public double getAutoListedPrice(){return this.autoListedPrice;}
public double getAutoSalePrice(){return this.autoSalePrice}
public double getAutoDiscountedAmount(){return this.autoDiscountedAmount;}
public int getAutoID(){return this.autoID;}

 //************************************************************************* //remove vehicle function
public void removeAuto(int ID)
{int indexRemoval;
for(Automobile i:autoInventory)
{if(ID==i.getAutoID()){indexRemoval = ID-1001;autoInventory.remove(indexRemoval); 
for(Automobile a: autoInventory){
if(a.getAutoID == 1000){
try {int myIndex = autoInventory.indexOf(a);
for(myIndex;myIndex<autoInventory.size();myIndex++){autoInventory.get(myIndex)=autoInventory.get(myIndex+1);}}
catch (ArrayIndexOutOfBoundsException e)
{System.out.println("Caught ArrayIndexOutOfBoundsException: "+ e.getMessage());}}}}}}

      //   ****** ***********************************************************      // default contructor
public static Automobile auto()
{
++autoCounter;
++totalCount;
this.autoYear = 9999;
this.autoID=autoCounter+1000;
this.autoMake = "unknown";
this.autoModel = "unknown";
this.autoColor = "unknown";
this.isClean = false;
this.onSale = false;
this.autoListedPrice = -1.00;
this.autoSalePrice = 0.00;
this.autoDiscountedAmount = 0.00;
} //*********************************************************************// fully entered constructor                                          
public static Automobile auto(autoID,autoMake,
autoModel,autoYear,autoColor,autoListedPrice,
isClean,onSale);
{
++totalCount;
++autoCounter;
this.autoID = totalCount+1000;
this.autoYear = autoYear;
this.autoMake = autoMake; 
this.autoModel = autoModel;
this.autoColor = autoColor;
this.autoListedPrice = autoListedPrice;
this.isClean = isClean;
this.onSale = onSale;
}
//*******************************************************************************// main function

public static void main(String [] args)
{ArrayList<Automobile> autoInventory = new ArrayList<>;
autoInventory.add(new Automobile(1,"Chevrolet","Bolt",2017,"silver",12,999.99,false,false);
autoInventory.add(new Automobile(2,"Chevrolet","Bolt",2018,"gray",13,999.99,false,false);}
} // close of class


\\***  // toString Method
    @Override
    public String toString() {
        return "Automobile{" +
                "Make='" + make + '\'' +
                ", Model='" + model + '\'' +
                ", Year=" + year +
                ", VIN='" + vin + '\'' +
                ", Price=" + price +
                ", Mileage=" + mileage +
                ", Status='" + status + '\'' +
                '}';**\\