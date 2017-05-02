
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test01"); }

    int i0 = org.jfree.date.SerialDate.MAXIMUM_YEAR_SUPPORTED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 9999);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test02"); }

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
    org.jfree.ui.PaintSample paintSample16 = new org.jfree.ui.PaintSample((java.awt.Paint)color13);
    java.awt.event.ComponentListener componentListener17 = null;
    paintSample16.addComponentListener(componentListener17);
    java.awt.PopupMenu popupMenu19 = null;
    // The following exception was thrown during execution in test generation
    try {
    paintSample16.add(popupMenu19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test03"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    javax.swing.InputMap inputMap4 = serialDateChooserPanel2.getInputMap();
    javax.swing.TransferHandler transferHandler5 = null;
    serialDateChooserPanel2.setTransferHandler(transferHandler5);
    javax.swing.plaf.PanelUI panelUI7 = null;
    serialDateChooserPanel2.setUI(panelUI7);
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel11 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, true);
    boolean b12 = serialDateChooserPanel11.getIgnoreRepaint();
    boolean b13 = serialDateChooserPanel11.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array14 = serialDateChooserPanel11.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate15 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel17 = new org.jfree.ui.SerialDateChooserPanel(serialDate15, true);
    boolean b18 = serialDateChooserPanel17.getIgnoreRepaint();
    serialDateChooserPanel17.setAlignmentX((float)(byte)10);
    java.awt.Component component21 = serialDateChooserPanel11.add((java.awt.Component)serialDateChooserPanel17);
    boolean b22 = serialDateChooserPanel17.isCursorSet();
    java.awt.Rectangle rectangle23 = serialDateChooserPanel17.bounds();
    serialDateChooserPanel2.repaint(rectangle23);
    org.jfree.ui.ApplicationFrame applicationFrame26 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent27 = null;
    applicationFrame26.windowDeiconified(windowEvent27);
    java.awt.LayoutManager layoutManager29 = null;
    applicationFrame26.setLayout(layoutManager29);
    java.beans.PropertyChangeListener propertyChangeListener31 = null;
    applicationFrame26.removePropertyChangeListener(propertyChangeListener31);
    boolean b33 = applicationFrame26.isMaximumSizeSet();
    org.jfree.base.BootableProjectInfo bootableProjectInfo39 = new org.jfree.base.BootableProjectInfo("hi!", "hi!", "content", "PanelUI", "");
    bootableProjectInfo39.setLicenceName("content");
    // The following exception was thrown during execution in test generation
    try {
    serialDateChooserPanel2.add((java.awt.Component)applicationFrame26, (java.lang.Object)"content", (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test04"); }

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
    dateCellRenderer9.updateUI();
    dateCellRenderer9.validate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test05"); }

    org.jfree.ui.TextAnchor textAnchor0 = org.jfree.ui.TextAnchor.CENTER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test06"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    javax.swing.InputMap inputMap4 = serialDateChooserPanel2.getInputMap();
    javax.swing.TransferHandler transferHandler5 = null;
    serialDateChooserPanel2.setTransferHandler(transferHandler5);
    javax.swing.plaf.PanelUI panelUI7 = null;
    serialDateChooserPanel2.setUI(panelUI7);
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel11 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, true);
    boolean b12 = serialDateChooserPanel11.getIgnoreRepaint();
    boolean b13 = serialDateChooserPanel11.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array14 = serialDateChooserPanel11.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate15 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel17 = new org.jfree.ui.SerialDateChooserPanel(serialDate15, true);
    boolean b18 = serialDateChooserPanel17.getIgnoreRepaint();
    serialDateChooserPanel17.setAlignmentX((float)(byte)10);
    java.awt.Component component21 = serialDateChooserPanel11.add((java.awt.Component)serialDateChooserPanel17);
    boolean b22 = serialDateChooserPanel17.isCursorSet();
    java.awt.Rectangle rectangle23 = serialDateChooserPanel17.bounds();
    serialDateChooserPanel2.repaint(rectangle23);
    serialDateChooserPanel2.hide();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test07"); }

    java.awt.Shape shape2 = org.jfree.util.ShapeUtilities.createDiagonalCross((float)1L, (float)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape2);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test08"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    java.awt.LayoutManager layoutManager4 = null;
    applicationFrame1.setLayout(layoutManager4);
    java.awt.event.WindowFocusListener windowFocusListener6 = null;
    applicationFrame1.removeWindowFocusListener(windowFocusListener6);
    // The following exception was thrown during execution in test generation
    try {
    applicationFrame1.createBufferStrategy(6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test09"); }

    java.awt.Composite composite0 = null;
    java.io.ObjectOutputStream objectOutputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.io.SerialUtilities.writeComposite(composite0, objectOutputStream1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test10"); }

    org.jfree.ui.StandardGradientPaintTransformer standardGradientPaintTransformer0 = new org.jfree.ui.StandardGradientPaintTransformer();
    java.awt.GradientPaint gradientPaint1 = null;
    org.jfree.text.TextBox textBox2 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets3 = textBox2.getInteriorGap();
    java.awt.Rectangle rectangle4 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle5 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b6 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle4, (java.awt.geom.Rectangle2D)rectangle5);
    rectangleInsets3.trim((java.awt.geom.Rectangle2D)rectangle5);
    // The following exception was thrown during execution in test generation
    try {
    java.awt.GradientPaint gradientPaint8 = standardGradientPaintTransformer0.transform(gradientPaint1, (java.awt.Shape)rectangle5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

}
