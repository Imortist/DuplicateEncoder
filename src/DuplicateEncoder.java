/**
 The goal of this exercise is to convert a string to a new string
 where each character in the new string is "(" if that character appears only once
 in the original string, or ")" if that character appears more than once in the original string.
 Ignore capitalization when determining if a character is a duplicate.
 */
//TODO: Make second test pass.
class DuplicateEncoder {
    static String encode(String word) {
        word = word.toLowerCase();
        for(char c : word.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                if (word.indexOf(c) == word.lastIndexOf(c) && c != ')' && c != '(')
                    word = word.replace(c, '(');
                else word = word.replace(c, ')');
            }
        }
        return word;
    }
}