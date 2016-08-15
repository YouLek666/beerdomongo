package it.morfoza.beerdomongo;

/**
 * Created by widzew on 2016-08-12.
 */
public class SingleUserSession implements UserSession {

    private User user;
    @Override
    public User getCurrentUser() {
        return user;
    }

    @Override
    public void setCurrentUser(User user) {
        this.user = user;

    }
}
