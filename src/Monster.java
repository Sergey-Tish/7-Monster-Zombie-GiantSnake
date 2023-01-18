abstract class Monster {
    //Fix this class
    private String name;
    private int force;
    boolean alive = true;
    private int hp = 15;
    private boolean destroyed = false;

    public Monster(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    abstract public void attack(Monster monster);

    protected boolean damage(int dhp) {
        hp -= dhp;
        alive = !(hp <= 0);
        return hp <= 0;
    }

    public boolean isDestroyed() {
        return !alive;
    }

    protected int getForce() {
        return force;
    }
}
