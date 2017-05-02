
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest50 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest50.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b7 = serialDateChooserPanel2.isFocusTraversable();
    org.jfree.ui.ApplicationFrame applicationFrame9 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener10 = null;
    applicationFrame9.removeWindowStateListener(windowStateListener10);
    java.awt.Cursor cursor12 = null;
    applicationFrame9.setCursor(cursor12);
    java.awt.Image image14 = null;
    boolean b20 = applicationFrame9.imageUpdate(image14, (int)'4', (int)(short)1, 8, (int)(byte)100, (int)'#');
    java.awt.Dimension dimension21 = applicationFrame9.getPreferredSize();
    java.awt.Dimension dimension22 = serialDateChooserPanel2.getSize(dimension21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension22);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest50.test02"); }

    org.jfree.io.IOUtils iOUtils0 = org.jfree.io.IOUtils.getInstance();
    java.io.InputStream inputStream1 = null;
    java.io.OutputStream outputStream2 = null;
    // The following exception was thrown during execution in test generation
    try {
    iOUtils0.copyStreams(inputStream1, outputStream2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iOUtils0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest50.test03"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    org.jfree.date.SerialDate serialDate3 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel5 = new org.jfree.ui.SerialDateChooserPanel(serialDate3, true);
    serialDateChooserPanel5.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext10 = serialDateChooserPanel5.getAccessibleContext();
    java.awt.Dimension dimension11 = serialDateChooserPanel5.getPreferredSize();
    applicationFrame1.setSize(dimension11);
    applicationFrame1.pack();
    applicationFrame1.setEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest50.test04"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    java.awt.Rectangle rectangle2 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle3 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b4 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle2, (java.awt.geom.Rectangle2D)rectangle3);
    rectangleInsets1.trim((java.awt.geom.Rectangle2D)rectangle3);
    double d6 = rectangleInsets1.getLeft();
    org.jfree.ui.ApplicationFrame applicationFrame8 = new org.jfree.ui.ApplicationFrame("");
    java.awt.Rectangle rectangle9 = applicationFrame8.getMaximizedBounds();
    java.awt.event.MouseWheelListener mouseWheelListener10 = null;
    applicationFrame8.removeMouseWheelListener(mouseWheelListener10);
    applicationFrame8.setAutoRequestFocus(true);
    java.awt.event.KeyListener keyListener14 = null;
    applicationFrame8.addKeyListener(keyListener14);
    java.awt.Rectangle rectangle16 = applicationFrame8.bounds();
    java.awt.geom.Rectangle2D rectangle2D17 = rectangleInsets1.createInsetRectangle((java.awt.geom.Rectangle2D)rectangle16);
    org.jfree.date.SerialDate serialDate18 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel20 = new org.jfree.ui.SerialDateChooserPanel(serialDate18, true);
    boolean b21 = serialDateChooserPanel20.getIgnoreRepaint();
    boolean b22 = serialDateChooserPanel20.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array23 = serialDateChooserPanel20.getPropertyChangeListeners();
    javax.swing.InputMap inputMap24 = serialDateChooserPanel20.getInputMap();
    boolean b25 = serialDateChooserPanel20.isForegroundSet();
    serialDateChooserPanel20.layout();
    javax.swing.KeyStroke keyStroke27 = null;
    int i28 = serialDateChooserPanel20.getConditionForKeyStroke(keyStroke27);
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
    serialDateChooserPanel20.scrollRectToVisible(rectangle39);
    boolean b44 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle2D17, (java.awt.Shape)rectangle39);
    
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
    org.junit.Assert.assertNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));
    
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
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest50.test05"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument1 = new org.jfree.ui.LengthLimitingDocument(4);
    // The following exception was thrown during execution in test generation
    try {
    lengthLimitingDocument1.readUnlock();
      org.junit.Assert.fail("Expected exception of type javax.swing.text.StateInvariantError");
    } catch (java.lang.Error e) {
      // Expected exception.
    }

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest50.test06"); }

    org.jfree.date.SerialDate serialDate1 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel3 = new org.jfree.ui.SerialDateChooserPanel(serialDate1, true);
    boolean b4 = serialDateChooserPanel3.getIgnoreRepaint();
    serialDateChooserPanel3.resize(8, (int)(short)-1);
    java.awt.Dimension dimension8 = serialDateChooserPanel3.getPreferredSize();
    java.lang.Exception exception10 = null;
    org.jfree.util.StackableRuntimeException stackableRuntimeException11 = new org.jfree.util.StackableRuntimeException("", exception10);
    org.jfree.util.Log.log((int)(byte)10, (java.lang.Object)dimension8, (java.lang.Exception)stackableRuntimeException11);
    java.lang.Throwable[] throwable_array13 = stackableRuntimeException11.getSuppressed();
    java.lang.Exception exception15 = null;
    org.jfree.util.StackableRuntimeException stackableRuntimeException16 = new org.jfree.util.StackableRuntimeException("", exception15);
    java.lang.Exception exception17 = stackableRuntimeException16.getParent();
    // The following exception was thrown during execution in test generation
    try {
    stackableRuntimeException11.addSuppressed((java.lang.Throwable)exception17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(exception17);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest50.test07"); }

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
    org.jfree.util.UnitType unitType17 = rectangleInsets1.getUnitType();
    org.jfree.date.SerialDate serialDate18 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel20 = new org.jfree.ui.SerialDateChooserPanel(serialDate18, true);
    boolean b21 = serialDateChooserPanel20.getIgnoreRepaint();
    javax.swing.InputMap inputMap22 = serialDateChooserPanel20.getInputMap();
    java.awt.Rectangle rectangle23 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle24 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b25 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle23, (java.awt.geom.Rectangle2D)rectangle24);
    java.awt.Rectangle rectangle26 = serialDateChooserPanel20.getBounds(rectangle24);
    org.jfree.date.SerialDate serialDate27 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel29 = new org.jfree.ui.SerialDateChooserPanel(serialDate27, true);
    boolean b30 = serialDateChooserPanel29.getIgnoreRepaint();
    java.awt.Rectangle rectangle31 = serialDateChooserPanel29.getVisibleRect();
    boolean b32 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle24, (java.awt.Shape)rectangle31);
    java.awt.geom.Rectangle2D rectangle2D35 = rectangleInsets1.createInsetRectangle((java.awt.geom.Rectangle2D)rectangle24, true, false);
    
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
    org.junit.Assert.assertNotNull(unitType17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D35);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest50.test08"); }

    org.jfree.ui.VerticalAlignment verticalAlignment0 = org.jfree.ui.VerticalAlignment.CENTER;
    java.lang.String str1 = verticalAlignment0.toString();
    org.jfree.ui.ApplicationFrame applicationFrame3 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent4 = null;
    applicationFrame3.windowDeiconified(windowEvent4);
    java.awt.LayoutManager layoutManager6 = null;
    applicationFrame3.setLayout(layoutManager6);
    java.awt.event.WindowFocusListener windowFocusListener8 = null;
    applicationFrame3.removeWindowFocusListener(windowFocusListener8);
    boolean b10 = verticalAlignment0.equals((java.lang.Object)windowFocusListener8);
    java.lang.String str11 = verticalAlignment0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(verticalAlignment0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "VerticalAlignment.CENTER"+ "'", str1.equals("VerticalAlignment.CENTER"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "VerticalAlignment.CENTER"+ "'", str11.equals("VerticalAlignment.CENTER"));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest50.test09"); }

    org.jfree.resources.JCommonResources jCommonResources0 = new org.jfree.resources.JCommonResources();
    java.lang.Exception exception1 = null;
    org.jfree.util.Log.debug((java.lang.Object)jCommonResources0, exception1);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest50.test10"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    java.awt.Cursor cursor4 = null;
    applicationFrame1.setCursor(cursor4);
    java.util.Locale locale6 = applicationFrame1.getLocale();
    // The following exception was thrown during execution in test generation
    try {
    applicationFrame1.setDefaultCloseOperation(31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale6);

  }

}
