class Squirtle extends Pokemon implements IWaterAttack {

    public Squirtle(String name, int level, int hp) {
        super(name, level, hp);
    }

    @Override
    public void hydroPump() {
        System.out.println(name + " usa Hydro Pump!");
    }

    @Override
    public void surf() {
        System.out.println(name + " usa Surf!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Soy " + name + ", un Pokémon de tipo agua, nivel " + level + ", HP: " + hp);
    }
}
