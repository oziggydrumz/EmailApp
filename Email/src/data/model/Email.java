package data.model;

import java.time.LocalDateTime;

public class Email {

    private int id;
    private String userName, title, body, from, to;
    private LocalDateTime localDateTime = LocalDateTime.now();


    //public Email(String title, String body, String from, String to, LocalDateTime now) {
   //  }


    public Email(String title, String body, String from, String to) {
        this.title = title;
        this.body = body;
        this.from = from;
        this.to = to;


    }

    public Email() {

    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    private LocalDateTime dateTime=LocalDateTime.now();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTittle() {
        return title;
    }

    public void setTittle(String tittle) {
        this.title = tittle;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
  @Override
   public String toString() {
       return "Mail{" +
               "id=" + id +
                ", userName='" + userName + '\'' +
             ", tittle='" + title + '\'' +
               ", body='" + body + '\'' +
               ", dateTime=" + dateTime +
               '}';
  }
}
