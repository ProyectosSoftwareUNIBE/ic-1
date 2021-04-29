import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class userTest {

    private user User;

    @Before


    public void before(){

        User =  new user("JUAN","pepe");
    }
    @Test
    public void metodoDevolver() {

        assertEquals("juan",this.User.metodoDevolver());
    }
    @Test
    public void metodoDevolver1(){
        assertEquals('J',this.User.MetodoDevolver1());
    }

}