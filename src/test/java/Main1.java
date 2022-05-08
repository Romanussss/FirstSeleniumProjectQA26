
public class Main1 {

    public static void main(String[] args) {
        LoginTest login = new LoginTest();
        login.loginWithValidCredentialsTest();
//        login.loginWithInvalidEmail();
//        login.loginWithInvalidPasswordTest();
//        login.loginWithoutCredentialsTest();




        RegisterTest register = new RegisterTest();
        register.registerCreditendials();




        WishListTest wishlist = new WishListTest();
        wishlist.wishListTest();

    }

}
