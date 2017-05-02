
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest75 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest75.test01"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getDisplayedMnemonic();
    dateCellRenderer0.validate();
    dateCellRenderer0.setVisible(false);
    javax.swing.JRootPane jRootPane5 = dateCellRenderer0.getRootPane();
    boolean b6 = dateCellRenderer0.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jRootPane5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest75.test02"); }

    org.jfree.util.LogContext logContext2 = new org.jfree.util.LogContext("NO_CHANGE");
    org.jfree.util.Log.log(10, (java.lang.Object)"NO_CHANGE");

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest75.test03"); }

    org.jfree.JCommonInfo jCommonInfo0 = org.jfree.JCommonInfo.getInstance();
    org.jfree.base.BootableProjectInfo bootableProjectInfo6 = new org.jfree.base.BootableProjectInfo("hi!", "hi!", "content", "PanelUI", "");
    jCommonInfo0.addOptionalLibrary((org.jfree.base.Library)bootableProjectInfo6);
    java.util.List list8 = jCommonInfo0.getContributors();
    boolean b9 = jCommonInfo0.isAutoBoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jCommonInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest75.test04"); }

    org.jfree.util.LogContext logContext1 = new org.jfree.util.LogContext("NO_CHANGE");
    org.jfree.ui.ApplicationFrame applicationFrame3 = new org.jfree.ui.ApplicationFrame("");
    int i4 = applicationFrame3.getState();
    java.util.Locale locale5 = applicationFrame3.getLocale();
    applicationFrame3.transferFocusUpCycle();
    java.awt.Component component7 = applicationFrame3.getFocusOwner();
    logContext1.debug((java.lang.Object)applicationFrame3);
    boolean b9 = logContext1.isDebugEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest75.test05"); }

    org.jfree.text.TextBlock textBlock0 = new org.jfree.text.TextBlock();
    org.jfree.ui.HorizontalAlignment horizontalAlignment1 = org.jfree.ui.HorizontalAlignment.LEFT;
    textBlock0.setLineAlignment(horizontalAlignment1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(horizontalAlignment1);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest75.test06"); }

    org.jfree.date.SerialDate serialDate2 = org.jfree.date.SerialDate.createInstance(5);
    boolean b3 = org.jfree.date.SerialDateUtilities.isLastDayOfFebruary(serialDate2);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel5 = new org.jfree.ui.SerialDateChooserPanel(serialDate2, true);
    org.jfree.date.SerialDate serialDate6 = org.jfree.date.SerialDate.addYears(16, serialDate2);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.date.SerialDate serialDate8 = serialDate2.getFollowingDayOfWeek((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate6);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest75.test07"); }

    org.jfree.ui.about.ProjectInfo projectInfo0 = org.jfree.JCommon.INFO;
    projectInfo0.setLicenceText("ToolTipText");
    projectInfo0.setLicenceText("");
    java.lang.String str5 = projectInfo0.getBootClass();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(projectInfo0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "org.jfree.base.BaseBoot"+ "'", str5.equals("org.jfree.base.BaseBoot"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest75.test08"); }

    int i0 = javax.swing.SwingConstants.SOUTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 5);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest75.test09"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    boolean b4 = serialDateChooserPanel2.isCursorSet();
    java.awt.Dimension dimension5 = serialDateChooserPanel2.minimumSize();
    org.jfree.date.SerialDate serialDate6 = serialDateChooserPanel2.getDate();
    javax.swing.KeyStroke keyStroke7 = null;
    int i8 = serialDateChooserPanel2.getConditionForKeyStroke(keyStroke7);
    org.jfree.text.TextBox textBox9 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets10 = textBox9.getInteriorGap();
    double d11 = textBox9.getShadowYOffset();
    serialDateChooserPanel2.putClientProperty((java.lang.Object)d11, (java.lang.Object)31);
    serialDateChooserPanel2.setAlignmentX(1.0f);
    javax.swing.KeyStroke keyStroke16 = null;
    int i17 = serialDateChooserPanel2.getConditionForKeyStroke(keyStroke16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(serialDate6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest75.test10"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.util.Locale locale3 = applicationFrame1.getLocale();
    applicationFrame1.transferFocusUpCycle();
    java.awt.Graphics graphics5 = null;
    applicationFrame1.update(graphics5);
    java.beans.PropertyChangeListener propertyChangeListener7 = null;
    applicationFrame1.removePropertyChangeListener(propertyChangeListener7);
    org.jfree.date.SerialDate serialDate11 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel13 = new org.jfree.ui.SerialDateChooserPanel(serialDate11, true);
    serialDateChooserPanel13.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext18 = serialDateChooserPanel13.getAccessibleContext();
    java.awt.Dimension dimension19 = serialDateChooserPanel13.getPreferredSize();
    org.jfree.date.SerialDate serialDate21 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel23 = new org.jfree.ui.SerialDateChooserPanel(serialDate21, true);
    boolean b24 = serialDateChooserPanel23.getIgnoreRepaint();
    javax.swing.InputMap inputMap25 = serialDateChooserPanel23.getInputMap();
    serialDateChooserPanel13.setInputMap((int)(byte)1, inputMap25);
    java.awt.event.FocusListener[] focusListener_array27 = serialDateChooserPanel13.getFocusListeners();
    org.jfree.ui.ApplicationFrame applicationFrame29 = new org.jfree.ui.ApplicationFrame("");
    int i30 = applicationFrame29.getState();
    java.awt.event.WindowEvent windowEvent31 = null;
    applicationFrame29.windowIconified(windowEvent31);
    applicationFrame29.show();
    javax.swing.JMenuBar jMenuBar34 = applicationFrame29.getJMenuBar();
    java.awt.event.WindowStateListener[] windowStateListener_array35 = applicationFrame29.getWindowStateListeners();
    org.jfree.ui.KeyedComboBoxModel keyedComboBoxModel36 = new org.jfree.ui.KeyedComboBoxModel((java.lang.Object[])focusListener_array27, (java.lang.Object[])windowStateListener_array35);
    org.jfree.ui.ApplicationFrame applicationFrame38 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener39 = null;
    applicationFrame38.removeWindowStateListener(windowStateListener39);
    boolean b41 = applicationFrame38.isValidateRoot();
    org.jfree.date.SerialDate serialDate42 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel44 = new org.jfree.ui.SerialDateChooserPanel(serialDate42, true);
    boolean b45 = serialDateChooserPanel44.getIgnoreRepaint();
    javax.swing.InputMap inputMap46 = serialDateChooserPanel44.getInputMap();
    java.awt.Rectangle rectangle47 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle48 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b49 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle47, (java.awt.geom.Rectangle2D)rectangle48);
    java.awt.Rectangle rectangle50 = serialDateChooserPanel44.getBounds(rectangle48);
    org.jfree.date.SerialDate serialDate51 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel53 = new org.jfree.ui.SerialDateChooserPanel(serialDate51, true);
    boolean b54 = serialDateChooserPanel53.getIgnoreRepaint();
    java.awt.Rectangle rectangle55 = serialDateChooserPanel53.getVisibleRect();
    boolean b56 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle48, (java.awt.Shape)rectangle55);
    applicationFrame38.setMaximizedBounds(rectangle48);
    javax.accessibility.AccessibleContext accessibleContext58 = applicationFrame38.getAccessibleContext();
    java.awt.event.WindowEvent windowEvent59 = null;
    applicationFrame38.windowDeiconified(windowEvent59);
    org.jfree.text.TextBox textBox61 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets62 = textBox61.getInteriorGap();
    java.awt.Rectangle rectangle63 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle64 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b65 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle63, (java.awt.geom.Rectangle2D)rectangle64);
    rectangleInsets62.trim((java.awt.geom.Rectangle2D)rectangle64);
    double d67 = rectangleInsets62.getLeft();
    org.jfree.text.TextBox textBox68 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets69 = textBox68.getInteriorGap();
    java.awt.Rectangle rectangle70 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle71 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b72 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle70, (java.awt.geom.Rectangle2D)rectangle71);
    rectangleInsets69.trim((java.awt.geom.Rectangle2D)rectangle71);
    rectangleInsets62.trim((java.awt.geom.Rectangle2D)rectangle71);
    applicationFrame38.setBounds(rectangle71);
    java.awt.Font font77 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.text.TextFragment textFragment79 = new org.jfree.text.TextFragment("PanelUI");
    java.awt.Paint paint80 = textFragment79.getPaint();
    org.jfree.text.TextFragment textFragment81 = new org.jfree.text.TextFragment("org.jfree.ui.SerialDateChooserPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", font77, paint80);
    keyedComboBoxModel36.add((java.lang.Object)rectangle71, (java.lang.Object)font77);
    org.jfree.ui.FontChooserDialog fontChooserDialog83 = new org.jfree.ui.FontChooserDialog((java.awt.Frame)applicationFrame1, "black", false, font77);
    javax.swing.TransferHandler transferHandler84 = null;
    fontChooserDialog83.setTransferHandler(transferHandler84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowStateListener_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d67 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint80);

  }

}
