class Gyarados extends Pokemon implements IWaterAttack, IFlyingAttack {

    public Gyarados(String name, int level, int hp) {
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
    public void aerialAce() {
        System.out.println(name + " usa Aereal Ace!");
    }

    @Override
    public void hurricane() {
        System.out.println(name + " usa Huracane!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Soy " + name + ", un Pokémon de tipo agua, nivel " + level + ", HP: " + hp);
    }
}
