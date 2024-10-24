package lab4;

/**
 * Клас Letter представляє окрему літеру в слові.
 *
 * @author Denys
 */
class Letter {
  private final char value;

  /**
   * Конструктор для створення об'єкта літери.
   *
   * @param value символ, що представляє літеру
   */
  public Letter(char value) {
    this.value = Character.toLowerCase(value);
  }

  /**
   * Повертає символ літери.
   *
   * @return значення літери
   */
  public char getValue() {
    return value;
  }
}