
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest60 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest60.test01"); }

    java.awt.Rectangle rectangle0 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle1 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b2 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle0, (java.awt.geom.Rectangle2D)rectangle1);
    java.awt.geom.Rectangle2D rectangle2D3 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle1, rectangle2D3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest60.test02"); }

    java.awt.Graphics2D graphics2D1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Shape shape7 = org.jfree.text.TextUtilities.calculateRotatedStringBounds("org.jfree.ui.SerialDateChooserPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", graphics2D1, (float)100L, (float)32, (double)11, (float)5, (float)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest60.test03"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    java.awt.Component component4 = applicationFrame1.getFocusOwner();
    java.awt.Event event5 = null;
    org.jfree.ui.ApplicationFrame applicationFrame7 = new org.jfree.ui.ApplicationFrame("");
    int i8 = applicationFrame7.getState();
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel11 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, true);
    serialDateChooserPanel11.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext16 = serialDateChooserPanel11.getAccessibleContext();
    java.awt.Dimension dimension17 = serialDateChooserPanel11.getPreferredSize();
    applicationFrame7.setSize(dimension17);
    applicationFrame7.pack();
    boolean b20 = applicationFrame1.lostFocus(event5, (java.lang.Object)applicationFrame7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest60.test04"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.util.Locale locale3 = applicationFrame1.getLocale();
    applicationFrame1.transferFocusUpCycle();
    java.awt.event.WindowEvent windowEvent5 = null;
    applicationFrame1.windowClosed(windowEvent5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale3);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest60.test05"); }

    org.jfree.ui.L1R3ButtonPanel l1R3ButtonPanel4 = new org.jfree.ui.L1R3ButtonPanel("TableOrder.BY_COLUMN", "ClassContext", "http://www.jfree.org/jcommon/", "ToolTipText");
    org.jfree.layout.RadialLayout radialLayout5 = new org.jfree.layout.RadialLayout();
    l1R3ButtonPanel4.setLayout((java.awt.LayoutManager)radialLayout5);
    java.io.PrintWriter printWriter7 = null;
    // The following exception was thrown during execution in test generation
    try {
    l1R3ButtonPanel4.list(printWriter7, 1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest60.test06"); }

    java.awt.Font font4 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.date.SerialDate serialDate5 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel7 = new org.jfree.ui.SerialDateChooserPanel(serialDate5, true);
    java.awt.Color color8 = serialDateChooserPanel7.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame10 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener11 = null;
    applicationFrame10.removeWindowStateListener(windowStateListener11);
    applicationFrame10.setCursor(0);
    org.jfree.date.SerialDate serialDate15 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel17 = new org.jfree.ui.SerialDateChooserPanel(serialDate15, true);
    java.awt.Color color18 = serialDateChooserPanel17.getForeground();
    applicationFrame10.setBackground(color18);
    boolean b20 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color8, (java.awt.Paint)color18);
    org.jfree.text.TextFragment textFragment21 = new org.jfree.text.TextFragment("ClassContext", font4, (java.awt.Paint)color18);
    org.jfree.date.SerialDate serialDate22 = null;
    org.jfree.date.SerialDate serialDate24 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel26 = new org.jfree.ui.SerialDateChooserPanel(serialDate24, true);
    java.awt.Color color27 = serialDateChooserPanel26.getForeground();
    org.jfree.date.SerialDate serialDate28 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel30 = new org.jfree.ui.SerialDateChooserPanel(serialDate28, true);
    java.awt.Color color31 = serialDateChooserPanel30.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame33 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener34 = null;
    applicationFrame33.removeWindowStateListener(windowStateListener34);
    applicationFrame33.setCursor(0);
    org.jfree.date.SerialDate serialDate38 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel40 = new org.jfree.ui.SerialDateChooserPanel(serialDate38, true);
    java.awt.Color color41 = serialDateChooserPanel40.getForeground();
    applicationFrame33.setBackground(color41);
    boolean b43 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color31, (java.awt.Paint)color41);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel44 = new org.jfree.ui.SerialDateChooserPanel(serialDate22, false, color27, color41);
    javax.swing.JLabel jLabel45 = org.jfree.ui.RefineryUtilities.createJLabel("SortOrder.ASCENDING", font4, color27);
    org.jfree.date.SerialDate serialDate46 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel48 = new org.jfree.ui.SerialDateChooserPanel(serialDate46, true);
    java.awt.Color color49 = serialDateChooserPanel48.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame51 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener52 = null;
    applicationFrame51.removeWindowStateListener(windowStateListener52);
    applicationFrame51.setCursor(0);
    org.jfree.date.SerialDate serialDate56 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel58 = new org.jfree.ui.SerialDateChooserPanel(serialDate56, true);
    java.awt.Color color59 = serialDateChooserPanel58.getForeground();
    applicationFrame51.setBackground(color59);
    boolean b61 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color49, (java.awt.Paint)color59);
    org.jfree.text.TextBlock textBlock62 = org.jfree.text.TextUtilities.createTextBlock("LabelUI", font4, (java.awt.Paint)color49);
    org.jfree.date.SerialDate serialDate63 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel65 = new org.jfree.ui.SerialDateChooserPanel(serialDate63, true);
    serialDateChooserPanel65.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext70 = serialDateChooserPanel65.getAccessibleContext();
    serialDateChooserPanel65.enableInputMethods(true);
    java.lang.String str73 = serialDateChooserPanel65.getToolTipText();
    java.awt.event.ContainerListener containerListener74 = null;
    serialDateChooserPanel65.addContainerListener(containerListener74);
    org.jfree.date.SerialDate serialDate76 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel78 = new org.jfree.ui.SerialDateChooserPanel(serialDate76, true);
    java.awt.Color color79 = serialDateChooserPanel78.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame81 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener82 = null;
    applicationFrame81.removeWindowStateListener(windowStateListener82);
    applicationFrame81.setCursor(0);
    org.jfree.date.SerialDate serialDate86 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel88 = new org.jfree.ui.SerialDateChooserPanel(serialDate86, true);
    java.awt.Color color89 = serialDateChooserPanel88.getForeground();
    applicationFrame81.setBackground(color89);
    boolean b91 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color79, (java.awt.Paint)color89);
    serialDateChooserPanel65.setBackground(color79);
    java.awt.Graphics2D graphics2D95 = null;
    org.jfree.text.G2TextMeasurer g2TextMeasurer96 = new org.jfree.text.G2TextMeasurer(graphics2D95);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.text.TextBlock textBlock97 = org.jfree.text.TextUtilities.createTextBlock("ThreadContext", font4, (java.awt.Paint)color79, 10.0f, 31, (org.jfree.text.TextMeasurer)g2TextMeasurer96);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLabel45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlock62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest60.test07"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.Rectangle rectangle2 = applicationFrame1.getMaximizedBounds();
    org.jfree.ui.ApplicationFrame applicationFrame4 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent5 = null;
    applicationFrame4.windowDeiconified(windowEvent5);
    applicationFrame4.firePropertyChange("hi!", '#', '4');
    java.awt.FocusTraversalPolicy focusTraversalPolicy11 = applicationFrame4.getFocusTraversalPolicy();
    applicationFrame1.setFocusTraversalPolicy(focusTraversalPolicy11);
    org.jfree.date.SerialDate serialDate13 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel15 = new org.jfree.ui.SerialDateChooserPanel(serialDate13, true);
    boolean b16 = serialDateChooserPanel15.getIgnoreRepaint();
    javax.swing.InputMap inputMap17 = serialDateChooserPanel15.getInputMap();
    serialDateChooserPanel15.hide();
    org.jfree.date.SerialDate serialDate19 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel21 = new org.jfree.ui.SerialDateChooserPanel(serialDate19, true);
    boolean b22 = serialDateChooserPanel21.getIgnoreRepaint();
    boolean b23 = serialDateChooserPanel21.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array24 = serialDateChooserPanel21.getPropertyChangeListeners();
    javax.swing.InputMap inputMap25 = serialDateChooserPanel21.getInputMap();
    boolean b26 = serialDateChooserPanel21.isForegroundSet();
    serialDateChooserPanel21.layout();
    java.awt.Point point28 = serialDateChooserPanel21.getLocation();
    java.awt.Point point29 = serialDateChooserPanel15.getLocation(point28);
    java.awt.Component component30 = applicationFrame1.getComponentAt(point28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusTraversalPolicy11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component30);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest60.test08"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b7 = serialDateChooserPanel2.isFocusTraversable();
    boolean b8 = serialDateChooserPanel2.getVerifyInputWhenFocusTarget();
    serialDateChooserPanel2.setFocusTraversalPolicyProvider(true);
    java.lang.String str11 = serialDateChooserPanel2.getName();
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior12 = serialDateChooserPanel2.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior12 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior12.equals(java.awt.Component.BaselineResizeBehavior.OTHER));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest60.test09"); }

    org.jfree.date.SerialDate serialDate2 = org.jfree.date.SerialDate.createInstance(5);
    org.jfree.date.SerialDate serialDate3 = org.jfree.date.SerialDate.addDays((int)(short)1, serialDate2);
    org.jfree.date.SerialDate serialDate5 = org.jfree.date.SerialDate.createInstance(5);
    boolean b6 = org.jfree.date.SerialDateUtilities.isLastDayOfFebruary(serialDate5);
    int i7 = org.jfree.date.SerialDateUtilities.dayCount30PSA(serialDate2, serialDate5);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel9 = new org.jfree.ui.SerialDateChooserPanel(serialDate2, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest60.test10"); }

    org.jfree.ui.RectangleAnchor rectangleAnchor0 = org.jfree.ui.RectangleAnchor.BOTTOM;
    java.lang.String str1 = rectangleAnchor0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleAnchor0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RectangleAnchor.BOTTOM"+ "'", str1.equals("RectangleAnchor.BOTTOM"));

  }

}
