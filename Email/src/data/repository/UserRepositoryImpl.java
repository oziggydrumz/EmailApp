package data.repository;

import data.model.User;

import java.util.ArrayList;

public class UserRepositoryImpl implements UserRepository {
    ArrayList<User>users = new ArrayList<>();
    private int count;

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    @Override
    public long count() {
        return count;
    }
    @Override
    public User save(User user) {
        if (user.getUserId()==0){
            user.setUserId(generateNewId());
        users.add(user);
        count++;}
        return user;
    }




    private int generateNewId() {
        return count+1;
    }



    @Override
    public User findUserById(int id) {
        for (User user:users) {
            if (user.getUserId()==id)
                return user;
        }
        return null;
    }

    @Override
    public int deleteById(int id) {
        for (User user : users) {
            if (user.getUserId() == id) {
                users.remove(user);
                return count--;}}
    return id;
    }
    @Override
    public String saveUserByPassword(String password) {
        for (User user:users) {
            if(user.getPassword().equals(password)){
                return user.getPassword();
            }
        }
        return null;
    }

    @Override
    public void deleteAll() {
        users.clear();
        count = 0;
    }

    @Override
    public User findUserByPassword(String password) {
        return null;
    }

    @Override
    public void deleteUserByPassword(String password) {

    }

    public String findUserByEmailAddress(String emailAddress){
       for(User person : users) {
           if (person.getEmailAddress().equals(emailAddress)) {
               User foundPerson = person;
               return foundPerson.getPassword();
           }
       }
        return "";
    }
    public boolean emailAddressExist(String emailAddress){
        boolean existence = false;
        for(User person : users){
            if(person.getEmailAddress().equals(emailAddress)){
                return true;
            }
        }
        return true;
    }
}