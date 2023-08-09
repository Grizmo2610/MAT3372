package Iterator.ex2;

public interface SocialNetwork extends ProfileIterator{
    ProfileIterator createFriendsIterator(Profile profile);
    ProfileIterator createCoworkersIterator(Profile profile);
}
