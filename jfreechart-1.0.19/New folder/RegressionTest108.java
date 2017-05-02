
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest108 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest108.test01"); }

    org.jfree.ui.ArrowPanel arrowPanel1 = new org.jfree.ui.ArrowPanel(2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest108.test02"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    applicationFrame1.setCursor(0);
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    java.awt.Color color9 = serialDateChooserPanel8.getForeground();
    applicationFrame1.setBackground(color9);
    java.awt.event.KeyListener keyListener11 = null;
    applicationFrame1.removeKeyListener(keyListener11);
    boolean b13 = applicationFrame1.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest108.test03"); }

    org.jfree.util.BooleanList booleanList0 = new org.jfree.util.BooleanList();
    booleanList0.setBoolean(31, (java.lang.Boolean)false);
    org.jfree.resources.JCommonResources jCommonResources4 = new org.jfree.resources.JCommonResources();
    java.util.Locale locale5 = jCommonResources4.getLocale();
    boolean b6 = booleanList0.equals((java.lang.Object)jCommonResources4);
    org.jfree.util.ResourceBundleSupport resourceBundleSupport7 = new org.jfree.util.ResourceBundleSupport((java.util.ResourceBundle)jCommonResources4);
    javax.swing.Icon icon10 = resourceBundleSupport7.createTransparentIcon(16, (int)(short)1);
    org.jfree.util.BooleanList booleanList12 = new org.jfree.util.BooleanList();
    booleanList12.setBoolean(31, (java.lang.Boolean)false);
    booleanList12.setBoolean(15, (java.lang.Boolean)true);
    java.lang.Object obj19 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str20 = resourceBundleSupport7.formatMessage("paragraph", (java.lang.Object)true, obj19);
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(icon10);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest108.test04"); }

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
    javax.swing.InputMap inputMap37 = serialDateChooserPanel35.getInputMap();
    java.awt.Rectangle rectangle38 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle39 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b40 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle38, (java.awt.geom.Rectangle2D)rectangle39);
    java.awt.Rectangle rectangle41 = serialDateChooserPanel35.getBounds(rectangle39);
    java.awt.geom.Rectangle2D rectangle2D44 = rectangleInsets1.createOutsetRectangle((java.awt.geom.Rectangle2D)rectangle39, true, true);
    double d46 = rectangleInsets1.calculateRightOutset(7.0d);
    
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
    org.junit.Assert.assertNotNull(inputMap37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d46 == 3.0d);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest108.test05"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getDisplayedMnemonic();
    java.lang.String str2 = dateCellRenderer0.getText();
    java.awt.ComponentOrientation componentOrientation3 = null;
    dateCellRenderer0.setComponentOrientation(componentOrientation3);
    org.jfree.ui.DateCellRenderer dateCellRenderer5 = new org.jfree.ui.DateCellRenderer();
    int i6 = dateCellRenderer5.getDisplayedMnemonic();
    java.lang.String str7 = dateCellRenderer5.getText();
    java.awt.ComponentOrientation componentOrientation8 = null;
    dateCellRenderer5.setComponentOrientation(componentOrientation8);
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel12 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    boolean b13 = serialDateChooserPanel12.getIgnoreRepaint();
    boolean b14 = serialDateChooserPanel12.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array15 = serialDateChooserPanel12.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate16 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel18 = new org.jfree.ui.SerialDateChooserPanel(serialDate16, true);
    boolean b19 = serialDateChooserPanel18.getIgnoreRepaint();
    serialDateChooserPanel18.setAlignmentX((float)(byte)10);
    java.awt.Component component22 = serialDateChooserPanel12.add((java.awt.Component)serialDateChooserPanel18);
    org.jfree.date.SerialDate serialDate23 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate23, true);
    java.awt.Color color26 = serialDateChooserPanel25.getForeground();
    component22.setForeground(color26);
    dateCellRenderer5.setForeground(color26);
    dateCellRenderer0.setForeground(color26);
    org.jfree.ui.DateCellRenderer dateCellRenderer30 = new org.jfree.ui.DateCellRenderer();
    int i31 = dateCellRenderer30.getDisplayedMnemonic();
    java.lang.String str32 = dateCellRenderer30.getText();
    java.awt.ComponentOrientation componentOrientation33 = null;
    dateCellRenderer30.setComponentOrientation(componentOrientation33);
    org.jfree.date.SerialDate serialDate35 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel37 = new org.jfree.ui.SerialDateChooserPanel(serialDate35, true);
    boolean b38 = serialDateChooserPanel37.getIgnoreRepaint();
    boolean b39 = serialDateChooserPanel37.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array40 = serialDateChooserPanel37.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate41 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel43 = new org.jfree.ui.SerialDateChooserPanel(serialDate41, true);
    boolean b44 = serialDateChooserPanel43.getIgnoreRepaint();
    serialDateChooserPanel43.setAlignmentX((float)(byte)10);
    java.awt.Component component47 = serialDateChooserPanel37.add((java.awt.Component)serialDateChooserPanel43);
    org.jfree.date.SerialDate serialDate48 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel50 = new org.jfree.ui.SerialDateChooserPanel(serialDate48, true);
    java.awt.Color color51 = serialDateChooserPanel50.getForeground();
    component47.setForeground(color51);
    dateCellRenderer30.setForeground(color51);
    dateCellRenderer0.setBackground(color51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color51);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest108.test06"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    java.awt.Font font3 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.date.SerialDate serialDate4 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel6 = new org.jfree.ui.SerialDateChooserPanel(serialDate4, true);
    java.awt.Color color7 = serialDateChooserPanel6.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame9 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener10 = null;
    applicationFrame9.removeWindowStateListener(windowStateListener10);
    applicationFrame9.setCursor(0);
    org.jfree.date.SerialDate serialDate14 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel16 = new org.jfree.ui.SerialDateChooserPanel(serialDate14, true);
    java.awt.Color color17 = serialDateChooserPanel16.getForeground();
    applicationFrame9.setBackground(color17);
    boolean b19 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color7, (java.awt.Paint)color17);
    org.jfree.text.TextFragment textFragment20 = new org.jfree.text.TextFragment("ClassContext", font3, (java.awt.Paint)color17);
    textBox0.setShadowPaint((java.awt.Paint)color17);
    java.awt.Paint paint22 = textBox0.getBackgroundPaint();
    org.jfree.date.SerialDate serialDate23 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate23, true);
    java.awt.Color color26 = serialDateChooserPanel25.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame28 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener29 = null;
    applicationFrame28.removeWindowStateListener(windowStateListener29);
    applicationFrame28.setCursor(0);
    org.jfree.date.SerialDate serialDate33 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel35 = new org.jfree.ui.SerialDateChooserPanel(serialDate33, true);
    java.awt.Color color36 = serialDateChooserPanel35.getForeground();
    applicationFrame28.setBackground(color36);
    boolean b38 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color26, (java.awt.Paint)color36);
    org.jfree.ui.RectangleAnchor rectangleAnchor39 = org.jfree.ui.RectangleAnchor.BOTTOM_RIGHT;
    org.jfree.ui.DateCellRenderer dateCellRenderer40 = new org.jfree.ui.DateCellRenderer();
    int i41 = dateCellRenderer40.getDisplayedMnemonic();
    java.lang.String str42 = dateCellRenderer40.getText();
    java.awt.ComponentOrientation componentOrientation43 = null;
    dateCellRenderer40.setComponentOrientation(componentOrientation43);
    org.jfree.ui.DateCellRenderer dateCellRenderer45 = new org.jfree.ui.DateCellRenderer();
    int i46 = dateCellRenderer45.getDisplayedMnemonic();
    java.lang.String str47 = dateCellRenderer45.getText();
    java.awt.ComponentOrientation componentOrientation48 = null;
    dateCellRenderer45.setComponentOrientation(componentOrientation48);
    org.jfree.date.SerialDate serialDate50 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel52 = new org.jfree.ui.SerialDateChooserPanel(serialDate50, true);
    boolean b53 = serialDateChooserPanel52.getIgnoreRepaint();
    boolean b54 = serialDateChooserPanel52.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array55 = serialDateChooserPanel52.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate56 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel58 = new org.jfree.ui.SerialDateChooserPanel(serialDate56, true);
    boolean b59 = serialDateChooserPanel58.getIgnoreRepaint();
    serialDateChooserPanel58.setAlignmentX((float)(byte)10);
    java.awt.Component component62 = serialDateChooserPanel52.add((java.awt.Component)serialDateChooserPanel58);
    org.jfree.date.SerialDate serialDate63 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel65 = new org.jfree.ui.SerialDateChooserPanel(serialDate63, true);
    java.awt.Color color66 = serialDateChooserPanel65.getForeground();
    component62.setForeground(color66);
    dateCellRenderer45.setForeground(color66);
    dateCellRenderer40.setForeground(color66);
    boolean b70 = rectangleAnchor39.equals((java.lang.Object)color66);
    org.jfree.date.SerialDate serialDate71 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel73 = new org.jfree.ui.SerialDateChooserPanel(serialDate71, true);
    java.awt.Color color74 = serialDateChooserPanel73.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame76 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener77 = null;
    applicationFrame76.removeWindowStateListener(windowStateListener77);
    applicationFrame76.setCursor(0);
    org.jfree.date.SerialDate serialDate81 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel83 = new org.jfree.ui.SerialDateChooserPanel(serialDate81, true);
    java.awt.Color color84 = serialDateChooserPanel83.getForeground();
    applicationFrame76.setBackground(color84);
    boolean b86 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color74, (java.awt.Paint)color84);
    org.jfree.ui.BevelArrowIcon bevelArrowIcon89 = new org.jfree.ui.BevelArrowIcon(color36, color66, color84, (int)(short)100, 9);
    textBox0.setShadowPaint((java.awt.Paint)color36);
    java.io.ObjectOutputStream objectOutputStream91 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.io.SerialUtilities.writePaint((java.awt.Paint)color36, objectOutputStream91);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleAnchor39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + ""+ "'", str42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + ""+ "'", str47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest108.test07"); }

    org.jfree.layout.RadialLayout radialLayout0 = new org.jfree.layout.RadialLayout();
    org.jfree.date.SerialDate serialDate1 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel3 = new org.jfree.ui.SerialDateChooserPanel(serialDate1, true);
    boolean b4 = serialDateChooserPanel3.getIgnoreRepaint();
    serialDateChooserPanel3.resize(8, (int)(short)-1);
    serialDateChooserPanel3.firePropertyChange("Jan", ' ', ' ');
    radialLayout0.addLayoutComponent((java.awt.Component)serialDateChooserPanel3);
    java.awt.event.MouseEvent mouseEvent13 = null;
    java.awt.Point point14 = serialDateChooserPanel3.getToolTipLocation(mouseEvent13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point14);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest108.test08"); }

    org.jfree.util.FastStack fastStack1 = new org.jfree.util.FastStack(6);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest108.test09"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    float f4 = applicationFrame1.getOpacity();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
    applicationFrame1.addHierarchyBoundsListener(hierarchyBoundsListener5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f4 == 1.0f);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest108.test10"); }

    java.lang.Object obj3 = null;
    org.jfree.util.Log.SimpleMessage simpleMessage5 = new org.jfree.util.Log.SimpleMessage("hi!", (java.lang.Object)10.0f, (java.lang.Object)' ', obj3, (java.lang.Object)"hi!");
    java.lang.String str6 = simpleMessage5.toString();
    java.lang.String str7 = simpleMessage5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!10.0 nullhi!"+ "'", str6.equals("hi!10.0 nullhi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!10.0 nullhi!"+ "'", str7.equals("hi!10.0 nullhi!"));

  }

}
