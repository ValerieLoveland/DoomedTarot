import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class AboutTextTest {

    @Test
    //given
    public void shouldShowAboutText(){
        //given
        AboutText aboutTextMain = new AboutText();



        //when
        String result = aboutTextMain.biography();


        //then

        assertEquals(aboutTextMain.biography(), result);

    }}