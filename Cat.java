public class Cat extends Animal
{
    private int numLives;

    public Cat(String name)
    {
        super(name, "feline");
        this.numLives = 9;
    }

    public int getnumLives()
    {
        return numLives;
    }

    public void matingCall()
    {
        System.out.println("meow");
    }
}