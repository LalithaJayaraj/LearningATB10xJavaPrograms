package ex_23_OopsConcept_Encapsulation;

import java.util.Scanner;

public class Lab_117_EncapsulationVWOlogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VWOLoginPage vwo1 = new VWOLoginPage("admin", "pswd@123");
        System.out.println("Not secure login");
        System.out.println(vwo1.username);// This object can get the username and password from the class
        System.out.println(vwo1.password);// which is not secure as anyone can alter them.
        System.out.println("------------------");
        SecureVWOLogin vwo2 = new SecureVWOLogin("admin","pswd@123");
        // System.out.println(vwo2.username); This does not allow as the username and password is private.
        // to use / modify the private attributes we need help of methods(getter and setter).
        //By this we the attributes are secured from modifying by outside. This is called Encapsulation.
        System.out.println("Are you admin? Type true else False");
        Boolean admin = sc.nextBoolean();
        System.out.println(vwo2.getUsername());
        System.out.println(vwo2.getPassword(admin));
        vwo2.setUsername("admin1",admin);
        vwo2.setPassword("pswd@345",admin);


    }
}

// not safe
class VWOLoginPage{
    String username; // by default the access specifier is "public"
    public String password; // mentioned the access specifier to know that it is public. if not by default it is public only.

    public VWOLoginPage(String user, String pwd) {
        this.username = user;
        this.password = pwd;
    }


}
// Securing using Encapsulation
 class SecureVWOLogin{
    private String username;
    private String password;

    SecureVWOLogin(String usrc,String pswdc){
        this.username = usrc;
        this.password = pswdc;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username, Boolean admin) {

        if(admin){
        this.username = username;
            System.out.println("Your username has been changed to"+this.username);
        }
        else{
            System.out.println("Only admins can change the username");
        }
    }

    public String getPassword(Boolean admin) {
        if(admin) {
            return password;
        }
        else{
            System.out.println("you are not an admin");
            return null;
        }
    }

    public void setPassword(String password, Boolean admin) {
        if(admin){
            this.password = password;
            System.out.println("Your password has been changed to "+ this.password);
        }
        else{
            System.out.println("Only admins can change the username");
        }
    }
}
