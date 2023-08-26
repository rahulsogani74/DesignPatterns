package BuilderDesign;

public class Main {
    public static void main(String[] args) {
       User user= new User.userBuilder().setEmailId("raj@gmail.com").setUserId("User123").setUserName("Raj").build();
        System.out.println(user);

        User user2= new User.userBuilder().setEmailId("ajay@gmail.com").setUserId("User3223").setUserName("Ajay").build();
        System.out.println(user2);

    }
}
