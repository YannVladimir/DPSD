// Book.java

import java.util.Random;

public class Book {
    // Fields
    private String title;
    private String author;
    private Genre genre;
    private double price;
    private int quantityInStock;

    // Default constructor
    public Book() {
        // Randomly determine book details
        Random random = new Random();
        title = "Random Book Title";
        author = "Random Author";
        genre = Genre.values()[random.nextInt(Genre.values().length)];
        price = random.nextDouble() * 50.0; // Random price between 0 and 50
        quantityInStock = random.nextInt(100) + 1; // Random quantity between 1 and 100
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    // Add other methods, setters if needed
}
