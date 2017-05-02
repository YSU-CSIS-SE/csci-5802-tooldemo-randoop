
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest71 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest71.test01"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getDisplayedMnemonic();
    dateCellRenderer0.invalidate();
    boolean b3 = dateCellRenderer0.isBackgroundSet();
    java.awt.Dimension dimension4 = dateCellRenderer0.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest71.test02"); }

    org.jfree.util.BooleanList booleanList0 = new org.jfree.util.BooleanList();
    booleanList0.setBoolean(31, (java.lang.Boolean)false);
    org.jfree.resources.JCommonResources jCommonResources4 = new org.jfree.resources.JCommonResources();
    java.util.Locale locale5 = jCommonResources4.getLocale();
    boolean b6 = booleanList0.equals((java.lang.Object)jCommonResources4);
    org.jfree.util.ResourceBundleSupport resourceBundleSupport7 = new org.jfree.util.ResourceBundleSupport((java.util.ResourceBundle)jCommonResources4);
    // The following exception was thrown during execution in test generation
    try {
    javax.swing.KeyStroke keyStroke10 = resourceBundleSupport7.getKeyStroke("", (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest71.test03"); }

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
    javax.swing.TransferHandler transferHandler25 = null;
    serialDateChooserPanel2.setTransferHandler(transferHandler25);
    
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
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest71.test04"); }

    org.jfree.ui.L1R3ButtonPanel l1R3ButtonPanel4 = new org.jfree.ui.L1R3ButtonPanel("TableOrder.BY_COLUMN", "ClassContext", "http://www.jfree.org/jcommon/", "ToolTipText");
    org.jfree.layout.RadialLayout radialLayout5 = new org.jfree.layout.RadialLayout();
    l1R3ButtonPanel4.setLayout((java.awt.LayoutManager)radialLayout5);
    org.jfree.ui.DateCellRenderer dateCellRenderer7 = new org.jfree.ui.DateCellRenderer();
    int i8 = dateCellRenderer7.getDisplayedMnemonic();
    dateCellRenderer7.validate();
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.date.SerialDate serialDate12 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel14 = new org.jfree.ui.SerialDateChooserPanel(serialDate12, true);
    java.awt.Color color15 = serialDateChooserPanel14.getForeground();
    org.jfree.date.SerialDate serialDate16 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel18 = new org.jfree.ui.SerialDateChooserPanel(serialDate16, true);
    java.awt.Color color19 = serialDateChooserPanel18.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame21 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener22 = null;
    applicationFrame21.removeWindowStateListener(windowStateListener22);
    applicationFrame21.setCursor(0);
    org.jfree.date.SerialDate serialDate26 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel28 = new org.jfree.ui.SerialDateChooserPanel(serialDate26, true);
    java.awt.Color color29 = serialDateChooserPanel28.getForeground();
    applicationFrame21.setBackground(color29);
    boolean b31 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color19, (java.awt.Paint)color29);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel32 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, false, color15, color29);
    dateCellRenderer7.setBackground(color29);
    javax.swing.Icon icon34 = dateCellRenderer7.getIcon();
    org.jfree.ui.ApplicationFrame applicationFrame36 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent37 = null;
    applicationFrame36.windowDeiconified(windowEvent37);
    java.awt.LayoutManager layoutManager39 = null;
    applicationFrame36.setLayout(layoutManager39);
    java.beans.PropertyChangeListener propertyChangeListener41 = null;
    applicationFrame36.removePropertyChangeListener(propertyChangeListener41);
    java.awt.Image image43 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer44 = new org.jfree.ui.DateCellRenderer();
    int i45 = dateCellRenderer44.getDisplayedMnemonic();
    dateCellRenderer44.validate();
    int i47 = applicationFrame36.checkImage(image43, (java.awt.image.ImageObserver)dateCellRenderer44);
    org.jfree.ui.BevelArrowIcon bevelArrowIcon51 = new org.jfree.ui.BevelArrowIcon((int)'4', true, false);
    dateCellRenderer44.setIcon((javax.swing.Icon)bevelArrowIcon51);
    dateCellRenderer7.setIcon((javax.swing.Icon)bevelArrowIcon51);
    javax.swing.Icon icon54 = dateCellRenderer7.getIcon();
    dateCellRenderer7.setDisplayedMnemonic(13);
    // The following exception was thrown during execution in test generation
    try {
    radialLayout5.layoutContainer((java.awt.Container)dateCellRenderer7);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(icon54);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest71.test05"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getIconTextGap();
    dateCellRenderer0.setVisible(false);
    javax.swing.border.Border border4 = null;
    dateCellRenderer0.setBorder(border4);
    javax.swing.Icon icon6 = dateCellRenderer0.getDisabledIcon();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon6);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest71.test06"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.awt.event.WindowEvent windowEvent3 = null;
    applicationFrame1.windowIconified(windowEvent3);
    boolean b5 = applicationFrame1.isShowing();
    applicationFrame1.setBounds((int)(byte)0, 10, 11, 9);
    org.jfree.util.Log.warn((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest71.test07"); }

    org.jfree.layout.LCBLayout lCBLayout1 = new org.jfree.layout.LCBLayout(9);
    org.jfree.ui.DateCellRenderer dateCellRenderer2 = new org.jfree.ui.DateCellRenderer();
    int i3 = dateCellRenderer2.getDisplayedMnemonic();
    dateCellRenderer2.validate();
    org.jfree.date.SerialDate serialDate5 = null;
    org.jfree.date.SerialDate serialDate7 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel9 = new org.jfree.ui.SerialDateChooserPanel(serialDate7, true);
    java.awt.Color color10 = serialDateChooserPanel9.getForeground();
    org.jfree.date.SerialDate serialDate11 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel13 = new org.jfree.ui.SerialDateChooserPanel(serialDate11, true);
    java.awt.Color color14 = serialDateChooserPanel13.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame16 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener17 = null;
    applicationFrame16.removeWindowStateListener(windowStateListener17);
    applicationFrame16.setCursor(0);
    org.jfree.date.SerialDate serialDate21 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel23 = new org.jfree.ui.SerialDateChooserPanel(serialDate21, true);
    java.awt.Color color24 = serialDateChooserPanel23.getForeground();
    applicationFrame16.setBackground(color24);
    boolean b26 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color14, (java.awt.Paint)color24);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel27 = new org.jfree.ui.SerialDateChooserPanel(serialDate5, false, color10, color24);
    dateCellRenderer2.setBackground(color24);
    javax.swing.Icon icon29 = dateCellRenderer2.getIcon();
    org.jfree.ui.ApplicationFrame applicationFrame31 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent32 = null;
    applicationFrame31.windowDeiconified(windowEvent32);
    java.awt.LayoutManager layoutManager34 = null;
    applicationFrame31.setLayout(layoutManager34);
    java.beans.PropertyChangeListener propertyChangeListener36 = null;
    applicationFrame31.removePropertyChangeListener(propertyChangeListener36);
    java.awt.Image image38 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer39 = new org.jfree.ui.DateCellRenderer();
    int i40 = dateCellRenderer39.getDisplayedMnemonic();
    dateCellRenderer39.validate();
    int i42 = applicationFrame31.checkImage(image38, (java.awt.image.ImageObserver)dateCellRenderer39);
    org.jfree.ui.BevelArrowIcon bevelArrowIcon46 = new org.jfree.ui.BevelArrowIcon((int)'4', true, false);
    dateCellRenderer39.setIcon((javax.swing.Icon)bevelArrowIcon46);
    dateCellRenderer2.setIcon((javax.swing.Icon)bevelArrowIcon46);
    javax.swing.Icon icon49 = dateCellRenderer2.getIcon();
    dateCellRenderer2.setDisplayedMnemonic(13);
    dateCellRenderer2.firePropertyChange("VerticalAlignment.CENTER", (double)0, (double)2958465);
    java.awt.Dimension dimension56 = lCBLayout1.preferredLayoutSize((java.awt.Container)dateCellRenderer2);
    java.awt.image.ColorModel colorModel57 = dateCellRenderer2.getColorModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(icon49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel57);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest71.test08"); }

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
    org.jfree.date.SerialDate serialDate33 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel35 = new org.jfree.ui.SerialDateChooserPanel(serialDate33, true);
    boolean b36 = serialDateChooserPanel35.getIgnoreRepaint();
    boolean b37 = serialDateChooserPanel35.isCursorSet();
    java.awt.Dimension dimension38 = serialDateChooserPanel35.minimumSize();
    org.jfree.date.SerialDate serialDate39 = serialDateChooserPanel35.getDate();
    java.awt.Event event40 = null;
    boolean b43 = serialDateChooserPanel35.mouseMove(event40, 0, 1);
    org.jfree.date.SerialDate serialDate44 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel46 = new org.jfree.ui.SerialDateChooserPanel(serialDate44, true);
    boolean b47 = serialDateChooserPanel46.getIgnoreRepaint();
    javax.swing.InputMap inputMap48 = serialDateChooserPanel46.getInputMap();
    java.awt.Rectangle rectangle49 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle50 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b51 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle49, (java.awt.geom.Rectangle2D)rectangle50);
    java.awt.Rectangle rectangle52 = serialDateChooserPanel46.getBounds(rectangle50);
    java.awt.Rectangle rectangle53 = serialDateChooserPanel35.getBounds(rectangle52);
    org.jfree.ui.RectangleEdge rectangleEdge54 = org.jfree.ui.RectangleEdge.RIGHT;
    org.jfree.ui.RectangleEdge rectangleEdge55 = org.jfree.ui.RectangleEdge.opposite(rectangleEdge54);
    double d56 = org.jfree.ui.RectangleEdge.coordinate((java.awt.geom.Rectangle2D)rectangle52, rectangleEdge54);
    rectangleInsets1.trim((java.awt.geom.Rectangle2D)rectangle52);
    org.jfree.ui.ApplicationFrame applicationFrame59 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener60 = null;
    applicationFrame59.removeWindowStateListener(windowStateListener60);
    boolean b62 = applicationFrame59.isValidateRoot();
    org.jfree.date.SerialDate serialDate63 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel65 = new org.jfree.ui.SerialDateChooserPanel(serialDate63, true);
    boolean b66 = serialDateChooserPanel65.getIgnoreRepaint();
    javax.swing.InputMap inputMap67 = serialDateChooserPanel65.getInputMap();
    java.awt.Rectangle rectangle68 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle69 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b70 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle68, (java.awt.geom.Rectangle2D)rectangle69);
    java.awt.Rectangle rectangle71 = serialDateChooserPanel65.getBounds(rectangle69);
    org.jfree.date.SerialDate serialDate72 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel74 = new org.jfree.ui.SerialDateChooserPanel(serialDate72, true);
    boolean b75 = serialDateChooserPanel74.getIgnoreRepaint();
    java.awt.Rectangle rectangle76 = serialDateChooserPanel74.getVisibleRect();
    boolean b77 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle69, (java.awt.Shape)rectangle76);
    applicationFrame59.setMaximizedBounds(rectangle69);
    javax.accessibility.AccessibleContext accessibleContext79 = applicationFrame59.getAccessibleContext();
    java.awt.event.WindowEvent windowEvent80 = null;
    applicationFrame59.windowDeiconified(windowEvent80);
    org.jfree.text.TextBox textBox82 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets83 = textBox82.getInteriorGap();
    java.awt.Rectangle rectangle84 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle85 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b86 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle84, (java.awt.geom.Rectangle2D)rectangle85);
    rectangleInsets83.trim((java.awt.geom.Rectangle2D)rectangle85);
    double d88 = rectangleInsets83.getLeft();
    org.jfree.text.TextBox textBox89 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets90 = textBox89.getInteriorGap();
    java.awt.Rectangle rectangle91 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle92 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b93 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle91, (java.awt.geom.Rectangle2D)rectangle92);
    rectangleInsets90.trim((java.awt.geom.Rectangle2D)rectangle92);
    rectangleInsets83.trim((java.awt.geom.Rectangle2D)rectangle92);
    applicationFrame59.setBounds(rectangle92);
    java.awt.geom.Rectangle2D rectangle2D99 = rectangleInsets1.createOutsetRectangle((java.awt.geom.Rectangle2D)rectangle92, false, false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(serialDate39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleEdge54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleEdge55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d88 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D99);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest71.test09"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    javax.swing.InputMap inputMap4 = serialDateChooserPanel2.getInputMap();
    javax.swing.TransferHandler transferHandler5 = null;
    serialDateChooserPanel2.setTransferHandler(transferHandler5);
    javax.swing.plaf.PanelUI panelUI7 = null;
    serialDateChooserPanel2.setUI(panelUI7);
    java.lang.Object obj9 = serialDateChooserPanel2.getTreeLock();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj9);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest71.test10"); }

    java.awt.Graphics2D graphics2D1 = null;
    org.jfree.ui.TextAnchor textAnchor4 = org.jfree.ui.TextAnchor.BASELINE_CENTER;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.text.TextUtilities.drawRotatedString("RectangleEdge.BOTTOM", graphics2D1, (float)' ', (float)1, textAnchor4, (double)5, (float)(-1), (float)3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor4);

  }

}
