import data.model.User;
import data.repository.UserRepository;
import data.repository.UserRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.security.krb5.internal.ccache.MemoryCredentialsCache;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplTest {
    private User user1 = new User();
    private User user = new User();
    private User user2=new User();
    private UserRepository repository;

    @BeforeEach
    public void setUP() {
        repository = new UserRepositoryImpl();
        user.setFirstName("osazee");
        user.setLastName("oboh");
        user.setPhoneNumber("09065639846");
        user.setEmailAddress("emailAddress");
        user.setPassword("password");


    }

        @Test
                public void saveOneUser_countISOneTest(){
        repository.save(user);
        assertEquals(1, repository.count());

    }
    @Test
    public void saveTwoUser_countIsTwoTest() {
        repository.save(user);
        repository.save(user1);
               // assertEquals(1,repository.count());
                assertEquals(2,repository.count());

    }
    @Test

    public void saveThreeUser_countIsThreeTest(){
        repository.save(user);
        repository.save(user1);
        repository.save(user2);
        assertEquals(3,repository.count());
    }






    @Test
    public void findUserById(){
        User object = repository.save(user1);
        User reffrenceHoldUser = repository.save(user);
        assertEquals(1,object.getUserId());
       // assertEquals(2,reffrenceHoldUser.getUserId());
     User foundUser =  repository.findUserById(2);
      assertEquals(reffrenceHoldUser,foundUser);
    }
    @Test
    public void saveUserById_deleteOneUser_countIsZeroTest() {
        User object = repository.save(user1);
        assertEquals(1, object.getUserId());
        assertEquals(1, repository.count());
        repository.deleteById(1);
        assertEquals(0, repository.count());






    }
    @Test
    public void saveUserById_deleteAllUser_countIsZeroTest(){repository.save(user);
       User osas = repository.save(user);
       User osas2 = repository.save(user1);
        User osas3 = repository.save(user2);
        assertEquals(3,repository.count());
        assertEquals(1,osas.getUserId());
        assertEquals(2,osas2.getUserId());
        assertEquals(3,osas3.getUserId());
        repository.deleteAll();
        assertEquals(0,repository.count());


    }


@Test
    public void SaveUserWithPassword(){
    User object=    repository.save(user1);
    object.setPassword("1234");
    assertEquals("1234",object.getPassword());
    assertEquals(1,repository.count());
//    user.setPassword("12345");
//    repository.saveUserByPassword();
//    assertEquals("12345",object.getPassword());
}
//@Test
   // public void saveUserById_deleteAllUser_countByZero(){
    //    User object=repository.save(user);
     //   repository.deleteAll();
      //  assertEquals(2,repository.count());
      //  assertEquals(2,);
}


//}