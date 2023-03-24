package service;

import Dtos.LoginRequest;
import Dtos.RegistrationRequest;
import data.model.User;
import data.repository.UserRepository;

public class UserServiceImpl implements UserServices {
UserRepository userRepository;

    public void register(RegistrationRequest registrationRequest){
//       User user = new User(
//                registrationRequest.getId(),
//              registrationRequest.getFirstName(),
//                registrationRequest.getLastName(),
//               registrationRequest.getPhoneNumber(),
//               registrationRequest.getEmailAddress(),
//               registrationRequest.getPassword());
     //  userRepository.save(user);
    }

    public void login(LoginRequest loginRequest){
        if (userRepository.findUserByEmailAddress(loginRequest.getEmailAddress())
                        .equals(loginRequest.getPassword())){
            System.out.println("Login Successful");
        }
        else {
            throw new IllegalArgumentException("Invalid Login Credentials");
        }
    }
}
