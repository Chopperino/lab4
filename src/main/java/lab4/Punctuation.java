package lab4;

/**
 * Клас Punctuation представляє розділовий знак.
 *
 * @author Denys
 */
class Punctuation {
  private final char symbol;

  /**
   * Конструктор для створення об'єкта розділового знака.
   *
   * @param symbol символ розділового знака
   */
  public Punctuation(char symbol) {
    this.symbol = symbol;
  }

  /**
   * Повертає розділовий знак.
   *
   * @return символ розділового знака
   */
  public char getSymbol() {
    return symbol;
  }
}
