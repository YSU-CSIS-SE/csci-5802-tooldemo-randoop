
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest30 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest30.test01"); }

    java.lang.String[] str_array1 = org.jfree.date.SerialDate.getMonths(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest30.test02"); }

    org.jfree.ui.TextAnchor textAnchor0 = org.jfree.ui.TextAnchor.TOP_CENTER;
    boolean b1 = textAnchor0.isRight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest30.test03"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    boolean b4 = serialDateChooserPanel2.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array5 = serialDateChooserPanel2.getPropertyChangeListeners();
    javax.swing.InputMap inputMap6 = serialDateChooserPanel2.getInputMap();
    boolean b7 = serialDateChooserPanel2.isForegroundSet();
    boolean b8 = serialDateChooserPanel2.getAutoscrolls();
    java.awt.event.MouseMotionListener mouseMotionListener9 = null;
    serialDateChooserPanel2.removeMouseMotionListener(mouseMotionListener9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest30.test04"); }

    org.jfree.util.LogContext logContext1 = new org.jfree.util.LogContext("NO_CHANGE");
    org.jfree.ui.ApplicationFrame applicationFrame3 = new org.jfree.ui.ApplicationFrame("");
    int i4 = applicationFrame3.getState();
    java.util.Locale locale5 = applicationFrame3.getLocale();
    applicationFrame3.transferFocusUpCycle();
    java.awt.Component component7 = applicationFrame3.getFocusOwner();
    logContext1.debug((java.lang.Object)applicationFrame3);
    java.awt.Event event9 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b10 = applicationFrame3.postEvent(event9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component7);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest30.test05"); }

    org.jfree.util.UnitType unitType0 = org.jfree.util.UnitType.RELATIVE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(unitType0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest30.test06"); }

    org.jfree.ui.UIUtilities.setupUI();

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest30.test07"); }

    java.io.PrintStream printStream0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.util.PrintStreamLogTarget printStreamLogTarget1 = new org.jfree.util.PrintStreamLogTarget(printStream0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest30.test08"); }

    int i0 = javax.swing.JComponent.WHEN_FOCUSED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest30.test09"); }

    java.awt.Graphics2D graphics2D1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.text.TextUtilities.drawRotatedString("http://www.jfree.org/jcommon/", graphics2D1, (float)9, (float)7, (double)11, (float)(short)1, 100.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest30.test10"); }

    java.lang.Class class0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.util.LogContext logContext1 = org.jfree.util.Log.createContext(class0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

}
