
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest105 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest105.test01"); }

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
    dateCellRenderer35.updateUI();
    org.jfree.ui.ApplicationFrame applicationFrame54 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent55 = null;
    applicationFrame54.windowDeiconified(windowEvent55);
    java.awt.LayoutManager layoutManager57 = null;
    applicationFrame54.setLayout(layoutManager57);
    java.beans.PropertyChangeListener propertyChangeListener59 = null;
    applicationFrame54.removePropertyChangeListener(propertyChangeListener59);
    java.awt.Image image61 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer62 = new org.jfree.ui.DateCellRenderer();
    int i63 = dateCellRenderer62.getDisplayedMnemonic();
    dateCellRenderer62.validate();
    int i65 = applicationFrame54.checkImage(image61, (java.awt.image.ImageObserver)dateCellRenderer62);
    org.jfree.ui.BevelArrowIcon bevelArrowIcon69 = new org.jfree.ui.BevelArrowIcon((int)'4', true, false);
    dateCellRenderer62.setIcon((javax.swing.Icon)bevelArrowIcon69);
    dateCellRenderer35.setIcon((javax.swing.Icon)bevelArrowIcon69);
    int i72 = bevelArrowIcon69.getIconHeight();
    
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
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 11);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest105.test02"); }

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
    boolean b13 = serialDateChooserPanel8.isEnabled();
    serialDateChooserPanel8.invalidate();
    java.beans.PropertyChangeListener[] propertyChangeListener_array15 = serialDateChooserPanel8.getPropertyChangeListeners();
    
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
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array15);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest105.test03"); }

    org.jfree.base.config.ModifiableConfiguration modifiableConfiguration0 = org.jfree.base.BaseBoot.getConfiguration();
    org.jfree.util.ExtendedConfigurationWrapper extendedConfigurationWrapper1 = new org.jfree.util.ExtendedConfigurationWrapper((org.jfree.util.Configuration)modifiableConfiguration0);
    java.lang.Object obj2 = extendedConfigurationWrapper1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(modifiableConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj2);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest105.test04"); }

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
    serialDateChooserPanel32.addNotify();
    java.awt.event.MouseListener mouseListener44 = null;
    serialDateChooserPanel32.removeMouseListener(mouseListener44);
    serialDateChooserPanel32.setSize(0, 10);
    
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

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest105.test05"); }

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
    org.jfree.ui.DateCellRenderer dateCellRenderer48 = new org.jfree.ui.DateCellRenderer();
    int i49 = dateCellRenderer48.getDisplayedMnemonic();
    java.lang.String str50 = dateCellRenderer48.getText();
    java.lang.Object obj51 = null;
    org.jfree.util.Log.SimpleMessage simpleMessage53 = new org.jfree.util.Log.SimpleMessage("LabelUI", (java.lang.Object)dateCellRenderer48, obj51, (java.lang.Object)"http://www.jfree.org/jcommon/");
    printStreamLogTarget1.log((int)(byte)100, (java.lang.Object)"http://www.jfree.org/jcommon/");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + ""+ "'", str50.equals(""));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest105.test06"); }

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
    java.awt.Event event15 = null;
    boolean b18 = serialDateChooserPanel2.mouseDrag(event15, (int)'a', 8);
    
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
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest105.test07"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    java.awt.Rectangle rectangle2 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle3 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b4 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle2, (java.awt.geom.Rectangle2D)rectangle3);
    rectangleInsets1.trim((java.awt.geom.Rectangle2D)rectangle3);
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    boolean b9 = serialDateChooserPanel8.getIgnoreRepaint();
    javax.swing.InputMap inputMap10 = serialDateChooserPanel8.getInputMap();
    java.awt.Rectangle rectangle11 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle12 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b13 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle11, (java.awt.geom.Rectangle2D)rectangle12);
    java.awt.Rectangle rectangle14 = serialDateChooserPanel8.getBounds(rectangle12);
    java.awt.geom.Rectangle2D rectangle2D17 = rectangleInsets1.createInsetRectangle((java.awt.geom.Rectangle2D)rectangle14, false, true);
    org.jfree.ui.ApplicationFrame applicationFrame19 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent20 = null;
    applicationFrame19.windowDeiconified(windowEvent20);
    java.awt.LayoutManager layoutManager22 = null;
    applicationFrame19.setLayout(layoutManager22);
    java.beans.PropertyChangeListener propertyChangeListener24 = null;
    applicationFrame19.removePropertyChangeListener(propertyChangeListener24);
    java.awt.Image image26 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer27 = new org.jfree.ui.DateCellRenderer();
    int i28 = dateCellRenderer27.getDisplayedMnemonic();
    dateCellRenderer27.validate();
    int i30 = applicationFrame19.checkImage(image26, (java.awt.image.ImageObserver)dateCellRenderer27);
    dateCellRenderer27.updateUI();
    boolean b32 = rectangleInsets1.equals((java.lang.Object)dateCellRenderer27);
    org.jfree.util.UnitType unitType33 = rectangleInsets1.getUnitType();
    double d35 = rectangleInsets1.calculateRightOutset((double)(short)100);
    org.jfree.date.SerialDate serialDate36 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel38 = new org.jfree.ui.SerialDateChooserPanel(serialDate36, true);
    boolean b39 = serialDateChooserPanel38.getIgnoreRepaint();
    javax.swing.InputMap inputMap40 = serialDateChooserPanel38.getInputMap();
    java.awt.Rectangle rectangle41 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle42 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b43 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle41, (java.awt.geom.Rectangle2D)rectangle42);
    java.awt.Rectangle rectangle44 = serialDateChooserPanel38.getBounds(rectangle42);
    org.jfree.date.SerialDate serialDate45 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel47 = new org.jfree.ui.SerialDateChooserPanel(serialDate45, true);
    boolean b48 = serialDateChooserPanel47.getIgnoreRepaint();
    java.awt.Rectangle rectangle49 = serialDateChooserPanel47.getVisibleRect();
    boolean b50 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle42, (java.awt.Shape)rectangle49);
    java.awt.geom.Rectangle2D rectangle2D53 = rectangleInsets1.createOutsetRectangle((java.awt.geom.Rectangle2D)rectangle42, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(unitType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d35 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D53);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest105.test08"); }

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
    javax.accessibility.AccessibleContext accessibleContext21 = applicationFrame1.getAccessibleContext();
    java.awt.Window.Type type22 = applicationFrame1.getType();
    java.awt.im.InputContext inputContext23 = applicationFrame1.getInputContext();
    java.awt.Image image24 = null;
    org.jfree.ui.ApplicationFrame applicationFrame26 = new org.jfree.ui.ApplicationFrame("");
    java.awt.Rectangle rectangle27 = applicationFrame26.getMaximizedBounds();
    java.awt.event.MouseWheelListener mouseWheelListener28 = null;
    applicationFrame26.removeMouseWheelListener(mouseWheelListener28);
    boolean b30 = applicationFrame1.prepareImage(image24, (java.awt.image.ImageObserver)applicationFrame26);
    org.jfree.date.SerialDate serialDate31 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel33 = new org.jfree.ui.SerialDateChooserPanel(serialDate31, true);
    boolean b34 = serialDateChooserPanel33.getIgnoreRepaint();
    boolean b35 = serialDateChooserPanel33.isCursorSet();
    java.awt.Dimension dimension36 = serialDateChooserPanel33.minimumSize();
    org.jfree.date.SerialDate serialDate37 = serialDateChooserPanel33.getDate();
    serialDateChooserPanel33.setInheritsPopupMenu(false);
    applicationFrame1.setContentPane((java.awt.Container)serialDateChooserPanel33);
    
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
    org.junit.Assert.assertNotNull(accessibleContext21);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + java.awt.Window.Type.NORMAL + "'", type22.equals(java.awt.Window.Type.NORMAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputContext23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(serialDate37);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest105.test09"); }

    org.jfree.date.RelativeDayOfWeekRule relativeDayOfWeekRule0 = new org.jfree.date.RelativeDayOfWeekRule();

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest105.test10"); }

    java.util.Date date3 = org.jfree.date.DateUtilities.createDate((int)(byte)100, 15, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);

  }

}
