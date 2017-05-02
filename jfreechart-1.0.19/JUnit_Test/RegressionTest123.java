
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest123 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest123.test01"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    java.awt.LayoutManager layoutManager4 = null;
    applicationFrame1.setLayout(layoutManager4);
    java.beans.PropertyChangeListener propertyChangeListener7 = null;
    applicationFrame1.addPropertyChangeListener("RectangleInsets[t=1.0,l=3.0,b=1.0,r=3.0]", propertyChangeListener7);
    java.awt.event.WindowEvent windowEvent9 = null;
    applicationFrame1.windowDeactivated(windowEvent9);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest123.test02"); }

    org.jfree.ui.SortButtonRenderer sortButtonRenderer0 = new org.jfree.ui.SortButtonRenderer();
    sortButtonRenderer0.setPressedColumn(7);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest123.test03"); }

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
    java.lang.String str24 = dateCellRenderer9.getUIClassID();
    javax.swing.JRootPane jRootPane25 = dateCellRenderer9.getRootPane();
    boolean b26 = dateCellRenderer9.isDisplayable();
    org.jfree.text.TextBox textBox27 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets28 = textBox27.getInteriorGap();
    java.awt.Rectangle rectangle29 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle30 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b31 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle29, (java.awt.geom.Rectangle2D)rectangle30);
    rectangleInsets28.trim((java.awt.geom.Rectangle2D)rectangle30);
    double d33 = rectangleInsets28.getLeft();
    org.jfree.text.TextBox textBox34 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets35 = textBox34.getInteriorGap();
    java.awt.Rectangle rectangle36 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle37 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b38 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle36, (java.awt.geom.Rectangle2D)rectangle37);
    rectangleInsets35.trim((java.awt.geom.Rectangle2D)rectangle37);
    rectangleInsets28.trim((java.awt.geom.Rectangle2D)rectangle37);
    double d42 = rectangleInsets28.calculateBottomInset((double)(byte)-1);
    org.jfree.util.UnitType unitType43 = rectangleInsets28.getUnitType();
    double d45 = rectangleInsets28.extendWidth(1.0d);
    org.jfree.date.SerialDate serialDate46 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel48 = new org.jfree.ui.SerialDateChooserPanel(serialDate46, true);
    boolean b49 = serialDateChooserPanel48.getIgnoreRepaint();
    javax.swing.InputMap inputMap50 = serialDateChooserPanel48.getInputMap();
    java.awt.Rectangle rectangle51 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle52 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b53 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle51, (java.awt.geom.Rectangle2D)rectangle52);
    java.awt.Rectangle rectangle54 = serialDateChooserPanel48.getBounds(rectangle52);
    rectangleInsets28.trim((java.awt.geom.Rectangle2D)rectangle54);
    dateCellRenderer9.repaint(rectangle54);
    dateCellRenderer9.setAlignmentY((float)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "LabelUI"+ "'", str24.equals("LabelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jRootPane25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d33 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d42 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(unitType43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d45 == 7.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle54);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest123.test04"); }

    org.jfree.util.StrokeList strokeList0 = new org.jfree.util.StrokeList();
    org.jfree.text.TextBox textBox2 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets3 = textBox2.getInteriorGap();
    org.jfree.text.TextBlock textBlock4 = null;
    textBox2.setTextBlock(textBlock4);
    java.awt.Stroke stroke6 = textBox2.getOutlineStroke();
    strokeList0.setStroke(10, stroke6);
    java.lang.Object obj8 = strokeList0.clone();
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel11 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, true);
    serialDateChooserPanel11.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext16 = serialDateChooserPanel11.getAccessibleContext();
    boolean b17 = strokeList0.equals((java.lang.Object)accessibleContext16);
    java.awt.Stroke stroke19 = strokeList0.getStroke(7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(stroke19);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest123.test05"); }

    org.jfree.ui.OverlayLayout overlayLayout0 = new org.jfree.ui.OverlayLayout();
    org.jfree.ui.ApplicationFrame applicationFrame3 = new org.jfree.ui.ApplicationFrame("");
    int i4 = applicationFrame3.getState();
    java.util.Locale locale5 = applicationFrame3.getLocale();
    applicationFrame3.transferFocusUpCycle();
    java.awt.Graphics graphics7 = null;
    applicationFrame3.update(graphics7);
    java.beans.PropertyChangeListener propertyChangeListener9 = null;
    applicationFrame3.removePropertyChangeListener(propertyChangeListener9);
    org.jfree.date.SerialDate serialDate13 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel15 = new org.jfree.ui.SerialDateChooserPanel(serialDate13, true);
    serialDateChooserPanel15.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext20 = serialDateChooserPanel15.getAccessibleContext();
    java.awt.Dimension dimension21 = serialDateChooserPanel15.getPreferredSize();
    org.jfree.date.SerialDate serialDate23 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate23, true);
    boolean b26 = serialDateChooserPanel25.getIgnoreRepaint();
    javax.swing.InputMap inputMap27 = serialDateChooserPanel25.getInputMap();
    serialDateChooserPanel15.setInputMap((int)(byte)1, inputMap27);
    java.awt.event.FocusListener[] focusListener_array29 = serialDateChooserPanel15.getFocusListeners();
    org.jfree.ui.ApplicationFrame applicationFrame31 = new org.jfree.ui.ApplicationFrame("");
    int i32 = applicationFrame31.getState();
    java.awt.event.WindowEvent windowEvent33 = null;
    applicationFrame31.windowIconified(windowEvent33);
    applicationFrame31.show();
    javax.swing.JMenuBar jMenuBar36 = applicationFrame31.getJMenuBar();
    java.awt.event.WindowStateListener[] windowStateListener_array37 = applicationFrame31.getWindowStateListeners();
    org.jfree.ui.KeyedComboBoxModel keyedComboBoxModel38 = new org.jfree.ui.KeyedComboBoxModel((java.lang.Object[])focusListener_array29, (java.lang.Object[])windowStateListener_array37);
    org.jfree.ui.ApplicationFrame applicationFrame40 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener41 = null;
    applicationFrame40.removeWindowStateListener(windowStateListener41);
    boolean b43 = applicationFrame40.isValidateRoot();
    org.jfree.date.SerialDate serialDate44 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel46 = new org.jfree.ui.SerialDateChooserPanel(serialDate44, true);
    boolean b47 = serialDateChooserPanel46.getIgnoreRepaint();
    javax.swing.InputMap inputMap48 = serialDateChooserPanel46.getInputMap();
    java.awt.Rectangle rectangle49 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle50 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b51 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle49, (java.awt.geom.Rectangle2D)rectangle50);
    java.awt.Rectangle rectangle52 = serialDateChooserPanel46.getBounds(rectangle50);
    org.jfree.date.SerialDate serialDate53 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel55 = new org.jfree.ui.SerialDateChooserPanel(serialDate53, true);
    boolean b56 = serialDateChooserPanel55.getIgnoreRepaint();
    java.awt.Rectangle rectangle57 = serialDateChooserPanel55.getVisibleRect();
    boolean b58 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle50, (java.awt.Shape)rectangle57);
    applicationFrame40.setMaximizedBounds(rectangle50);
    javax.accessibility.AccessibleContext accessibleContext60 = applicationFrame40.getAccessibleContext();
    java.awt.event.WindowEvent windowEvent61 = null;
    applicationFrame40.windowDeiconified(windowEvent61);
    org.jfree.text.TextBox textBox63 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets64 = textBox63.getInteriorGap();
    java.awt.Rectangle rectangle65 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle66 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b67 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle65, (java.awt.geom.Rectangle2D)rectangle66);
    rectangleInsets64.trim((java.awt.geom.Rectangle2D)rectangle66);
    double d69 = rectangleInsets64.getLeft();
    org.jfree.text.TextBox textBox70 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets71 = textBox70.getInteriorGap();
    java.awt.Rectangle rectangle72 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle73 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b74 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle72, (java.awt.geom.Rectangle2D)rectangle73);
    rectangleInsets71.trim((java.awt.geom.Rectangle2D)rectangle73);
    rectangleInsets64.trim((java.awt.geom.Rectangle2D)rectangle73);
    applicationFrame40.setBounds(rectangle73);
    java.awt.Font font79 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.text.TextFragment textFragment81 = new org.jfree.text.TextFragment("PanelUI");
    java.awt.Paint paint82 = textFragment81.getPaint();
    org.jfree.text.TextFragment textFragment83 = new org.jfree.text.TextFragment("org.jfree.ui.SerialDateChooserPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", font79, paint82);
    keyedComboBoxModel38.add((java.lang.Object)rectangle73, (java.lang.Object)font79);
    org.jfree.ui.FontChooserDialog fontChooserDialog85 = new org.jfree.ui.FontChooserDialog((java.awt.Frame)applicationFrame3, "black", false, font79);
    java.awt.Font font86 = fontChooserDialog85.getSelectedFont();
    org.jfree.util.Log.log((int)(short)0, (java.lang.Object)fontChooserDialog85);
    org.jfree.layout.LCBLayout lCBLayout89 = new org.jfree.layout.LCBLayout(9);
    fontChooserDialog85.setLayout((java.awt.LayoutManager)lCBLayout89);
    java.awt.event.ComponentListener componentListener91 = null;
    fontChooserDialog85.removeComponentListener(componentListener91);
    java.awt.Graphics graphics93 = null;
    fontChooserDialog85.update(graphics93);
    java.awt.Dimension dimension95 = overlayLayout0.minimumLayoutSize((java.awt.Container)fontChooserDialog85);
    java.awt.Container container96 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Dimension dimension97 = overlayLayout0.preferredLayoutSize(container96);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowStateListener_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d69 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension95);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest123.test06"); }

    org.jfree.ui.StandardGradientPaintTransformer standardGradientPaintTransformer0 = new org.jfree.ui.StandardGradientPaintTransformer();
    org.jfree.ui.GradientPaintTransformType gradientPaintTransformType1 = standardGradientPaintTransformer0.getType();
    org.jfree.util.StackableRuntimeException stackableRuntimeException2 = new org.jfree.util.StackableRuntimeException();
    org.jfree.util.Log.warn((java.lang.Object)standardGradientPaintTransformer0, (java.lang.Exception)stackableRuntimeException2);
    org.jfree.ui.GradientPaintTransformType gradientPaintTransformType4 = standardGradientPaintTransformer0.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gradientPaintTransformType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gradientPaintTransformType4);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest123.test07"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    java.awt.Cursor cursor4 = null;
    applicationFrame1.setCursor(cursor4);
    applicationFrame1.setLocation(100, (int)(short)1);
    org.jfree.ui.ApplicationFrame applicationFrame10 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener11 = null;
    applicationFrame10.removeWindowStateListener(windowStateListener11);
    applicationFrame10.setExtendedState(6);
    java.awt.Dimension dimension15 = applicationFrame10.size();
    java.awt.Window.Type type16 = applicationFrame10.getType();
    applicationFrame10.reshape((int)(byte)0, 8, (int)(byte)-1, (int)'#');
    org.jfree.ui.ApplicationFrame applicationFrame23 = new org.jfree.ui.ApplicationFrame("");
    int i24 = applicationFrame23.getState();
    java.util.Locale locale25 = applicationFrame23.getLocale();
    applicationFrame23.transferFocusUpCycle();
    java.awt.Graphics graphics27 = null;
    applicationFrame23.update(graphics27);
    java.awt.Cursor cursor29 = applicationFrame23.getCursor();
    applicationFrame10.setCursor(cursor29);
    applicationFrame1.setCursor(cursor29);
    int i32 = applicationFrame1.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension15);
    org.junit.Assert.assertTrue("'" + type16 + "' != '" + java.awt.Window.Type.NORMAL + "'", type16.equals(java.awt.Window.Type.NORMAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest123.test08"); }

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
    org.jfree.date.SerialDate serialDate28 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel30 = new org.jfree.ui.SerialDateChooserPanel(serialDate28, true);
    serialDateChooserPanel30.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b35 = serialDateChooserPanel30.isFocusTraversable();
    java.awt.Image image36 = null;
    org.jfree.date.SerialDate serialDate37 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel39 = new org.jfree.ui.SerialDateChooserPanel(serialDate37, true);
    boolean b40 = serialDateChooserPanel39.getIgnoreRepaint();
    boolean b41 = serialDateChooserPanel39.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array42 = serialDateChooserPanel39.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate43 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel45 = new org.jfree.ui.SerialDateChooserPanel(serialDate43, true);
    boolean b46 = serialDateChooserPanel45.getIgnoreRepaint();
    serialDateChooserPanel45.setAlignmentX((float)(byte)10);
    java.awt.Component component49 = serialDateChooserPanel39.add((java.awt.Component)serialDateChooserPanel45);
    java.lang.String str50 = serialDateChooserPanel45.getUIClassID();
    boolean b51 = serialDateChooserPanel45.isBackgroundSet();
    int i52 = serialDateChooserPanel30.checkImage(image36, (java.awt.image.ImageObserver)serialDateChooserPanel45);
    org.jfree.ui.L1R2ButtonPanel l1R2ButtonPanel56 = new org.jfree.ui.L1R2ButtonPanel("", "hi!", "notify-field-accept");
    javax.swing.JButton jButton57 = l1R2ButtonPanel56.getLeftButton();
    java.lang.Object obj58 = serialDateChooserPanel30.getClientProperty((java.lang.Object)l1R2ButtonPanel56);
    javax.swing.JButton jButton59 = l1R2ButtonPanel56.getRightButton1();
    javax.swing.event.AncestorListener[] ancestorListener_array60 = jButton59.getAncestorListeners();
    org.jfree.date.SerialDate serialDate61 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel63 = new org.jfree.ui.SerialDateChooserPanel(serialDate61, true);
    java.beans.VetoableChangeListener vetoableChangeListener64 = null;
    serialDateChooserPanel63.removeVetoableChangeListener(vetoableChangeListener64);
    boolean b66 = serialDateChooserPanel63.requestDefaultFocus();
    serialDateChooserPanel63.removeAll();
    boolean b68 = serialDateChooserPanel63.requestFocusInWindow();
    java.awt.event.InputMethodListener[] inputMethodListener_array69 = serialDateChooserPanel63.getInputMethodListeners();
    java.awt.event.MouseMotionListener[] mouseMotionListener_array70 = serialDateChooserPanel63.getMouseMotionListeners();
    keyedComboBoxModel25.setData((java.lang.Object[])ancestorListener_array60, (java.lang.Object[])mouseMotionListener_array70);
    org.jfree.ui.ApplicationFrame applicationFrame73 = new org.jfree.ui.ApplicationFrame("");
    int i74 = applicationFrame73.getState();
    java.awt.event.WindowEvent windowEvent75 = null;
    applicationFrame73.windowIconified(windowEvent75);
    org.jfree.date.SerialDate serialDate77 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel79 = new org.jfree.ui.SerialDateChooserPanel(serialDate77, true);
    serialDateChooserPanel79.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext84 = serialDateChooserPanel79.getAccessibleContext();
    java.awt.Dimension dimension85 = serialDateChooserPanel79.getPreferredSize();
    org.jfree.date.SerialDate serialDate87 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel89 = new org.jfree.ui.SerialDateChooserPanel(serialDate87, true);
    boolean b90 = serialDateChooserPanel89.getIgnoreRepaint();
    javax.swing.InputMap inputMap91 = serialDateChooserPanel89.getInputMap();
    serialDateChooserPanel79.setInputMap((int)(byte)1, inputMap91);
    java.awt.event.FocusListener[] focusListener_array93 = serialDateChooserPanel79.getFocusListeners();
    applicationFrame73.remove((java.awt.Component)serialDateChooserPanel79);
    applicationFrame73.setExtendedState(3);
    java.beans.PropertyChangeListener[] propertyChangeListener_array97 = applicationFrame73.getPropertyChangeListeners();
    keyedComboBoxModel25.removeDataElement((java.lang.Object)propertyChangeListener_array97);
    
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
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "PanelUI"+ "'", str50.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ancestorListener_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMethodListener_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array97);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest123.test09"); }

    org.jfree.ui.LengthAdjustmentType lengthAdjustmentType0 = org.jfree.ui.LengthAdjustmentType.NO_CHANGE;
    java.lang.Object obj1 = null;
    boolean b2 = lengthAdjustmentType0.equals(obj1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthAdjustmentType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest123.test10"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    dateCellRenderer0.setIconTextGap(5);
    org.jfree.date.SerialDate serialDate3 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel5 = new org.jfree.ui.SerialDateChooserPanel(serialDate3, true);
    serialDateChooserPanel5.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b10 = serialDateChooserPanel5.isFocusTraversable();
    java.awt.Image image11 = null;
    org.jfree.date.SerialDate serialDate12 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel14 = new org.jfree.ui.SerialDateChooserPanel(serialDate12, true);
    boolean b15 = serialDateChooserPanel14.getIgnoreRepaint();
    javax.swing.InputMap inputMap16 = serialDateChooserPanel14.getInputMap();
    javax.swing.TransferHandler transferHandler17 = null;
    serialDateChooserPanel14.setTransferHandler(transferHandler17);
    javax.swing.plaf.PanelUI panelUI19 = null;
    serialDateChooserPanel14.setUI(panelUI19);
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array21 = serialDateChooserPanel14.getHierarchyBoundsListeners();
    boolean b22 = serialDateChooserPanel5.prepareImage(image11, (java.awt.image.ImageObserver)serialDateChooserPanel14);
    java.awt.im.InputContext inputContext23 = serialDateChooserPanel5.getInputContext();
    javax.swing.KeyStroke keyStroke25 = null;
    // The following exception was thrown during execution in test generation
    try {
    dateCellRenderer0.registerKeyboardAction((java.awt.event.ActionListener)serialDateChooserPanel5, "SortOrder.ASCENDING", keyStroke25, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputContext23);

  }

}
