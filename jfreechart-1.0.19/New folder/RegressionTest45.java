
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest45 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest45.test01"); }

    org.jfree.ui.Size2D size2D0 = new org.jfree.ui.Size2D();
    size2D0.setWidth((double)100);
    java.lang.String str3 = size2D0.toString();
    boolean b5 = size2D0.equals((java.lang.Object)0.0f);
    double d6 = size2D0.width;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Size2D[width=100.0, height=0.0]"+ "'", str3.equals("Size2D[width=100.0, height=0.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 100.0d);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest45.test02"); }

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
    java.awt.Graphics2D graphics2D19 = null;
    org.jfree.ui.Size2D size2D20 = textBlock0.calculateDimensions(graphics2D19);
    
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
    org.junit.Assert.assertNotNull(size2D20);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest45.test03"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    java.awt.Color color3 = serialDateChooserPanel2.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame5 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener6 = null;
    applicationFrame5.removeWindowStateListener(windowStateListener6);
    applicationFrame5.setCursor(0);
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel12 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    java.awt.Color color13 = serialDateChooserPanel12.getForeground();
    applicationFrame5.setBackground(color13);
    boolean b15 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color3, (java.awt.Paint)color13);
    org.jfree.ui.PaintSample paintSample16 = new org.jfree.ui.PaintSample((java.awt.Paint)color13);
    java.awt.event.ComponentListener componentListener17 = null;
    paintSample16.addComponentListener(componentListener17);
    java.awt.Paint paint19 = paintSample16.getPaint();
    java.io.ObjectOutputStream objectOutputStream20 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.io.SerialUtilities.writePaint(paint19, objectOutputStream20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint19);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest45.test04"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getDisplayedMnemonic();
    dateCellRenderer0.validate();
    org.jfree.date.SerialDate serialDate3 = null;
    org.jfree.date.SerialDate serialDate5 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel7 = new org.jfree.ui.SerialDateChooserPanel(serialDate5, true);
    java.awt.Color color8 = serialDateChooserPanel7.getForeground();
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel11 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, true);
    java.awt.Color color12 = serialDateChooserPanel11.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame14 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener15 = null;
    applicationFrame14.removeWindowStateListener(windowStateListener15);
    applicationFrame14.setCursor(0);
    org.jfree.date.SerialDate serialDate19 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel21 = new org.jfree.ui.SerialDateChooserPanel(serialDate19, true);
    java.awt.Color color22 = serialDateChooserPanel21.getForeground();
    applicationFrame14.setBackground(color22);
    boolean b24 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color12, (java.awt.Paint)color22);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate3, false, color8, color22);
    dateCellRenderer0.setForeground(color22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest45.test05"); }

    org.jfree.ui.RectangleEdge rectangleEdge0 = org.jfree.ui.RectangleEdge.TOP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleEdge0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest45.test06"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.util.Locale locale3 = applicationFrame1.getLocale();
    applicationFrame1.transferFocusUpCycle();
    java.awt.Component component5 = applicationFrame1.getFocusOwner();
    applicationFrame1.toFront();
    java.awt.event.WindowEvent windowEvent7 = null;
    // The following exception was thrown during execution in test generation
    try {
    applicationFrame1.windowClosing(windowEvent7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component5);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest45.test07"); }

    int i0 = java.awt.Frame.MAXIMIZED_BOTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 6);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest45.test08"); }

    org.jfree.util.LogContext logContext1 = new org.jfree.util.LogContext("NO_CHANGE");
    org.jfree.base.BasicProjectInfo basicProjectInfo6 = new org.jfree.base.BasicProjectInfo("hi!", "", "notify-field-accept", "PanelUI");
    logContext1.warn((java.lang.Object)"notify-field-accept");

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest45.test09"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    org.jfree.date.SerialDate serialDate8 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel10 = new org.jfree.ui.SerialDateChooserPanel(serialDate8, true);
    boolean b11 = serialDateChooserPanel10.getIgnoreRepaint();
    javax.swing.InputMap inputMap12 = serialDateChooserPanel10.getInputMap();
    javax.swing.TransferHandler transferHandler13 = null;
    serialDateChooserPanel10.setTransferHandler(transferHandler13);
    javax.swing.plaf.PanelUI panelUI15 = null;
    serialDateChooserPanel10.setUI(panelUI15);
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array17 = serialDateChooserPanel10.getHierarchyBoundsListeners();
    java.awt.Dimension dimension18 = serialDateChooserPanel10.minimumSize();
    java.awt.Rectangle rectangle19 = serialDateChooserPanel10.bounds();
    javax.swing.JPopupMenu jPopupMenu20 = null;
    serialDateChooserPanel10.setComponentPopupMenu(jPopupMenu20);
    boolean b22 = org.jfree.util.ObjectUtilities.equal((java.lang.Object)serialDateChooserPanel2, (java.lang.Object)serialDateChooserPanel10);
    org.jfree.date.SerialDate serialDate23 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate23, true);
    boolean b26 = serialDateChooserPanel25.getIgnoreRepaint();
    javax.swing.InputMap inputMap27 = serialDateChooserPanel25.getInputMap();
    javax.swing.TransferHandler transferHandler28 = null;
    serialDateChooserPanel25.setTransferHandler(transferHandler28);
    java.awt.LayoutManager layoutManager30 = serialDateChooserPanel25.getLayout();
    serialDateChooserPanel2.setLayout(layoutManager30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(layoutManager30);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest45.test10"); }

    org.jfree.text.TextBlockAnchor textBlockAnchor0 = org.jfree.text.TextBlockAnchor.BOTTOM_RIGHT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor0);

  }

}
