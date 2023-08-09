package Iterator.ex2;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private Profile profile;
    private int currentPosition;
    private Profile[] cache;

    @Override
    public Profile getNext() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
