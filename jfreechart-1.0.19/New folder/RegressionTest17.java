
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    javax.swing.InputMap inputMap4 = serialDateChooserPanel2.getInputMap();
    java.awt.Dimension dimension5 = serialDateChooserPanel2.getMaximumSize();
    boolean b6 = serialDateChooserPanel2.getFocusTraversalKeysEnabled();
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.awt.AWTKeyStroke> set_aWTKeyStroke8 = serialDateChooserPanel2.getFocusTraversalKeys((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test02"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = org.jfree.date.SerialDate.monthCodeToQuarter((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test03"); }

    java.io.ObjectInputStream objectInputStream0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Stroke stroke1 = org.jfree.io.SerialUtilities.readStroke(objectInputStream0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test04"); }

    java.util.Locale locale1 = javax.swing.JComponent.getDefaultLocale();
    java.lang.ClassLoader classLoader2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle3 = org.jfree.util.ResourceBundleWrapper.getBundle("content", locale1, classLoader2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test05"); }

    int i0 = org.jfree.date.MonthConstants.APRIL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test06"); }

    int[] i_array5 = new int[] { (byte)100, 4, 6, (-1) };
    org.jfree.layout.FormatLayout formatLayout6 = new org.jfree.layout.FormatLayout((int)'#', i_array5);
    org.jfree.ui.ApplicationFrame applicationFrame9 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener10 = null;
    applicationFrame9.removeWindowStateListener(windowStateListener10);
    java.awt.Cursor cursor12 = null;
    applicationFrame9.setCursor(cursor12);
    java.awt.Image image14 = null;
    boolean b20 = applicationFrame9.imageUpdate(image14, (int)'4', (int)(short)1, 8, (int)(byte)100, (int)'#');
    formatLayout6.removeLayoutComponent("notify-field-accept", (java.awt.Component)applicationFrame9);
    org.jfree.date.SerialDate serialDate22 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel24 = new org.jfree.ui.SerialDateChooserPanel(serialDate22, true);
    java.awt.Color color25 = serialDateChooserPanel24.getForeground();
    java.awt.Event event26 = null;
    boolean b29 = serialDateChooserPanel24.mouseUp(event26, (int)(byte)10, (int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    formatLayout6.layoutContainer((java.awt.Container)serialDateChooserPanel24);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test07"); }

    int i0 = org.jfree.ui.Align.FIT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 15);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test08"); }

    java.awt.Insets insets0 = null;
    org.jfree.ui.InsetsChooserPanel insetsChooserPanel1 = new org.jfree.ui.InsetsChooserPanel(insets0);
    java.awt.Insets insets2 = insetsChooserPanel1.getInsetsValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets2);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test09"); }

    javax.swing.text.Keymap keymap1 = javax.swing.text.JTextComponent.getKeymap("notify-field-accept");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(keymap1);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test10"); }

    // The following exception was thrown during execution in test generation
    try {
    org.jfree.date.DayAndMonthRule dayAndMonthRule2 = new org.jfree.date.DayAndMonthRule((-1), 2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

}
