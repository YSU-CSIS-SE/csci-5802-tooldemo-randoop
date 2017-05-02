
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest109 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest109.test01"); }

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
    javax.swing.JButton jButton31 = l1R2ButtonPanel28.getRightButton1();
    javax.swing.event.AncestorListener[] ancestorListener_array32 = jButton31.getAncestorListeners();
    org.jfree.text.TextBox textBox33 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets34 = textBox33.getInteriorGap();
    java.awt.Rectangle rectangle35 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle36 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b37 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle35, (java.awt.geom.Rectangle2D)rectangle36);
    rectangleInsets34.trim((java.awt.geom.Rectangle2D)rectangle36);
    org.jfree.date.SerialDate serialDate39 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel41 = new org.jfree.ui.SerialDateChooserPanel(serialDate39, true);
    boolean b42 = serialDateChooserPanel41.getIgnoreRepaint();
    javax.swing.InputMap inputMap43 = serialDateChooserPanel41.getInputMap();
    java.awt.Rectangle rectangle44 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle45 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b46 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle44, (java.awt.geom.Rectangle2D)rectangle45);
    java.awt.Rectangle rectangle47 = serialDateChooserPanel41.getBounds(rectangle45);
    java.awt.geom.Rectangle2D rectangle2D50 = rectangleInsets34.createInsetRectangle((java.awt.geom.Rectangle2D)rectangle47, false, true);
    org.jfree.ui.ApplicationFrame applicationFrame52 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent53 = null;
    applicationFrame52.windowDeiconified(windowEvent53);
    java.awt.LayoutManager layoutManager55 = null;
    applicationFrame52.setLayout(layoutManager55);
    java.beans.PropertyChangeListener propertyChangeListener57 = null;
    applicationFrame52.removePropertyChangeListener(propertyChangeListener57);
    java.awt.Image image59 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer60 = new org.jfree.ui.DateCellRenderer();
    int i61 = dateCellRenderer60.getDisplayedMnemonic();
    dateCellRenderer60.validate();
    int i63 = applicationFrame52.checkImage(image59, (java.awt.image.ImageObserver)dateCellRenderer60);
    dateCellRenderer60.updateUI();
    boolean b65 = rectangleInsets34.equals((java.lang.Object)dateCellRenderer60);
    java.awt.Insets insets66 = dateCellRenderer60.getInsets();
    java.awt.Insets insets67 = jButton31.getInsets(insets66);
    jButton31.firePropertyChange("content", (double)16, (double)3);
    
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
    org.junit.Assert.assertNotNull(jButton31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ancestorListener_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets67);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest109.test02"); }

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
    javax.swing.KeyStroke keyStroke25 = null;
    serialDateChooserPanel2.unregisterKeyboardAction(keyStroke25);
    
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

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest109.test03"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    org.jfree.text.TextBlock textBlock2 = null;
    textBox0.setTextBlock(textBlock2);
    org.jfree.text.TextBlock textBlock4 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D5 = null;
    org.jfree.text.TextBlock textBlock8 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D9 = null;
    org.jfree.text.TextBlockAnchor textBlockAnchor12 = org.jfree.text.TextBlockAnchor.TOP_RIGHT;
    java.awt.Shape shape16 = textBlock8.calculateBounds(graphics2D9, (float)12, (float)(short)-1, textBlockAnchor12, (float)' ', (float)32, (double)(-1.0f));
    textBlock4.draw(graphics2D5, (float)5, (float)(short)1, textBlockAnchor12, (float)(short)-1, (float)(short)100, (double)1.0f);
    textBox0.setTextBlock(textBlock4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape16);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest109.test04"); }

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
    float f90 = fontChooserDialog84.getOpacity();
    
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
    org.junit.Assert.assertTrue(f90 == 1.0f);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest109.test05"); }

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
    org.jfree.ui.JTextObserver.addTextComponent((javax.swing.text.JTextComponent)fontDisplayField62);
    java.beans.VetoableChangeListener[] vetoableChangeListener_array64 = fontDisplayField62.getVetoableChangeListeners();
    
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
    org.junit.Assert.assertNotNull(vetoableChangeListener_array64);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest109.test06"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    serialDateChooserPanel2.invalidate();
    serialDateChooserPanel2.grabFocus();
    java.awt.ComponentOrientation componentOrientation10 = serialDateChooserPanel2.getComponentOrientation();
    java.awt.Cursor cursor11 = serialDateChooserPanel2.getCursor();
    serialDateChooserPanel2.setAlignmentX((float)6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor11);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest109.test07"); }

    org.jfree.ui.FloatDimension floatDimension0 = new org.jfree.ui.FloatDimension();
    floatDimension0.setWidth(0.0d);
    floatDimension0.setSize((double)10, (double)32);
    java.lang.Object obj6 = floatDimension0.clone();
    org.jfree.ui.RectangleAnchor rectangleAnchor7 = org.jfree.ui.RectangleAnchor.BOTTOM_LEFT;
    boolean b8 = floatDimension0.equals((java.lang.Object)rectangleAnchor7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleAnchor7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest109.test08"); }

    java.lang.Class class1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.io.InputStream inputStream2 = org.jfree.util.ObjectUtilities.getResourceAsStream("RectangleAnchor.BOTTOM", class1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest109.test09"); }

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
    dateCellRenderer27.revalidate();
    dateCellRenderer27.updateUI();
    
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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest109.test10"); }

    java.lang.String[] str_array0 = org.jfree.util.LogTarget.LEVELS;
    org.jfree.ui.FilesystemFilter filesystemFilter3 = new org.jfree.ui.FilesystemFilter(str_array0, "http://www.jfree.org/jcommon/", true);
    boolean b4 = filesystemFilter3.acceptsDirectories();
    boolean b5 = filesystemFilter3.acceptsDirectories();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

}
