
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest87 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest87.test01"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    org.jfree.text.TextBlock textBlock2 = null;
    textBox0.setTextBlock(textBlock2);
    java.awt.Graphics2D graphics2D4 = null;
    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument7 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array8 = lengthLimitingDocument7.getDocumentListeners();
    int i9 = lengthLimitingDocument7.getMaxLength();
    lengthLimitingDocument7.readLock();
    javax.swing.text.DocumentFilter documentFilter11 = null;
    lengthLimitingDocument7.setDocumentFilter(documentFilter11);
    javax.swing.text.DocumentFilter documentFilter13 = null;
    lengthLimitingDocument7.setDocumentFilter(documentFilter13);
    javax.swing.text.Element element15 = lengthLimitingDocument7.getBidiRootElement();
    org.jfree.text.TextBox textBox16 = new org.jfree.text.TextBox();
    double d17 = textBox16.getShadowXOffset();
    double d18 = textBox16.getShadowYOffset();
    double d19 = textBox16.getShadowXOffset();
    org.jfree.ui.RectangleAnchor rectangleAnchor20 = org.jfree.ui.RectangleAnchor.RIGHT;
    lengthLimitingDocument7.putProperty((java.lang.Object)d19, (java.lang.Object)rectangleAnchor20);
    // The following exception was thrown during execution in test generation
    try {
    textBox0.draw(graphics2D4, (float)11, (float)7, rectangleAnchor20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(element15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleAnchor20);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest87.test02"); }

    org.jfree.date.DayOfWeekInMonthRule dayOfWeekInMonthRule0 = new org.jfree.date.DayOfWeekInMonthRule();
    int i1 = dayOfWeekInMonthRule0.getCount();
    org.jfree.util.Log.info((java.lang.Object)dayOfWeekInMonthRule0);
    int i3 = dayOfWeekInMonthRule0.getMonth();
    dayOfWeekInMonthRule0.setDayOfWeek(12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest87.test03"); }

    org.jfree.util.BooleanList booleanList0 = new org.jfree.util.BooleanList();
    booleanList0.setBoolean(31, (java.lang.Boolean)false);
    booleanList0.setBoolean(100, (java.lang.Boolean)true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest87.test04"); }

    org.jfree.util.ObjectList objectList0 = new org.jfree.util.ObjectList();
    org.jfree.JCommonInfo jCommonInfo1 = org.jfree.JCommonInfo.getInstance();
    org.jfree.base.BootableProjectInfo bootableProjectInfo7 = new org.jfree.base.BootableProjectInfo("hi!", "hi!", "content", "PanelUI", "");
    jCommonInfo1.addOptionalLibrary((org.jfree.base.Library)bootableProjectInfo7);
    java.util.List list9 = jCommonInfo1.getContributors();
    int i10 = objectList0.indexOf((java.lang.Object)jCommonInfo1);
    org.jfree.date.SerialDate serialDate12 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel14 = new org.jfree.ui.SerialDateChooserPanel(serialDate12, true);
    java.awt.Color color15 = serialDateChooserPanel14.getForeground();
    java.awt.Event event16 = null;
    boolean b19 = serialDateChooserPanel14.mouseUp(event16, (int)(byte)10, (int)(short)100);
    javax.swing.InputMap inputMap21 = serialDateChooserPanel14.getInputMap(0);
    org.jfree.date.SerialDate serialDate22 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel24 = new org.jfree.ui.SerialDateChooserPanel(serialDate22, true);
    boolean b25 = serialDateChooserPanel24.getIgnoreRepaint();
    boolean b26 = serialDateChooserPanel24.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array27 = serialDateChooserPanel24.getPropertyChangeListeners();
    javax.swing.InputMap inputMap28 = serialDateChooserPanel24.getInputMap();
    boolean b29 = serialDateChooserPanel24.isForegroundSet();
    javax.swing.KeyStroke keyStroke31 = null;
    serialDateChooserPanel14.registerKeyboardAction((java.awt.event.ActionListener)serialDateChooserPanel24, "ClassContext", keyStroke31, (int)(byte)1);
    objectList0.set(4, (java.lang.Object)serialDateChooserPanel24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jCommonInfo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest87.test05"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.Rectangle rectangle2 = applicationFrame1.getMaximizedBounds();
    org.jfree.ui.ApplicationFrame applicationFrame4 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent5 = null;
    applicationFrame4.windowDeiconified(windowEvent5);
    applicationFrame4.firePropertyChange("hi!", '#', '4');
    java.awt.FocusTraversalPolicy focusTraversalPolicy11 = applicationFrame4.getFocusTraversalPolicy();
    applicationFrame1.setFocusTraversalPolicy(focusTraversalPolicy11);
    java.awt.MenuBar menuBar13 = applicationFrame1.getMenuBar();
    org.jfree.ui.ApplicationFrame applicationFrame15 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent16 = null;
    applicationFrame15.windowDeiconified(windowEvent16);
    java.awt.LayoutManager layoutManager18 = null;
    applicationFrame15.setLayout(layoutManager18);
    java.beans.PropertyChangeListener propertyChangeListener20 = null;
    applicationFrame15.removePropertyChangeListener(propertyChangeListener20);
    java.awt.Image image22 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer23 = new org.jfree.ui.DateCellRenderer();
    int i24 = dateCellRenderer23.getDisplayedMnemonic();
    dateCellRenderer23.validate();
    int i26 = applicationFrame15.checkImage(image22, (java.awt.image.ImageObserver)dateCellRenderer23);
    dateCellRenderer23.updateUI();
    org.jfree.ui.BevelArrowIcon bevelArrowIcon31 = new org.jfree.ui.BevelArrowIcon((int)'4', true, false);
    dateCellRenderer23.setDisabledIcon((javax.swing.Icon)bevelArrowIcon31);
    java.awt.event.FocusListener[] focusListener_array33 = dateCellRenderer23.getFocusListeners();
    org.jfree.ui.ApplicationFrame applicationFrame35 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent36 = null;
    applicationFrame35.windowDeiconified(windowEvent36);
    java.awt.LayoutManager layoutManager38 = null;
    applicationFrame35.setLayout(layoutManager38);
    java.beans.PropertyChangeListener propertyChangeListener40 = null;
    applicationFrame35.removePropertyChangeListener(propertyChangeListener40);
    java.awt.Image image42 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer43 = new org.jfree.ui.DateCellRenderer();
    int i44 = dateCellRenderer43.getDisplayedMnemonic();
    dateCellRenderer43.validate();
    int i46 = applicationFrame35.checkImage(image42, (java.awt.image.ImageObserver)dateCellRenderer43);
    dateCellRenderer43.updateUI();
    org.jfree.ui.BevelArrowIcon bevelArrowIcon51 = new org.jfree.ui.BevelArrowIcon((int)'4', true, false);
    dateCellRenderer43.setDisabledIcon((javax.swing.Icon)bevelArrowIcon51);
    javax.swing.Icon icon53 = dateCellRenderer43.getIcon();
    applicationFrame1.add((java.awt.Component)dateCellRenderer23, (java.lang.Object)icon53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusTraversalPolicy11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon53);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest87.test06"); }

    int[] i_array5 = new int[] { (byte)100, 4, 6, (-1) };
    org.jfree.layout.FormatLayout formatLayout6 = new org.jfree.layout.FormatLayout((int)'#', i_array5);
    org.jfree.ui.ApplicationFrame applicationFrame8 = new org.jfree.ui.ApplicationFrame("");
    int i9 = applicationFrame8.getState();
    // The following exception was thrown during execution in test generation
    try {
    formatLayout6.layoutContainer((java.awt.Container)applicationFrame8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest87.test07"); }

    java.awt.Graphics2D graphics2D1 = null;
    java.awt.FontMetrics fontMetrics2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.geom.Rectangle2D rectangle2D3 = org.jfree.text.TextUtilities.getTextBounds("hi!10.0 nullhi!", graphics2D1, fontMetrics2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest87.test08"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getDisplayedMnemonic();
    dateCellRenderer0.validate();
    int i3 = dateCellRenderer0.getDisplayedMnemonic();
    int i4 = dateCellRenderer0.getY();
    dateCellRenderer0.enable(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest87.test09"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    boolean b4 = serialDateChooserPanel2.isCursorSet();
    java.awt.Dimension dimension5 = serialDateChooserPanel2.minimumSize();
    serialDateChooserPanel2.resetKeyboardActions();
    java.io.PrintWriter printWriter7 = null;
    // The following exception was thrown during execution in test generation
    try {
    serialDateChooserPanel2.list(printWriter7, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension5);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest87.test10"); }

    int i0 = org.jfree.ui.ArrowPanel.DOWN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

}
