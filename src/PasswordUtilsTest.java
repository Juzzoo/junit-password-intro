import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.Parameter;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
     // arrange
     String password = "hello";
    
     // act     

    String actual = PasswordUtils.describePasswordLength(password);
     // assert
    assertEquals("short", actual);
    }

    @Test
    void testDescribePasswordLengthExactlyMatch() {
     // arrange
     String password = "iiiiiiiiiiii";
    
     // act     

    String actual = PasswordUtils.describePasswordLength(password);
     // assert
    assertEquals("long", actual);
    }
@Test 
void testDescribepasswordLengthExtraLongPassword() {
     // arrange
     String password = "iiiiiiiiiiiiiiiasdiisadiasidiiiiiiiii";
    
     // act     
    String actual = PasswordUtils.describePasswordLength(password);
     // assert
    assertEquals("extra long", actual);
    
    }
    @Test
     void testcheckifthereisthreeRepeatedCharacters() {
     // arrange
     String password = "paaasword";
    
     // act
    boolean actual = PasswordUtils.isAlphanumeric(password);
    
    
    // assert  
    assertEquals(true, actual);

}


}
