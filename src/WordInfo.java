public class WordInfo implements Comparable<WordInfo> {

  private String word;
  private int line;

  public WordInfo(String word, int line) {
    this.word = word;
    this.line = line;
  }

  public String toString() {
    return line + " : " + word;
  }

  @Override
  public int compareTo(WordInfo other) {
    if (this.word.length() == other.word.length())
      return this.word.compareTo(other.word);
    return this.word.length() > other.word.length() ? 1 : -1;
  }
}
