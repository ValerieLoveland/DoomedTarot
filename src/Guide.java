

public abstract class Guide {
    private String guideTalk;


    public Guide(String guideTalk) {
        this.guideTalk = guideTalk;
    }

    public String getGuideTalk(){
        return this.guideTalk;
    }


    public abstract String guideTalk();
}