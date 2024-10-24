package lab4;

/**
 * Клас Text представляє текст, що складається з масиву речень.
 *
 * @author Denys
 */
class Text {
  private final Sentence[] sentences;

  /**
   * Конструктор для створення об'єкта тексту.
   *
   * @param text текст для обробки
   */
  public Text(String text) {
    String[] rawSentences = text.split("[.!?]+");
    sentences = new Sentence[rawSentences.length];

    for (int i = 0; i < rawSentences.length; i++) {
      sentences[i] = new Sentence(rawSentences[i].trim());
    }
  }

  /**
   * Повертає всі речення тексту.
   *
   * @return масив речень
   */
  public Sentence[] getSentences() {
    return sentences;
  }
}
