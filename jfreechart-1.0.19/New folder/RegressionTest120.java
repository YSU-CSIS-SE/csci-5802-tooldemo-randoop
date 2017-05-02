
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest120 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest120.test01"); }

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
    // The following exception was thrown during execution in test generation
    try {
    fontDisplayField62.setHorizontalAlignment((int)(byte)100);
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

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest120.test02"); }

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
    java.awt.Rectangle rectangle65 = fontDisplayField62.modelToView(2);
    org.jfree.date.SerialDate serialDate66 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel68 = new org.jfree.ui.SerialDateChooserPanel(serialDate66, true);
    java.awt.Color color69 = serialDateChooserPanel68.getForeground();
    fontDisplayField62.setSelectionColor(color69);
    
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
    org.junit.Assert.assertNull(rectangle65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color69);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest120.test03"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    serialDateChooserPanel2.invalidate();
    serialDateChooserPanel2.grabFocus();
    javax.swing.JPopupMenu jPopupMenu10 = null;
    serialDateChooserPanel2.setComponentPopupMenu(jPopupMenu10);
    boolean b12 = serialDateChooserPanel2.getFocusTraversalKeysEnabled();
    serialDateChooserPanel2.firePropertyChange("http://www.jfree.org/jcommon/", '#', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest120.test04"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getIconTextGap();
    javax.swing.Icon icon2 = dateCellRenderer0.getDisabledIcon();
    dateCellRenderer0.firePropertyChange("content", (float)(short)1, (float)7);
    dateCellRenderer0.invalidate();
    org.jfree.date.SerialDate serialDate8 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel10 = new org.jfree.ui.SerialDateChooserPanel(serialDate8, true);
    java.awt.Color color11 = serialDateChooserPanel10.getForeground();
    java.awt.Event event12 = null;
    boolean b15 = serialDateChooserPanel10.mouseUp(event12, (int)(byte)10, (int)(short)100);
    javax.swing.InputMap inputMap17 = serialDateChooserPanel10.getInputMap(0);
    org.jfree.date.SerialDate serialDate18 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel20 = new org.jfree.ui.SerialDateChooserPanel(serialDate18, true);
    boolean b21 = serialDateChooserPanel20.getIgnoreRepaint();
    boolean b22 = serialDateChooserPanel20.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array23 = serialDateChooserPanel20.getPropertyChangeListeners();
    javax.swing.InputMap inputMap24 = serialDateChooserPanel20.getInputMap();
    boolean b25 = serialDateChooserPanel20.isForegroundSet();
    javax.swing.KeyStroke keyStroke27 = null;
    serialDateChooserPanel10.registerKeyboardAction((java.awt.event.ActionListener)serialDateChooserPanel20, "ClassContext", keyStroke27, (int)(byte)1);
    int i30 = serialDateChooserPanel20.getX();
    org.jfree.ui.ApplicationFrame applicationFrame32 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener33 = null;
    applicationFrame32.removeWindowStateListener(windowStateListener33);
    boolean b35 = applicationFrame32.isValidateRoot();
    org.jfree.date.SerialDate serialDate36 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel38 = new org.jfree.ui.SerialDateChooserPanel(serialDate36, true);
    boolean b39 = serialDateChooserPanel38.getIgnoreRepaint();
    javax.swing.InputMap inputMap40 = serialDateChooserPanel38.getInputMap();
    java.awt.Rectangle rectangle41 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle42 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b43 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle41, (java.awt.geom.Rectangle2D)rectangle42);
    java.awt.Rectangle rectangle44 = serialDateChooserPanel38.getBounds(rectangle42);
    org.jfree.date.SerialDate serialDate45 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel47 = new org.jfree.ui.SerialDateChooserPanel(serialDate45, true);
    boolean b48 = serialDateChooserPanel47.getIgnoreRepaint();
    java.awt.Rectangle rectangle49 = serialDateChooserPanel47.getVisibleRect();
    boolean b50 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle42, (java.awt.Shape)rectangle49);
    applicationFrame32.setMaximizedBounds(rectangle42);
    serialDateChooserPanel20.scrollRectToVisible(rectangle42);
    dateCellRenderer0.paintImmediately(rectangle42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest120.test05"); }

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
    java.awt.event.FocusListener[] focusListener_array19 = dateCellRenderer9.getFocusListeners();
    java.awt.Rectangle rectangle20 = dateCellRenderer9.getBounds();
    java.awt.event.ContainerListener[] containerListener_array21 = dateCellRenderer9.getContainerListeners();
    dateCellRenderer9.firePropertyChange("ToolTipText", (double)(byte)-1, (double)32);
    dateCellRenderer9.setVerifyInputWhenFocusTarget(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(containerListener_array21);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest120.test06"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getDisplayedMnemonic();
    java.lang.String str2 = dateCellRenderer0.getText();
    java.awt.ComponentOrientation componentOrientation3 = null;
    dateCellRenderer0.setComponentOrientation(componentOrientation3);
    org.jfree.ui.DateCellRenderer dateCellRenderer5 = new org.jfree.ui.DateCellRenderer();
    int i6 = dateCellRenderer5.getDisplayedMnemonic();
    java.lang.String str7 = dateCellRenderer5.getText();
    java.awt.ComponentOrientation componentOrientation8 = null;
    dateCellRenderer5.setComponentOrientation(componentOrientation8);
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel12 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    boolean b13 = serialDateChooserPanel12.getIgnoreRepaint();
    boolean b14 = serialDateChooserPanel12.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array15 = serialDateChooserPanel12.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate16 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel18 = new org.jfree.ui.SerialDateChooserPanel(serialDate16, true);
    boolean b19 = serialDateChooserPanel18.getIgnoreRepaint();
    serialDateChooserPanel18.setAlignmentX((float)(byte)10);
    java.awt.Component component22 = serialDateChooserPanel12.add((java.awt.Component)serialDateChooserPanel18);
    org.jfree.date.SerialDate serialDate23 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate23, true);
    java.awt.Color color26 = serialDateChooserPanel25.getForeground();
    component22.setForeground(color26);
    dateCellRenderer5.setForeground(color26);
    dateCellRenderer0.setForeground(color26);
    // The following exception was thrown during execution in test generation
    try {
    dateCellRenderer0.setVerticalAlignment(4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color26);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest120.test07"); }

    org.jfree.layout.LCBLayout lCBLayout1 = new org.jfree.layout.LCBLayout(9);
    org.jfree.ui.DateCellRenderer dateCellRenderer2 = new org.jfree.ui.DateCellRenderer();
    int i3 = dateCellRenderer2.getDisplayedMnemonic();
    dateCellRenderer2.validate();
    org.jfree.date.SerialDate serialDate5 = null;
    org.jfree.date.SerialDate serialDate7 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel9 = new org.jfree.ui.SerialDateChooserPanel(serialDate7, true);
    java.awt.Color color10 = serialDateChooserPanel9.getForeground();
    org.jfree.date.SerialDate serialDate11 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel13 = new org.jfree.ui.SerialDateChooserPanel(serialDate11, true);
    java.awt.Color color14 = serialDateChooserPanel13.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame16 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener17 = null;
    applicationFrame16.removeWindowStateListener(windowStateListener17);
    applicationFrame16.setCursor(0);
    org.jfree.date.SerialDate serialDate21 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel23 = new org.jfree.ui.SerialDateChooserPanel(serialDate21, true);
    java.awt.Color color24 = serialDateChooserPanel23.getForeground();
    applicationFrame16.setBackground(color24);
    boolean b26 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color14, (java.awt.Paint)color24);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel27 = new org.jfree.ui.SerialDateChooserPanel(serialDate5, false, color10, color24);
    dateCellRenderer2.setBackground(color24);
    javax.swing.Icon icon29 = dateCellRenderer2.getIcon();
    org.jfree.ui.ApplicationFrame applicationFrame31 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent32 = null;
    applicationFrame31.windowDeiconified(windowEvent32);
    java.awt.LayoutManager layoutManager34 = null;
    applicationFrame31.setLayout(layoutManager34);
    java.beans.PropertyChangeListener propertyChangeListener36 = null;
    applicationFrame31.removePropertyChangeListener(propertyChangeListener36);
    java.awt.Image image38 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer39 = new org.jfree.ui.DateCellRenderer();
    int i40 = dateCellRenderer39.getDisplayedMnemonic();
    dateCellRenderer39.validate();
    int i42 = applicationFrame31.checkImage(image38, (java.awt.image.ImageObserver)dateCellRenderer39);
    org.jfree.ui.BevelArrowIcon bevelArrowIcon46 = new org.jfree.ui.BevelArrowIcon((int)'4', true, false);
    dateCellRenderer39.setIcon((javax.swing.Icon)bevelArrowIcon46);
    dateCellRenderer2.setIcon((javax.swing.Icon)bevelArrowIcon46);
    javax.swing.Icon icon49 = dateCellRenderer2.getIcon();
    dateCellRenderer2.setDisplayedMnemonic(13);
    dateCellRenderer2.firePropertyChange("VerticalAlignment.CENTER", (double)0, (double)2958465);
    java.awt.Dimension dimension56 = lCBLayout1.preferredLayoutSize((java.awt.Container)dateCellRenderer2);
    org.jfree.ui.ApplicationFrame applicationFrame58 = new org.jfree.ui.ApplicationFrame("");
    int i59 = applicationFrame58.getState();
    java.util.Locale locale60 = applicationFrame58.getLocale();
    applicationFrame58.transferFocusUpCycle();
    java.awt.Graphics graphics62 = null;
    applicationFrame58.update(graphics62);
    java.awt.Cursor cursor64 = applicationFrame58.getCursor();
    lCBLayout1.addLayoutComponent((java.awt.Component)applicationFrame58);
    org.jfree.date.SerialDate serialDate67 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel69 = new org.jfree.ui.SerialDateChooserPanel(serialDate67, true);
    serialDateChooserPanel69.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext74 = serialDateChooserPanel69.getAccessibleContext();
    org.jfree.date.SerialDate serialDate75 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel77 = new org.jfree.ui.SerialDateChooserPanel(serialDate75, true);
    boolean b78 = serialDateChooserPanel77.getIgnoreRepaint();
    javax.swing.InputMap inputMap79 = serialDateChooserPanel77.getInputMap();
    javax.swing.TransferHandler transferHandler80 = null;
    serialDateChooserPanel77.setTransferHandler(transferHandler80);
    javax.swing.plaf.PanelUI panelUI82 = null;
    serialDateChooserPanel77.setUI(panelUI82);
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array84 = serialDateChooserPanel77.getHierarchyBoundsListeners();
    java.awt.Dimension dimension85 = serialDateChooserPanel77.minimumSize();
    java.awt.Rectangle rectangle86 = serialDateChooserPanel77.bounds();
    javax.swing.JPopupMenu jPopupMenu87 = null;
    serialDateChooserPanel77.setComponentPopupMenu(jPopupMenu87);
    boolean b89 = org.jfree.util.ObjectUtilities.equal((java.lang.Object)serialDateChooserPanel69, (java.lang.Object)serialDateChooserPanel77);
    lCBLayout1.addLayoutComponent("content", (java.awt.Component)serialDateChooserPanel69);
    java.lang.String str91 = serialDateChooserPanel69.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(icon49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str91 + "' != '" + "PanelUI"+ "'", str91.equals("PanelUI"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest120.test08"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array1 = lengthLimitingDocument0.getDocumentListeners();
    int i2 = lengthLimitingDocument0.getMaxLength();
    javax.swing.text.Element element3 = lengthLimitingDocument0.getDefaultRootElement();
    javax.swing.text.Position position5 = lengthLimitingDocument0.createPosition(5);
    int i6 = lengthLimitingDocument0.getMaxLength();
    int i7 = lengthLimitingDocument0.getMaxLength();
    javax.swing.event.DocumentListener documentListener8 = null;
    lengthLimitingDocument0.addDocumentListener(documentListener8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(element3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(position5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest120.test09"); }

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
    java.awt.Event event23 = null;
    boolean b26 = applicationFrame1.mouseUp(event23, (int)(short)10, (int)'#');
    applicationFrame1.setExtendedState(4);
    javax.swing.JRootPane jRootPane29 = applicationFrame1.getRootPane();
    boolean b30 = applicationFrame1.isOpaque();
    java.awt.event.WindowListener[] windowListener_array31 = applicationFrame1.getWindowListeners();
    org.jfree.text.TextBox textBox32 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets33 = textBox32.getInteriorGap();
    java.awt.Rectangle rectangle34 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle35 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b36 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle34, (java.awt.geom.Rectangle2D)rectangle35);
    rectangleInsets33.trim((java.awt.geom.Rectangle2D)rectangle35);
    double d38 = rectangleInsets33.getLeft();
    org.jfree.text.TextBox textBox39 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets40 = textBox39.getInteriorGap();
    java.awt.Rectangle rectangle41 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle42 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b43 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle41, (java.awt.geom.Rectangle2D)rectangle42);
    rectangleInsets40.trim((java.awt.geom.Rectangle2D)rectangle42);
    rectangleInsets33.trim((java.awt.geom.Rectangle2D)rectangle42);
    applicationFrame1.setBounds(rectangle42);
    
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
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jRootPane29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowListener_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d38 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest120.test10"); }

    org.jfree.date.SpreadsheetDate spreadsheetDate2 = new org.jfree.date.SpreadsheetDate(13);
    org.jfree.date.SerialDate serialDate3 = org.jfree.date.SerialDate.addMonths(11, (org.jfree.date.SerialDate)spreadsheetDate2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate3);

  }

}
