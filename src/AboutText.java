/*
			Name: Valerie Loveland
			Date: 06/04/2019
			Assignment: 3
			File: About Text
			Description: This class is so I can change the biographies for the maker to go along with the plot point.

*/

public class AboutText extends About{
        public AboutText(){
            super("Biography");
        }

        public AboutText(String Biography2) {
            super(Biography2);
        }

        @Override
        public String biography(){//constructor
            return "Valerie Loveland is a Computer Science student and tarot card enthusiast. This is her first tarot app. ";
        }


        public static class Biography2 extends AboutText {
            public Biography2(){
                super("\"Valerie Loveland is a Computer Science student and tarot card enthusiast. This is her first tarot app. \"");
            }
        }

        public static class Biography3 extends AboutText {
            public Biography3(){
                super("Valerie Loveland has been reported missing since August.");
            }
        }

    }