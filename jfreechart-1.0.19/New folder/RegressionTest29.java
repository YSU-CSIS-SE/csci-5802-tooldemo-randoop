
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    javax.swing.InputMap inputMap4 = serialDateChooserPanel2.getInputMap();
    javax.swing.TransferHandler transferHandler5 = null;
    serialDateChooserPanel2.setTransferHandler(transferHandler5);
    javax.swing.plaf.PanelUI panelUI7 = null;
    serialDateChooserPanel2.setUI(panelUI7);
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array9 = serialDateChooserPanel2.getHierarchyBoundsListeners();
    javax.swing.JRootPane jRootPane10 = serialDateChooserPanel2.getRootPane();
    serialDateChooserPanel2.firePropertyChange("ClassContext", true, false);
    java.awt.Insets insets15 = null;
    java.awt.Insets insets16 = serialDateChooserPanel2.getInsets(insets15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jRootPane10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets16);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29.test02"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    serialDateChooserPanel2.enableInputMethods(true);
    java.lang.String str10 = serialDateChooserPanel2.getToolTipText();
    java.awt.event.ContainerListener containerListener11 = null;
    serialDateChooserPanel2.addContainerListener(containerListener11);
    org.jfree.date.SerialDate serialDate13 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel15 = new org.jfree.ui.SerialDateChooserPanel(serialDate13, true);
    java.awt.Color color16 = serialDateChooserPanel15.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame18 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener19 = null;
    applicationFrame18.removeWindowStateListener(windowStateListener19);
    applicationFrame18.setCursor(0);
    org.jfree.date.SerialDate serialDate23 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate23, true);
    java.awt.Color color26 = serialDateChooserPanel25.getForeground();
    applicationFrame18.setBackground(color26);
    boolean b28 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color16, (java.awt.Paint)color26);
    serialDateChooserPanel2.setBackground(color16);
    org.jfree.date.SerialDate serialDate30 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel32 = new org.jfree.ui.SerialDateChooserPanel(serialDate30, true);
    boolean b33 = serialDateChooserPanel32.getIgnoreRepaint();
    javax.swing.InputMap inputMap34 = serialDateChooserPanel32.getInputMap();
    javax.swing.TransferHandler transferHandler35 = null;
    serialDateChooserPanel32.setTransferHandler(transferHandler35);
    javax.swing.plaf.PanelUI panelUI37 = null;
    serialDateChooserPanel32.setUI(panelUI37);
    java.awt.Dimension dimension39 = serialDateChooserPanel32.getMaximumSize();
    serialDateChooserPanel2.setSize(dimension39);
    boolean b41 = serialDateChooserPanel2.isEnabled();
    java.beans.VetoableChangeListener vetoableChangeListener42 = null;
    serialDateChooserPanel2.addVetoableChangeListener(vetoableChangeListener42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29.test03"); }

    org.jfree.util.ObjectTable objectTable1 = new org.jfree.util.ObjectTable((int)' ');
    int i2 = objectTable1.getRowCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29.test04"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.awt.event.WindowEvent windowEvent3 = null;
    applicationFrame1.windowIconified(windowEvent3);
    applicationFrame1.removeNotify();
    java.awt.event.WindowFocusListener windowFocusListener6 = null;
    applicationFrame1.addWindowFocusListener(windowFocusListener6);
    java.awt.event.WindowStateListener windowStateListener8 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29.test05"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    dateCellRenderer0.setIconTextGap(5);
    dateCellRenderer0.validate();
    int i4 = dateCellRenderer0.getIconTextGap();
    java.lang.String str5 = dateCellRenderer0.getText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29.test06"); }

    java.lang.String[] str_array1 = org.jfree.date.SerialDate.getMonths(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29.test07"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    boolean b4 = serialDateChooserPanel2.isCursorSet();
    java.awt.Dimension dimension5 = serialDateChooserPanel2.minimumSize();
    org.jfree.date.SerialDate serialDate6 = serialDateChooserPanel2.getDate();
    java.awt.Event event7 = null;
    boolean b10 = serialDateChooserPanel2.mouseMove(event7, 0, 1);
    org.jfree.date.SerialDate serialDate11 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel13 = new org.jfree.ui.SerialDateChooserPanel(serialDate11, true);
    boolean b14 = serialDateChooserPanel13.getIgnoreRepaint();
    javax.swing.InputMap inputMap15 = serialDateChooserPanel13.getInputMap();
    java.awt.Rectangle rectangle16 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle17 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b18 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle16, (java.awt.geom.Rectangle2D)rectangle17);
    java.awt.Rectangle rectangle19 = serialDateChooserPanel13.getBounds(rectangle17);
    java.awt.Rectangle rectangle20 = serialDateChooserPanel2.getBounds(rectangle19);
    org.jfree.ui.RectangleAnchor rectangleAnchor21 = org.jfree.ui.RectangleAnchor.BOTTOM_LEFT;
    java.awt.Shape shape24 = org.jfree.util.ShapeUtilities.createTranslatedShape((java.awt.Shape)rectangle20, rectangleAnchor21, (double)(short)1, (double)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(serialDate6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleAnchor21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape24);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29.test08"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    java.beans.VetoableChangeListener vetoableChangeListener3 = null;
    serialDateChooserPanel2.removeVetoableChangeListener(vetoableChangeListener3);
    boolean b5 = serialDateChooserPanel2.requestDefaultFocus();
    serialDateChooserPanel2.removeAll();
    boolean b7 = serialDateChooserPanel2.requestFocusInWindow();
    java.awt.event.InputMethodListener[] inputMethodListener_array8 = serialDateChooserPanel2.getInputMethodListeners();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array9 = serialDateChooserPanel2.getMouseMotionListeners();
    org.jfree.date.SerialDate serialDate11 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel13 = new org.jfree.ui.SerialDateChooserPanel(serialDate11, true);
    boolean b14 = serialDateChooserPanel13.getIgnoreRepaint();
    serialDateChooserPanel13.resize(8, (int)(short)-1);
    java.awt.Dimension dimension18 = serialDateChooserPanel13.getPreferredSize();
    java.lang.Exception exception20 = null;
    org.jfree.util.StackableRuntimeException stackableRuntimeException21 = new org.jfree.util.StackableRuntimeException("", exception20);
    org.jfree.util.Log.log((int)(byte)10, (java.lang.Object)dimension18, (java.lang.Exception)stackableRuntimeException21);
    java.lang.Throwable[] throwable_array23 = stackableRuntimeException21.getSuppressed();
    boolean b24 = org.jfree.util.ArrayUtilities.equalReferencesInArrays((java.lang.Object[])mouseMotionListener_array9, (java.lang.Object[])throwable_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMethodListener_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29.test09"); }

    org.jfree.text.TextLine textLine1 = new org.jfree.text.TextLine("NO_CHANGE");
    java.awt.Graphics2D graphics2D2 = null;
    org.jfree.ui.TextAnchor textAnchor5 = org.jfree.ui.TextAnchor.BASELINE_LEFT;
    // The following exception was thrown during execution in test generation
    try {
    textLine1.draw(graphics2D2, (float)100, (float)10, textAnchor5, (float)5, (float)(byte)-1, (double)5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor5);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29.test10"); }

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
    java.awt.Event event19 = null;
    boolean b22 = paintSample16.mouseEnter(event19, (-1), 31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

}
