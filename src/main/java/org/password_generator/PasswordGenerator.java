package org.password_generator;

import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String BASE = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*()_+-=[]?";
    private static final SecureRandom RANDOM = new SecureRandom();

    public static String generatePassword(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Довжина пароля має бути більше 0");
        }
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomCharIndex = RANDOM.nextInt(BASE.length());
            password.append(BASE.charAt(randomCharIndex));
        }
        return password.toString();
    }
}
