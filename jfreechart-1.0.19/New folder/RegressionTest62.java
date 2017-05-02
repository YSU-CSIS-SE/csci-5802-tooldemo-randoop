
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest62 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest62.test01"); }

    org.jfree.text.TextFragment textFragment1 = new org.jfree.text.TextFragment("PanelUI");
    java.awt.Paint paint2 = textFragment1.getPaint();
    java.lang.String str3 = textFragment1.getText();
    java.lang.String str4 = textFragment1.getText();
    float f5 = textFragment1.getBaselineOffset();
    java.lang.String str6 = textFragment1.getText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "PanelUI"+ "'", str3.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "PanelUI"+ "'", str4.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f5 == 0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "PanelUI"+ "'", str6.equals("PanelUI"));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest62.test02"); }

    java.util.Date date3 = org.jfree.date.DateUtilities.createDate(16, 13, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest62.test03"); }

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
    java.awt.Rectangle rectangle28 = applicationFrame1.getBounds();
    applicationFrame1.show();
    java.awt.event.WindowEvent windowEvent30 = null;
    // The following exception was thrown during execution in test generation
    try {
    applicationFrame1.windowClosing(windowEvent30);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle28);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest62.test04"); }

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
    boolean b24 = dateCellRenderer9.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest62.test05"); }

    org.jfree.base.Library library4 = new org.jfree.base.Library("notify-field-accept", "GradientPaintTransformType.HORIZONTAL", "TableOrder.BY_COLUMN", "RectangleAnchor.BOTTOM_LEFT");

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest62.test06"); }

    org.jfree.JCommonInfo jCommonInfo0 = org.jfree.JCommonInfo.getInstance();
    org.jfree.base.BootableProjectInfo bootableProjectInfo6 = new org.jfree.base.BootableProjectInfo("hi!", "hi!", "content", "PanelUI", "");
    jCommonInfo0.addOptionalLibrary((org.jfree.base.Library)bootableProjectInfo6);
    org.jfree.base.Library[] library_array8 = jCommonInfo0.getLibraries();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jCommonInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(library_array8);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest62.test07"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    javax.swing.InputMap inputMap4 = serialDateChooserPanel2.getInputMap();
    javax.swing.TransferHandler transferHandler5 = null;
    serialDateChooserPanel2.setTransferHandler(transferHandler5);
    javax.swing.plaf.PanelUI panelUI7 = null;
    serialDateChooserPanel2.setUI(panelUI7);
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array9 = serialDateChooserPanel2.getHierarchyBoundsListeners();
    java.awt.Dimension dimension10 = serialDateChooserPanel2.minimumSize();
    serialDateChooserPanel2.grabFocus();
    java.awt.Container container12 = null;
    boolean b13 = serialDateChooserPanel2.isFocusCycleRoot(container12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest62.test08"); }

    java.awt.Shape shape1 = org.jfree.util.ShapeUtilities.createDiamond((float)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape1);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest62.test09"); }

    org.jfree.util.SortOrder sortOrder0 = org.jfree.util.SortOrder.ASCENDING;
    java.lang.String str1 = sortOrder0.toString();
    org.jfree.ui.DateCellRenderer dateCellRenderer2 = new org.jfree.ui.DateCellRenderer();
    int i3 = dateCellRenderer2.getIconTextGap();
    javax.swing.Icon icon4 = dateCellRenderer2.getDisabledIcon();
    dateCellRenderer2.firePropertyChange("content", (float)(short)1, (float)7);
    dateCellRenderer2.firePropertyChange("5-January-1900", false, true);
    boolean b13 = sortOrder0.equals((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortOrder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SortOrder.ASCENDING"+ "'", str1.equals("SortOrder.ASCENDING"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest62.test10"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    java.awt.Color color3 = serialDateChooserPanel2.getForeground();
    java.awt.Event event4 = null;
    boolean b7 = serialDateChooserPanel2.mouseUp(event4, (int)(byte)10, (int)(short)100);
    javax.swing.InputMap inputMap9 = serialDateChooserPanel2.getInputMap(0);
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel12 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    boolean b13 = serialDateChooserPanel12.getIgnoreRepaint();
    boolean b14 = serialDateChooserPanel12.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array15 = serialDateChooserPanel12.getPropertyChangeListeners();
    javax.swing.InputMap inputMap16 = serialDateChooserPanel12.getInputMap();
    boolean b17 = serialDateChooserPanel12.isForegroundSet();
    javax.swing.KeyStroke keyStroke19 = null;
    serialDateChooserPanel2.registerKeyboardAction((java.awt.event.ActionListener)serialDateChooserPanel12, "ClassContext", keyStroke19, (int)(byte)1);
    int i22 = serialDateChooserPanel12.getX();
    java.awt.Dimension dimension23 = serialDateChooserPanel12.getMinimumSize();
    java.awt.event.MouseListener mouseListener24 = null;
    serialDateChooserPanel12.removeMouseListener(mouseListener24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension23);

  }

}
