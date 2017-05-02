
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest119 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest119.test01"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    boolean b4 = applicationFrame1.isValidateRoot();
    boolean b5 = applicationFrame1.isFocusable();
    java.awt.event.WindowEvent windowEvent6 = null;
    applicationFrame1.windowIconified(windowEvent6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest119.test02"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array1 = lengthLimitingDocument0.getDocumentListeners();
    int i2 = lengthLimitingDocument0.getMaxLength();
    javax.swing.event.DocumentListener documentListener3 = null;
    lengthLimitingDocument0.removeDocumentListener(documentListener3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest119.test03"); }

    java.awt.Graphics2D graphics2D0 = null;
    org.jfree.ui.ApplicationFrame applicationFrame2 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener3 = null;
    applicationFrame2.removeWindowStateListener(windowStateListener3);
    boolean b5 = applicationFrame2.isValidateRoot();
    org.jfree.date.SerialDate serialDate6 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel8 = new org.jfree.ui.SerialDateChooserPanel(serialDate6, true);
    boolean b9 = serialDateChooserPanel8.getIgnoreRepaint();
    javax.swing.InputMap inputMap10 = serialDateChooserPanel8.getInputMap();
    java.awt.Rectangle rectangle11 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle12 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b13 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle11, (java.awt.geom.Rectangle2D)rectangle12);
    java.awt.Rectangle rectangle14 = serialDateChooserPanel8.getBounds(rectangle12);
    org.jfree.date.SerialDate serialDate15 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel17 = new org.jfree.ui.SerialDateChooserPanel(serialDate15, true);
    boolean b18 = serialDateChooserPanel17.getIgnoreRepaint();
    java.awt.Rectangle rectangle19 = serialDateChooserPanel17.getVisibleRect();
    boolean b20 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle12, (java.awt.Shape)rectangle19);
    applicationFrame2.setMaximizedBounds(rectangle12);
    javax.accessibility.AccessibleContext accessibleContext22 = applicationFrame2.getAccessibleContext();
    java.awt.event.WindowEvent windowEvent23 = null;
    applicationFrame2.windowDeiconified(windowEvent23);
    org.jfree.text.TextBox textBox25 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets26 = textBox25.getInteriorGap();
    java.awt.Rectangle rectangle27 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle28 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b29 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle27, (java.awt.geom.Rectangle2D)rectangle28);
    rectangleInsets26.trim((java.awt.geom.Rectangle2D)rectangle28);
    double d31 = rectangleInsets26.getLeft();
    org.jfree.text.TextBox textBox32 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets33 = textBox32.getInteriorGap();
    java.awt.Rectangle rectangle34 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle35 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b36 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle34, (java.awt.geom.Rectangle2D)rectangle35);
    rectangleInsets33.trim((java.awt.geom.Rectangle2D)rectangle35);
    rectangleInsets26.trim((java.awt.geom.Rectangle2D)rectangle35);
    applicationFrame2.setBounds(rectangle35);
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.util.ShapeUtilities.drawRotatedShape(graphics2D0, (java.awt.Shape)rectangle35, (double)(byte)-1, (float)31, (float)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
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
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d31 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest119.test04"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array1 = lengthLimitingDocument0.getDocumentListeners();
    int i2 = lengthLimitingDocument0.getMaxLength();
    lengthLimitingDocument0.readLock();
    javax.swing.text.DocumentFilter documentFilter4 = null;
    lengthLimitingDocument0.setDocumentFilter(documentFilter4);
    javax.swing.text.DocumentFilter documentFilter6 = null;
    lengthLimitingDocument0.setDocumentFilter(documentFilter6);
    javax.swing.text.Element element8 = lengthLimitingDocument0.getBidiRootElement();
    javax.swing.text.Position position10 = lengthLimitingDocument0.createPosition(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(element8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(position10);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest119.test05"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    java.awt.Cursor cursor4 = null;
    applicationFrame1.setCursor(cursor4);
    java.util.Locale locale6 = applicationFrame1.getLocale();
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.util.ResourceBundleSupport resourceBundleSupport8 = new org.jfree.util.ResourceBundleSupport(locale6, "NO_CHANGE");
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale6);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest119.test06"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    org.jfree.date.SerialDate serialDate3 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel5 = new org.jfree.ui.SerialDateChooserPanel(serialDate3, true);
    serialDateChooserPanel5.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext10 = serialDateChooserPanel5.getAccessibleContext();
    java.awt.Dimension dimension11 = serialDateChooserPanel5.getPreferredSize();
    applicationFrame1.setSize(dimension11);
    applicationFrame1.pack();
    java.awt.Dimension dimension14 = applicationFrame1.preferredSize();
    applicationFrame1.setBounds(9999, (int)(byte)1, 13, 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension14);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest119.test07"); }

    org.jfree.ui.RectangleAnchor rectangleAnchor0 = org.jfree.ui.RectangleAnchor.TOP_LEFT;
    java.lang.String str1 = rectangleAnchor0.toString();
    java.lang.String str2 = rectangleAnchor0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleAnchor0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RectangleAnchor.TOP_LEFT"+ "'", str1.equals("RectangleAnchor.TOP_LEFT"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "RectangleAnchor.TOP_LEFT"+ "'", str2.equals("RectangleAnchor.TOP_LEFT"));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest119.test08"); }

    org.jfree.ui.ApplicationFrame applicationFrame2 = new org.jfree.ui.ApplicationFrame("");
    int i3 = applicationFrame2.getState();
    java.util.Locale locale4 = applicationFrame2.getLocale();
    applicationFrame2.transferFocusUpCycle();
    java.awt.Graphics graphics6 = null;
    applicationFrame2.update(graphics6);
    java.beans.PropertyChangeListener propertyChangeListener8 = null;
    applicationFrame2.removePropertyChangeListener(propertyChangeListener8);
    org.jfree.date.SerialDate serialDate12 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel14 = new org.jfree.ui.SerialDateChooserPanel(serialDate12, true);
    serialDateChooserPanel14.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext19 = serialDateChooserPanel14.getAccessibleContext();
    java.awt.Dimension dimension20 = serialDateChooserPanel14.getPreferredSize();
    org.jfree.date.SerialDate serialDate22 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel24 = new org.jfree.ui.SerialDateChooserPanel(serialDate22, true);
    boolean b25 = serialDateChooserPanel24.getIgnoreRepaint();
    javax.swing.InputMap inputMap26 = serialDateChooserPanel24.getInputMap();
    serialDateChooserPanel14.setInputMap((int)(byte)1, inputMap26);
    java.awt.event.FocusListener[] focusListener_array28 = serialDateChooserPanel14.getFocusListeners();
    org.jfree.ui.ApplicationFrame applicationFrame30 = new org.jfree.ui.ApplicationFrame("");
    int i31 = applicationFrame30.getState();
    java.awt.event.WindowEvent windowEvent32 = null;
    applicationFrame30.windowIconified(windowEvent32);
    applicationFrame30.show();
    javax.swing.JMenuBar jMenuBar35 = applicationFrame30.getJMenuBar();
    java.awt.event.WindowStateListener[] windowStateListener_array36 = applicationFrame30.getWindowStateListeners();
    org.jfree.ui.KeyedComboBoxModel keyedComboBoxModel37 = new org.jfree.ui.KeyedComboBoxModel((java.lang.Object[])focusListener_array28, (java.lang.Object[])windowStateListener_array36);
    org.jfree.ui.ApplicationFrame applicationFrame39 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener40 = null;
    applicationFrame39.removeWindowStateListener(windowStateListener40);
    boolean b42 = applicationFrame39.isValidateRoot();
    org.jfree.date.SerialDate serialDate43 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel45 = new org.jfree.ui.SerialDateChooserPanel(serialDate43, true);
    boolean b46 = serialDateChooserPanel45.getIgnoreRepaint();
    javax.swing.InputMap inputMap47 = serialDateChooserPanel45.getInputMap();
    java.awt.Rectangle rectangle48 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle49 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b50 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle48, (java.awt.geom.Rectangle2D)rectangle49);
    java.awt.Rectangle rectangle51 = serialDateChooserPanel45.getBounds(rectangle49);
    org.jfree.date.SerialDate serialDate52 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel54 = new org.jfree.ui.SerialDateChooserPanel(serialDate52, true);
    boolean b55 = serialDateChooserPanel54.getIgnoreRepaint();
    java.awt.Rectangle rectangle56 = serialDateChooserPanel54.getVisibleRect();
    boolean b57 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle49, (java.awt.Shape)rectangle56);
    applicationFrame39.setMaximizedBounds(rectangle49);
    javax.accessibility.AccessibleContext accessibleContext59 = applicationFrame39.getAccessibleContext();
    java.awt.event.WindowEvent windowEvent60 = null;
    applicationFrame39.windowDeiconified(windowEvent60);
    org.jfree.text.TextBox textBox62 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets63 = textBox62.getInteriorGap();
    java.awt.Rectangle rectangle64 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle65 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b66 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle64, (java.awt.geom.Rectangle2D)rectangle65);
    rectangleInsets63.trim((java.awt.geom.Rectangle2D)rectangle65);
    double d68 = rectangleInsets63.getLeft();
    org.jfree.text.TextBox textBox69 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets70 = textBox69.getInteriorGap();
    java.awt.Rectangle rectangle71 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle72 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b73 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle71, (java.awt.geom.Rectangle2D)rectangle72);
    rectangleInsets70.trim((java.awt.geom.Rectangle2D)rectangle72);
    rectangleInsets63.trim((java.awt.geom.Rectangle2D)rectangle72);
    applicationFrame39.setBounds(rectangle72);
    java.awt.Font font78 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.text.TextFragment textFragment80 = new org.jfree.text.TextFragment("PanelUI");
    java.awt.Paint paint81 = textFragment80.getPaint();
    org.jfree.text.TextFragment textFragment82 = new org.jfree.text.TextFragment("org.jfree.ui.SerialDateChooserPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", font78, paint81);
    keyedComboBoxModel37.add((java.lang.Object)rectangle72, (java.lang.Object)font78);
    org.jfree.ui.FontChooserDialog fontChooserDialog84 = new org.jfree.ui.FontChooserDialog((java.awt.Frame)applicationFrame2, "black", false, font78);
    java.awt.Font font85 = fontChooserDialog84.getSelectedFont();
    org.jfree.util.Log.log((int)(short)0, (java.lang.Object)fontChooserDialog84);
    java.awt.Font font87 = fontChooserDialog84.getSelectedFont();
    java.awt.Component component88 = fontChooserDialog84.getFocusOwner();
    org.jfree.ui.RefineryUtilities.centerDialogInParent((java.awt.Dialog)fontChooserDialog84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowStateListener_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d68 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component88);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest119.test09"); }

    org.jfree.text.TextFragment textFragment1 = new org.jfree.text.TextFragment("PanelUI");
    java.awt.Paint paint2 = textFragment1.getPaint();
    java.lang.String str3 = textFragment1.getText();
    java.lang.String str4 = textFragment1.getText();
    java.awt.Graphics2D graphics2D5 = null;
    org.jfree.ui.TextAnchor textAnchor6 = org.jfree.ui.TextAnchor.BOTTOM_RIGHT;
    boolean b7 = textAnchor6.isRight();
    // The following exception was thrown during execution in test generation
    try {
    float f8 = textFragment1.calculateBaselineOffset(graphics2D5, textAnchor6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "PanelUI"+ "'", str3.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "PanelUI"+ "'", str4.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest119.test10"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    serialDateChooserPanel2.resize(8, (int)(short)-1);
    java.awt.Dimension dimension7 = serialDateChooserPanel2.getPreferredSize();
    boolean b8 = serialDateChooserPanel2.isFocusable();
    java.awt.event.KeyListener keyListener9 = null;
    serialDateChooserPanel2.removeKeyListener(keyListener9);
    javax.swing.JPopupMenu jPopupMenu11 = serialDateChooserPanel2.getComponentPopupMenu();
    java.awt.event.HierarchyListener hierarchyListener12 = null;
    serialDateChooserPanel2.removeHierarchyListener(hierarchyListener12);
    org.jfree.ui.Size2D size2D14 = new org.jfree.ui.Size2D();
    size2D14.setWidth((double)100);
    java.lang.String str17 = size2D14.toString();
    boolean b19 = size2D14.equals((java.lang.Object)0.0f);
    size2D14.setWidth((double)5);
    org.jfree.ui.L1R3ButtonPanel l1R3ButtonPanel26 = new org.jfree.ui.L1R3ButtonPanel("TableOrder.BY_COLUMN", "ClassContext", "http://www.jfree.org/jcommon/", "ToolTipText");
    org.jfree.date.SerialDate serialDate28 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel30 = new org.jfree.ui.SerialDateChooserPanel(serialDate28, true);
    boolean b31 = serialDateChooserPanel30.getIgnoreRepaint();
    serialDateChooserPanel30.resize(8, (int)(short)-1);
    java.awt.Dimension dimension35 = serialDateChooserPanel30.getPreferredSize();
    java.lang.Exception exception37 = null;
    org.jfree.util.StackableRuntimeException stackableRuntimeException38 = new org.jfree.util.StackableRuntimeException("", exception37);
    org.jfree.util.Log.log((int)(byte)10, (java.lang.Object)dimension35, (java.lang.Exception)stackableRuntimeException38);
    java.awt.Dimension dimension40 = l1R3ButtonPanel26.getSize(dimension35);
    boolean b41 = size2D14.equals((java.lang.Object)dimension40);
    serialDateChooserPanel2.setPreferredSize(dimension40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jPopupMenu11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Size2D[width=100.0, height=0.0]"+ "'", str17.equals("Size2D[width=100.0, height=0.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

}
