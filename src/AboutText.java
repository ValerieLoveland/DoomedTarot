    public class AboutText extends About{
        public AboutText(){
            super("Biography");
        }

        public AboutText(String biography2) {
            super(biography2);
        }

        @Override
        public String biography(){//constructor
            return "Valerie Loveland is a Computer Science student and tarot card enthusiast. This is her first tarot app. ";
        }


        public static class Biography2 extends AboutText {
            public Biography2(){
                super("Biography2 test");
            }
        }

        public static class Biography3 extends AboutText {
            public Biography3(){
                super("Biography3 test");
            }
        }

    }