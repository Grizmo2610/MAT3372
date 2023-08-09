package decorator.ex3;

public interface DataSource {
    void writeData(DataSource data);

    DataSource readData();
}
