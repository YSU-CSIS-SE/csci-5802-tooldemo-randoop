
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest42 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    java.awt.Color color3 = serialDateChooserPanel2.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame5 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener6 = null;
    applicationFrame5.removeWindowStateListener(windowStateListener6);
    applicationFrame5.setCursor(0);
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel12 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    java.awt.Color color13 = serialDateChooserPanel12.getForeground();
    applicationFrame5.setBackground(color13);
    boolean b15 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color3, (java.awt.Paint)color13);
    org.jfree.ui.PaintSample paintSample16 = new org.jfree.ui.PaintSample((java.awt.Paint)color13);
    java.awt.event.ComponentListener componentListener17 = null;
    paintSample16.addComponentListener(componentListener17);
    java.awt.Paint paint19 = paintSample16.getPaint();
    java.awt.event.FocusListener focusListener20 = null;
    paintSample16.addFocusListener(focusListener20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint19);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test02"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    java.awt.Cursor cursor4 = null;
    applicationFrame1.setCursor(cursor4);
    java.awt.event.WindowFocusListener[] windowFocusListener_array6 = applicationFrame1.getWindowFocusListeners();
    org.jfree.date.SerialDate serialDate7 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel9 = new org.jfree.ui.SerialDateChooserPanel(serialDate7, true);
    boolean b10 = serialDateChooserPanel9.getIgnoreRepaint();
    boolean b11 = serialDateChooserPanel9.isCursorSet();
    java.awt.Dimension dimension12 = serialDateChooserPanel9.minimumSize();
    applicationFrame1.resize(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowFocusListener_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test03"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    java.awt.Cursor cursor4 = null;
    applicationFrame1.setCursor(cursor4);
    java.awt.Image image6 = null;
    boolean b12 = applicationFrame1.imageUpdate(image6, (int)'4', (int)(short)1, 8, (int)(byte)100, (int)'#');
    java.awt.Dimension dimension13 = applicationFrame1.getPreferredSize();
    java.awt.BufferCapabilities bufferCapabilities15 = null;
    // The following exception was thrown during execution in test generation
    try {
    applicationFrame1.createBufferStrategy(1, bufferCapabilities15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension13);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test04"); }

    org.jfree.ui.TextAnchor textAnchor0 = org.jfree.ui.TextAnchor.HALF_ASCENT_LEFT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test05"); }

    org.jfree.util.LineBreakIterator lineBreakIterator0 = new org.jfree.util.LineBreakIterator();
    java.lang.String str1 = lineBreakIterator0.getText();
    boolean b2 = lineBreakIterator0.hasNext();
    org.jfree.util.ReadOnlyIterator readOnlyIterator3 = new org.jfree.util.ReadOnlyIterator((java.util.Iterator)lineBreakIterator0);
    // The following exception was thrown during execution in test generation
    try {
    readOnlyIterator3.remove();
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test06"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    serialDateChooserPanel2.enableInputMethods(true);
    java.lang.String str10 = serialDateChooserPanel2.getToolTipText();
    java.awt.event.ContainerListener containerListener11 = null;
    serialDateChooserPanel2.addContainerListener(containerListener11);
    org.jfree.date.SerialDate serialDate13 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel15 = new org.jfree.ui.SerialDateChooserPanel(serialDate13, true);
    java.awt.Color color16 = serialDateChooserPanel15.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame18 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener19 = null;
    applicationFrame18.removeWindowStateListener(windowStateListener19);
    applicationFrame18.setCursor(0);
    org.jfree.date.SerialDate serialDate23 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate23, true);
    java.awt.Color color26 = serialDateChooserPanel25.getForeground();
    applicationFrame18.setBackground(color26);
    boolean b28 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color16, (java.awt.Paint)color26);
    serialDateChooserPanel2.setBackground(color16);
    org.jfree.date.SerialDate serialDate30 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel32 = new org.jfree.ui.SerialDateChooserPanel(serialDate30, true);
    boolean b33 = serialDateChooserPanel32.getIgnoreRepaint();
    javax.swing.InputMap inputMap34 = serialDateChooserPanel32.getInputMap();
    javax.swing.TransferHandler transferHandler35 = null;
    serialDateChooserPanel32.setTransferHandler(transferHandler35);
    javax.swing.plaf.PanelUI panelUI37 = null;
    serialDateChooserPanel32.setUI(panelUI37);
    java.awt.Dimension dimension39 = serialDateChooserPanel32.getMaximumSize();
    serialDateChooserPanel2.setSize(dimension39);
    org.jfree.date.SerialDate serialDate41 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel43 = new org.jfree.ui.SerialDateChooserPanel(serialDate41, true);
    serialDateChooserPanel43.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext48 = serialDateChooserPanel43.getAccessibleContext();
    serialDateChooserPanel43.invalidate();
    serialDateChooserPanel43.grabFocus();
    java.awt.ComponentOrientation componentOrientation51 = serialDateChooserPanel43.getComponentOrientation();
    serialDateChooserPanel2.applyComponentOrientation(componentOrientation51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation51);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test07"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    serialDateChooserPanel2.enableInputMethods(true);
    java.lang.String str10 = serialDateChooserPanel2.getToolTipText();
    java.awt.event.ContainerListener containerListener11 = null;
    serialDateChooserPanel2.addContainerListener(containerListener11);
    javax.swing.plaf.PanelUI panelUI13 = serialDateChooserPanel2.getUI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(panelUI13);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test08"); }

    org.jfree.util.LineBreakIterator lineBreakIterator0 = new org.jfree.util.LineBreakIterator();
    java.lang.String str1 = lineBreakIterator0.getText();
    boolean b2 = lineBreakIterator0.hasNext();
    org.jfree.util.ReadOnlyIterator readOnlyIterator3 = new org.jfree.util.ReadOnlyIterator((java.util.Iterator)lineBreakIterator0);
    java.lang.Object obj4 = readOnlyIterator3.next();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + ""+ "'", obj4.equals(""));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test09"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    int i1 = lengthLimitingDocument0.getAsynchronousLoadPriority();
    // The following exception was thrown during execution in test generation
    try {
    lengthLimitingDocument0.readUnlock();
      org.junit.Assert.fail("Expected exception of type javax.swing.text.StateInvariantError");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest42.test10"); }

    org.jfree.ui.VerticalAlignment verticalAlignment0 = org.jfree.ui.VerticalAlignment.CENTER;
    java.lang.String str1 = verticalAlignment0.toString();
    java.lang.Object obj2 = null;
    boolean b3 = verticalAlignment0.equals(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(verticalAlignment0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "VerticalAlignment.CENTER"+ "'", str1.equals("VerticalAlignment.CENTER"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

}
