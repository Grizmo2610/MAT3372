package decorator.ex3;

public class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(DataSource data) {

    }

    @Override
    public DataSource readData() {
        return null;
    }
}
