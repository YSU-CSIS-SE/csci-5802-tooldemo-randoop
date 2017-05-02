
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest57 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest57.test01"); }

    org.jfree.date.SerialDate serialDate1 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel3 = new org.jfree.ui.SerialDateChooserPanel(serialDate1, true);
    boolean b4 = serialDateChooserPanel3.getIgnoreRepaint();
    serialDateChooserPanel3.resize(8, (int)(short)-1);
    java.awt.Dimension dimension8 = serialDateChooserPanel3.getPreferredSize();
    java.lang.Exception exception10 = null;
    org.jfree.util.StackableRuntimeException stackableRuntimeException11 = new org.jfree.util.StackableRuntimeException("", exception10);
    org.jfree.util.Log.log((int)(byte)10, (java.lang.Object)dimension8, (java.lang.Exception)stackableRuntimeException11);
    java.lang.Throwable[] throwable_array13 = stackableRuntimeException11.getSuppressed();
    java.lang.Exception exception14 = stackableRuntimeException11.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(exception14);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest57.test02"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    double d2 = textBox0.getShadowYOffset();
    org.jfree.text.TextFragment textFragment4 = new org.jfree.text.TextFragment("PanelUI");
    java.awt.Paint paint5 = textFragment4.getPaint();
    textBox0.setShadowPaint(paint5);
    org.jfree.text.TextBlock textBlock7 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D8 = null;
    org.jfree.text.TextBlock textBlock11 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D12 = null;
    org.jfree.text.TextBlockAnchor textBlockAnchor15 = org.jfree.text.TextBlockAnchor.TOP_RIGHT;
    java.awt.Shape shape19 = textBlock11.calculateBounds(graphics2D12, (float)12, (float)(short)-1, textBlockAnchor15, (float)' ', (float)32, (double)(-1.0f));
    textBlock7.draw(graphics2D8, (float)5, (float)(short)1, textBlockAnchor15, (float)(short)-1, (float)(short)100, (double)1.0f);
    textBox0.setTextBlock(textBlock7);
    java.awt.Graphics2D graphics2D25 = null;
    double d26 = textBox0.getHeight(graphics2D25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == 2.0d);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest57.test03"); }

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
    dateCellRenderer9.repaint((long)(short)1, 5, 0, 8, 7);
    java.awt.event.ContainerListener containerListener30 = null;
    dateCellRenderer9.removeContainerListener(containerListener30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest57.test04"); }

    java.text.AttributedString attributedString0 = null;
    java.io.ObjectOutputStream objectOutputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.io.SerialUtilities.writeAttributedString(attributedString0, objectOutputStream1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest57.test05"); }

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
    java.lang.String str13 = serialDateChooserPanel8.getUIClassID();
    serialDateChooserPanel8.setAutoscrolls(true);
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "PanelUI"+ "'", str13.equals("PanelUI"));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest57.test06"); }

    org.jfree.ui.LengthAdjustmentType lengthAdjustmentType0 = org.jfree.ui.LengthAdjustmentType.EXPAND;
    java.lang.String str1 = lengthAdjustmentType0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(lengthAdjustmentType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "EXPAND"+ "'", str1.equals("EXPAND"));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest57.test07"); }

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
    java.lang.String str27 = rectangleInsets1.toString();
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "RectangleInsets[t=1.0,l=3.0,b=1.0,r=3.0]"+ "'", str27.equals("RectangleInsets[t=1.0,l=3.0,b=1.0,r=3.0]"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest57.test08"); }

    org.jfree.ui.StrokeSample strokeSample0 = null;
    org.jfree.ui.StrokeSample[] strokeSample_array1 = new org.jfree.ui.StrokeSample[] {  };
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.ui.StrokeChooserPanel strokeChooserPanel2 = new org.jfree.ui.StrokeChooserPanel(strokeSample0, strokeSample_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(strokeSample_array1);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest57.test09"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    java.awt.Cursor cursor4 = null;
    applicationFrame1.setCursor(cursor4);
    java.awt.Graphics graphics6 = null;
    applicationFrame1.printComponents(graphics6);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest57.test10"); }

    org.jfree.ui.DrawablePanel drawablePanel0 = new org.jfree.ui.DrawablePanel();
    java.awt.Dimension dimension1 = drawablePanel0.getMinimumSize();
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
    drawablePanel0.addHierarchyBoundsListener(hierarchyBoundsListener2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension1);

  }

}
