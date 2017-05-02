
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest83 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest83.test01"); }

    org.jfree.date.AnnualDateRule annualDateRule0 = null;
    org.jfree.date.RelativeDayOfWeekRule relativeDayOfWeekRule3 = new org.jfree.date.RelativeDayOfWeekRule(annualDateRule0, 8, (int)'a');

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest83.test02"); }

    org.jfree.util.PrintStreamLogTarget printStreamLogTarget0 = new org.jfree.util.PrintStreamLogTarget();
    org.jfree.date.SerialDate serialDate2 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel4 = new org.jfree.ui.SerialDateChooserPanel(serialDate2, true);
    boolean b5 = serialDateChooserPanel4.getIgnoreRepaint();
    javax.swing.InputMap inputMap6 = serialDateChooserPanel4.getInputMap();
    javax.swing.TransferHandler transferHandler7 = null;
    serialDateChooserPanel4.setTransferHandler(transferHandler7);
    javax.swing.plaf.PanelUI panelUI9 = null;
    serialDateChooserPanel4.setUI(panelUI9);
    java.beans.VetoableChangeListener[] vetoableChangeListener_array11 = serialDateChooserPanel4.getVetoableChangeListeners();
    javax.swing.ActionMap actionMap12 = serialDateChooserPanel4.getActionMap();
    org.jfree.text.TextBlock textBlock14 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D15 = null;
    org.jfree.text.TextBlock textBlock18 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D19 = null;
    org.jfree.text.TextBlockAnchor textBlockAnchor22 = org.jfree.text.TextBlockAnchor.TOP_RIGHT;
    java.awt.Shape shape26 = textBlock18.calculateBounds(graphics2D19, (float)12, (float)(short)-1, textBlockAnchor22, (float)' ', (float)32, (double)(-1.0f));
    textBlock14.draw(graphics2D15, (float)5, (float)(short)1, textBlockAnchor22, (float)(short)-1, (float)(short)100, (double)1.0f);
    org.jfree.util.StrokeList strokeList31 = new org.jfree.util.StrokeList();
    boolean b32 = textBlock14.equals((java.lang.Object)strokeList31);
    org.jfree.util.LogContext logContext34 = new org.jfree.util.LogContext("NO_CHANGE");
    java.lang.Object obj35 = null;
    java.lang.Exception exception37 = null;
    org.jfree.util.StackableRuntimeException stackableRuntimeException38 = new org.jfree.util.StackableRuntimeException("", exception37);
    java.lang.Exception exception39 = stackableRuntimeException38.getParent();
    logContext34.info(obj35, (java.lang.Exception)stackableRuntimeException38);
    org.jfree.util.Log.error((java.lang.Object)b32, (java.lang.Exception)stackableRuntimeException38);
    org.jfree.util.StackableRuntimeException stackableRuntimeException42 = new org.jfree.util.StackableRuntimeException("ToolTipText", (java.lang.Exception)stackableRuntimeException38);
    printStreamLogTarget0.log((int)(short)10, (java.lang.Object)actionMap12, (java.lang.Exception)stackableRuntimeException42);
    java.lang.Throwable[] throwable_array44 = stackableRuntimeException42.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(actionMap12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(exception39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array44);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest83.test03"); }

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
    int i30 = keyedComboBoxModel25.getSize();
    org.jfree.date.SerialDate serialDate31 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel33 = new org.jfree.ui.SerialDateChooserPanel(serialDate31, true);
    boolean b34 = serialDateChooserPanel33.getIgnoreRepaint();
    boolean b35 = serialDateChooserPanel33.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array36 = serialDateChooserPanel33.getPropertyChangeListeners();
    javax.swing.InputMap inputMap37 = serialDateChooserPanel33.getInputMap();
    boolean b38 = serialDateChooserPanel33.isDoubleBuffered();
    java.awt.event.MouseListener[] mouseListener_array39 = serialDateChooserPanel33.getMouseListeners();
    float[] f_array42 = new float[] { 0.0f, 1.0f };
    float[] f_array45 = new float[] { 0.0f, 1.0f };
    float[] f_array48 = new float[] { 0.0f, 1.0f };
    float[] f_array51 = new float[] { 0.0f, 1.0f };
    float[] f_array54 = new float[] { 0.0f, 1.0f };
    float[][] f_array_array55 = new float[][] { f_array42, f_array45, f_array48, f_array51, f_array54 };
    float[][] f_array_array56 = org.jfree.util.ArrayUtilities.clone(f_array_array55);
    // The following exception was thrown during execution in test generation
    try {
    keyedComboBoxModel25.setData((java.lang.Object[])mouseListener_array39, (java.lang.Object[])f_array_array55);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseListener_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array_array56);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest83.test04"); }

    org.jfree.date.SpreadsheetDate spreadsheetDate1 = new org.jfree.date.SpreadsheetDate(16);
    java.util.Date date2 = spreadsheetDate1.toDate();
    int i3 = spreadsheetDate1.getDayOfWeek();
    java.util.Date date4 = spreadsheetDate1.toDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date4);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest83.test05"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    boolean b4 = applicationFrame1.isValidateRoot();
    applicationFrame1.doLayout();
    boolean b6 = applicationFrame1.getFocusTraversalKeysEnabled();
    boolean b7 = applicationFrame1.isAlwaysOnTop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest83.test06"); }

    org.jfree.util.BooleanList booleanList0 = new org.jfree.util.BooleanList();
    booleanList0.setBoolean(31, (java.lang.Boolean)false);
    org.jfree.resources.JCommonResources jCommonResources4 = new org.jfree.resources.JCommonResources();
    java.util.Locale locale5 = jCommonResources4.getLocale();
    boolean b6 = booleanList0.equals((java.lang.Object)jCommonResources4);
    org.jfree.util.ResourceBundleSupport resourceBundleSupport7 = new org.jfree.util.ResourceBundleSupport((java.util.ResourceBundle)jCommonResources4);
    org.jfree.ui.ApplicationFrame applicationFrame10 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent11 = null;
    applicationFrame10.windowDeiconified(windowEvent11);
    java.awt.LayoutManager layoutManager13 = null;
    applicationFrame10.setLayout(layoutManager13);
    java.beans.PropertyChangeListener propertyChangeListener15 = null;
    applicationFrame10.removePropertyChangeListener(propertyChangeListener15);
    java.awt.Image image17 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer18 = new org.jfree.ui.DateCellRenderer();
    int i19 = dateCellRenderer18.getDisplayedMnemonic();
    dateCellRenderer18.validate();
    int i21 = applicationFrame10.checkImage(image17, (java.awt.image.ImageObserver)dateCellRenderer18);
    dateCellRenderer18.updateUI();
    org.jfree.ui.BevelArrowIcon bevelArrowIcon26 = new org.jfree.ui.BevelArrowIcon((int)'4', true, false);
    dateCellRenderer18.setDisabledIcon((javax.swing.Icon)bevelArrowIcon26);
    dateCellRenderer18.repaint((int)(short)1, (int)(short)1, 3, 5);
    dateCellRenderer18.setIconTextGap(15);
    dateCellRenderer18.updateUI();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array36 = dateCellRenderer18.getVetoableChangeListeners();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str37 = resourceBundleSupport7.formatMessage("5-January-1900", (java.lang.Object[])vetoableChangeListener_array36);
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array36);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest83.test07"); }

    org.jfree.date.SpreadsheetDate spreadsheetDate1 = new org.jfree.date.SpreadsheetDate(16);
    java.util.Date date2 = spreadsheetDate1.toDate();
    org.jfree.date.SerialDate serialDate5 = org.jfree.date.SerialDate.createInstance(5);
    org.jfree.date.SerialDate serialDate6 = org.jfree.date.SerialDate.addDays((int)(short)1, serialDate5);
    org.jfree.date.SerialDate serialDate8 = org.jfree.date.SerialDate.createInstance(5);
    boolean b9 = org.jfree.date.SerialDateUtilities.isLastDayOfFebruary(serialDate8);
    int i10 = org.jfree.date.SerialDateUtilities.dayCount30PSA(serialDate5, serialDate8);
    org.jfree.date.SerialDate serialDate13 = org.jfree.date.SerialDate.createInstance(5);
    boolean b14 = org.jfree.date.SerialDateUtilities.isLastDayOfFebruary(serialDate13);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel16 = new org.jfree.ui.SerialDateChooserPanel(serialDate13, true);
    org.jfree.date.SerialDate serialDate17 = org.jfree.date.SerialDate.addYears(16, serialDate13);
    org.jfree.date.SerialDate serialDate18 = serialDate8.getEndOfCurrentMonth(serialDate17);
    boolean b19 = spreadsheetDate1.isOn(serialDate8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest83.test08"); }

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
    java.lang.String str33 = stackableRuntimeException31.toString();
    
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
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "org.jfree.util.StackableRuntimeException: "+ "'", str33.equals("org.jfree.util.StackableRuntimeException: "));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest83.test09"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b7 = serialDateChooserPanel2.isFocusTraversable();
    java.awt.Image image8 = null;
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel11 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, true);
    boolean b12 = serialDateChooserPanel11.getIgnoreRepaint();
    javax.swing.InputMap inputMap13 = serialDateChooserPanel11.getInputMap();
    javax.swing.TransferHandler transferHandler14 = null;
    serialDateChooserPanel11.setTransferHandler(transferHandler14);
    javax.swing.plaf.PanelUI panelUI16 = null;
    serialDateChooserPanel11.setUI(panelUI16);
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array18 = serialDateChooserPanel11.getHierarchyBoundsListeners();
    boolean b19 = serialDateChooserPanel2.prepareImage(image8, (java.awt.image.ImageObserver)serialDateChooserPanel11);
    java.awt.im.InputMethodRequests inputMethodRequests20 = serialDateChooserPanel11.getInputMethodRequests();
    int i21 = serialDateChooserPanel11.getWidth();
    java.awt.Graphics graphics22 = null;
    serialDateChooserPanel11.update(graphics22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputMethodRequests20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest83.test10"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.Rectangle rectangle2 = applicationFrame1.getMaximizedBounds();
    org.jfree.ui.L1R2ButtonPanel l1R2ButtonPanel6 = new org.jfree.ui.L1R2ButtonPanel("", "hi!", "notify-field-accept");
    javax.swing.JButton jButton7 = l1R2ButtonPanel6.getLeftButton();
    javax.swing.TransferHandler transferHandler8 = jButton7.getTransferHandler();
    boolean b9 = applicationFrame1.isFocusCycleRoot((java.awt.Container)jButton7);
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel12 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    boolean b13 = serialDateChooserPanel12.getIgnoreRepaint();
    javax.swing.InputMap inputMap14 = serialDateChooserPanel12.getInputMap();
    javax.swing.TransferHandler transferHandler15 = null;
    serialDateChooserPanel12.setTransferHandler(transferHandler15);
    javax.swing.plaf.PanelUI panelUI17 = null;
    serialDateChooserPanel12.setUI(panelUI17);
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array19 = serialDateChooserPanel12.getHierarchyBoundsListeners();
    javax.swing.JRootPane jRootPane20 = serialDateChooserPanel12.getRootPane();
    boolean b21 = serialDateChooserPanel12.isFocusable();
    javax.accessibility.AccessibleContext accessibleContext22 = serialDateChooserPanel12.getAccessibleContext();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array23 = serialDateChooserPanel12.getMouseMotionListeners();
    jButton7.setNextFocusableComponent((java.awt.Component)serialDateChooserPanel12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferHandler8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jRootPane20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array23);

  }

}
