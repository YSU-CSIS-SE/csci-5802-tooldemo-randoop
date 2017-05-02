
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest103 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest103.test01"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.text.Position position2 = lengthLimitingDocument0.createPosition(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(position2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest103.test02"); }

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
    org.jfree.date.SerialDate serialDate21 = null;
    org.jfree.date.SerialDate serialDate23 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate23, true);
    java.awt.Color color26 = serialDateChooserPanel25.getForeground();
    org.jfree.date.SerialDate serialDate27 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel29 = new org.jfree.ui.SerialDateChooserPanel(serialDate27, true);
    java.awt.Color color30 = serialDateChooserPanel29.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame32 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener33 = null;
    applicationFrame32.removeWindowStateListener(windowStateListener33);
    applicationFrame32.setCursor(0);
    org.jfree.date.SerialDate serialDate37 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel39 = new org.jfree.ui.SerialDateChooserPanel(serialDate37, true);
    java.awt.Color color40 = serialDateChooserPanel39.getForeground();
    applicationFrame32.setBackground(color40);
    boolean b42 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color30, (java.awt.Paint)color40);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel43 = new org.jfree.ui.SerialDateChooserPanel(serialDate21, false, color26, color40);
    javax.swing.JLabel jLabel44 = org.jfree.ui.RefineryUtilities.createJLabel("SortOrder.ASCENDING", font3, color26);
    org.jfree.date.SerialDate serialDate45 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel47 = new org.jfree.ui.SerialDateChooserPanel(serialDate45, true);
    java.awt.Color color48 = serialDateChooserPanel47.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame50 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener51 = null;
    applicationFrame50.removeWindowStateListener(windowStateListener51);
    applicationFrame50.setCursor(0);
    org.jfree.date.SerialDate serialDate55 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel57 = new org.jfree.ui.SerialDateChooserPanel(serialDate55, true);
    java.awt.Color color58 = serialDateChooserPanel57.getForeground();
    applicationFrame50.setBackground(color58);
    boolean b60 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color48, (java.awt.Paint)color58);
    org.jfree.text.TextBlock textBlock61 = org.jfree.text.TextUtilities.createTextBlock("LabelUI", font3, (java.awt.Paint)color48);
    org.jfree.ui.FontDisplayField fontDisplayField62 = new org.jfree.ui.FontDisplayField(font3);
    javax.swing.text.NavigationFilter navigationFilter63 = fontDisplayField62.getNavigationFilter();
    javax.accessibility.AccessibleContext accessibleContext64 = fontDisplayField62.getAccessibleContext();
    fontDisplayField62.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLabel44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlock61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(navigationFilter63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext64);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest103.test03"); }

    org.jfree.util.BooleanList booleanList0 = new org.jfree.util.BooleanList();
    booleanList0.setBoolean(31, (java.lang.Boolean)false);
    org.jfree.resources.JCommonResources jCommonResources4 = new org.jfree.resources.JCommonResources();
    java.util.Locale locale5 = jCommonResources4.getLocale();
    boolean b6 = booleanList0.equals((java.lang.Object)jCommonResources4);
    org.jfree.util.ResourceBundleSupport resourceBundleSupport7 = new org.jfree.util.ResourceBundleSupport((java.util.ResourceBundle)jCommonResources4);
    javax.swing.Icon icon10 = resourceBundleSupport7.createTransparentIcon(16, (int)(short)1);
    java.util.Locale locale11 = resourceBundleSupport7.getLocale();
    // The following exception was thrown during execution in test generation
    try {
    javax.swing.KeyStroke keyStroke13 = resourceBundleSupport7.getKeyStroke("Jan");
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale11);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest103.test04"); }

    java.awt.Font font1 = org.jfree.text.TextFragment.DEFAULT_FONT;
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
    org.jfree.text.TextBlock textBlock21 = org.jfree.text.TextUtilities.createTextBlock("TableOrder.BY_COLUMN", font1, (java.awt.Paint)color17);
    boolean b23 = textBlock21.equals((java.lang.Object)(-458));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlock21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest103.test05"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b7 = serialDateChooserPanel2.isFocusTraversable();
    boolean b8 = serialDateChooserPanel2.getVerifyInputWhenFocusTarget();
    java.awt.Dimension dimension9 = serialDateChooserPanel2.getMinimumSize();
    javax.swing.InputVerifier inputVerifier10 = null;
    serialDateChooserPanel2.setInputVerifier(inputVerifier10);
    org.jfree.text.TextBox textBox12 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets13 = textBox12.getInteriorGap();
    java.awt.Rectangle rectangle14 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle15 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b16 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle14, (java.awt.geom.Rectangle2D)rectangle15);
    rectangleInsets13.trim((java.awt.geom.Rectangle2D)rectangle15);
    java.awt.Rectangle rectangle18 = serialDateChooserPanel2.getBounds(rectangle15);
    java.awt.Event event19 = null;
    boolean b22 = serialDateChooserPanel2.mouseDrag(event19, 12, 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest103.test06"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    boolean b4 = serialDateChooserPanel2.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array5 = serialDateChooserPanel2.getPropertyChangeListeners();
    javax.swing.InputMap inputMap6 = serialDateChooserPanel2.getInputMap();
    org.jfree.util.Log.warn((java.lang.Object)serialDateChooserPanel2);
    java.awt.event.MouseMotionListener mouseMotionListener8 = null;
    serialDateChooserPanel2.removeMouseMotionListener(mouseMotionListener8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap6);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest103.test07"); }

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
    java.lang.String str18 = unitType17.toString();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "UnitType.ABSOLUTE"+ "'", str18.equals("UnitType.ABSOLUTE"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest103.test08"); }

    int i1 = org.jfree.date.SerialDate.leapYearCount(7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-458));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest103.test09"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    applicationFrame1.setExtendedState(6);
    java.awt.Image image6 = applicationFrame1.getIconImage();
    applicationFrame1.invalidate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(image6);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest103.test10"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.date.SerialDate serialDate2 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel4 = new org.jfree.ui.SerialDateChooserPanel(serialDate2, true);
    java.awt.Color color5 = serialDateChooserPanel4.getForeground();
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
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel22 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, false, color5, color19);
    java.awt.Image image23 = null;
    org.jfree.ui.ApplicationFrame applicationFrame27 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent28 = null;
    applicationFrame27.windowDeiconified(windowEvent28);
    java.awt.LayoutManager layoutManager30 = null;
    applicationFrame27.setLayout(layoutManager30);
    java.beans.PropertyChangeListener propertyChangeListener32 = null;
    applicationFrame27.removePropertyChangeListener(propertyChangeListener32);
    java.awt.Image image34 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer35 = new org.jfree.ui.DateCellRenderer();
    int i36 = dateCellRenderer35.getDisplayedMnemonic();
    dateCellRenderer35.validate();
    int i38 = applicationFrame27.checkImage(image34, (java.awt.image.ImageObserver)dateCellRenderer35);
    dateCellRenderer35.updateUI();
    org.jfree.ui.BevelArrowIcon bevelArrowIcon43 = new org.jfree.ui.BevelArrowIcon((int)'4', true, false);
    dateCellRenderer35.setDisabledIcon((javax.swing.Icon)bevelArrowIcon43);
    boolean b45 = serialDateChooserPanel22.prepareImage(image23, (int)(byte)0, (int)(short)100, (java.awt.image.ImageObserver)dateCellRenderer35);
    java.awt.event.ContainerListener containerListener46 = null;
    dateCellRenderer35.removeContainerListener(containerListener46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);

  }

}
