
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test01"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getDisplayedMnemonic();
    dateCellRenderer0.validate();
    org.jfree.date.SerialDate serialDate3 = null;
    org.jfree.date.SerialDate serialDate5 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel7 = new org.jfree.ui.SerialDateChooserPanel(serialDate5, true);
    java.awt.Color color8 = serialDateChooserPanel7.getForeground();
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel11 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, true);
    java.awt.Color color12 = serialDateChooserPanel11.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame14 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener15 = null;
    applicationFrame14.removeWindowStateListener(windowStateListener15);
    applicationFrame14.setCursor(0);
    org.jfree.date.SerialDate serialDate19 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel21 = new org.jfree.ui.SerialDateChooserPanel(serialDate19, true);
    java.awt.Color color22 = serialDateChooserPanel21.getForeground();
    applicationFrame14.setBackground(color22);
    boolean b24 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color12, (java.awt.Paint)color22);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate3, false, color8, color22);
    dateCellRenderer0.setBackground(color22);
    java.awt.Dimension dimension27 = dateCellRenderer0.getSize();
    java.awt.Event event28 = null;
    org.jfree.base.Library library33 = new org.jfree.base.Library("ThreadContext", "PanelUI", "notify-field-accept", "ToolTipText");
    boolean b34 = dateCellRenderer0.action(event28, (java.lang.Object)"notify-field-accept");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test02"); }

    org.jfree.ui.RectangleEdge rectangleEdge0 = org.jfree.ui.RectangleEdge.RIGHT;
    org.jfree.ui.RectangleEdge rectangleEdge1 = org.jfree.ui.RectangleEdge.opposite(rectangleEdge0);
    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument2 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array3 = lengthLimitingDocument2.getDocumentListeners();
    javax.swing.text.Position position4 = lengthLimitingDocument2.getEndPosition();
    javax.swing.text.Element[] element_array5 = lengthLimitingDocument2.getRootElements();
    boolean b6 = rectangleEdge0.equals((java.lang.Object)element_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleEdge0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleEdge1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(position4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(element_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test03"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    java.awt.Rectangle rectangle2 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle3 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b4 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle2, (java.awt.geom.Rectangle2D)rectangle3);
    rectangleInsets1.trim((java.awt.geom.Rectangle2D)rectangle3);
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    boolean b9 = serialDateChooserPanel8.getIgnoreRepaint();
    javax.swing.InputMap inputMap10 = serialDateChooserPanel8.getInputMap();
    java.awt.Rectangle rectangle11 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle12 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b13 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle11, (java.awt.geom.Rectangle2D)rectangle12);
    java.awt.Rectangle rectangle14 = serialDateChooserPanel8.getBounds(rectangle12);
    java.awt.geom.Rectangle2D rectangle2D17 = rectangleInsets1.createInsetRectangle((java.awt.geom.Rectangle2D)rectangle14, false, true);
    org.jfree.ui.ApplicationFrame applicationFrame19 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent20 = null;
    applicationFrame19.windowDeiconified(windowEvent20);
    java.awt.LayoutManager layoutManager22 = null;
    applicationFrame19.setLayout(layoutManager22);
    java.beans.PropertyChangeListener propertyChangeListener24 = null;
    applicationFrame19.removePropertyChangeListener(propertyChangeListener24);
    java.awt.Image image26 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer27 = new org.jfree.ui.DateCellRenderer();
    int i28 = dateCellRenderer27.getDisplayedMnemonic();
    dateCellRenderer27.validate();
    int i30 = applicationFrame19.checkImage(image26, (java.awt.image.ImageObserver)dateCellRenderer27);
    dateCellRenderer27.updateUI();
    boolean b32 = rectangleInsets1.equals((java.lang.Object)dateCellRenderer27);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.awt.AWTKeyStroke> set_aWTKeyStroke34 = dateCellRenderer27.getFocusTraversalKeys((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test04"); }

    org.jfree.text.TextBlockAnchor textBlockAnchor0 = org.jfree.text.TextBlockAnchor.BOTTOM_LEFT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test05"); }

    org.jfree.base.BasicProjectInfo basicProjectInfo5 = new org.jfree.base.BasicProjectInfo("hi!", "notify-field-accept", "hi!", "hi!", "hi!");
    java.lang.String str6 = basicProjectInfo5.getCopyright();
    basicProjectInfo5.addOptionalLibrary("PanelUI");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test06"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    java.awt.Dimension dimension8 = serialDateChooserPanel2.getPreferredSize();
    serialDateChooserPanel2.setInheritsPopupMenu(true);
    org.jfree.ui.ApplicationFrame applicationFrame12 = new org.jfree.ui.ApplicationFrame("");
    java.awt.Rectangle rectangle13 = applicationFrame12.getMaximizedBounds();
    java.awt.event.MouseWheelListener mouseWheelListener14 = null;
    applicationFrame12.removeMouseWheelListener(mouseWheelListener14);
    applicationFrame12.setAutoRequestFocus(true);
    java.awt.event.KeyListener keyListener18 = null;
    applicationFrame12.addKeyListener(keyListener18);
    java.awt.Rectangle rectangle20 = applicationFrame12.bounds();
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component21 = serialDateChooserPanel2.add((java.awt.Component)applicationFrame12);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test07"); }

    org.jfree.util.TableOrder tableOrder0 = org.jfree.util.TableOrder.BY_COLUMN;
    java.lang.String str1 = tableOrder0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tableOrder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "TableOrder.BY_COLUMN"+ "'", str1.equals("TableOrder.BY_COLUMN"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test08"); }

    org.jfree.ui.FilesystemFilter filesystemFilter2 = new org.jfree.ui.FilesystemFilter("LabelUI", "SortOrder.ASCENDING");

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test09"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    serialDateChooserPanel2.invalidate();
    serialDateChooserPanel2.grabFocus();
    java.awt.Container container10 = serialDateChooserPanel2.getTopLevelAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container10);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24.test10"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.util.Locale locale3 = applicationFrame1.getLocale();
    // The following exception was thrown during execution in test generation
    try {
    applicationFrame1.setOpacity((float)100L);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale3);

  }

}
