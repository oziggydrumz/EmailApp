package Dtos;

public class EmailRequest {
    private String receiversEmailAddress, title, body, to, from;

    public String getReceiversEmailAddress() {
        return receiversEmailAddress;
    }

    public void setReceiversEmailAddress(String receiversEmailAddress) {
        receiversEmailAddress = receiversEmailAddress;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
