public class Leetspeak {
  public static void main(String[] args) {}

  public String leetspeak(String phrase) {
    String leetphrase = bulkReplaceLetters(phrase);
    return fixIncorrectBulkChanges(leetphrase);
  }

  public String bulkReplaceLetters(String phrase) {
    return phrase.replace("e", "3").
                  replace("E", "3").
                  replace("o", "0").
                  replace("O", "0").
                  replace("I", "1").
                  replace("s", "z").
                  replace("S", "Z");
  }

  public String fixIncorrectBulkChanges(String phrase) {
    String[] wordsInPhrase = phrase.split(" ");
    String recompiledPhrase = "";
    for ( String word : wordsInPhrase ) {
      recompiledPhrase = restoreLeadingSLetters(recompiledPhrase, word);
    }
    return recompiledPhrase.trim();
  }

  public String restoreLeadingSLetters(String phrase, String word) {
    if ( word.substring(0,1).equals("z") ) {
      phrase += ("s" + word.substring(1, word.length()));
    } else {
      phrase += word;
    }
    return phrase += " ";
  }
}