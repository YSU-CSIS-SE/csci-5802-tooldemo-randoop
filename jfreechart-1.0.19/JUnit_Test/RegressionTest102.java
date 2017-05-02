
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest102 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest102.test01"); }

    org.jfree.util.BooleanList booleanList0 = new org.jfree.util.BooleanList();
    booleanList0.setBoolean(31, (java.lang.Boolean)false);
    org.jfree.resources.JCommonResources jCommonResources4 = new org.jfree.resources.JCommonResources();
    java.util.Locale locale5 = jCommonResources4.getLocale();
    boolean b6 = booleanList0.equals((java.lang.Object)jCommonResources4);
    org.jfree.util.ResourceBundleSupport resourceBundleSupport7 = new org.jfree.util.ResourceBundleSupport((java.util.ResourceBundle)jCommonResources4);
    javax.swing.Icon icon10 = resourceBundleSupport7.createTransparentIcon(16, (int)(short)1);
    java.util.Locale locale11 = resourceBundleSupport7.getLocale();
    // The following exception was thrown during execution in test generation
    try {
    javax.swing.JMenu jMenu13 = resourceBundleSupport7.createMenu("org.jfree.ui.FloatDimension:={width=0.0, height=0.0}");
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(icon10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale11);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest102.test02"); }

    java.util.Locale locale1 = null;
    java.lang.ClassLoader classLoader2 = null;
    java.util.ResourceBundle.Control control3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle4 = java.util.ResourceBundle.getBundle("notify-field-accept", locale1, classLoader2, control3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest102.test03"); }

    org.jfree.base.BootableProjectInfo bootableProjectInfo5 = new org.jfree.base.BootableProjectInfo("hi!", "hi!", "content", "PanelUI", "");
    bootableProjectInfo5.setInfo("notify-field-accept");

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest102.test04"); }

    org.jfree.ui.ApplicationFrame applicationFrame2 = new org.jfree.ui.ApplicationFrame("");
    int i3 = applicationFrame2.getState();
    java.util.Locale locale4 = applicationFrame2.getLocale();
    java.util.ResourceBundle.Control control5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.ResourceBundle resourceBundle6 = java.util.ResourceBundle.getBundle("Jan", locale4, control5);
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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest102.test05"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("NO_CHANGE");
    // The following exception was thrown during execution in test generation
    try {
    applicationFrame1.setOpacity((float)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest102.test06"); }

    org.jfree.layout.RadialLayout radialLayout0 = new org.jfree.layout.RadialLayout();
    org.jfree.date.SerialDate serialDate1 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel3 = new org.jfree.ui.SerialDateChooserPanel(serialDate1, true);
    boolean b4 = serialDateChooserPanel3.getIgnoreRepaint();
    serialDateChooserPanel3.resize(8, (int)(short)-1);
    java.awt.Dimension dimension8 = serialDateChooserPanel3.getPreferredSize();
    serialDateChooserPanel3.setAutoscrolls(true);
    boolean b11 = serialDateChooserPanel3.getVerifyInputWhenFocusTarget();
    serialDateChooserPanel3.layout();
    int i13 = serialDateChooserPanel3.getWidth();
    java.awt.Dimension dimension14 = radialLayout0.preferredLayoutSize((java.awt.Container)serialDateChooserPanel3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension14);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest102.test07"); }

    int i0 = org.jfree.layout.FormatLayout.LCLCB;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 5);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest102.test08"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    applicationFrame1.firePropertyChange("hi!", '#', '4');
    boolean b8 = applicationFrame1.isFocusableWindow();
    java.awt.event.WindowEvent windowEvent9 = null;
    applicationFrame1.windowDeactivated(windowEvent9);
    java.awt.event.WindowEvent windowEvent11 = null;
    applicationFrame1.windowDeiconified(windowEvent11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest102.test09"); }

    org.jfree.util.Rotation rotation0 = org.jfree.util.Rotation.CLOCKWISE;
    double d1 = rotation0.getFactor();
    double d2 = rotation0.getFactor();
    org.jfree.date.SerialDate serialDate3 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel5 = new org.jfree.ui.SerialDateChooserPanel(serialDate3, true);
    java.awt.Color color6 = serialDateChooserPanel5.getForeground();
    java.awt.Event event7 = null;
    boolean b10 = serialDateChooserPanel5.mouseUp(event7, (int)(byte)10, (int)(short)100);
    java.awt.Rectangle rectangle11 = serialDateChooserPanel5.bounds();
    boolean b12 = serialDateChooserPanel5.isFocusOwner();
    boolean b13 = rotation0.equals((java.lang.Object)serialDateChooserPanel5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rotation0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest102.test10"); }

    org.jfree.ui.about.ProjectInfo projectInfo0 = org.jfree.JCommon.INFO;
    projectInfo0.setLicenceText("ToolTipText");
    projectInfo0.setLicenceText("");
    java.util.List list5 = projectInfo0.getContributors();
    // The following exception was thrown during execution in test generation
    try {
    java.util.Collection collection6 = org.jfree.util.ObjectUtilities.deepClone((java.util.Collection)list5);
      org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException");
    } catch (java.lang.CloneNotSupportedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(projectInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);

  }

}
