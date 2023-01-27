package user;

public class User {
        private String email;
        private String passwordUser;


        public User(String email, String passwordUser) {
            this.email = email;
            this.passwordUser = passwordUser;

        }
        public  static User from (FakerUser fakerUser){
            return  new User(fakerUser.getEmail(), fakerUser.getPassword());
        }
}
