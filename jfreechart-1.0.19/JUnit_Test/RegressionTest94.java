
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest94 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest94.test01"); }

    java.awt.geom.Line2D line2D0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Shape shape2 = org.jfree.util.ShapeUtilities.createLineRegion(line2D0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest94.test02"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    boolean b4 = serialDateChooserPanel2.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array5 = serialDateChooserPanel2.getPropertyChangeListeners();
    javax.swing.InputMap inputMap6 = serialDateChooserPanel2.getInputMap();
    boolean b7 = serialDateChooserPanel2.isForegroundSet();
    serialDateChooserPanel2.layout();
    java.awt.Point point9 = serialDateChooserPanel2.getLocation();
    boolean b10 = serialDateChooserPanel2.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest94.test03"); }

    org.jfree.base.BasicProjectInfo basicProjectInfo5 = new org.jfree.base.BasicProjectInfo("hi!", "notify-field-accept", "hi!", "hi!", "hi!");
    java.lang.String str6 = basicProjectInfo5.getCopyright();
    basicProjectInfo5.setLicenceName("TextFieldUI");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest94.test04"); }

    org.jfree.ui.GradientPaintTransformType gradientPaintTransformType0 = org.jfree.ui.GradientPaintTransformType.HORIZONTAL;
    java.lang.String str1 = gradientPaintTransformType0.toString();
    org.jfree.ui.StandardGradientPaintTransformer standardGradientPaintTransformer2 = new org.jfree.ui.StandardGradientPaintTransformer(gradientPaintTransformType0);
    java.awt.GradientPaint gradientPaint3 = null;
    java.awt.Shape shape4 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.GradientPaint gradientPaint5 = standardGradientPaintTransformer2.transform(gradientPaint3, shape4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gradientPaintTransformType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "GradientPaintTransformType.HORIZONTAL"+ "'", str1.equals("GradientPaintTransformType.HORIZONTAL"));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest94.test05"); }

    org.jfree.ui.TextAnchor textAnchor0 = org.jfree.ui.TextAnchor.HALF_ASCENT_CENTER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest94.test06"); }

    org.jfree.ui.ApplicationFrame applicationFrame2 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent3 = null;
    applicationFrame2.windowDeiconified(windowEvent3);
    java.awt.LayoutManager layoutManager5 = null;
    applicationFrame2.setLayout(layoutManager5);
    applicationFrame2.show();
    java.awt.Shape shape8 = applicationFrame2.getShape();
    java.lang.String str9 = applicationFrame2.getTitle();
    java.awt.Container container10 = applicationFrame2.getContentPane();
    org.jfree.date.SpreadsheetDate spreadsheetDate12 = new org.jfree.date.SpreadsheetDate(16);
    java.util.Date date13 = spreadsheetDate12.toDate();
    org.jfree.date.SerialDate serialDate16 = org.jfree.date.SerialDate.createInstance(5);
    boolean b17 = org.jfree.date.SerialDateUtilities.isLastDayOfFebruary(serialDate16);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel19 = new org.jfree.ui.SerialDateChooserPanel(serialDate16, true);
    org.jfree.date.SerialDate serialDate20 = org.jfree.date.SerialDate.addYears(16, serialDate16);
    org.jfree.date.SerialDate serialDate22 = org.jfree.date.SerialDate.createInstance(5);
    boolean b23 = org.jfree.date.SerialDateUtilities.isLastDayOfFebruary(serialDate22);
    boolean b25 = spreadsheetDate12.isInRange(serialDate20, serialDate22, (int)(short)100);
    org.jfree.date.SpreadsheetDate spreadsheetDate27 = new org.jfree.date.SpreadsheetDate(16);
    int i28 = org.jfree.date.SerialDateUtilities.dayCountActual((org.jfree.date.SerialDate)spreadsheetDate12, (org.jfree.date.SerialDate)spreadsheetDate27);
    org.jfree.util.Log.SimpleMessage simpleMessage29 = new org.jfree.util.Log.SimpleMessage("RectangleAnchor.BOTTOM_LEFT", (java.lang.Object)applicationFrame2, (java.lang.Object)spreadsheetDate12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest94.test07"); }

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
    java.awt.Dimension dimension13 = applicationFrame1.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension13);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest94.test08"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    double d2 = textBox0.getShadowYOffset();
    org.jfree.text.TextFragment textFragment4 = new org.jfree.text.TextFragment("PanelUI");
    java.awt.Paint paint5 = textFragment4.getPaint();
    textBox0.setShadowPaint(paint5);
    double d7 = textBox0.getShadowYOffset();
    java.awt.Paint paint8 = textBox0.getShadowPaint();
    double d9 = textBox0.getShadowXOffset();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest94.test09"); }

    org.jfree.ui.HorizontalAlignment horizontalAlignment0 = org.jfree.ui.HorizontalAlignment.LEFT;
    boolean b2 = horizontalAlignment0.equals((java.lang.Object)"org.jfree.util.StackableRuntimeException: ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(horizontalAlignment0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest94.test10"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    boolean b4 = serialDateChooserPanel2.isCursorSet();
    java.awt.Dimension dimension5 = serialDateChooserPanel2.minimumSize();
    org.jfree.date.SerialDate serialDate6 = serialDateChooserPanel2.getDate();
    java.awt.Event event7 = null;
    boolean b10 = serialDateChooserPanel2.mouseMove(event7, 0, 1);
    java.awt.Event event11 = null;
    boolean b14 = serialDateChooserPanel2.mouseEnter(event11, 0, 15);
    float f15 = serialDateChooserPanel2.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(serialDate6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f15 == 0.5f);

  }

}
