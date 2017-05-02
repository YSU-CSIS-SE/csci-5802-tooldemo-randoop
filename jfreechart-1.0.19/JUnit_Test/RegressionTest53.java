
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest53 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest53.test01"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.awt.event.WindowEvent windowEvent3 = null;
    applicationFrame1.windowIconified(windowEvent3);
    applicationFrame1.show();
    javax.swing.JMenuBar jMenuBar6 = applicationFrame1.getJMenuBar();
    java.awt.event.WindowStateListener[] windowStateListener_array7 = applicationFrame1.getWindowStateListeners();
    java.awt.Shape shape8 = applicationFrame1.getShape();
    applicationFrame1.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowStateListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape8);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest53.test02"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    boolean b4 = serialDateChooserPanel2.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array5 = serialDateChooserPanel2.getPropertyChangeListeners();
    javax.swing.InputMap inputMap6 = serialDateChooserPanel2.getInputMap();
    boolean b7 = serialDateChooserPanel2.isForegroundSet();
    boolean b8 = serialDateChooserPanel2.getAutoscrolls();
    java.awt.Insets insets9 = serialDateChooserPanel2.getInsets();
    float f10 = serialDateChooserPanel2.getAlignmentX();
    
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
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f10 == 0.5f);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest53.test03"); }

    int i0 = java.awt.Frame.CROSSHAIR_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest53.test04"); }

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
    applicationFrame1.show();
    applicationFrame1.setSize((int)(short)100, (int)'a');
    
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

    if (debug) { System.out.format("%n%s%n","RegressionTest53.test05"); }

    org.jfree.ui.ExtensionFileFilter extensionFileFilter2 = new org.jfree.ui.ExtensionFileFilter("5-January-1900", "GradientPaintTransformType.HORIZONTAL");

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest53.test06"); }

    org.jfree.text.TextBlock textBlock0 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D1 = null;
    org.jfree.text.TextBlock textBlock4 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D5 = null;
    org.jfree.text.TextBlockAnchor textBlockAnchor8 = org.jfree.text.TextBlockAnchor.TOP_RIGHT;
    java.awt.Shape shape12 = textBlock4.calculateBounds(graphics2D5, (float)12, (float)(short)-1, textBlockAnchor8, (float)' ', (float)32, (double)(-1.0f));
    textBlock0.draw(graphics2D1, (float)5, (float)(short)1, textBlockAnchor8, (float)(short)-1, (float)(short)100, (double)1.0f);
    org.jfree.text.TextBlock textBlock17 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D18 = null;
    org.jfree.text.TextBlock textBlock21 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D22 = null;
    org.jfree.text.TextBlockAnchor textBlockAnchor25 = org.jfree.text.TextBlockAnchor.TOP_RIGHT;
    java.awt.Shape shape29 = textBlock21.calculateBounds(graphics2D22, (float)12, (float)(short)-1, textBlockAnchor25, (float)' ', (float)32, (double)(-1.0f));
    textBlock17.draw(graphics2D18, (float)5, (float)(short)1, textBlockAnchor25, (float)(short)-1, (float)(short)100, (double)1.0f);
    org.jfree.ui.HorizontalAlignment horizontalAlignment34 = textBlock17.getLineAlignment();
    textBlock0.setLineAlignment(horizontalAlignment34);
    java.lang.String str36 = horizontalAlignment34.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(horizontalAlignment34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "HorizontalAlignment.CENTER"+ "'", str36.equals("HorizontalAlignment.CENTER"));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest53.test07"); }

    org.jfree.util.LineBreakIterator lineBreakIterator0 = new org.jfree.util.LineBreakIterator();
    java.lang.String str1 = lineBreakIterator0.getText();
    boolean b2 = lineBreakIterator0.hasNext();
    org.jfree.util.ReadOnlyIterator readOnlyIterator3 = new org.jfree.util.ReadOnlyIterator((java.util.Iterator)lineBreakIterator0);
    lineBreakIterator0.setText("PanelUI");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest53.test08"); }

    org.jfree.ui.L1R2ButtonPanel l1R2ButtonPanel3 = new org.jfree.ui.L1R2ButtonPanel("", "hi!", "notify-field-accept");
    javax.swing.JButton jButton4 = l1R2ButtonPanel3.getLeftButton();
    javax.swing.TransferHandler transferHandler5 = jButton4.getTransferHandler();
    javax.swing.border.Border border6 = null;
    jButton4.setBorder(border6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferHandler5);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest53.test09"); }

    org.jfree.ui.Size2D size2D0 = new org.jfree.ui.Size2D();
    size2D0.setWidth((double)100);
    java.lang.String str3 = size2D0.toString();
    boolean b5 = size2D0.equals((java.lang.Object)0.0f);
    double d6 = size2D0.height;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Size2D[width=100.0, height=0.0]"+ "'", str3.equals("Size2D[width=100.0, height=0.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest53.test10"); }

    java.awt.Font font1 = org.jfree.text.TextFragment.DEFAULT_FONT;
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
    org.jfree.text.TextFragment textFragment18 = new org.jfree.text.TextFragment("ClassContext", font1, (java.awt.Paint)color15);
    java.awt.Paint paint19 = textFragment18.getPaint();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint19);

  }

}
