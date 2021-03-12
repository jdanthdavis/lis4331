public class Product {

    private String code;
    private String desc;
    private double price;

    public Product() {
        code = "abc123";
        price = 49.99;
        desc = "My Widget";
    }
    
    public Product (String code, String desc, double price) {

        System.out.println("\nBelow are user-entered values: ");
        this.code = code;
        this.desc = desc;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String cde) {
        code = cde;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String dsc) {
        desc = dsc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double pce) {
        price = pce;
    }

    public void print() {
        System.out.println("Below using setter methods to pass literal values, then print() method to display values: ");
        System.out.println("\nCode: " + code + " Description: " + desc + " Price: " + price);
    }
}