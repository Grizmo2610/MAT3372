package decorator.ex3;

public class EncryptionDecorator extends DataDataSource {

    public EncryptionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    public void writeData(DataSource data) {
        wrappee.writeData(data);
    }

    public DataSource readData() {
        return wrappee.readData();
    }
}
