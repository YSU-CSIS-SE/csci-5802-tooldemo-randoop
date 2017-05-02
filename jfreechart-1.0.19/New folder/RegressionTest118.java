
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest118 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest118.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    serialDateChooserPanel2.setAlignmentX((float)(byte)10);
    java.awt.Dimension dimension6 = serialDateChooserPanel2.getMaximumSize();
    java.awt.Dimension dimension7 = serialDateChooserPanel2.minimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension7);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest118.test02"); }

    org.jfree.ui.TextAnchor textAnchor0 = org.jfree.ui.TextAnchor.TOP_CENTER;
    boolean b1 = textAnchor0.isBaseline();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest118.test03"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    applicationFrame1.setExtendedState(6);
    java.awt.Dimension dimension6 = applicationFrame1.size();
    java.awt.Window.Type type7 = applicationFrame1.getType();
    applicationFrame1.reshape((int)(byte)0, 8, (int)(byte)-1, (int)'#');
    applicationFrame1.setState(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + java.awt.Window.Type.NORMAL + "'", type7.equals(java.awt.Window.Type.NORMAL));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest118.test04"); }

    org.jfree.ui.DateChooserPanel dateChooserPanel0 = new org.jfree.ui.DateChooserPanel();
    java.util.Date date1 = dateChooserPanel0.getDate();
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
    dateChooserPanel0.setChosenMonthButtonColor(color15);
    java.awt.Color color19 = dateChooserPanel0.getChosenOtherButtonColor();
    javax.swing.plaf.PanelUI panelUI20 = dateChooserPanel0.getUI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(panelUI20);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest118.test05"); }

    org.jfree.util.BooleanList booleanList0 = new org.jfree.util.BooleanList();
    booleanList0.setBoolean(31, (java.lang.Boolean)false);
    org.jfree.resources.JCommonResources jCommonResources4 = new org.jfree.resources.JCommonResources();
    java.util.Locale locale5 = jCommonResources4.getLocale();
    boolean b6 = booleanList0.equals((java.lang.Object)jCommonResources4);
    org.jfree.util.ResourceBundleSupport resourceBundleSupport7 = new org.jfree.util.ResourceBundleSupport((java.util.ResourceBundle)jCommonResources4);
    // The following exception was thrown during execution in test generation
    try {
    javax.swing.KeyStroke keyStroke9 = resourceBundleSupport7.getKeyStroke("http://www.jfree.org/jcommon/");
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest118.test06"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    applicationFrame1.setExtendedState(6);
    java.awt.Dimension dimension6 = applicationFrame1.size();
    java.awt.Window.Type type7 = applicationFrame1.getType();
    applicationFrame1.reshape((int)(byte)0, 8, (int)(byte)-1, (int)'#');
    org.jfree.ui.ApplicationFrame applicationFrame14 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent15 = null;
    applicationFrame14.windowDeiconified(windowEvent15);
    java.awt.LayoutManager layoutManager17 = null;
    applicationFrame14.setLayout(layoutManager17);
    applicationFrame14.show();
    java.awt.Shape shape20 = applicationFrame14.getShape();
    java.awt.Dialog.ModalExclusionType modalExclusionType21 = applicationFrame14.getModalExclusionType();
    applicationFrame1.setModalExclusionType(modalExclusionType21);
    applicationFrame1.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + java.awt.Window.Type.NORMAL + "'", type7.equals(java.awt.Window.Type.NORMAL));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape20);
    org.junit.Assert.assertTrue("'" + modalExclusionType21 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType21.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest118.test07"); }

    java.lang.String[] str_array0 = org.jfree.ui.FontChooserPanel.SIZES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest118.test08"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getIconTextGap();
    javax.swing.Icon icon2 = dateCellRenderer0.getDisabledIcon();
    dateCellRenderer0.firePropertyChange("GradientPaintTransformType.HORIZONTAL", 0.0f, 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon2);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest118.test09"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    java.awt.Dimension dimension8 = serialDateChooserPanel2.getPreferredSize();
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel12 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    boolean b13 = serialDateChooserPanel12.getIgnoreRepaint();
    javax.swing.InputMap inputMap14 = serialDateChooserPanel12.getInputMap();
    serialDateChooserPanel2.setInputMap((int)(byte)1, inputMap14);
    javax.swing.JToolTip jToolTip16 = serialDateChooserPanel2.createToolTip();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jToolTip16);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest118.test10"); }

    org.jfree.ui.BevelArrowIcon bevelArrowIcon3 = new org.jfree.ui.BevelArrowIcon((int)'4', true, false);
    int i4 = bevelArrowIcon3.getIconHeight();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 11);

  }

}
