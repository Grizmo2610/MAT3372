package decorator.ex3;

public class CompressionDecorator extends DataDataSource {
    public CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    public void writeData(DataSource data) {
        wrappee.writeData(data);
    }

    public DataSource readData() {
        return wrappee.readData();
    }
}
