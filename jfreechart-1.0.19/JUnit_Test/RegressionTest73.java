
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest73 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest73.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    boolean b4 = serialDateChooserPanel2.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array5 = serialDateChooserPanel2.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    boolean b9 = serialDateChooserPanel8.getIgnoreRepaint();
    serialDateChooserPanel8.setAlignmentX((float)(byte)10);
    java.awt.Component component12 = serialDateChooserPanel2.add((java.awt.Component)serialDateChooserPanel8);
    boolean b13 = serialDateChooserPanel8.isCursorSet();
    java.awt.Rectangle rectangle14 = serialDateChooserPanel8.bounds();
    java.awt.im.InputMethodRequests inputMethodRequests15 = serialDateChooserPanel8.getInputMethodRequests();
    org.jfree.ui.ApplicationFrame applicationFrame17 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener18 = null;
    applicationFrame17.removeWindowStateListener(windowStateListener18);
    java.awt.Cursor cursor20 = null;
    applicationFrame17.setCursor(cursor20);
    serialDateChooserPanel8.setNextFocusableComponent((java.awt.Component)applicationFrame17);
    int i23 = serialDateChooserPanel8.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest73.test02"); }

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
    org.jfree.date.SerialDate serialDate84 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel86 = new org.jfree.ui.SerialDateChooserPanel(serialDate84, true);
    serialDateChooserPanel86.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext91 = serialDateChooserPanel86.getAccessibleContext();
    serialDateChooserPanel86.enableInputMethods(true);
    javax.accessibility.AccessibleContext accessibleContext94 = serialDateChooserPanel86.getAccessibleContext();
    javax.swing.plaf.PanelUI panelUI95 = serialDateChooserPanel86.getUI();
    fontChooserDialog83.setGlassPane((java.awt.Component)serialDateChooserPanel86);
    fontChooserDialog83.setModal(true);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(panelUI95);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest73.test03"); }

    org.jfree.base.AbstractBoot abstractBoot0 = org.jfree.base.BaseBoot.getInstance();
    boolean b1 = abstractBoot0.isBootInProgress();
    abstractBoot0.start();
    boolean b3 = abstractBoot0.isBootInProgress();
    abstractBoot0.start();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractBoot0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest73.test04"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.util.Locale locale3 = applicationFrame1.getLocale();
    applicationFrame1.transferFocusUpCycle();
    boolean b5 = applicationFrame1.isVisible();
    java.awt.im.InputContext inputContext6 = applicationFrame1.getInputContext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputContext6);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest73.test05"); }

    org.jfree.io.IOUtils iOUtils0 = org.jfree.io.IOUtils.getInstance();
    java.io.Reader reader1 = null;
    java.io.Writer writer2 = null;
    // The following exception was thrown during execution in test generation
    try {
    iOUtils0.copyWriter(reader1, writer2, (-458));
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iOUtils0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest73.test06"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    javax.swing.InputMap inputMap4 = serialDateChooserPanel2.getInputMap();
    javax.swing.TransferHandler transferHandler5 = null;
    serialDateChooserPanel2.setTransferHandler(transferHandler5);
    javax.swing.plaf.PanelUI panelUI7 = null;
    serialDateChooserPanel2.setUI(panelUI7);
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array9 = serialDateChooserPanel2.getHierarchyBoundsListeners();
    javax.swing.JRootPane jRootPane10 = serialDateChooserPanel2.getRootPane();
    serialDateChooserPanel2.firePropertyChange("ClassContext", true, false);
    serialDateChooserPanel2.layout();
    serialDateChooserPanel2.nextFocus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jRootPane10);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest73.test07"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    java.awt.Color color3 = serialDateChooserPanel2.getForeground();
    java.awt.Event event4 = null;
    boolean b7 = serialDateChooserPanel2.mouseUp(event4, (int)(byte)10, (int)(short)100);
    serialDateChooserPanel2.removeNotify();
    java.awt.Graphics graphics9 = null;
    serialDateChooserPanel2.paint(graphics9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest73.test08"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    org.jfree.text.TextBox textBox2 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets3 = textBox2.getInteriorGap();
    java.awt.Rectangle rectangle4 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle5 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b6 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle4, (java.awt.geom.Rectangle2D)rectangle5);
    rectangleInsets3.trim((java.awt.geom.Rectangle2D)rectangle5);
    org.jfree.date.SerialDate serialDate8 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel10 = new org.jfree.ui.SerialDateChooserPanel(serialDate8, true);
    boolean b11 = serialDateChooserPanel10.getIgnoreRepaint();
    javax.swing.InputMap inputMap12 = serialDateChooserPanel10.getInputMap();
    java.awt.Rectangle rectangle13 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle14 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b15 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle13, (java.awt.geom.Rectangle2D)rectangle14);
    java.awt.Rectangle rectangle16 = serialDateChooserPanel10.getBounds(rectangle14);
    java.awt.geom.Rectangle2D rectangle2D19 = rectangleInsets3.createInsetRectangle((java.awt.geom.Rectangle2D)rectangle16, false, true);
    java.awt.geom.Rectangle2D rectangle2D20 = rectangleInsets1.createInsetRectangle(rectangle2D19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
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
    org.junit.Assert.assertNotNull(rectangle2D19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D20);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest73.test09"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    javax.swing.InputMap inputMap4 = serialDateChooserPanel2.getInputMap();
    serialDateChooserPanel2.hide();
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    boolean b9 = serialDateChooserPanel8.getIgnoreRepaint();
    boolean b10 = serialDateChooserPanel8.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array11 = serialDateChooserPanel8.getPropertyChangeListeners();
    javax.swing.InputMap inputMap12 = serialDateChooserPanel8.getInputMap();
    boolean b13 = serialDateChooserPanel8.isForegroundSet();
    serialDateChooserPanel8.layout();
    java.awt.Point point15 = serialDateChooserPanel8.getLocation();
    java.awt.Point point16 = serialDateChooserPanel2.getLocation(point15);
    boolean b17 = serialDateChooserPanel2.isBackgroundSet();
    java.awt.event.MouseListener mouseListener18 = null;
    serialDateChooserPanel2.removeMouseListener(mouseListener18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest73.test10"); }

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
    int i14 = dateCellRenderer9.getDisplayedMnemonicIndex();
    // The following exception was thrown during execution in test generation
    try {
    dateCellRenderer9.setHorizontalTextPosition(32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

}
