
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest121 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest121.test01"); }

    org.jfree.threads.ReaderWriterLock readerWriterLock0 = new org.jfree.threads.ReaderWriterLock();
    readerWriterLock0.lockRead();
    org.jfree.util.Log.info((java.lang.Object)readerWriterLock0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest121.test02"); }

    org.jfree.ui.RectangleInsets rectangleInsets0 = new org.jfree.ui.RectangleInsets();

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest121.test03"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    javax.swing.InputMap inputMap4 = serialDateChooserPanel2.getInputMap();
    java.awt.Rectangle rectangle5 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle6 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b7 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle5, (java.awt.geom.Rectangle2D)rectangle6);
    java.awt.Rectangle rectangle8 = serialDateChooserPanel2.getBounds(rectangle6);
    boolean b11 = serialDateChooserPanel2.inside(8, 7);
    serialDateChooserPanel2.firePropertyChange("LabelUI", (double)' ', 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest121.test04"); }

    org.jfree.ui.ApplicationFrame applicationFrame2 = new org.jfree.ui.ApplicationFrame("");
    int i3 = applicationFrame2.getState();
    java.awt.event.WindowEvent windowEvent4 = null;
    applicationFrame2.windowIconified(windowEvent4);
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    serialDateChooserPanel8.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext13 = serialDateChooserPanel8.getAccessibleContext();
    java.awt.Dimension dimension14 = serialDateChooserPanel8.getPreferredSize();
    org.jfree.date.SerialDate serialDate16 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel18 = new org.jfree.ui.SerialDateChooserPanel(serialDate16, true);
    boolean b19 = serialDateChooserPanel18.getIgnoreRepaint();
    javax.swing.InputMap inputMap20 = serialDateChooserPanel18.getInputMap();
    serialDateChooserPanel8.setInputMap((int)(byte)1, inputMap20);
    java.awt.event.FocusListener[] focusListener_array22 = serialDateChooserPanel8.getFocusListeners();
    applicationFrame2.remove((java.awt.Component)serialDateChooserPanel8);
    java.awt.Dimension dimension24 = serialDateChooserPanel8.getPreferredSize();
    serialDateChooserPanel8.firePropertyChange("LabelUI", (byte)100, (byte)0);
    java.awt.Font font29 = serialDateChooserPanel8.getFont();
    java.awt.Font font33 = org.jfree.text.TextFragment.DEFAULT_FONT;
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
    org.jfree.text.TextFragment textFragment50 = new org.jfree.text.TextFragment("ClassContext", font33, (java.awt.Paint)color47);
    org.jfree.date.SerialDate serialDate51 = null;
    org.jfree.date.SerialDate serialDate53 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel55 = new org.jfree.ui.SerialDateChooserPanel(serialDate53, true);
    java.awt.Color color56 = serialDateChooserPanel55.getForeground();
    org.jfree.date.SerialDate serialDate57 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel59 = new org.jfree.ui.SerialDateChooserPanel(serialDate57, true);
    java.awt.Color color60 = serialDateChooserPanel59.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame62 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener63 = null;
    applicationFrame62.removeWindowStateListener(windowStateListener63);
    applicationFrame62.setCursor(0);
    org.jfree.date.SerialDate serialDate67 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel69 = new org.jfree.ui.SerialDateChooserPanel(serialDate67, true);
    java.awt.Color color70 = serialDateChooserPanel69.getForeground();
    applicationFrame62.setBackground(color70);
    boolean b72 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color60, (java.awt.Paint)color70);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel73 = new org.jfree.ui.SerialDateChooserPanel(serialDate51, false, color56, color70);
    javax.swing.JLabel jLabel74 = org.jfree.ui.RefineryUtilities.createJLabel("SortOrder.ASCENDING", font33, color56);
    org.jfree.date.SerialDate serialDate75 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel77 = new org.jfree.ui.SerialDateChooserPanel(serialDate75, true);
    java.awt.Color color78 = serialDateChooserPanel77.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame80 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener81 = null;
    applicationFrame80.removeWindowStateListener(windowStateListener81);
    applicationFrame80.setCursor(0);
    org.jfree.date.SerialDate serialDate85 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel87 = new org.jfree.ui.SerialDateChooserPanel(serialDate85, true);
    java.awt.Color color88 = serialDateChooserPanel87.getForeground();
    applicationFrame80.setBackground(color88);
    boolean b90 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color78, (java.awt.Paint)color88);
    org.jfree.text.TextBlock textBlock91 = org.jfree.text.TextUtilities.createTextBlock("LabelUI", font33, (java.awt.Paint)color78);
    javax.swing.JLabel jLabel92 = org.jfree.ui.RefineryUtilities.createJLabel("$ename", font29, color78);
    float f93 = jLabel92.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLabel74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlock91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLabel92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f93 == 0.0f);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest121.test05"); }

    int[] i_array5 = new int[] { (byte)100, 4, 6, (-1) };
    org.jfree.layout.FormatLayout formatLayout6 = new org.jfree.layout.FormatLayout((int)'#', i_array5);
    org.jfree.ui.ApplicationFrame applicationFrame9 = new org.jfree.ui.ApplicationFrame("");
    int i10 = applicationFrame9.getState();
    java.awt.event.WindowEvent windowEvent11 = null;
    applicationFrame9.windowIconified(windowEvent11);
    applicationFrame9.removeNotify();
    java.awt.event.WindowFocusListener windowFocusListener14 = null;
    applicationFrame9.addWindowFocusListener(windowFocusListener14);
    java.awt.event.ComponentListener componentListener16 = null;
    applicationFrame9.removeComponentListener(componentListener16);
    formatLayout6.addLayoutComponent("ThreadContext", (java.awt.Component)applicationFrame9);
    boolean b19 = applicationFrame9.isShowing();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest121.test06"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.Rectangle rectangle2 = applicationFrame1.getMaximizedBounds();
    // The following exception was thrown during execution in test generation
    try {
    applicationFrame1.createBufferStrategy(31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle2);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest121.test07"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    serialDateChooserPanel2.setFocusCycleRoot(false);
    serialDateChooserPanel2.setLocation(31, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest121.test08"); }

    org.jfree.ui.DateChooserPanel dateChooserPanel0 = new org.jfree.ui.DateChooserPanel();
    org.jfree.ui.DateCellRenderer dateCellRenderer1 = new org.jfree.ui.DateCellRenderer();
    int i2 = dateCellRenderer1.getDisplayedMnemonic();
    dateCellRenderer1.validate();
    org.jfree.date.SerialDate serialDate4 = null;
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    java.awt.Color color9 = serialDateChooserPanel8.getForeground();
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel12 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    java.awt.Color color13 = serialDateChooserPanel12.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame15 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener16 = null;
    applicationFrame15.removeWindowStateListener(windowStateListener16);
    applicationFrame15.setCursor(0);
    org.jfree.date.SerialDate serialDate20 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel22 = new org.jfree.ui.SerialDateChooserPanel(serialDate20, true);
    java.awt.Color color23 = serialDateChooserPanel22.getForeground();
    applicationFrame15.setBackground(color23);
    boolean b25 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color13, (java.awt.Paint)color23);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel26 = new org.jfree.ui.SerialDateChooserPanel(serialDate4, false, color9, color23);
    dateCellRenderer1.setBackground(color23);
    dateChooserPanel0.setChosenOtherButtonColor(color23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest121.test09"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    boolean b4 = applicationFrame1.isValidateRoot();
    org.jfree.date.SerialDate serialDate5 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel7 = new org.jfree.ui.SerialDateChooserPanel(serialDate5, true);
    boolean b8 = serialDateChooserPanel7.getIgnoreRepaint();
    javax.swing.InputMap inputMap9 = serialDateChooserPanel7.getInputMap();
    java.awt.Rectangle rectangle10 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle11 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b12 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle10, (java.awt.geom.Rectangle2D)rectangle11);
    java.awt.Rectangle rectangle13 = serialDateChooserPanel7.getBounds(rectangle11);
    org.jfree.date.SerialDate serialDate14 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel16 = new org.jfree.ui.SerialDateChooserPanel(serialDate14, true);
    boolean b17 = serialDateChooserPanel16.getIgnoreRepaint();
    java.awt.Rectangle rectangle18 = serialDateChooserPanel16.getVisibleRect();
    boolean b19 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle11, (java.awt.Shape)rectangle18);
    applicationFrame1.setMaximizedBounds(rectangle11);
    javax.accessibility.AccessibleContext accessibleContext21 = applicationFrame1.getAccessibleContext();
    java.awt.Window.Type type22 = applicationFrame1.getType();
    java.awt.im.InputContext inputContext23 = applicationFrame1.getInputContext();
    java.awt.ImageCapabilities imageCapabilities26 = null;
    java.awt.image.VolatileImage volatileImage27 = applicationFrame1.createVolatileImage((int)(byte)100, (-458), imageCapabilities26);
    java.awt.Point point28 = applicationFrame1.getMousePosition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext21);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + java.awt.Window.Type.NORMAL + "'", type22.equals(java.awt.Window.Type.NORMAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputContext23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(volatileImage27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point28);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest121.test10"); }

    java.lang.String str0 = org.jfree.util.StringUtils.getLineSeparator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\r\n"+ "'", str0.equals("\r\n"));

  }

}
