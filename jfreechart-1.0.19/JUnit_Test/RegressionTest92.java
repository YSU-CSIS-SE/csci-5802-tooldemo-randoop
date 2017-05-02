
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest92 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest92.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    java.beans.VetoableChangeListener vetoableChangeListener3 = null;
    serialDateChooserPanel2.removeVetoableChangeListener(vetoableChangeListener3);
    boolean b5 = serialDateChooserPanel2.requestDefaultFocus();
    serialDateChooserPanel2.removeAll();
    boolean b7 = serialDateChooserPanel2.requestFocusInWindow();
    java.awt.event.InputMethodListener[] inputMethodListener_array8 = serialDateChooserPanel2.getInputMethodListeners();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array9 = serialDateChooserPanel2.getMouseMotionListeners();
    javax.swing.plaf.PanelUI panelUI10 = serialDateChooserPanel2.getUI();
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior11 = serialDateChooserPanel2.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMethodListener_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(panelUI10);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior11 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior11.equals(java.awt.Component.BaselineResizeBehavior.OTHER));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest92.test02"); }

    int[] i_array5 = new int[] { (byte)100, 4, 6, (-1) };
    org.jfree.layout.FormatLayout formatLayout6 = new org.jfree.layout.FormatLayout((int)'#', i_array5);
    org.jfree.ui.DateCellRenderer dateCellRenderer8 = new org.jfree.ui.DateCellRenderer();
    int i9 = dateCellRenderer8.getDisplayedMnemonic();
    dateCellRenderer8.validate();
    org.jfree.date.SerialDate serialDate11 = null;
    org.jfree.date.SerialDate serialDate13 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel15 = new org.jfree.ui.SerialDateChooserPanel(serialDate13, true);
    java.awt.Color color16 = serialDateChooserPanel15.getForeground();
    org.jfree.date.SerialDate serialDate17 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel19 = new org.jfree.ui.SerialDateChooserPanel(serialDate17, true);
    java.awt.Color color20 = serialDateChooserPanel19.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame22 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener23 = null;
    applicationFrame22.removeWindowStateListener(windowStateListener23);
    applicationFrame22.setCursor(0);
    org.jfree.date.SerialDate serialDate27 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel29 = new org.jfree.ui.SerialDateChooserPanel(serialDate27, true);
    java.awt.Color color30 = serialDateChooserPanel29.getForeground();
    applicationFrame22.setBackground(color30);
    boolean b32 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color20, (java.awt.Paint)color30);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel33 = new org.jfree.ui.SerialDateChooserPanel(serialDate11, false, color16, color30);
    dateCellRenderer8.setBackground(color30);
    javax.swing.Icon icon35 = dateCellRenderer8.getIcon();
    org.jfree.ui.ApplicationFrame applicationFrame37 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent38 = null;
    applicationFrame37.windowDeiconified(windowEvent38);
    java.awt.LayoutManager layoutManager40 = null;
    applicationFrame37.setLayout(layoutManager40);
    java.beans.PropertyChangeListener propertyChangeListener42 = null;
    applicationFrame37.removePropertyChangeListener(propertyChangeListener42);
    java.awt.Image image44 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer45 = new org.jfree.ui.DateCellRenderer();
    int i46 = dateCellRenderer45.getDisplayedMnemonic();
    dateCellRenderer45.validate();
    int i48 = applicationFrame37.checkImage(image44, (java.awt.image.ImageObserver)dateCellRenderer45);
    org.jfree.ui.BevelArrowIcon bevelArrowIcon52 = new org.jfree.ui.BevelArrowIcon((int)'4', true, false);
    dateCellRenderer45.setIcon((javax.swing.Icon)bevelArrowIcon52);
    dateCellRenderer8.setIcon((javax.swing.Icon)bevelArrowIcon52);
    javax.swing.Icon icon55 = dateCellRenderer8.getIcon();
    javax.swing.Icon icon56 = dateCellRenderer8.getDisabledIcon();
    formatLayout6.addLayoutComponent("Size2D[width=100.0, height=0.0]", (java.awt.Component)dateCellRenderer8);
    org.jfree.ui.ApplicationFrame applicationFrame59 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent60 = null;
    applicationFrame59.windowDeiconified(windowEvent60);
    applicationFrame59.firePropertyChange("hi!", '#', '4');
    java.awt.FocusTraversalPolicy focusTraversalPolicy66 = applicationFrame59.getFocusTraversalPolicy();
    org.jfree.date.SerialDate serialDate67 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel69 = new org.jfree.ui.SerialDateChooserPanel(serialDate67, true);
    boolean b70 = serialDateChooserPanel69.getIgnoreRepaint();
    javax.swing.InputMap inputMap71 = serialDateChooserPanel69.getInputMap();
    javax.swing.TransferHandler transferHandler72 = null;
    serialDateChooserPanel69.setTransferHandler(transferHandler72);
    javax.swing.plaf.PanelUI panelUI74 = null;
    serialDateChooserPanel69.setUI(panelUI74);
    java.awt.Dimension dimension76 = serialDateChooserPanel69.getMaximumSize();
    applicationFrame59.resize(dimension76);
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Dimension dimension78 = formatLayout6.minimumLayoutSize((java.awt.Container)applicationFrame59);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(icon55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusTraversalPolicy66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension76);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest92.test03"); }

    org.jfree.ui.about.ProjectInfo projectInfo0 = org.jfree.JCommon.INFO;
    org.jfree.base.Library[] library_array1 = projectInfo0.getLibraries();
    projectInfo0.setAutoBoot(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(projectInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(library_array1);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest92.test04"); }

    org.jfree.ui.L1R2ButtonPanel l1R2ButtonPanel3 = new org.jfree.ui.L1R2ButtonPanel("", "hi!", "notify-field-accept");
    java.awt.Event event4 = null;
    boolean b7 = l1R2ButtonPanel3.mouseDrag(event4, 10, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest92.test05"); }

    org.jfree.ui.StandardGradientPaintTransformer standardGradientPaintTransformer0 = new org.jfree.ui.StandardGradientPaintTransformer();
    org.jfree.ui.GradientPaintTransformType gradientPaintTransformType1 = standardGradientPaintTransformer0.getType();
    org.jfree.ui.GradientPaintTransformType gradientPaintTransformType2 = standardGradientPaintTransformer0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gradientPaintTransformType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gradientPaintTransformType2);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest92.test06"); }

    org.jfree.util.ObjectTable objectTable1 = new org.jfree.util.ObjectTable((int)(byte)100);
    objectTable1.ensureCapacity(0, (int)(byte)0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest92.test07"); }

    org.jfree.ui.ApplicationFrame applicationFrame2 = new org.jfree.ui.ApplicationFrame("");
    int i3 = applicationFrame2.getState();
    java.util.Locale locale4 = applicationFrame2.getLocale();
    applicationFrame2.transferFocusUpCycle();
    java.awt.Graphics graphics6 = null;
    applicationFrame2.update(graphics6);
    java.beans.PropertyChangeListener propertyChangeListener8 = null;
    applicationFrame2.removePropertyChangeListener(propertyChangeListener8);
    org.jfree.date.SerialDate serialDate12 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel14 = new org.jfree.ui.SerialDateChooserPanel(serialDate12, true);
    serialDateChooserPanel14.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext19 = serialDateChooserPanel14.getAccessibleContext();
    java.awt.Dimension dimension20 = serialDateChooserPanel14.getPreferredSize();
    org.jfree.date.SerialDate serialDate22 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel24 = new org.jfree.ui.SerialDateChooserPanel(serialDate22, true);
    boolean b25 = serialDateChooserPanel24.getIgnoreRepaint();
    javax.swing.InputMap inputMap26 = serialDateChooserPanel24.getInputMap();
    serialDateChooserPanel14.setInputMap((int)(byte)1, inputMap26);
    java.awt.event.FocusListener[] focusListener_array28 = serialDateChooserPanel14.getFocusListeners();
    org.jfree.ui.ApplicationFrame applicationFrame30 = new org.jfree.ui.ApplicationFrame("");
    int i31 = applicationFrame30.getState();
    java.awt.event.WindowEvent windowEvent32 = null;
    applicationFrame30.windowIconified(windowEvent32);
    applicationFrame30.show();
    javax.swing.JMenuBar jMenuBar35 = applicationFrame30.getJMenuBar();
    java.awt.event.WindowStateListener[] windowStateListener_array36 = applicationFrame30.getWindowStateListeners();
    org.jfree.ui.KeyedComboBoxModel keyedComboBoxModel37 = new org.jfree.ui.KeyedComboBoxModel((java.lang.Object[])focusListener_array28, (java.lang.Object[])windowStateListener_array36);
    org.jfree.ui.ApplicationFrame applicationFrame39 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener40 = null;
    applicationFrame39.removeWindowStateListener(windowStateListener40);
    boolean b42 = applicationFrame39.isValidateRoot();
    org.jfree.date.SerialDate serialDate43 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel45 = new org.jfree.ui.SerialDateChooserPanel(serialDate43, true);
    boolean b46 = serialDateChooserPanel45.getIgnoreRepaint();
    javax.swing.InputMap inputMap47 = serialDateChooserPanel45.getInputMap();
    java.awt.Rectangle rectangle48 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle49 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b50 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle48, (java.awt.geom.Rectangle2D)rectangle49);
    java.awt.Rectangle rectangle51 = serialDateChooserPanel45.getBounds(rectangle49);
    org.jfree.date.SerialDate serialDate52 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel54 = new org.jfree.ui.SerialDateChooserPanel(serialDate52, true);
    boolean b55 = serialDateChooserPanel54.getIgnoreRepaint();
    java.awt.Rectangle rectangle56 = serialDateChooserPanel54.getVisibleRect();
    boolean b57 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle49, (java.awt.Shape)rectangle56);
    applicationFrame39.setMaximizedBounds(rectangle49);
    javax.accessibility.AccessibleContext accessibleContext59 = applicationFrame39.getAccessibleContext();
    java.awt.event.WindowEvent windowEvent60 = null;
    applicationFrame39.windowDeiconified(windowEvent60);
    org.jfree.text.TextBox textBox62 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets63 = textBox62.getInteriorGap();
    java.awt.Rectangle rectangle64 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle65 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b66 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle64, (java.awt.geom.Rectangle2D)rectangle65);
    rectangleInsets63.trim((java.awt.geom.Rectangle2D)rectangle65);
    double d68 = rectangleInsets63.getLeft();
    org.jfree.text.TextBox textBox69 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets70 = textBox69.getInteriorGap();
    java.awt.Rectangle rectangle71 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle72 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b73 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle71, (java.awt.geom.Rectangle2D)rectangle72);
    rectangleInsets70.trim((java.awt.geom.Rectangle2D)rectangle72);
    rectangleInsets63.trim((java.awt.geom.Rectangle2D)rectangle72);
    applicationFrame39.setBounds(rectangle72);
    java.awt.Font font78 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.text.TextFragment textFragment80 = new org.jfree.text.TextFragment("PanelUI");
    java.awt.Paint paint81 = textFragment80.getPaint();
    org.jfree.text.TextFragment textFragment82 = new org.jfree.text.TextFragment("org.jfree.ui.SerialDateChooserPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", font78, paint81);
    keyedComboBoxModel37.add((java.lang.Object)rectangle72, (java.lang.Object)font78);
    org.jfree.ui.FontChooserDialog fontChooserDialog84 = new org.jfree.ui.FontChooserDialog((java.awt.Frame)applicationFrame2, "black", false, font78);
    java.awt.Font font85 = fontChooserDialog84.getSelectedFont();
    javax.swing.JButton jButton86 = org.jfree.ui.RefineryUtilities.createJButton("org.jfree.ui.SerialDateChooserPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", font85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowStateListener_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d68 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton86);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest92.test08"); }

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
    java.lang.String str23 = serialDateChooserPanel7.getUIClassID();
    org.jfree.date.SerialDate serialDate24 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel26 = new org.jfree.ui.SerialDateChooserPanel(serialDate24, true);
    boolean b27 = serialDateChooserPanel26.getIgnoreRepaint();
    java.awt.event.ContainerListener containerListener28 = null;
    serialDateChooserPanel26.removeContainerListener(containerListener28);
    java.awt.Image image30 = null;
    org.jfree.date.SerialDate serialDate33 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel35 = new org.jfree.ui.SerialDateChooserPanel(serialDate33, true);
    serialDateChooserPanel35.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext40 = serialDateChooserPanel35.getAccessibleContext();
    serialDateChooserPanel35.invalidate();
    serialDateChooserPanel35.grabFocus();
    javax.swing.JPopupMenu jPopupMenu43 = null;
    serialDateChooserPanel35.setComponentPopupMenu(jPopupMenu43);
    int i47 = serialDateChooserPanel35.getBaseline(1, 9999);
    int i48 = serialDateChooserPanel26.checkImage(image30, 12, 4, (java.awt.image.ImageObserver)serialDateChooserPanel35);
    org.jfree.text.TextBox textBox49 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets50 = textBox49.getInteriorGap();
    java.awt.Rectangle rectangle51 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle52 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b53 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle51, (java.awt.geom.Rectangle2D)rectangle52);
    rectangleInsets50.trim((java.awt.geom.Rectangle2D)rectangle52);
    double d55 = rectangleInsets50.getLeft();
    org.jfree.ui.ApplicationFrame applicationFrame57 = new org.jfree.ui.ApplicationFrame("");
    java.awt.Rectangle rectangle58 = applicationFrame57.getMaximizedBounds();
    java.awt.event.MouseWheelListener mouseWheelListener59 = null;
    applicationFrame57.removeMouseWheelListener(mouseWheelListener59);
    applicationFrame57.setAutoRequestFocus(true);
    java.awt.event.KeyListener keyListener63 = null;
    applicationFrame57.addKeyListener(keyListener63);
    java.awt.Rectangle rectangle65 = applicationFrame57.bounds();
    java.awt.geom.Rectangle2D rectangle2D66 = rectangleInsets50.createInsetRectangle((java.awt.geom.Rectangle2D)rectangle65);
    java.awt.Rectangle rectangle67 = serialDateChooserPanel26.getBounds(rectangle65);
    javax.swing.KeyStroke keyStroke69 = null;
    // The following exception was thrown during execution in test generation
    try {
    serialDateChooserPanel7.registerKeyboardAction((java.awt.event.ActionListener)serialDateChooserPanel26, "org.jfree.ui.FloatDimension:={width=0.0, height=0.0}", keyStroke69, 32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "PanelUI"+ "'", str23.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d55 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle67);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest92.test09"); }

    org.jfree.util.ObjectList objectList1 = new org.jfree.util.ObjectList(12);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest92.test10"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    boolean b4 = serialDateChooserPanel2.isCursorSet();
    java.awt.Dimension dimension5 = serialDateChooserPanel2.minimumSize();
    org.jfree.date.SerialDate serialDate6 = serialDateChooserPanel2.getDate();
    java.awt.Event event7 = null;
    boolean b10 = serialDateChooserPanel2.mouseMove(event7, 0, 1);
    java.awt.Event event11 = null;
    boolean b14 = serialDateChooserPanel2.mouseEnter(event11, 0, 15);
    int i15 = serialDateChooserPanel2.getWidth();
    float f16 = serialDateChooserPanel2.getAlignmentY();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f16 == 0.5f);

  }

}
