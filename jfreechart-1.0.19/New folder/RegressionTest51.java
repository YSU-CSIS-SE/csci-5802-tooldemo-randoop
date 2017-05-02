
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest51 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test01"); }

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
    double d16 = rectangleInsets1.getRight();
    double d18 = rectangleInsets1.extendHeight((double)1.0f);
    
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
    org.junit.Assert.assertTrue(d16 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 3.0d);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test02"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    java.awt.event.ContainerListener containerListener4 = null;
    serialDateChooserPanel2.removeContainerListener(containerListener4);
    java.awt.Image image6 = null;
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel11 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, true);
    serialDateChooserPanel11.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext16 = serialDateChooserPanel11.getAccessibleContext();
    serialDateChooserPanel11.invalidate();
    serialDateChooserPanel11.grabFocus();
    javax.swing.JPopupMenu jPopupMenu19 = null;
    serialDateChooserPanel11.setComponentPopupMenu(jPopupMenu19);
    int i23 = serialDateChooserPanel11.getBaseline(1, 9999);
    int i24 = serialDateChooserPanel2.checkImage(image6, 12, 4, (java.awt.image.ImageObserver)serialDateChooserPanel11);
    org.jfree.text.TextBox textBox25 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets26 = textBox25.getInteriorGap();
    java.awt.Rectangle rectangle27 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle28 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b29 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle27, (java.awt.geom.Rectangle2D)rectangle28);
    rectangleInsets26.trim((java.awt.geom.Rectangle2D)rectangle28);
    double d31 = rectangleInsets26.getLeft();
    org.jfree.ui.ApplicationFrame applicationFrame33 = new org.jfree.ui.ApplicationFrame("");
    java.awt.Rectangle rectangle34 = applicationFrame33.getMaximizedBounds();
    java.awt.event.MouseWheelListener mouseWheelListener35 = null;
    applicationFrame33.removeMouseWheelListener(mouseWheelListener35);
    applicationFrame33.setAutoRequestFocus(true);
    java.awt.event.KeyListener keyListener39 = null;
    applicationFrame33.addKeyListener(keyListener39);
    java.awt.Rectangle rectangle41 = applicationFrame33.bounds();
    java.awt.geom.Rectangle2D rectangle2D42 = rectangleInsets26.createInsetRectangle((java.awt.geom.Rectangle2D)rectangle41);
    java.awt.Rectangle rectangle43 = serialDateChooserPanel2.getBounds(rectangle41);
    java.awt.Shape shape47 = org.jfree.util.ShapeUtilities.rotateShape((java.awt.Shape)rectangle41, (double)(byte)10, (float)3, (float)(byte)100);
    org.jfree.ui.RectangleAnchor rectangleAnchor48 = org.jfree.ui.RectangleAnchor.TOP;
    java.awt.geom.Point2D point2D49 = org.jfree.ui.RectangleAnchor.coordinates((java.awt.geom.Rectangle2D)rectangle41, rectangleAnchor48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d31 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleAnchor48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point2D49);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test03"); }

    boolean b2 = org.jfree.util.StringUtils.endsWithIgnoreCase("org.jfree.ui.SerialDateChooserPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "black");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test04"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    boolean b4 = serialDateChooserPanel2.isCursorSet();
    java.awt.Dimension dimension5 = serialDateChooserPanel2.minimumSize();
    org.jfree.date.SerialDate serialDate6 = serialDateChooserPanel2.getDate();
    javax.swing.KeyStroke keyStroke7 = null;
    int i8 = serialDateChooserPanel2.getConditionForKeyStroke(keyStroke7);
    org.jfree.text.TextBox textBox9 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets10 = textBox9.getInteriorGap();
    double d11 = textBox9.getShadowYOffset();
    serialDateChooserPanel2.putClientProperty((java.lang.Object)d11, (java.lang.Object)31);
    java.awt.Graphics graphics14 = serialDateChooserPanel2.getGraphics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(serialDate6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphics14);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test05"); }

    org.jfree.ui.OverlayLayout overlayLayout1 = new org.jfree.ui.OverlayLayout(true);
    org.jfree.ui.ApplicationFrame applicationFrame3 = new org.jfree.ui.ApplicationFrame("");
    int i4 = applicationFrame3.getState();
    java.awt.event.WindowEvent windowEvent5 = null;
    applicationFrame3.windowIconified(windowEvent5);
    org.jfree.date.SerialDate serialDate7 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel9 = new org.jfree.ui.SerialDateChooserPanel(serialDate7, true);
    serialDateChooserPanel9.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext14 = serialDateChooserPanel9.getAccessibleContext();
    java.awt.Dimension dimension15 = serialDateChooserPanel9.getPreferredSize();
    org.jfree.date.SerialDate serialDate17 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel19 = new org.jfree.ui.SerialDateChooserPanel(serialDate17, true);
    boolean b20 = serialDateChooserPanel19.getIgnoreRepaint();
    javax.swing.InputMap inputMap21 = serialDateChooserPanel19.getInputMap();
    serialDateChooserPanel9.setInputMap((int)(byte)1, inputMap21);
    java.awt.event.FocusListener[] focusListener_array23 = serialDateChooserPanel9.getFocusListeners();
    applicationFrame3.remove((java.awt.Component)serialDateChooserPanel9);
    java.lang.String str25 = serialDateChooserPanel9.getUIClassID();
    java.beans.VetoableChangeListener vetoableChangeListener26 = null;
    serialDateChooserPanel9.removeVetoableChangeListener(vetoableChangeListener26);
    overlayLayout1.layoutContainer((java.awt.Container)serialDateChooserPanel9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "PanelUI"+ "'", str25.equals("PanelUI"));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test06"); }

    java.lang.String str0 = javax.swing.text.AbstractDocument.SectionElementName;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "section"+ "'", str0.equals("section"));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test07"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    boolean b4 = applicationFrame1.isValidateRoot();
    applicationFrame1.doLayout();
    java.awt.Component component6 = applicationFrame1.getGlassPane();
    javax.swing.JLayeredPane jLayeredPane7 = null;
    // The following exception was thrown during execution in test generation
    try {
    applicationFrame1.setLayeredPane(jLayeredPane7);
      org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component6);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test08"); }

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
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array27 = applicationFrame1.getHierarchyBoundsListeners();
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior28 = applicationFrame1.getBaselineResizeBehavior();
    applicationFrame1.show();
    applicationFrame1.setFocusable(false);
    
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
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array27);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior28 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior28.equals(java.awt.Component.BaselineResizeBehavior.OTHER));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test09"); }

    int i0 = org.jfree.date.MonthConstants.FEBRUARY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest51.test10"); }

    java.awt.Insets insets0 = null;
    org.jfree.ui.InsetsChooserPanel insetsChooserPanel1 = new org.jfree.ui.InsetsChooserPanel(insets0);
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior2 = insetsChooserPanel1.getBaselineResizeBehavior();
    java.awt.Graphics graphics3 = null;
    insetsChooserPanel1.paintAll(graphics3);
    insetsChooserPanel1.removeNotify();
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior2 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior2.equals(java.awt.Component.BaselineResizeBehavior.OTHER));

  }

}
