public class Name1
{
    private String bookName;
    private String authorName;
    private double price;

    public Name1(String title, String author, double price) 
    {
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }
    public String getBookName() 
    { 
        return bookName;
    }
    public void setTitle(String title)
    {
        this.bookName = bookName;
    }
    public String getAuthorName() 
    { 
        return authorName;
    }
    public void setAuthorName(String authorName)
    { 
        this.authorName = authorName;
    }
    public double getPrice() 
    { 
        return price;
    }
    public void setPrice(double price) 
    { 
        this.price = price; 
    }
    public void applyDiscount(double percentage)
    {
        price = price - (price * (percentage / 100));
        System.out.println("Discount applied: " + percentage + "%");
        System.out.println("New Price: " + price);
    }

    public static void main(String[] args)
    {
        Name1 n1 = new Name1("Java Programming", "James Gosling", 1000);

        System.out.println
        (
            "BookName: " + n1.getBookName() +
            "\nAuthor: " + n1.getAuthorName() +
            "\nPrice: " + n1.getPrice()
        );

        n1.applyDiscount(10); 
    }
}