package SuperCar;

public class SuperCar {
    private String ownerName,colour,brand;
    private int price;
    private static int countInstance;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static SuperCar getCountInstance() {
        if (SuperCar.countInstance == 0) {
            SuperCar.countInstance++;
            return new SuperCar();
        }
        return null;
    }
}
