package data.repository;

import data.model.User;

import java.util.ArrayList;

public interface UserRepository {

    long count();

    User save(User user);
    String findUserByEmailAddress(String emailAddress);
    boolean emailAddressExist(String emailAddress);

    User findUserById(int id);
    ArrayList<User> getUsers();

    int deleteById(int id);







    String saveUserByPassword(String password);

    void deleteAll();
    User findUserByPassword(String password);
    void deleteUserByPassword(String password);
}
