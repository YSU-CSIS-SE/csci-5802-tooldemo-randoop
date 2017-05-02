
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest43 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest43.test01"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    dateCellRenderer0.setIconTextGap(5);
    dateCellRenderer0.validate();
    boolean b4 = dateCellRenderer0.isEnabled();
    javax.swing.ActionMap actionMap5 = null;
    dateCellRenderer0.setActionMap(actionMap5);
    // The following exception was thrown during execution in test generation
    try {
    dateCellRenderer0.setVerticalAlignment(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest43.test02"); }

    org.jfree.text.TextUtilities.setDrawStringsWithFontAttributes(false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest43.test03"); }

    int i0 = java.awt.Frame.N_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 8);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest43.test04"); }

    int i0 = org.jfree.date.SerialDate.SATURDAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 7);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest43.test05"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    java.awt.LayoutManager layoutManager4 = null;
    applicationFrame1.setLayout(layoutManager4);
    applicationFrame1.show();
    applicationFrame1.show();
    java.awt.Event event8 = null;
    boolean b11 = applicationFrame1.mouseEnter(event8, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest43.test06"); }

    org.jfree.base.AbstractBoot abstractBoot0 = org.jfree.base.BaseBoot.getInstance();
    boolean b1 = abstractBoot0.isBootInProgress();
    org.jfree.util.ExtendedConfiguration extendedConfiguration2 = abstractBoot0.getExtendedConfig();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractBoot0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(extendedConfiguration2);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest43.test07"); }

    org.jfree.ui.IntegerDocument integerDocument0 = new org.jfree.ui.IntegerDocument();
    javax.swing.text.AttributeSet attributeSet3 = null;
    // The following exception was thrown during execution in test generation
    try {
    integerDocument0.insertString((int)(byte)10, "hi!", attributeSet3);
      org.junit.Assert.fail("Expected exception of type javax.swing.text.BadLocationException");
    } catch (javax.swing.text.BadLocationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest43.test08"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    dateCellRenderer0.setIconTextGap(5);
    dateCellRenderer0.validate();
    int i4 = dateCellRenderer0.getIconTextGap();
    java.awt.Image image5 = null;
    boolean b11 = dateCellRenderer0.imageUpdate(image5, (int)' ', (int)(byte)-1, (int)(short)100, (-1), (int)' ');
    int i12 = dateCellRenderer0.getIconTextGap();
    java.awt.Point point13 = dateCellRenderer0.getMousePosition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point13);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest43.test09"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    applicationFrame1.setExtendedState(6);
    java.awt.Dimension dimension6 = applicationFrame1.size();
    int i7 = applicationFrame1.getY();
    int i8 = applicationFrame1.getCursorType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest43.test10"); }

    java.lang.Class class1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.io.InputStream inputStream2 = org.jfree.util.ObjectUtilities.getResourceRelativeAsStream("VerticalAlignment.CENTER", class1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

}
