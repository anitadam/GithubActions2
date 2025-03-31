import calculator.User;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UserTest {


    @Test
    public void testUsername ()
    {
        User newUser = new User ("Anita", "Password");


        String expected = "Anita";
        String actual = newUser.getUserName();
        assertEquals(expected,actual);



    }


    @Test
    public void testPassword ()
    {
        User newUser = new User ("Username", "password1234");


        String expected = "password1234";
        String actual = newUser.getPassword();
        assertEquals(expected,actual);



    }

    @Test
    public void changeUsername ()
    {
        User newUser = new User ("Username", "password1234");

        newUser.setUserName("Anita");
        String expected = "Anita";
        String actual = newUser.getUserName();
        assertEquals(expected,actual);



    }

    @Test
    public void changePassword ()
    {
        User newUser = new User ("Username", "password1234");

        newUser.setPassword("Anita1234");
        String expected = "Anita1234";
        String actual = newUser.getPassword();
        assertEquals(expected,actual);



    }
}
