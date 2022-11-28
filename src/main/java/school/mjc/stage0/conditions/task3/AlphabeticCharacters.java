package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {

        if (character % 2 == 0 && ((character >= 97 && character <= 122) || (character >= 65 && character <= 90))) {
            System.out.println("Consonant");
        } else if (character % 2 != 0 && ((character >= 97 && character <= 122) || (character >= 65 && character <= 90))){
            System.out.println("Vowel");
        } else {
            System.out.println("wrong alphabet!");
        }

    }
}
