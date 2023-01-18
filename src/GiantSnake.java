public class GiantSnake extends Monster {
    public final static String scream = "Ssssss";
    //Fix this class
    public GiantSnake(String name) {
        super(name + " the Zombie", 5);
    }

    public void growl(){
        System.out.println(scream);
    }

    @Override
    public void attack(Monster monster) {
        growl();
    }
}