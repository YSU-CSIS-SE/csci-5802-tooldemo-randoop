
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    org.jfree.date.SerialDate serialDate3 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel5 = new org.jfree.ui.SerialDateChooserPanel(serialDate3, true);
    java.beans.VetoableChangeListener vetoableChangeListener6 = null;
    serialDateChooserPanel5.removeVetoableChangeListener(vetoableChangeListener6);
    // The following exception was thrown during execution in test generation
    try {
    serialDateChooserPanel2.setComponentZOrder((java.awt.Component)serialDateChooserPanel5, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test02"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    java.beans.VetoableChangeListener vetoableChangeListener3 = null;
    serialDateChooserPanel2.removeVetoableChangeListener(vetoableChangeListener3);
    java.awt.event.ActionEvent actionEvent5 = null;
    // The following exception was thrown during execution in test generation
    try {
    serialDateChooserPanel2.actionPerformed(actionEvent5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test03"); }

    java.lang.Comparable[] comparable_array6 = new java.lang.Comparable[] { (-1.0f), (byte)1, '#', (short)10, ' ', 1L };
    java.awt.Dialog.ModalityType modalityType7 = java.awt.Dialog.DEFAULT_MODALITY_TYPE;
    java.lang.Comparable[] comparable_array10 = new java.lang.Comparable[] { modalityType7, 0.0f, 10 };
    // The following exception was thrown during execution in test generation
    try {
    int i11 = org.jfree.util.ArrayUtilities.compareVersionArrays(comparable_array6, comparable_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparable_array6);
    org.junit.Assert.assertTrue("'" + modalityType7 + "' != '" + java.awt.Dialog.ModalityType.APPLICATION_MODAL + "'", modalityType7.equals(java.awt.Dialog.ModalityType.APPLICATION_MODAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparable_array10);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test04"); }

    int i0 = org.jfree.date.SerialDate.FIRST_WEEK_IN_MONTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test05"); }

    int i0 = org.jfree.ui.Align.RIGHT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 8);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test06"); }

    java.lang.Class class1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.net.URL uRL2 = org.jfree.util.ObjectUtilities.getResourceRelative("hi!", class1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test07"); }

    int i0 = org.jfree.layout.FormatLayout.LCBLC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 6);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test08"); }

    org.jfree.text.TextBlockAnchor textBlockAnchor0 = org.jfree.text.TextBlockAnchor.BOTTOM_CENTER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test09"); }

    boolean b0 = org.jfree.util.ObjectUtilities.isJDK14();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test10"); }

    float f0 = java.awt.Component.LEFT_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.0f);

  }

}
