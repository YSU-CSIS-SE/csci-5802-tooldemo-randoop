
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest31 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest31.test01"); }

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
    java.beans.VetoableChangeListener[] vetoableChangeListener_array20 = serialDateChooserPanel2.getVetoableChangeListeners();
    
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
    org.junit.Assert.assertNotNull(vetoableChangeListener_array20);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest31.test02"); }

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
    org.jfree.text.TextLine textLine36 = textBlock0.getLastLine();
    
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
    org.junit.Assert.assertNull(textLine36);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest31.test03"); }

    org.jfree.ui.ApplicationFrame applicationFrame2 = new org.jfree.ui.ApplicationFrame("");
    int i3 = applicationFrame2.getState();
    java.util.Locale locale4 = applicationFrame2.getLocale();
    java.lang.ClassLoader classLoader5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle6 = org.jfree.util.ResourceBundleWrapper.getBundle("hi!", locale4, classLoader5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale4);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest31.test04"); }

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
    org.jfree.text.TextBlock textBlock34 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D35 = null;
    org.jfree.text.TextBlock textBlock38 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D39 = null;
    org.jfree.text.TextBlockAnchor textBlockAnchor42 = org.jfree.text.TextBlockAnchor.TOP_RIGHT;
    java.awt.Shape shape46 = textBlock38.calculateBounds(graphics2D39, (float)12, (float)(short)-1, textBlockAnchor42, (float)' ', (float)32, (double)(-1.0f));
    textBlock34.draw(graphics2D35, (float)5, (float)(short)1, textBlockAnchor42, (float)(short)-1, (float)(short)100, (double)1.0f);
    org.jfree.ui.HorizontalAlignment horizontalAlignment51 = textBlock34.getLineAlignment();
    textBlock17.setLineAlignment(horizontalAlignment51);
    textBlock0.setLineAlignment(horizontalAlignment51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(horizontalAlignment51);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest31.test05"); }

    boolean b2 = org.jfree.util.StringUtils.startsWithIgnoreCase("GradientPaintTransformType.HORIZONTAL", "NO_CHANGE");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest31.test06"); }

    java.awt.Dialog dialog0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.ui.RefineryUtilities.positionDialogRelativeToParent(dialog0, (double)100, (double)(-1.0f));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest31.test07"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    boolean b4 = applicationFrame1.isValidateRoot();
    applicationFrame1.doLayout();
    applicationFrame1.setState(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest31.test08"); }

    org.jfree.ui.about.ProjectInfo projectInfo1 = org.jfree.JCommon.INFO;
    org.jfree.util.Log.log(31, (java.lang.Object)projectInfo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(projectInfo1);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest31.test09"); }

    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle1 = org.jfree.util.ResourceBundleWrapper.getBundle("TableOrder.BY_COLUMN");
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest31.test10"); }

    org.jfree.util.ObjectTable objectTable1 = new org.jfree.util.ObjectTable((int)'#');

  }

}
