import java.util.Arrays;

public class IsAnagram {
  public static boolean (String s, String t){
    if (s.length() != t.length()) {
      return false; }
  
    char[] arrayS = s.toCharArray();
    char[] arrayT = t.toCharArray();
    Arrays.sort(arrayS);
    Arrays.sort(arrayT);

  return Arrays.equals(arrayS, arrayT);
  }

public static void main(Strings[] args) {
  String s = "silent";
  String t = "listen";

  System.out.println(IsAnagram(s,t);
}
