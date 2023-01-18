public class Zombie extends Monster {
    public final static String scream = "Raaaauuughhhh";
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

