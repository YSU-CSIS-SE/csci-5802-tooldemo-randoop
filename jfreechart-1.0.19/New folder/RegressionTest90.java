
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest90 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest90.test01"); }

    org.jfree.ui.about.ProjectInfo projectInfo0 = org.jfree.JCommon.INFO;
    projectInfo0.setLicenceText("ToolTipText");
    java.lang.String str3 = projectInfo0.getCopyright();
    org.jfree.base.BootableProjectInfo bootableProjectInfo4 = new org.jfree.base.BootableProjectInfo();
    bootableProjectInfo4.setInfo("hi!");
    projectInfo0.addOptionalLibrary((org.jfree.base.Library)bootableProjectInfo4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(projectInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest90.test02"); }

    javax.swing.text.Keymap keymap1 = javax.swing.text.JTextComponent.removeKeymap("NO_CHANGE");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(keymap1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest90.test03"); }

    org.jfree.util.ObjectUtilities.setClassLoaderSource("5-January-1900");

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest90.test04"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    java.awt.Dimension dimension8 = serialDateChooserPanel2.getPreferredSize();
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel12 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    boolean b13 = serialDateChooserPanel12.getIgnoreRepaint();
    javax.swing.InputMap inputMap14 = serialDateChooserPanel12.getInputMap();
    serialDateChooserPanel2.setInputMap((int)(byte)1, inputMap14);
    java.awt.event.FocusListener[] focusListener_array16 = serialDateChooserPanel2.getFocusListeners();
    org.jfree.ui.ApplicationFrame applicationFrame18 = new org.jfree.ui.ApplicationFrame("");
    int i19 = applicationFrame18.getState();
    java.awt.event.WindowEvent windowEvent20 = null;
    applicationFrame18.windowIconified(windowEvent20);
    applicationFrame18.show();
    javax.swing.JMenuBar jMenuBar23 = applicationFrame18.getJMenuBar();
    java.awt.event.WindowStateListener[] windowStateListener_array24 = applicationFrame18.getWindowStateListeners();
    org.jfree.ui.KeyedComboBoxModel keyedComboBoxModel25 = new org.jfree.ui.KeyedComboBoxModel((java.lang.Object[])focusListener_array16, (java.lang.Object[])windowStateListener_array24);
    java.lang.Object obj27 = keyedComboBoxModel25.getElementAt((int)' ');
    java.lang.Object obj29 = keyedComboBoxModel25.getKeyAt(11);
    int[] i_array35 = new int[] { (byte)100, 4, 6, (-1) };
    org.jfree.layout.FormatLayout formatLayout36 = new org.jfree.layout.FormatLayout((int)'#', i_array35);
    org.jfree.ui.DateCellRenderer dateCellRenderer38 = new org.jfree.ui.DateCellRenderer();
    int i39 = dateCellRenderer38.getDisplayedMnemonic();
    dateCellRenderer38.validate();
    org.jfree.date.SerialDate serialDate41 = null;
    org.jfree.date.SerialDate serialDate43 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel45 = new org.jfree.ui.SerialDateChooserPanel(serialDate43, true);
    java.awt.Color color46 = serialDateChooserPanel45.getForeground();
    org.jfree.date.SerialDate serialDate47 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel49 = new org.jfree.ui.SerialDateChooserPanel(serialDate47, true);
    java.awt.Color color50 = serialDateChooserPanel49.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame52 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener53 = null;
    applicationFrame52.removeWindowStateListener(windowStateListener53);
    applicationFrame52.setCursor(0);
    org.jfree.date.SerialDate serialDate57 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel59 = new org.jfree.ui.SerialDateChooserPanel(serialDate57, true);
    java.awt.Color color60 = serialDateChooserPanel59.getForeground();
    applicationFrame52.setBackground(color60);
    boolean b62 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color50, (java.awt.Paint)color60);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel63 = new org.jfree.ui.SerialDateChooserPanel(serialDate41, false, color46, color60);
    dateCellRenderer38.setBackground(color60);
    javax.swing.Icon icon65 = dateCellRenderer38.getIcon();
    org.jfree.ui.ApplicationFrame applicationFrame67 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent68 = null;
    applicationFrame67.windowDeiconified(windowEvent68);
    java.awt.LayoutManager layoutManager70 = null;
    applicationFrame67.setLayout(layoutManager70);
    java.beans.PropertyChangeListener propertyChangeListener72 = null;
    applicationFrame67.removePropertyChangeListener(propertyChangeListener72);
    java.awt.Image image74 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer75 = new org.jfree.ui.DateCellRenderer();
    int i76 = dateCellRenderer75.getDisplayedMnemonic();
    dateCellRenderer75.validate();
    int i78 = applicationFrame67.checkImage(image74, (java.awt.image.ImageObserver)dateCellRenderer75);
    org.jfree.ui.BevelArrowIcon bevelArrowIcon82 = new org.jfree.ui.BevelArrowIcon((int)'4', true, false);
    dateCellRenderer75.setIcon((javax.swing.Icon)bevelArrowIcon82);
    dateCellRenderer38.setIcon((javax.swing.Icon)bevelArrowIcon82);
    javax.swing.Icon icon85 = dateCellRenderer38.getIcon();
    javax.swing.Icon icon86 = dateCellRenderer38.getDisabledIcon();
    formatLayout36.addLayoutComponent("Size2D[width=100.0, height=0.0]", (java.awt.Component)dateCellRenderer38);
    formatLayout36.complete();
    keyedComboBoxModel25.removeDataElement((java.lang.Object)formatLayout36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowStateListener_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(icon85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon86);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest90.test05"); }

    java.lang.Object obj0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj1 = org.jfree.util.ObjectUtilities.clone(obj0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest90.test06"); }

    org.jfree.util.BooleanList booleanList0 = new org.jfree.util.BooleanList();
    booleanList0.setBoolean(31, (java.lang.Boolean)false);
    org.jfree.resources.JCommonResources jCommonResources4 = new org.jfree.resources.JCommonResources();
    java.util.Locale locale5 = jCommonResources4.getLocale();
    boolean b6 = booleanList0.equals((java.lang.Object)jCommonResources4);
    org.jfree.util.ResourceBundleSupport resourceBundleSupport7 = new org.jfree.util.ResourceBundleSupport((java.util.ResourceBundle)jCommonResources4);
    // The following exception was thrown during execution in test generation
    try {
    javax.swing.JMenu jMenu9 = resourceBundleSupport7.createMenu("title");
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest90.test07"); }

    int[] i_array5 = new int[] { (byte)100, 4, 6, (-1) };
    org.jfree.layout.FormatLayout formatLayout6 = new org.jfree.layout.FormatLayout((int)'#', i_array5);
    org.jfree.ui.ApplicationFrame applicationFrame9 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener10 = null;
    applicationFrame9.removeWindowStateListener(windowStateListener10);
    java.awt.Cursor cursor12 = null;
    applicationFrame9.setCursor(cursor12);
    java.awt.Image image14 = null;
    boolean b20 = applicationFrame9.imageUpdate(image14, (int)'4', (int)(short)1, 8, (int)(byte)100, (int)'#');
    formatLayout6.removeLayoutComponent("notify-field-accept", (java.awt.Component)applicationFrame9);
    applicationFrame9.setState((int)(short)1);
    java.awt.Image image24 = null;
    applicationFrame9.setIconImage(image24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest90.test08"); }

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
    boolean b13 = serialDateChooserPanel8.isCursorSet();
    java.awt.Rectangle rectangle14 = serialDateChooserPanel8.bounds();
    java.awt.im.InputMethodRequests inputMethodRequests15 = serialDateChooserPanel8.getInputMethodRequests();
    org.jfree.ui.ApplicationFrame applicationFrame17 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener18 = null;
    applicationFrame17.removeWindowStateListener(windowStateListener18);
    java.awt.Cursor cursor20 = null;
    applicationFrame17.setCursor(cursor20);
    serialDateChooserPanel8.setNextFocusableComponent((java.awt.Component)applicationFrame17);
    java.awt.event.ComponentListener[] componentListener_array23 = serialDateChooserPanel8.getComponentListeners();
    
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
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array23);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest90.test09"); }

    org.jfree.util.ObjectTable objectTable2 = new org.jfree.util.ObjectTable(12, 6);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest90.test10"); }

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
    javax.accessibility.AccessibleContext accessibleContext12 = serialDateChooserPanel2.getAccessibleContext();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array13 = serialDateChooserPanel2.getMouseMotionListeners();
    org.jfree.ui.ApplicationFrame applicationFrame15 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener16 = null;
    applicationFrame15.removeWindowStateListener(windowStateListener16);
    boolean b18 = applicationFrame15.isValidateRoot();
    org.jfree.date.SerialDate serialDate19 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel21 = new org.jfree.ui.SerialDateChooserPanel(serialDate19, true);
    boolean b22 = serialDateChooserPanel21.getIgnoreRepaint();
    javax.swing.InputMap inputMap23 = serialDateChooserPanel21.getInputMap();
    java.awt.Rectangle rectangle24 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle25 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b26 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle24, (java.awt.geom.Rectangle2D)rectangle25);
    java.awt.Rectangle rectangle27 = serialDateChooserPanel21.getBounds(rectangle25);
    org.jfree.date.SerialDate serialDate28 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel30 = new org.jfree.ui.SerialDateChooserPanel(serialDate28, true);
    boolean b31 = serialDateChooserPanel30.getIgnoreRepaint();
    java.awt.Rectangle rectangle32 = serialDateChooserPanel30.getVisibleRect();
    boolean b33 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle25, (java.awt.Shape)rectangle32);
    applicationFrame15.setMaximizedBounds(rectangle25);
    serialDateChooserPanel2.repaint(rectangle25);
    
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
    org.junit.Assert.assertNotNull(accessibleContext12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

}
