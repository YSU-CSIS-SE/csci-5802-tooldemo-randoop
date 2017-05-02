
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest77 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest77.test01"); }

    org.jfree.threads.ReaderWriterLock readerWriterLock0 = new org.jfree.threads.ReaderWriterLock();
    readerWriterLock0.lockWrite();

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest77.test02"); }

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
    java.lang.String str14 = dateCellRenderer9.getText();
    java.lang.String str15 = dateCellRenderer9.getText();
    org.jfree.ui.TextAnchor textAnchor16 = org.jfree.ui.TextAnchor.CENTER_LEFT;
    java.text.DateFormatSymbols dateFormatSymbols17 = org.jfree.date.SerialDate.DATE_FORMAT_SYMBOLS;
    dateCellRenderer9.putClientProperty((java.lang.Object)textAnchor16, (java.lang.Object)dateFormatSymbols17);
    boolean b19 = dateCellRenderer9.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateFormatSymbols17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest77.test03"); }

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
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array27 = applicationFrame1.getHierarchyBoundsListeners();
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior28 = applicationFrame1.getBaselineResizeBehavior();
    applicationFrame1.setExtendedState(3);
    boolean b31 = applicationFrame1.isShowing();
    
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
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array27);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior28 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior28.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest77.test04"); }

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
    dateCellRenderer9.repaint((int)(short)1, (int)(short)1, 3, 5);
    dateCellRenderer9.setIconTextGap(15);
    dateCellRenderer9.setEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest77.test05"); }

    java.awt.Shape shape2 = org.jfree.util.ShapeUtilities.createDiagonalCross((float)10, (float)2958465);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape2);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest77.test06"); }

    org.jfree.ui.RectangleInsets rectangleInsets4 = new org.jfree.ui.RectangleInsets((double)100L, (double)10, (double)31, (double)9999);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest77.test07"); }

    java.awt.Graphics2D graphics2D1 = null;
    java.awt.FontMetrics fontMetrics2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.geom.Rectangle2D rectangle2D3 = org.jfree.text.TextUtilities.getTextBounds("PanelUI", graphics2D1, fontMetrics2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest77.test08"); }

    java.awt.Font font1 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.date.SerialDate serialDate2 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel4 = new org.jfree.ui.SerialDateChooserPanel(serialDate2, true);
    java.awt.Color color5 = serialDateChooserPanel4.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame7 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener8 = null;
    applicationFrame7.removeWindowStateListener(windowStateListener8);
    applicationFrame7.setCursor(0);
    org.jfree.date.SerialDate serialDate12 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel14 = new org.jfree.ui.SerialDateChooserPanel(serialDate12, true);
    java.awt.Color color15 = serialDateChooserPanel14.getForeground();
    applicationFrame7.setBackground(color15);
    boolean b17 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color5, (java.awt.Paint)color15);
    org.jfree.text.TextFragment textFragment18 = new org.jfree.text.TextFragment("ClassContext", font1, (java.awt.Paint)color15);
    java.lang.String str19 = textFragment18.getText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "ClassContext"+ "'", str19.equals("ClassContext"));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest77.test09"); }

    org.jfree.util.LineBreakIterator lineBreakIterator0 = new org.jfree.util.LineBreakIterator();
    java.lang.String str1 = lineBreakIterator0.getText();
    java.lang.Object obj2 = lineBreakIterator0.next();
    // The following exception was thrown during execution in test generation
    try {
    lineBreakIterator0.remove();
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj2 + "' != '" + ""+ "'", obj2.equals(""));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest77.test10"); }

    // The following exception was thrown during execution in test generation
    try {
    org.jfree.date.SerialDate serialDate1 = org.jfree.date.SerialDate.createInstance((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

}
