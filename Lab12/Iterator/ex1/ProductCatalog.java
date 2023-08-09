package Iterator.ex1;

public class ProductCatalog implements Iterable {
    private String[] productCatalog;

    @Override
    public Iterator getIterator() {
        return new ProductIterator();
    }
}
