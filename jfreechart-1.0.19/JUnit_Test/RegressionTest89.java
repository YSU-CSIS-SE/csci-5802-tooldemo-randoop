
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest89 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest89.test01"); }

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
    java.lang.Exception exception30 = null;
    org.jfree.util.StackableRuntimeException stackableRuntimeException31 = new org.jfree.util.StackableRuntimeException("", exception30);
    org.jfree.util.Log.warn((java.lang.Object)rectangle28, (java.lang.Exception)stackableRuntimeException31);
    org.jfree.text.TextBox textBox33 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets34 = textBox33.getInteriorGap();
    java.awt.Rectangle rectangle35 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle36 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b37 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle35, (java.awt.geom.Rectangle2D)rectangle36);
    rectangleInsets34.trim((java.awt.geom.Rectangle2D)rectangle36);
    double d39 = rectangleInsets34.getLeft();
    org.jfree.ui.ApplicationFrame applicationFrame41 = new org.jfree.ui.ApplicationFrame("");
    java.awt.Rectangle rectangle42 = applicationFrame41.getMaximizedBounds();
    java.awt.event.MouseWheelListener mouseWheelListener43 = null;
    applicationFrame41.removeMouseWheelListener(mouseWheelListener43);
    applicationFrame41.setAutoRequestFocus(true);
    java.awt.event.KeyListener keyListener47 = null;
    applicationFrame41.addKeyListener(keyListener47);
    java.awt.Rectangle rectangle49 = applicationFrame41.bounds();
    java.awt.geom.Rectangle2D rectangle2D50 = rectangleInsets34.createInsetRectangle((java.awt.geom.Rectangle2D)rectangle49);
    boolean b51 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle28, (java.awt.Shape)rectangle2D50);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d39 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest89.test02"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    applicationFrame1.firePropertyChange("hi!", '#', '4');
    java.awt.FocusTraversalPolicy focusTraversalPolicy8 = applicationFrame1.getFocusTraversalPolicy();
    java.awt.Window.Type type9 = applicationFrame1.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusTraversalPolicy8);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + java.awt.Window.Type.NORMAL + "'", type9.equals(java.awt.Window.Type.NORMAL));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest89.test03"); }

    org.jfree.base.BasicProjectInfo basicProjectInfo5 = new org.jfree.base.BasicProjectInfo("$ename", "RectangleAnchor.BOTTOM_LEFT", "NO_CHANGE", "LabelUI", "VerticalAlignment.CENTER");

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest89.test04"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    java.awt.LayoutManager layoutManager4 = null;
    applicationFrame1.setLayout(layoutManager4);
    applicationFrame1.show();
    java.awt.MenuComponent menuComponent7 = null;
    applicationFrame1.remove(menuComponent7);
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel11 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, true);
    boolean b12 = serialDateChooserPanel11.getIgnoreRepaint();
    javax.swing.InputMap inputMap13 = serialDateChooserPanel11.getInputMap();
    serialDateChooserPanel11.hide();
    org.jfree.date.SerialDate serialDate15 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel17 = new org.jfree.ui.SerialDateChooserPanel(serialDate15, true);
    boolean b18 = serialDateChooserPanel17.getIgnoreRepaint();
    boolean b19 = serialDateChooserPanel17.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array20 = serialDateChooserPanel17.getPropertyChangeListeners();
    javax.swing.InputMap inputMap21 = serialDateChooserPanel17.getInputMap();
    boolean b22 = serialDateChooserPanel17.isForegroundSet();
    serialDateChooserPanel17.layout();
    java.awt.Point point24 = serialDateChooserPanel17.getLocation();
    java.awt.Point point25 = serialDateChooserPanel11.getLocation(point24);
    java.awt.Component component26 = applicationFrame1.findComponentAt(point25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component26);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest89.test05"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    java.awt.Stroke stroke1 = null;
    textBox0.setOutlineStroke(stroke1);
    org.jfree.text.TextBlock textBlock3 = null;
    textBox0.setTextBlock(textBlock3);
    org.jfree.ui.DateCellRenderer dateCellRenderer5 = new org.jfree.ui.DateCellRenderer();
    int i6 = dateCellRenderer5.getDisplayedMnemonic();
    java.lang.String str7 = dateCellRenderer5.getText();
    java.awt.ComponentOrientation componentOrientation8 = null;
    dateCellRenderer5.setComponentOrientation(componentOrientation8);
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel12 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    boolean b13 = serialDateChooserPanel12.getIgnoreRepaint();
    boolean b14 = serialDateChooserPanel12.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array15 = serialDateChooserPanel12.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate16 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel18 = new org.jfree.ui.SerialDateChooserPanel(serialDate16, true);
    boolean b19 = serialDateChooserPanel18.getIgnoreRepaint();
    serialDateChooserPanel18.setAlignmentX((float)(byte)10);
    java.awt.Component component22 = serialDateChooserPanel12.add((java.awt.Component)serialDateChooserPanel18);
    org.jfree.date.SerialDate serialDate23 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate23, true);
    java.awt.Color color26 = serialDateChooserPanel25.getForeground();
    component22.setForeground(color26);
    dateCellRenderer5.setForeground(color26);
    textBox0.setOutlinePaint((java.awt.Paint)color26);
    org.jfree.ui.RectangleInsets rectangleInsets30 = textBox0.getInteriorGap();
    double d32 = rectangleInsets30.calculateBottomOutset((double)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d32 == 1.0d);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest89.test06"); }

    org.jfree.date.SerialDate serialDate2 = org.jfree.date.SerialDate.createInstance(5);
    org.jfree.date.SerialDate serialDate3 = org.jfree.date.SerialDate.addDays((int)(short)1, serialDate2);
    org.jfree.date.SerialDate serialDate5 = org.jfree.date.SerialDate.createInstance(5);
    boolean b6 = org.jfree.date.SerialDateUtilities.isLastDayOfFebruary(serialDate5);
    int i7 = org.jfree.date.SerialDateUtilities.dayCount30PSA(serialDate2, serialDate5);
    org.jfree.date.SerialDate serialDate10 = org.jfree.date.SerialDate.createInstance(5);
    boolean b11 = org.jfree.date.SerialDateUtilities.isLastDayOfFebruary(serialDate10);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel13 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    org.jfree.date.SerialDate serialDate14 = org.jfree.date.SerialDate.addYears(16, serialDate10);
    org.jfree.date.SerialDate serialDate15 = serialDate5.getEndOfCurrentMonth(serialDate14);
    serialDate14.setDescription("org.jfree.ui.SerialDateChooserPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate15);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest89.test07"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    boolean b4 = serialDateChooserPanel2.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array5 = serialDateChooserPanel2.getPropertyChangeListeners();
    javax.swing.InputMap inputMap6 = serialDateChooserPanel2.getInputMap();
    boolean b7 = serialDateChooserPanel2.isForegroundSet();
    serialDateChooserPanel2.layout();
    javax.swing.KeyStroke keyStroke9 = null;
    int i10 = serialDateChooserPanel2.getConditionForKeyStroke(keyStroke9);
    org.jfree.text.TextBox textBox11 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets12 = textBox11.getInteriorGap();
    java.awt.Rectangle rectangle13 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle14 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b15 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle13, (java.awt.geom.Rectangle2D)rectangle14);
    rectangleInsets12.trim((java.awt.geom.Rectangle2D)rectangle14);
    double d17 = rectangleInsets12.getLeft();
    org.jfree.text.TextBox textBox18 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets19 = textBox18.getInteriorGap();
    java.awt.Rectangle rectangle20 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle21 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b22 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle20, (java.awt.geom.Rectangle2D)rectangle21);
    rectangleInsets19.trim((java.awt.geom.Rectangle2D)rectangle21);
    rectangleInsets12.trim((java.awt.geom.Rectangle2D)rectangle21);
    serialDateChooserPanel2.scrollRectToVisible(rectangle21);
    java.awt.event.MouseMotionListener mouseMotionListener26 = null;
    serialDateChooserPanel2.addMouseMotionListener(mouseMotionListener26);
    boolean b28 = serialDateChooserPanel2.isPaintingForPrint();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest89.test08"); }

    java.awt.Graphics2D graphics2D1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.text.TextUtilities.drawRotatedString("paragraph", graphics2D1, (float)' ', (float)(-458), (double)12, (float)1L, (float)(-1L));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest89.test09"); }

    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = org.jfree.date.SerialDate.weekdayCodeToString(31);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest89.test10"); }

    org.jfree.ui.Size2D size2D0 = new org.jfree.ui.Size2D();
    org.jfree.ui.RectangleAnchor rectangleAnchor3 = org.jfree.ui.RectangleAnchor.BOTTOM_RIGHT;
    org.jfree.ui.DateCellRenderer dateCellRenderer4 = new org.jfree.ui.DateCellRenderer();
    int i5 = dateCellRenderer4.getDisplayedMnemonic();
    java.lang.String str6 = dateCellRenderer4.getText();
    java.awt.ComponentOrientation componentOrientation7 = null;
    dateCellRenderer4.setComponentOrientation(componentOrientation7);
    org.jfree.ui.DateCellRenderer dateCellRenderer9 = new org.jfree.ui.DateCellRenderer();
    int i10 = dateCellRenderer9.getDisplayedMnemonic();
    java.lang.String str11 = dateCellRenderer9.getText();
    java.awt.ComponentOrientation componentOrientation12 = null;
    dateCellRenderer9.setComponentOrientation(componentOrientation12);
    org.jfree.date.SerialDate serialDate14 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel16 = new org.jfree.ui.SerialDateChooserPanel(serialDate14, true);
    boolean b17 = serialDateChooserPanel16.getIgnoreRepaint();
    boolean b18 = serialDateChooserPanel16.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array19 = serialDateChooserPanel16.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate20 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel22 = new org.jfree.ui.SerialDateChooserPanel(serialDate20, true);
    boolean b23 = serialDateChooserPanel22.getIgnoreRepaint();
    serialDateChooserPanel22.setAlignmentX((float)(byte)10);
    java.awt.Component component26 = serialDateChooserPanel16.add((java.awt.Component)serialDateChooserPanel22);
    org.jfree.date.SerialDate serialDate27 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel29 = new org.jfree.ui.SerialDateChooserPanel(serialDate27, true);
    java.awt.Color color30 = serialDateChooserPanel29.getForeground();
    component26.setForeground(color30);
    dateCellRenderer9.setForeground(color30);
    dateCellRenderer4.setForeground(color30);
    boolean b34 = rectangleAnchor3.equals((java.lang.Object)color30);
    java.awt.geom.Rectangle2D rectangle2D35 = org.jfree.ui.RectangleAnchor.createRectangle(size2D0, (double)(short)0, (double)8, rectangleAnchor3);
    java.lang.Object obj36 = size2D0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleAnchor3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj36);

  }

}
