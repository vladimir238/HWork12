public class ZipHolod {
    private String name;
    private String manufacturer;
    private Integer price;
    private boolean аvailability;

    public ZipHolod(String name, String manufacturer, int price, boolean аvailability) {
        if (name==null|| manufacturer==null){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.аvailability = аvailability;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public boolean isАvailability() {
        return аvailability;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setАvailability(boolean аvailability) {
        this.аvailability = аvailability;
    }

    public String toString() {
        return "Наименование " + name  + "  Производитель " + manufacturer +
                " Номер " + price + " Наличие " + аvailability;
    }
}
