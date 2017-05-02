
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest41 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest41.test01"); }

    int i0 = java.awt.Frame.MAXIMIZED_HORIZ;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest41.test02"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.Rectangle rectangle2 = applicationFrame1.getMaximizedBounds();
    org.jfree.ui.ApplicationFrame applicationFrame4 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent5 = null;
    applicationFrame4.windowDeiconified(windowEvent5);
    applicationFrame4.firePropertyChange("hi!", '#', '4');
    java.awt.FocusTraversalPolicy focusTraversalPolicy11 = applicationFrame4.getFocusTraversalPolicy();
    applicationFrame1.setFocusTraversalPolicy(focusTraversalPolicy11);
    org.jfree.resources.JCommonResources jCommonResources13 = new org.jfree.resources.JCommonResources();
    // The following exception was thrown during execution in test generation
    try {
    applicationFrame1.applyResourceBundle((java.util.ResourceBundle)jCommonResources13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusTraversalPolicy11);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest41.test03"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    java.beans.VetoableChangeListener vetoableChangeListener3 = null;
    serialDateChooserPanel2.removeVetoableChangeListener(vetoableChangeListener3);
    boolean b5 = serialDateChooserPanel2.requestDefaultFocus();
    serialDateChooserPanel2.removeAll();
    boolean b7 = serialDateChooserPanel2.requestFocusInWindow();
    java.io.PrintWriter printWriter8 = null;
    // The following exception was thrown during execution in test generation
    try {
    serialDateChooserPanel2.list(printWriter8, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest41.test04"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    java.awt.Dimension dimension8 = serialDateChooserPanel2.getPreferredSize();
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel11 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, true);
    boolean b12 = serialDateChooserPanel11.getIgnoreRepaint();
    javax.swing.InputMap inputMap13 = serialDateChooserPanel11.getInputMap();
    java.awt.Rectangle rectangle14 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle15 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b16 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle14, (java.awt.geom.Rectangle2D)rectangle15);
    java.awt.Rectangle rectangle17 = serialDateChooserPanel11.getBounds(rectangle15);
    serialDateChooserPanel2.scrollRectToVisible(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest41.test05"); }

    java.lang.Object obj1 = null;
    org.jfree.date.SerialDate serialDate2 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel4 = new org.jfree.ui.SerialDateChooserPanel(serialDate2, true);
    boolean b5 = serialDateChooserPanel4.getIgnoreRepaint();
    javax.swing.InputMap inputMap6 = serialDateChooserPanel4.getInputMap();
    java.awt.Rectangle rectangle7 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle8 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b9 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle7, (java.awt.geom.Rectangle2D)rectangle8);
    java.awt.Rectangle rectangle10 = serialDateChooserPanel4.getBounds(rectangle8);
    org.jfree.util.LogContext logContext12 = new org.jfree.util.LogContext("NO_CHANGE");
    java.lang.Object obj13 = null;
    java.lang.Exception exception15 = null;
    org.jfree.util.StackableRuntimeException stackableRuntimeException16 = new org.jfree.util.StackableRuntimeException("", exception15);
    java.lang.Exception exception17 = stackableRuntimeException16.getParent();
    logContext12.info(obj13, (java.lang.Exception)stackableRuntimeException16);
    org.jfree.util.Log.warn((java.lang.Object)rectangle8, (java.lang.Exception)stackableRuntimeException16);
    org.jfree.util.Log.log(4, obj1, (java.lang.Exception)stackableRuntimeException16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(exception17);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest41.test06"); }

    org.jfree.date.SerialDate serialDate1 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel3 = new org.jfree.ui.SerialDateChooserPanel(serialDate1, true);
    boolean b4 = serialDateChooserPanel3.getIgnoreRepaint();
    java.awt.event.ContainerListener containerListener5 = null;
    serialDateChooserPanel3.removeContainerListener(containerListener5);
    org.jfree.util.Log.SimpleMessage simpleMessage7 = new org.jfree.util.Log.SimpleMessage("hi!", (java.lang.Object)serialDateChooserPanel3);
    javax.swing.border.Border border8 = serialDateChooserPanel3.getBorder();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(border8);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest41.test07"); }

    org.jfree.ui.HorizontalAlignment horizontalAlignment0 = org.jfree.ui.HorizontalAlignment.RIGHT;
    org.jfree.ui.ApplicationFrame applicationFrame2 = new org.jfree.ui.ApplicationFrame("");
    int i3 = applicationFrame2.getState();
    java.awt.event.WindowEvent windowEvent4 = null;
    applicationFrame2.windowIconified(windowEvent4);
    applicationFrame2.removeNotify();
    boolean b7 = horizontalAlignment0.equals((java.lang.Object)applicationFrame2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(horizontalAlignment0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest41.test08"); }

    org.jfree.ui.about.ProjectInfo projectInfo0 = org.jfree.JCommon.INFO;
    projectInfo0.setLicenceText("ToolTipText");
    projectInfo0.setLicenceText("");
    java.util.List list5 = projectInfo0.getContributors();
    projectInfo0.setName("ToolTipText");
    java.lang.String str8 = projectInfo0.getLicenceText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(projectInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest41.test09"); }

    org.jfree.text.TextLine textLine1 = new org.jfree.text.TextLine("NO_CHANGE");
    java.awt.Graphics2D graphics2D2 = null;
    org.jfree.ui.TextAnchor textAnchor5 = org.jfree.ui.TextAnchor.BASELINE_CENTER;
    // The following exception was thrown during execution in test generation
    try {
    textLine1.draw(graphics2D2, (float)10, (float)8, textAnchor5, (float)(byte)0, (float)12, (double)10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor5);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest41.test10"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.isFocusTraversable();
    boolean b4 = serialDateChooserPanel2.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

}
