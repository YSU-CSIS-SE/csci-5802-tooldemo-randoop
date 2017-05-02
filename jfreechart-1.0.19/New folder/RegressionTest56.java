
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest56 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest56.test01"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    javax.swing.InputMap inputMap4 = serialDateChooserPanel2.getInputMap();
    javax.swing.TransferHandler transferHandler5 = null;
    serialDateChooserPanel2.setTransferHandler(transferHandler5);
    java.awt.LayoutManager layoutManager7 = serialDateChooserPanel2.getLayout();
    javax.swing.InputVerifier inputVerifier8 = serialDateChooserPanel2.getInputVerifier();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(layoutManager7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(inputVerifier8);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest56.test02"); }

    org.jfree.ui.TextAnchor textAnchor0 = org.jfree.ui.TextAnchor.BOTTOM_CENTER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(textAnchor0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest56.test03"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    java.awt.event.WindowEvent windowEvent3 = null;
    applicationFrame1.windowIconified(windowEvent3);
    applicationFrame1.show();
    boolean b6 = applicationFrame1.isFocused();
    java.awt.MenuBar menuBar7 = applicationFrame1.getMenuBar();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar7);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest56.test04"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    dateCellRenderer0.setIconTextGap(5);
    dateCellRenderer0.validate();
    int i4 = dateCellRenderer0.getIconTextGap();
    java.awt.event.HierarchyListener[] hierarchyListener_array5 = dateCellRenderer0.getHierarchyListeners();
    javax.swing.Icon icon6 = dateCellRenderer0.getDisabledIcon();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon6);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest56.test05"); }

    org.jfree.util.ObjectList objectList0 = new org.jfree.util.ObjectList();
    org.jfree.JCommonInfo jCommonInfo1 = org.jfree.JCommonInfo.getInstance();
    org.jfree.base.BootableProjectInfo bootableProjectInfo7 = new org.jfree.base.BootableProjectInfo("hi!", "hi!", "content", "PanelUI", "");
    jCommonInfo1.addOptionalLibrary((org.jfree.base.Library)bootableProjectInfo7);
    java.util.List list9 = jCommonInfo1.getContributors();
    int i10 = objectList0.indexOf((java.lang.Object)jCommonInfo1);
    java.lang.Object obj12 = objectList0.get(9999);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jCommonInfo1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest56.test06"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    serialDateChooserPanel2.invalidate();
    serialDateChooserPanel2.grabFocus();
    java.awt.ComponentOrientation componentOrientation10 = serialDateChooserPanel2.getComponentOrientation();
    java.awt.Image image11 = null;
    boolean b17 = serialDateChooserPanel2.imageUpdate(image11, 0, 4, 3, 11, 2);
    // The following exception was thrown during execution in test generation
    try {
    javax.swing.InputMap inputMap19 = serialDateChooserPanel2.getInputMap(32);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest56.test07"); }

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
    org.jfree.date.SerialDate serialDate33 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel35 = new org.jfree.ui.SerialDateChooserPanel(serialDate33, true);
    boolean b36 = serialDateChooserPanel35.getIgnoreRepaint();
    boolean b37 = serialDateChooserPanel35.isCursorSet();
    java.awt.Dimension dimension38 = serialDateChooserPanel35.minimumSize();
    org.jfree.date.SerialDate serialDate39 = serialDateChooserPanel35.getDate();
    java.awt.Event event40 = null;
    boolean b43 = serialDateChooserPanel35.mouseMove(event40, 0, 1);
    org.jfree.date.SerialDate serialDate44 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel46 = new org.jfree.ui.SerialDateChooserPanel(serialDate44, true);
    boolean b47 = serialDateChooserPanel46.getIgnoreRepaint();
    javax.swing.InputMap inputMap48 = serialDateChooserPanel46.getInputMap();
    java.awt.Rectangle rectangle49 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle50 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b51 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle49, (java.awt.geom.Rectangle2D)rectangle50);
    java.awt.Rectangle rectangle52 = serialDateChooserPanel46.getBounds(rectangle50);
    java.awt.Rectangle rectangle53 = serialDateChooserPanel35.getBounds(rectangle52);
    org.jfree.ui.RectangleEdge rectangleEdge54 = org.jfree.ui.RectangleEdge.RIGHT;
    org.jfree.ui.RectangleEdge rectangleEdge55 = org.jfree.ui.RectangleEdge.opposite(rectangleEdge54);
    double d56 = org.jfree.ui.RectangleEdge.coordinate((java.awt.geom.Rectangle2D)rectangle52, rectangleEdge54);
    rectangleInsets1.trim((java.awt.geom.Rectangle2D)rectangle52);
    double d59 = rectangleInsets1.calculateTopOutset(8.0d);
    
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
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(serialDate39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleEdge54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleEdge55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d59 == 1.0d);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest56.test08"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array1 = lengthLimitingDocument0.getDocumentListeners();
    javax.swing.text.DocumentFilter documentFilter2 = lengthLimitingDocument0.getDocumentFilter();
    lengthLimitingDocument0.setAsynchronousLoadPriority((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(documentFilter2);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest56.test09"); }

    int i1 = org.jfree.date.SerialDate.stringToMonthCode("title");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest56.test10"); }

    org.jfree.ui.LengthLimitingDocument lengthLimitingDocument0 = new org.jfree.ui.LengthLimitingDocument();
    javax.swing.event.DocumentListener[] documentListener_array1 = lengthLimitingDocument0.getDocumentListeners();
    javax.swing.text.Position position2 = lengthLimitingDocument0.getEndPosition();
    javax.swing.text.Element[] element_array3 = lengthLimitingDocument0.getRootElements();
    javax.swing.text.DocumentFilter documentFilter4 = null;
    lengthLimitingDocument0.setDocumentFilter(documentFilter4);
    javax.swing.event.DocumentListener[] documentListener_array6 = lengthLimitingDocument0.getDocumentListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(position2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(element_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(documentListener_array6);

  }

}
