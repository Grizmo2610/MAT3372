package Iterator.ex2;

public class Facebook extends Profile implements SocialNetwork {

    @Override
    public ProfileIterator createFriendsIterator(Profile profile) {
        return new FacebookIterator();
    }

    @Override
    public ProfileIterator createCoworkersIterator(Profile profile) {
        return new FacebookIterator();
    }

    @Override
    public Profile getNext() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
