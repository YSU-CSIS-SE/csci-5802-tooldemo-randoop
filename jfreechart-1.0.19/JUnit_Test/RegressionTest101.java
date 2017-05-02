
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest101 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest101.test01"); }

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
    java.awt.Shape shape19 = org.jfree.util.ShapeUtilities.clone((java.awt.Shape)rectangle18);
    
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
    org.junit.Assert.assertNotNull(shape19);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest101.test02"); }

    java.lang.String str0 = javax.swing.text.JTextComponent.FOCUS_ACCELERATOR_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "focusAcceleratorKey"+ "'", str0.equals("focusAcceleratorKey"));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest101.test03"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    applicationFrame1.setCursor(0);
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    java.awt.Color color9 = serialDateChooserPanel8.getForeground();
    applicationFrame1.setBackground(color9);
    java.awt.event.MouseWheelListener mouseWheelListener11 = null;
    applicationFrame1.removeMouseWheelListener(mouseWheelListener11);
    boolean b13 = applicationFrame1.isBackgroundSet();
    java.awt.MenuBar menuBar14 = applicationFrame1.getMenuBar();
    java.awt.event.WindowStateListener windowStateListener15 = null;
    applicationFrame1.addWindowStateListener(windowStateListener15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar14);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest101.test04"); }

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
    java.awt.Dimension dimension63 = fontDisplayField62.getPreferredSize();
    java.awt.Color color64 = fontDisplayField62.getCaretColor();
    org.jfree.date.SerialDate serialDate65 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel67 = new org.jfree.ui.SerialDateChooserPanel(serialDate65, true);
    serialDateChooserPanel67.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b72 = serialDateChooserPanel67.isFocusTraversable();
    boolean b73 = serialDateChooserPanel67.getVerifyInputWhenFocusTarget();
    java.awt.Dimension dimension74 = serialDateChooserPanel67.getMinimumSize();
    javax.swing.InputVerifier inputVerifier75 = null;
    serialDateChooserPanel67.setInputVerifier(inputVerifier75);
    org.jfree.text.TextBox textBox77 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets78 = textBox77.getInteriorGap();
    java.awt.Rectangle rectangle79 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle80 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b81 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle79, (java.awt.geom.Rectangle2D)rectangle80);
    rectangleInsets78.trim((java.awt.geom.Rectangle2D)rectangle80);
    java.awt.Rectangle rectangle83 = serialDateChooserPanel67.getBounds(rectangle80);
    // The following exception was thrown during execution in test generation
    try {
    int i86 = fontDisplayField62.getScrollableBlockIncrement(rectangle80, 9999, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertNotNull(dimension63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle83);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest101.test05"); }

    org.jfree.ui.TextAnchor textAnchor0 = org.jfree.ui.TextAnchor.BASELINE_RIGHT;
    boolean b1 = textAnchor0.isRight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest101.test06"); }

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
    org.jfree.ui.BevelArrowIcon bevelArrowIcon17 = new org.jfree.ui.BevelArrowIcon((int)'4', true, false);
    dateCellRenderer9.setDisabledIcon((javax.swing.Icon)bevelArrowIcon17);
    int i19 = bevelArrowIcon17.getIconHeight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 11);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest101.test07"); }

    org.jfree.ui.GradientPaintTransformType gradientPaintTransformType0 = org.jfree.ui.GradientPaintTransformType.VERTICAL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gradientPaintTransformType0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest101.test08"); }

    org.jfree.text.TextLine textLine1 = new org.jfree.text.TextLine("PanelUI");
    org.jfree.text.TextFragment textFragment2 = textLine1.getFirstTextFragment();
    java.awt.Font font4 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.text.TextFragment textFragment6 = new org.jfree.text.TextFragment("PanelUI");
    java.awt.Paint paint7 = textFragment6.getPaint();
    org.jfree.text.TextFragment textFragment8 = new org.jfree.text.TextFragment("org.jfree.ui.SerialDateChooserPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", font4, paint7);
    textLine1.removeFragment(textFragment8);
    org.jfree.text.TextLine textLine11 = new org.jfree.text.TextLine("ThreadContext");
    org.jfree.text.TextFragment textFragment13 = new org.jfree.text.TextFragment("PanelUI");
    java.awt.Paint paint14 = textFragment13.getPaint();
    java.lang.String str15 = textFragment13.getText();
    java.lang.String str16 = textFragment13.getText();
    textLine11.addFragment(textFragment13);
    textLine1.removeFragment(textFragment13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textFragment2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "PanelUI"+ "'", str15.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "PanelUI"+ "'", str16.equals("PanelUI"));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest101.test09"); }

    org.jfree.base.BasicProjectInfo basicProjectInfo1 = new org.jfree.base.BasicProjectInfo();
    basicProjectInfo1.setName("NO_CHANGE");
    org.jfree.base.Library[] library_array4 = basicProjectInfo1.getLibraries();
    org.jfree.util.StrokeList strokeList5 = new org.jfree.util.StrokeList();
    org.jfree.text.TextBox textBox6 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets7 = textBox6.getInteriorGap();
    java.awt.Rectangle rectangle8 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle9 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b10 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle8, (java.awt.geom.Rectangle2D)rectangle9);
    rectangleInsets7.trim((java.awt.geom.Rectangle2D)rectangle9);
    org.jfree.date.SerialDate serialDate12 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel14 = new org.jfree.ui.SerialDateChooserPanel(serialDate12, true);
    boolean b15 = serialDateChooserPanel14.getIgnoreRepaint();
    javax.swing.InputMap inputMap16 = serialDateChooserPanel14.getInputMap();
    java.awt.Rectangle rectangle17 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle18 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b19 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle17, (java.awt.geom.Rectangle2D)rectangle18);
    java.awt.Rectangle rectangle20 = serialDateChooserPanel14.getBounds(rectangle18);
    java.awt.geom.Rectangle2D rectangle2D23 = rectangleInsets7.createInsetRectangle((java.awt.geom.Rectangle2D)rectangle20, false, true);
    org.jfree.util.Log.SimpleMessage simpleMessage24 = new org.jfree.util.Log.SimpleMessage("ClassContext", (java.lang.Object)basicProjectInfo1, (java.lang.Object)strokeList5, (java.lang.Object)rectangleInsets7);
    org.jfree.util.StrokeList strokeList25 = new org.jfree.util.StrokeList();
    java.lang.Object obj26 = strokeList25.clone();
    boolean b27 = strokeList5.equals(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(library_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest101.test10"); }

    java.awt.Font font1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.text.TextFragment textFragment2 = new org.jfree.text.TextFragment("Rotation.CLOCKWISE", font1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

}
