package data.repository;

import data.model.Email;

public interface EmailRepository {


    Email save(Email email);

    long count();
    Email findMailById(int id);
    void deleteMailById(int id);
    Email findMailByUserName(String userName);


}
