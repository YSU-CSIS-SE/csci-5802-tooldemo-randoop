
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest91 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest91.test01"); }

    org.jfree.ui.DateChooserPanel dateChooserPanel0 = new org.jfree.ui.DateChooserPanel();
    java.util.Date date1 = dateChooserPanel0.getDate();
    org.jfree.date.SerialDate serialDate2 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel4 = new org.jfree.ui.SerialDateChooserPanel(serialDate2, true);
    java.awt.Color color5 = serialDateChooserPanel4.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame7 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener8 = null;
    applicationFrame7.removeWindowStateListener(windowStateListener8);
    applicationFrame7.setCursor(0);
    org.jfree.date.SerialDate serialDate12 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel14 = new org.jfree.ui.SerialDateChooserPanel(serialDate12, true);
    java.awt.Color color15 = serialDateChooserPanel14.getForeground();
    applicationFrame7.setBackground(color15);
    boolean b17 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color5, (java.awt.Paint)color15);
    dateChooserPanel0.setChosenMonthButtonColor(color15);
    org.jfree.ui.DateCellRenderer dateCellRenderer19 = new org.jfree.ui.DateCellRenderer();
    int i20 = dateCellRenderer19.getDisplayedMnemonic();
    java.lang.String str21 = dateCellRenderer19.getText();
    java.awt.ComponentOrientation componentOrientation22 = null;
    dateCellRenderer19.setComponentOrientation(componentOrientation22);
    org.jfree.ui.DateCellRenderer dateCellRenderer24 = new org.jfree.ui.DateCellRenderer();
    int i25 = dateCellRenderer24.getDisplayedMnemonic();
    java.lang.String str26 = dateCellRenderer24.getText();
    java.awt.ComponentOrientation componentOrientation27 = null;
    dateCellRenderer24.setComponentOrientation(componentOrientation27);
    org.jfree.date.SerialDate serialDate29 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel31 = new org.jfree.ui.SerialDateChooserPanel(serialDate29, true);
    boolean b32 = serialDateChooserPanel31.getIgnoreRepaint();
    boolean b33 = serialDateChooserPanel31.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array34 = serialDateChooserPanel31.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate35 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel37 = new org.jfree.ui.SerialDateChooserPanel(serialDate35, true);
    boolean b38 = serialDateChooserPanel37.getIgnoreRepaint();
    serialDateChooserPanel37.setAlignmentX((float)(byte)10);
    java.awt.Component component41 = serialDateChooserPanel31.add((java.awt.Component)serialDateChooserPanel37);
    org.jfree.date.SerialDate serialDate42 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel44 = new org.jfree.ui.SerialDateChooserPanel(serialDate42, true);
    java.awt.Color color45 = serialDateChooserPanel44.getForeground();
    component41.setForeground(color45);
    dateCellRenderer24.setForeground(color45);
    dateCellRenderer19.setForeground(color45);
    dateChooserPanel0.setChosenDateButtonColor(color45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color45);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest91.test02"); }

    org.jfree.util.Log log0 = org.jfree.util.Log.getInstance();
    org.jfree.util.PrintStreamLogTarget printStreamLogTarget1 = new org.jfree.util.PrintStreamLogTarget();
    org.jfree.date.SerialDate serialDate3 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel5 = new org.jfree.ui.SerialDateChooserPanel(serialDate3, true);
    boolean b6 = serialDateChooserPanel5.getIgnoreRepaint();
    javax.swing.InputMap inputMap7 = serialDateChooserPanel5.getInputMap();
    javax.swing.TransferHandler transferHandler8 = null;
    serialDateChooserPanel5.setTransferHandler(transferHandler8);
    javax.swing.plaf.PanelUI panelUI10 = null;
    serialDateChooserPanel5.setUI(panelUI10);
    java.beans.VetoableChangeListener[] vetoableChangeListener_array12 = serialDateChooserPanel5.getVetoableChangeListeners();
    javax.swing.ActionMap actionMap13 = serialDateChooserPanel5.getActionMap();
    org.jfree.text.TextBlock textBlock15 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D16 = null;
    org.jfree.text.TextBlock textBlock19 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D20 = null;
    org.jfree.text.TextBlockAnchor textBlockAnchor23 = org.jfree.text.TextBlockAnchor.TOP_RIGHT;
    java.awt.Shape shape27 = textBlock19.calculateBounds(graphics2D20, (float)12, (float)(short)-1, textBlockAnchor23, (float)' ', (float)32, (double)(-1.0f));
    textBlock15.draw(graphics2D16, (float)5, (float)(short)1, textBlockAnchor23, (float)(short)-1, (float)(short)100, (double)1.0f);
    org.jfree.util.StrokeList strokeList32 = new org.jfree.util.StrokeList();
    boolean b33 = textBlock15.equals((java.lang.Object)strokeList32);
    org.jfree.util.LogContext logContext35 = new org.jfree.util.LogContext("NO_CHANGE");
    java.lang.Object obj36 = null;
    java.lang.Exception exception38 = null;
    org.jfree.util.StackableRuntimeException stackableRuntimeException39 = new org.jfree.util.StackableRuntimeException("", exception38);
    java.lang.Exception exception40 = stackableRuntimeException39.getParent();
    logContext35.info(obj36, (java.lang.Exception)stackableRuntimeException39);
    org.jfree.util.Log.error((java.lang.Object)b33, (java.lang.Exception)stackableRuntimeException39);
    org.jfree.util.StackableRuntimeException stackableRuntimeException43 = new org.jfree.util.StackableRuntimeException("ToolTipText", (java.lang.Exception)stackableRuntimeException39);
    printStreamLogTarget1.log((int)(short)10, (java.lang.Object)actionMap13, (java.lang.Exception)stackableRuntimeException43);
    log0.replaceTargets((org.jfree.util.LogTarget)printStreamLogTarget1);
    log0.init();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(log0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(actionMap13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(exception40);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest91.test03"); }

    org.jfree.date.SerialDate serialDate1 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel3 = new org.jfree.ui.SerialDateChooserPanel(serialDate1, true);
    boolean b4 = serialDateChooserPanel3.getIgnoreRepaint();
    serialDateChooserPanel3.resize(8, (int)(short)-1);
    java.awt.Dimension dimension8 = serialDateChooserPanel3.getPreferredSize();
    java.lang.Exception exception10 = null;
    org.jfree.util.StackableRuntimeException stackableRuntimeException11 = new org.jfree.util.StackableRuntimeException("", exception10);
    org.jfree.util.Log.log((int)(byte)10, (java.lang.Object)dimension8, (java.lang.Exception)stackableRuntimeException11);
    java.lang.Throwable[] throwable_array13 = stackableRuntimeException11.getSuppressed();
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
    javax.accessibility.AccessibleContext accessibleContext35 = applicationFrame15.getAccessibleContext();
    java.awt.event.WindowEvent windowEvent36 = null;
    applicationFrame15.windowDeiconified(windowEvent36);
    java.awt.event.FocusListener[] focusListener_array38 = applicationFrame15.getFocusListeners();
    org.jfree.ui.KeyedComboBoxModel keyedComboBoxModel39 = new org.jfree.ui.KeyedComboBoxModel((java.lang.Object[])throwable_array13, (java.lang.Object[])focusListener_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array13);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array38);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest91.test04"); }

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
    dateCellRenderer9.firePropertyChange("section", true, false);
    dateCellRenderer9.firePropertyChange("LabelUI", false, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon14);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest91.test05"); }

    java.lang.Class class1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.net.URL uRL2 = org.jfree.util.ObjectUtilities.getResource("section", class1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest91.test06"); }

    javax.swing.text.Keymap keymap0 = null;
    javax.swing.text.JTextComponent.KeyBinding[] keyBinding_array1 = new javax.swing.text.JTextComponent.KeyBinding[] {  };
    javax.swing.Action action2 = null;
    javax.swing.Action[] action_array3 = new javax.swing.Action[] { action2 };
    // The following exception was thrown during execution in test generation
    try {
    javax.swing.text.JTextComponent.loadKeymap(keymap0, keyBinding_array1, action_array3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyBinding_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(action_array3);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest91.test07"); }

    org.jfree.util.SortOrder sortOrder0 = org.jfree.util.SortOrder.ASCENDING;
    java.lang.String str1 = sortOrder0.toString();
    java.lang.String str2 = sortOrder0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortOrder0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SortOrder.ASCENDING"+ "'", str1.equals("SortOrder.ASCENDING"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "SortOrder.ASCENDING"+ "'", str2.equals("SortOrder.ASCENDING"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest91.test08"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    java.awt.Point point4 = serialDateChooserPanel2.getMousePosition(false);
    org.jfree.ui.ApplicationFrame applicationFrame6 = new org.jfree.ui.ApplicationFrame("");
    java.awt.Rectangle rectangle7 = applicationFrame6.getMaximizedBounds();
    org.jfree.ui.ApplicationFrame applicationFrame9 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent10 = null;
    applicationFrame9.windowDeiconified(windowEvent10);
    applicationFrame9.firePropertyChange("hi!", '#', '4');
    java.awt.FocusTraversalPolicy focusTraversalPolicy16 = applicationFrame9.getFocusTraversalPolicy();
    applicationFrame6.setFocusTraversalPolicy(focusTraversalPolicy16);
    java.awt.MenuBar menuBar18 = applicationFrame6.getMenuBar();
    boolean b19 = serialDateChooserPanel2.isAncestorOf((java.awt.Component)applicationFrame6);
    java.awt.Graphics graphics20 = null;
    serialDateChooserPanel2.printComponents(graphics20);
    java.beans.VetoableChangeListener[] vetoableChangeListener_array22 = serialDateChooserPanel2.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusTraversalPolicy16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array22);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest91.test09"); }

    java.lang.Class class1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.net.URL uRL2 = org.jfree.util.ObjectUtilities.getResourceRelative("RectangleAnchor.TOP_LEFT", class1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest91.test10"); }

    org.jfree.JCommonInfo jCommonInfo0 = org.jfree.JCommonInfo.getInstance();
    org.jfree.base.BootableProjectInfo bootableProjectInfo6 = new org.jfree.base.BootableProjectInfo("hi!", "hi!", "content", "PanelUI", "");
    jCommonInfo0.addOptionalLibrary((org.jfree.base.Library)bootableProjectInfo6);
    java.util.List list8 = jCommonInfo0.getContributors();
    jCommonInfo0.setLicenceText("ClassContext");
    jCommonInfo0.setAutoBoot(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jCommonInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);

  }

}
