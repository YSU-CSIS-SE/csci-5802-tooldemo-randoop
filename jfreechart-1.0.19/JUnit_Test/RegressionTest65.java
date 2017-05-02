
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest65 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest65.test01"); }

    org.jfree.text.TextFragment textFragment1 = new org.jfree.text.TextFragment("NO_CHANGE");
    java.awt.Graphics2D graphics2D2 = null;
    org.jfree.ui.TextAnchor textAnchor3 = org.jfree.ui.TextAnchor.BOTTOM_RIGHT;
    boolean b4 = textAnchor3.isTop();
    org.jfree.text.TextBox textBox5 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets6 = textBox5.getInteriorGap();
    java.awt.Rectangle rectangle7 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle8 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b9 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle7, (java.awt.geom.Rectangle2D)rectangle8);
    rectangleInsets6.trim((java.awt.geom.Rectangle2D)rectangle8);
    double d11 = rectangleInsets6.getLeft();
    org.jfree.text.TextBox textBox12 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets13 = textBox12.getInteriorGap();
    java.awt.Rectangle rectangle14 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle15 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b16 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle14, (java.awt.geom.Rectangle2D)rectangle15);
    rectangleInsets13.trim((java.awt.geom.Rectangle2D)rectangle15);
    rectangleInsets6.trim((java.awt.geom.Rectangle2D)rectangle15);
    boolean b19 = textAnchor3.equals((java.lang.Object)rectangleInsets6);
    // The following exception was thrown during execution in test generation
    try {
    float f20 = textFragment1.calculateBaselineOffset(graphics2D2, textAnchor3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest65.test02"); }

    int i0 = org.jfree.date.SerialDate.INCLUDE_BOTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest65.test03"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    java.awt.Rectangle rectangle2 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle3 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b4 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle2, (java.awt.geom.Rectangle2D)rectangle3);
    rectangleInsets1.trim((java.awt.geom.Rectangle2D)rectangle3);
    double d6 = rectangleInsets1.getLeft();
    org.jfree.text.TextBox textBox7 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets8 = textBox7.getInteriorGap();
    java.awt.Rectangle rectangle9 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle10 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b11 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle9, (java.awt.geom.Rectangle2D)rectangle10);
    rectangleInsets8.trim((java.awt.geom.Rectangle2D)rectangle10);
    rectangleInsets1.trim((java.awt.geom.Rectangle2D)rectangle10);
    double d15 = rectangleInsets1.calculateBottomInset((double)(byte)-1);
    org.jfree.util.UnitType unitType16 = rectangleInsets1.getUnitType();
    boolean b18 = unitType16.equals((java.lang.Object)"Jan");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(unitType16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest65.test04"); }

    org.jfree.ui.ApplicationFrame applicationFrame2 = new org.jfree.ui.ApplicationFrame("");
    int i3 = applicationFrame2.getState();
    java.util.Locale locale4 = applicationFrame2.getLocale();
    java.util.ResourceBundle.Control control5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle6 = java.util.ResourceBundle.getBundle("Rotation.CLOCKWISE", locale4, control5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale4);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest65.test05"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    applicationFrame1.setLocationByPlatform(false);
    org.jfree.ui.ApplicationFrame applicationFrame6 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener7 = null;
    applicationFrame6.removeWindowStateListener(windowStateListener7);
    boolean b9 = applicationFrame6.isValidateRoot();
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel12 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    boolean b13 = serialDateChooserPanel12.getIgnoreRepaint();
    javax.swing.InputMap inputMap14 = serialDateChooserPanel12.getInputMap();
    java.awt.Rectangle rectangle15 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle16 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b17 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle15, (java.awt.geom.Rectangle2D)rectangle16);
    java.awt.Rectangle rectangle18 = serialDateChooserPanel12.getBounds(rectangle16);
    org.jfree.date.SerialDate serialDate19 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel21 = new org.jfree.ui.SerialDateChooserPanel(serialDate19, true);
    boolean b22 = serialDateChooserPanel21.getIgnoreRepaint();
    java.awt.Rectangle rectangle23 = serialDateChooserPanel21.getVisibleRect();
    boolean b24 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle16, (java.awt.Shape)rectangle23);
    applicationFrame6.setMaximizedBounds(rectangle16);
    javax.accessibility.AccessibleContext accessibleContext26 = applicationFrame6.getAccessibleContext();
    java.awt.event.WindowEvent windowEvent27 = null;
    applicationFrame6.windowDeiconified(windowEvent27);
    org.jfree.text.TextBox textBox29 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets30 = textBox29.getInteriorGap();
    java.awt.Rectangle rectangle31 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle32 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b33 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle31, (java.awt.geom.Rectangle2D)rectangle32);
    rectangleInsets30.trim((java.awt.geom.Rectangle2D)rectangle32);
    double d35 = rectangleInsets30.getLeft();
    org.jfree.text.TextBox textBox36 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets37 = textBox36.getInteriorGap();
    java.awt.Rectangle rectangle38 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle39 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b40 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle38, (java.awt.geom.Rectangle2D)rectangle39);
    rectangleInsets37.trim((java.awt.geom.Rectangle2D)rectangle39);
    rectangleInsets30.trim((java.awt.geom.Rectangle2D)rectangle39);
    applicationFrame6.setBounds(rectangle39);
    applicationFrame1.setMaximizedBounds(rectangle39);
    int i45 = applicationFrame1.getCursorType();
    boolean b46 = applicationFrame1.isAlwaysOnTop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d35 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest65.test06"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    serialDateChooserPanel2.setAlignmentX((float)(byte)10);
    java.awt.Dimension dimension6 = serialDateChooserPanel2.getMaximumSize();
    java.awt.Component component7 = serialDateChooserPanel2.getNextFocusableComponent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component7);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest65.test07"); }

    int i1 = org.jfree.date.SerialDate.leapYearCount(8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-458));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest65.test08"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    serialDateChooserPanel2.invalidate();
    serialDateChooserPanel2.grabFocus();
    javax.swing.JPopupMenu jPopupMenu10 = null;
    serialDateChooserPanel2.setComponentPopupMenu(jPopupMenu10);
    int i14 = serialDateChooserPanel2.getBaseline(1, 9999);
    org.jfree.date.SerialDate serialDate15 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel17 = new org.jfree.ui.SerialDateChooserPanel(serialDate15, true);
    boolean b18 = serialDateChooserPanel17.getIgnoreRepaint();
    serialDateChooserPanel17.setAlignmentX((float)(byte)10);
    java.awt.Dimension dimension21 = serialDateChooserPanel17.getMaximumSize();
    serialDateChooserPanel2.setMaximumSize(dimension21);
    int i23 = serialDateChooserPanel2.getHeight();
    org.jfree.date.SerialDate serialDate25 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel27 = new org.jfree.ui.SerialDateChooserPanel(serialDate25, true);
    boolean b28 = serialDateChooserPanel27.getIgnoreRepaint();
    javax.swing.InputMap inputMap29 = serialDateChooserPanel27.getInputMap();
    // The following exception was thrown during execution in test generation
    try {
    serialDateChooserPanel2.setInputMap(6, inputMap29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap29);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest65.test09"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    org.jfree.date.SerialDate serialDate3 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel5 = new org.jfree.ui.SerialDateChooserPanel(serialDate3, true);
    serialDateChooserPanel5.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext10 = serialDateChooserPanel5.getAccessibleContext();
    java.awt.Dimension dimension11 = serialDateChooserPanel5.getPreferredSize();
    applicationFrame1.setSize(dimension11);
    javax.swing.JRootPane jRootPane13 = applicationFrame1.getRootPane();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jRootPane13);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest65.test10"); }

    org.jfree.io.IOUtils iOUtils0 = org.jfree.io.IOUtils.getInstance();
    java.io.InputStream inputStream1 = null;
    java.io.OutputStream outputStream2 = null;
    // The following exception was thrown during execution in test generation
    try {
    iOUtils0.copyStreams(inputStream1, outputStream2, 9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iOUtils0);

  }

}
