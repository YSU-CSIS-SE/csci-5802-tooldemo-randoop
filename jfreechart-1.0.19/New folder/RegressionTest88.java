
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest88 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest88.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b7 = serialDateChooserPanel2.isFocusTraversable();
    boolean b8 = serialDateChooserPanel2.getVerifyInputWhenFocusTarget();
    serialDateChooserPanel2.setFocusTraversalPolicyProvider(true);
    java.lang.String str11 = serialDateChooserPanel2.getName();
    serialDateChooserPanel2.enable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest88.test02"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    dateCellRenderer0.setIconTextGap(5);
    dateCellRenderer0.validate();
    dateCellRenderer0.firePropertyChange("LabelUI", false, true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest88.test03"); }

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
    org.jfree.util.Log.log((int)(short)0, (java.lang.Object)fontChooserDialog84);
    org.jfree.layout.LCBLayout lCBLayout88 = new org.jfree.layout.LCBLayout(9);
    fontChooserDialog84.setLayout((java.awt.LayoutManager)lCBLayout88);
    org.jfree.date.SerialDate serialDate90 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel92 = new org.jfree.ui.SerialDateChooserPanel(serialDate90, true);
    boolean b93 = serialDateChooserPanel92.getIgnoreRepaint();
    javax.swing.InputMap inputMap94 = serialDateChooserPanel92.getInputMap();
    java.awt.Dimension dimension95 = serialDateChooserPanel92.getMaximumSize();
    java.awt.Dimension dimension96 = lCBLayout88.minimumLayoutSize((java.awt.Container)serialDateChooserPanel92);
    
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
    org.junit.Assert.assertTrue(b93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension96);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest88.test04"); }

    org.jfree.ui.L1R3ButtonPanel l1R3ButtonPanel4 = new org.jfree.ui.L1R3ButtonPanel("TableOrder.BY_COLUMN", "ClassContext", "http://www.jfree.org/jcommon/", "ToolTipText");
    javax.swing.JButton jButton5 = l1R3ButtonPanel4.getLeftButton();
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    boolean b9 = serialDateChooserPanel8.getIgnoreRepaint();
    serialDateChooserPanel8.resize(8, (int)(short)-1);
    java.awt.Dimension dimension13 = serialDateChooserPanel8.getPreferredSize();
    serialDateChooserPanel8.setAutoscrolls(true);
    boolean b16 = serialDateChooserPanel8.getVerifyInputWhenFocusTarget();
    serialDateChooserPanel8.layout();
    int i18 = serialDateChooserPanel8.getWidth();
    serialDateChooserPanel8.removeAll();
    org.jfree.date.SerialDate serialDate20 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel22 = new org.jfree.ui.SerialDateChooserPanel(serialDate20, true);
    serialDateChooserPanel22.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext27 = serialDateChooserPanel22.getAccessibleContext();
    java.awt.Dimension dimension28 = serialDateChooserPanel22.getPreferredSize();
    org.jfree.date.SerialDate serialDate30 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel32 = new org.jfree.ui.SerialDateChooserPanel(serialDate30, true);
    boolean b33 = serialDateChooserPanel32.getIgnoreRepaint();
    javax.swing.InputMap inputMap34 = serialDateChooserPanel32.getInputMap();
    serialDateChooserPanel22.setInputMap((int)(byte)1, inputMap34);
    java.awt.event.FocusListener[] focusListener_array36 = serialDateChooserPanel22.getFocusListeners();
    org.jfree.ui.ApplicationFrame applicationFrame38 = new org.jfree.ui.ApplicationFrame("");
    int i39 = applicationFrame38.getState();
    java.awt.event.WindowEvent windowEvent40 = null;
    applicationFrame38.windowIconified(windowEvent40);
    applicationFrame38.show();
    javax.swing.JMenuBar jMenuBar43 = applicationFrame38.getJMenuBar();
    java.awt.event.WindowStateListener[] windowStateListener_array44 = applicationFrame38.getWindowStateListeners();
    org.jfree.ui.KeyedComboBoxModel keyedComboBoxModel45 = new org.jfree.ui.KeyedComboBoxModel((java.lang.Object[])focusListener_array36, (java.lang.Object[])windowStateListener_array44);
    jButton5.putClientProperty((java.lang.Object)serialDateChooserPanel8, (java.lang.Object)keyedComboBoxModel45);
    keyedComboBoxModel45.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowStateListener_array44);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest88.test05"); }

    java.awt.Insets insets0 = null;
    org.jfree.ui.InsetsChooserPanel insetsChooserPanel1 = new org.jfree.ui.InsetsChooserPanel(insets0);
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
    insetsChooserPanel1.setFont(font3);
    org.jfree.date.SerialDate serialDate22 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel24 = new org.jfree.ui.SerialDateChooserPanel(serialDate22, true);
    java.awt.Color color25 = serialDateChooserPanel24.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame27 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener28 = null;
    applicationFrame27.removeWindowStateListener(windowStateListener28);
    applicationFrame27.setCursor(0);
    org.jfree.date.SerialDate serialDate32 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel34 = new org.jfree.ui.SerialDateChooserPanel(serialDate32, true);
    java.awt.Color color35 = serialDateChooserPanel34.getForeground();
    applicationFrame27.setBackground(color35);
    boolean b37 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color25, (java.awt.Paint)color35);
    org.jfree.ui.PaintSample paintSample38 = new org.jfree.ui.PaintSample((java.awt.Paint)color35);
    java.awt.event.ComponentListener componentListener39 = null;
    paintSample38.addComponentListener(componentListener39);
    insetsChooserPanel1.remove((java.awt.Component)paintSample38);
    insetsChooserPanel1.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest88.test06"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    applicationFrame1.setExtendedState(6);
    java.awt.Dimension dimension6 = applicationFrame1.size();
    java.awt.Window.Type type7 = applicationFrame1.getType();
    int i8 = applicationFrame1.getDefaultCloseOperation();
    org.jfree.ui.DrawablePanel drawablePanel9 = new org.jfree.ui.DrawablePanel();
    java.awt.Dimension dimension10 = drawablePanel9.getMinimumSize();
    java.awt.Dimension dimension11 = drawablePanel9.getPreferredSize();
    applicationFrame1.setMaximumSize(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + java.awt.Window.Type.NORMAL + "'", type7.equals(java.awt.Window.Type.NORMAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest88.test07"); }

    org.jfree.util.LogContext logContext1 = org.jfree.util.Log.createContext("5-January-1900");
    org.jfree.date.SerialDate serialDate3 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel5 = new org.jfree.ui.SerialDateChooserPanel(serialDate3, true);
    boolean b6 = serialDateChooserPanel5.getIgnoreRepaint();
    boolean b7 = serialDateChooserPanel5.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array8 = serialDateChooserPanel5.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel11 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, true);
    boolean b12 = serialDateChooserPanel11.getIgnoreRepaint();
    serialDateChooserPanel11.setAlignmentX((float)(byte)10);
    java.awt.Component component15 = serialDateChooserPanel5.add((java.awt.Component)serialDateChooserPanel11);
    boolean b16 = serialDateChooserPanel11.isCursorSet();
    java.awt.Rectangle rectangle17 = serialDateChooserPanel11.bounds();
    org.jfree.ui.DateCellRenderer dateCellRenderer18 = new org.jfree.ui.DateCellRenderer();
    int i19 = dateCellRenderer18.getDisplayedMnemonic();
    java.lang.String str20 = dateCellRenderer18.getText();
    java.awt.ComponentOrientation componentOrientation21 = null;
    dateCellRenderer18.setComponentOrientation(componentOrientation21);
    org.jfree.date.SerialDate serialDate23 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate23, true);
    boolean b26 = serialDateChooserPanel25.getIgnoreRepaint();
    boolean b27 = serialDateChooserPanel25.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array28 = serialDateChooserPanel25.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate29 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel31 = new org.jfree.ui.SerialDateChooserPanel(serialDate29, true);
    boolean b32 = serialDateChooserPanel31.getIgnoreRepaint();
    serialDateChooserPanel31.setAlignmentX((float)(byte)10);
    java.awt.Component component35 = serialDateChooserPanel25.add((java.awt.Component)serialDateChooserPanel31);
    org.jfree.date.SerialDate serialDate36 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel38 = new org.jfree.ui.SerialDateChooserPanel(serialDate36, true);
    java.awt.Color color39 = serialDateChooserPanel38.getForeground();
    component35.setForeground(color39);
    dateCellRenderer18.setForeground(color39);
    org.jfree.date.SerialDate serialDate45 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel47 = new org.jfree.ui.SerialDateChooserPanel(serialDate45, true);
    boolean b48 = serialDateChooserPanel47.getIgnoreRepaint();
    serialDateChooserPanel47.resize(8, (int)(short)-1);
    java.awt.Dimension dimension52 = serialDateChooserPanel47.getPreferredSize();
    java.lang.Exception exception54 = null;
    org.jfree.util.StackableRuntimeException stackableRuntimeException55 = new org.jfree.util.StackableRuntimeException("", exception54);
    org.jfree.util.Log.log((int)(byte)10, (java.lang.Object)dimension52, (java.lang.Exception)stackableRuntimeException55);
    org.jfree.util.Log.log((int)(byte)10, (java.lang.Object)(short)10, (java.lang.Exception)stackableRuntimeException55);
    org.jfree.util.Log.error((java.lang.Object)color39, (java.lang.Exception)stackableRuntimeException55);
    logContext1.log(13, (java.lang.Object)serialDateChooserPanel11, (java.lang.Exception)stackableRuntimeException55);
    org.jfree.date.SerialDate serialDate60 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel62 = new org.jfree.ui.SerialDateChooserPanel(serialDate60, true);
    serialDateChooserPanel62.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext67 = serialDateChooserPanel62.getAccessibleContext();
    java.awt.Dimension dimension68 = serialDateChooserPanel62.getPreferredSize();
    org.jfree.date.SerialDate serialDate70 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel72 = new org.jfree.ui.SerialDateChooserPanel(serialDate70, true);
    boolean b73 = serialDateChooserPanel72.getIgnoreRepaint();
    javax.swing.InputMap inputMap74 = serialDateChooserPanel72.getInputMap();
    serialDateChooserPanel62.setInputMap((int)(byte)1, inputMap74);
    logContext1.error((java.lang.Object)inputMap74);
    org.jfree.date.SerialDate serialDate77 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel79 = new org.jfree.ui.SerialDateChooserPanel(serialDate77, true);
    serialDateChooserPanel79.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext84 = serialDateChooserPanel79.getAccessibleContext();
    serialDateChooserPanel79.invalidate();
    serialDateChooserPanel79.grabFocus();
    logContext1.debug((java.lang.Object)serialDateChooserPanel79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(logContext1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext84);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest88.test08"); }

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
    java.lang.String str13 = serialDateChooserPanel8.getUIClassID();
    boolean b14 = serialDateChooserPanel8.isBackgroundSet();
    java.awt.event.FocusListener focusListener15 = null;
    serialDateChooserPanel8.addFocusListener(focusListener15);
    java.lang.String str17 = serialDateChooserPanel8.getUIClassID();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "PanelUI"+ "'", str13.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "PanelUI"+ "'", str17.equals("PanelUI"));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest88.test09"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    applicationFrame1.firePropertyChange("hi!", '#', '4');
    boolean b8 = applicationFrame1.isFocusableWindow();
    java.awt.event.WindowEvent windowEvent9 = null;
    applicationFrame1.windowDeactivated(windowEvent9);
    java.awt.Image image11 = null;
    org.jfree.date.SerialDate serialDate14 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel16 = new org.jfree.ui.SerialDateChooserPanel(serialDate14, true);
    serialDateChooserPanel16.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext21 = serialDateChooserPanel16.getAccessibleContext();
    serialDateChooserPanel16.invalidate();
    serialDateChooserPanel16.grabFocus();
    java.awt.event.HierarchyListener[] hierarchyListener_array24 = serialDateChooserPanel16.getHierarchyListeners();
    org.jfree.ui.DateCellRenderer dateCellRenderer25 = new org.jfree.ui.DateCellRenderer();
    int i26 = dateCellRenderer25.getDisplayedMnemonic();
    dateCellRenderer25.validate();
    org.jfree.date.SerialDate serialDate28 = null;
    org.jfree.date.SerialDate serialDate30 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel32 = new org.jfree.ui.SerialDateChooserPanel(serialDate30, true);
    java.awt.Color color33 = serialDateChooserPanel32.getForeground();
    org.jfree.date.SerialDate serialDate34 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel36 = new org.jfree.ui.SerialDateChooserPanel(serialDate34, true);
    java.awt.Color color37 = serialDateChooserPanel36.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame39 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener40 = null;
    applicationFrame39.removeWindowStateListener(windowStateListener40);
    applicationFrame39.setCursor(0);
    org.jfree.date.SerialDate serialDate44 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel46 = new org.jfree.ui.SerialDateChooserPanel(serialDate44, true);
    java.awt.Color color47 = serialDateChooserPanel46.getForeground();
    applicationFrame39.setBackground(color47);
    boolean b49 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color37, (java.awt.Paint)color47);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel50 = new org.jfree.ui.SerialDateChooserPanel(serialDate28, false, color33, color47);
    dateCellRenderer25.setBackground(color47);
    java.awt.event.ComponentListener componentListener52 = null;
    dateCellRenderer25.removeComponentListener(componentListener52);
    java.awt.Event event54 = null;
    boolean b57 = dateCellRenderer25.mouseMove(event54, (int)(short)-1, 31);
    java.awt.Container container58 = dateCellRenderer25.getFocusCycleRootAncestor();
    java.awt.Component component59 = dateCellRenderer25.getLabelFor();
    int i60 = dateCellRenderer25.getIconTextGap();
    int i61 = serialDateChooserPanel16.getComponentZOrder((java.awt.Component)dateCellRenderer25);
    int i62 = applicationFrame1.checkImage(image11, 9999, (int)(short)10, (java.awt.image.ImageObserver)dateCellRenderer25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 32);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest88.test10"); }

    org.jfree.util.LogContext logContext1 = new org.jfree.util.LogContext("org.jfree.ui.SerialDateChooserPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    java.lang.Object obj6 = null;
    org.jfree.util.Log.SimpleMessage simpleMessage8 = new org.jfree.util.Log.SimpleMessage("hi!", (java.lang.Object)10.0f, (java.lang.Object)' ', obj6, (java.lang.Object)"hi!");
    logContext1.log((int)'a', obj6);

  }

}
