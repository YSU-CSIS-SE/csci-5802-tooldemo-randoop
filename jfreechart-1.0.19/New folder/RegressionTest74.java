
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest74 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest74.test01"); }

    java.io.ObjectInputStream objectInputStream0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Paint paint1 = org.jfree.io.SerialUtilities.readPaint(objectInputStream0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest74.test02"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    java.awt.Cursor cursor4 = null;
    applicationFrame1.setCursor(cursor4);
    java.awt.event.WindowEvent windowEvent6 = null;
    applicationFrame1.windowClosed(windowEvent6);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest74.test03"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    applicationFrame1.firePropertyChange("hi!", '#', '4');
    java.awt.Rectangle rectangle8 = applicationFrame1.getMaximizedBounds();
    java.awt.Rectangle rectangle9 = applicationFrame1.getMaximizedBounds();
    boolean b10 = applicationFrame1.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest74.test04"); }

    org.jfree.text.TextLine textLine1 = new org.jfree.text.TextLine("ThreadContext");
    org.jfree.text.TextFragment textFragment3 = new org.jfree.text.TextFragment("PanelUI");
    java.awt.Paint paint4 = textFragment3.getPaint();
    java.lang.String str5 = textFragment3.getText();
    java.lang.String str6 = textFragment3.getText();
    textLine1.addFragment(textFragment3);
    float f8 = textFragment3.getBaselineOffset();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "PanelUI"+ "'", str5.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "PanelUI"+ "'", str6.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f8 == 0.0f);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest74.test05"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    boolean b4 = applicationFrame1.isShowing();
    applicationFrame1.toBack();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest74.test06"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    boolean b4 = serialDateChooserPanel2.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array5 = serialDateChooserPanel2.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    boolean b9 = serialDateChooserPanel8.getIgnoreRepaint();
    serialDateChooserPanel8.setAlignmentX((float)(byte)10);
    java.awt.Component component12 = serialDateChooserPanel2.add((java.awt.Component)serialDateChooserPanel8);
    boolean b13 = serialDateChooserPanel8.isEnabled();
    java.awt.Graphics graphics14 = serialDateChooserPanel8.getGraphics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphics14);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest74.test07"); }

    org.jfree.date.SerialDate serialDate3 = org.jfree.date.SerialDate.createInstance(5);
    org.jfree.date.SerialDate serialDate4 = org.jfree.date.SerialDate.addDays((int)(short)1, serialDate3);
    org.jfree.date.SerialDate serialDate5 = org.jfree.date.SerialDate.getFollowingDayOfWeek(7, serialDate4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate5);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest74.test08"); }

    org.jfree.ui.L1R3ButtonPanel l1R3ButtonPanel4 = new org.jfree.ui.L1R3ButtonPanel("TableOrder.BY_COLUMN", "ClassContext", "http://www.jfree.org/jcommon/", "ToolTipText");
    org.jfree.layout.RadialLayout radialLayout5 = new org.jfree.layout.RadialLayout();
    l1R3ButtonPanel4.setLayout((java.awt.LayoutManager)radialLayout5);
    javax.swing.JButton jButton7 = l1R3ButtonPanel4.getRightButton3();
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.awt.AWTKeyStroke> set_aWTKeyStroke9 = l1R3ButtonPanel4.getFocusTraversalKeys(5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton7);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest74.test09"); }

    org.jfree.ui.RectangleEdge rectangleEdge0 = org.jfree.ui.RectangleEdge.LEFT;
    boolean b1 = org.jfree.ui.RectangleEdge.isLeftOrRight(rectangleEdge0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleEdge0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest74.test10"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.awt.event.WindowEvent windowEvent3 = null;
    applicationFrame1.windowIconified(windowEvent3);
    org.jfree.date.SerialDate serialDate5 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel7 = new org.jfree.ui.SerialDateChooserPanel(serialDate5, true);
    serialDateChooserPanel7.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext12 = serialDateChooserPanel7.getAccessibleContext();
    java.awt.Dimension dimension13 = serialDateChooserPanel7.getPreferredSize();
    org.jfree.date.SerialDate serialDate15 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel17 = new org.jfree.ui.SerialDateChooserPanel(serialDate15, true);
    boolean b18 = serialDateChooserPanel17.getIgnoreRepaint();
    javax.swing.InputMap inputMap19 = serialDateChooserPanel17.getInputMap();
    serialDateChooserPanel7.setInputMap((int)(byte)1, inputMap19);
    java.awt.event.FocusListener[] focusListener_array21 = serialDateChooserPanel7.getFocusListeners();
    applicationFrame1.remove((java.awt.Component)serialDateChooserPanel7);
    java.awt.Event event23 = null;
    boolean b26 = applicationFrame1.mouseUp(event23, (int)(short)10, (int)'#');
    applicationFrame1.setExtendedState(4);
    java.awt.Window window29 = applicationFrame1.getOwner();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(window29);

  }

}
