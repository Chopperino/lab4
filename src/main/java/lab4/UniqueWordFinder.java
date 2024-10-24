package lab4;

import java.util.HashSet;
import java.util.Set;

/**
 * Клас UniqueWordFinder містить метод для пошуку унікального слова в першому реченні,
 * яке не зустрічається в інших реченнях.
 *
 * @author Denys
 */
public class UniqueWordFinder {

  /**
   * Основний метод програми.
   *
   * @param args аргументи командного рядка
   */
  public static void main(String[] args) {
    String inputText = "Сонце світить яскраво і класно! Яскраво сяє сонце, і світить над землею...";

    // Видалення зайвих пробілів та табуляцій
    inputText = inputText.replaceAll("\\s+", " ");

    Text text = new Text(inputText);
    String uniqueWord = findUniqueWordInFirstSentence(text);

    System.out.println("Унікальне слово: " + uniqueWord);
  }

  /**
   * Знаходить унікальне слово в першому реченні, яке не зустрічається в наступних.
   *
   * @param text текст для аналізу
   * @return унікальне слово або null, якщо не знайдено
   */
  public static String findUniqueWordInFirstSentence(Text text) {
    if (text.getSentences().length == 0) {
      return null;
    }

    Sentence firstSentence = text.getSentences()[0];
    Set<String> wordsInOtherSentences = new HashSet<>();

    for (int i = 1; i < text.getSentences().length; i++) {
      for (Word word : text.getSentences()[i].getWords()) {
        wordsInOtherSentences.add(word.toString().toLowerCase());
      }
    }

    for (Word word : firstSentence.getWords()) {
      if (!wordsInOtherSentences.contains(word.toString().toLowerCase())) {
        return word.toString();
      }
    }

    return null;
  }
}
