
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest81 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest81.test01"); }

    org.jfree.date.DayOfWeekInMonthRule dayOfWeekInMonthRule0 = new org.jfree.date.DayOfWeekInMonthRule();
    int i1 = dayOfWeekInMonthRule0.getCount();
    int i2 = dayOfWeekInMonthRule0.getCount();
    org.jfree.date.RelativeDayOfWeekRule relativeDayOfWeekRule5 = new org.jfree.date.RelativeDayOfWeekRule((org.jfree.date.AnnualDateRule)dayOfWeekInMonthRule0, 12, (-1));
    int i6 = relativeDayOfWeekRule5.getRelative();
    org.jfree.date.RelativeDayOfWeekRule relativeDayOfWeekRule9 = new org.jfree.date.RelativeDayOfWeekRule((org.jfree.date.AnnualDateRule)relativeDayOfWeekRule5, (int)(byte)100, 2958465);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.date.SerialDate serialDate11 = relativeDayOfWeekRule5.getDate((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest81.test02"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    java.awt.LayoutManager layoutManager4 = null;
    applicationFrame1.setLayout(layoutManager4);
    applicationFrame1.show();
    java.awt.Shape shape7 = applicationFrame1.getShape();
    java.awt.MenuBar menuBar8 = applicationFrame1.getMenuBar();
    java.awt.Image image9 = null;
    boolean b15 = applicationFrame1.imageUpdate(image9, 31, (int)(byte)100, (-1), 2958465, 15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest81.test03"); }

    org.jfree.io.IOUtils iOUtils0 = org.jfree.io.IOUtils.getInstance();
    java.lang.String str2 = iOUtils0.stripFileExtension("hi!");
    java.io.InputStream inputStream3 = null;
    java.io.OutputStream outputStream4 = null;
    // The following exception was thrown during execution in test generation
    try {
    iOUtils0.copyStreams(inputStream3, outputStream4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iOUtils0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest81.test04"); }

    org.jfree.date.SpreadsheetDate spreadsheetDate1 = new org.jfree.date.SpreadsheetDate(16);
    java.util.Date date2 = spreadsheetDate1.toDate();
    int i3 = spreadsheetDate1.getDayOfWeek();
    org.jfree.date.SerialDate serialDate6 = org.jfree.date.SerialDate.createInstance(5);
    org.jfree.date.SerialDate serialDate7 = org.jfree.date.SerialDate.addDays((int)(short)1, serialDate6);
    org.jfree.date.SerialDate serialDate9 = org.jfree.date.SerialDate.createInstance(5);
    boolean b10 = org.jfree.date.SerialDateUtilities.isLastDayOfFebruary(serialDate9);
    int i11 = org.jfree.date.SerialDateUtilities.dayCount30PSA(serialDate6, serialDate9);
    org.jfree.date.SerialDate serialDate14 = org.jfree.date.SerialDate.createInstance(5);
    boolean b15 = org.jfree.date.SerialDateUtilities.isLastDayOfFebruary(serialDate14);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel17 = new org.jfree.ui.SerialDateChooserPanel(serialDate14, true);
    org.jfree.date.SerialDate serialDate18 = org.jfree.date.SerialDate.addYears(16, serialDate14);
    org.jfree.date.SerialDate serialDate19 = serialDate9.getEndOfCurrentMonth(serialDate18);
    int i20 = spreadsheetDate1.compare(serialDate9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 11);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest81.test05"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    javax.swing.InputMap inputMap4 = serialDateChooserPanel2.getInputMap();
    javax.swing.TransferHandler transferHandler5 = null;
    serialDateChooserPanel2.setTransferHandler(transferHandler5);
    javax.swing.plaf.PanelUI panelUI7 = null;
    serialDateChooserPanel2.setUI(panelUI7);
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array9 = serialDateChooserPanel2.getHierarchyBoundsListeners();
    javax.swing.JRootPane jRootPane10 = serialDateChooserPanel2.getRootPane();
    serialDateChooserPanel2.firePropertyChange("ClassContext", true, false);
    serialDateChooserPanel2.layout();
    org.jfree.util.Log.info((java.lang.Object)serialDateChooserPanel2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jRootPane10);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest81.test06"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.date.SerialDate serialDate2 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel4 = new org.jfree.ui.SerialDateChooserPanel(serialDate2, true);
    java.awt.Color color5 = serialDateChooserPanel4.getForeground();
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    java.awt.Color color9 = serialDateChooserPanel8.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame11 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener12 = null;
    applicationFrame11.removeWindowStateListener(windowStateListener12);
    applicationFrame11.setCursor(0);
    org.jfree.date.SerialDate serialDate16 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel18 = new org.jfree.ui.SerialDateChooserPanel(serialDate16, true);
    java.awt.Color color19 = serialDateChooserPanel18.getForeground();
    applicationFrame11.setBackground(color19);
    boolean b21 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color9, (java.awt.Paint)color19);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel22 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, false, color5, color19);
    java.io.ObjectOutputStream objectOutputStream23 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.io.SerialUtilities.writePaint((java.awt.Paint)color5, objectOutputStream23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest81.test07"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    org.jfree.date.SerialDate serialDate3 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel5 = new org.jfree.ui.SerialDateChooserPanel(serialDate3, true);
    serialDateChooserPanel5.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext10 = serialDateChooserPanel5.getAccessibleContext();
    java.awt.Dimension dimension11 = serialDateChooserPanel5.getPreferredSize();
    applicationFrame1.setSize(dimension11);
    org.jfree.date.SerialDate serialDate13 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel15 = new org.jfree.ui.SerialDateChooserPanel(serialDate13, true);
    serialDateChooserPanel15.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b20 = serialDateChooserPanel15.isFocusTraversable();
    java.awt.Image image21 = null;
    org.jfree.date.SerialDate serialDate22 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel24 = new org.jfree.ui.SerialDateChooserPanel(serialDate22, true);
    boolean b25 = serialDateChooserPanel24.getIgnoreRepaint();
    boolean b26 = serialDateChooserPanel24.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array27 = serialDateChooserPanel24.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate28 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel30 = new org.jfree.ui.SerialDateChooserPanel(serialDate28, true);
    boolean b31 = serialDateChooserPanel30.getIgnoreRepaint();
    serialDateChooserPanel30.setAlignmentX((float)(byte)10);
    java.awt.Component component34 = serialDateChooserPanel24.add((java.awt.Component)serialDateChooserPanel30);
    java.lang.String str35 = serialDateChooserPanel30.getUIClassID();
    boolean b36 = serialDateChooserPanel30.isBackgroundSet();
    int i37 = serialDateChooserPanel15.checkImage(image21, (java.awt.image.ImageObserver)serialDateChooserPanel30);
    org.jfree.ui.L1R2ButtonPanel l1R2ButtonPanel41 = new org.jfree.ui.L1R2ButtonPanel("", "hi!", "notify-field-accept");
    javax.swing.JButton jButton42 = l1R2ButtonPanel41.getLeftButton();
    java.lang.Object obj43 = serialDateChooserPanel15.getClientProperty((java.lang.Object)l1R2ButtonPanel41);
    javax.swing.JButton jButton44 = l1R2ButtonPanel41.getRightButton1();
    applicationFrame1.setLocationRelativeTo((java.awt.Component)jButton44);
    applicationFrame1.setDefaultCloseOperation(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "PanelUI"+ "'", str35.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton44);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest81.test08"); }

    int i1 = org.jfree.date.SerialDate.stringToWeekdayCode("VerticalAlignment.CENTER");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest81.test09"); }

    org.jfree.base.BasicProjectInfo basicProjectInfo4 = new org.jfree.base.BasicProjectInfo("ClassContext", "RectangleInsets[t=1.0,l=3.0,b=1.0,r=3.0]", "", "");

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest81.test10"); }

    java.lang.String[] str_array0 = org.jfree.util.LogTarget.LEVELS;
    org.jfree.ui.FilesystemFilter filesystemFilter3 = new org.jfree.ui.FilesystemFilter(str_array0, "http://www.jfree.org/jcommon/", true);
    java.lang.String str4 = filesystemFilter3.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "http://www.jfree.org/jcommon/"+ "'", str4.equals("http://www.jfree.org/jcommon/"));

  }

}
