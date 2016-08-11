package it.morfoza.beerdomongo;

public interface UserSession {
    User getCurrentUser();

    void setCurrentUser(User user);
}
