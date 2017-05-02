
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    int i0 = javax.swing.SwingConstants.LEADING;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 10);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    int i0 = org.jfree.ui.Align.SOUTH_EAST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 10);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    java.awt.Dialog dialog0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.ui.RefineryUtilities.centerDialogInParent(dialog0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    java.util.Locale locale1 = null;
    java.util.ResourceBundle.Control control2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle3 = java.util.ResourceBundle.getBundle("", locale1, control2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    org.jfree.ui.RectangleEdge rectangleEdge0 = null;
    boolean b1 = org.jfree.ui.RectangleEdge.isLeftOrRight(rectangleEdge0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj1 = org.jfree.util.ObjectUtilities.clone((java.lang.Object)100L);
      org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    java.lang.String str0 = javax.swing.JTextField.notifyAction;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "notify-field-accept"+ "'", str0.equals("notify-field-accept"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    int i0 = javax.swing.SwingConstants.RIGHT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    int i0 = java.awt.Frame.SW_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    java.awt.Dialog.ModalityType modalityType0 = java.awt.Dialog.DEFAULT_MODALITY_TYPE;
    org.junit.Assert.assertTrue("'" + modalityType0 + "' != '" + java.awt.Dialog.ModalityType.APPLICATION_MODAL + "'", modalityType0.equals(java.awt.Dialog.ModalityType.APPLICATION_MODAL));

  }

}
