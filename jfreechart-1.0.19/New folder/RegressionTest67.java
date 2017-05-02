
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest67 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest67.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    serialDateChooserPanel2.resize(8, (int)(short)-1);
    java.awt.Dimension dimension7 = serialDateChooserPanel2.getPreferredSize();
    boolean b8 = serialDateChooserPanel2.isFocusable();
    java.awt.event.KeyListener keyListener9 = null;
    serialDateChooserPanel2.removeKeyListener(keyListener9);
    javax.swing.JPopupMenu jPopupMenu11 = serialDateChooserPanel2.getComponentPopupMenu();
    java.io.PrintStream printStream12 = null;
    // The following exception was thrown during execution in test generation
    try {
    serialDateChooserPanel2.list(printStream12, (int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu11);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest67.test02"); }

    org.jfree.layout.LCBLayout lCBLayout1 = new org.jfree.layout.LCBLayout(9);
    org.jfree.ui.ApplicationFrame applicationFrame4 = new org.jfree.ui.ApplicationFrame("");
    int i5 = applicationFrame4.getState();
    java.util.Locale locale6 = applicationFrame4.getLocale();
    applicationFrame4.transferFocusUpCycle();
    java.awt.Graphics graphics8 = null;
    applicationFrame4.update(graphics8);
    java.beans.PropertyChangeListener propertyChangeListener10 = null;
    applicationFrame4.removePropertyChangeListener(propertyChangeListener10);
    org.jfree.date.SerialDate serialDate14 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel16 = new org.jfree.ui.SerialDateChooserPanel(serialDate14, true);
    serialDateChooserPanel16.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext21 = serialDateChooserPanel16.getAccessibleContext();
    java.awt.Dimension dimension22 = serialDateChooserPanel16.getPreferredSize();
    org.jfree.date.SerialDate serialDate24 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel26 = new org.jfree.ui.SerialDateChooserPanel(serialDate24, true);
    boolean b27 = serialDateChooserPanel26.getIgnoreRepaint();
    javax.swing.InputMap inputMap28 = serialDateChooserPanel26.getInputMap();
    serialDateChooserPanel16.setInputMap((int)(byte)1, inputMap28);
    java.awt.event.FocusListener[] focusListener_array30 = serialDateChooserPanel16.getFocusListeners();
    org.jfree.ui.ApplicationFrame applicationFrame32 = new org.jfree.ui.ApplicationFrame("");
    int i33 = applicationFrame32.getState();
    java.awt.event.WindowEvent windowEvent34 = null;
    applicationFrame32.windowIconified(windowEvent34);
    applicationFrame32.show();
    javax.swing.JMenuBar jMenuBar37 = applicationFrame32.getJMenuBar();
    java.awt.event.WindowStateListener[] windowStateListener_array38 = applicationFrame32.getWindowStateListeners();
    org.jfree.ui.KeyedComboBoxModel keyedComboBoxModel39 = new org.jfree.ui.KeyedComboBoxModel((java.lang.Object[])focusListener_array30, (java.lang.Object[])windowStateListener_array38);
    org.jfree.ui.ApplicationFrame applicationFrame41 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener42 = null;
    applicationFrame41.removeWindowStateListener(windowStateListener42);
    boolean b44 = applicationFrame41.isValidateRoot();
    org.jfree.date.SerialDate serialDate45 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel47 = new org.jfree.ui.SerialDateChooserPanel(serialDate45, true);
    boolean b48 = serialDateChooserPanel47.getIgnoreRepaint();
    javax.swing.InputMap inputMap49 = serialDateChooserPanel47.getInputMap();
    java.awt.Rectangle rectangle50 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle51 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b52 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle50, (java.awt.geom.Rectangle2D)rectangle51);
    java.awt.Rectangle rectangle53 = serialDateChooserPanel47.getBounds(rectangle51);
    org.jfree.date.SerialDate serialDate54 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel56 = new org.jfree.ui.SerialDateChooserPanel(serialDate54, true);
    boolean b57 = serialDateChooserPanel56.getIgnoreRepaint();
    java.awt.Rectangle rectangle58 = serialDateChooserPanel56.getVisibleRect();
    boolean b59 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle51, (java.awt.Shape)rectangle58);
    applicationFrame41.setMaximizedBounds(rectangle51);
    javax.accessibility.AccessibleContext accessibleContext61 = applicationFrame41.getAccessibleContext();
    java.awt.event.WindowEvent windowEvent62 = null;
    applicationFrame41.windowDeiconified(windowEvent62);
    org.jfree.text.TextBox textBox64 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets65 = textBox64.getInteriorGap();
    java.awt.Rectangle rectangle66 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle67 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b68 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle66, (java.awt.geom.Rectangle2D)rectangle67);
    rectangleInsets65.trim((java.awt.geom.Rectangle2D)rectangle67);
    double d70 = rectangleInsets65.getLeft();
    org.jfree.text.TextBox textBox71 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets72 = textBox71.getInteriorGap();
    java.awt.Rectangle rectangle73 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle74 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b75 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle73, (java.awt.geom.Rectangle2D)rectangle74);
    rectangleInsets72.trim((java.awt.geom.Rectangle2D)rectangle74);
    rectangleInsets65.trim((java.awt.geom.Rectangle2D)rectangle74);
    applicationFrame41.setBounds(rectangle74);
    java.awt.Font font80 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.text.TextFragment textFragment82 = new org.jfree.text.TextFragment("PanelUI");
    java.awt.Paint paint83 = textFragment82.getPaint();
    org.jfree.text.TextFragment textFragment84 = new org.jfree.text.TextFragment("org.jfree.ui.SerialDateChooserPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", font80, paint83);
    keyedComboBoxModel39.add((java.lang.Object)rectangle74, (java.lang.Object)font80);
    org.jfree.ui.FontChooserDialog fontChooserDialog86 = new org.jfree.ui.FontChooserDialog((java.awt.Frame)applicationFrame4, "black", false, font80);
    lCBLayout1.removeLayoutComponent("UnitType.ABSOLUTE", (java.awt.Component)applicationFrame4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowStateListener_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d70 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint83);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest67.test03"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.util.Locale locale3 = applicationFrame1.getLocale();
    java.awt.event.WindowEvent windowEvent4 = null;
    applicationFrame1.windowClosed(windowEvent4);
    applicationFrame1.setExtendedState(7);
    java.lang.String str8 = applicationFrame1.getWarningString();
    java.awt.Container container9 = applicationFrame1.getContentPane();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container9);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest67.test04"); }

    org.jfree.ui.L1R2ButtonPanel l1R2ButtonPanel3 = new org.jfree.ui.L1R2ButtonPanel("", "hi!", "notify-field-accept");
    javax.swing.JButton jButton4 = l1R2ButtonPanel3.getLeftButton();
    float f5 = l1R2ButtonPanel3.getAlignmentY();
    javax.swing.JButton jButton6 = l1R2ButtonPanel3.getLeftButton();
    java.awt.event.MouseMotionListener mouseMotionListener7 = null;
    l1R2ButtonPanel3.addMouseMotionListener(mouseMotionListener7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton6);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest67.test05"); }

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
    java.awt.event.WindowEvent windowEvent22 = null;
    applicationFrame1.windowDeiconified(windowEvent22);
    java.awt.event.FocusListener[] focusListener_array24 = applicationFrame1.getFocusListeners();
    applicationFrame1.repaint((long)(short)-1, 0, 31, (int)(short)1, 6);
    java.awt.Window[] window_array31 = applicationFrame1.getOwnedWindows();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(window_array31);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest67.test06"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    java.awt.LayoutManager layoutManager4 = null;
    applicationFrame1.setLayout(layoutManager4);
    java.beans.PropertyChangeListener propertyChangeListener6 = null;
    applicationFrame1.removePropertyChangeListener(propertyChangeListener6);
    java.awt.event.WindowEvent windowEvent8 = null;
    applicationFrame1.windowActivated(windowEvent8);
    applicationFrame1.toBack();

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest67.test07"); }

    // The following exception was thrown during execution in test generation
    try {
    org.jfree.date.SerialDate serialDate3 = org.jfree.date.SerialDate.createInstance(6, 5, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest67.test08"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.util.Locale locale3 = applicationFrame1.getLocale();
    applicationFrame1.transferFocusUpCycle();
    java.awt.Component component5 = applicationFrame1.getFocusOwner();
    applicationFrame1.toFront();
    applicationFrame1.setFocusCycleRoot(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component5);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest67.test09"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b7 = serialDateChooserPanel2.isFocusTraversable();
    java.awt.Image image8 = null;
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel11 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, true);
    boolean b12 = serialDateChooserPanel11.getIgnoreRepaint();
    javax.swing.InputMap inputMap13 = serialDateChooserPanel11.getInputMap();
    javax.swing.TransferHandler transferHandler14 = null;
    serialDateChooserPanel11.setTransferHandler(transferHandler14);
    javax.swing.plaf.PanelUI panelUI16 = null;
    serialDateChooserPanel11.setUI(panelUI16);
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array18 = serialDateChooserPanel11.getHierarchyBoundsListeners();
    boolean b19 = serialDateChooserPanel2.prepareImage(image8, (java.awt.image.ImageObserver)serialDateChooserPanel11);
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener20 = null;
    serialDateChooserPanel2.addHierarchyBoundsListener(hierarchyBoundsListener20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest67.test10"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    applicationFrame1.setExtendedState(6);
    java.awt.Dimension dimension6 = applicationFrame1.size();
    java.awt.Color color7 = applicationFrame1.getBackground();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color7);

  }

}
