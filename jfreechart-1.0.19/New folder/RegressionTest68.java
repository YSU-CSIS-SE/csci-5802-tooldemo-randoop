
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest68 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest68.test01"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    java.awt.Cursor cursor4 = null;
    applicationFrame1.setCursor(cursor4);
    boolean b6 = applicationFrame1.isAlwaysOnTopSupported();
    boolean b7 = applicationFrame1.isAlwaysOnTop();
    applicationFrame1.firePropertyChange("RectangleAnchor.TOP_LEFT", (long)(short)1, (long)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest68.test02"); }

    java.awt.Window[] window_array0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(window_array0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest68.test03"); }

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
    java.awt.Image image30 = null;
    boolean b36 = dateCellRenderer0.imageUpdate(image30, 0, 6, 0, 8, 100);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest68.test04"); }

    java.util.Locale locale1 = javax.swing.JComponent.getDefaultLocale();
    java.util.ResourceBundle.Control control2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle3 = java.util.ResourceBundle.getBundle("paragraph", locale1, control2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest68.test05"); }

    org.jfree.layout.LCBLayout lCBLayout1 = new org.jfree.layout.LCBLayout(9);
    org.jfree.ui.ApplicationFrame applicationFrame3 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener4 = null;
    applicationFrame3.removeWindowStateListener(windowStateListener4);
    boolean b6 = applicationFrame3.isValidateRoot();
    applicationFrame3.doLayout();
    boolean b8 = applicationFrame3.getFocusTraversalKeysEnabled();
    lCBLayout1.addLayoutComponent((java.awt.Component)applicationFrame3);
    applicationFrame3.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest68.test06"); }

    org.jfree.date.SerialDate serialDate2 = org.jfree.date.SerialDate.createInstance(5);
    org.jfree.date.SerialDate serialDate3 = org.jfree.date.SerialDate.addDays((int)(short)1, serialDate2);
    java.lang.String str4 = serialDate3.toString();
    org.jfree.date.SerialDate serialDate6 = org.jfree.date.SerialDate.createInstance(5);
    boolean b7 = org.jfree.date.SerialDateUtilities.isLastDayOfFebruary(serialDate6);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel9 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, false);
    int i10 = org.jfree.date.SerialDateUtilities.dayCount30PSA(serialDate3, serialDate6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "5-January-1900"+ "'", str4.equals("5-January-1900"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest68.test07"); }

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
    int i15 = applicationFrame1.getCursorType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest68.test08"); }

    org.jfree.date.DayOfWeekInMonthRule dayOfWeekInMonthRule0 = new org.jfree.date.DayOfWeekInMonthRule();
    int i1 = dayOfWeekInMonthRule0.getCount();
    int i2 = dayOfWeekInMonthRule0.getCount();
    org.jfree.date.RelativeDayOfWeekRule relativeDayOfWeekRule5 = new org.jfree.date.RelativeDayOfWeekRule((org.jfree.date.AnnualDateRule)dayOfWeekInMonthRule0, 12, (-1));
    int i6 = relativeDayOfWeekRule5.getRelative();
    org.jfree.date.RelativeDayOfWeekRule relativeDayOfWeekRule9 = new org.jfree.date.RelativeDayOfWeekRule((org.jfree.date.AnnualDateRule)relativeDayOfWeekRule5, (int)(byte)100, 2958465);
    java.lang.Object obj10 = relativeDayOfWeekRule9.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj10);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest68.test09"); }

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
    boolean b13 = serialDateChooserPanel8.isCursorSet();
    java.awt.Event event14 = null;
    org.jfree.text.TextBox textBox15 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets16 = textBox15.getInteriorGap();
    org.jfree.date.SerialDate serialDate17 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel19 = new org.jfree.ui.SerialDateChooserPanel(serialDate17, true);
    java.beans.VetoableChangeListener vetoableChangeListener20 = null;
    serialDateChooserPanel19.removeVetoableChangeListener(vetoableChangeListener20);
    java.awt.Event event22 = null;
    org.jfree.date.SerialDate serialDate23 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate23, true);
    boolean b26 = serialDateChooserPanel25.getIgnoreRepaint();
    javax.swing.InputMap inputMap27 = serialDateChooserPanel25.getInputMap();
    java.awt.Rectangle rectangle28 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle29 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b30 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle28, (java.awt.geom.Rectangle2D)rectangle29);
    java.awt.Rectangle rectangle31 = serialDateChooserPanel25.getBounds(rectangle29);
    org.jfree.date.SerialDate serialDate32 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel34 = new org.jfree.ui.SerialDateChooserPanel(serialDate32, true);
    boolean b35 = serialDateChooserPanel34.getIgnoreRepaint();
    java.awt.Rectangle rectangle36 = serialDateChooserPanel34.getVisibleRect();
    boolean b37 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle29, (java.awt.Shape)rectangle36);
    boolean b38 = serialDateChooserPanel19.lostFocus(event22, (java.lang.Object)rectangle36);
    java.awt.geom.Rectangle2D rectangle2D41 = rectangleInsets16.createOutsetRectangle((java.awt.geom.Rectangle2D)rectangle36, false, true);
    double d43 = rectangleInsets16.trimHeight(10.0d);
    boolean b44 = serialDateChooserPanel8.action(event14, (java.lang.Object)rectangleInsets16);
    
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
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d43 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest68.test10"); }

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
    int i13 = dateCellRenderer9.getVerticalTextPosition();
    int i14 = dateCellRenderer9.getDisplayedMnemonicIndex();
    dateCellRenderer9.validate();
    dateCellRenderer9.firePropertyChange("Jan", (long)32, (long)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

}
