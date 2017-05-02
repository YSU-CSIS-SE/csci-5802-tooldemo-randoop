
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest80 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest80.test01"); }

    int i0 = org.jfree.util.LogTarget.INFO;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest80.test02"); }

    org.jfree.ui.TextAnchor textAnchor0 = org.jfree.ui.TextAnchor.CENTER_RIGHT;
    boolean b1 = textAnchor0.isVerticalCenter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest80.test03"); }

    java.awt.Graphics2D graphics2D1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Shape shape7 = org.jfree.text.TextUtilities.calculateRotatedStringBounds("RectangleAnchor.BOTTOM_LEFT", graphics2D1, (float)1L, (float)9999, (double)12, (float)0, (float)11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest80.test04"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    dateCellRenderer0.setIconTextGap(5);
    dateCellRenderer0.validate();
    dateCellRenderer0.setVerticalTextPosition(0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest80.test05"); }

    int i0 = org.jfree.date.SerialDate.FRIDAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 6);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest80.test06"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    double d2 = textBox0.getShadowYOffset();
    org.jfree.text.TextFragment textFragment4 = new org.jfree.text.TextFragment("PanelUI");
    java.awt.Paint paint5 = textFragment4.getPaint();
    textBox0.setShadowPaint(paint5);
    double d7 = textBox0.getShadowYOffset();
    double d8 = textBox0.getShadowYOffset();
    double d9 = textBox0.getShadowYOffset();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest80.test07"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array1 = lengthLimitingDocument0.getDocumentListeners();
    int i2 = lengthLimitingDocument0.getMaxLength();
    javax.swing.text.Element element3 = lengthLimitingDocument0.getBidiRootElement();
    javax.swing.text.AttributeSet attributeSet6 = null;
    // The following exception was thrown during execution in test generation
    try {
    lengthLimitingDocument0.insertString((int)(short)-1, "SortOrder.ASCENDING", attributeSet6);
      org.junit.Assert.fail("Expected exception of type javax.swing.text.BadLocationException");
    } catch (javax.swing.text.BadLocationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(element3);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest80.test08"); }

    org.jfree.ui.IntegerDocument integerDocument0 = new org.jfree.ui.IntegerDocument();
    javax.swing.text.AttributeSet attributeSet3 = null;
    integerDocument0.insertString((int)(short)0, "Jan", attributeSet3);
    java.lang.Runnable runnable5 = null;
    // The following exception was thrown during execution in test generation
    try {
    integerDocument0.render(runnable5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest80.test09"); }

    org.jfree.date.DayOfWeekInMonthRule dayOfWeekInMonthRule0 = new org.jfree.date.DayOfWeekInMonthRule();
    int i1 = dayOfWeekInMonthRule0.getCount();
    int i2 = dayOfWeekInMonthRule0.getCount();
    org.jfree.date.RelativeDayOfWeekRule relativeDayOfWeekRule5 = new org.jfree.date.RelativeDayOfWeekRule((org.jfree.date.AnnualDateRule)dayOfWeekInMonthRule0, 12, (-1));
    org.jfree.date.AnnualDateRule annualDateRule6 = relativeDayOfWeekRule5.getSubrule();
    int i7 = relativeDayOfWeekRule5.getDayOfWeek();
    relativeDayOfWeekRule5.setRelative(31);
    int i10 = relativeDayOfWeekRule5.getRelative();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(annualDateRule6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 31);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest80.test10"); }

    int i0 = java.awt.Frame.NORMAL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

}
