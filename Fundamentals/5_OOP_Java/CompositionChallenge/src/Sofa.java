public class Sofa {
    private String fabric;
    private String colour;
    private Size size;
    private int numberOfSeats;

    public Sofa(String fabric, String colour, Size size, int numberOfSeats) {
        this.fabric = fabric;
        this.colour = colour;
        this.size = size;
        this.numberOfSeats = numberOfSeats;
    }

    public void sitting(String sittingOrStanding){
        System.out.println("I'm " + sittingOrStanding);
    }

    public String getFabric() {
        return fabric;
    }

    public String getColour() {
        return colour;
    }

    public Size getSize() {
        return size;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
