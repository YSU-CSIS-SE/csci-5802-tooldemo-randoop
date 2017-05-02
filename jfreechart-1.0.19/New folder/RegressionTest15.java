
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15.test01"); }

    java.lang.Class class1 = null;
    java.net.URL uRL2 = org.jfree.util.ObjectUtilities.getResource("http://www.jfree.org/jcommon/", class1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(uRL2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15.test02"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    serialDateChooserPanel2.enableInputMethods(true);
    java.lang.String str10 = serialDateChooserPanel2.getToolTipText();
    java.awt.event.ContainerListener containerListener11 = null;
    serialDateChooserPanel2.addContainerListener(containerListener11);
    org.jfree.date.SerialDate serialDate13 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel15 = new org.jfree.ui.SerialDateChooserPanel(serialDate13, true);
    java.awt.Color color16 = serialDateChooserPanel15.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame18 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener19 = null;
    applicationFrame18.removeWindowStateListener(windowStateListener19);
    applicationFrame18.setCursor(0);
    org.jfree.date.SerialDate serialDate23 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate23, true);
    java.awt.Color color26 = serialDateChooserPanel25.getForeground();
    applicationFrame18.setBackground(color26);
    boolean b28 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color16, (java.awt.Paint)color26);
    serialDateChooserPanel2.setBackground(color16);
    boolean b30 = serialDateChooserPanel2.getAutoscrolls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15.test03"); }

    int i0 = javax.swing.SwingConstants.NORTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15.test04"); }

    int i0 = org.jfree.ui.SortButtonRenderer.NONE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15.test05"); }

    int i2 = org.jfree.date.SerialDate.lastDayOfMonth((int)(short)10, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 31);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15.test06"); }

    // The following exception was thrown during execution in test generation
    try {
    org.jfree.date.SpreadsheetDate spreadsheetDate3 = new org.jfree.date.SpreadsheetDate((int)(byte)10, 1, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15.test07"); }

    int i0 = org.jfree.ui.Align.NORTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15.test08"); }

    int i0 = org.jfree.date.SerialDate.SUNDAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15.test09"); }

    int i0 = java.awt.Frame.DEFAULT_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15.test10"); }

    org.jfree.util.ObjectUtilities.setClassLoaderSource("ToolTipText");

  }

}
