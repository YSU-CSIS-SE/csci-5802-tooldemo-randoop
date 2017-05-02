
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test1"); }

    org.jfree.date.SerialDate serialDate1 = org.jfree.date.SerialDate.createInstance(5);
    org.jfree.date.SerialDate serialDate3 = org.jfree.date.SerialDate.createInstance(5);
    // during test generation this statement threw an exception of type java.lang.StackOverflowError in error
    int i4 = org.jfree.date.SerialDateUtilities.countFeb29s(serialDate1, serialDate3);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test2"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    applicationFrame1.setLocationByPlatform(false);
    java.awt.Container container5 = applicationFrame1.getFocusCycleRootAncestor();
    applicationFrame1.setCursor((int)(short)0);
    org.jfree.resources.JCommonResources jCommonResources8 = new org.jfree.resources.JCommonResources();
    java.util.Locale locale9 = jCommonResources8.getLocale();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    applicationFrame1.applyResourceBundle((java.util.ResourceBundle)jCommonResources8);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test3"); }

    org.jfree.util.StrokeList strokeList0 = new org.jfree.util.StrokeList();
    java.lang.Object obj1 = strokeList0.clone();
    org.jfree.text.TextBox textBox3 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets4 = textBox3.getInteriorGap();
    org.jfree.text.TextBlock textBlock5 = null;
    textBox3.setTextBlock(textBlock5);
    java.awt.Stroke stroke7 = textBox3.getOutlineStroke();
    strokeList0.setStroke((int)'a', stroke7);
    org.jfree.util.StrokeList strokeList10 = new org.jfree.util.StrokeList();
    org.jfree.text.TextBox textBox12 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets13 = textBox12.getInteriorGap();
    org.jfree.text.TextBlock textBlock14 = null;
    textBox12.setTextBlock(textBlock14);
    java.awt.Stroke stroke16 = textBox12.getOutlineStroke();
    strokeList10.setStroke(10, stroke16);
    strokeList0.setStroke((int)' ', stroke16);
    
    // This assertion (symmetry of equals) fails 
    org.junit.Assert.assertTrue("Contract failed: equals-symmetric on obj1 and strokeList10.", obj1.equals(strokeList10) == strokeList10.equals(obj1));

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test4"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.util.Locale locale3 = applicationFrame1.getLocale();
    java.awt.Insets insets4 = applicationFrame1.insets();
    org.jfree.resources.JCommonResources jCommonResources5 = new org.jfree.resources.JCommonResources();
    java.util.Locale locale6 = jCommonResources5.getLocale();
    boolean b8 = jCommonResources5.containsKey("ToolTipText");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    applicationFrame1.applyResourceBundle((java.util.ResourceBundle)jCommonResources5);

  }

}
