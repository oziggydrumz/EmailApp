package service;

import Dtos.EmailRequest;
import data.model.Email;
import data.model.User;
import data.repository.UserRepository;

import java.time.LocalDateTime;

public class MailService {

    UserRepository userRepository;

    public void sendMail(EmailRequest emailRequest){
        if(userRepository.emailAddressExist(emailRequest.getReceiversEmailAddress())){
           Email email = new Email(
                  emailRequest.getTitle(),
                   emailRequest.getBody(),
                   emailRequest.getFrom(),
                  emailRequest.getTo()
           );


            for(User user : userRepository.getUsers()){
                if(emailRequest.getTo().equals(user.getEmailAddress())){
                    User receiver = user;
                   receiver.getReceivedMails().add(email);
                }
            }

        }
        else{
            System.out.println("Email not found");
        }
    }
}
