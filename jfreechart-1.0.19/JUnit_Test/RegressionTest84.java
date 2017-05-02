
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest84 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest84.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b7 = serialDateChooserPanel2.isFocusTraversable();
    java.awt.Image image8 = null;
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel11 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, true);
    boolean b12 = serialDateChooserPanel11.getIgnoreRepaint();
    boolean b13 = serialDateChooserPanel11.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array14 = serialDateChooserPanel11.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate15 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel17 = new org.jfree.ui.SerialDateChooserPanel(serialDate15, true);
    boolean b18 = serialDateChooserPanel17.getIgnoreRepaint();
    serialDateChooserPanel17.setAlignmentX((float)(byte)10);
    java.awt.Component component21 = serialDateChooserPanel11.add((java.awt.Component)serialDateChooserPanel17);
    java.lang.String str22 = serialDateChooserPanel17.getUIClassID();
    boolean b23 = serialDateChooserPanel17.isBackgroundSet();
    int i24 = serialDateChooserPanel2.checkImage(image8, (java.awt.image.ImageObserver)serialDateChooserPanel17);
    org.jfree.ui.L1R2ButtonPanel l1R2ButtonPanel28 = new org.jfree.ui.L1R2ButtonPanel("", "hi!", "notify-field-accept");
    javax.swing.JButton jButton29 = l1R2ButtonPanel28.getLeftButton();
    java.lang.Object obj30 = serialDateChooserPanel2.getClientProperty((java.lang.Object)l1R2ButtonPanel28);
    javax.swing.JButton jButton31 = l1R2ButtonPanel28.getRightButton1();
    java.awt.event.MouseListener mouseListener32 = null;
    jButton31.removeMouseListener(mouseListener32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "PanelUI"+ "'", str22.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton31);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest84.test02"); }

    org.jfree.io.IOUtils iOUtils0 = org.jfree.io.IOUtils.getInstance();
    java.io.InputStream inputStream1 = null;
    java.io.OutputStream outputStream2 = null;
    // The following exception was thrown during execution in test generation
    try {
    iOUtils0.copyStreams(inputStream1, outputStream2, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iOUtils0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest84.test03"); }

    org.jfree.ui.L1R3ButtonPanel l1R3ButtonPanel4 = new org.jfree.ui.L1R3ButtonPanel("org.jfree.ui.SerialDateChooserPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "black", "black", "ClassContext");
    org.jfree.date.SerialDate serialDate5 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel7 = new org.jfree.ui.SerialDateChooserPanel(serialDate5, true);
    boolean b8 = serialDateChooserPanel7.isFocusTraversable();
    org.jfree.date.SerialDate serialDate9 = null;
    org.jfree.date.SerialDate serialDate11 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel13 = new org.jfree.ui.SerialDateChooserPanel(serialDate11, true);
    java.awt.Color color14 = serialDateChooserPanel13.getForeground();
    org.jfree.date.SerialDate serialDate15 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel17 = new org.jfree.ui.SerialDateChooserPanel(serialDate15, true);
    java.awt.Color color18 = serialDateChooserPanel17.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame20 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener21 = null;
    applicationFrame20.removeWindowStateListener(windowStateListener21);
    applicationFrame20.setCursor(0);
    org.jfree.date.SerialDate serialDate25 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel27 = new org.jfree.ui.SerialDateChooserPanel(serialDate25, true);
    java.awt.Color color28 = serialDateChooserPanel27.getForeground();
    applicationFrame20.setBackground(color28);
    boolean b30 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color18, (java.awt.Paint)color28);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel31 = new org.jfree.ui.SerialDateChooserPanel(serialDate9, false, color14, color28);
    java.awt.Component component32 = serialDateChooserPanel31.getNextFocusableComponent();
    javax.swing.ActionMap actionMap33 = serialDateChooserPanel31.getActionMap();
    serialDateChooserPanel7.setActionMap(actionMap33);
    l1R3ButtonPanel4.setActionMap(actionMap33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(actionMap33);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest84.test04"); }

    org.jfree.ui.TextAnchor textAnchor0 = org.jfree.ui.TextAnchor.BOTTOM_RIGHT;
    boolean b1 = textAnchor0.isTop();
    org.jfree.text.TextBox textBox2 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets3 = textBox2.getInteriorGap();
    java.awt.Rectangle rectangle4 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle5 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b6 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle4, (java.awt.geom.Rectangle2D)rectangle5);
    rectangleInsets3.trim((java.awt.geom.Rectangle2D)rectangle5);
    double d8 = rectangleInsets3.getLeft();
    org.jfree.text.TextBox textBox9 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets10 = textBox9.getInteriorGap();
    java.awt.Rectangle rectangle11 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle12 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b13 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle11, (java.awt.geom.Rectangle2D)rectangle12);
    rectangleInsets10.trim((java.awt.geom.Rectangle2D)rectangle12);
    rectangleInsets3.trim((java.awt.geom.Rectangle2D)rectangle12);
    boolean b16 = textAnchor0.equals((java.lang.Object)rectangleInsets3);
    org.jfree.util.UnitType unitType17 = rectangleInsets3.getUnitType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(unitType17);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest84.test05"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getDisplayedMnemonic();
    dateCellRenderer0.validate();
    dateCellRenderer0.setVisible(false);
    java.awt.Image image5 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer6 = new org.jfree.ui.DateCellRenderer();
    int i7 = dateCellRenderer6.getDisplayedMnemonic();
    java.lang.String str8 = dateCellRenderer6.getText();
    boolean b9 = dateCellRenderer6.isFocusTraversalPolicySet();
    int i10 = dateCellRenderer0.checkImage(image5, (java.awt.image.ImageObserver)dateCellRenderer6);
    dateCellRenderer0.revalidate();
    java.awt.peer.ComponentPeer componentPeer12 = dateCellRenderer0.getPeer();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(componentPeer12);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest84.test06"); }

    org.jfree.resources.JCommonResources jCommonResources1 = new org.jfree.resources.JCommonResources();
    java.util.Locale locale2 = jCommonResources1.getLocale();
    org.jfree.ui.FloatDimension floatDimension3 = new org.jfree.ui.FloatDimension();
    org.jfree.ui.ApplicationFrame applicationFrame5 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener6 = null;
    applicationFrame5.removeWindowStateListener(windowStateListener6);
    java.awt.Cursor cursor8 = null;
    applicationFrame5.setCursor(cursor8);
    java.awt.event.WindowFocusListener[] windowFocusListener_array10 = applicationFrame5.getWindowFocusListeners();
    boolean b11 = floatDimension3.equals((java.lang.Object)windowFocusListener_array10);
    org.jfree.util.Log.SimpleMessage simpleMessage12 = new org.jfree.util.Log.SimpleMessage("UnitType.ABSOLUTE", (java.lang.Object)jCommonResources1, (java.lang.Object)b11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowFocusListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest84.test07"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b7 = serialDateChooserPanel2.isFocusTraversable();
    java.lang.Object obj8 = null;
    java.lang.Object obj9 = serialDateChooserPanel2.getClientProperty(obj8);
    serialDateChooserPanel2.setEnabled(false);
    int i14 = serialDateChooserPanel2.getBaseline(100, (int)(short)10);
    java.awt.image.VolatileImage volatileImage17 = serialDateChooserPanel2.createVolatileImage((int)'4', 15);
    java.awt.Insets insets18 = serialDateChooserPanel2.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(volatileImage17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets18);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest84.test08"); }

    java.awt.Graphics2D graphics2D1 = null;
    org.jfree.ui.TextAnchor textAnchor4 = org.jfree.ui.TextAnchor.BASELINE_RIGHT;
    boolean b5 = textAnchor4.isLeft();
    boolean b6 = textAnchor4.isBaseline();
    // The following exception was thrown during execution in test generation
    try {
    java.awt.geom.Rectangle2D rectangle2D7 = org.jfree.text.TextUtilities.drawAlignedString("RectangleAnchor.TOP_LEFT", graphics2D1, (float)(byte)10, (float)'4', textAnchor4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest84.test09"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array1 = lengthLimitingDocument0.getDocumentListeners();
    javax.swing.text.Position position2 = lengthLimitingDocument0.getEndPosition();
    javax.swing.text.Element element3 = lengthLimitingDocument0.getDefaultRootElement();
    int i4 = lengthLimitingDocument0.getMaxLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(position2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(element3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest84.test10"); }

    org.jfree.date.DayOfWeekInMonthRule dayOfWeekInMonthRule0 = new org.jfree.date.DayOfWeekInMonthRule();
    int i1 = dayOfWeekInMonthRule0.getCount();
    int i2 = dayOfWeekInMonthRule0.getCount();
    org.jfree.date.RelativeDayOfWeekRule relativeDayOfWeekRule5 = new org.jfree.date.RelativeDayOfWeekRule((org.jfree.date.AnnualDateRule)dayOfWeekInMonthRule0, 12, (-1));
    int i6 = relativeDayOfWeekRule5.getRelative();
    org.jfree.date.RelativeDayOfWeekRule relativeDayOfWeekRule9 = new org.jfree.date.RelativeDayOfWeekRule((org.jfree.date.AnnualDateRule)relativeDayOfWeekRule5, (int)(byte)100, 2958465);
    relativeDayOfWeekRule5.setRelative((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

}
