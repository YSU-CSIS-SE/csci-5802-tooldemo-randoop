
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest64 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest64.test01"); }

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
    dateCellRenderer0.setBackground(color22);
    org.jfree.ui.DateCellRenderer dateCellRenderer27 = new org.jfree.ui.DateCellRenderer();
    int i28 = dateCellRenderer27.getDisplayedMnemonic();
    dateCellRenderer27.validate();
    org.jfree.date.SerialDate serialDate30 = null;
    org.jfree.date.SerialDate serialDate32 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel34 = new org.jfree.ui.SerialDateChooserPanel(serialDate32, true);
    java.awt.Color color35 = serialDateChooserPanel34.getForeground();
    org.jfree.date.SerialDate serialDate36 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel38 = new org.jfree.ui.SerialDateChooserPanel(serialDate36, true);
    java.awt.Color color39 = serialDateChooserPanel38.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame41 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener42 = null;
    applicationFrame41.removeWindowStateListener(windowStateListener42);
    applicationFrame41.setCursor(0);
    org.jfree.date.SerialDate serialDate46 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel48 = new org.jfree.ui.SerialDateChooserPanel(serialDate46, true);
    java.awt.Color color49 = serialDateChooserPanel48.getForeground();
    applicationFrame41.setBackground(color49);
    boolean b51 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color39, (java.awt.Paint)color49);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel52 = new org.jfree.ui.SerialDateChooserPanel(serialDate30, false, color35, color49);
    dateCellRenderer27.setBackground(color49);
    java.awt.Dimension dimension54 = dateCellRenderer27.getSize();
    dateCellRenderer0.setPreferredSize(dimension54);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension54);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest64.test02"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getIconTextGap();
    javax.swing.Icon icon2 = dateCellRenderer0.getDisabledIcon();
    java.lang.String str3 = dateCellRenderer0.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "LabelUI"+ "'", str3.equals("LabelUI"));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest64.test03"); }

    int i0 = java.awt.Frame.WAIT_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest64.test04"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    boolean b4 = applicationFrame1.isValidateRoot();
    applicationFrame1.doLayout();
    java.awt.Component component6 = applicationFrame1.getGlassPane();
    boolean b9 = component6.contains((int)(short)100, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest64.test05"); }

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
    javax.swing.ActionMap actionMap42 = serialDateChooserPanel2.getActionMap();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(actionMap42);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest64.test06"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    java.awt.event.ContainerListener containerListener4 = null;
    serialDateChooserPanel2.removeContainerListener(containerListener4);
    java.awt.Image image6 = null;
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel11 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, true);
    serialDateChooserPanel11.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext16 = serialDateChooserPanel11.getAccessibleContext();
    serialDateChooserPanel11.invalidate();
    serialDateChooserPanel11.grabFocus();
    javax.swing.JPopupMenu jPopupMenu19 = null;
    serialDateChooserPanel11.setComponentPopupMenu(jPopupMenu19);
    int i23 = serialDateChooserPanel11.getBaseline(1, 9999);
    int i24 = serialDateChooserPanel2.checkImage(image6, 12, 4, (java.awt.image.ImageObserver)serialDateChooserPanel11);
    int i25 = serialDateChooserPanel2.getY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest64.test07"); }

    org.jfree.util.ObjectTable objectTable1 = new org.jfree.util.ObjectTable((int)' ');
    org.jfree.util.SortOrder sortOrder2 = org.jfree.util.SortOrder.ASCENDING;
    java.lang.String str3 = sortOrder2.toString();
    boolean b4 = objectTable1.equals((java.lang.Object)str3);
    int i5 = objectTable1.getRowIncrement();
    int i6 = objectTable1.getColumnIncrement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortOrder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "SortOrder.ASCENDING"+ "'", str3.equals("SortOrder.ASCENDING"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest64.test08"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    org.jfree.date.SerialDate serialDate2 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel4 = new org.jfree.ui.SerialDateChooserPanel(serialDate2, true);
    java.beans.VetoableChangeListener vetoableChangeListener5 = null;
    serialDateChooserPanel4.removeVetoableChangeListener(vetoableChangeListener5);
    java.awt.Event event7 = null;
    org.jfree.date.SerialDate serialDate8 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel10 = new org.jfree.ui.SerialDateChooserPanel(serialDate8, true);
    boolean b11 = serialDateChooserPanel10.getIgnoreRepaint();
    javax.swing.InputMap inputMap12 = serialDateChooserPanel10.getInputMap();
    java.awt.Rectangle rectangle13 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle14 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b15 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle13, (java.awt.geom.Rectangle2D)rectangle14);
    java.awt.Rectangle rectangle16 = serialDateChooserPanel10.getBounds(rectangle14);
    org.jfree.date.SerialDate serialDate17 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel19 = new org.jfree.ui.SerialDateChooserPanel(serialDate17, true);
    boolean b20 = serialDateChooserPanel19.getIgnoreRepaint();
    java.awt.Rectangle rectangle21 = serialDateChooserPanel19.getVisibleRect();
    boolean b22 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle14, (java.awt.Shape)rectangle21);
    boolean b23 = serialDateChooserPanel4.lostFocus(event7, (java.lang.Object)rectangle21);
    java.awt.geom.Rectangle2D rectangle2D26 = rectangleInsets1.createOutsetRectangle((java.awt.geom.Rectangle2D)rectangle21, false, true);
    double d28 = rectangleInsets1.trimHeight(10.0d);
    org.jfree.util.UnitType unitType29 = rectangleInsets1.getUnitType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 8.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(unitType29);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest64.test09"); }

    java.awt.Shape shape1 = org.jfree.util.ShapeUtilities.createDownTriangle(0.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape1);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest64.test10"); }

    int i0 = org.jfree.date.SerialDate.NEAREST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

}
