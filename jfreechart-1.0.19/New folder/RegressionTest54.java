
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest54 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest54.test01"); }

    org.jfree.ui.TextAnchor textAnchor0 = org.jfree.ui.TextAnchor.BOTTOM_RIGHT;
    boolean b1 = textAnchor0.isTop();
    boolean b2 = textAnchor0.isRight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest54.test02"); }

    org.jfree.ui.Size2D size2D0 = new org.jfree.ui.Size2D();
    boolean b2 = size2D0.equals((java.lang.Object)(-1.0d));
    double d3 = size2D0.height;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest54.test03"); }

    org.jfree.ui.RectangleAnchor rectangleAnchor0 = org.jfree.ui.RectangleAnchor.BOTTOM_LEFT;
    java.lang.String str1 = rectangleAnchor0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleAnchor0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RectangleAnchor.BOTTOM_LEFT"+ "'", str1.equals("RectangleAnchor.BOTTOM_LEFT"));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest54.test04"); }

    org.jfree.util.LineBreakIterator lineBreakIterator0 = new org.jfree.util.LineBreakIterator();
    java.lang.String str1 = lineBreakIterator0.getText();
    boolean b2 = lineBreakIterator0.hasNext();
    int i3 = lineBreakIterator0.nextWithEnd();
    // The following exception was thrown during execution in test generation
    try {
    lineBreakIterator0.remove();
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest54.test05"); }

    java.util.Locale locale1 = javax.swing.JComponent.getDefaultLocale();
    java.lang.ClassLoader classLoader2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle3 = org.jfree.util.ResourceBundleWrapper.getBundle("http://www.jfree.org/jcommon/", locale1, classLoader2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale1);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest54.test06"); }

    org.jfree.base.BootableProjectInfo bootableProjectInfo4 = new org.jfree.base.BootableProjectInfo("", "PanelUI", "section", "section");

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest54.test07"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    applicationFrame1.setExtendedState(6);
    org.jfree.ui.ApplicationFrame applicationFrame7 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener8 = null;
    applicationFrame7.removeWindowStateListener(windowStateListener8);
    applicationFrame7.setExtendedState(6);
    java.awt.Dimension dimension12 = applicationFrame7.size();
    applicationFrame1.setMaximumSize(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest54.test08"); }

    int i0 = java.awt.image.ImageObserver.PROPERTIES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest54.test09"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = org.jfree.date.SerialDate.monthCodeToQuarter((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest54.test10"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    java.beans.VetoableChangeListener vetoableChangeListener3 = null;
    serialDateChooserPanel2.removeVetoableChangeListener(vetoableChangeListener3);
    java.awt.Graphics graphics5 = null;
    serialDateChooserPanel2.printComponents(graphics5);
    serialDateChooserPanel2.firePropertyChange("VerticalAlignment.CENTER", ' ', '4');
    serialDateChooserPanel2.setOpaque(true);

  }

}
