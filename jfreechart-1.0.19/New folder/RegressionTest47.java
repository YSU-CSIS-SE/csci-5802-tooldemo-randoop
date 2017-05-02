
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest47 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest47.test01"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    double d2 = textBox0.getShadowYOffset();
    java.awt.Graphics2D graphics2D3 = null;
    // The following exception was thrown during execution in test generation
    try {
    double d4 = textBox0.getHeight(graphics2D3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 2.0d);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest47.test02"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    boolean b4 = serialDateChooserPanel2.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array5 = serialDateChooserPanel2.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    boolean b9 = serialDateChooserPanel8.getIgnoreRepaint();
    serialDateChooserPanel8.setAlignmentX((float)(byte)10);
    java.awt.Component component12 = serialDateChooserPanel2.add((java.awt.Component)serialDateChooserPanel8);
    java.lang.String str13 = serialDateChooserPanel8.getUIClassID();
    java.awt.Cursor cursor14 = null;
    serialDateChooserPanel8.setCursor(cursor14);
    java.awt.event.ActionEvent actionEvent16 = null;
    // The following exception was thrown during execution in test generation
    try {
    serialDateChooserPanel8.actionPerformed(actionEvent16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "PanelUI"+ "'", str13.equals("PanelUI"));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest47.test03"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.util.Locale locale3 = applicationFrame1.getLocale();
    applicationFrame1.transferFocusUpCycle();
    java.awt.Component component5 = applicationFrame1.getFocusOwner();
    applicationFrame1.toFront();
    java.awt.Window window7 = applicationFrame1.getOwner();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(window7);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest47.test04"); }

    javax.swing.text.Keymap keymap1 = javax.swing.text.JTextComponent.getKeymap("org.jfree.ui.SerialDateChooserPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(keymap1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest47.test05"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array1 = lengthLimitingDocument0.getDocumentListeners();
    int i2 = lengthLimitingDocument0.getMaxLength();
    javax.swing.text.Element element3 = lengthLimitingDocument0.getBidiRootElement();
    java.util.Dictionary<java.lang.Object,java.lang.Object> dictionary_obj_obj4 = lengthLimitingDocument0.getDocumentProperties();
    javax.swing.text.Element element5 = lengthLimitingDocument0.getBidiRootElement();
    javax.swing.text.AttributeSet attributeSet9 = null;
    // The following exception was thrown during execution in test generation
    try {
    lengthLimitingDocument0.replace(10, (int)(short)1, "VerticalAlignment.CENTER", attributeSet9);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dictionary_obj_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(element5);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest47.test06"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    serialDateChooserPanel2.enableInputMethods(true);
    java.lang.String str10 = serialDateChooserPanel2.getToolTipText();
    java.awt.event.ContainerListener containerListener11 = null;
    serialDateChooserPanel2.addContainerListener(containerListener11);
    org.jfree.date.SerialDate serialDate13 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel15 = new org.jfree.ui.SerialDateChooserPanel(serialDate13, true);
    java.awt.Color color16 = serialDateChooserPanel15.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame18 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener19 = null;
    applicationFrame18.removeWindowStateListener(windowStateListener19);
    applicationFrame18.setCursor(0);
    org.jfree.date.SerialDate serialDate23 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel25 = new org.jfree.ui.SerialDateChooserPanel(serialDate23, true);
    java.awt.Color color26 = serialDateChooserPanel25.getForeground();
    applicationFrame18.setBackground(color26);
    boolean b28 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color16, (java.awt.Paint)color26);
    serialDateChooserPanel2.setBackground(color16);
    org.jfree.date.SerialDate serialDate30 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel32 = new org.jfree.ui.SerialDateChooserPanel(serialDate30, true);
    boolean b33 = serialDateChooserPanel32.getIgnoreRepaint();
    javax.swing.InputMap inputMap34 = serialDateChooserPanel32.getInputMap();
    javax.swing.TransferHandler transferHandler35 = null;
    serialDateChooserPanel32.setTransferHandler(transferHandler35);
    javax.swing.plaf.PanelUI panelUI37 = null;
    serialDateChooserPanel32.setUI(panelUI37);
    java.awt.Dimension dimension39 = serialDateChooserPanel32.getMaximumSize();
    serialDateChooserPanel2.setSize(dimension39);
    serialDateChooserPanel2.show(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension39);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest47.test07"); }

    java.lang.String str0 = javax.swing.text.AbstractDocument.ParagraphElementName;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "paragraph"+ "'", str0.equals("paragraph"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest47.test08"); }

    org.jfree.base.Library library4 = new org.jfree.base.Library("ThreadContext", "PanelUI", "notify-field-accept", "ToolTipText");
    org.jfree.base.BootableProjectInfo bootableProjectInfo5 = new org.jfree.base.BootableProjectInfo();
    boolean b6 = library4.equals((java.lang.Object)bootableProjectInfo5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest47.test09"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.util.Locale locale3 = applicationFrame1.getLocale();
    applicationFrame1.transferFocusUpCycle();
    java.awt.Graphics graphics5 = null;
    applicationFrame1.update(graphics5);
    java.awt.Cursor cursor7 = applicationFrame1.getCursor();
    applicationFrame1.reshape((int)'a', (int)(byte)0, 8, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cursor7);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest47.test10"); }

    org.jfree.ui.FilesystemFilter filesystemFilter3 = new org.jfree.ui.FilesystemFilter("Jan", "bidi level", true);

  }

}
