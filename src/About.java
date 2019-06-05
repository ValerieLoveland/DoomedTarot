/*
			Name: Valerie Loveland
			Date: 06/04/2019
			Assignment: 3
			File: About
			Description: This class is for the general task about the person who makes this. Right now it is "about" me
			    but it is going to turn into a fake tarot card app writer.

*/

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