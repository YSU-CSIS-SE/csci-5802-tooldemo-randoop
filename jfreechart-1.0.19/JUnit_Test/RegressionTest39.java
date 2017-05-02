
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest39 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    java.awt.Color color3 = serialDateChooserPanel2.getForeground();
    java.awt.Event event4 = null;
    boolean b7 = serialDateChooserPanel2.mouseUp(event4, (int)(byte)10, (int)(short)100);
    org.jfree.date.SerialDate serialDate8 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel10 = new org.jfree.ui.SerialDateChooserPanel(serialDate8, true);
    boolean b11 = serialDateChooserPanel10.getIgnoreRepaint();
    javax.swing.InputMap inputMap12 = serialDateChooserPanel10.getInputMap();
    java.awt.Dimension dimension13 = serialDateChooserPanel10.getMaximumSize();
    serialDateChooserPanel2.setMinimumSize(dimension13);
    org.jfree.date.SerialDate serialDate15 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel17 = new org.jfree.ui.SerialDateChooserPanel(serialDate15, true);
    serialDateChooserPanel17.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b22 = serialDateChooserPanel17.isFocusTraversable();
    java.awt.Image image23 = null;
    org.jfree.date.SerialDate serialDate24 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel26 = new org.jfree.ui.SerialDateChooserPanel(serialDate24, true);
    boolean b27 = serialDateChooserPanel26.getIgnoreRepaint();
    boolean b28 = serialDateChooserPanel26.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array29 = serialDateChooserPanel26.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate30 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel32 = new org.jfree.ui.SerialDateChooserPanel(serialDate30, true);
    boolean b33 = serialDateChooserPanel32.getIgnoreRepaint();
    serialDateChooserPanel32.setAlignmentX((float)(byte)10);
    java.awt.Component component36 = serialDateChooserPanel26.add((java.awt.Component)serialDateChooserPanel32);
    java.lang.String str37 = serialDateChooserPanel32.getUIClassID();
    boolean b38 = serialDateChooserPanel32.isBackgroundSet();
    int i39 = serialDateChooserPanel17.checkImage(image23, (java.awt.image.ImageObserver)serialDateChooserPanel32);
    java.lang.Object obj40 = serialDateChooserPanel2.getClientProperty((java.lang.Object)serialDateChooserPanel32);
    serialDateChooserPanel32.move((int)(byte)1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "PanelUI"+ "'", str37.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test02"); }

    org.jfree.ui.about.ProjectInfo projectInfo0 = org.jfree.JCommon.INFO;
    org.jfree.base.Library[] library_array1 = projectInfo0.getLibraries();
    projectInfo0.setCopyright("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(projectInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(library_array1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test03"); }

    org.jfree.ui.RectangleAnchor rectangleAnchor0 = org.jfree.ui.RectangleAnchor.BOTTOM;
    java.lang.Object obj1 = null;
    boolean b2 = rectangleAnchor0.equals(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleAnchor0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test04"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    org.jfree.ui.ApplicationFrame applicationFrame2 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent3 = null;
    applicationFrame2.windowDeiconified(windowEvent3);
    applicationFrame2.firePropertyChange("hi!", '#', '4');
    java.awt.Rectangle rectangle9 = applicationFrame2.getMaximizedBounds();
    java.awt.Rectangle rectangle10 = applicationFrame2.getMaximizedBounds();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array11 = applicationFrame2.getMouseWheelListeners();
    applicationFrame2.repaint((long)12);
    java.lang.Object obj14 = dateCellRenderer0.getClientProperty((java.lang.Object)applicationFrame2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test05"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getDisplayedMnemonic();
    java.lang.String str2 = dateCellRenderer0.getText();
    java.awt.ComponentOrientation componentOrientation3 = null;
    dateCellRenderer0.setComponentOrientation(componentOrientation3);
    org.jfree.date.SerialDate serialDate5 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel7 = new org.jfree.ui.SerialDateChooserPanel(serialDate5, true);
    boolean b8 = serialDateChooserPanel7.getIgnoreRepaint();
    boolean b9 = serialDateChooserPanel7.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array10 = serialDateChooserPanel7.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate11 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel13 = new org.jfree.ui.SerialDateChooserPanel(serialDate11, true);
    boolean b14 = serialDateChooserPanel13.getIgnoreRepaint();
    serialDateChooserPanel13.setAlignmentX((float)(byte)10);
    java.awt.Component component17 = serialDateChooserPanel7.add((java.awt.Component)serialDateChooserPanel13);
    org.jfree.date.SerialDate serialDate18 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel20 = new org.jfree.ui.SerialDateChooserPanel(serialDate18, true);
    java.awt.Color color21 = serialDateChooserPanel20.getForeground();
    component17.setForeground(color21);
    dateCellRenderer0.setForeground(color21);
    // The following exception was thrown during execution in test generation
    try {
    dateCellRenderer0.setDisplayedMnemonicIndex((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color21);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test06"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b7 = serialDateChooserPanel2.isFocusTraversable();
    java.awt.Image image8 = null;
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel11 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, true);
    boolean b12 = serialDateChooserPanel11.getIgnoreRepaint();
    boolean b13 = serialDateChooserPanel11.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array14 = serialDateChooserPanel11.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate15 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel17 = new org.jfree.ui.SerialDateChooserPanel(serialDate15, true);
    boolean b18 = serialDateChooserPanel17.getIgnoreRepaint();
    serialDateChooserPanel17.setAlignmentX((float)(byte)10);
    java.awt.Component component21 = serialDateChooserPanel11.add((java.awt.Component)serialDateChooserPanel17);
    java.lang.String str22 = serialDateChooserPanel17.getUIClassID();
    boolean b23 = serialDateChooserPanel17.isBackgroundSet();
    int i24 = serialDateChooserPanel2.checkImage(image8, (java.awt.image.ImageObserver)serialDateChooserPanel17);
    org.jfree.ui.L1R2ButtonPanel l1R2ButtonPanel28 = new org.jfree.ui.L1R2ButtonPanel("", "hi!", "notify-field-accept");
    javax.swing.JButton jButton29 = l1R2ButtonPanel28.getLeftButton();
    java.lang.Object obj30 = serialDateChooserPanel2.getClientProperty((java.lang.Object)l1R2ButtonPanel28);
    java.awt.event.ContainerListener containerListener31 = null;
    l1R2ButtonPanel28.removeContainerListener(containerListener31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "PanelUI"+ "'", str22.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test07"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array1 = lengthLimitingDocument0.getDocumentListeners();
    int i2 = lengthLimitingDocument0.getMaxLength();
    javax.swing.text.Element element3 = lengthLimitingDocument0.getDefaultRootElement();
    javax.swing.event.DocumentListener documentListener4 = null;
    lengthLimitingDocument0.addDocumentListener(documentListener4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(element3);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test08"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    applicationFrame1.firePropertyChange("hi!", '#', '4');
    java.awt.Rectangle rectangle8 = applicationFrame1.getMaximizedBounds();
    java.awt.Rectangle rectangle9 = applicationFrame1.getMaximizedBounds();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array10 = applicationFrame1.getMouseWheelListeners();
    applicationFrame1.repaint((long)12);
    java.awt.Component[] component_array13 = applicationFrame1.getComponents();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array13);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test09"); }

    javax.swing.JDialog jDialog0 = null;
    org.jfree.ui.WizardPanel wizardPanel3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.ui.WizardDialog wizardDialog4 = new org.jfree.ui.WizardDialog(jDialog0, false, "$ename", wizardPanel3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test10"); }

    java.util.Locale locale1 = javax.swing.JComponent.getDefaultLocale();
    java.util.ResourceBundle.Control control2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle3 = java.util.ResourceBundle.getBundle("SortOrder.ASCENDING", locale1, control2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale1);

  }

}
