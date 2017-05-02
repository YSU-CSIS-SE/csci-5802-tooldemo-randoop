
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test01"); }

    java.awt.Graphics2D graphics2D1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.text.TextUtilities.drawRotatedString("hi!", graphics2D1, (float)8, (float)4, (double)100L, (float)100L, (float)0L);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test02"); }

    boolean b2 = org.jfree.util.StringUtils.endsWithIgnoreCase("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test03"); }

    int i0 = org.jfree.date.MonthConstants.JUNE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 6);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test04"); }

    org.jfree.date.SerialDate serialDate1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.date.SerialDate serialDate2 = org.jfree.date.SerialDate.getPreviousDayOfWeek((int)(short)10, serialDate1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test05"); }

    java.io.ObjectInputStream objectInputStream0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Shape shape1 = org.jfree.io.SerialUtilities.readShape(objectInputStream0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test06"); }

    java.util.Locale locale1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle2 = org.jfree.util.ResourceBundleWrapper.getBundle("", locale1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test07"); }

    org.jfree.text.TextBlockAnchor textBlockAnchor0 = org.jfree.text.TextBlockAnchor.CENTER_RIGHT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test08"); }

    int i0 = org.jfree.date.SerialDate.PRECEDING;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == (-1));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test09"); }

    java.lang.String str0 = javax.swing.text.AbstractDocument.ContentElementName;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "content"+ "'", str0.equals("content"));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test10"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.date.SerialDate serialDate1 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i2 = org.jfree.date.SerialDateUtilities.dayCountActual(serialDate0, serialDate1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

}
