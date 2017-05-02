
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest113 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest113.test01"); }

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
    boolean b41 = serialDateChooserPanel32.isOpaque();
    java.awt.Container container42 = serialDateChooserPanel32.getParent();
    java.lang.String str43 = container42.toString();
    container42.resize((int)(short)0, 13);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "org.jfree.ui.SerialDateChooserPanel[,0,0,0str43,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"+ "'", str43.equals("org.jfree.ui.SerialDateChooserPanel[,0,0,0str43,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest113.test02"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    java.awt.Cursor cursor4 = null;
    applicationFrame1.setCursor(cursor4);
    java.awt.Image image6 = null;
    boolean b12 = applicationFrame1.imageUpdate(image6, (int)'4', (int)(short)1, 8, (int)(byte)100, (int)'#');
    boolean b13 = applicationFrame1.isLocationByPlatform();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest113.test03"); }

    java.awt.Color color0 = org.jfree.ui.SerialDateChooserPanel.DEFAULT_DATE_BUTTON_COLOR;
    org.jfree.ui.PaintSample paintSample1 = new org.jfree.ui.PaintSample((java.awt.Paint)color0);
    java.awt.Event event2 = null;
    org.jfree.ui.ApplicationFrame applicationFrame4 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent5 = null;
    applicationFrame4.windowDeiconified(windowEvent5);
    applicationFrame4.firePropertyChange("hi!", '#', '4');
    java.awt.FocusTraversalPolicy focusTraversalPolicy11 = applicationFrame4.getFocusTraversalPolicy();
    java.awt.im.InputContext inputContext12 = applicationFrame4.getInputContext();
    boolean b13 = paintSample1.action(event2, (java.lang.Object)applicationFrame4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusTraversalPolicy11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputContext12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest113.test04"); }

    org.jfree.util.LogContext logContext1 = new org.jfree.util.LogContext("NO_CHANGE");
    org.jfree.ui.ApplicationFrame applicationFrame3 = new org.jfree.ui.ApplicationFrame("");
    int i4 = applicationFrame3.getState();
    java.util.Locale locale5 = applicationFrame3.getLocale();
    applicationFrame3.transferFocusUpCycle();
    java.awt.Component component7 = applicationFrame3.getFocusOwner();
    logContext1.debug((java.lang.Object)applicationFrame3);
    org.jfree.base.BasicProjectInfo basicProjectInfo14 = new org.jfree.base.BasicProjectInfo("PanelUI", "notify-field-accept", "GradientPaintTransformType.HORIZONTAL", "SortOrder.ASCENDING", "ClassContext");
    logContext1.debug((java.lang.Object)basicProjectInfo14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component7);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest113.test05"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.date.SerialDate serialDate2 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel4 = new org.jfree.ui.SerialDateChooserPanel(serialDate2, true);
    java.awt.Color color5 = serialDateChooserPanel4.getForeground();
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    java.awt.Color color9 = serialDateChooserPanel8.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame11 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener12 = null;
    applicationFrame11.removeWindowStateListener(windowStateListener12);
    applicationFrame11.setCursor(0);
    org.jfree.date.SerialDate serialDate16 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel18 = new org.jfree.ui.SerialDateChooserPanel(serialDate16, true);
    java.awt.Color color19 = serialDateChooserPanel18.getForeground();
    applicationFrame11.setBackground(color19);
    boolean b21 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color9, (java.awt.Paint)color19);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel22 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, false, color5, color19);
    java.awt.Image image23 = null;
    org.jfree.ui.ApplicationFrame applicationFrame27 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent28 = null;
    applicationFrame27.windowDeiconified(windowEvent28);
    java.awt.LayoutManager layoutManager30 = null;
    applicationFrame27.setLayout(layoutManager30);
    java.beans.PropertyChangeListener propertyChangeListener32 = null;
    applicationFrame27.removePropertyChangeListener(propertyChangeListener32);
    java.awt.Image image34 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer35 = new org.jfree.ui.DateCellRenderer();
    int i36 = dateCellRenderer35.getDisplayedMnemonic();
    dateCellRenderer35.validate();
    int i38 = applicationFrame27.checkImage(image34, (java.awt.image.ImageObserver)dateCellRenderer35);
    dateCellRenderer35.updateUI();
    org.jfree.ui.BevelArrowIcon bevelArrowIcon43 = new org.jfree.ui.BevelArrowIcon((int)'4', true, false);
    dateCellRenderer35.setDisabledIcon((javax.swing.Icon)bevelArrowIcon43);
    boolean b45 = serialDateChooserPanel22.prepareImage(image23, (int)(byte)0, (int)(short)100, (java.awt.image.ImageObserver)dateCellRenderer35);
    dateCellRenderer35.repaint((long)16, 3, 31, 1, (int)(byte)100);
    dateCellRenderer35.setAlignmentY((float)(short)-1);
    org.jfree.ui.ApplicationFrame applicationFrame55 = new org.jfree.ui.ApplicationFrame("");
    int i56 = applicationFrame55.getState();
    org.jfree.date.SerialDate serialDate57 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel59 = new org.jfree.ui.SerialDateChooserPanel(serialDate57, true);
    serialDateChooserPanel59.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext64 = serialDateChooserPanel59.getAccessibleContext();
    java.awt.Dimension dimension65 = serialDateChooserPanel59.getPreferredSize();
    applicationFrame55.setSize(dimension65);
    applicationFrame55.pack();
    java.awt.Dimension dimension68 = applicationFrame55.preferredSize();
    dateCellRenderer35.setPreferredSize(dimension68);
    org.jfree.date.SerialDate serialDate70 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel72 = new org.jfree.ui.SerialDateChooserPanel(serialDate70, true);
    serialDateChooserPanel72.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext77 = serialDateChooserPanel72.getAccessibleContext();
    serialDateChooserPanel72.invalidate();
    serialDateChooserPanel72.grabFocus();
    javax.swing.JPopupMenu jPopupMenu80 = null;
    serialDateChooserPanel72.setComponentPopupMenu(jPopupMenu80);
    int i84 = serialDateChooserPanel72.getBaseline(1, 9999);
    org.jfree.date.SerialDate serialDate85 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel87 = new org.jfree.ui.SerialDateChooserPanel(serialDate85, true);
    boolean b88 = serialDateChooserPanel87.getIgnoreRepaint();
    serialDateChooserPanel87.setAlignmentX((float)(byte)10);
    java.awt.Dimension dimension91 = serialDateChooserPanel87.getMaximumSize();
    serialDateChooserPanel72.setMaximumSize(dimension91);
    dimension68.setSize((java.awt.geom.Dimension2D)dimension91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension91);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest113.test06"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    serialDateChooserPanel2.enableInputMethods(true);
    javax.swing.TransferHandler transferHandler10 = serialDateChooserPanel2.getTransferHandler();
    java.awt.Image image11 = null;
    boolean b17 = serialDateChooserPanel2.imageUpdate(image11, 5, (-1), 3, (int)'a', 2);
    serialDateChooserPanel2.setOpaque(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferHandler10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest113.test07"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array1 = lengthLimitingDocument0.getDocumentListeners();
    int i2 = lengthLimitingDocument0.getMaxLength();
    javax.swing.text.Element element3 = lengthLimitingDocument0.getBidiRootElement();
    javax.swing.event.UndoableEditListener undoableEditListener4 = null;
    lengthLimitingDocument0.removeUndoableEditListener(undoableEditListener4);
    int i6 = lengthLimitingDocument0.getMaxLength();
    int i7 = lengthLimitingDocument0.getLength();
    javax.swing.event.DocumentListener documentListener8 = null;
    lengthLimitingDocument0.addDocumentListener(documentListener8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(element3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest113.test08"); }

    int i0 = javax.swing.JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest113.test09"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    javax.swing.InputMap inputMap4 = serialDateChooserPanel2.getInputMap();
    java.awt.Dimension dimension5 = serialDateChooserPanel2.getMaximumSize();
    boolean b6 = serialDateChooserPanel2.isManagingFocus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest113.test10"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getIconTextGap();
    javax.swing.Icon icon2 = dateCellRenderer0.getDisabledIcon();
    dateCellRenderer0.firePropertyChange("content", (float)(short)1, (float)7);
    dateCellRenderer0.firePropertyChange("5-January-1900", false, true);
    dateCellRenderer0.enableInputMethods(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon2);

  }

}
