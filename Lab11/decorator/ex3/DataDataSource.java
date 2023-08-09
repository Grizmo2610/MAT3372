package decorator.ex3;

public class DataDataSource implements DataSource {
    protected DataSource wrappee;

    public DataDataSource(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void writeData(DataSource data) {
        wrappee.writeData(data);
    }

    @Override
    public DataSource readData() {
        return wrappee.readData();
    }
}
