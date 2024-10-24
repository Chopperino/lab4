package lab4;

/**
 * Клас Word представляє слово, що складається з масиву літер.
 *
 * @author Denys
 */
class Word {
  private final Letter[] letters;

  /**
   * Конструктор для створення об'єкта слова.
   *
   * @param word текст слова
   */
  public Word(String word) {
    letters = new Letter[word.length()];
    for (int i = 0; i < word.length(); i++) {
      letters[i] = new Letter(word.charAt(i));
    }
  }

  /**
   * Повертає слово у вигляді рядка.
   *
   * @return слово як рядок
   */
  @Override
  public String toString() {
    // Конкатенація літер у рядок
    String result = "";
    for (Letter letter : letters) {
      result += letter.getValue();
    }
    return result;
  }
}