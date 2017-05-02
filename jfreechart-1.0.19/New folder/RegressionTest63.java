
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest63 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest63.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b7 = serialDateChooserPanel2.isFocusTraversable();
    java.lang.Object obj8 = null;
    java.lang.Object obj9 = serialDateChooserPanel2.getClientProperty(obj8);
    serialDateChooserPanel2.setEnabled(false);
    int i14 = serialDateChooserPanel2.getBaseline(100, (int)(short)10);
    java.awt.Graphics graphics15 = null;
    serialDateChooserPanel2.paint(graphics15);
    org.jfree.date.SerialDate serialDate17 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel19 = new org.jfree.ui.SerialDateChooserPanel(serialDate17, true);
    boolean b20 = serialDateChooserPanel19.getIgnoreRepaint();
    javax.swing.InputMap inputMap21 = serialDateChooserPanel19.getInputMap();
    serialDateChooserPanel19.hide();
    org.jfree.date.SerialDate serialDate23 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate23, true);
    boolean b26 = serialDateChooserPanel25.getIgnoreRepaint();
    boolean b27 = serialDateChooserPanel25.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array28 = serialDateChooserPanel25.getPropertyChangeListeners();
    javax.swing.InputMap inputMap29 = serialDateChooserPanel25.getInputMap();
    boolean b30 = serialDateChooserPanel25.isForegroundSet();
    serialDateChooserPanel25.layout();
    java.awt.Point point32 = serialDateChooserPanel25.getLocation();
    java.awt.Point point33 = serialDateChooserPanel19.getLocation(point32);
    java.awt.Point point34 = serialDateChooserPanel2.getLocation(point33);
    java.awt.event.HierarchyListener[] hierarchyListener_array35 = serialDateChooserPanel2.getHierarchyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array35);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest63.test02"); }

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
    int i13 = dateCellRenderer9.getVerticalTextPosition();
    javax.swing.Icon icon14 = dateCellRenderer9.getIcon();
    org.jfree.date.SerialDate serialDate15 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel17 = new org.jfree.ui.SerialDateChooserPanel(serialDate15, true);
    boolean b18 = serialDateChooserPanel17.getIgnoreRepaint();
    boolean b19 = serialDateChooserPanel17.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array20 = serialDateChooserPanel17.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate21 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel23 = new org.jfree.ui.SerialDateChooserPanel(serialDate21, true);
    boolean b24 = serialDateChooserPanel23.getIgnoreRepaint();
    serialDateChooserPanel23.setAlignmentX((float)(byte)10);
    java.awt.Component component27 = serialDateChooserPanel17.add((java.awt.Component)serialDateChooserPanel23);
    java.lang.String str28 = serialDateChooserPanel23.getUIClassID();
    javax.swing.KeyStroke keyStroke29 = null;
    // The following exception was thrown during execution in test generation
    try {
    dateCellRenderer9.registerKeyboardAction((java.awt.event.ActionListener)serialDateChooserPanel23, keyStroke29, 5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "PanelUI"+ "'", str28.equals("PanelUI"));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest63.test03"); }

    org.jfree.date.SerialDate serialDate3 = org.jfree.date.SerialDate.createInstance(5);
    org.jfree.date.SerialDate serialDate4 = org.jfree.date.SerialDate.addDays((int)(short)1, serialDate3);
    org.jfree.date.SerialDate serialDate6 = org.jfree.date.SerialDate.createInstance(5);
    boolean b7 = org.jfree.date.SerialDateUtilities.isLastDayOfFebruary(serialDate6);
    int i8 = org.jfree.date.SerialDateUtilities.dayCount30PSA(serialDate3, serialDate6);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.date.SerialDate serialDate9 = org.jfree.date.SerialDate.getNearestDayOfWeek((int)'#', serialDate3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest63.test04"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    dateCellRenderer0.setIconTextGap(5);
    dateCellRenderer0.validate();
    java.awt.Dimension dimension4 = dateCellRenderer0.getMaximumSize();
    javax.accessibility.AccessibleContext accessibleContext5 = dateCellRenderer0.getAccessibleContext();
    org.jfree.ui.ApplicationFrame applicationFrame7 = new org.jfree.ui.ApplicationFrame("");
    int i8 = applicationFrame7.getState();
    java.awt.event.WindowEvent windowEvent9 = null;
    applicationFrame7.windowIconified(windowEvent9);
    org.jfree.date.SerialDate serialDate11 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel13 = new org.jfree.ui.SerialDateChooserPanel(serialDate11, true);
    serialDateChooserPanel13.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext18 = serialDateChooserPanel13.getAccessibleContext();
    java.awt.Dimension dimension19 = serialDateChooserPanel13.getPreferredSize();
    org.jfree.date.SerialDate serialDate21 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel23 = new org.jfree.ui.SerialDateChooserPanel(serialDate21, true);
    boolean b24 = serialDateChooserPanel23.getIgnoreRepaint();
    javax.swing.InputMap inputMap25 = serialDateChooserPanel23.getInputMap();
    serialDateChooserPanel13.setInputMap((int)(byte)1, inputMap25);
    java.awt.event.FocusListener[] focusListener_array27 = serialDateChooserPanel13.getFocusListeners();
    applicationFrame7.remove((java.awt.Component)serialDateChooserPanel13);
    java.awt.Dimension dimension29 = serialDateChooserPanel13.getPreferredSize();
    dateCellRenderer0.setPreferredSize(dimension29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension29);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest63.test05"); }

    org.jfree.text.TextLine textLine0 = new org.jfree.text.TextLine();
    org.jfree.text.TextFragment textFragment1 = textLine0.getFirstTextFragment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(textFragment1);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest63.test06"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    boolean b4 = applicationFrame1.isValidateRoot();
    org.jfree.date.SerialDate serialDate5 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel7 = new org.jfree.ui.SerialDateChooserPanel(serialDate5, true);
    boolean b8 = serialDateChooserPanel7.getIgnoreRepaint();
    javax.swing.InputMap inputMap9 = serialDateChooserPanel7.getInputMap();
    java.awt.Rectangle rectangle10 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle11 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b12 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle10, (java.awt.geom.Rectangle2D)rectangle11);
    java.awt.Rectangle rectangle13 = serialDateChooserPanel7.getBounds(rectangle11);
    org.jfree.date.SerialDate serialDate14 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel16 = new org.jfree.ui.SerialDateChooserPanel(serialDate14, true);
    boolean b17 = serialDateChooserPanel16.getIgnoreRepaint();
    java.awt.Rectangle rectangle18 = serialDateChooserPanel16.getVisibleRect();
    boolean b19 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle11, (java.awt.Shape)rectangle18);
    applicationFrame1.setMaximizedBounds(rectangle11);
    java.awt.event.KeyListener[] keyListener_array21 = applicationFrame1.getKeyListeners();
    java.awt.event.WindowEvent windowEvent22 = null;
    // The following exception was thrown during execution in test generation
    try {
    applicationFrame1.windowClosing(windowEvent22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyListener_array21);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest63.test07"); }

    java.awt.Insets insets0 = null;
    org.jfree.ui.InsetsChooserPanel insetsChooserPanel1 = new org.jfree.ui.InsetsChooserPanel(insets0);
    java.awt.Font font3 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.date.SerialDate serialDate4 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel6 = new org.jfree.ui.SerialDateChooserPanel(serialDate4, true);
    java.awt.Color color7 = serialDateChooserPanel6.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame9 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener10 = null;
    applicationFrame9.removeWindowStateListener(windowStateListener10);
    applicationFrame9.setCursor(0);
    org.jfree.date.SerialDate serialDate14 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel16 = new org.jfree.ui.SerialDateChooserPanel(serialDate14, true);
    java.awt.Color color17 = serialDateChooserPanel16.getForeground();
    applicationFrame9.setBackground(color17);
    boolean b19 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color7, (java.awt.Paint)color17);
    org.jfree.text.TextFragment textFragment20 = new org.jfree.text.TextFragment("ClassContext", font3, (java.awt.Paint)color17);
    insetsChooserPanel1.setFont(font3);
    org.jfree.ui.DateCellRenderer dateCellRenderer22 = new org.jfree.ui.DateCellRenderer();
    int i23 = dateCellRenderer22.getDisplayedMnemonic();
    java.lang.String str24 = dateCellRenderer22.getText();
    java.awt.ComponentOrientation componentOrientation25 = null;
    dateCellRenderer22.setComponentOrientation(componentOrientation25);
    org.jfree.date.SerialDate serialDate27 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel29 = new org.jfree.ui.SerialDateChooserPanel(serialDate27, true);
    boolean b30 = serialDateChooserPanel29.getIgnoreRepaint();
    boolean b31 = serialDateChooserPanel29.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array32 = serialDateChooserPanel29.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate33 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel35 = new org.jfree.ui.SerialDateChooserPanel(serialDate33, true);
    boolean b36 = serialDateChooserPanel35.getIgnoreRepaint();
    serialDateChooserPanel35.setAlignmentX((float)(byte)10);
    java.awt.Component component39 = serialDateChooserPanel29.add((java.awt.Component)serialDateChooserPanel35);
    org.jfree.date.SerialDate serialDate40 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel42 = new org.jfree.ui.SerialDateChooserPanel(serialDate40, true);
    java.awt.Color color43 = serialDateChooserPanel42.getForeground();
    component39.setForeground(color43);
    dateCellRenderer22.setForeground(color43);
    org.jfree.date.SerialDate serialDate49 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel51 = new org.jfree.ui.SerialDateChooserPanel(serialDate49, true);
    boolean b52 = serialDateChooserPanel51.getIgnoreRepaint();
    serialDateChooserPanel51.resize(8, (int)(short)-1);
    java.awt.Dimension dimension56 = serialDateChooserPanel51.getPreferredSize();
    java.lang.Exception exception58 = null;
    org.jfree.util.StackableRuntimeException stackableRuntimeException59 = new org.jfree.util.StackableRuntimeException("", exception58);
    org.jfree.util.Log.log((int)(byte)10, (java.lang.Object)dimension56, (java.lang.Exception)stackableRuntimeException59);
    org.jfree.util.Log.log((int)(byte)10, (java.lang.Object)(short)10, (java.lang.Exception)stackableRuntimeException59);
    org.jfree.util.Log.error((java.lang.Object)color43, (java.lang.Exception)stackableRuntimeException59);
    org.jfree.util.Log.debug((java.lang.Object)insetsChooserPanel1, (java.lang.Exception)stackableRuntimeException59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension56);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest63.test08"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b7 = serialDateChooserPanel2.isFocusTraversable();
    java.lang.Object obj8 = null;
    java.lang.Object obj9 = serialDateChooserPanel2.getClientProperty(obj8);
    boolean b10 = serialDateChooserPanel2.isFocusTraversable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest63.test09"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.util.Locale locale3 = applicationFrame1.getLocale();
    applicationFrame1.transferFocusUpCycle();
    java.awt.Graphics graphics5 = null;
    applicationFrame1.update(graphics5);
    boolean b7 = applicationFrame1.isAlwaysOnTopSupported();
    applicationFrame1.show();
    applicationFrame1.setResizable(true);
    org.jfree.ui.DateCellRenderer dateCellRenderer11 = new org.jfree.ui.DateCellRenderer();
    int i12 = dateCellRenderer11.getDisplayedMnemonic();
    dateCellRenderer11.validate();
    org.jfree.date.SerialDate serialDate14 = null;
    org.jfree.date.SerialDate serialDate16 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel18 = new org.jfree.ui.SerialDateChooserPanel(serialDate16, true);
    java.awt.Color color19 = serialDateChooserPanel18.getForeground();
    org.jfree.date.SerialDate serialDate20 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel22 = new org.jfree.ui.SerialDateChooserPanel(serialDate20, true);
    java.awt.Color color23 = serialDateChooserPanel22.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame25 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener26 = null;
    applicationFrame25.removeWindowStateListener(windowStateListener26);
    applicationFrame25.setCursor(0);
    org.jfree.date.SerialDate serialDate30 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel32 = new org.jfree.ui.SerialDateChooserPanel(serialDate30, true);
    java.awt.Color color33 = serialDateChooserPanel32.getForeground();
    applicationFrame25.setBackground(color33);
    boolean b35 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color23, (java.awt.Paint)color33);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel36 = new org.jfree.ui.SerialDateChooserPanel(serialDate14, false, color19, color33);
    dateCellRenderer11.setBackground(color33);
    org.jfree.date.SerialDate serialDate38 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel40 = new org.jfree.ui.SerialDateChooserPanel(serialDate38, true);
    serialDateChooserPanel40.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext45 = serialDateChooserPanel40.getAccessibleContext();
    serialDateChooserPanel40.enableInputMethods(true);
    java.lang.String str48 = serialDateChooserPanel40.getToolTipText();
    java.awt.event.ContainerListener containerListener49 = null;
    serialDateChooserPanel40.addContainerListener(containerListener49);
    org.jfree.date.SerialDate serialDate51 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel53 = new org.jfree.ui.SerialDateChooserPanel(serialDate51, true);
    java.awt.Color color54 = serialDateChooserPanel53.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame56 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener57 = null;
    applicationFrame56.removeWindowStateListener(windowStateListener57);
    applicationFrame56.setCursor(0);
    org.jfree.date.SerialDate serialDate61 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel63 = new org.jfree.ui.SerialDateChooserPanel(serialDate61, true);
    java.awt.Color color64 = serialDateChooserPanel63.getForeground();
    applicationFrame56.setBackground(color64);
    boolean b66 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color54, (java.awt.Paint)color64);
    serialDateChooserPanel40.setBackground(color54);
    org.jfree.ui.DateCellRenderer dateCellRenderer68 = new org.jfree.ui.DateCellRenderer();
    int i69 = dateCellRenderer68.getDisplayedMnemonic();
    dateCellRenderer68.validate();
    org.jfree.date.SerialDate serialDate71 = null;
    org.jfree.date.SerialDate serialDate73 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel75 = new org.jfree.ui.SerialDateChooserPanel(serialDate73, true);
    java.awt.Color color76 = serialDateChooserPanel75.getForeground();
    org.jfree.date.SerialDate serialDate77 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel79 = new org.jfree.ui.SerialDateChooserPanel(serialDate77, true);
    java.awt.Color color80 = serialDateChooserPanel79.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame82 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener83 = null;
    applicationFrame82.removeWindowStateListener(windowStateListener83);
    applicationFrame82.setCursor(0);
    org.jfree.date.SerialDate serialDate87 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel89 = new org.jfree.ui.SerialDateChooserPanel(serialDate87, true);
    java.awt.Color color90 = serialDateChooserPanel89.getForeground();
    applicationFrame82.setBackground(color90);
    boolean b92 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color80, (java.awt.Paint)color90);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel93 = new org.jfree.ui.SerialDateChooserPanel(serialDate71, false, color76, color90);
    dateCellRenderer68.setBackground(color90);
    org.jfree.ui.BevelArrowIcon bevelArrowIcon97 = new org.jfree.ui.BevelArrowIcon(color33, color54, color90, 9999, 11);
    applicationFrame1.setBackground(color54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest63.test10"); }

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
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior28 = applicationFrame1.getBaselineResizeBehavior();
    applicationFrame1.setExtendedState(3);
    // The following exception was thrown during execution in test generation
    try {
    applicationFrame1.applyResourceBundle("black");
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
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
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior28 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior28.equals(java.awt.Component.BaselineResizeBehavior.OTHER));

  }

}
