public class Zombie extends Monster {
    public final static String scream = "Raaaauuughhhh";
    //Fix this class
    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    public void growl(){
        System.out.println(scream);
    }

    @Override
    public void attack(Monster monster){
        monster.damage(getForce());
        growl();
    }
}

