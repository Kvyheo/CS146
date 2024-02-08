import java.util.Arrays;

public class Anagram {
  public static boolean IsAnagram (String s, String t){
    if (s.length() != t.length()) {
      return false; }
  
    char[] arrayS = s.toCharArray();
    char[] arrayT = t.toCharArray();
    Arrays.sort(arrayS);
    Arrays.sort(arrayT);

  return Arrays.equals(arrayS, arrayT);
  }

public static void main(String[] args) {
  String s = "silent";
  String t = "listen";

  System.out.println(IsAnagram(s,t));
}
}
