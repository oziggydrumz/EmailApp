package data.repository;

import data.model.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailRepositoryImpl implements EmailRepository {
    private List<Email> mails=new ArrayList<>();

    private int count;
    @Override
    public Email save(Email email){
        if(email.getId()==0);
        email.setId(generateNewId());
        mails.add(email);
        count++;
        return email;
    }

    public int generateNewId() {
        return count + 1;
    }

    @Override
    public long count(){
        return count;
    }




    @Override
    public Email findMailById(int id) {
        for (Email email:mails) {
            if (email.getId() == id)
        return email;
        }
        return null;
    }

    @Override
    public void deleteMailById(int id) {
        for (Email email:mails) {
            if (email.getId()==id)
            mails.remove(email);
            count--;
        }
    }

    @Override
    public Email findMailByUserName(String userName) {
        for (Email email:mails) {
            if (email.getUserName().equals(userName))
            return email;
        }
        return null;
    }
}
