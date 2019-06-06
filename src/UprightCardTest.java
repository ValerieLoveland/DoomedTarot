import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class UprightCardTest {

    @Test
    //given
    public void shouldShowCard(){
        //given
        UprightCard uprightCardMain = new UprightCard();

        //when
        String result = uprightCardMain.name;

        //then

        assertEquals(uprightCardMain.name, result);

//This is testing Tower
        //given
        UprightCard.UprightTower uprightCardMain1 = new UprightCard.UprightTower();

        //when
        String result1 = uprightCardMain1.name;

        //then

        assertEquals (uprightCardMain1.name, result1);

    }


}
