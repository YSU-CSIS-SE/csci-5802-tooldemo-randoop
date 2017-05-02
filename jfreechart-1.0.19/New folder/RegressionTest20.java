
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test01"); }

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
    boolean b11 = serialDateChooserPanel2.isFocusable();
    boolean b12 = serialDateChooserPanel2.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jRootPane10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test02"); }

    int i0 = javax.swing.SwingConstants.SOUTH_EAST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test03"); }

    org.jfree.base.BootableProjectInfo bootableProjectInfo4 = new org.jfree.base.BootableProjectInfo("PanelUI", "ToolTipText", "ClassContext", "ThreadContext");

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test04"); }

    boolean b0 = org.jfree.text.TextUtilities.isUseDrawRotatedStringWorkaround();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test05"); }

    java.awt.Graphics2D graphics2D1 = null;
    org.jfree.ui.TextAnchor textAnchor4 = org.jfree.ui.TextAnchor.BASELINE_CENTER;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.geom.Rectangle2D rectangle2D5 = org.jfree.text.TextUtilities.drawAlignedString("notify-field-accept", graphics2D1, (float)12, (float)'a', textAnchor4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor4);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test06"); }

    java.net.URL uRL0 = null;
    java.net.URLClassLoader uRLClassLoader1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.util.ResourceBundleWrapper.removeCodeBase(uRL0, uRLClassLoader1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test07"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getDisplayedMnemonic();
    dateCellRenderer0.validate();
    // The following exception was thrown during execution in test generation
    try {
    dateCellRenderer0.setHorizontalTextPosition(13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test08"); }

    int i0 = java.awt.Frame.HAND_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 12);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test09"); }

    int i0 = javax.swing.JFrame.EXIT_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test10"); }

    int i0 = org.jfree.date.MonthConstants.OCTOBER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 10);

  }

}
