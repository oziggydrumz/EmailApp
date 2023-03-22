package data.repository;

import data.model.Email;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EmailRepositoryTest {
    private Email email;
    private Email email1 =new Email();
    private Email email2 =new Email();
    private EmailRepositoryImpl repository;




    @BeforeEach
    public void setUp(){
        repository = new EmailRepositoryImpl();
        email =new Email();
        email.setId(1);
        email.setBody("hey");
        email.setTittle("hot hot");


        email.setDateTime(LocalDateTime.MAX);
        email.setUserName("");
    }




    @Test
    public void saveMail() {
        repository.save(email);
        assertEquals(1,repository.count());

    }

    @Test
    public void receivingMail() {
    }

    @Test
    public void findMailById() {
    }

    @Test
    public void deleteMailById() {
    }

    @Test
    public void findMailByUserName() {
    }
}