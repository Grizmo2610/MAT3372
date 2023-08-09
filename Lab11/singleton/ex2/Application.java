package singleton.ex2;

public class Application {
    public static void main(String[] args) {
        DataBase foo = DataBase.getInstance();
        foo.query("SELECT * FROM CSDL");
    }
}
