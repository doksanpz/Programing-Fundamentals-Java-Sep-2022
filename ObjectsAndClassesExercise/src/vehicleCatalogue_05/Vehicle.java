package vehicleCatalogue_05;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int hp;


    public Vehicle (String type, String model, String color, int hp) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.hp = hp;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        String formatType = "";
        if (this.type.equals("car")) {
            formatType = "Car";
        } else if (this.type.equals("truck")) {
            formatType = "Truck";
        }
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", formatType, this.model, this.color, this.hp);
    }
}
