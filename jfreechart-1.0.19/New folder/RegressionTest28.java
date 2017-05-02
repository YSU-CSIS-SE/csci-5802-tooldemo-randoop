
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28.test01"); }

    int i0 = org.jfree.layout.FormatLayout.C;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28.test02"); }

    org.jfree.JCommonInfo jCommonInfo0 = org.jfree.JCommonInfo.getInstance();
    java.lang.String str1 = jCommonInfo0.getInfo();
    java.awt.Image image2 = jCommonInfo0.getLogo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jCommonInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.jfree.org/jcommon/"+ "'", str1.equals("http://www.jfree.org/jcommon/"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(image2);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28.test03"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    applicationFrame1.firePropertyChange("hi!", '#', '4');
    java.awt.Rectangle rectangle8 = applicationFrame1.getMaximizedBounds();
    java.awt.Rectangle rectangle9 = applicationFrame1.getMaximizedBounds();
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel12 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    boolean b13 = serialDateChooserPanel12.getIgnoreRepaint();
    serialDateChooserPanel12.resize(8, (int)(short)-1);
    java.awt.Dimension dimension17 = serialDateChooserPanel12.getPreferredSize();
    serialDateChooserPanel12.setAutoscrolls(true);
    boolean b20 = serialDateChooserPanel12.getVerifyInputWhenFocusTarget();
    serialDateChooserPanel12.layout();
    java.awt.Point point22 = null;
    java.awt.Point point23 = serialDateChooserPanel12.getLocation(point22);
    // The following exception was thrown during execution in test generation
    try {
    applicationFrame1.setLocation(point22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point23);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28.test04"); }

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
    org.jfree.ui.BevelArrowIcon bevelArrowIcon16 = new org.jfree.ui.BevelArrowIcon((int)'4', true, false);
    dateCellRenderer9.setIcon((javax.swing.Icon)bevelArrowIcon16);
    org.jfree.date.SerialDate serialDate18 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel20 = new org.jfree.ui.SerialDateChooserPanel(serialDate18, true);
    boolean b21 = serialDateChooserPanel20.getIgnoreRepaint();
    java.awt.Graphics graphics22 = null;
    bevelArrowIcon16.paintIcon((java.awt.Component)serialDateChooserPanel20, graphics22, 7, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28.test05"); }

    boolean b0 = org.jfree.util.Log.isInfoEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28.test06"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    java.awt.Color color3 = serialDateChooserPanel2.getForeground();
    java.awt.Event event4 = null;
    boolean b7 = serialDateChooserPanel2.mouseUp(event4, (int)(byte)10, (int)(short)100);
    javax.swing.InputMap inputMap9 = serialDateChooserPanel2.getInputMap(0);
    java.awt.Event event10 = null;
    boolean b12 = serialDateChooserPanel2.lostFocus(event10, (java.lang.Object)0.0f);
    java.awt.PopupMenu popupMenu13 = null;
    // The following exception was thrown during execution in test generation
    try {
    serialDateChooserPanel2.add(popupMenu13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28.test07"); }

    int i0 = java.awt.Frame.ICONIFIED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28.test08"); }

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
    java.awt.Graphics2D graphics2D19 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.ui.Size2D size2D20 = textFragment18.calculateDimensions(graphics2D19);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28.test09"); }

    // The following exception was thrown during execution in test generation
    try {
    org.jfree.util.ObjectTable objectTable1 = new org.jfree.util.ObjectTable((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28.test10"); }

    int i0 = java.awt.image.ImageObserver.HEIGHT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

}
