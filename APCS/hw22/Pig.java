/***
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

// Zane Wang
// APCS1 pd1
// HW22 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
// 2017-10-24

public class Pig
{
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter ) 
  {
      return (w.indexOf(letter) >= 0);
      //if letter in w, returns 0 or higher, otherwise, -1, and gives boolean
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter ) 
  {
      return (VOWELS.indexOf(letter) >= 0);
      // checks to see if letter is in the list of vowels
  }// ends isAVowel()


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w ) 
  {
      int vowelCtr = 0;
      int counter = 0;
      // goes through all letters in string w, and counts how many vowels
      while (counter < w.length()) {
	  if (isAVowel(w.substring(counter, counter + 1))) {
	      vowelCtr = vowelCtr + 1;
	  }
	  counter = counter + 1;
      }
      return vowelCtr;
  }// ends countVowels


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w ) 
  {
      // if num of vowels > 0, there are vowels
      return countVowels(w) > 0; /* YOUR IMPLEMENTATION HERE */
  }// ends hasAVowel


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w ) 
  {
      String retStr = "";
      int ctr = 0;
      // checks each letter to see if it's a vowel, adds vowels to new string
      while (hasAVowel(w)) {
	  if (isAVowel(w.substring(ctr, ctr + 1))) {
	      retStr = retStr + w.substring(ctr, ctr + 1);
	      w = w.substring(ctr + 1);
	  }
	  ctr = ctr + 1;
      }	  
      return retStr; /* YOUR IMPLEMENTATION HERE */
  }// ends allVowels
    

  public static void main( String[] args ) 
  {
      System.out.println(hasA("hello","e")); // true
      System.out.println(hasA("hello","t")); // false
      System.out.println(isAVowel("o")); // true
      System.out.println(isAVowel("t")); // false
      System.out.println(countVowels("hello")); // 2
      System.out.println(countVowels("t")); // 0
      System.out.println(hasAVowel("hello")); // true
      System.out.println(hasAVowel("t")); // false
      System.out.println(allVowels("hello")); // "eo"
      System.out.println(allVowels("t")); // ""
      
  }//end main()

}//end class Pig
