
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest114 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest114.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b7 = serialDateChooserPanel2.isFocusTraversable();
    java.awt.Image image8 = null;
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
    java.lang.String str22 = serialDateChooserPanel17.getUIClassID();
    boolean b23 = serialDateChooserPanel17.isBackgroundSet();
    int i24 = serialDateChooserPanel2.checkImage(image8, (java.awt.image.ImageObserver)serialDateChooserPanel17);
    org.jfree.ui.L1R2ButtonPanel l1R2ButtonPanel28 = new org.jfree.ui.L1R2ButtonPanel("", "hi!", "notify-field-accept");
    javax.swing.JButton jButton29 = l1R2ButtonPanel28.getLeftButton();
    java.lang.Object obj30 = serialDateChooserPanel2.getClientProperty((java.lang.Object)l1R2ButtonPanel28);
    java.awt.Component component33 = l1R2ButtonPanel28.locate(5, 9999);
    int i34 = l1R2ButtonPanel28.getY();
    java.util.Locale locale35 = l1R2ButtonPanel28.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "PanelUI"+ "'", str22.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale35);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest114.test02"); }

    java.lang.String[] str_array6 = new java.lang.String[] { "RectangleAnchor.TOP_LEFT", "RectangleEdge.BOTTOM", "4-January-1900", "hi!", "http://www.jfree.org/jcommon/", "ThreadContext" };
    org.jfree.ui.FilesystemFilter filesystemFilter9 = new org.jfree.ui.FilesystemFilter(str_array6, "5-January-1900", false);
    java.lang.String str10 = filesystemFilter9.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "5-January-1900"+ "'", str10.equals("5-January-1900"));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest114.test03"); }

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
    dateCellRenderer27.setText("NO_CHANGE");
    
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

    if (debug) { System.out.format("%n%s%n","RegressionTest114.test04"); }

    org.jfree.ui.L1R2ButtonPanel l1R2ButtonPanel3 = new org.jfree.ui.L1R2ButtonPanel("", "hi!", "notify-field-accept");
    javax.swing.JButton jButton4 = l1R2ButtonPanel3.getLeftButton();
    float f5 = l1R2ButtonPanel3.getAlignmentX();
    javax.swing.JButton jButton6 = l1R2ButtonPanel3.getRightButton1();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton6);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest114.test05"); }

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
    java.awt.Font font84 = fontChooserDialog83.getSelectedFont();
    org.jfree.ui.RefineryUtilities.centerDialogInParent((java.awt.Dialog)fontChooserDialog83);
    javax.swing.JMenuBar jMenuBar86 = fontChooserDialog83.getJMenuBar();
    org.jfree.ui.StandardDialog standardDialog89 = new org.jfree.ui.StandardDialog((java.awt.Dialog)fontChooserDialog83, "PanelUI", false);
    boolean b90 = fontChooserDialog83.isFocusTraversalPolicySet();
    
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
    org.junit.Assert.assertNotNull(font84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest114.test06"); }

    org.jfree.ui.L1R3ButtonPanel l1R3ButtonPanel4 = new org.jfree.ui.L1R3ButtonPanel("org.jfree.ui.SerialDateChooserPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "black", "black", "ClassContext");
    javax.swing.JButton jButton5 = l1R3ButtonPanel4.getRightButton1();
    org.jfree.ui.ApplicationFrame applicationFrame7 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent8 = null;
    applicationFrame7.windowDeiconified(windowEvent8);
    java.awt.LayoutManager layoutManager10 = null;
    applicationFrame7.setLayout(layoutManager10);
    java.beans.PropertyChangeListener propertyChangeListener12 = null;
    applicationFrame7.removePropertyChangeListener(propertyChangeListener12);
    java.awt.Image image14 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer15 = new org.jfree.ui.DateCellRenderer();
    int i16 = dateCellRenderer15.getDisplayedMnemonic();
    dateCellRenderer15.validate();
    int i18 = applicationFrame7.checkImage(image14, (java.awt.image.ImageObserver)dateCellRenderer15);
    dateCellRenderer15.updateUI();
    org.jfree.ui.BevelArrowIcon bevelArrowIcon23 = new org.jfree.ui.BevelArrowIcon((int)'4', true, false);
    dateCellRenderer15.setDisabledIcon((javax.swing.Icon)bevelArrowIcon23);
    dateCellRenderer15.repaint((int)(short)1, (int)(short)1, 3, 5);
    dateCellRenderer15.setIconTextGap(15);
    dateCellRenderer15.updateUI();
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component34 = jButton5.add((java.awt.Component)dateCellRenderer15, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 32);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest114.test07"); }

    org.jfree.resources.JCommonResources jCommonResources0 = new org.jfree.resources.JCommonResources();
    java.util.Locale locale1 = jCommonResources0.getLocale();
    java.lang.String str2 = jCommonResources0.getBaseBundleName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest114.test08"); }

    org.jfree.util.TableOrder tableOrder0 = org.jfree.util.TableOrder.BY_ROW;
    java.lang.String str1 = tableOrder0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tableOrder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "TableOrder.BY_ROW"+ "'", str1.equals("TableOrder.BY_ROW"));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest114.test09"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    boolean b4 = serialDateChooserPanel2.isCursorSet();
    java.awt.Dimension dimension5 = serialDateChooserPanel2.minimumSize();
    org.jfree.date.SerialDate serialDate6 = serialDateChooserPanel2.getDate();
    java.awt.Event event7 = null;
    boolean b10 = serialDateChooserPanel2.mouseMove(event7, 0, 1);
    java.beans.VetoableChangeListener vetoableChangeListener11 = null;
    serialDateChooserPanel2.removeVetoableChangeListener(vetoableChangeListener11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(serialDate6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest114.test10"); }

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
    boolean b11 = serialDateChooserPanel2.isFocusable();
    javax.accessibility.AccessibleContext accessibleContext12 = serialDateChooserPanel2.getAccessibleContext();
    java.awt.Event event13 = null;
    boolean b16 = serialDateChooserPanel2.mouseDown(event13, 0, 7);
    serialDateChooserPanel2.firePropertyChange("org.jfree.base.BaseBoot", false, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jRootPane10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

}
