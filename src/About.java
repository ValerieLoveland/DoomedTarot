public abstract class About {
    private String biography;


    public About(String biography) {
        this.biography = biography;
    }

    public String getBiography(){
        return this.biography;
    }


    public abstract String biography();
}