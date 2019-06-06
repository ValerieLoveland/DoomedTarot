public class GuideIntro extends Guide{
    public GuideIntro(){
        super("guide intro");
    }

    public GuideIntro(String guidetalk2) {
        super(guidetalk2);
    }

    @Override
    public String guideTalk(){//constructor
        return "Text about Peggy";
    }


    public static class GuideTalk2 extends GuideIntro {
        public GuideTalk2(){
            super("Peggy: Hi I'm Peggy, I will guide you through using the app. I've been working with tarot cards for years. Remember, I am only a guide, you and the cards do all the work!");
        }
    }

    public static class GuideTalk3 extends GuideIntro {
        public GuideTalk3(){
            super("Peggy: I've been thinking about getting into crystals.");
        }
    }

}