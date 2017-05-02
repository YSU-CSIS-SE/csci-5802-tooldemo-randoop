
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test01"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array1 = lengthLimitingDocument0.getDocumentListeners();
    javax.swing.text.Position position2 = lengthLimitingDocument0.getEndPosition();
    javax.swing.text.AttributeSet attributeSet5 = null;
    // The following exception was thrown during execution in test generation
    try {
    lengthLimitingDocument0.insertString(10, "notify-field-accept", attributeSet5);
      org.junit.Assert.fail("Expected exception of type javax.swing.text.BadLocationException");
    } catch (javax.swing.text.BadLocationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(position2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test02"); }

    javax.swing.JDialog jDialog0 = null;
    org.jfree.ui.WizardPanel wizardPanel3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.ui.WizardDialog wizardDialog4 = new org.jfree.ui.WizardDialog(jDialog0, false, "content", wizardPanel3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test03"); }

    java.lang.Exception exception2 = null;
    org.jfree.util.StackableRuntimeException stackableRuntimeException3 = new org.jfree.util.StackableRuntimeException("", exception2);
    org.jfree.util.Log.warn((java.lang.Object)"PanelUI", exception2);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test04"); }

    int i0 = org.jfree.ui.Align.TOP_RIGHT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 9);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test05"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.util.Locale locale3 = applicationFrame1.getLocale();
    applicationFrame1.transferFocusUpCycle();
    java.awt.Event event5 = null;
    boolean b8 = applicationFrame1.mouseExit(event5, (int)(byte)10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test06"); }

    int i0 = javax.swing.JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test07"); }

    int i0 = org.jfree.date.SerialDate.WEDNESDAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test08"); }

    boolean b1 = org.jfree.date.SerialDate.isLeapYear((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test09"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    serialDateChooserPanel2.resize(8, (int)(short)-1);
    java.awt.event.ContainerListener[] containerListener_array7 = serialDateChooserPanel2.getContainerListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(containerListener_array7);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test10"); }

    java.util.ResourceBundle resourceBundle0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.util.ResourceBundleSupport resourceBundleSupport1 = new org.jfree.util.ResourceBundleSupport(resourceBundle0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

}
