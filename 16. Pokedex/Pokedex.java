class Pokedex
{
    public static void main(String[] args)
    {
        Pokemon squirtle = new Squirtle("Squrtle", 100, 100);
        squirtle.displayInfo();
        ((Squirtle) squirtle).surf();
        squirtle.receiveDamage(30);

        System.out.println();

        Pokemon gyarados = new Gyarados("Gyarados", 200, 200);
        gyarados.displayInfo();
        ((Gyarados) gyarados).hydroPump();
        ((Gyarados) gyarados).hurricane();
        gyarados.receiveDamage(30);
    }
}