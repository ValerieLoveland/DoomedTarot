import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class GuideIntroTest {

        @Test
        //given
        public void shouldShowGuide(){
            //given
            GuideIntro guideMain = new GuideIntro();

            //when
            String result = guideMain.guideTalk();

            //then

            assertEquals(guideMain.guideTalk(), result);




        //given
            GuideIntro.GuideTalk3 guideMain1 = new GuideIntro.GuideTalk3();

        //when
        String result1 = guideMain.guideTalk();

        //then

        assertEquals(guideMain.guideTalk(), result1);

    }


}

