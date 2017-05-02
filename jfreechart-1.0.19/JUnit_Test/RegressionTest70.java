
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest70 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test01"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    java.awt.Cursor cursor4 = null;
    applicationFrame1.setCursor(cursor4);
    java.awt.Image image6 = null;
    boolean b12 = applicationFrame1.imageUpdate(image6, (int)'4', (int)(short)1, 8, (int)(byte)100, (int)'#');
    java.awt.Image image13 = applicationFrame1.getIconImage();
    java.awt.Dimension dimension14 = applicationFrame1.size();
    applicationFrame1.setBounds(5, 4, (int)(short)1, (int)(byte)-1);
    org.jfree.date.SerialDate serialDate20 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel22 = new org.jfree.ui.SerialDateChooserPanel(serialDate20, true);
    boolean b23 = serialDateChooserPanel22.getIgnoreRepaint();
    boolean b24 = serialDateChooserPanel22.isCursorSet();
    java.awt.Dimension dimension25 = serialDateChooserPanel22.minimumSize();
    javax.swing.InputVerifier inputVerifier26 = serialDateChooserPanel22.getInputVerifier();
    int i27 = applicationFrame1.getComponentZOrder((java.awt.Component)serialDateChooserPanel22);
    java.io.PrintWriter printWriter28 = null;
    // The following exception was thrown during execution in test generation
    try {
    serialDateChooserPanel22.list(printWriter28);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(image13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test02"); }

    java.util.Date date3 = org.jfree.date.DateUtilities.createDate((int)(short)100, 13, 12);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.date.SerialDate serialDate4 = org.jfree.date.SerialDate.createInstance(date3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date3);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test03"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    java.awt.Rectangle rectangle2 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle3 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b4 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle2, (java.awt.geom.Rectangle2D)rectangle3);
    rectangleInsets1.trim((java.awt.geom.Rectangle2D)rectangle3);
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    boolean b9 = serialDateChooserPanel8.getIgnoreRepaint();
    javax.swing.InputMap inputMap10 = serialDateChooserPanel8.getInputMap();
    java.awt.Rectangle rectangle11 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle12 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b13 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle11, (java.awt.geom.Rectangle2D)rectangle12);
    java.awt.Rectangle rectangle14 = serialDateChooserPanel8.getBounds(rectangle12);
    java.awt.geom.Rectangle2D rectangle2D17 = rectangleInsets1.createInsetRectangle((java.awt.geom.Rectangle2D)rectangle14, false, true);
    org.jfree.ui.ApplicationFrame applicationFrame19 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent20 = null;
    applicationFrame19.windowDeiconified(windowEvent20);
    java.awt.LayoutManager layoutManager22 = null;
    applicationFrame19.setLayout(layoutManager22);
    java.beans.PropertyChangeListener propertyChangeListener24 = null;
    applicationFrame19.removePropertyChangeListener(propertyChangeListener24);
    java.awt.Image image26 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer27 = new org.jfree.ui.DateCellRenderer();
    int i28 = dateCellRenderer27.getDisplayedMnemonic();
    dateCellRenderer27.validate();
    int i30 = applicationFrame19.checkImage(image26, (java.awt.image.ImageObserver)dateCellRenderer27);
    dateCellRenderer27.updateUI();
    boolean b32 = rectangleInsets1.equals((java.lang.Object)dateCellRenderer27);
    org.jfree.util.UnitType unitType33 = rectangleInsets1.getUnitType();
    org.jfree.text.TextBox textBox34 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets35 = textBox34.getInteriorGap();
    java.awt.Rectangle rectangle36 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle37 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b38 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle36, (java.awt.geom.Rectangle2D)rectangle37);
    rectangleInsets35.trim((java.awt.geom.Rectangle2D)rectangle37);
    double d40 = rectangleInsets35.getLeft();
    org.jfree.ui.ApplicationFrame applicationFrame42 = new org.jfree.ui.ApplicationFrame("");
    java.awt.Rectangle rectangle43 = applicationFrame42.getMaximizedBounds();
    java.awt.event.MouseWheelListener mouseWheelListener44 = null;
    applicationFrame42.removeMouseWheelListener(mouseWheelListener44);
    applicationFrame42.setAutoRequestFocus(true);
    java.awt.event.KeyListener keyListener48 = null;
    applicationFrame42.addKeyListener(keyListener48);
    java.awt.Rectangle rectangle50 = applicationFrame42.bounds();
    java.awt.geom.Rectangle2D rectangle2D51 = rectangleInsets35.createInsetRectangle((java.awt.geom.Rectangle2D)rectangle50);
    boolean b52 = unitType33.equals((java.lang.Object)rectangle50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(unitType33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d40 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test04"); }

    org.jfree.util.LineBreakIterator lineBreakIterator0 = new org.jfree.util.LineBreakIterator();
    lineBreakIterator0.setText("hi!");

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test05"); }

    org.jfree.text.TextUtilities.setUseFontMetricsGetStringBounds(true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test06"); }

    float[] f_array4 = new float[] { (short)-1, (byte)0, (-1), 16 };
    float[] f_array9 = new float[] { (short)-1, (byte)0, (-1), 16 };
    float[] f_array14 = new float[] { (short)-1, (byte)0, (-1), 16 };
    float[] f_array19 = new float[] { (short)-1, (byte)0, (-1), 16 };
    float[] f_array24 = new float[] { (short)-1, (byte)0, (-1), 16 };
    float[][] f_array_array25 = new float[][] { f_array4, f_array9, f_array14, f_array19, f_array24 };
    float[] f_array28 = new float[] { 0.0f, 1.0f };
    float[] f_array31 = new float[] { 0.0f, 1.0f };
    float[] f_array34 = new float[] { 0.0f, 1.0f };
    float[] f_array37 = new float[] { 0.0f, 1.0f };
    float[] f_array40 = new float[] { 0.0f, 1.0f };
    float[][] f_array_array41 = new float[][] { f_array28, f_array31, f_array34, f_array37, f_array40 };
    float[][] f_array_array42 = org.jfree.util.ArrayUtilities.clone(f_array_array41);
    boolean b43 = org.jfree.util.ArrayUtilities.equal(f_array_array25, f_array_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(f_array_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test07"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array1 = lengthLimitingDocument0.getDocumentListeners();
    javax.swing.text.Position position2 = lengthLimitingDocument0.getEndPosition();
    int i3 = lengthLimitingDocument0.getAsynchronousLoadPriority();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(position2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test08"); }

    org.jfree.ui.FloatDimension floatDimension0 = new org.jfree.ui.FloatDimension();
    org.jfree.ui.ApplicationFrame applicationFrame2 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener3 = null;
    applicationFrame2.removeWindowStateListener(windowStateListener3);
    java.awt.Cursor cursor5 = null;
    applicationFrame2.setCursor(cursor5);
    java.awt.event.WindowFocusListener[] windowFocusListener_array7 = applicationFrame2.getWindowFocusListeners();
    boolean b8 = floatDimension0.equals((java.lang.Object)windowFocusListener_array7);
    java.lang.String str9 = floatDimension0.toString();
    floatDimension0.setSize((double)2, (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowFocusListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "org.jfree.ui.FloatDimension:={width=0.0, height=0.0}"+ "'", str9.equals("org.jfree.ui.FloatDimension:={width=0.0, height=0.0}"));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test09"); }

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
    java.awt.Image image23 = null;
    org.jfree.ui.ApplicationFrame applicationFrame27 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent28 = null;
    applicationFrame27.windowDeiconified(windowEvent28);
    java.awt.LayoutManager layoutManager30 = null;
    applicationFrame27.setLayout(layoutManager30);
    java.beans.PropertyChangeListener propertyChangeListener32 = null;
    applicationFrame27.removePropertyChangeListener(propertyChangeListener32);
    java.awt.Image image34 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer35 = new org.jfree.ui.DateCellRenderer();
    int i36 = dateCellRenderer35.getDisplayedMnemonic();
    dateCellRenderer35.validate();
    int i38 = applicationFrame27.checkImage(image34, (java.awt.image.ImageObserver)dateCellRenderer35);
    dateCellRenderer35.updateUI();
    org.jfree.ui.BevelArrowIcon bevelArrowIcon43 = new org.jfree.ui.BevelArrowIcon((int)'4', true, false);
    dateCellRenderer35.setDisabledIcon((javax.swing.Icon)bevelArrowIcon43);
    boolean b45 = serialDateChooserPanel22.prepareImage(image23, (int)(byte)0, (int)(short)100, (java.awt.image.ImageObserver)dateCellRenderer35);
    dateCellRenderer35.repaint((long)16, 3, 31, 1, (int)(byte)100);
    dateCellRenderer35.setAlignmentY((float)(short)-1);
    org.jfree.ui.ApplicationFrame applicationFrame55 = new org.jfree.ui.ApplicationFrame("");
    int i56 = applicationFrame55.getState();
    org.jfree.date.SerialDate serialDate57 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel59 = new org.jfree.ui.SerialDateChooserPanel(serialDate57, true);
    serialDateChooserPanel59.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext64 = serialDateChooserPanel59.getAccessibleContext();
    java.awt.Dimension dimension65 = serialDateChooserPanel59.getPreferredSize();
    applicationFrame55.setSize(dimension65);
    applicationFrame55.pack();
    java.awt.Dimension dimension68 = applicationFrame55.preferredSize();
    dateCellRenderer35.setPreferredSize(dimension68);
    dateCellRenderer35.transferFocus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension68);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest70.test10"); }

    org.jfree.util.LineBreakIterator lineBreakIterator0 = new org.jfree.util.LineBreakIterator();
    java.lang.String str1 = lineBreakIterator0.getText();
    java.lang.Object obj2 = lineBreakIterator0.next();
    java.lang.Object obj3 = lineBreakIterator0.next();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj2 + "' != '" + ""+ "'", obj2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

}
