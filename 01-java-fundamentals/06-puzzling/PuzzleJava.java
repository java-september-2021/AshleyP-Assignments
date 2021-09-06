import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    // First Method: getTenRolls
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> randomnumbers = new ArrayList<Integer>();
        Random randomnum = new Random();
        for(int i = 1; i <=10; i++) {
            randomnumbers.add(randomnum.nextInt(20) + 1);
        }
        return randomnumbers;
    }
    // Second Method: getRandomLetter
    public String getRandomLetter() {
        Random randomletter = new Random();
        String alphabetlist = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabet = new String[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(alphabetlist.charAt(i));
        }
        return alphabet[randomletter.nextInt(26)];
    }
    // Third Method: generatePassword
    public String generatePassword() {
        String password = "";
        for(int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }
    // Fourth Method: getNewPasswordSet
    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordset = new ArrayList<String>();
        for (int i = 0; i < length; i++) {
            passwordset.add(generatePassword());
        }
        return passwordset;
    }
}