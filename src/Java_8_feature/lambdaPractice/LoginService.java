package Java_8_feature.lambdaPractice;

interface LoginValidator {

    boolean validate(String username, String password);
}

public class LoginService {

    public static void main(String[] args) {
        LoginValidator loginValidator = (username, password) -> username.equals("avinash") && password.equals("1234");
        System.out.println(loginValidator.validate("avinash", "1234"));
    }
}
