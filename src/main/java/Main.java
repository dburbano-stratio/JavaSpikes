public class Main {

    public static void main(String[] args) {
        System.out.println("Sending email...");
        new EmailService("smtp.gmail.com", 465, "dburbano@stratio.com", "");
        System.out.println("Finish sending email...");
    }

}
