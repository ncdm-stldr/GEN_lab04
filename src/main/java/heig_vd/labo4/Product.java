package heig_vd.labo4;

public class    Product {
    public static final int SIZE_NOT_APPLICABLE = -1;
    private String code;
    private Color color;
    private Size size;
    private double price;
    private String currency;

    public Product(String code, Color color, int size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = new Size(size);
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public Color getColor() {
        return color;
    }

    public int getSize() {
        return size.sizeToInt();
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
}