package lab4;

import java.util.Arrays;

/**
 * Клас Sentence представляє речення, що складається зі слів та розділових знаків.
 *
 * @author Denys
 */
class Sentence {
  private final Object[] elements;

  /**
   * Конструктор для створення об'єкта речення.
   *
   * @param sentence текст речення
   */
  public Sentence(String sentence) {
    String[] parts = sentence.split("(?<=\\p{Punct})|(?=\\p{Punct})|\\s+");
    elements = new Object[parts.length];

    for (int i = 0; i < parts.length; i++) {
      if (parts[i].matches("\\p{Punct}")) {
        elements[i] = new Punctuation(parts[i].charAt(0));
      } else {
        elements[i] = new Word(parts[i].trim());
      }
    }
  }

  /**
   * Повертає всі слова з речення.
   *
   * @return масив слів
   */
  public Word[] getWords() {
    return Arrays.stream(elements)
            .filter(element -> element instanceof Word)
            .toArray(Word[]::new);
  }

  @Override
  public String toString() {
    // Побудова речення шляхом конкатенації слів і розділових знаків
    String result = "";
    for (Object element : elements) {
      if (element instanceof Word) {
        result += ((Word) element).toString() + " ";
      } else if (element instanceof Punctuation) {
        result = result.trim() + ((Punctuation) element).getSymbol(); // Прибирання пробілу перед розділовим знаком
      }
    }
    return result.trim();
  }
}