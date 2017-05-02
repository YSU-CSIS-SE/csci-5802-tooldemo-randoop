
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest95 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest95.test01"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    boolean b4 = applicationFrame1.isShowing();
    org.jfree.ui.ApplicationFrame applicationFrame6 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener7 = null;
    applicationFrame6.removeWindowStateListener(windowStateListener7);
    boolean b9 = applicationFrame6.isValidateRoot();
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel12 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    boolean b13 = serialDateChooserPanel12.getIgnoreRepaint();
    javax.swing.InputMap inputMap14 = serialDateChooserPanel12.getInputMap();
    java.awt.Rectangle rectangle15 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle16 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b17 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle15, (java.awt.geom.Rectangle2D)rectangle16);
    java.awt.Rectangle rectangle18 = serialDateChooserPanel12.getBounds(rectangle16);
    org.jfree.date.SerialDate serialDate19 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel21 = new org.jfree.ui.SerialDateChooserPanel(serialDate19, true);
    boolean b22 = serialDateChooserPanel21.getIgnoreRepaint();
    java.awt.Rectangle rectangle23 = serialDateChooserPanel21.getVisibleRect();
    boolean b24 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle16, (java.awt.Shape)rectangle23);
    applicationFrame6.setMaximizedBounds(rectangle16);
    javax.accessibility.AccessibleContext accessibleContext26 = applicationFrame6.getAccessibleContext();
    java.awt.Window.Type type27 = applicationFrame6.getType();
    applicationFrame1.setType(type27);
    java.awt.MenuBar menuBar29 = applicationFrame1.getMenuBar();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext26);
    org.junit.Assert.assertTrue("'" + type27 + "' != '" + java.awt.Window.Type.NORMAL + "'", type27.equals(java.awt.Window.Type.NORMAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar29);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest95.test02"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getDisplayedMnemonic();
    dateCellRenderer0.validate();
    int i3 = dateCellRenderer0.getDisplayedMnemonic();
    // The following exception was thrown during execution in test generation
    try {
    dateCellRenderer0.setVerticalAlignment((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest95.test03"); }

    org.jfree.base.AbstractBoot abstractBoot0 = org.jfree.base.BaseBoot.getInstance();
    boolean b1 = abstractBoot0.isBootInProgress();
    org.jfree.util.Configuration configuration2 = abstractBoot0.getGlobalConfig();
    org.jfree.util.ExtendedConfigurationWrapper extendedConfigurationWrapper3 = new org.jfree.util.ExtendedConfigurationWrapper(configuration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractBoot0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(configuration2);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest95.test04"); }

    java.awt.Graphics2D graphics2D1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.text.TextUtilities.drawRotatedString("TableOrder.BY_COLUMN", graphics2D1, (double)10, (float)(-458), (float)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest95.test05"); }

    org.jfree.layout.LCBLayout lCBLayout1 = new org.jfree.layout.LCBLayout(9);
    org.jfree.ui.ApplicationFrame applicationFrame3 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener4 = null;
    applicationFrame3.removeWindowStateListener(windowStateListener4);
    boolean b6 = applicationFrame3.isValidateRoot();
    applicationFrame3.doLayout();
    boolean b8 = applicationFrame3.getFocusTraversalKeysEnabled();
    lCBLayout1.addLayoutComponent((java.awt.Component)applicationFrame3);
    java.awt.Component component10 = applicationFrame3.getMostRecentFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component10);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest95.test06"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b7 = serialDateChooserPanel2.isFocusTraversable();
    java.awt.Image image8 = null;
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel11 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, true);
    boolean b12 = serialDateChooserPanel11.getIgnoreRepaint();
    javax.swing.InputMap inputMap13 = serialDateChooserPanel11.getInputMap();
    javax.swing.TransferHandler transferHandler14 = null;
    serialDateChooserPanel11.setTransferHandler(transferHandler14);
    javax.swing.plaf.PanelUI panelUI16 = null;
    serialDateChooserPanel11.setUI(panelUI16);
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array18 = serialDateChooserPanel11.getHierarchyBoundsListeners();
    boolean b19 = serialDateChooserPanel2.prepareImage(image8, (java.awt.image.ImageObserver)serialDateChooserPanel11);
    java.awt.im.InputMethodRequests inputMethodRequests20 = serialDateChooserPanel11.getInputMethodRequests();
    int i21 = serialDateChooserPanel11.getWidth();
    serialDateChooserPanel11.setToolTipText("5-January-1900");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest95.test07"); }

    org.jfree.ui.FilesystemFilter filesystemFilter2 = new org.jfree.ui.FilesystemFilter("content", "hi!");
    boolean b3 = filesystemFilter2.acceptsDirectories();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest95.test08"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    java.awt.LayoutManager layoutManager4 = null;
    applicationFrame1.setLayout(layoutManager4);
    applicationFrame1.show();
    boolean b7 = applicationFrame1.isAlwaysOnTop();
    org.jfree.date.SerialDate serialDate8 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel10 = new org.jfree.ui.SerialDateChooserPanel(serialDate8, true);
    serialDateChooserPanel10.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext15 = serialDateChooserPanel10.getAccessibleContext();
    java.awt.Dimension dimension16 = serialDateChooserPanel10.getPreferredSize();
    serialDateChooserPanel10.setInheritsPopupMenu(true);
    org.jfree.date.SerialDate serialDate19 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel21 = new org.jfree.ui.SerialDateChooserPanel(serialDate19, true);
    java.awt.Color color22 = serialDateChooserPanel21.getForeground();
    java.awt.Event event23 = null;
    boolean b26 = serialDateChooserPanel21.mouseUp(event23, (int)(byte)10, (int)(short)100);
    javax.swing.InputMap inputMap28 = serialDateChooserPanel21.getInputMap(0);
    org.jfree.date.SerialDate serialDate29 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel31 = new org.jfree.ui.SerialDateChooserPanel(serialDate29, true);
    boolean b32 = serialDateChooserPanel31.getIgnoreRepaint();
    boolean b33 = serialDateChooserPanel31.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array34 = serialDateChooserPanel31.getPropertyChangeListeners();
    javax.swing.InputMap inputMap35 = serialDateChooserPanel31.getInputMap();
    boolean b36 = serialDateChooserPanel31.isForegroundSet();
    javax.swing.KeyStroke keyStroke38 = null;
    serialDateChooserPanel21.registerKeyboardAction((java.awt.event.ActionListener)serialDateChooserPanel31, "ClassContext", keyStroke38, (int)(byte)1);
    javax.swing.KeyStroke keyStroke42 = null;
    serialDateChooserPanel10.registerKeyboardAction((java.awt.event.ActionListener)serialDateChooserPanel31, "ThreadContext", keyStroke42, 0);
    applicationFrame1.setContentPane((java.awt.Container)serialDateChooserPanel31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest95.test09"); }

    org.jfree.ui.TextAnchor textAnchor0 = org.jfree.ui.TextAnchor.BOTTOM_RIGHT;
    boolean b1 = textAnchor0.isTop();
    boolean b2 = textAnchor0.isLeft();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest95.test10"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("Jan");
    org.jfree.ui.RefineryUtilities.positionFrameOnScreen((java.awt.Window)applicationFrame1, (double)'4', (double)' ');
    javax.accessibility.AccessibleContext accessibleContext5 = applicationFrame1.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext5);

  }

}
