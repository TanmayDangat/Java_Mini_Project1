class User{
    private String name;
    private String email;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void sendMail(){
        String subject = "Welcome on board";
        String body = "Hii " + this.getName() + "\n" + "Thankyou for registering with us. We're excited to have you on board. \n\n" + "Best regards, \nThe team.";
        
        System.out.println("Email sent to : " + this.getEmail());
        System.out.println("Subject : " + subject);
        System.out.println("Body : ");
        System.out.println(body);
    }
}

public class SendEmailMain{
    public static void main(String args[]){
        User user = new User("Rahul Patil", "rahul@gmail.com");
        user.sendMail();
    }
}