abstract class Entity {
    private String name;
    private int hp;
    private boolean destroyed = false;

    protected boolean damage(int dhp) {
        hp -= dhp;
        if (hp < 0) {
            destroyed = true;
            System.out.println("Monster " + name + " was destroyed");
            return true;
        }
        return false;
    }

    public Entity(String name) {
        this.name = name;
    }

    public boolean isDestroyed() {
        return destroyed;
    }
} 