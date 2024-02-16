//Auto che abbia come proprietà cilindrata, targa, marca e modello.
public class Car {
    private int displacement;

    private String plate;

    private String brand;

    private String model;

    public Car(int displacement, String plate, String brand, String model) {
        this.displacement = displacement;
        this.plate = plate;
        this.brand = brand;
        this.model = model;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getPlate() {
        return plate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Car{" +
                "displacement=" + displacement +
                ", plate=" + plate +
                ", brand=" + brand +
                ", model=" + model +
                '}';
    }
}
