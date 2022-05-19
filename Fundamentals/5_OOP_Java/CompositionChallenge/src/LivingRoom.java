public class LivingRoom {
    private Sofa sofa;
    private Television television;
    private Table table;

    public LivingRoom(Sofa sofa, Television television, Table table) {
        this.sofa = sofa;
        this.television = television;
        this.table = table;
    }

    public void chillOut(){
        enterLivingRoom();
        sofa.sitting("sitting down with my feet up");
        television.tvStatus("on");
        orderTakeAway("Pizza");
    }

    private void enterLivingRoom(){
        System.out.println("Time to chill out");
    }

    private void orderTakeAway(String food){
        System.out.println(food + " ordered");
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Television getTelevision() {
        return television;
    }

    public Table getTable() {
        return table;
    }
}
