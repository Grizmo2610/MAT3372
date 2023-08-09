package exercisesoncomposition.authorandbook;

public class BookAdvanced {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public BookAdvanced(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    @Override
    public String toString(){
        String bookString = "Book[name=" + name + ",authors={";
        for (Author author: authors)
            bookString += author;
        bookString += "}price=" + price + ",qty=" + qty +"]";
        return bookString;
    }

    public String getAuthorsNames(){
        String authorNames = "";
        for (int i = 0; i < authors.length; i++){
            authorNames += authors[i].getName();
            if (i < authorNames.length() - 1)
                authorNames += ", ";
        }
        return authorNames;
    }
}
