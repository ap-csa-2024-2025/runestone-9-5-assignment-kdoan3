public class Animal
{
    private String name;
    private String species

    public Animal(String name, String species)
    {
        this.name = name;
        this.species = species;
    }

    public Animal()
    {
        this("Mark", "Penguin"); // this(null, null)
    }

    public void matingCall()
    {
        System.out.println("generic sound");
    }
}