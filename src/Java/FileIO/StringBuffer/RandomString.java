package Java.FileIO.StringBuffer;

import java.util.Random;

public class RandomString {
    static String generateString(int size) {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            float randomChar = 97 + (random.nextFloat() * 26);
            sb.append((char) randomChar);
        }

        return sb.toString();
    }
}
