import java.util.Locale;

public class user {
        private String name, familyName;
        public user(String name, String familyName) {
            this.name = name;
            this.familyName = name;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getFamilyName() {
            return familyName;
        }
        public void setFamilyName(String familyName) {
            this.familyName = familyName;
        }

        public String metodoDevolver(){

            return getName().toLowerCase();
        }
        public char MetodoDevolver1(){

            return  getName().charAt(0);
        }

    }


