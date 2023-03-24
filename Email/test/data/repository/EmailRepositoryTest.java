package data.repository;

import data.model.Email;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EmailRepositoryTest {
    private Email email;

    private EmailRepositoryImpl repository;




    @BeforeEach
    public void setUp(){
        repository = new EmailRepositoryImpl();
        email =new Email();
        email.setId(1);
        email.setBody("hey");
        email.setTittle("hot hot");
        email.setUserName("oziggydrumz");

        email.setDateTime(LocalDateTime.MAX);
        email.setUserName("");
    }




    @Test
    public void saveMail() {
        repository.save(email);
        assertEquals(1,repository.count());

    }



    @Test
    public void findMailById() {
     Email  osazee=repository.save(email);
     assertEquals(1,osazee.getId());
     Email foundEmail=repository.findMailById(1);
     assertEquals(osazee,foundEmail);

    }

    @Test
    public void deleteMailById() {
    Email email1=    repository.save(email);
        assertEquals(1,email1.getId());
        assertEquals(1,repository.count());
        repository.deleteMailById(3);
        assertEquals(0,repository.count());

    }

    @Test
   public void findMailByUserName() {
     Email osazee=   repository.save(email);
     //   assertEquals(1,repository.count());
      //  assertEquals("oziggydrumz",repository.findMailByUserName(osazee.getUserName()));
       // assertEquals(1,repository.count());
      //  Email foundMail = repository.findMailByUserName(osazee.getUserName());
       // assertEquals(osazee,foundMail);
   }
    @Test
    public void saveEmailById_deleteAll_countIsZeroTest(){
    }
}