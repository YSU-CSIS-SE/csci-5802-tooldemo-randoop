
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest110 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest110.test01"); }

    java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
    org.jfree.resources.JCommonResources jCommonResources1 = new org.jfree.resources.JCommonResources();
    java.util.Locale locale2 = jCommonResources1.getLocale();
    boolean b4 = jCommonResources1.containsKey("ToolTipText");
    java.lang.String str5 = jCommonResources1.getBaseBundleName();
    org.jfree.util.ResourceBundleSupport resourceBundleSupport6 = new org.jfree.util.ResourceBundleSupport(locale0, (java.util.ResourceBundle)jCommonResources1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest110.test02"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array1 = lengthLimitingDocument0.getDocumentListeners();
    javax.swing.text.DocumentFilter documentFilter2 = lengthLimitingDocument0.getDocumentFilter();
    lengthLimitingDocument0.readLock();
    javax.swing.text.Element element4 = lengthLimitingDocument0.getDefaultRootElement();
    lengthLimitingDocument0.readLock();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(documentFilter2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(element4);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest110.test03"); }

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
    java.awt.Rectangle rectangle65 = fontDisplayField62.modelToView(2);
    boolean b66 = fontDisplayField62.isValidateRoot();
    // The following exception was thrown during execution in test generation
    try {
    fontDisplayField62.setCaretPosition((int)'a');
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
    org.junit.Assert.assertNull(rectangle65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest110.test04"); }

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
    dateCellRenderer9.updateUI();
    java.lang.String str14 = dateCellRenderer9.getText();
    java.lang.String str15 = dateCellRenderer9.getText();
    org.jfree.ui.TextAnchor textAnchor16 = org.jfree.ui.TextAnchor.CENTER_LEFT;
    java.text.DateFormatSymbols dateFormatSymbols17 = org.jfree.date.SerialDate.DATE_FORMAT_SYMBOLS;
    dateCellRenderer9.putClientProperty((java.lang.Object)textAnchor16, (java.lang.Object)dateFormatSymbols17);
    dateCellRenderer9.requestFocus();
    dateCellRenderer9.updateUI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateFormatSymbols17);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest110.test05"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.Rectangle rectangle2 = applicationFrame1.getMaximizedBounds();
    java.awt.event.MouseWheelListener mouseWheelListener3 = null;
    applicationFrame1.removeMouseWheelListener(mouseWheelListener3);
    applicationFrame1.setAutoRequestFocus(true);
    org.jfree.ui.ApplicationFrame applicationFrame8 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener9 = null;
    applicationFrame8.removeWindowStateListener(windowStateListener9);
    applicationFrame8.setCursor(0);
    org.jfree.date.SerialDate serialDate13 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel15 = new org.jfree.ui.SerialDateChooserPanel(serialDate13, true);
    java.awt.Color color16 = serialDateChooserPanel15.getForeground();
    applicationFrame8.setBackground(color16);
    java.lang.String str18 = org.jfree.util.PaintUtilities.colorToString(color16);
    applicationFrame1.setBackground(color16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "black"+ "'", str18.equals("black"));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest110.test06"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    applicationFrame1.firePropertyChange("hi!", '#', '4');
    java.awt.FocusTraversalPolicy focusTraversalPolicy8 = applicationFrame1.getFocusTraversalPolicy();
    java.awt.im.InputContext inputContext9 = applicationFrame1.getInputContext();
    applicationFrame1.toFront();
    org.jfree.ui.DateCellRenderer dateCellRenderer11 = new org.jfree.ui.DateCellRenderer();
    dateCellRenderer11.setIconTextGap(5);
    dateCellRenderer11.validate();
    java.awt.Dimension dimension15 = dateCellRenderer11.getMaximumSize();
    applicationFrame1.setContentPane((java.awt.Container)dateCellRenderer11);
    org.jfree.ui.RefineryUtilities.positionFrameOnScreen((java.awt.Window)applicationFrame1, (double)(byte)-1, (double)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusTraversalPolicy8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputContext9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension15);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest110.test07"); }

    org.jfree.ui.DrawablePanel drawablePanel0 = new org.jfree.ui.DrawablePanel();
    org.jfree.ui.Drawable drawable1 = drawablePanel0.getDrawable();
    java.awt.Dimension dimension2 = drawablePanel0.getMinimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(drawable1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension2);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest110.test08"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    serialDateChooserPanel2.resize(8, (int)(short)-1);
    serialDateChooserPanel2.repaint((long)'#', 9999, 11, (int)'a', 2958465);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest110.test09"); }

    java.awt.Font font4 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.date.SerialDate serialDate5 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel7 = new org.jfree.ui.SerialDateChooserPanel(serialDate5, true);
    java.awt.Color color8 = serialDateChooserPanel7.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame10 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener11 = null;
    applicationFrame10.removeWindowStateListener(windowStateListener11);
    applicationFrame10.setCursor(0);
    org.jfree.date.SerialDate serialDate15 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel17 = new org.jfree.ui.SerialDateChooserPanel(serialDate15, true);
    java.awt.Color color18 = serialDateChooserPanel17.getForeground();
    applicationFrame10.setBackground(color18);
    boolean b20 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color8, (java.awt.Paint)color18);
    org.jfree.text.TextFragment textFragment21 = new org.jfree.text.TextFragment("ClassContext", font4, (java.awt.Paint)color18);
    org.jfree.date.SerialDate serialDate22 = null;
    org.jfree.date.SerialDate serialDate24 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel26 = new org.jfree.ui.SerialDateChooserPanel(serialDate24, true);
    java.awt.Color color27 = serialDateChooserPanel26.getForeground();
    org.jfree.date.SerialDate serialDate28 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel30 = new org.jfree.ui.SerialDateChooserPanel(serialDate28, true);
    java.awt.Color color31 = serialDateChooserPanel30.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame33 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener34 = null;
    applicationFrame33.removeWindowStateListener(windowStateListener34);
    applicationFrame33.setCursor(0);
    org.jfree.date.SerialDate serialDate38 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel40 = new org.jfree.ui.SerialDateChooserPanel(serialDate38, true);
    java.awt.Color color41 = serialDateChooserPanel40.getForeground();
    applicationFrame33.setBackground(color41);
    boolean b43 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color31, (java.awt.Paint)color41);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel44 = new org.jfree.ui.SerialDateChooserPanel(serialDate22, false, color27, color41);
    javax.swing.JLabel jLabel45 = org.jfree.ui.RefineryUtilities.createJLabel("SortOrder.ASCENDING", font4, color27);
    org.jfree.date.SerialDate serialDate46 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel48 = new org.jfree.ui.SerialDateChooserPanel(serialDate46, true);
    java.awt.Color color49 = serialDateChooserPanel48.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame51 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener52 = null;
    applicationFrame51.removeWindowStateListener(windowStateListener52);
    applicationFrame51.setCursor(0);
    org.jfree.date.SerialDate serialDate56 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel58 = new org.jfree.ui.SerialDateChooserPanel(serialDate56, true);
    java.awt.Color color59 = serialDateChooserPanel58.getForeground();
    applicationFrame51.setBackground(color59);
    boolean b61 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color49, (java.awt.Paint)color59);
    org.jfree.text.TextBlock textBlock62 = org.jfree.text.TextUtilities.createTextBlock("LabelUI", font4, (java.awt.Paint)color49);
    javax.swing.JButton jButton63 = org.jfree.ui.RefineryUtilities.createJButton("black", font4);
    java.awt.PopupMenu popupMenu64 = null;
    // The following exception was thrown during execution in test generation
    try {
    jButton63.add(popupMenu64);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLabel45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textBlock62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jButton63);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest110.test10"); }

    org.jfree.util.ClassComparator classComparator0 = new org.jfree.util.ClassComparator();

  }

}
