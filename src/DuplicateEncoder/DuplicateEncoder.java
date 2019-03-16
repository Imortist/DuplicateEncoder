package DuplicateEncoder;

import org.jetbrains.annotations.NotNull;

public class DuplicateEncoder {

    /**
     * FUCK KNOWS HOW TO MAKE IT WORK!!! ><
     * 2/4/2018
     */

    //TODO: Make it work, stay calm and keep coding

    public static String encode(String word){
        String duplicates = getDuplicates(word);
        String result = getResult(word, duplicates);
        return result;
    }

    @NotNull
    public static String getResult(String word, String duplicates) {
        String result = "";
        for(char letter : word.toCharArray()){
            if(duplicates.contains(Character.toString(letter))){
                result.concat("(");
            } else {
                result.concat(")");
            }
        }
        return result;
    }

    @NotNull
    public static String getDuplicates(String word) {
        String duplicates = "";
        for(char letter : word.toCharArray()){
            if(word.lastIndexOf(letter) > word.indexOf(letter)){
                duplicates.concat(Character.toString(letter));
            }
        }
        return duplicates;
    }
}
