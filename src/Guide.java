/*
			Name: Valerie Loveland
			Date: 06/04/2019
			Assignment: 3
			File: Guide
			Description: This class is for the bare bones of the class about the sprite who talks to the user and
			    interprets the cards for them and makes conversation.

*/

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