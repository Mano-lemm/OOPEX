package be.intecbrussel.hulpClasses;

public class PasswordGenerator {
    Character[] availableChars;

    public PasswordGenerator(){
        availableChars = new Character[10 + 2 * 26];
        int index = 0;
        for (int i = 65; i < 91; i++) {
            availableChars[index++] = (Character) (char) i; // hoofdletters
            availableChars[index++] = (Character) (char) (i + 32); // kleine letters
        }
        for (int i = 48; i < 58; i++) {
            availableChars[index++] = (Character) (char) i;
        }
    } 

    public Character[] generatePassword(){
        Character[] pwd = new Character[5];
        for (int i = 0; i < pwd.length; i++) {
            pwd[i] = availableChars[(int) (Math.random() * availableChars.length)];
        }
        return pwd;
    }
}
