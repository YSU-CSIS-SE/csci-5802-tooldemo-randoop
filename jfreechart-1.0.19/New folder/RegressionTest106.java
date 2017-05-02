
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest106 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest106.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b7 = serialDateChooserPanel2.isFocusTraversable();
    java.lang.Object obj8 = null;
    java.lang.Object obj9 = serialDateChooserPanel2.getClientProperty(obj8);
    serialDateChooserPanel2.setEnabled(false);
    int i14 = serialDateChooserPanel2.getBaseline(100, (int)(short)10);
    java.awt.Graphics graphics15 = null;
    serialDateChooserPanel2.paint(graphics15);
    org.jfree.date.SerialDate serialDate17 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel19 = new org.jfree.ui.SerialDateChooserPanel(serialDate17, true);
    boolean b20 = serialDateChooserPanel19.getIgnoreRepaint();
    javax.swing.InputMap inputMap21 = serialDateChooserPanel19.getInputMap();
    serialDateChooserPanel19.hide();
    org.jfree.date.SerialDate serialDate23 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate23, true);
    boolean b26 = serialDateChooserPanel25.getIgnoreRepaint();
    boolean b27 = serialDateChooserPanel25.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array28 = serialDateChooserPanel25.getPropertyChangeListeners();
    javax.swing.InputMap inputMap29 = serialDateChooserPanel25.getInputMap();
    boolean b30 = serialDateChooserPanel25.isForegroundSet();
    serialDateChooserPanel25.layout();
    java.awt.Point point32 = serialDateChooserPanel25.getLocation();
    java.awt.Point point33 = serialDateChooserPanel19.getLocation(point32);
    java.awt.Point point34 = serialDateChooserPanel2.getLocation(point33);
    serialDateChooserPanel2.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point34);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest106.test02"); }

    org.jfree.util.Rotation rotation0 = org.jfree.util.Rotation.CLOCKWISE;
    java.lang.String str1 = rotation0.toString();
    org.jfree.ui.DrawablePanel drawablePanel2 = new org.jfree.ui.DrawablePanel();
    boolean b3 = rotation0.equals((java.lang.Object)drawablePanel2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rotation0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Rotation.CLOCKWISE"+ "'", str1.equals("Rotation.CLOCKWISE"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest106.test03"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    applicationFrame1.removeNotify();
    applicationFrame1.nextFocus();

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest106.test04"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    javax.swing.InputMap inputMap4 = serialDateChooserPanel2.getInputMap();
    javax.swing.TransferHandler transferHandler5 = null;
    serialDateChooserPanel2.setTransferHandler(transferHandler5);
    javax.swing.plaf.PanelUI panelUI7 = null;
    serialDateChooserPanel2.setUI(panelUI7);
    java.awt.Dimension dimension9 = serialDateChooserPanel2.getMaximumSize();
    serialDateChooserPanel2.setInheritsPopupMenu(false);
    java.beans.VetoableChangeListener[] vetoableChangeListener_array12 = serialDateChooserPanel2.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array12);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest106.test05"); }

    org.jfree.util.FastStack fastStack0 = new org.jfree.util.FastStack();

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest106.test06"); }

    org.jfree.date.SerialDateUtilities serialDateUtilities0 = new org.jfree.date.SerialDateUtilities();

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest106.test07"); }

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
    org.jfree.text.TextBox textBox19 = new org.jfree.text.TextBox(textBlock0);
    double d20 = textBox19.getShadowYOffset();
    
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
    org.junit.Assert.assertTrue(d20 == 2.0d);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest106.test08"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    javax.swing.InputMap inputMap4 = serialDateChooserPanel2.getInputMap();
    serialDateChooserPanel2.hide();
    java.awt.Graphics graphics6 = null;
    serialDateChooserPanel2.paintComponents(graphics6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest106.test09"); }

    int[] i_array5 = new int[] { (byte)100, 4, 6, (-1) };
    org.jfree.layout.FormatLayout formatLayout6 = new org.jfree.layout.FormatLayout((int)'#', i_array5);
    org.jfree.ui.ApplicationFrame applicationFrame9 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener10 = null;
    applicationFrame9.removeWindowStateListener(windowStateListener10);
    java.awt.Cursor cursor12 = null;
    applicationFrame9.setCursor(cursor12);
    java.awt.Image image14 = null;
    boolean b20 = applicationFrame9.imageUpdate(image14, (int)'4', (int)(short)1, 8, (int)(byte)100, (int)'#');
    formatLayout6.removeLayoutComponent("notify-field-accept", (java.awt.Component)applicationFrame9);
    java.awt.Container container22 = null;
    boolean b23 = applicationFrame9.isFocusCycleRoot(container22);
    applicationFrame9.setFocusableWindowState(true);
    boolean b26 = applicationFrame9.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest106.test10"); }

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
    java.util.Locale locale86 = fontChooserDialog84.getLocale();
    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle87 = java.util.ResourceBundle.getBundle("RectangleAnchor.TOP_LEFT", locale86);
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertNotNull(locale86);

  }

}
