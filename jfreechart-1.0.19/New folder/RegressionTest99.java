
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest99 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest99.test01"); }

    // The following exception was thrown during execution in test generation
    try {
    org.jfree.date.DayAndMonthRule dayAndMonthRule2 = new org.jfree.date.DayAndMonthRule(6, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest99.test02"); }

    java.awt.Font font3 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.date.SerialDate serialDate4 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel6 = new org.jfree.ui.SerialDateChooserPanel(serialDate4, true);
    java.awt.Color color7 = serialDateChooserPanel6.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame9 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener10 = null;
    applicationFrame9.removeWindowStateListener(windowStateListener10);
    applicationFrame9.setCursor(0);
    org.jfree.date.SerialDate serialDate14 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel16 = new org.jfree.ui.SerialDateChooserPanel(serialDate14, true);
    java.awt.Color color17 = serialDateChooserPanel16.getForeground();
    applicationFrame9.setBackground(color17);
    boolean b19 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color7, (java.awt.Paint)color17);
    org.jfree.text.TextFragment textFragment20 = new org.jfree.text.TextFragment("ClassContext", font3, (java.awt.Paint)color17);
    org.jfree.date.SerialDate serialDate21 = null;
    org.jfree.date.SerialDate serialDate23 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate23, true);
    java.awt.Color color26 = serialDateChooserPanel25.getForeground();
    org.jfree.date.SerialDate serialDate27 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel29 = new org.jfree.ui.SerialDateChooserPanel(serialDate27, true);
    java.awt.Color color30 = serialDateChooserPanel29.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame32 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener33 = null;
    applicationFrame32.removeWindowStateListener(windowStateListener33);
    applicationFrame32.setCursor(0);
    org.jfree.date.SerialDate serialDate37 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel39 = new org.jfree.ui.SerialDateChooserPanel(serialDate37, true);
    java.awt.Color color40 = serialDateChooserPanel39.getForeground();
    applicationFrame32.setBackground(color40);
    boolean b42 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color30, (java.awt.Paint)color40);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel43 = new org.jfree.ui.SerialDateChooserPanel(serialDate21, false, color26, color40);
    javax.swing.JLabel jLabel44 = org.jfree.ui.RefineryUtilities.createJLabel("SortOrder.ASCENDING", font3, color26);
    org.jfree.date.SerialDate serialDate45 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel47 = new org.jfree.ui.SerialDateChooserPanel(serialDate45, true);
    java.awt.Color color48 = serialDateChooserPanel47.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame50 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener51 = null;
    applicationFrame50.removeWindowStateListener(windowStateListener51);
    applicationFrame50.setCursor(0);
    org.jfree.date.SerialDate serialDate55 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel57 = new org.jfree.ui.SerialDateChooserPanel(serialDate55, true);
    java.awt.Color color58 = serialDateChooserPanel57.getForeground();
    applicationFrame50.setBackground(color58);
    boolean b60 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color48, (java.awt.Paint)color58);
    org.jfree.text.TextBlock textBlock61 = org.jfree.text.TextUtilities.createTextBlock("LabelUI", font3, (java.awt.Paint)color48);
    org.jfree.ui.FontDisplayField fontDisplayField62 = new org.jfree.ui.FontDisplayField(font3);
    int i63 = fontDisplayField62.getCaretPosition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLabel44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlock61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest99.test03"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    double d1 = textBox0.getShadowXOffset();
    org.jfree.ui.HorizontalAlignment horizontalAlignment2 = org.jfree.ui.HorizontalAlignment.RIGHT;
    boolean b3 = textBox0.equals((java.lang.Object)horizontalAlignment2);
    org.jfree.util.StrokeList strokeList4 = new org.jfree.util.StrokeList();
    org.jfree.text.TextBox textBox6 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets7 = textBox6.getInteriorGap();
    org.jfree.text.TextBlock textBlock8 = null;
    textBox6.setTextBlock(textBlock8);
    java.awt.Stroke stroke10 = textBox6.getOutlineStroke();
    strokeList4.setStroke(10, stroke10);
    textBox0.setOutlineStroke(stroke10);
    java.awt.Paint paint13 = org.jfree.text.TextFragment.DEFAULT_PAINT;
    textBox0.setBackgroundPaint(paint13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(horizontalAlignment2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(stroke10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint13);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest99.test04"); }

    int i0 = org.jfree.ui.ArrowPanel.UP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest99.test05"); }

    org.jfree.date.SerialDate serialDate1 = org.jfree.date.SerialDate.createInstance(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate1);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest99.test06"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    applicationFrame1.firePropertyChange("hi!", '#', '4');
    java.awt.FocusTraversalPolicy focusTraversalPolicy8 = applicationFrame1.getFocusTraversalPolicy();
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel11 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, true);
    boolean b12 = serialDateChooserPanel11.getIgnoreRepaint();
    javax.swing.InputMap inputMap13 = serialDateChooserPanel11.getInputMap();
    javax.swing.TransferHandler transferHandler14 = null;
    serialDateChooserPanel11.setTransferHandler(transferHandler14);
    javax.swing.plaf.PanelUI panelUI16 = null;
    serialDateChooserPanel11.setUI(panelUI16);
    java.awt.Dimension dimension18 = serialDateChooserPanel11.getMaximumSize();
    applicationFrame1.resize(dimension18);
    java.awt.peer.ComponentPeer componentPeer20 = applicationFrame1.getPeer();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusTraversalPolicy8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentPeer20);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest99.test07"); }

    org.jfree.text.TextFragment textFragment1 = new org.jfree.text.TextFragment("PanelUI");
    java.lang.String str2 = textFragment1.getText();
    java.awt.Graphics2D graphics2D3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.ui.Size2D size2D4 = textFragment1.calculateDimensions(graphics2D3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "PanelUI"+ "'", str2.equals("PanelUI"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest99.test08"); }

    org.jfree.text.TextBlockAnchor textBlockAnchor0 = org.jfree.text.TextBlockAnchor.CENTER_LEFT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest99.test09"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getIconTextGap();
    javax.swing.InputVerifier inputVerifier2 = null;
    dateCellRenderer0.setInputVerifier(inputVerifier2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest99.test10"); }

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
    java.awt.event.FocusListener[] focusListener_array19 = dateCellRenderer9.getFocusListeners();
    java.awt.Rectangle rectangle20 = dateCellRenderer9.getBounds();
    java.awt.event.ContainerListener[] containerListener_array21 = dateCellRenderer9.getContainerListeners();
    javax.swing.KeyStroke keyStroke22 = null;
    int i23 = dateCellRenderer9.getConditionForKeyStroke(keyStroke22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(containerListener_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));

  }

}
