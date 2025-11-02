public class Name7 {
    private String brand;
    private String model;
    private double price;
    private int storageGB;
   

    public Name7(String brand, String model, double price, int storageGB) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.storageGB = storageGB;
       
    }

  
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getPrice() { return price; }
    public int getStorageGB() { return storageGB; }
    

   
    public void setPrice(double price) {
         this.storageGB = storageGB;
    }

    public void displayInfo() {
        System.out.println(brand + " " + model);
        System.out.println("Price: $" + price);
        System.out.println("Storage: " + storageGB + "GB");
        
    }




    public static void main(String[] args) {
        Name7 phone = new Name7("Samsung", "Galaxy S23", 999.99, 256);
        phone.displayInfo();
        
        phone.setPrice(899.99);
        System.out.println("\nAfter update:");
        phone.displayInfo();
    }
}