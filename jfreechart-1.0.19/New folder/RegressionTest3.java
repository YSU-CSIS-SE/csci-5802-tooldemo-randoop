
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test01"); }

    int i0 = org.jfree.ui.Align.BOTTOM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test02"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    org.jfree.ui.ApplicationFrame applicationFrame3 = new org.jfree.ui.ApplicationFrame("");
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component4 = applicationFrame1.add((java.awt.Component)applicationFrame3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test03"); }

    int i0 = org.jfree.ui.Align.WEST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test04"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array1 = lengthLimitingDocument0.getDocumentListeners();
    javax.swing.text.Segment segment4 = null;
    // The following exception was thrown during execution in test generation
    try {
    lengthLimitingDocument0.getText(10, (int)(byte)100, segment4);
      org.junit.Assert.fail("Expected exception of type javax.swing.text.BadLocationException");
    } catch (javax.swing.text.BadLocationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test05"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    java.awt.event.ActionEvent actionEvent8 = null;
    // The following exception was thrown during execution in test generation
    try {
    serialDateChooserPanel2.actionPerformed(actionEvent8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test06"); }

    int i0 = org.jfree.date.SerialDate.LAST_WEEK_IN_MONTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test07"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    java.awt.Event event3 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = serialDateChooserPanel2.handleEvent(event3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test08"); }

    java.util.Date date5 = org.jfree.date.DateUtilities.createDate((int)(byte)-1, 0, 1, (int)'#', (int)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.date.SerialDate serialDate6 = org.jfree.date.SerialDate.createInstance(date5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date5);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test09"); }

    int i0 = java.awt.Frame.MOVE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 13);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test10"); }

    int i0 = java.awt.Frame.MAXIMIZED_VERT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

}
