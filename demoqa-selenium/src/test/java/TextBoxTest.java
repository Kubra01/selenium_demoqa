import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextBoxTest extends BaseTest{

    @Test
    @DisplayName("Set full name")
    public void setFullNameTest(){
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.setUsername("Kübra Sağlam");
        assertEquals("Kübra Sağlam", textBoxPage.getUsername());
    }

    @Test
    @DisplayName("Set email with correct format")
    public void setEmailTest(){
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.setEmail("kubra123@gmail.com");
        assertEquals("kubra123@gmail.com", textBoxPage.getEmail());
    }

    @Test
    @DisplayName("Set address")
    public void setCurrentAddressTest(){
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.setCurrentAddress("Adana, Turkey");
        assertEquals("Adana, Turkey", textBoxPage.getCurrentAddress());
    }

}
