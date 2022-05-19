public class Table {
    private String material;
    private Size size;

    public Table(String material, Size size) {
        this.material = material;
        this.size = size;
    }

    public void tableCleaned(boolean isClean){
        System.out.println("Table is clean = " + isClean);
    }

    public String getMaterial() {
        return material;
    }

    public Size getSize() {
        return size;
    }
}
