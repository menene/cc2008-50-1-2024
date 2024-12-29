abstract class Pokemon {
    protected String name;
    protected int level;
    protected int hp;

    public Pokemon(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public void receiveDamage(int damage) {
        this.hp -= damage;
        System.out.println(name + " recibió " + damage + " puntos de daño.");
    }

    public abstract void displayInfo();
}
