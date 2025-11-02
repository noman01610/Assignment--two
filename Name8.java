public class Name8
{
    private String name;
    private int age;
    private String country;

    public void setName(String name) 
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setCountry(String country) 
    {
        this.country = country;
    }
    public String getName()
    {
        return name;
    }
    public int getAge() 
    {
        return age;
    }
    public String getCountry() 
    {
        return country;
    }


    public static void main(String[] args)
    {
        Name8 person = new Name8();
        person.setName("Abu Noman");
        person.setAge(25);
        person.setCountry("Pakistan");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());
    }
}