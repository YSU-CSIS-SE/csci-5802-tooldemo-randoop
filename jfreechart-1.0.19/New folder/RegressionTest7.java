
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    java.awt.image.ColorModel colorModel3 = serialDateChooserPanel2.getColorModel();
    serialDateChooserPanel2.setIgnoreRepaint(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel3);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test02"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    serialDateChooserPanel2.resize(8, (int)(short)-1);
    java.awt.Dimension dimension7 = serialDateChooserPanel2.getPreferredSize();
    serialDateChooserPanel2.setAutoscrolls(true);
    java.awt.event.ActionEvent actionEvent10 = null;
    // The following exception was thrown during execution in test generation
    try {
    serialDateChooserPanel2.actionPerformed(actionEvent10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension7);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test03"); }

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
    java.lang.String str13 = serialDateChooserPanel8.getUIClassID();
    serialDateChooserPanel8.repaint(10L);
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "PanelUI"+ "'", str13.equals("PanelUI"));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test04"); }

    java.awt.geom.Line2D line2D0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Shape shape2 = org.jfree.util.ShapeUtilities.createLineRegion(line2D0, (float)8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test05"); }

    int i0 = org.jfree.ui.Align.TOP_LEFT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 5);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test06"); }

    org.jfree.ui.ApplicationFrame applicationFrame2 = new org.jfree.ui.ApplicationFrame("");
    int i3 = applicationFrame2.getState();
    java.util.Locale locale4 = applicationFrame2.getLocale();
    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle5 = org.jfree.util.ResourceBundleWrapper.getBundle("content", locale4);
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale4);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test07"); }

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
    java.awt.event.InputMethodListener inputMethodListener11 = null;
    serialDateChooserPanel2.addInputMethodListener(inputMethodListener11);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.awt.AWTKeyStroke> set_aWTKeyStroke14 = serialDateChooserPanel2.getFocusTraversalKeys((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jRootPane10);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test08"); }

    java.awt.geom.GeneralPath generalPath0 = null;
    java.awt.geom.GeneralPath generalPath1 = null;
    boolean b2 = org.jfree.util.ShapeUtilities.equal(generalPath0, generalPath1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test09"); }

    int i0 = javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7.test10"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array1 = lengthLimitingDocument0.getDocumentListeners();
    javax.swing.text.Position position2 = lengthLimitingDocument0.getEndPosition();
    javax.swing.text.Element[] element_array3 = lengthLimitingDocument0.getRootElements();
    org.jfree.date.SerialDate serialDate4 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel6 = new org.jfree.ui.SerialDateChooserPanel(serialDate4, true);
    boolean b7 = serialDateChooserPanel6.getIgnoreRepaint();
    boolean b8 = serialDateChooserPanel6.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array9 = serialDateChooserPanel6.getPropertyChangeListeners();
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.ui.KeyedComboBoxModel keyedComboBoxModel10 = new org.jfree.ui.KeyedComboBoxModel((java.lang.Object[])element_array3, (java.lang.Object[])propertyChangeListener_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(position2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(element_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array9);

  }

}
