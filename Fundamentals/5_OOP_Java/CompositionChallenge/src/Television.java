public class Television {
    private String brand;
    private int size;

    public Television(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public void tvStatus(String status){
        System.out.println("TV is " + status);
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }
}