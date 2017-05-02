
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest61 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest61.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    java.awt.Dimension dimension8 = serialDateChooserPanel2.getPreferredSize();
    serialDateChooserPanel2.setInheritsPopupMenu(true);
    java.lang.String str11 = serialDateChooserPanel2.getName();
    boolean b12 = serialDateChooserPanel2.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest61.test02"); }

    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str2 = org.jfree.date.SerialDate.monthCodeToString(13, true);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest61.test03"); }

    org.jfree.text.TextUtilities.setUseDrawRotatedStringWorkaround(true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest61.test04"); }

    org.jfree.ui.FilesystemFilter filesystemFilter3 = new org.jfree.ui.FilesystemFilter("ClassContext", "SortOrder.ASCENDING", false);
    boolean b4 = filesystemFilter3.acceptsDirectories();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest61.test05"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.util.Locale locale3 = applicationFrame1.getLocale();
    applicationFrame1.transferFocusUpCycle();
    java.awt.Graphics graphics5 = null;
    applicationFrame1.update(graphics5);
    java.beans.PropertyChangeListener propertyChangeListener7 = null;
    applicationFrame1.removePropertyChangeListener(propertyChangeListener7);
    org.jfree.date.SerialDate serialDate11 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel13 = new org.jfree.ui.SerialDateChooserPanel(serialDate11, true);
    serialDateChooserPanel13.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext18 = serialDateChooserPanel13.getAccessibleContext();
    java.awt.Dimension dimension19 = serialDateChooserPanel13.getPreferredSize();
    org.jfree.date.SerialDate serialDate21 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel23 = new org.jfree.ui.SerialDateChooserPanel(serialDate21, true);
    boolean b24 = serialDateChooserPanel23.getIgnoreRepaint();
    javax.swing.InputMap inputMap25 = serialDateChooserPanel23.getInputMap();
    serialDateChooserPanel13.setInputMap((int)(byte)1, inputMap25);
    java.awt.event.FocusListener[] focusListener_array27 = serialDateChooserPanel13.getFocusListeners();
    org.jfree.ui.ApplicationFrame applicationFrame29 = new org.jfree.ui.ApplicationFrame("");
    int i30 = applicationFrame29.getState();
    java.awt.event.WindowEvent windowEvent31 = null;
    applicationFrame29.windowIconified(windowEvent31);
    applicationFrame29.show();
    javax.swing.JMenuBar jMenuBar34 = applicationFrame29.getJMenuBar();
    java.awt.event.WindowStateListener[] windowStateListener_array35 = applicationFrame29.getWindowStateListeners();
    org.jfree.ui.KeyedComboBoxModel keyedComboBoxModel36 = new org.jfree.ui.KeyedComboBoxModel((java.lang.Object[])focusListener_array27, (java.lang.Object[])windowStateListener_array35);
    org.jfree.ui.ApplicationFrame applicationFrame38 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener39 = null;
    applicationFrame38.removeWindowStateListener(windowStateListener39);
    boolean b41 = applicationFrame38.isValidateRoot();
    org.jfree.date.SerialDate serialDate42 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel44 = new org.jfree.ui.SerialDateChooserPanel(serialDate42, true);
    boolean b45 = serialDateChooserPanel44.getIgnoreRepaint();
    javax.swing.InputMap inputMap46 = serialDateChooserPanel44.getInputMap();
    java.awt.Rectangle rectangle47 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle48 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b49 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle47, (java.awt.geom.Rectangle2D)rectangle48);
    java.awt.Rectangle rectangle50 = serialDateChooserPanel44.getBounds(rectangle48);
    org.jfree.date.SerialDate serialDate51 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel53 = new org.jfree.ui.SerialDateChooserPanel(serialDate51, true);
    boolean b54 = serialDateChooserPanel53.getIgnoreRepaint();
    java.awt.Rectangle rectangle55 = serialDateChooserPanel53.getVisibleRect();
    boolean b56 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle48, (java.awt.Shape)rectangle55);
    applicationFrame38.setMaximizedBounds(rectangle48);
    javax.accessibility.AccessibleContext accessibleContext58 = applicationFrame38.getAccessibleContext();
    java.awt.event.WindowEvent windowEvent59 = null;
    applicationFrame38.windowDeiconified(windowEvent59);
    org.jfree.text.TextBox textBox61 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets62 = textBox61.getInteriorGap();
    java.awt.Rectangle rectangle63 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle64 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b65 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle63, (java.awt.geom.Rectangle2D)rectangle64);
    rectangleInsets62.trim((java.awt.geom.Rectangle2D)rectangle64);
    double d67 = rectangleInsets62.getLeft();
    org.jfree.text.TextBox textBox68 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets69 = textBox68.getInteriorGap();
    java.awt.Rectangle rectangle70 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle71 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b72 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle70, (java.awt.geom.Rectangle2D)rectangle71);
    rectangleInsets69.trim((java.awt.geom.Rectangle2D)rectangle71);
    rectangleInsets62.trim((java.awt.geom.Rectangle2D)rectangle71);
    applicationFrame38.setBounds(rectangle71);
    java.awt.Font font77 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.text.TextFragment textFragment79 = new org.jfree.text.TextFragment("PanelUI");
    java.awt.Paint paint80 = textFragment79.getPaint();
    org.jfree.text.TextFragment textFragment81 = new org.jfree.text.TextFragment("org.jfree.ui.SerialDateChooserPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", font77, paint80);
    keyedComboBoxModel36.add((java.lang.Object)rectangle71, (java.lang.Object)font77);
    org.jfree.ui.FontChooserDialog fontChooserDialog83 = new org.jfree.ui.FontChooserDialog((java.awt.Frame)applicationFrame1, "black", false, font77);
    // The following exception was thrown during execution in test generation
    try {
    fontChooserDialog83.setOpacity((float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowStateListener_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d67 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint80);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest61.test06"); }

    int i0 = javax.swing.SwingConstants.VERTICAL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest61.test07"); }

    org.jfree.util.UnitType unitType0 = org.jfree.util.UnitType.ABSOLUTE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(unitType0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest61.test08"); }

    org.jfree.text.TextBlock textBlock0 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D1 = null;
    org.jfree.text.TextBlockAnchor textBlockAnchor4 = org.jfree.text.TextBlockAnchor.TOP_RIGHT;
    java.awt.Shape shape8 = textBlock0.calculateBounds(graphics2D1, (float)12, (float)(short)-1, textBlockAnchor4, (float)' ', (float)32, (double)(-1.0f));
    org.jfree.ui.ApplicationFrame applicationFrame10 = new org.jfree.ui.ApplicationFrame("");
    int i11 = applicationFrame10.getState();
    java.awt.event.WindowEvent windowEvent12 = null;
    applicationFrame10.windowIconified(windowEvent12);
    applicationFrame10.show();
    javax.swing.JMenuBar jMenuBar15 = applicationFrame10.getJMenuBar();
    java.awt.event.WindowStateListener[] windowStateListener_array16 = applicationFrame10.getWindowStateListeners();
    java.awt.Shape shape17 = applicationFrame10.getShape();
    boolean b18 = textBlock0.equals((java.lang.Object)shape17);
    org.jfree.ui.HorizontalAlignment horizontalAlignment19 = org.jfree.ui.HorizontalAlignment.CENTER;
    textBlock0.setLineAlignment(horizontalAlignment19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowStateListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(horizontalAlignment19);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest61.test09"); }

    org.jfree.text.TextLine textLine1 = new org.jfree.text.TextLine("NO_CHANGE");
    java.awt.Graphics2D graphics2D2 = null;
    org.jfree.ui.TextAnchor textAnchor5 = org.jfree.ui.TextAnchor.CENTER_LEFT;
    boolean b6 = textAnchor5.isTop();
    // The following exception was thrown during execution in test generation
    try {
    textLine1.draw(graphics2D2, (float)(-1), (float)12, textAnchor5, (float)(-1L), (float)7, 2.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest61.test10"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getDisplayedMnemonic();
    java.lang.String str2 = dateCellRenderer0.getText();
    java.awt.ComponentOrientation componentOrientation3 = null;
    dateCellRenderer0.setComponentOrientation(componentOrientation3);
    org.jfree.date.SerialDate serialDate5 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel7 = new org.jfree.ui.SerialDateChooserPanel(serialDate5, true);
    boolean b8 = serialDateChooserPanel7.getIgnoreRepaint();
    boolean b9 = serialDateChooserPanel7.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array10 = serialDateChooserPanel7.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate11 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel13 = new org.jfree.ui.SerialDateChooserPanel(serialDate11, true);
    boolean b14 = serialDateChooserPanel13.getIgnoreRepaint();
    serialDateChooserPanel13.setAlignmentX((float)(byte)10);
    java.awt.Component component17 = serialDateChooserPanel7.add((java.awt.Component)serialDateChooserPanel13);
    org.jfree.date.SerialDate serialDate18 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel20 = new org.jfree.ui.SerialDateChooserPanel(serialDate18, true);
    java.awt.Color color21 = serialDateChooserPanel20.getForeground();
    component17.setForeground(color21);
    dateCellRenderer0.setForeground(color21);
    java.lang.String str24 = org.jfree.util.PaintUtilities.colorToString(color21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "black"+ "'", str24.equals("black"));

  }

}
