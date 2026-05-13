public class Car {

    private final String model; // final adds an extra security
    private String color;
    private int price;
    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    int getPrice(){
        return this.price;
    }

    void setColor(String color){
        this.color = color;
    }
    void setPrice(int price){
        this.price = price;
    }
}
