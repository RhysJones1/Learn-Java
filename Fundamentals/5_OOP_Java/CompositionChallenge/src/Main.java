public class Main {
    public static void main(String[] args){
        Size size = new Size(20, 40, 1);

        Sofa sofa = new Sofa("Not Leather", "Oyster", size, 3);

        Television television = new Television("Samsung", 50);

        Table table = new Table("Wood", size);

        LivingRoom livingRoom = new LivingRoom(sofa, television, table);
        livingRoom.chillOut();
    }
}
