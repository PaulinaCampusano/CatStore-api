package cl.catstore.catstore_api.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderUtil {

    public static void main(String[] args) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();

        String rawPassword = "admin123"; 
        String encoded = encoder.encode(rawPassword);

        System.out.println("Password original : " + rawPassword);
        System.out.println("Password encriptada: " + encoded);
    }
}
