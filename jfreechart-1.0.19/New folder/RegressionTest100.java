
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest100 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest100.test01"); }

    int i0 = javax.swing.SwingConstants.TRAILING;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 11);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest100.test02"); }

    org.jfree.ui.GradientPaintTransformType gradientPaintTransformType0 = org.jfree.ui.GradientPaintTransformType.CENTER_HORIZONTAL;
    org.jfree.ui.StandardGradientPaintTransformer standardGradientPaintTransformer1 = new org.jfree.ui.StandardGradientPaintTransformer(gradientPaintTransformType0);
    org.jfree.ui.TextAnchor textAnchor2 = org.jfree.ui.TextAnchor.CENTER_RIGHT;
    boolean b3 = standardGradientPaintTransformer1.equals((java.lang.Object)textAnchor2);
    org.jfree.ui.StandardGradientPaintTransformer standardGradientPaintTransformer4 = new org.jfree.ui.StandardGradientPaintTransformer();
    org.jfree.ui.GradientPaintTransformType gradientPaintTransformType5 = standardGradientPaintTransformer4.getType();
    boolean b6 = standardGradientPaintTransformer1.equals((java.lang.Object)standardGradientPaintTransformer4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gradientPaintTransformType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gradientPaintTransformType5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest100.test03"); }

    org.jfree.ui.TextAnchor textAnchor0 = org.jfree.ui.TextAnchor.BASELINE_RIGHT;
    boolean b1 = textAnchor0.isLeft();
    boolean b2 = textAnchor0.isRight();
    boolean b3 = textAnchor0.isVerticalCenter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest100.test04"); }

    int i0 = org.jfree.ui.Align.FIT_VERTICAL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest100.test05"); }

    org.jfree.util.ObjectList objectList0 = new org.jfree.util.ObjectList();
    java.awt.Font font3 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.text.TextFragment textFragment5 = new org.jfree.text.TextFragment("PanelUI");
    java.awt.Paint paint6 = textFragment5.getPaint();
    org.jfree.text.TextFragment textFragment7 = new org.jfree.text.TextFragment("org.jfree.ui.SerialDateChooserPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", font3, paint6);
    javax.swing.JButton jButton8 = org.jfree.ui.RefineryUtilities.createJButton("VerticalAlignment.CENTER", font3);
    int i9 = objectList0.indexOf((java.lang.Object)font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest100.test06"); }

    org.jfree.date.SpreadsheetDate spreadsheetDate1 = new org.jfree.date.SpreadsheetDate(16);
    java.util.Date date2 = spreadsheetDate1.toDate();
    org.jfree.date.SerialDate serialDate5 = org.jfree.date.SerialDate.createInstance(5);
    boolean b6 = org.jfree.date.SerialDateUtilities.isLastDayOfFebruary(serialDate5);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate5, true);
    org.jfree.date.SerialDate serialDate9 = org.jfree.date.SerialDate.addYears(16, serialDate5);
    org.jfree.date.SerialDate serialDate11 = org.jfree.date.SerialDate.createInstance(5);
    boolean b12 = org.jfree.date.SerialDateUtilities.isLastDayOfFebruary(serialDate11);
    boolean b14 = spreadsheetDate1.isInRange(serialDate9, serialDate11, (int)(short)100);
    org.jfree.date.SpreadsheetDate spreadsheetDate16 = new org.jfree.date.SpreadsheetDate(16);
    java.util.Date date17 = spreadsheetDate16.toDate();
    org.jfree.date.SerialDate serialDate20 = org.jfree.date.SerialDate.createInstance(5);
    org.jfree.date.SerialDate serialDate21 = org.jfree.date.SerialDate.addDays((int)(short)1, serialDate20);
    org.jfree.date.SerialDate serialDate23 = org.jfree.date.SerialDate.createInstance(5);
    boolean b24 = org.jfree.date.SerialDateUtilities.isLastDayOfFebruary(serialDate23);
    int i25 = org.jfree.date.SerialDateUtilities.dayCount30PSA(serialDate20, serialDate23);
    org.jfree.date.SerialDate serialDate28 = org.jfree.date.SerialDate.createInstance(5);
    boolean b29 = org.jfree.date.SerialDateUtilities.isLastDayOfFebruary(serialDate28);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel31 = new org.jfree.ui.SerialDateChooserPanel(serialDate28, true);
    org.jfree.date.SerialDate serialDate32 = org.jfree.date.SerialDate.addYears(16, serialDate28);
    org.jfree.date.SerialDate serialDate33 = serialDate23.getEndOfCurrentMonth(serialDate32);
    org.jfree.date.SpreadsheetDate spreadsheetDate35 = new org.jfree.date.SpreadsheetDate(16);
    boolean b36 = spreadsheetDate16.isInRange(serialDate23, (org.jfree.date.SerialDate)spreadsheetDate35);
    boolean b37 = spreadsheetDate1.isOnOrAfter((org.jfree.date.SerialDate)spreadsheetDate35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest100.test07"); }

    org.jfree.util.LineBreakIterator lineBreakIterator0 = new org.jfree.util.LineBreakIterator();
    int i1 = lineBreakIterator0.nextWithEnd();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest100.test08"); }

    java.awt.Font font3 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.date.SerialDate serialDate4 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel6 = new org.jfree.ui.SerialDateChooserPanel(serialDate4, true);
    java.awt.Color color7 = serialDateChooserPanel6.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame9 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener10 = null;
    applicationFrame9.removeWindowStateListener(windowStateListener10);
    applicationFrame9.setCursor(0);
    org.jfree.date.SerialDate serialDate14 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel16 = new org.jfree.ui.SerialDateChooserPanel(serialDate14, true);
    java.awt.Color color17 = serialDateChooserPanel16.getForeground();
    applicationFrame9.setBackground(color17);
    boolean b19 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color7, (java.awt.Paint)color17);
    org.jfree.text.TextFragment textFragment20 = new org.jfree.text.TextFragment("ClassContext", font3, (java.awt.Paint)color17);
    org.jfree.date.SerialDate serialDate21 = null;
    org.jfree.date.SerialDate serialDate23 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate23, true);
    java.awt.Color color26 = serialDateChooserPanel25.getForeground();
    org.jfree.date.SerialDate serialDate27 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel29 = new org.jfree.ui.SerialDateChooserPanel(serialDate27, true);
    java.awt.Color color30 = serialDateChooserPanel29.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame32 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener33 = null;
    applicationFrame32.removeWindowStateListener(windowStateListener33);
    applicationFrame32.setCursor(0);
    org.jfree.date.SerialDate serialDate37 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel39 = new org.jfree.ui.SerialDateChooserPanel(serialDate37, true);
    java.awt.Color color40 = serialDateChooserPanel39.getForeground();
    applicationFrame32.setBackground(color40);
    boolean b42 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color30, (java.awt.Paint)color40);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel43 = new org.jfree.ui.SerialDateChooserPanel(serialDate21, false, color26, color40);
    javax.swing.JLabel jLabel44 = org.jfree.ui.RefineryUtilities.createJLabel("SortOrder.ASCENDING", font3, color26);
    org.jfree.date.SerialDate serialDate45 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel47 = new org.jfree.ui.SerialDateChooserPanel(serialDate45, true);
    java.awt.Color color48 = serialDateChooserPanel47.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame50 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener51 = null;
    applicationFrame50.removeWindowStateListener(windowStateListener51);
    applicationFrame50.setCursor(0);
    org.jfree.date.SerialDate serialDate55 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel57 = new org.jfree.ui.SerialDateChooserPanel(serialDate55, true);
    java.awt.Color color58 = serialDateChooserPanel57.getForeground();
    applicationFrame50.setBackground(color58);
    boolean b60 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color48, (java.awt.Paint)color58);
    org.jfree.text.TextBlock textBlock61 = org.jfree.text.TextUtilities.createTextBlock("LabelUI", font3, (java.awt.Paint)color48);
    org.jfree.ui.FontDisplayField fontDisplayField62 = new org.jfree.ui.FontDisplayField(font3);
    java.awt.Dimension dimension63 = fontDisplayField62.getPreferredSize();
    boolean b64 = fontDisplayField62.getScrollableTracksViewportHeight();
    javax.swing.DropMode dropMode65 = null;
    // The following exception was thrown during execution in test generation
    try {
    fontDisplayField62.setDropMode(dropMode65);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLabel44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlock61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest100.test09"); }

    org.jfree.util.BooleanList booleanList0 = new org.jfree.util.BooleanList();
    booleanList0.setBoolean(31, (java.lang.Boolean)false);
    org.jfree.resources.JCommonResources jCommonResources4 = new org.jfree.resources.JCommonResources();
    java.util.Locale locale5 = jCommonResources4.getLocale();
    boolean b6 = booleanList0.equals((java.lang.Object)jCommonResources4);
    org.jfree.text.TextBox textBox7 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets8 = textBox7.getInteriorGap();
    double d9 = textBox7.getShadowYOffset();
    org.jfree.text.TextFragment textFragment11 = new org.jfree.text.TextFragment("PanelUI");
    java.awt.Paint paint12 = textFragment11.getPaint();
    textBox7.setShadowPaint(paint12);
    org.jfree.text.TextBlock textBlock14 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D15 = null;
    org.jfree.text.TextBlock textBlock18 = new org.jfree.text.TextBlock();
    java.awt.Graphics2D graphics2D19 = null;
    org.jfree.text.TextBlockAnchor textBlockAnchor22 = org.jfree.text.TextBlockAnchor.TOP_RIGHT;
    java.awt.Shape shape26 = textBlock18.calculateBounds(graphics2D19, (float)12, (float)(short)-1, textBlockAnchor22, (float)' ', (float)32, (double)(-1.0f));
    textBlock14.draw(graphics2D15, (float)5, (float)(short)1, textBlockAnchor22, (float)(short)-1, (float)(short)100, (double)1.0f);
    textBox7.setTextBlock(textBlock14);
    double d32 = textBox7.getShadowYOffset();
    boolean b33 = booleanList0.equals((java.lang.Object)textBox7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlockAnchor22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(shape26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d32 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest100.test10"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.awt.event.WindowEvent windowEvent3 = null;
    applicationFrame1.windowIconified(windowEvent3);
    org.jfree.date.SerialDate serialDate5 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel7 = new org.jfree.ui.SerialDateChooserPanel(serialDate5, true);
    serialDateChooserPanel7.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext12 = serialDateChooserPanel7.getAccessibleContext();
    java.awt.Dimension dimension13 = serialDateChooserPanel7.getPreferredSize();
    org.jfree.date.SerialDate serialDate15 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel17 = new org.jfree.ui.SerialDateChooserPanel(serialDate15, true);
    boolean b18 = serialDateChooserPanel17.getIgnoreRepaint();
    javax.swing.InputMap inputMap19 = serialDateChooserPanel17.getInputMap();
    serialDateChooserPanel7.setInputMap((int)(byte)1, inputMap19);
    java.awt.event.FocusListener[] focusListener_array21 = serialDateChooserPanel7.getFocusListeners();
    applicationFrame1.remove((java.awt.Component)serialDateChooserPanel7);
    java.awt.Event event23 = null;
    boolean b26 = applicationFrame1.mouseUp(event23, (int)(short)10, (int)'#');
    applicationFrame1.setExtendedState(4);
    applicationFrame1.setBounds((int)(byte)1, 4, 9, 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

}
