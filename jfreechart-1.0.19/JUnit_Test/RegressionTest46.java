
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest46 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest46.test01"); }

    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel0 = new org.jfree.ui.SerialDateChooserPanel();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest46.test02"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    double d2 = textBox0.getShadowYOffset();
    org.jfree.text.TextFragment textFragment4 = new org.jfree.text.TextFragment("PanelUI");
    java.awt.Paint paint5 = textFragment4.getPaint();
    textBox0.setShadowPaint(paint5);
    java.awt.Graphics2D graphics2D7 = null;
    org.jfree.ui.Size2D size2D10 = new org.jfree.ui.Size2D();
    size2D10.setWidth((double)100);
    org.jfree.ui.RectangleAnchor rectangleAnchor15 = org.jfree.ui.RectangleAnchor.BOTTOM_RIGHT;
    org.jfree.ui.DateCellRenderer dateCellRenderer16 = new org.jfree.ui.DateCellRenderer();
    int i17 = dateCellRenderer16.getDisplayedMnemonic();
    java.lang.String str18 = dateCellRenderer16.getText();
    java.awt.ComponentOrientation componentOrientation19 = null;
    dateCellRenderer16.setComponentOrientation(componentOrientation19);
    org.jfree.ui.DateCellRenderer dateCellRenderer21 = new org.jfree.ui.DateCellRenderer();
    int i22 = dateCellRenderer21.getDisplayedMnemonic();
    java.lang.String str23 = dateCellRenderer21.getText();
    java.awt.ComponentOrientation componentOrientation24 = null;
    dateCellRenderer21.setComponentOrientation(componentOrientation24);
    org.jfree.date.SerialDate serialDate26 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel28 = new org.jfree.ui.SerialDateChooserPanel(serialDate26, true);
    boolean b29 = serialDateChooserPanel28.getIgnoreRepaint();
    boolean b30 = serialDateChooserPanel28.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array31 = serialDateChooserPanel28.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate32 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel34 = new org.jfree.ui.SerialDateChooserPanel(serialDate32, true);
    boolean b35 = serialDateChooserPanel34.getIgnoreRepaint();
    serialDateChooserPanel34.setAlignmentX((float)(byte)10);
    java.awt.Component component38 = serialDateChooserPanel28.add((java.awt.Component)serialDateChooserPanel34);
    org.jfree.date.SerialDate serialDate39 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel41 = new org.jfree.ui.SerialDateChooserPanel(serialDate39, true);
    java.awt.Color color42 = serialDateChooserPanel41.getForeground();
    component38.setForeground(color42);
    dateCellRenderer21.setForeground(color42);
    dateCellRenderer16.setForeground(color42);
    boolean b46 = rectangleAnchor15.equals((java.lang.Object)color42);
    java.awt.geom.Rectangle2D rectangle2D47 = org.jfree.ui.RectangleAnchor.createRectangle(size2D10, (double)100L, (double)4, rectangleAnchor15);
    // The following exception was thrown during execution in test generation
    try {
    textBox0.draw(graphics2D7, (float)2, (float)(short)10, rectangleAnchor15);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleAnchor15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D47);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest46.test03"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    org.jfree.date.SerialDate serialDate2 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel4 = new org.jfree.ui.SerialDateChooserPanel(serialDate2, true);
    java.beans.VetoableChangeListener vetoableChangeListener5 = null;
    serialDateChooserPanel4.removeVetoableChangeListener(vetoableChangeListener5);
    java.awt.Event event7 = null;
    org.jfree.date.SerialDate serialDate8 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel10 = new org.jfree.ui.SerialDateChooserPanel(serialDate8, true);
    boolean b11 = serialDateChooserPanel10.getIgnoreRepaint();
    javax.swing.InputMap inputMap12 = serialDateChooserPanel10.getInputMap();
    java.awt.Rectangle rectangle13 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle14 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b15 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle13, (java.awt.geom.Rectangle2D)rectangle14);
    java.awt.Rectangle rectangle16 = serialDateChooserPanel10.getBounds(rectangle14);
    org.jfree.date.SerialDate serialDate17 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel19 = new org.jfree.ui.SerialDateChooserPanel(serialDate17, true);
    boolean b20 = serialDateChooserPanel19.getIgnoreRepaint();
    java.awt.Rectangle rectangle21 = serialDateChooserPanel19.getVisibleRect();
    boolean b22 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle14, (java.awt.Shape)rectangle21);
    boolean b23 = serialDateChooserPanel4.lostFocus(event7, (java.lang.Object)rectangle21);
    java.awt.geom.Rectangle2D rectangle2D26 = rectangleInsets1.createOutsetRectangle((java.awt.geom.Rectangle2D)rectangle21, false, true);
    double d28 = rectangleInsets1.extendHeight((double)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 3.0d);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest46.test04"); }

    org.jfree.base.BasicProjectInfo basicProjectInfo4 = new org.jfree.base.BasicProjectInfo("TableOrder.BY_COLUMN", "", "5-January-1900", "content");

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest46.test05"); }

    java.text.DateFormat dateFormat0 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer1 = new org.jfree.ui.DateCellRenderer(dateFormat0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest46.test06"); }

    org.jfree.ui.FilesystemFilter filesystemFilter2 = new org.jfree.ui.FilesystemFilter("content", "hi!");
    java.lang.String str3 = filesystemFilter2.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest46.test07"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.awt.event.WindowEvent windowEvent3 = null;
    applicationFrame1.windowIconified(windowEvent3);
    applicationFrame1.show();
    javax.swing.JMenuBar jMenuBar6 = applicationFrame1.getJMenuBar();
    java.awt.event.WindowStateListener[] windowStateListener_array7 = applicationFrame1.getWindowStateListeners();
    boolean b8 = org.jfree.util.ArrayUtilities.hasDuplicateItems((java.lang.Object[])windowStateListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowStateListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest46.test08"); }

    java.lang.String str0 = javax.swing.text.AbstractDocument.BidiElementName;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "bidi level"+ "'", str0.equals("bidi level"));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest46.test09"); }

    org.jfree.text.TextBlock textBlock0 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D1 = null;
    org.jfree.text.TextBlock textBlock4 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D5 = null;
    org.jfree.text.TextBlockAnchor textBlockAnchor8 = org.jfree.text.TextBlockAnchor.TOP_RIGHT;
    java.awt.Shape shape12 = textBlock4.calculateBounds(graphics2D5, (float)12, (float)(short)-1, textBlockAnchor8, (float)' ', (float)32, (double)(-1.0f));
    textBlock0.draw(graphics2D1, (float)5, (float)(short)1, textBlockAnchor8, (float)(short)-1, (float)(short)100, (double)1.0f);
    java.awt.Graphics2D graphics2D17 = null;
    org.jfree.text.TextBlockAnchor textBlockAnchor20 = org.jfree.text.TextBlockAnchor.TOP_LEFT;
    java.awt.Shape shape24 = textBlock0.calculateBounds(graphics2D17, (float)5, (float)9, textBlockAnchor20, (float)(byte)-1, (float)1, 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape24);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest46.test10"); }

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
    java.lang.String str23 = serialDateChooserPanel7.getUIClassID();
    org.jfree.util.Log.error((java.lang.Object)serialDateChooserPanel7);
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "PanelUI"+ "'", str23.equals("PanelUI"));

  }

}
