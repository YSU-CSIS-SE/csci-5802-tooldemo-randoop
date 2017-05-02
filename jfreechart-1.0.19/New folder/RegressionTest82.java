
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest82 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest82.test01"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    dateCellRenderer0.setIconTextGap(5);
    dateCellRenderer0.validate();
    dateCellRenderer0.setToolTipText("Jan");
    javax.swing.KeyStroke keyStroke6 = null;
    java.awt.event.ActionListener actionListener7 = dateCellRenderer0.getActionForKeyStroke(keyStroke6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(actionListener7);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest82.test02"); }

    java.lang.String str0 = javax.swing.text.JTextComponent.DEFAULT_KEYMAP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "default"+ "'", str0.equals("default"));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest82.test03"); }

    org.jfree.util.BooleanList booleanList0 = new org.jfree.util.BooleanList();
    booleanList0.setBoolean(31, (java.lang.Boolean)false);
    org.jfree.resources.JCommonResources jCommonResources4 = new org.jfree.resources.JCommonResources();
    java.util.Locale locale5 = jCommonResources4.getLocale();
    boolean b6 = booleanList0.equals((java.lang.Object)jCommonResources4);
    org.jfree.util.ResourceBundleSupport resourceBundleSupport7 = new org.jfree.util.ResourceBundleSupport((java.util.ResourceBundle)jCommonResources4);
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
    boolean b22 = serialDateChooserPanel17.isCursorSet();
    java.awt.Rectangle rectangle23 = serialDateChooserPanel17.bounds();
    org.jfree.util.LineBreakIterator lineBreakIterator24 = new org.jfree.util.LineBreakIterator();
    java.lang.String str25 = lineBreakIterator24.getText();
    boolean b26 = lineBreakIterator24.hasNext();
    org.jfree.util.ReadOnlyIterator readOnlyIterator27 = new org.jfree.util.ReadOnlyIterator((java.util.Iterator)lineBreakIterator24);
    int i28 = lineBreakIterator24.nextWithEnd();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str29 = resourceBundleSupport7.formatMessage("TableOrder.BY_COLUMN", (java.lang.Object)serialDateChooserPanel17, (java.lang.Object)lineBreakIterator24);
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
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
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest82.test04"); }

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
    java.awt.MenuBar menuBar29 = null;
    applicationFrame1.setMenuBar(menuBar29);
    java.awt.Event event31 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b32 = applicationFrame1.postEvent(event31);
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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest82.test05"); }

    org.jfree.util.ObjectUtilities.setClassLoaderSource("Size2D[width=100.0, height=0.0]");

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest82.test06"); }

    org.jfree.util.ObjectTable objectTable1 = new org.jfree.util.ObjectTable((int)' ');
    org.jfree.util.SortOrder sortOrder2 = org.jfree.util.SortOrder.ASCENDING;
    java.lang.String str3 = sortOrder2.toString();
    boolean b4 = objectTable1.equals((java.lang.Object)str3);
    int i5 = objectTable1.getColumnCount();
    int i6 = objectTable1.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortOrder2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "SortOrder.ASCENDING"+ "'", str3.equals("SortOrder.ASCENDING"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest82.test07"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.util.Locale locale3 = applicationFrame1.getLocale();
    applicationFrame1.transferFocusUpCycle();
    java.awt.Graphics graphics5 = null;
    applicationFrame1.update(graphics5);
    java.awt.Cursor cursor7 = applicationFrame1.getCursor();
    java.awt.Dialog.ModalExclusionType modalExclusionType8 = applicationFrame1.getModalExclusionType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor7);
    org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest82.test08"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b7 = serialDateChooserPanel2.isFocusTraversable();
    java.lang.Object obj8 = null;
    java.lang.Object obj9 = serialDateChooserPanel2.getClientProperty(obj8);
    serialDateChooserPanel2.setEnabled(false);
    int i14 = serialDateChooserPanel2.getBaseline(100, (int)(short)10);
    java.awt.image.ColorModel colorModel15 = serialDateChooserPanel2.getColorModel();
    serialDateChooserPanel2.resetKeyboardActions();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel15);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest82.test09"); }

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
    dateCellRenderer9.setIconTextGap(15);
    dateCellRenderer9.updateUI();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array27 = dateCellRenderer9.getVetoableChangeListeners();
    org.jfree.date.SerialDate serialDate28 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel30 = new org.jfree.ui.SerialDateChooserPanel(serialDate28, true);
    java.awt.Color color31 = serialDateChooserPanel30.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame33 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener34 = null;
    applicationFrame33.removeWindowStateListener(windowStateListener34);
    applicationFrame33.setCursor(0);
    org.jfree.date.SerialDate serialDate38 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel40 = new org.jfree.ui.SerialDateChooserPanel(serialDate38, true);
    java.awt.Color color41 = serialDateChooserPanel40.getForeground();
    applicationFrame33.setBackground(color41);
    boolean b43 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color31, (java.awt.Paint)color41);
    org.jfree.ui.RectangleAnchor rectangleAnchor44 = org.jfree.ui.RectangleAnchor.BOTTOM_RIGHT;
    org.jfree.ui.DateCellRenderer dateCellRenderer45 = new org.jfree.ui.DateCellRenderer();
    int i46 = dateCellRenderer45.getDisplayedMnemonic();
    java.lang.String str47 = dateCellRenderer45.getText();
    java.awt.ComponentOrientation componentOrientation48 = null;
    dateCellRenderer45.setComponentOrientation(componentOrientation48);
    org.jfree.ui.DateCellRenderer dateCellRenderer50 = new org.jfree.ui.DateCellRenderer();
    int i51 = dateCellRenderer50.getDisplayedMnemonic();
    java.lang.String str52 = dateCellRenderer50.getText();
    java.awt.ComponentOrientation componentOrientation53 = null;
    dateCellRenderer50.setComponentOrientation(componentOrientation53);
    org.jfree.date.SerialDate serialDate55 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel57 = new org.jfree.ui.SerialDateChooserPanel(serialDate55, true);
    boolean b58 = serialDateChooserPanel57.getIgnoreRepaint();
    boolean b59 = serialDateChooserPanel57.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array60 = serialDateChooserPanel57.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate61 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel63 = new org.jfree.ui.SerialDateChooserPanel(serialDate61, true);
    boolean b64 = serialDateChooserPanel63.getIgnoreRepaint();
    serialDateChooserPanel63.setAlignmentX((float)(byte)10);
    java.awt.Component component67 = serialDateChooserPanel57.add((java.awt.Component)serialDateChooserPanel63);
    org.jfree.date.SerialDate serialDate68 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel70 = new org.jfree.ui.SerialDateChooserPanel(serialDate68, true);
    java.awt.Color color71 = serialDateChooserPanel70.getForeground();
    component67.setForeground(color71);
    dateCellRenderer50.setForeground(color71);
    dateCellRenderer45.setForeground(color71);
    boolean b75 = rectangleAnchor44.equals((java.lang.Object)color71);
    org.jfree.date.SerialDate serialDate76 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel78 = new org.jfree.ui.SerialDateChooserPanel(serialDate76, true);
    java.awt.Color color79 = serialDateChooserPanel78.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame81 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener82 = null;
    applicationFrame81.removeWindowStateListener(windowStateListener82);
    applicationFrame81.setCursor(0);
    org.jfree.date.SerialDate serialDate86 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel88 = new org.jfree.ui.SerialDateChooserPanel(serialDate86, true);
    java.awt.Color color89 = serialDateChooserPanel88.getForeground();
    applicationFrame81.setBackground(color89);
    boolean b91 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color79, (java.awt.Paint)color89);
    org.jfree.ui.BevelArrowIcon bevelArrowIcon94 = new org.jfree.ui.BevelArrowIcon(color41, color71, color89, (int)(short)100, 9);
    int i95 = bevelArrowIcon94.getIconHeight();
    dateCellRenderer9.setDisabledIcon((javax.swing.Icon)bevelArrowIcon94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleAnchor44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + ""+ "'", str47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + ""+ "'", str52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 100);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest82.test10"); }

    org.jfree.ui.DrawablePanel drawablePanel0 = new org.jfree.ui.DrawablePanel();
    java.awt.Dimension dimension1 = drawablePanel0.getMinimumSize();
    boolean b2 = drawablePanel0.isOpaque();
    java.awt.event.ContainerListener containerListener3 = null;
    drawablePanel0.removeContainerListener(containerListener3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

}
