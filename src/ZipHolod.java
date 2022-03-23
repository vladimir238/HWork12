public class ZipHolod {
    private String name;
    private String manufacturer;
    private int prodnumb;
    private boolean аvailability;

    public ZipHolod(String name, String manufacturer, int prodnumb, boolean аvailability) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.prodnumb = prodnumb;
        this.аvailability = аvailability;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getProdnumb() {
        return prodnumb;
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

    public void setProdnumb(int prodnumb) {
        this.prodnumb = prodnumb;
    }

    public void setАvailability(boolean аvailability) {
        this.аvailability = аvailability;
    }

    public String toString() {
        return "Наименование " + name  + "  Производитель " + manufacturer +
                " Номер " + prodnumb + " Наличие " + аvailability;
    }
}
