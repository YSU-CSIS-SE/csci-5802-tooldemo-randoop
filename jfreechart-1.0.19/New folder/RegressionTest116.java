
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest116 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest116.test01"); }

    org.jfree.base.AbstractBoot abstractBoot0 = org.jfree.base.BaseBoot.getInstance();
    boolean b1 = abstractBoot0.isBootInProgress();
    org.jfree.base.modules.PackageManager packageManager2 = abstractBoot0.getPackageManager();
    org.jfree.base.modules.PackageManager packageManager3 = abstractBoot0.getPackageManager();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(abstractBoot0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(packageManager2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(packageManager3);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest116.test02"); }

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
    java.awt.event.ComponentListener componentListener27 = null;
    dateCellRenderer0.removeComponentListener(componentListener27);
    java.awt.Event event29 = null;
    boolean b32 = dateCellRenderer0.mouseMove(event29, (int)(short)-1, 31);
    float f33 = dateCellRenderer0.getAlignmentX();
    
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
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f33 == 0.0f);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest116.test03"); }

    org.jfree.date.SerialDate serialDate3 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel5 = new org.jfree.ui.SerialDateChooserPanel(serialDate3, true);
    boolean b6 = serialDateChooserPanel5.getIgnoreRepaint();
    serialDateChooserPanel5.resize(8, (int)(short)-1);
    java.awt.Dimension dimension10 = serialDateChooserPanel5.getPreferredSize();
    java.lang.Exception exception12 = null;
    org.jfree.util.StackableRuntimeException stackableRuntimeException13 = new org.jfree.util.StackableRuntimeException("", exception12);
    org.jfree.util.Log.log((int)(byte)10, (java.lang.Object)dimension10, (java.lang.Exception)stackableRuntimeException13);
    org.jfree.util.Log.log((int)(byte)10, (java.lang.Object)(short)10, (java.lang.Exception)stackableRuntimeException13);
    java.lang.Throwable[] throwable_array16 = stackableRuntimeException13.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array16);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest116.test04"); }

    int[] i_array2 = new int[] {  };
    org.jfree.layout.FormatLayout formatLayout3 = new org.jfree.layout.FormatLayout((int)(short)0, i_array2);
    org.jfree.layout.FormatLayout formatLayout4 = new org.jfree.layout.FormatLayout((int)(byte)10, i_array2);
    org.jfree.ui.ApplicationFrame applicationFrame6 = new org.jfree.ui.ApplicationFrame("");
    int i7 = applicationFrame6.getState();
    java.util.Locale locale8 = applicationFrame6.getLocale();
    applicationFrame6.transferFocusUpCycle();
    java.awt.Graphics graphics10 = null;
    applicationFrame6.update(graphics10);
    java.beans.PropertyChangeListener propertyChangeListener12 = null;
    applicationFrame6.removePropertyChangeListener(propertyChangeListener12);
    applicationFrame6.transferFocusDownCycle();
    formatLayout4.addLayoutComponent((java.awt.Component)applicationFrame6);
    formatLayout4.complete();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale8);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest116.test05"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    javax.swing.InputMap inputMap4 = serialDateChooserPanel2.getInputMap();
    serialDateChooserPanel2.hide();
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    boolean b9 = serialDateChooserPanel8.getIgnoreRepaint();
    boolean b10 = serialDateChooserPanel8.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array11 = serialDateChooserPanel8.getPropertyChangeListeners();
    javax.swing.InputMap inputMap12 = serialDateChooserPanel8.getInputMap();
    boolean b13 = serialDateChooserPanel8.isForegroundSet();
    serialDateChooserPanel8.layout();
    java.awt.Point point15 = serialDateChooserPanel8.getLocation();
    java.awt.Point point16 = serialDateChooserPanel2.getLocation(point15);
    boolean b17 = serialDateChooserPanel2.isBackgroundSet();
    boolean b18 = serialDateChooserPanel2.getAutoscrolls();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest116.test06"); }

    org.jfree.util.SortedConfigurationWriter sortedConfigurationWriter0 = new org.jfree.util.SortedConfigurationWriter();
    java.io.File file1 = null;
    org.jfree.base.config.ModifiableConfiguration modifiableConfiguration2 = org.jfree.base.BaseBoot.getConfiguration();
    org.jfree.util.ExtendedConfigurationWrapper extendedConfigurationWrapper3 = new org.jfree.util.ExtendedConfigurationWrapper((org.jfree.util.Configuration)modifiableConfiguration2);
    java.util.Enumeration enumeration4 = extendedConfigurationWrapper3.getConfigProperties();
    // The following exception was thrown during execution in test generation
    try {
    sortedConfigurationWriter0.save(file1, (org.jfree.util.Configuration)extendedConfigurationWrapper3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(modifiableConfiguration2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration4);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest116.test07"); }

    org.jfree.base.config.ModifiableConfiguration modifiableConfiguration0 = org.jfree.base.BaseBoot.getConfiguration();
    org.jfree.util.ExtendedConfigurationWrapper extendedConfigurationWrapper1 = new org.jfree.util.ExtendedConfigurationWrapper((org.jfree.util.Configuration)modifiableConfiguration0);
    int i4 = extendedConfigurationWrapper1.getIntProperty("default", 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(modifiableConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest116.test08"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    double d2 = textBox0.getShadowYOffset();
    double d3 = textBox0.getShadowXOffset();
    java.lang.String[] str_array4 = org.jfree.util.LogTarget.LEVELS;
    org.jfree.ui.FilesystemFilter filesystemFilter7 = new org.jfree.ui.FilesystemFilter(str_array4, "http://www.jfree.org/jcommon/", true);
    boolean b8 = textBox0.equals((java.lang.Object)filesystemFilter7);
    double d9 = textBox0.getShadowXOffset();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest116.test09"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    java.awt.Cursor cursor4 = null;
    applicationFrame1.setCursor(cursor4);
    boolean b6 = applicationFrame1.isAlwaysOnTopSupported();
    java.awt.event.InputMethodListener inputMethodListener7 = null;
    applicationFrame1.removeInputMethodListener(inputMethodListener7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest116.test10"); }

    int i0 = javax.swing.SwingConstants.PREVIOUS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 13);

  }

}
