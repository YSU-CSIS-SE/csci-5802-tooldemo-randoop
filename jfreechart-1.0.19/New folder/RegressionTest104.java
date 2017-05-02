
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest104 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest104.test01"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    applicationFrame1.setCursor(0);
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    java.awt.Color color9 = serialDateChooserPanel8.getForeground();
    applicationFrame1.setBackground(color9);
    java.awt.event.MouseWheelListener mouseWheelListener11 = null;
    applicationFrame1.removeMouseWheelListener(mouseWheelListener11);
    org.jfree.ui.RefineryUtilities.positionFrameOnScreen((java.awt.Window)applicationFrame1, (double)7, 7.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color9);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest104.test02"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    org.jfree.date.SerialDate serialDate8 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel10 = new org.jfree.ui.SerialDateChooserPanel(serialDate8, true);
    boolean b11 = serialDateChooserPanel10.getIgnoreRepaint();
    javax.swing.InputMap inputMap12 = serialDateChooserPanel10.getInputMap();
    javax.swing.TransferHandler transferHandler13 = null;
    serialDateChooserPanel10.setTransferHandler(transferHandler13);
    javax.swing.plaf.PanelUI panelUI15 = null;
    serialDateChooserPanel10.setUI(panelUI15);
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array17 = serialDateChooserPanel10.getHierarchyBoundsListeners();
    java.awt.Dimension dimension18 = serialDateChooserPanel10.minimumSize();
    java.awt.Rectangle rectangle19 = serialDateChooserPanel10.bounds();
    javax.swing.JPopupMenu jPopupMenu20 = null;
    serialDateChooserPanel10.setComponentPopupMenu(jPopupMenu20);
    boolean b22 = org.jfree.util.ObjectUtilities.equal((java.lang.Object)serialDateChooserPanel2, (java.lang.Object)serialDateChooserPanel10);
    javax.swing.border.Border border23 = null;
    serialDateChooserPanel2.setBorder(border23);
    javax.swing.KeyStroke keyStroke25 = null;
    serialDateChooserPanel2.unregisterKeyboardAction(keyStroke25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest104.test03"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    applicationFrame1.firePropertyChange("hi!", '#', '4');
    boolean b8 = applicationFrame1.isFocusableWindow();
    boolean b9 = applicationFrame1.isFocusCycleRoot();
    applicationFrame1.show();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest104.test04"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    applicationFrame1.setExtendedState(6);
    java.awt.Dimension dimension6 = applicationFrame1.size();
    int i7 = applicationFrame1.getY();
    org.jfree.text.TextBox textBox8 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets9 = textBox8.getInteriorGap();
    java.awt.Rectangle rectangle10 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle11 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b12 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle10, (java.awt.geom.Rectangle2D)rectangle11);
    rectangleInsets9.trim((java.awt.geom.Rectangle2D)rectangle11);
    double d14 = rectangleInsets9.getLeft();
    org.jfree.text.TextBox textBox15 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets16 = textBox15.getInteriorGap();
    java.awt.Rectangle rectangle17 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle18 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b19 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle17, (java.awt.geom.Rectangle2D)rectangle18);
    rectangleInsets16.trim((java.awt.geom.Rectangle2D)rectangle18);
    rectangleInsets9.trim((java.awt.geom.Rectangle2D)rectangle18);
    applicationFrame1.setMaximizedBounds(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest104.test05"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("Jan");
    java.awt.Font font3 = org.jfree.text.TextFragment.DEFAULT_FONT;
    java.awt.Font font5 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    java.awt.Color color9 = serialDateChooserPanel8.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame11 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener12 = null;
    applicationFrame11.removeWindowStateListener(windowStateListener12);
    applicationFrame11.setCursor(0);
    org.jfree.date.SerialDate serialDate16 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel18 = new org.jfree.ui.SerialDateChooserPanel(serialDate16, true);
    java.awt.Color color19 = serialDateChooserPanel18.getForeground();
    applicationFrame11.setBackground(color19);
    boolean b21 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color9, (java.awt.Paint)color19);
    org.jfree.text.TextFragment textFragment22 = new org.jfree.text.TextFragment("ClassContext", font5, (java.awt.Paint)color19);
    org.jfree.text.TextBlock textBlock23 = org.jfree.text.TextUtilities.createTextBlock("TableOrder.BY_COLUMN", font3, (java.awt.Paint)color19);
    applicationFrame1.setBackground(color19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlock23);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest104.test06"); }

    org.jfree.ui.L1R1ButtonPanel l1R1ButtonPanel2 = new org.jfree.ui.L1R1ButtonPanel("", "LabelUI");
    javax.swing.JButton jButton3 = l1R1ButtonPanel2.getLeftButton();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array4 = jButton3.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array4);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest104.test07"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    applicationFrame1.setFocusCycleRoot(false);
    java.awt.Point point7 = applicationFrame1.getMousePosition(false);
    java.lang.Object obj8 = applicationFrame1.getTreeLock();
    boolean b9 = applicationFrame1.getFocusTraversalKeysEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest104.test08"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    java.awt.Color color3 = serialDateChooserPanel2.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame5 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener6 = null;
    applicationFrame5.removeWindowStateListener(windowStateListener6);
    applicationFrame5.setCursor(0);
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel12 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    java.awt.Color color13 = serialDateChooserPanel12.getForeground();
    applicationFrame5.setBackground(color13);
    boolean b15 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color3, (java.awt.Paint)color13);
    org.jfree.ui.RectangleAnchor rectangleAnchor16 = org.jfree.ui.RectangleAnchor.BOTTOM_RIGHT;
    org.jfree.ui.DateCellRenderer dateCellRenderer17 = new org.jfree.ui.DateCellRenderer();
    int i18 = dateCellRenderer17.getDisplayedMnemonic();
    java.lang.String str19 = dateCellRenderer17.getText();
    java.awt.ComponentOrientation componentOrientation20 = null;
    dateCellRenderer17.setComponentOrientation(componentOrientation20);
    org.jfree.ui.DateCellRenderer dateCellRenderer22 = new org.jfree.ui.DateCellRenderer();
    int i23 = dateCellRenderer22.getDisplayedMnemonic();
    java.lang.String str24 = dateCellRenderer22.getText();
    java.awt.ComponentOrientation componentOrientation25 = null;
    dateCellRenderer22.setComponentOrientation(componentOrientation25);
    org.jfree.date.SerialDate serialDate27 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel29 = new org.jfree.ui.SerialDateChooserPanel(serialDate27, true);
    boolean b30 = serialDateChooserPanel29.getIgnoreRepaint();
    boolean b31 = serialDateChooserPanel29.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array32 = serialDateChooserPanel29.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate33 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel35 = new org.jfree.ui.SerialDateChooserPanel(serialDate33, true);
    boolean b36 = serialDateChooserPanel35.getIgnoreRepaint();
    serialDateChooserPanel35.setAlignmentX((float)(byte)10);
    java.awt.Component component39 = serialDateChooserPanel29.add((java.awt.Component)serialDateChooserPanel35);
    org.jfree.date.SerialDate serialDate40 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel42 = new org.jfree.ui.SerialDateChooserPanel(serialDate40, true);
    java.awt.Color color43 = serialDateChooserPanel42.getForeground();
    component39.setForeground(color43);
    dateCellRenderer22.setForeground(color43);
    dateCellRenderer17.setForeground(color43);
    boolean b47 = rectangleAnchor16.equals((java.lang.Object)color43);
    org.jfree.date.SerialDate serialDate48 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel50 = new org.jfree.ui.SerialDateChooserPanel(serialDate48, true);
    java.awt.Color color51 = serialDateChooserPanel50.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame53 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener54 = null;
    applicationFrame53.removeWindowStateListener(windowStateListener54);
    applicationFrame53.setCursor(0);
    org.jfree.date.SerialDate serialDate58 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel60 = new org.jfree.ui.SerialDateChooserPanel(serialDate58, true);
    java.awt.Color color61 = serialDateChooserPanel60.getForeground();
    applicationFrame53.setBackground(color61);
    boolean b63 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color51, (java.awt.Paint)color61);
    org.jfree.ui.BevelArrowIcon bevelArrowIcon66 = new org.jfree.ui.BevelArrowIcon(color13, color43, color61, (int)(short)100, 9);
    org.jfree.ui.PaintSample paintSample67 = new org.jfree.ui.PaintSample((java.awt.Paint)color43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleAnchor16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest104.test09"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    serialDateChooserPanel2.resize(8, (int)(short)-1);
    java.awt.Dimension dimension7 = serialDateChooserPanel2.getPreferredSize();
    serialDateChooserPanel2.setAutoscrolls(true);
    boolean b10 = serialDateChooserPanel2.getVerifyInputWhenFocusTarget();
    serialDateChooserPanel2.layout();
    int i12 = serialDateChooserPanel2.getWidth();
    boolean b13 = serialDateChooserPanel2.isRequestFocusEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest104.test10"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    java.awt.LayoutManager layoutManager4 = null;
    applicationFrame1.setLayout(layoutManager4);
    java.beans.PropertyChangeListener propertyChangeListener6 = null;
    applicationFrame1.removePropertyChangeListener(propertyChangeListener6);
    java.awt.Image image8 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer9 = new org.jfree.ui.DateCellRenderer();
    int i10 = dateCellRenderer9.getDisplayedMnemonic();
    dateCellRenderer9.validate();
    int i12 = applicationFrame1.checkImage(image8, (java.awt.image.ImageObserver)dateCellRenderer9);
    int i13 = dateCellRenderer9.getVerticalTextPosition();
    javax.swing.Icon icon14 = dateCellRenderer9.getIcon();
    org.jfree.ui.ApplicationFrame applicationFrame16 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener17 = null;
    applicationFrame16.removeWindowStateListener(windowStateListener17);
    applicationFrame16.setExtendedState(6);
    java.awt.Dimension dimension21 = applicationFrame16.size();
    dateCellRenderer9.setPreferredSize(dimension21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension21);

  }

}
