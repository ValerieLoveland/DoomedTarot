public class GuideIntro extends Guide{
    public GuideIntro(){
        super("guide intro");
    }

    public GuideIntro(String guidetalk2) {
        super(guidetalk2);
    }

    @Override
    public String guideTalk(){//constructor
        return "Valerie Loveland is a Computer Science student and tarot card enthusiast. This is her first tarot app. ";
    }


    public static class GuideTalk2 extends GuideIntro {
        public GuideTalk2(){
            super("Guidetalk 2 test");
        }
    }

    public static class GuideTalk3 extends GuideIntro {
        public GuideTalk3(){
            super("Guidetalk 3 test");
        }
    }

}