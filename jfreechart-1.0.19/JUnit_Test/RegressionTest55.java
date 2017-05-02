
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest55 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest55.test01"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    // The following exception was thrown during execution in test generation
    try {
    int i5 = applicationFrame1.getBaseline((-1), (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest55.test02"); }

    int[] i_array5 = new int[] { (byte)100, 4, 6, (-1) };
    org.jfree.layout.FormatLayout formatLayout6 = new org.jfree.layout.FormatLayout((int)'#', i_array5);
    formatLayout6.complete();
    java.awt.Container container8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Dimension dimension9 = formatLayout6.preferredLayoutSize(container8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest55.test03"); }

    int i0 = org.jfree.ui.BevelArrowIcon.UP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest55.test04"); }

    org.jfree.base.BootableProjectInfo bootableProjectInfo5 = new org.jfree.base.BootableProjectInfo("hi!", "hi!", "content", "PanelUI", "");
    java.lang.String str6 = bootableProjectInfo5.getInfo();
    java.lang.String str7 = bootableProjectInfo5.getLicenceName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "content"+ "'", str6.equals("content"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest55.test05"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getDisplayedMnemonic();
    dateCellRenderer0.validate();
    org.jfree.date.SerialDate serialDate3 = null;
    org.jfree.date.SerialDate serialDate5 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel7 = new org.jfree.ui.SerialDateChooserPanel(serialDate5, true);
    java.awt.Color color8 = serialDateChooserPanel7.getForeground();
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel11 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, true);
    java.awt.Color color12 = serialDateChooserPanel11.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame14 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener15 = null;
    applicationFrame14.removeWindowStateListener(windowStateListener15);
    applicationFrame14.setCursor(0);
    org.jfree.date.SerialDate serialDate19 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel21 = new org.jfree.ui.SerialDateChooserPanel(serialDate19, true);
    java.awt.Color color22 = serialDateChooserPanel21.getForeground();
    applicationFrame14.setBackground(color22);
    boolean b24 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color12, (java.awt.Paint)color22);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate3, false, color8, color22);
    dateCellRenderer0.setBackground(color22);
    javax.swing.Icon icon27 = dateCellRenderer0.getIcon();
    org.jfree.ui.ApplicationFrame applicationFrame29 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent30 = null;
    applicationFrame29.windowDeiconified(windowEvent30);
    java.awt.LayoutManager layoutManager32 = null;
    applicationFrame29.setLayout(layoutManager32);
    java.beans.PropertyChangeListener propertyChangeListener34 = null;
    applicationFrame29.removePropertyChangeListener(propertyChangeListener34);
    java.awt.Image image36 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer37 = new org.jfree.ui.DateCellRenderer();
    int i38 = dateCellRenderer37.getDisplayedMnemonic();
    dateCellRenderer37.validate();
    int i40 = applicationFrame29.checkImage(image36, (java.awt.image.ImageObserver)dateCellRenderer37);
    org.jfree.ui.BevelArrowIcon bevelArrowIcon44 = new org.jfree.ui.BevelArrowIcon((int)'4', true, false);
    dateCellRenderer37.setIcon((javax.swing.Icon)bevelArrowIcon44);
    dateCellRenderer0.setIcon((javax.swing.Icon)bevelArrowIcon44);
    dateCellRenderer0.firePropertyChange("section", (float)(short)-1, (float)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 32);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest55.test06"); }

    org.jfree.text.TextLine textLine1 = new org.jfree.text.TextLine("NO_CHANGE");
    org.jfree.text.TextFragment textFragment2 = textLine1.getLastTextFragment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textFragment2);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest55.test07"); }

    org.jfree.ui.RectangleAnchor rectangleAnchor0 = org.jfree.ui.RectangleAnchor.BOTTOM;
    boolean b2 = rectangleAnchor0.equals((java.lang.Object)"TableOrder.BY_COLUMN");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleAnchor0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest55.test08"); }

    org.jfree.date.SerialDate serialDate2 = org.jfree.date.SerialDate.createInstance(5);
    org.jfree.date.SerialDate serialDate3 = org.jfree.date.SerialDate.addDays((int)(short)1, serialDate2);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.date.SerialDate serialDate5 = serialDate2.getFollowingDayOfWeek((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate3);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest55.test09"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    applicationFrame1.setLocationByPlatform(false);
    java.awt.Container container5 = applicationFrame1.getFocusCycleRootAncestor();
    applicationFrame1.setCursor((int)(short)0);
    java.awt.Shape shape8 = applicationFrame1.getShape();
    boolean b9 = applicationFrame1.isFontSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest55.test10"); }

    org.jfree.ui.Size2D size2D0 = new org.jfree.ui.Size2D();
    double d1 = size2D0.width;
    double d2 = size2D0.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);

  }

}
