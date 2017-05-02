
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest76 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest76.test01"); }

    boolean b2 = org.jfree.util.StringUtils.startsWithIgnoreCase("RectangleAnchor.TOP_LEFT", "RectangleInsets[t=1.0,l=3.0,b=1.0,r=3.0]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest76.test02"); }

    org.jfree.ui.GradientPaintTransformType gradientPaintTransformType0 = org.jfree.ui.GradientPaintTransformType.HORIZONTAL;
    java.lang.String str1 = gradientPaintTransformType0.toString();
    java.lang.String str2 = gradientPaintTransformType0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gradientPaintTransformType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "GradientPaintTransformType.HORIZONTAL"+ "'", str1.equals("GradientPaintTransformType.HORIZONTAL"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "GradientPaintTransformType.HORIZONTAL"+ "'", str2.equals("GradientPaintTransformType.HORIZONTAL"));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest76.test03"); }

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
    java.awt.Point point23 = serialDateChooserPanel2.getMousePosition();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point23);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest76.test04"); }

    org.jfree.ui.L1R3ButtonPanel l1R3ButtonPanel4 = new org.jfree.ui.L1R3ButtonPanel("org.jfree.ui.SerialDateChooserPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "black", "black", "ClassContext");
    javax.swing.JButton jButton5 = l1R3ButtonPanel4.getRightButton1();
    javax.swing.JButton jButton6 = l1R3ButtonPanel4.getRightButton3();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton6);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest76.test05"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array1 = lengthLimitingDocument0.getDocumentListeners();
    int i2 = lengthLimitingDocument0.getMaxLength();
    javax.swing.text.DocumentFilter documentFilter3 = lengthLimitingDocument0.getDocumentFilter();
    java.util.Dictionary<java.lang.Object,java.lang.Object> dictionary_obj_obj4 = lengthLimitingDocument0.getDocumentProperties();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(documentFilter3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dictionary_obj_obj4);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest76.test06"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array1 = lengthLimitingDocument0.getDocumentListeners();
    int i2 = lengthLimitingDocument0.getMaxLength();
    java.io.PrintStream printStream3 = null;
    // The following exception was thrown during execution in test generation
    try {
    lengthLimitingDocument0.dump(printStream3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest76.test07"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    serialDateChooserPanel2.enableInputMethods(true);
    java.lang.String str10 = serialDateChooserPanel2.getToolTipText();
    java.awt.event.ContainerListener containerListener11 = null;
    serialDateChooserPanel2.addContainerListener(containerListener11);
    org.jfree.date.SerialDate serialDate13 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel15 = new org.jfree.ui.SerialDateChooserPanel(serialDate13, true);
    java.awt.Color color16 = serialDateChooserPanel15.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame18 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener19 = null;
    applicationFrame18.removeWindowStateListener(windowStateListener19);
    applicationFrame18.setCursor(0);
    org.jfree.date.SerialDate serialDate23 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate23, true);
    java.awt.Color color26 = serialDateChooserPanel25.getForeground();
    applicationFrame18.setBackground(color26);
    boolean b28 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color16, (java.awt.Paint)color26);
    serialDateChooserPanel2.setBackground(color16);
    boolean b30 = serialDateChooserPanel2.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest76.test08"); }

    org.jfree.layout.RadialLayout radialLayout0 = new org.jfree.layout.RadialLayout();
    java.awt.Font font2 = null;
    javax.swing.JLabel jLabel3 = org.jfree.ui.RefineryUtilities.createJLabel("LabelUI", font2);
    radialLayout0.removeLayoutComponent((java.awt.Component)jLabel3);
    java.beans.PropertyChangeListener[] propertyChangeListener_array5 = jLabel3.getPropertyChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLabel3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array5);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest76.test09"); }

    org.jfree.ui.BevelArrowIcon bevelArrowIcon3 = new org.jfree.ui.BevelArrowIcon(12, true, false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest76.test10"); }

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
    javax.swing.InputMap inputMap97 = serialDateChooserPanel86.getInputMap();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap97);

  }

}
