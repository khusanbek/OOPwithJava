public class Dish {

    private String brand;
    private String substance;

    public Dish() {
        brand = "";
        substance = "";
    }

    public Dish(String b, String s) {
        brand = b;
        substance = s;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String b) {
        brand = b;
    }

    public String getSubstance() {
        return substance;
    }

    public void setSubstance(String s) {
        substance = s;
    }

    @Override
    public String toString() {
        return String.format("(%s-%s)", getBrand(), getSubstance());
    }
}
