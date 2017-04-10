
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest70 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test01"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    boolean b2 = guessLogic0.gameOver(0);
    boolean b4 = guessLogic0.guessing(100);
    boolean b6 = guessLogic0.guessing((int)(short)10);
    boolean b8 = guessLogic0.gameOver(10);
    boolean b10 = guessLogic0.guessing((int)(short)-1);
    boolean b12 = guessLogic0.legalGuess((int)(short)-1);
    boolean b14 = guessLogic0.guessing(0);
    boolean b16 = guessLogic0.guessing((int)'#');
    boolean b18 = guessLogic0.guessing((int)(short)10);
    java.lang.String str19 = guessLogic0.toString();
    // The following exception was thrown during execution in test generation
    try {
    boolean b21 = guessLogic0.alreadyGuessed(0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "The random number is between 1 and 10. The random number is: 1.  The number of tries is 1. The numbers that have been guessed are: 10, "+ "'", str19.equals("The random number is between 1 and 10. The random number is: 1.  The number of tries is 1. The numbers that have been guessed are: 10, "));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test02"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    boolean b2 = guessLogic0.legalGuess((int)(byte)1);
    boolean b4 = guessLogic0.legalGuess(1);
    int i5 = guessLogic0.returnMaximum();
    boolean b7 = guessLogic0.legalGuess((int)(short)10);
    boolean b9 = guessLogic0.legalGuess((int)(byte)-1);
    boolean b11 = guessLogic0.guessing(0);
    boolean b13 = guessLogic0.gameOver(100);
    boolean b15 = guessLogic0.alreadyGuessed((int)(short)1);
    int i16 = guessLogic0.returnMaximum();
    boolean b18 = guessLogic0.gameOver(1);
    boolean b20 = guessLogic0.alreadyGuessed((int)(byte)10);
    int i21 = guessLogic0.returnMaximum();
    boolean b23 = guessLogic0.gameOver((int)'#');
    boolean b25 = guessLogic0.guessing((int)(short)10);
    int i26 = guessLogic0.count();
    int i27 = guessLogic0.count();
    boolean b29 = guessLogic0.gameOver(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test03"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    int i1 = guessLogic0.returnMaximum();
    boolean b3 = guessLogic0.guessing(0);
    boolean b5 = guessLogic0.gameOver((int)(short)0);
    boolean b7 = guessLogic0.guessing(10);
    boolean b9 = guessLogic0.guessing((int)'#');
    int i10 = guessLogic0.count();
    java.lang.String str11 = guessLogic0.toString();
    boolean b13 = guessLogic0.alreadyGuessed((int)(byte)10);
    java.lang.String str14 = guessLogic0.toString();
    int i15 = guessLogic0.count();
    int i16 = guessLogic0.count();
    boolean b18 = guessLogic0.alreadyGuessed((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "The random number is between 1 and 10. The random number is: 6.  The number of tries is 1. The numbers that have been guessed are: 10, "+ "'", str11.equals("The random number is between 1 and 10. The random number is: 6.  The number of tries is 1. The numbers that have been guessed are: 10, "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "The random number is between 1 and 10. The random number is: 6.  The number of tries is 1. The numbers that have been guessed are: 10, "+ "'", str14.equals("The random number is between 1 and 10. The random number is: 6.  The number of tries is 1. The numbers that have been guessed are: 10, "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test04"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    java.lang.String str1 = guessLogic0.toString();
    int i2 = guessLogic0.returnMaximum();
    boolean b4 = guessLogic0.gameOver((int)' ');
    boolean b6 = guessLogic0.guessing(0);
    boolean b8 = guessLogic0.guessing((int)(byte)-1);
    java.lang.String str9 = guessLogic0.toString();
    boolean b11 = guessLogic0.legalGuess((-1));
    java.lang.String str12 = guessLogic0.toString();
    boolean b14 = guessLogic0.gameOver((int)(byte)10);
    boolean b16 = guessLogic0.gameOver((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "The random number is between 1 and 10. The random number is: 6.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str1.equals("The random number is between 1 and 10. The random number is: 6.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The random number is between 1 and 10. The random number is: 6.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str9.equals("The random number is between 1 and 10. The random number is: 6.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "The random number is between 1 and 10. The random number is: 6.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str12.equals("The random number is between 1 and 10. The random number is: 6.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test05"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    int i1 = guessLogic0.returnMaximum();
    boolean b3 = guessLogic0.guessing(0);
    boolean b5 = guessLogic0.gameOver((int)(byte)1);
    int i6 = guessLogic0.count();
    int i7 = guessLogic0.returnMaximum();
    int i8 = guessLogic0.count();
    boolean b10 = guessLogic0.gameOver((int)'#');
    java.lang.String str11 = guessLogic0.toString();
    boolean b13 = guessLogic0.legalGuess((int)(short)0);
    boolean b15 = guessLogic0.legalGuess((int)(byte)100);
    int i16 = guessLogic0.count();
    int i17 = guessLogic0.returnMaximum();
    boolean b19 = guessLogic0.legalGuess((int)'#');
    boolean b21 = guessLogic0.guessing((int)(byte)10);
    int i22 = guessLogic0.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "The random number is between 1 and 10. The random number is: 7.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str11.equals("The random number is between 1 and 10. The random number is: 7.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test06"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    boolean b2 = guessLogic0.legalGuess((int)(byte)1);
    boolean b4 = guessLogic0.legalGuess(1);
    int i5 = guessLogic0.returnMaximum();
    int i6 = guessLogic0.returnMaximum();
    java.lang.String str7 = guessLogic0.toString();
    boolean b9 = guessLogic0.legalGuess(10);
    boolean b11 = guessLogic0.guessing((int)' ');
    boolean b13 = guessLogic0.guessing((int)(byte)1);
    int i14 = guessLogic0.returnMaximum();
    java.lang.String str15 = guessLogic0.toString();
    boolean b17 = guessLogic0.legalGuess((int)' ');
    boolean b19 = guessLogic0.gameOver(1);
    int i20 = guessLogic0.returnMaximum();
    boolean b22 = guessLogic0.legalGuess((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "The random number is between 1 and 10. The random number is: 1.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str7.equals("The random number is between 1 and 10. The random number is: 1.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The random number is between 1 and 10. The random number is: 1.  The number of tries is 1. The numbers that have been guessed are: 1, "+ "'", str15.equals("The random number is between 1 and 10. The random number is: 1.  The number of tries is 1. The numbers that have been guessed are: 1, "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test07"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    boolean b2 = guessLogic0.legalGuess((int)(byte)1);
    boolean b4 = guessLogic0.legalGuess(1);
    int i5 = guessLogic0.returnMaximum();
    boolean b7 = guessLogic0.legalGuess((int)(short)10);
    boolean b9 = guessLogic0.legalGuess((int)(byte)-1);
    boolean b11 = guessLogic0.guessing(0);
    boolean b13 = guessLogic0.gameOver(100);
    boolean b15 = guessLogic0.alreadyGuessed((int)(short)1);
    java.lang.String str16 = guessLogic0.toString();
    int i17 = guessLogic0.count();
    boolean b19 = guessLogic0.guessing(0);
    boolean b21 = guessLogic0.guessing((int)(byte)0);
    boolean b23 = guessLogic0.guessing((int)'#');
    int i24 = guessLogic0.count();
    boolean b26 = guessLogic0.gameOver((int)(byte)10);
    boolean b28 = guessLogic0.alreadyGuessed((int)(byte)1);
    boolean b30 = guessLogic0.guessing(0);
    int i31 = guessLogic0.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "The random number is between 1 and 10. The random number is: 9.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str16.equals("The random number is between 1 and 10. The random number is: 9.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test08"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    boolean b2 = guessLogic0.gameOver(0);
    boolean b4 = guessLogic0.guessing(100);
    boolean b6 = guessLogic0.guessing((int)(short)10);
    boolean b8 = guessLogic0.gameOver(10);
    boolean b10 = guessLogic0.legalGuess((int)(short)1);
    java.lang.String str11 = guessLogic0.toString();
    boolean b13 = guessLogic0.guessing(0);
    boolean b15 = guessLogic0.alreadyGuessed(2);
    java.lang.String str16 = guessLogic0.toString();
    boolean b18 = guessLogic0.legalGuess((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "The random number is between 1 and 10. The random number is: 9.  The number of tries is 1. The numbers that have been guessed are: 10, "+ "'", str11.equals("The random number is between 1 and 10. The random number is: 9.  The number of tries is 1. The numbers that have been guessed are: 10, "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "The random number is between 1 and 10. The random number is: 9.  The number of tries is 1. The numbers that have been guessed are: 10, "+ "'", str16.equals("The random number is between 1 and 10. The random number is: 9.  The number of tries is 1. The numbers that have been guessed are: 10, "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test09"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    int i1 = guessLogic0.returnMaximum();
    boolean b3 = guessLogic0.guessing(0);
    boolean b5 = guessLogic0.gameOver((int)(byte)1);
    int i6 = guessLogic0.returnMaximum();
    java.lang.String str7 = guessLogic0.toString();
    int i8 = guessLogic0.returnMaximum();
    int i9 = guessLogic0.returnMaximum();
    boolean b11 = guessLogic0.guessing((int)(short)1);
    boolean b13 = guessLogic0.alreadyGuessed((int)(byte)1);
    java.lang.String str14 = guessLogic0.toString();
    int i15 = guessLogic0.count();
    boolean b17 = guessLogic0.legalGuess(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "The random number is between 1 and 10. The random number is: 4.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str7.equals("The random number is between 1 and 10. The random number is: 4.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "The random number is between 1 and 10. The random number is: 4.  The number of tries is 1. The numbers that have been guessed are: 1, "+ "'", str14.equals("The random number is between 1 and 10. The random number is: 4.  The number of tries is 1. The numbers that have been guessed are: 1, "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test10"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    java.lang.String str1 = guessLogic0.toString();
    int i2 = guessLogic0.count();
    boolean b4 = guessLogic0.alreadyGuessed((int)(short)1);
    boolean b6 = guessLogic0.gameOver((int)(short)0);
    int i7 = guessLogic0.count();
    boolean b9 = guessLogic0.gameOver(1);
    int i10 = guessLogic0.returnMaximum();
    int i11 = guessLogic0.returnMaximum();
    boolean b13 = guessLogic0.guessing((int)(short)0);
    boolean b15 = guessLogic0.gameOver((int)(byte)1);
    boolean b17 = guessLogic0.legalGuess((int)'#');
    int i18 = guessLogic0.returnMaximum();
    int i19 = guessLogic0.returnMaximum();
    int i20 = guessLogic0.returnMaximum();
    int i21 = guessLogic0.returnMaximum();
    boolean b23 = guessLogic0.gameOver((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "The random number is between 1 and 10. The random number is: 2.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str1.equals("The random number is between 1 and 10. The random number is: 2.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test11"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    boolean b2 = guessLogic0.legalGuess((int)(byte)1);
    boolean b4 = guessLogic0.legalGuess(1);
    int i5 = guessLogic0.returnMaximum();
    int i6 = guessLogic0.returnMaximum();
    java.lang.String str7 = guessLogic0.toString();
    boolean b9 = guessLogic0.legalGuess(10);
    boolean b11 = guessLogic0.gameOver((int)' ');
    int i12 = guessLogic0.count();
    boolean b14 = guessLogic0.gameOver(0);
    java.lang.String str15 = guessLogic0.toString();
    int i16 = guessLogic0.count();
    boolean b18 = guessLogic0.guessing((int)' ');
    boolean b20 = guessLogic0.gameOver(0);
    int i21 = guessLogic0.returnMaximum();
    int i22 = guessLogic0.returnMaximum();
    boolean b24 = guessLogic0.legalGuess(100);
    int i25 = guessLogic0.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "The random number is between 1 and 10. The random number is: 1.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str7.equals("The random number is between 1 and 10. The random number is: 1.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The random number is between 1 and 10. The random number is: 1.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str15.equals("The random number is between 1 and 10. The random number is: 1.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test12"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    boolean b2 = guessLogic0.legalGuess((int)(byte)1);
    boolean b4 = guessLogic0.legalGuess(1);
    int i5 = guessLogic0.returnMaximum();
    boolean b7 = guessLogic0.legalGuess((int)(short)10);
    int i8 = guessLogic0.count();
    boolean b10 = guessLogic0.alreadyGuessed((int)(short)10);
    boolean b12 = guessLogic0.guessing((int)(byte)100);
    java.lang.String str13 = guessLogic0.toString();
    boolean b15 = guessLogic0.guessing((int)'#');
    boolean b17 = guessLogic0.gameOver(0);
    int i18 = guessLogic0.count();
    int i19 = guessLogic0.count();
    boolean b21 = guessLogic0.legalGuess((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "The random number is between 1 and 10. The random number is: 9.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str13.equals("The random number is between 1 and 10. The random number is: 9.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test13"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    boolean b2 = guessLogic0.gameOver(0);
    boolean b4 = guessLogic0.legalGuess((int)(byte)1);
    boolean b6 = guessLogic0.gameOver((int)(byte)100);
    boolean b8 = guessLogic0.guessing((int)(byte)10);
    boolean b10 = guessLogic0.alreadyGuessed((int)(byte)1);
    boolean b12 = guessLogic0.legalGuess((int)'#');
    int i13 = guessLogic0.count();
    boolean b15 = guessLogic0.guessing((int)'a');
    boolean b17 = guessLogic0.guessing((int)(byte)10);
    java.lang.String str18 = guessLogic0.toString();
    boolean b20 = guessLogic0.guessing((int)'4');
    boolean b22 = guessLogic0.alreadyGuessed((int)(short)1);
    java.lang.String str23 = guessLogic0.toString();
    boolean b25 = guessLogic0.guessing(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "The random number is between 1 and 10. The random number is: 3.  The number of tries is 1. The numbers that have been guessed are: 10, "+ "'", str18.equals("The random number is between 1 and 10. The random number is: 3.  The number of tries is 1. The numbers that have been guessed are: 10, "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "The random number is between 1 and 10. The random number is: 3.  The number of tries is 1. The numbers that have been guessed are: 10, "+ "'", str23.equals("The random number is between 1 and 10. The random number is: 3.  The number of tries is 1. The numbers that have been guessed are: 10, "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test14"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    boolean b2 = guessLogic0.legalGuess((int)(byte)1);
    boolean b4 = guessLogic0.legalGuess(1);
    int i5 = guessLogic0.returnMaximum();
    boolean b7 = guessLogic0.legalGuess((int)(short)10);
    boolean b9 = guessLogic0.legalGuess((int)(byte)-1);
    boolean b11 = guessLogic0.guessing(0);
    int i12 = guessLogic0.returnMaximum();
    boolean b14 = guessLogic0.gameOver((int)(short)10);
    boolean b16 = guessLogic0.guessing(0);
    boolean b18 = guessLogic0.legalGuess(0);
    int i19 = guessLogic0.count();
    boolean b21 = guessLogic0.legalGuess((int)(short)1);
    boolean b23 = guessLogic0.guessing((int)'#');
    boolean b25 = guessLogic0.legalGuess((-1));
    java.lang.String str26 = guessLogic0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "The random number is between 1 and 10. The random number is: 2.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str26.equals("The random number is between 1 and 10. The random number is: 2.  The number of tries is 0. The numbers that have been guessed are: "));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test15"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    int i1 = guessLogic0.returnMaximum();
    boolean b3 = guessLogic0.guessing(0);
    boolean b5 = guessLogic0.gameOver((int)(short)0);
    boolean b7 = guessLogic0.guessing(10);
    boolean b9 = guessLogic0.guessing((int)'#');
    boolean b11 = guessLogic0.gameOver((int)(byte)10);
    java.lang.String str12 = guessLogic0.toString();
    boolean b14 = guessLogic0.alreadyGuessed((int)(short)1);
    boolean b16 = guessLogic0.gameOver(2);
    int i17 = guessLogic0.count();
    int i18 = guessLogic0.count();
    boolean b20 = guessLogic0.gameOver((-1));
    // The following exception was thrown during execution in test generation
    try {
    boolean b22 = guessLogic0.alreadyGuessed(100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "The random number is between 1 and 10. The random number is: 9.  The number of tries is 1. The numbers that have been guessed are: 10, "+ "'", str12.equals("The random number is between 1 and 10. The random number is: 9.  The number of tries is 1. The numbers that have been guessed are: 10, "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test16"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    int i1 = guessLogic0.returnMaximum();
    boolean b3 = guessLogic0.guessing(0);
    boolean b5 = guessLogic0.gameOver((int)(short)0);
    int i6 = guessLogic0.returnMaximum();
    boolean b8 = guessLogic0.gameOver((int)(short)100);
    boolean b10 = guessLogic0.gameOver((int)(short)0);
    boolean b12 = guessLogic0.legalGuess((int)(short)-1);
    int i13 = guessLogic0.returnMaximum();
    boolean b15 = guessLogic0.guessing(1);
    boolean b17 = guessLogic0.guessing(0);
    int i18 = guessLogic0.returnMaximum();
    int i19 = guessLogic0.returnMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 10);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test17"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    boolean b2 = guessLogic0.legalGuess((int)(byte)1);
    boolean b4 = guessLogic0.legalGuess(1);
    java.lang.String str5 = guessLogic0.toString();
    boolean b7 = guessLogic0.legalGuess((int)'a');
    int i8 = guessLogic0.count();
    int i9 = guessLogic0.count();
    boolean b11 = guessLogic0.alreadyGuessed((int)(byte)10);
    int i12 = guessLogic0.returnMaximum();
    int i13 = guessLogic0.returnMaximum();
    boolean b15 = guessLogic0.legalGuess((int)(byte)10);
    boolean b17 = guessLogic0.gameOver((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "The random number is between 1 and 10. The random number is: 2.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str5.equals("The random number is between 1 and 10. The random number is: 2.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test18"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    boolean b2 = guessLogic0.gameOver(0);
    boolean b4 = guessLogic0.guessing(100);
    java.lang.String str5 = guessLogic0.toString();
    int i6 = guessLogic0.returnMaximum();
    boolean b8 = guessLogic0.legalGuess((int)(byte)100);
    int i9 = guessLogic0.count();
    java.lang.String str10 = guessLogic0.toString();
    java.lang.String str11 = guessLogic0.toString();
    boolean b13 = guessLogic0.guessing((int)(byte)-1);
    boolean b15 = guessLogic0.legalGuess(2);
    java.lang.String str16 = guessLogic0.toString();
    boolean b18 = guessLogic0.gameOver((int)(byte)100);
    int i19 = guessLogic0.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "The random number is between 1 and 10. The random number is: 2.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str5.equals("The random number is between 1 and 10. The random number is: 2.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "The random number is between 1 and 10. The random number is: 2.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str10.equals("The random number is between 1 and 10. The random number is: 2.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "The random number is between 1 and 10. The random number is: 2.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str11.equals("The random number is between 1 and 10. The random number is: 2.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "The random number is between 1 and 10. The random number is: 2.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str16.equals("The random number is between 1 and 10. The random number is: 2.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test19"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    boolean b2 = guessLogic0.legalGuess((int)(byte)1);
    boolean b4 = guessLogic0.legalGuess(1);
    int i5 = guessLogic0.returnMaximum();
    int i6 = guessLogic0.returnMaximum();
    java.lang.String str7 = guessLogic0.toString();
    boolean b9 = guessLogic0.legalGuess(10);
    boolean b11 = guessLogic0.guessing((int)' ');
    java.lang.String str12 = guessLogic0.toString();
    boolean b14 = guessLogic0.gameOver((int)(byte)1);
    int i15 = guessLogic0.count();
    int i16 = guessLogic0.count();
    boolean b18 = guessLogic0.guessing((int)(byte)-1);
    boolean b20 = guessLogic0.gameOver((int)(byte)1);
    boolean b22 = guessLogic0.gameOver((int)(short)1);
    boolean b24 = guessLogic0.legalGuess(1);
    int i25 = guessLogic0.count();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "The random number is between 1 and 10. The random number is: 2.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str7.equals("The random number is between 1 and 10. The random number is: 2.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "The random number is between 1 and 10. The random number is: 2.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str12.equals("The random number is between 1 and 10. The random number is: 2.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test20"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    boolean b2 = guessLogic0.gameOver(0);
    boolean b4 = guessLogic0.legalGuess((int)(byte)1);
    boolean b6 = guessLogic0.gameOver((-1));
    int i7 = guessLogic0.returnMaximum();
    boolean b9 = guessLogic0.legalGuess((-1));
    int i10 = guessLogic0.returnMaximum();
    int i11 = guessLogic0.count();
    java.lang.String str12 = guessLogic0.toString();
    boolean b14 = guessLogic0.guessing((int)(byte)10);
    int i15 = guessLogic0.returnMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "The random number is between 1 and 10. The random number is: 10.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str12.equals("The random number is between 1 and 10. The random number is: 10.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test21"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    boolean b2 = guessLogic0.legalGuess((int)(byte)1);
    boolean b4 = guessLogic0.legalGuess(1);
    int i5 = guessLogic0.returnMaximum();
    int i6 = guessLogic0.returnMaximum();
    java.lang.String str7 = guessLogic0.toString();
    boolean b9 = guessLogic0.legalGuess(10);
    boolean b11 = guessLogic0.gameOver((int)' ');
    int i12 = guessLogic0.count();
    boolean b14 = guessLogic0.gameOver(0);
    java.lang.String str15 = guessLogic0.toString();
    int i16 = guessLogic0.count();
    boolean b18 = guessLogic0.guessing((int)' ');
    boolean b20 = guessLogic0.legalGuess((int)(short)100);
    boolean b22 = guessLogic0.gameOver(100);
    boolean b24 = guessLogic0.legalGuess((int)(short)10);
    boolean b26 = guessLogic0.guessing((int)(short)0);
    java.lang.String str27 = guessLogic0.toString();
    int i28 = guessLogic0.count();
    boolean b30 = guessLogic0.legalGuess(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "The random number is between 1 and 10. The random number is: 1.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str7.equals("The random number is between 1 and 10. The random number is: 1.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The random number is between 1 and 10. The random number is: 1.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str15.equals("The random number is between 1 and 10. The random number is: 1.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "The random number is between 1 and 10. The random number is: 1.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str27.equals("The random number is between 1 and 10. The random number is: 1.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test22"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    boolean b2 = guessLogic0.gameOver(0);
    boolean b4 = guessLogic0.legalGuess((int)(byte)1);
    boolean b6 = guessLogic0.legalGuess((int)(byte)100);
    int i7 = guessLogic0.count();
    int i8 = guessLogic0.returnMaximum();
    java.lang.String str9 = guessLogic0.toString();
    int i10 = guessLogic0.returnMaximum();
    int i11 = guessLogic0.count();
    java.lang.String str12 = guessLogic0.toString();
    boolean b14 = guessLogic0.gameOver((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The random number is between 1 and 10. The random number is: 8.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str9.equals("The random number is between 1 and 10. The random number is: 8.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "The random number is between 1 and 10. The random number is: 8.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str12.equals("The random number is between 1 and 10. The random number is: 8.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test23"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    boolean b2 = guessLogic0.gameOver(0);
    boolean b4 = guessLogic0.guessing(100);
    java.lang.String str5 = guessLogic0.toString();
    int i6 = guessLogic0.returnMaximum();
    boolean b8 = guessLogic0.legalGuess((int)(byte)100);
    int i9 = guessLogic0.count();
    java.lang.String str10 = guessLogic0.toString();
    java.lang.String str11 = guessLogic0.toString();
    int i12 = guessLogic0.count();
    boolean b14 = guessLogic0.guessing((int)'#');
    boolean b16 = guessLogic0.legalGuess((int)'4');
    int i17 = guessLogic0.returnMaximum();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "The random number is between 1 and 10. The random number is: 4.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str5.equals("The random number is between 1 and 10. The random number is: 4.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "The random number is between 1 and 10. The random number is: 4.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str10.equals("The random number is between 1 and 10. The random number is: 4.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "The random number is between 1 and 10. The random number is: 4.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str11.equals("The random number is between 1 and 10. The random number is: 4.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test24"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    int i1 = guessLogic0.returnMaximum();
    boolean b3 = guessLogic0.guessing(0);
    boolean b5 = guessLogic0.gameOver((int)(byte)1);
    int i6 = guessLogic0.count();
    java.lang.String str7 = guessLogic0.toString();
    int i8 = guessLogic0.returnMaximum();
    boolean b10 = guessLogic0.guessing((int)(byte)1);
    boolean b12 = guessLogic0.alreadyGuessed(10);
    boolean b14 = guessLogic0.guessing(0);
    boolean b16 = guessLogic0.guessing((int)(short)-1);
    int i17 = guessLogic0.returnMaximum();
    int i18 = guessLogic0.count();
    java.lang.String str19 = guessLogic0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "The random number is between 1 and 10. The random number is: 5.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str7.equals("The random number is between 1 and 10. The random number is: 5.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "The random number is between 1 and 10. The random number is: 5.  The number of tries is 1. The numbers that have been guessed are: 1, "+ "'", str19.equals("The random number is between 1 and 10. The random number is: 5.  The number of tries is 1. The numbers that have been guessed are: 1, "));

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test25"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    int i1 = guessLogic0.returnMaximum();
    boolean b3 = guessLogic0.guessing(0);
    boolean b5 = guessLogic0.gameOver((int)(byte)1);
    int i6 = guessLogic0.returnMaximum();
    java.lang.String str7 = guessLogic0.toString();
    int i8 = guessLogic0.returnMaximum();
    boolean b10 = guessLogic0.legalGuess((int)'#');
    java.lang.String str11 = guessLogic0.toString();
    java.lang.String str12 = guessLogic0.toString();
    boolean b14 = guessLogic0.guessing(0);
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = guessLogic0.alreadyGuessed((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "The random number is between 1 and 10. The random number is: 8.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str7.equals("The random number is between 1 and 10. The random number is: 8.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "The random number is between 1 and 10. The random number is: 8.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str11.equals("The random number is between 1 and 10. The random number is: 8.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "The random number is between 1 and 10. The random number is: 8.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str12.equals("The random number is between 1 and 10. The random number is: 8.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test26"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    java.lang.String str1 = guessLogic0.toString();
    int i2 = guessLogic0.count();
    boolean b4 = guessLogic0.alreadyGuessed((int)(short)1);
    boolean b6 = guessLogic0.gameOver((int)(short)0);
    boolean b8 = guessLogic0.alreadyGuessed((int)(byte)1);
    java.lang.String str9 = guessLogic0.toString();
    java.lang.String str10 = guessLogic0.toString();
    boolean b12 = guessLogic0.legalGuess((int)(byte)10);
    int i13 = guessLogic0.returnMaximum();
    int i14 = guessLogic0.count();
    boolean b16 = guessLogic0.gameOver((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "The random number is between 1 and 10. The random number is: 3.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str1.equals("The random number is between 1 and 10. The random number is: 3.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The random number is between 1 and 10. The random number is: 3.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str9.equals("The random number is between 1 and 10. The random number is: 3.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "The random number is between 1 and 10. The random number is: 3.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str10.equals("The random number is between 1 and 10. The random number is: 3.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test27"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    int i1 = guessLogic0.returnMaximum();
    boolean b3 = guessLogic0.gameOver((int)(byte)-1);
    boolean b5 = guessLogic0.legalGuess(0);
    boolean b7 = guessLogic0.guessing(100);
    int i8 = guessLogic0.count();
    boolean b10 = guessLogic0.gameOver(2);
    boolean b12 = guessLogic0.gameOver((int)(byte)10);
    java.lang.String str13 = guessLogic0.toString();
    int i14 = guessLogic0.count();
    java.lang.String str15 = guessLogic0.toString();
    java.lang.String str16 = guessLogic0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "The random number is between 1 and 10. The random number is: 6.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str13.equals("The random number is between 1 and 10. The random number is: 6.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "The random number is between 1 and 10. The random number is: 6.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str15.equals("The random number is between 1 and 10. The random number is: 6.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "The random number is between 1 and 10. The random number is: 6.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str16.equals("The random number is between 1 and 10. The random number is: 6.  The number of tries is 0. The numbers that have been guessed are: "));

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test28"); }

    guessapp.GuessLogic guessLogic0 = new guessapp.GuessLogic();
    java.lang.String str1 = guessLogic0.toString();
    int i2 = guessLogic0.count();
    boolean b4 = guessLogic0.alreadyGuessed((int)(short)1);
    boolean b6 = guessLogic0.guessing((int)'#');
    int i7 = guessLogic0.returnMaximum();
    boolean b9 = guessLogic0.alreadyGuessed(10);
    int i10 = guessLogic0.count();
    boolean b12 = guessLogic0.legalGuess((int)'#');
    java.lang.String str13 = guessLogic0.toString();
    boolean b15 = guessLogic0.guessing(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "The random number is between 1 and 10. The random number is: 10.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str1.equals("The random number is between 1 and 10. The random number is: 10.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "The random number is between 1 and 10. The random number is: 10.  The number of tries is 0. The numbers that have been guessed are: "+ "'", str13.equals("The random number is between 1 and 10. The random number is: 10.  The number of tries is 0. The numbers that have been guessed are: "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

}
