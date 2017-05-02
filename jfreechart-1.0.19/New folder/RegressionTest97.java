
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest97 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest97.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    javax.swing.InputMap inputMap4 = serialDateChooserPanel2.getInputMap();
    javax.swing.TransferHandler transferHandler5 = null;
    serialDateChooserPanel2.setTransferHandler(transferHandler5);
    javax.swing.plaf.PanelUI panelUI7 = null;
    serialDateChooserPanel2.setUI(panelUI7);
    serialDateChooserPanel2.revalidate();
    serialDateChooserPanel2.setBounds(9999, (int)(short)0, 2958465, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest97.test02"); }

    java.awt.Shape shape1 = org.jfree.util.ShapeUtilities.createDiamond((float)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest97.test03"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    serialDateChooserPanel2.resize(8, (int)(short)-1);
    java.awt.Dimension dimension7 = serialDateChooserPanel2.getPreferredSize();
    serialDateChooserPanel2.setAutoscrolls(true);
    boolean b10 = serialDateChooserPanel2.getVerifyInputWhenFocusTarget();
    serialDateChooserPanel2.layout();
    javax.swing.border.Border border12 = serialDateChooserPanel2.getBorder();
    serialDateChooserPanel2.requestFocus();
    java.beans.PropertyChangeListener propertyChangeListener14 = null;
    serialDateChooserPanel2.addPropertyChangeListener(propertyChangeListener14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(border12);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest97.test04"); }

    javax.swing.text.Keymap keymap1 = null;
    javax.swing.text.Keymap keymap2 = javax.swing.text.JTextComponent.addKeymap("bidi level", keymap1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keymap2);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest97.test05"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    applicationFrame1.setLocationByPlatform(false);
    org.jfree.ui.ApplicationFrame applicationFrame6 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener7 = null;
    applicationFrame6.removeWindowStateListener(windowStateListener7);
    boolean b9 = applicationFrame6.isValidateRoot();
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel12 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    boolean b13 = serialDateChooserPanel12.getIgnoreRepaint();
    javax.swing.InputMap inputMap14 = serialDateChooserPanel12.getInputMap();
    java.awt.Rectangle rectangle15 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle16 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b17 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle15, (java.awt.geom.Rectangle2D)rectangle16);
    java.awt.Rectangle rectangle18 = serialDateChooserPanel12.getBounds(rectangle16);
    org.jfree.date.SerialDate serialDate19 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel21 = new org.jfree.ui.SerialDateChooserPanel(serialDate19, true);
    boolean b22 = serialDateChooserPanel21.getIgnoreRepaint();
    java.awt.Rectangle rectangle23 = serialDateChooserPanel21.getVisibleRect();
    boolean b24 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle16, (java.awt.Shape)rectangle23);
    applicationFrame6.setMaximizedBounds(rectangle16);
    javax.accessibility.AccessibleContext accessibleContext26 = applicationFrame6.getAccessibleContext();
    java.awt.event.WindowEvent windowEvent27 = null;
    applicationFrame6.windowDeiconified(windowEvent27);
    org.jfree.text.TextBox textBox29 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets30 = textBox29.getInteriorGap();
    java.awt.Rectangle rectangle31 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle32 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b33 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle31, (java.awt.geom.Rectangle2D)rectangle32);
    rectangleInsets30.trim((java.awt.geom.Rectangle2D)rectangle32);
    double d35 = rectangleInsets30.getLeft();
    org.jfree.text.TextBox textBox36 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets37 = textBox36.getInteriorGap();
    java.awt.Rectangle rectangle38 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle39 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b40 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle38, (java.awt.geom.Rectangle2D)rectangle39);
    rectangleInsets37.trim((java.awt.geom.Rectangle2D)rectangle39);
    rectangleInsets30.trim((java.awt.geom.Rectangle2D)rectangle39);
    applicationFrame6.setBounds(rectangle39);
    applicationFrame1.setMaximizedBounds(rectangle39);
    applicationFrame1.setCursor(11);
    org.jfree.date.SerialDate serialDate47 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel49 = new org.jfree.ui.SerialDateChooserPanel(serialDate47, true);
    boolean b50 = serialDateChooserPanel49.getIgnoreRepaint();
    javax.swing.InputMap inputMap51 = serialDateChooserPanel49.getInputMap();
    javax.swing.TransferHandler transferHandler52 = null;
    serialDateChooserPanel49.setTransferHandler(transferHandler52);
    javax.swing.plaf.PanelUI panelUI54 = null;
    serialDateChooserPanel49.setUI(panelUI54);
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array56 = serialDateChooserPanel49.getHierarchyBoundsListeners();
    javax.swing.JRootPane jRootPane57 = serialDateChooserPanel49.getRootPane();
    applicationFrame1.setLocationRelativeTo((java.awt.Component)serialDateChooserPanel49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d35 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jRootPane57);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest97.test06"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.awt.event.WindowEvent windowEvent3 = null;
    applicationFrame1.windowIconified(windowEvent3);
    org.jfree.date.SerialDate serialDate5 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel7 = new org.jfree.ui.SerialDateChooserPanel(serialDate5, true);
    serialDateChooserPanel7.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext12 = serialDateChooserPanel7.getAccessibleContext();
    java.awt.Dimension dimension13 = serialDateChooserPanel7.getPreferredSize();
    org.jfree.date.SerialDate serialDate15 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel17 = new org.jfree.ui.SerialDateChooserPanel(serialDate15, true);
    boolean b18 = serialDateChooserPanel17.getIgnoreRepaint();
    javax.swing.InputMap inputMap19 = serialDateChooserPanel17.getInputMap();
    serialDateChooserPanel7.setInputMap((int)(byte)1, inputMap19);
    java.awt.event.FocusListener[] focusListener_array21 = serialDateChooserPanel7.getFocusListeners();
    applicationFrame1.remove((java.awt.Component)serialDateChooserPanel7);
    org.jfree.ui.ApplicationFrame applicationFrame24 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener25 = null;
    applicationFrame24.removeWindowStateListener(windowStateListener25);
    applicationFrame24.setExtendedState(6);
    java.awt.Dimension dimension29 = applicationFrame24.size();
    java.awt.Window.Type type30 = applicationFrame24.getType();
    applicationFrame1.setType(type30);
    java.awt.Graphics graphics32 = applicationFrame1.getGraphics();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension29);
    org.junit.Assert.assertTrue("'" + type30 + "' != '" + java.awt.Window.Type.NORMAL + "'", type30.equals(java.awt.Window.Type.NORMAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(graphics32);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest97.test07"); }

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
    javax.swing.Action action63 = fontDisplayField62.getAction();
    
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
    org.junit.Assert.assertNull(action63);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest97.test08"); }

    org.jfree.base.BasicProjectInfo basicProjectInfo4 = new org.jfree.base.BasicProjectInfo("SortOrder.ASCENDING", "Size2D[width=100.0, height=0.0]", "SortOrder.ASCENDING", "content");

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest97.test09"); }

    org.jfree.layout.RadialLayout radialLayout0 = new org.jfree.layout.RadialLayout();
    org.jfree.ui.ApplicationFrame applicationFrame2 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent3 = null;
    applicationFrame2.windowDeiconified(windowEvent3);
    java.awt.LayoutManager layoutManager5 = null;
    applicationFrame2.setLayout(layoutManager5);
    applicationFrame2.show();
    java.awt.Shape shape8 = applicationFrame2.getShape();
    java.lang.String str9 = applicationFrame2.getTitle();
    radialLayout0.removeLayoutComponent((java.awt.Component)applicationFrame2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest97.test10"); }

    javax.swing.JFrame.setDefaultLookAndFeelDecorated(false);

  }

}
