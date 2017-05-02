
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    java.beans.VetoableChangeListener vetoableChangeListener3 = null;
    serialDateChooserPanel2.removeVetoableChangeListener(vetoableChangeListener3);
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Point point5 = serialDateChooserPanel2.getLocationOnScreen();
      org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25.test02"); }

    java.awt.geom.Rectangle2D rectangle2D0 = null;
    org.jfree.date.SerialDate serialDate1 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel3 = new org.jfree.ui.SerialDateChooserPanel(serialDate1, true);
    boolean b4 = serialDateChooserPanel3.getIgnoreRepaint();
    javax.swing.InputMap inputMap5 = serialDateChooserPanel3.getInputMap();
    java.awt.Rectangle rectangle6 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle7 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b8 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle6, (java.awt.geom.Rectangle2D)rectangle7);
    java.awt.Rectangle rectangle9 = serialDateChooserPanel3.getBounds(rectangle7);
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel12 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    boolean b13 = serialDateChooserPanel12.getIgnoreRepaint();
    java.awt.Rectangle rectangle14 = serialDateChooserPanel12.getVisibleRect();
    boolean b15 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle7, (java.awt.Shape)rectangle14);
    // The following exception was thrown during execution in test generation
    try {
    boolean b16 = org.jfree.util.ShapeUtilities.intersects(rectangle2D0, (java.awt.geom.Rectangle2D)rectangle7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25.test03"); }

    int i0 = org.jfree.ui.SortButtonRenderer.UP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25.test04"); }

    boolean b0 = org.jfree.text.TextUtilities.getUseFontMetricsGetStringBounds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25.test05"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument1 = new org.jfree.ui.LengthLimitingDocument(4);
    javax.swing.text.Element element2 = lengthLimitingDocument1.getDefaultRootElement();
    javax.swing.event.UndoableEditListener undoableEditListener3 = null;
    lengthLimitingDocument1.removeUndoableEditListener(undoableEditListener3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(element2);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25.test06"); }

    java.util.Calendar calendar0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.ui.DateChooserPanel dateChooserPanel2 = new org.jfree.ui.DateChooserPanel(calendar0, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25.test07"); }

    org.jfree.base.BasicProjectInfo basicProjectInfo0 = new org.jfree.base.BasicProjectInfo();
    org.jfree.base.Library[] library_array1 = basicProjectInfo0.getLibraries();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(library_array1);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25.test08"); }

    java.awt.Frame[] frame_array0 = java.awt.Frame.getFrames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(frame_array0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25.test09"); }

    int i0 = java.awt.Frame.S_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 9);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25.test10"); }

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
    javax.swing.JTable jTable24 = null;
    org.jfree.ui.L1R2ButtonPanel l1R2ButtonPanel28 = new org.jfree.ui.L1R2ButtonPanel("", "hi!", "notify-field-accept");
    javax.swing.JButton jButton29 = l1R2ButtonPanel28.getLeftButton();
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component34 = dateCellRenderer9.getTableCellRendererComponent(jTable24, (java.lang.Object)l1R2ButtonPanel28, false, false, 5, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton29);

  }

}
