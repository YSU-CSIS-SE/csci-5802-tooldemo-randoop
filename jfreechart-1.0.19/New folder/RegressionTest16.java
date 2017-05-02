
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16.test01"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    boolean b4 = applicationFrame1.isValidateRoot();
    org.jfree.date.SerialDate serialDate5 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel7 = new org.jfree.ui.SerialDateChooserPanel(serialDate5, true);
    boolean b8 = serialDateChooserPanel7.getIgnoreRepaint();
    javax.swing.InputMap inputMap9 = serialDateChooserPanel7.getInputMap();
    java.awt.Rectangle rectangle10 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle11 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b12 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle10, (java.awt.geom.Rectangle2D)rectangle11);
    java.awt.Rectangle rectangle13 = serialDateChooserPanel7.getBounds(rectangle11);
    org.jfree.date.SerialDate serialDate14 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel16 = new org.jfree.ui.SerialDateChooserPanel(serialDate14, true);
    boolean b17 = serialDateChooserPanel16.getIgnoreRepaint();
    java.awt.Rectangle rectangle18 = serialDateChooserPanel16.getVisibleRect();
    boolean b19 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle11, (java.awt.Shape)rectangle18);
    applicationFrame1.setMaximizedBounds(rectangle11);
    javax.accessibility.AccessibleContext accessibleContext21 = applicationFrame1.getAccessibleContext();
    applicationFrame1.setAlwaysOnTop(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext21);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16.test02"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    float f1 = dateCellRenderer0.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f1 == 0.5f);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16.test03"); }

    org.jfree.ui.Layer layer0 = org.jfree.ui.Layer.FOREGROUND;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(layer0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16.test04"); }

    org.jfree.date.SerialDate serialDate1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.date.SerialDate serialDate2 = org.jfree.date.SerialDate.addDays(8, serialDate1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16.test05"); }

    int i0 = org.jfree.date.SerialDate.SECOND_WEEK_IN_MONTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16.test06"); }

    int i0 = java.awt.Frame.NW_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 6);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16.test07"); }

    java.lang.Comparable[] comparable_array2 = new java.lang.Comparable[] { "content", 100.0f };
    java.lang.Comparable[] comparable_array9 = new java.lang.Comparable[] { 1.0f, "http://www.jfree.org/jcommon/", 1, 100.0f, "notify-field-accept", 0L };
    // The following exception was thrown during execution in test generation
    try {
    int i10 = org.jfree.util.ArrayUtilities.compareVersionArrays(comparable_array2, comparable_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparable_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(comparable_array9);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16.test08"); }

    org.jfree.text.TextLine textLine1 = new org.jfree.text.TextLine("NO_CHANGE");
    java.awt.Graphics2D graphics2D2 = null;
    org.jfree.ui.TextAnchor textAnchor5 = org.jfree.ui.TextAnchor.BASELINE_CENTER;
    // The following exception was thrown during execution in test generation
    try {
    textLine1.draw(graphics2D2, (float)(-1L), 100.0f, textAnchor5, (float)(short)1, (float)10L, (double)9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor5);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16.test09"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.awt.event.WindowEvent windowEvent3 = null;
    applicationFrame1.windowIconified(windowEvent3);
    applicationFrame1.show();
    javax.swing.JMenuBar jMenuBar6 = applicationFrame1.getJMenuBar();
    float f7 = applicationFrame1.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 0.5f);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16.test10"); }

    java.util.ResourceBundle.clearCache();

  }

}
