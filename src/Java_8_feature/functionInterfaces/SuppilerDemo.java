package Java_8_feature.functionInterfaces;

import java.util.function.Supplier;

class OtpGenerate {

    void showOTP() {
        Supplier<String> s = () -> {//lambda
            String otp = "";
            for (int i = 0; i < 4; i++) {
                otp += (int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.println(s.get());
    }
}

public class SuppilerDemo {

    public static void main(String[] args) {
        OtpGenerate ob = new OtpGenerate();
        ob.showOTP();
    }
}
