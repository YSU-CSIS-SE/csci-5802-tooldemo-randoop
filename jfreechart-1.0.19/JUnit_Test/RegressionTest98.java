
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest98 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest98.test01"); }

    org.jfree.ui.RectangleInsets rectangleInsets4 = new org.jfree.ui.RectangleInsets((double)(byte)1, (double)6, 100.0d, (double)10);
    double d6 = rectangleInsets4.calculateBottomInset(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 100.0d);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest98.test02"); }

    org.jfree.ui.TextAnchor textAnchor0 = org.jfree.ui.TextAnchor.BASELINE_RIGHT;
    boolean b1 = textAnchor0.isLeft();
    boolean b2 = textAnchor0.isTop();
    boolean b3 = textAnchor0.isLeft();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest98.test03"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    applicationFrame1.setCursor(0);
    java.awt.Graphics graphics6 = null;
    applicationFrame1.paint(graphics6);
    java.awt.event.WindowStateListener windowStateListener8 = null;
    applicationFrame1.addWindowStateListener(windowStateListener8);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest98.test04"); }

    java.awt.Insets insets0 = null;
    org.jfree.ui.InsetsChooserPanel insetsChooserPanel1 = new org.jfree.ui.InsetsChooserPanel(insets0);
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior2 = insetsChooserPanel1.getBaselineResizeBehavior();
    java.awt.Insets insets3 = insetsChooserPanel1.getInsetsValue();
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior2 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior2.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest98.test05"); }

    org.jfree.ui.ApplicationFrame applicationFrame2 = new org.jfree.ui.ApplicationFrame("");
    int i3 = applicationFrame2.getState();
    java.awt.event.WindowEvent windowEvent4 = null;
    applicationFrame2.windowIconified(windowEvent4);
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    serialDateChooserPanel8.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext13 = serialDateChooserPanel8.getAccessibleContext();
    java.awt.Dimension dimension14 = serialDateChooserPanel8.getPreferredSize();
    org.jfree.date.SerialDate serialDate16 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel18 = new org.jfree.ui.SerialDateChooserPanel(serialDate16, true);
    boolean b19 = serialDateChooserPanel18.getIgnoreRepaint();
    javax.swing.InputMap inputMap20 = serialDateChooserPanel18.getInputMap();
    serialDateChooserPanel8.setInputMap((int)(byte)1, inputMap20);
    java.awt.event.FocusListener[] focusListener_array22 = serialDateChooserPanel8.getFocusListeners();
    applicationFrame2.remove((java.awt.Component)serialDateChooserPanel8);
    java.awt.Dimension dimension24 = serialDateChooserPanel8.getPreferredSize();
    serialDateChooserPanel8.firePropertyChange("LabelUI", (byte)100, (byte)0);
    java.awt.Font font29 = serialDateChooserPanel8.getFont();
    java.awt.Font font33 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.date.SerialDate serialDate34 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel36 = new org.jfree.ui.SerialDateChooserPanel(serialDate34, true);
    java.awt.Color color37 = serialDateChooserPanel36.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame39 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener40 = null;
    applicationFrame39.removeWindowStateListener(windowStateListener40);
    applicationFrame39.setCursor(0);
    org.jfree.date.SerialDate serialDate44 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel46 = new org.jfree.ui.SerialDateChooserPanel(serialDate44, true);
    java.awt.Color color47 = serialDateChooserPanel46.getForeground();
    applicationFrame39.setBackground(color47);
    boolean b49 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color37, (java.awt.Paint)color47);
    org.jfree.text.TextFragment textFragment50 = new org.jfree.text.TextFragment("ClassContext", font33, (java.awt.Paint)color47);
    org.jfree.date.SerialDate serialDate51 = null;
    org.jfree.date.SerialDate serialDate53 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel55 = new org.jfree.ui.SerialDateChooserPanel(serialDate53, true);
    java.awt.Color color56 = serialDateChooserPanel55.getForeground();
    org.jfree.date.SerialDate serialDate57 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel59 = new org.jfree.ui.SerialDateChooserPanel(serialDate57, true);
    java.awt.Color color60 = serialDateChooserPanel59.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame62 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener63 = null;
    applicationFrame62.removeWindowStateListener(windowStateListener63);
    applicationFrame62.setCursor(0);
    org.jfree.date.SerialDate serialDate67 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel69 = new org.jfree.ui.SerialDateChooserPanel(serialDate67, true);
    java.awt.Color color70 = serialDateChooserPanel69.getForeground();
    applicationFrame62.setBackground(color70);
    boolean b72 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color60, (java.awt.Paint)color70);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel73 = new org.jfree.ui.SerialDateChooserPanel(serialDate51, false, color56, color70);
    javax.swing.JLabel jLabel74 = org.jfree.ui.RefineryUtilities.createJLabel("SortOrder.ASCENDING", font33, color56);
    org.jfree.date.SerialDate serialDate75 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel77 = new org.jfree.ui.SerialDateChooserPanel(serialDate75, true);
    java.awt.Color color78 = serialDateChooserPanel77.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame80 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener81 = null;
    applicationFrame80.removeWindowStateListener(windowStateListener81);
    applicationFrame80.setCursor(0);
    org.jfree.date.SerialDate serialDate85 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel87 = new org.jfree.ui.SerialDateChooserPanel(serialDate85, true);
    java.awt.Color color88 = serialDateChooserPanel87.getForeground();
    applicationFrame80.setBackground(color88);
    boolean b90 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color78, (java.awt.Paint)color88);
    org.jfree.text.TextBlock textBlock91 = org.jfree.text.TextUtilities.createTextBlock("LabelUI", font33, (java.awt.Paint)color78);
    javax.swing.JLabel jLabel92 = org.jfree.ui.RefineryUtilities.createJLabel("$ename", font29, color78);
    java.awt.event.FocusListener[] focusListener_array93 = jLabel92.getFocusListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLabel74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlock91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLabel92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array93);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest98.test06"); }

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
    java.lang.String str23 = serialDateChooserPanel7.getUIClassID();
    java.beans.VetoableChangeListener[] vetoableChangeListener_array24 = serialDateChooserPanel7.getVetoableChangeListeners();
    boolean b25 = serialDateChooserPanel7.isBackgroundSet();
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "PanelUI"+ "'", str23.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(vetoableChangeListener_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest98.test07"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    applicationFrame1.setCursor(0);
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    java.awt.Color color9 = serialDateChooserPanel8.getForeground();
    applicationFrame1.setBackground(color9);
    java.awt.Image image11 = null;
    org.jfree.ui.ApplicationFrame applicationFrame15 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent16 = null;
    applicationFrame15.windowDeiconified(windowEvent16);
    applicationFrame15.firePropertyChange("hi!", '#', '4');
    java.awt.FocusTraversalPolicy focusTraversalPolicy22 = applicationFrame15.getFocusTraversalPolicy();
    java.awt.event.InputMethodListener inputMethodListener23 = null;
    applicationFrame15.addInputMethodListener(inputMethodListener23);
    boolean b25 = applicationFrame1.prepareImage(image11, (int)(byte)1, 4, (java.awt.image.ImageObserver)applicationFrame15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusTraversalPolicy22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest98.test08"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    java.awt.Cursor cursor4 = null;
    applicationFrame1.setCursor(cursor4);
    java.awt.Image image6 = null;
    boolean b12 = applicationFrame1.imageUpdate(image6, (int)'4', (int)(short)1, 8, (int)(byte)100, (int)'#');
    java.awt.Font font14 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.date.SerialDate serialDate15 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel17 = new org.jfree.ui.SerialDateChooserPanel(serialDate15, true);
    java.awt.Color color18 = serialDateChooserPanel17.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame20 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener21 = null;
    applicationFrame20.removeWindowStateListener(windowStateListener21);
    applicationFrame20.setCursor(0);
    org.jfree.date.SerialDate serialDate25 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel27 = new org.jfree.ui.SerialDateChooserPanel(serialDate25, true);
    java.awt.Color color28 = serialDateChooserPanel27.getForeground();
    applicationFrame20.setBackground(color28);
    boolean b30 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color18, (java.awt.Paint)color28);
    org.jfree.text.TextFragment textFragment31 = new org.jfree.text.TextFragment("ClassContext", font14, (java.awt.Paint)color28);
    applicationFrame1.setFont(font14);
    org.jfree.ui.ApplicationFrame applicationFrame34 = new org.jfree.ui.ApplicationFrame("");
    int i35 = applicationFrame34.getState();
    java.awt.event.WindowEvent windowEvent36 = null;
    applicationFrame34.windowIconified(windowEvent36);
    org.jfree.date.SerialDate serialDate38 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel40 = new org.jfree.ui.SerialDateChooserPanel(serialDate38, true);
    serialDateChooserPanel40.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext45 = serialDateChooserPanel40.getAccessibleContext();
    java.awt.Dimension dimension46 = serialDateChooserPanel40.getPreferredSize();
    org.jfree.date.SerialDate serialDate48 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel50 = new org.jfree.ui.SerialDateChooserPanel(serialDate48, true);
    boolean b51 = serialDateChooserPanel50.getIgnoreRepaint();
    javax.swing.InputMap inputMap52 = serialDateChooserPanel50.getInputMap();
    serialDateChooserPanel40.setInputMap((int)(byte)1, inputMap52);
    java.awt.event.FocusListener[] focusListener_array54 = serialDateChooserPanel40.getFocusListeners();
    applicationFrame34.remove((java.awt.Component)serialDateChooserPanel40);
    applicationFrame34.setExtendedState(3);
    // The following exception was thrown during execution in test generation
    try {
    applicationFrame1.setGlassPane((java.awt.Component)applicationFrame34);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array54);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest98.test09"); }

    org.jfree.ui.DrawablePanel drawablePanel0 = new org.jfree.ui.DrawablePanel();
    drawablePanel0.updateUI();
    org.jfree.date.SerialDate serialDate2 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel4 = new org.jfree.ui.SerialDateChooserPanel(serialDate2, true);
    serialDateChooserPanel4.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b9 = serialDateChooserPanel4.isFocusTraversable();
    java.lang.Object obj10 = null;
    java.lang.Object obj11 = serialDateChooserPanel4.getClientProperty(obj10);
    serialDateChooserPanel4.setEnabled(false);
    int i16 = serialDateChooserPanel4.getBaseline(100, (int)(short)10);
    java.awt.Graphics graphics17 = null;
    serialDateChooserPanel4.paint(graphics17);
    org.jfree.date.SerialDate serialDate19 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel21 = new org.jfree.ui.SerialDateChooserPanel(serialDate19, true);
    boolean b22 = serialDateChooserPanel21.getIgnoreRepaint();
    javax.swing.InputMap inputMap23 = serialDateChooserPanel21.getInputMap();
    serialDateChooserPanel21.hide();
    org.jfree.date.SerialDate serialDate25 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel27 = new org.jfree.ui.SerialDateChooserPanel(serialDate25, true);
    boolean b28 = serialDateChooserPanel27.getIgnoreRepaint();
    boolean b29 = serialDateChooserPanel27.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array30 = serialDateChooserPanel27.getPropertyChangeListeners();
    javax.swing.InputMap inputMap31 = serialDateChooserPanel27.getInputMap();
    boolean b32 = serialDateChooserPanel27.isForegroundSet();
    serialDateChooserPanel27.layout();
    java.awt.Point point34 = serialDateChooserPanel27.getLocation();
    java.awt.Point point35 = serialDateChooserPanel21.getLocation(point34);
    java.awt.Point point36 = serialDateChooserPanel4.getLocation(point35);
    java.awt.Point point37 = drawablePanel0.getLocation(point35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point37);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest98.test10"); }

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
    java.awt.Dimension dimension17 = paintSample16.getMinimumSize();
    org.jfree.date.SerialDate serialDate18 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel20 = new org.jfree.ui.SerialDateChooserPanel(serialDate18, true);
    serialDateChooserPanel20.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b25 = serialDateChooserPanel20.isFocusTraversable();
    java.lang.Object obj26 = null;
    java.lang.Object obj27 = serialDateChooserPanel20.getClientProperty(obj26);
    serialDateChooserPanel20.setEnabled(false);
    int i32 = serialDateChooserPanel20.getBaseline(100, (int)(short)10);
    java.awt.Graphics graphics33 = null;
    serialDateChooserPanel20.paint(graphics33);
    org.jfree.date.SerialDate serialDate35 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel37 = new org.jfree.ui.SerialDateChooserPanel(serialDate35, true);
    boolean b38 = serialDateChooserPanel37.getIgnoreRepaint();
    javax.swing.InputMap inputMap39 = serialDateChooserPanel37.getInputMap();
    serialDateChooserPanel37.hide();
    org.jfree.date.SerialDate serialDate41 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel43 = new org.jfree.ui.SerialDateChooserPanel(serialDate41, true);
    boolean b44 = serialDateChooserPanel43.getIgnoreRepaint();
    boolean b45 = serialDateChooserPanel43.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array46 = serialDateChooserPanel43.getPropertyChangeListeners();
    javax.swing.InputMap inputMap47 = serialDateChooserPanel43.getInputMap();
    boolean b48 = serialDateChooserPanel43.isForegroundSet();
    serialDateChooserPanel43.layout();
    java.awt.Point point50 = serialDateChooserPanel43.getLocation();
    java.awt.Point point51 = serialDateChooserPanel37.getLocation(point50);
    java.awt.Point point52 = serialDateChooserPanel20.getLocation(point51);
    java.awt.Point point53 = paintSample16.getLocation(point52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point53);

  }

}
