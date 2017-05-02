
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test01"); }

    boolean b1 = org.jfree.date.SerialDate.isValidWeekInMonthCode(9999);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test02"); }

    org.jfree.date.SerialDate serialDate1 = org.jfree.date.SerialDate.createInstance(5);
    org.jfree.date.SerialDate serialDate2 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i3 = org.jfree.date.SerialDateUtilities.dayCountActual(serialDate1, serialDate2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test03"); }

    java.lang.ClassLoader classLoader0 = org.jfree.util.ObjectUtilities.getClassLoader();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(classLoader0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test04"); }

    javax.swing.JDialog jDialog0 = null;
    org.jfree.ui.WizardPanel wizardPanel3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.ui.WizardDialog wizardDialog4 = new org.jfree.ui.WizardDialog(jDialog0, true, "", wizardPanel3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test05"); }

    int i0 = org.jfree.date.MonthConstants.JULY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 7);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test06"); }

    // The following exception was thrown during execution in test generation
    try {
    org.jfree.date.SerialDate serialDate3 = org.jfree.date.SerialDate.createInstance(32, (int)(short)10, 15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test07"); }

    org.jfree.ui.StrokeSample strokeSample0 = null;
    org.jfree.ui.StrokeSample strokeSample1 = null;
    org.jfree.ui.StrokeSample[] strokeSample_array2 = new org.jfree.ui.StrokeSample[] { strokeSample1 };
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.ui.StrokeChooserPanel strokeChooserPanel3 = new org.jfree.ui.StrokeChooserPanel(strokeSample0, strokeSample_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(strokeSample_array2);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test08"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    applicationFrame1.firePropertyChange("hi!", '#', '4');
    java.awt.GraphicsConfiguration graphicsConfiguration8 = applicationFrame1.getGraphicsConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graphicsConfiguration8);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test09"); }

    org.jfree.util.SortOrder sortOrder0 = org.jfree.util.SortOrder.DESCENDING;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(sortOrder0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21.test10"); }

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
    int i13 = dateCellRenderer9.getVerticalAlignment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

}
