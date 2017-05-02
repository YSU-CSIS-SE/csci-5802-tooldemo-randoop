
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    int i0 = java.awt.image.ImageObserver.ABORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 128);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    int i0 = javax.swing.WindowConstants.EXIT_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    int i0 = java.awt.Frame.SE_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 5);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    java.awt.Window[] window_array0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(window_array0);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    int i0 = java.awt.Frame.W_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 10);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    boolean b0 = javax.swing.JFrame.isDefaultLookAndFeelDecorated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    int i0 = java.awt.Frame.E_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 11);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    int i0 = java.awt.Frame.S_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 9);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    java.awt.Window[] window_array0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(window_array0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    int i0 = java.awt.image.ImageObserver.PROPERTIES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    int i0 = java.awt.Frame.WAIT_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    float f0 = java.awt.Component.CENTER_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.5f);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    int i0 = java.awt.image.ImageObserver.HEIGHT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    int i0 = java.awt.Frame.DEFAULT_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    int i0 = java.awt.Frame.MAXIMIZED_BOTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 6);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    int i0 = java.awt.Frame.CROSSHAIR_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    // The following exception was thrown during execution in test generation
    try {
    frogger.Patroller patroller3 = new frogger.Patroller((int)'#', 3, "");
      org.junit.Assert.fail("Expected exception of type frogger.wrongDirectionException");
    } catch (frogger.wrongDirectionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    int i0 = java.awt.image.ImageObserver.SOMEBITS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 8);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    int i0 = java.awt.image.ImageObserver.ERROR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 64);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    int i0 = java.awt.Frame.HAND_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 12);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    int i0 = javax.swing.WindowConstants.HIDE_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    float f0 = java.awt.Component.RIGHT_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 1.0f);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    int i0 = javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    int i0 = java.awt.Frame.MAXIMIZED_HORIZ;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    int i0 = java.awt.Frame.TEXT_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.setContentPane(container3);
      org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Point point8 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component9 = froggerApp0.findComponentAt(point8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    int i0 = java.awt.Frame.NW_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 6);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    frogger.Hider hider2 = new frogger.Hider(1, 9);
    int i3 = hider2.getX();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy9);
    java.awt.Point point11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component12 = froggerApp0.findComponentAt(point11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    froggerApp2.addNotify();
    // The following exception was thrown during execution in test generation
    try {
    int i4 = container1.getComponentZOrder((java.awt.Component)froggerApp2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    froggerApp8.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener10 = null;
    froggerApp8.addPropertyChangeListener(propertyChangeListener10);
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.add((java.awt.Component)froggerApp8, (java.lang.Object)0L);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.Component component9 = froggerApp0.getFocusOwner();
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Point point10 = component9.getLocationOnScreen();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component9);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    java.awt.Font font4 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.FontMetrics fontMetrics5 = froggerApp0.getFontMetrics(font4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    float f0 = java.awt.Component.TOP_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.0f);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy9);
    int i11 = froggerApp0.getDefaultCloseOperation();
    frogger.FroggerApp froggerApp12 = new frogger.FroggerApp();
    java.awt.Container container13 = froggerApp12.getParent();
    froggerApp12.repaint((long)5, 2, 1, 128, 11);
    boolean b20 = froggerApp12.getIgnoreRepaint();
    java.awt.Component component21 = froggerApp12.getFocusOwner();
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component22 = froggerApp0.add(component21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component21);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    froggerApp0.setFocusTraversalKeysEnabled(false);
    java.awt.Event event10 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.deliverEvent(event10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.setUndecorated(true);
      org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    int i0 = java.awt.Frame.MAXIMIZED_VERT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy9);
    java.awt.Graphics graphics11 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.paintComponents(graphics11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    java.awt.Graphics graphics3 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.update(graphics3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.setCursor((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    int i0 = javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    java.awt.Rectangle rectangle3 = null;
    froggerApp0.setMaximizedBounds(rectangle3);
    froggerApp0.setFocusTraversalKeysEnabled(false);
    int i7 = froggerApp0.getComponentCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    java.awt.Event event5 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = froggerApp0.postEvent(event5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    boolean b9 = froggerApp0.isValidateRoot();
    frogger.FroggerApp froggerApp11 = new frogger.FroggerApp();
    java.awt.Container container12 = froggerApp11.getParent();
    froggerApp11.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension19 = froggerApp11.preferredSize();
    froggerApp11.toBack();
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component21 = froggerApp0.add("", (java.awt.Component)froggerApp11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension19);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    int i0 = java.awt.Frame.NORMAL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = froggerApp0.getBaselineResizeBehavior();
    java.awt.peer.ComponentPeer componentPeer10 = froggerApp0.getPeer();
    frogger.FroggerApp froggerApp11 = new frogger.FroggerApp();
    java.awt.Container container12 = froggerApp11.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array13 = froggerApp11.getHierarchyListeners();
    froggerApp11.nextFocus();
    java.awt.Dimension dimension15 = froggerApp11.getMaximumSize();
    frogger.FroggerApp froggerApp16 = new frogger.FroggerApp();
    java.awt.Container container17 = froggerApp16.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array18 = froggerApp16.getHierarchyListeners();
    froggerApp16.nextFocus();
    java.awt.Dimension dimension20 = froggerApp16.getMaximumSize();
    froggerApp11.setMinimumSize(dimension20);
    boolean b22 = froggerApp11.isCursorSet();
    java.awt.Component[] component_array23 = froggerApp11.getComponents();
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.setGlassPane((java.awt.Component)froggerApp11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentPeer10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component_array23);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.Dimension dimension18 = froggerApp14.getMaximumSize();
    java.awt.image.VolatileImage volatileImage21 = froggerApp14.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    froggerApp22.addNotify();
    java.awt.Point point24 = froggerApp22.getMousePosition();
    int i25 = froggerApp0.checkImage((java.awt.Image)volatileImage21, (java.awt.image.ImageObserver)froggerApp22);
    boolean b26 = froggerApp22.isFocusTraversable();
    java.awt.Rectangle rectangle27 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp22.setBounds(rectangle27);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = froggerApp0.getBaselineResizeBehavior();
    java.awt.Shape shape10 = null;
    froggerApp0.setShape(shape10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    int i18 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp13);
    froggerApp13.setResizable(false);
    java.awt.ComponentOrientation componentOrientation21 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp13.applyComponentOrientation(componentOrientation21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    int i18 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp13);
    java.io.PrintWriter printWriter19 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.list(printWriter19, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    boolean b2 = froggerApp0.isAutoRequestFocus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    java.awt.Rectangle rectangle3 = null;
    froggerApp0.setMaximizedBounds(rectangle3);
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.remove(2);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.Dimension dimension18 = froggerApp14.getMaximumSize();
    java.awt.image.VolatileImage volatileImage21 = froggerApp14.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    froggerApp22.addNotify();
    java.awt.Point point24 = froggerApp22.getMousePosition();
    int i25 = froggerApp0.checkImage((java.awt.Image)volatileImage21, (java.awt.image.ImageObserver)froggerApp22);
    froggerApp0.setAlwaysOnTop(false);
    javax.swing.JLayeredPane jLayeredPane28 = froggerApp0.getLayeredPane();
    boolean b29 = froggerApp0.isFocusTraversalPolicySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.Component component9 = froggerApp0.getFocusOwner();
    java.awt.MenuComponent menuComponent10 = null;
    froggerApp0.remove(menuComponent10);
    froggerApp0.setAlwaysOnTop(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component9);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array2 = froggerApp0.getMouseWheelListeners();
    java.awt.ComponentOrientation componentOrientation3 = froggerApp0.getComponentOrientation();
    java.io.PrintWriter printWriter4 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.list(printWriter4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation3);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    int i18 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp13);
    java.io.PrintWriter printWriter19 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.list(printWriter19, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    int i18 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp13);
    froggerApp13.setResizable(false);
    java.awt.Graphics graphics21 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp13.printAll(graphics21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    java.awt.Shape shape12 = null;
    froggerApp0.setShape(shape12);
    froggerApp0.firePropertyChange("hi!", (byte)0, (byte)0);
    int i18 = froggerApp0.countComponents();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    froggerApp0.setFocusTraversalKeysEnabled(false);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.awt.AWTKeyStroke> set_aWTKeyStroke11 = froggerApp0.getFocusTraversalKeys(128);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    java.awt.event.ActionEvent actionEvent11 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.actionPerformed(actionEvent11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    java.awt.Rectangle rectangle3 = null;
    froggerApp0.setMaximizedBounds(rectangle3);
    froggerApp0.addNotify();
    froggerApp0.drawBoard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    froggerApp0.repaint();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    frogger.FroggerApp froggerApp12 = new frogger.FroggerApp();
    java.awt.Container container13 = froggerApp12.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array14 = froggerApp12.getHierarchyListeners();
    froggerApp12.nextFocus();
    java.awt.Dimension dimension16 = froggerApp12.getMaximumSize();
    froggerApp7.setMinimumSize(dimension16);
    froggerApp5.setMinimumSize(dimension16);
    frogger.FroggerApp froggerApp19 = new frogger.FroggerApp();
    java.awt.Container container20 = froggerApp19.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array21 = froggerApp19.getHierarchyListeners();
    froggerApp19.nextFocus();
    java.awt.Dimension dimension23 = froggerApp19.getMaximumSize();
    java.awt.image.VolatileImage volatileImage26 = froggerApp19.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp27 = new frogger.FroggerApp();
    froggerApp27.addNotify();
    java.awt.Point point29 = froggerApp27.getMousePosition();
    int i30 = froggerApp5.checkImage((java.awt.Image)volatileImage26, (java.awt.image.ImageObserver)froggerApp27);
    froggerApp5.setAlwaysOnTop(false);
    javax.swing.JLayeredPane jLayeredPane33 = froggerApp5.getLayeredPane();
    frogger.FroggerApp froggerApp34 = new frogger.FroggerApp();
    java.awt.Container container35 = froggerApp34.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array36 = froggerApp34.getHierarchyListeners();
    froggerApp34.nextFocus();
    java.awt.MenuBar menuBar38 = froggerApp34.getMenuBar();
    java.awt.Point point39 = froggerApp34.location();
    java.awt.Component component40 = jLayeredPane33.findComponentAt(point39);
    java.awt.Point point41 = froggerApp0.getLocation(point39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point41);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    float f0 = java.awt.Component.BOTTOM_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 1.0f);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    boolean b9 = froggerApp0.isValidateRoot();
    java.awt.Cursor cursor10 = null;
    froggerApp0.setCursor(cursor10);
    java.awt.event.MouseListener[] mouseListener_array12 = froggerApp0.getMouseListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseListener_array12);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    frogger.FroggerApp froggerApp9 = new frogger.FroggerApp();
    java.awt.Container container10 = froggerApp9.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array11 = froggerApp9.getHierarchyListeners();
    froggerApp9.nextFocus();
    java.awt.MenuBar menuBar13 = froggerApp9.getMenuBar();
    java.awt.Point point14 = froggerApp9.location();
    java.awt.Component component15 = froggerApp0.findComponentAt(point14);
    java.awt.event.MouseMotionListener mouseMotionListener16 = null;
    froggerApp0.addMouseMotionListener(mouseMotionListener16);
    java.awt.Graphics graphics18 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.print(graphics18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component15);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    frogger.FroggerApp froggerApp9 = new frogger.FroggerApp();
    java.awt.Container container10 = froggerApp9.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array11 = froggerApp9.getHierarchyListeners();
    froggerApp9.nextFocus();
    java.awt.MenuBar menuBar13 = froggerApp9.getMenuBar();
    java.awt.Point point14 = froggerApp9.location();
    java.awt.Component component15 = froggerApp0.findComponentAt(point14);
    java.awt.Component component16 = froggerApp0.getGlassPane();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component16);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    java.awt.Rectangle rectangle3 = null;
    froggerApp0.setMaximizedBounds(rectangle3);
    java.beans.PropertyChangeListener propertyChangeListener6 = null;
    froggerApp0.removePropertyChangeListener("", propertyChangeListener6);
    java.awt.Rectangle rectangle8 = froggerApp0.getMaximizedBounds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle8);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    java.awt.Rectangle rectangle3 = null;
    froggerApp0.setMaximizedBounds(rectangle3);
    froggerApp0.setFocusTraversalKeysEnabled(false);
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener7 = null;
    froggerApp0.addHierarchyBoundsListener(hierarchyBoundsListener7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    java.awt.Rectangle rectangle3 = null;
    froggerApp0.setMaximizedBounds(rectangle3);
    froggerApp0.addNotify();
    froggerApp0.setFocusTraversalKeysEnabled(true);
    boolean b10 = froggerApp0.inside(5, 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.Dimension dimension18 = froggerApp14.getMaximumSize();
    java.awt.image.VolatileImage volatileImage21 = froggerApp14.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    froggerApp22.addNotify();
    java.awt.Point point24 = froggerApp22.getMousePosition();
    int i25 = froggerApp0.checkImage((java.awt.Image)volatileImage21, (java.awt.image.ImageObserver)froggerApp22);
    froggerApp0.move((int)(short)-1, (int)'a');
    boolean b29 = froggerApp0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    froggerApp0.setFocusCycleRoot(false);
    java.awt.GraphicsConfiguration graphicsConfiguration11 = froggerApp0.getGraphicsConfiguration();
    java.awt.MenuBar menuBar12 = null;
    froggerApp0.setMenuBar(menuBar12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graphicsConfiguration11);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.preferredSize();
    boolean b5 = froggerApp0.isBackgroundSet();
    java.lang.String str6 = froggerApp0.getWarningString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    int i0 = java.awt.Frame.NE_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 7);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.preferredSize();
    int i5 = froggerApp0.getY();
    java.awt.Event event6 = null;
    boolean b9 = froggerApp0.mouseDrag(event6, (int)' ', 128);
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.setCursor(1092);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    float f0 = java.awt.Component.LEFT_ALIGNMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f0 == 0.0f);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = froggerApp0.getBaselineResizeBehavior();
    java.awt.peer.ComponentPeer componentPeer10 = froggerApp0.getPeer();
    frogger.FroggerApp froggerApp11 = new frogger.FroggerApp();
    java.awt.Container container12 = froggerApp11.getParent();
    froggerApp11.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension19 = froggerApp11.preferredSize();
    frogger.FroggerApp froggerApp20 = new frogger.FroggerApp();
    java.awt.Container container21 = froggerApp20.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array22 = froggerApp20.getHierarchyListeners();
    froggerApp20.nextFocus();
    java.awt.MenuBar menuBar24 = froggerApp20.getMenuBar();
    java.awt.Point point25 = froggerApp20.location();
    java.awt.Component component26 = froggerApp11.findComponentAt(point25);
    java.awt.Component component27 = froggerApp0.findComponentAt(point25);
    java.awt.Component component28 = froggerApp0.getMostRecentFocusOwner();
    froggerApp0.toBack();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentPeer10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component28);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array2 = froggerApp0.getMouseWheelListeners();
    frogger.FroggerApp froggerApp3 = new frogger.FroggerApp();
    froggerApp3.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener5 = null;
    froggerApp3.addPropertyChangeListener(propertyChangeListener5);
    froggerApp3.firePropertyChange("", (short)(byte)10, (short)-1);
    froggerApp3.setLocation(9, (int)'#');
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component15 = froggerApp0.add((java.awt.Component)froggerApp3, 8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array2);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    froggerApp0.setLocation(9, (int)'#');
    froggerApp0.setBounds(7, 11, (int)' ', (int)(short)-1);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    java.awt.Dialog.ModalExclusionType modalExclusionType4 = froggerApp0.getModalExclusionType();
    java.awt.event.FocusListener focusListener5 = null;
    froggerApp0.addFocusListener(focusListener5);
    org.junit.Assert.assertTrue("'" + modalExclusionType4 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType4.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array10 = froggerApp8.getHierarchyListeners();
    froggerApp8.nextFocus();
    java.awt.Dimension dimension12 = froggerApp8.getMaximumSize();
    java.awt.image.VolatileImage volatileImage15 = froggerApp8.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp18 = new frogger.FroggerApp();
    froggerApp18.addNotify();
    boolean b20 = froggerApp18.isCursorSet();
    boolean b21 = froggerApp0.prepareImage((java.awt.Image)volatileImage15, 4, (int)'4', (java.awt.image.ImageObserver)froggerApp18);
    java.awt.Component component22 = froggerApp0.getGlassPane();
    frogger.FroggerApp froggerApp23 = new frogger.FroggerApp();
    froggerApp23.addNotify();
    boolean b25 = froggerApp23.isCursorSet();
    java.awt.Graphics graphics26 = froggerApp23.getGraphics();
    component22.printAll(graphics26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graphics26);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    java.awt.Shape shape12 = null;
    froggerApp0.setShape(shape12);
    java.awt.event.WindowListener[] windowListener_array14 = froggerApp0.getWindowListeners();
    froggerApp0.transferFocusDownCycle();
    froggerApp0.createGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowListener_array14);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    froggerApp0.setLocation(9, (int)'#');
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.remove(11);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    java.awt.Rectangle rectangle3 = null;
    froggerApp0.setMaximizedBounds(rectangle3);
    java.awt.FocusTraversalPolicy focusTraversalPolicy5 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy5);
    boolean b7 = froggerApp0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    java.awt.event.WindowStateListener windowStateListener5 = null;
    froggerApp0.removeWindowStateListener(windowStateListener5);
    java.awt.Event event7 = null;
    boolean b10 = froggerApp0.mouseDown(event7, 10, (int)(short)100);
    boolean b11 = froggerApp0.isBackgroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    froggerApp0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.awt.Point point2 = froggerApp0.getMousePosition();
    java.awt.Font font3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.FontMetrics fontMetrics4 = froggerApp0.getFontMetrics(font3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point2);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    int i0 = java.awt.Frame.N_RESIZE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 8);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.MenuBar menuBar4 = froggerApp0.getMenuBar();
    java.awt.event.InputMethodListener[] inputMethodListener_array5 = froggerApp0.getInputMethodListeners();
    boolean b6 = froggerApp0.isDisplayable();
    java.awt.Color color7 = froggerApp0.getBackground();
    java.awt.event.ActionEvent actionEvent8 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.actionPerformed(actionEvent8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMethodListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color7);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    froggerApp0.setSize((int)(byte)-1, 100);
    froggerApp0.pack();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.Component component9 = froggerApp0.getFocusOwner();
    java.awt.MenuComponent menuComponent10 = null;
    froggerApp0.remove(menuComponent10);
    java.awt.event.WindowFocusListener[] windowFocusListener_array12 = froggerApp0.getWindowFocusListeners();
    java.awt.event.WindowFocusListener[] windowFocusListener_array13 = froggerApp0.getWindowFocusListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowFocusListener_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowFocusListener_array13);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    frogger.FroggerApp froggerApp9 = new frogger.FroggerApp();
    java.awt.Container container10 = froggerApp9.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array11 = froggerApp9.getHierarchyListeners();
    froggerApp9.nextFocus();
    java.awt.MenuBar menuBar13 = froggerApp9.getMenuBar();
    java.awt.Point point14 = froggerApp9.location();
    java.awt.Component component15 = froggerApp0.findComponentAt(point14);
    froggerApp0.disable();
    froggerApp0.move(0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component15);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    froggerApp0.drawBoard();
    boolean b5 = froggerApp0.isVisible();
    java.awt.event.ComponentListener[] componentListener_array6 = froggerApp0.getComponentListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentListener_array6);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.awt.Point point2 = froggerApp0.getMousePosition();
    froggerApp0.toBack();
    int i4 = froggerApp0.getCursorType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array10 = froggerApp8.getHierarchyListeners();
    froggerApp8.nextFocus();
    java.awt.Dimension dimension12 = froggerApp8.getMaximumSize();
    java.awt.image.VolatileImage volatileImage15 = froggerApp8.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp18 = new frogger.FroggerApp();
    froggerApp18.addNotify();
    boolean b20 = froggerApp18.isCursorSet();
    boolean b21 = froggerApp0.prepareImage((java.awt.Image)volatileImage15, 4, (int)'4', (java.awt.image.ImageObserver)froggerApp18);
    froggerApp18.repaint((long)65535, 65535, 1092, (int)(byte)0, 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    java.awt.event.MouseListener[] mouseListener_array8 = froggerApp0.getMouseListeners();
    javax.swing.JLayeredPane jLayeredPane9 = froggerApp0.getLayeredPane();
    java.beans.PropertyChangeListener propertyChangeListener11 = null;
    jLayeredPane9.removePropertyChangeListener("hi!", propertyChangeListener11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseListener_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane9);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    int i0 = javax.swing.JFrame.EXIT_ON_CLOSE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    java.awt.Shape shape12 = null;
    froggerApp0.setShape(shape12);
    froggerApp0.firePropertyChange("hi!", (byte)0, (byte)0);
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.createBufferStrategy(64);
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = froggerApp0.getBaselineResizeBehavior();
    java.awt.peer.ComponentPeer componentPeer10 = froggerApp0.getPeer();
    frogger.FroggerApp froggerApp11 = new frogger.FroggerApp();
    java.awt.Container container12 = froggerApp11.getParent();
    froggerApp11.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension19 = froggerApp11.preferredSize();
    frogger.FroggerApp froggerApp20 = new frogger.FroggerApp();
    java.awt.Container container21 = froggerApp20.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array22 = froggerApp20.getHierarchyListeners();
    froggerApp20.nextFocus();
    java.awt.MenuBar menuBar24 = froggerApp20.getMenuBar();
    java.awt.Point point25 = froggerApp20.location();
    java.awt.Component component26 = froggerApp11.findComponentAt(point25);
    java.awt.Component component27 = froggerApp0.findComponentAt(point25);
    java.awt.Component component28 = froggerApp0.getMostRecentFocusOwner();
    java.awt.Event event29 = null;
    frogger.FroggerApp froggerApp30 = new frogger.FroggerApp();
    java.awt.Container container31 = froggerApp30.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array32 = froggerApp30.getHierarchyListeners();
    froggerApp30.nextFocus();
    java.awt.Dimension dimension34 = froggerApp30.getMaximumSize();
    java.awt.image.VolatileImage volatileImage37 = froggerApp30.createVolatileImage((int)'a', 9);
    java.awt.Dialog.ModalExclusionType modalExclusionType38 = froggerApp30.getModalExclusionType();
    boolean b39 = component28.action(event29, (java.lang.Object)modalExclusionType38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentPeer10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage37);
    org.junit.Assert.assertTrue("'" + modalExclusionType38 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType38.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    java.awt.event.WindowStateListener windowStateListener5 = null;
    froggerApp0.removeWindowStateListener(windowStateListener5);
    java.awt.Window window7 = froggerApp0.getOwner();
    // The following exception was thrown during execution in test generation
    try {
    int i8 = window7.getComponentCount();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(window7);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array10 = froggerApp8.getHierarchyListeners();
    froggerApp8.nextFocus();
    java.awt.Dimension dimension12 = froggerApp8.getMaximumSize();
    java.awt.image.VolatileImage volatileImage15 = froggerApp8.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp18 = new frogger.FroggerApp();
    froggerApp18.addNotify();
    boolean b20 = froggerApp18.isCursorSet();
    boolean b21 = froggerApp0.prepareImage((java.awt.Image)volatileImage15, 4, (int)'4', (java.awt.image.ImageObserver)froggerApp18);
    java.awt.Component component22 = froggerApp0.getGlassPane();
    froggerApp0.setBounds(64, 8, 7, 12);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set<java.awt.AWTKeyStroke> set_aWTKeyStroke29 = froggerApp0.getFocusTraversalKeys((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component22);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    froggerApp0.setSize((int)(byte)-1, 100);
    int i12 = froggerApp0.getWidth();
    froggerApp0.setEnabled(false);
    java.awt.image.BufferStrategy bufferStrategy15 = froggerApp0.getBufferStrategy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(bufferStrategy15);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.preferredSize();
    java.awt.Dimension dimension5 = froggerApp0.getMinimumSize();
    froggerApp0.setName("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension5);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    java.awt.Rectangle rectangle3 = null;
    froggerApp0.setMaximizedBounds(rectangle3);
    froggerApp0.addNotify();
    froggerApp0.setFocusTraversalKeysEnabled(true);
    java.awt.Point point8 = froggerApp0.getMousePosition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point8);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.MenuBar menuBar4 = froggerApp0.getMenuBar();
    java.awt.Point point5 = froggerApp0.location();
    java.beans.PropertyChangeListener[] propertyChangeListener_array7 = froggerApp0.getPropertyChangeListeners("");
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    froggerApp8.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener10 = null;
    froggerApp8.addPropertyChangeListener(propertyChangeListener10);
    java.awt.Dialog.ModalExclusionType modalExclusionType12 = froggerApp8.getModalExclusionType();
    froggerApp0.setModalExclusionType(modalExclusionType12);
    java.awt.event.MouseWheelListener mouseWheelListener14 = null;
    froggerApp0.addMouseWheelListener(mouseWheelListener14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array7);
    org.junit.Assert.assertTrue("'" + modalExclusionType12 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType12.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    java.awt.Frame[] frame_array0 = java.awt.Frame.getFrames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(frame_array0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.Dimension dimension18 = froggerApp14.getMaximumSize();
    java.awt.image.VolatileImage volatileImage21 = froggerApp14.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    froggerApp22.addNotify();
    java.awt.Point point24 = froggerApp22.getMousePosition();
    int i25 = froggerApp0.checkImage((java.awt.Image)volatileImage21, (java.awt.image.ImageObserver)froggerApp22);
    froggerApp0.setAlwaysOnTop(false);
    javax.swing.JLayeredPane jLayeredPane28 = froggerApp0.getLayeredPane();
    boolean b31 = froggerApp0.contains(100, (int)(short)-1);
    java.awt.Event event32 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b33 = froggerApp0.handleEvent(event32);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    int i18 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp13);
    java.awt.Color color19 = froggerApp0.getForeground();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color19);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    froggerApp0.drawBoard();
    froggerApp0.setIgnoreRepaint(false);
    float f7 = froggerApp0.getOpacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f7 == 1.0f);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy9);
    froggerApp0.setTitle("");
    java.awt.image.ColorModel colorModel13 = froggerApp0.getColorModel();
    froggerApp0.setVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel13);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    froggerApp0.toBack();
    java.awt.Color color10 = froggerApp0.getForeground();
    java.awt.Point point11 = froggerApp0.getLocation();
    froggerApp0.reshape(11, (int)(byte)-1, 100, 12);
    froggerApp0.hide();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point11);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    boolean b10 = froggerApp0.areFocusTraversalKeysSet(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    frogger.Hider hider2 = new frogger.Hider(1, 9);
    hider2.act(5, 11);
    boolean b6 = hider2.isVisible();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    froggerApp0.setSize((int)(byte)-1, 100);
    frogger.FroggerApp froggerApp12 = new frogger.FroggerApp();
    java.awt.Container container13 = froggerApp12.getParent();
    froggerApp12.repaint((long)5, 2, 1, 128, 11);
    boolean b20 = froggerApp12.getIgnoreRepaint();
    boolean b21 = froggerApp12.isValidateRoot();
    java.awt.Cursor cursor22 = null;
    froggerApp12.setCursor(cursor22);
    frogger.FroggerApp froggerApp24 = new frogger.FroggerApp();
    froggerApp24.addNotify();
    java.awt.Point point26 = froggerApp24.getMousePosition();
    java.awt.image.VolatileImage volatileImage29 = froggerApp24.createVolatileImage((int)(short)1, (int)' ');
    frogger.FroggerApp froggerApp30 = new frogger.FroggerApp();
    java.awt.Container container31 = froggerApp30.getParent();
    froggerApp30.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension38 = froggerApp30.preferredSize();
    froggerApp30.setSize((int)(short)100, (int)(short)1);
    int i42 = froggerApp12.checkImage((java.awt.Image)volatileImage29, (java.awt.image.ImageObserver)froggerApp30);
    frogger.FroggerApp froggerApp45 = new frogger.FroggerApp();
    java.awt.Container container46 = froggerApp45.getParent();
    frogger.FroggerApp froggerApp47 = new frogger.FroggerApp();
    java.awt.Container container48 = froggerApp47.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array49 = froggerApp47.getHierarchyListeners();
    froggerApp47.nextFocus();
    java.awt.Dimension dimension51 = froggerApp47.getMaximumSize();
    frogger.FroggerApp froggerApp52 = new frogger.FroggerApp();
    java.awt.Container container53 = froggerApp52.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array54 = froggerApp52.getHierarchyListeners();
    froggerApp52.nextFocus();
    java.awt.Dimension dimension56 = froggerApp52.getMaximumSize();
    froggerApp47.setMinimumSize(dimension56);
    froggerApp45.setMinimumSize(dimension56);
    frogger.FroggerApp froggerApp59 = new frogger.FroggerApp();
    java.awt.Container container60 = froggerApp59.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array61 = froggerApp59.getHierarchyListeners();
    froggerApp59.nextFocus();
    java.awt.Dimension dimension63 = froggerApp59.getMaximumSize();
    java.awt.image.VolatileImage volatileImage66 = froggerApp59.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp67 = new frogger.FroggerApp();
    froggerApp67.addNotify();
    java.awt.Point point69 = froggerApp67.getMousePosition();
    int i70 = froggerApp45.checkImage((java.awt.Image)volatileImage66, (java.awt.image.ImageObserver)froggerApp67);
    froggerApp45.move((int)(short)-1, (int)'a');
    froggerApp45.nextFocus();
    froggerApp45.firePropertyChange("", 'a', ' ');
    int i79 = froggerApp0.checkImage((java.awt.Image)volatileImage29, 32, 4, (java.awt.image.ImageObserver)froggerApp45);
    froggerApp45.requestFocus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 32);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    java.awt.Shape shape12 = null;
    froggerApp0.setShape(shape12);
    int i14 = froggerApp0.getHeight();
    java.awt.event.FocusListener[] focusListener_array15 = froggerApp0.getFocusListeners();
    boolean b16 = froggerApp0.getIgnoreRepaint();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 65535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array2 = froggerApp0.getMouseWheelListeners();
    java.awt.event.MouseListener[] mouseListener_array3 = froggerApp0.getMouseListeners();
    java.awt.Component component6 = froggerApp0.locate(3, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseListener_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component6);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    froggerApp0.setLocation(9, (int)'#');
    boolean b11 = froggerApp0.isAlwaysOnTopSupported();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.MenuBar menuBar4 = froggerApp0.getMenuBar();
    java.awt.event.InputMethodListener[] inputMethodListener_array5 = froggerApp0.getInputMethodListeners();
    javax.accessibility.AccessibleContext accessibleContext6 = froggerApp0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMethodListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext6);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.Dimension dimension18 = froggerApp14.getMaximumSize();
    java.awt.image.VolatileImage volatileImage21 = froggerApp14.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    froggerApp22.addNotify();
    java.awt.Point point24 = froggerApp22.getMousePosition();
    int i25 = froggerApp0.checkImage((java.awt.Image)volatileImage21, (java.awt.image.ImageObserver)froggerApp22);
    froggerApp0.setAlwaysOnTop(false);
    javax.swing.JLayeredPane jLayeredPane28 = froggerApp0.getLayeredPane();
    frogger.FroggerApp froggerApp29 = new frogger.FroggerApp();
    java.awt.Container container30 = froggerApp29.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array31 = froggerApp29.getHierarchyListeners();
    froggerApp29.nextFocus();
    java.awt.MenuBar menuBar33 = froggerApp29.getMenuBar();
    java.awt.Point point34 = froggerApp29.location();
    java.awt.Component component35 = jLayeredPane28.findComponentAt(point34);
    frogger.FroggerApp froggerApp36 = new frogger.FroggerApp();
    froggerApp36.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener38 = null;
    froggerApp36.addPropertyChangeListener(propertyChangeListener38);
    froggerApp36.firePropertyChange("", (short)(byte)10, (short)-1);
    froggerApp36.setFocusTraversalKeysEnabled(false);
    java.awt.image.ImageProducer imageProducer46 = null;
    java.awt.Image image47 = froggerApp36.createImage(imageProducer46);
    frogger.FroggerApp froggerApp50 = new frogger.FroggerApp();
    java.awt.Container container51 = froggerApp50.getParent();
    frogger.FroggerApp froggerApp52 = new frogger.FroggerApp();
    java.awt.Container container53 = froggerApp52.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array54 = froggerApp52.getHierarchyListeners();
    froggerApp52.nextFocus();
    java.awt.Dimension dimension56 = froggerApp52.getMaximumSize();
    frogger.FroggerApp froggerApp57 = new frogger.FroggerApp();
    java.awt.Container container58 = froggerApp57.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array59 = froggerApp57.getHierarchyListeners();
    froggerApp57.nextFocus();
    java.awt.Dimension dimension61 = froggerApp57.getMaximumSize();
    froggerApp52.setMinimumSize(dimension61);
    froggerApp50.setMinimumSize(dimension61);
    frogger.FroggerApp froggerApp64 = new frogger.FroggerApp();
    java.awt.Container container65 = froggerApp64.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array66 = froggerApp64.getHierarchyListeners();
    froggerApp64.nextFocus();
    java.awt.Dimension dimension68 = froggerApp64.getMaximumSize();
    java.awt.image.VolatileImage volatileImage71 = froggerApp64.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp72 = new frogger.FroggerApp();
    froggerApp72.addNotify();
    java.awt.Point point74 = froggerApp72.getMousePosition();
    int i75 = froggerApp50.checkImage((java.awt.Image)volatileImage71, (java.awt.image.ImageObserver)froggerApp72);
    froggerApp50.setAlwaysOnTop(false);
    java.awt.event.MouseMotionListener[] mouseMotionListener_array78 = froggerApp50.getMouseMotionListeners();
    // The following exception was thrown during execution in test generation
    try {
    boolean b79 = component35.prepareImage(image47, 2, 128, (java.awt.image.ImageObserver)froggerApp50);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array78);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    froggerApp0.setFocusTraversalKeysEnabled(false);
    froggerApp0.setDefaultCloseOperation((int)(byte)0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    froggerApp0.repaint();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    froggerApp5.addNotify();
    boolean b7 = froggerApp5.isCursorSet();
    java.awt.Graphics graphics8 = froggerApp5.getGraphics();
    froggerApp0.update(graphics8);
    frogger.FroggerApp froggerApp10 = new frogger.FroggerApp();
    java.awt.Container container11 = froggerApp10.getParent();
    frogger.FroggerApp froggerApp12 = new frogger.FroggerApp();
    java.awt.Container container13 = froggerApp12.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array14 = froggerApp12.getHierarchyListeners();
    froggerApp12.nextFocus();
    java.awt.Dimension dimension16 = froggerApp12.getMaximumSize();
    frogger.FroggerApp froggerApp17 = new frogger.FroggerApp();
    java.awt.Container container18 = froggerApp17.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array19 = froggerApp17.getHierarchyListeners();
    froggerApp17.nextFocus();
    java.awt.Dimension dimension21 = froggerApp17.getMaximumSize();
    froggerApp12.setMinimumSize(dimension21);
    froggerApp10.setMinimumSize(dimension21);
    frogger.FroggerApp froggerApp24 = new frogger.FroggerApp();
    java.awt.Container container25 = froggerApp24.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array26 = froggerApp24.getHierarchyListeners();
    froggerApp24.nextFocus();
    java.awt.Dimension dimension28 = froggerApp24.getMaximumSize();
    java.awt.image.VolatileImage volatileImage31 = froggerApp24.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp32 = new frogger.FroggerApp();
    froggerApp32.addNotify();
    java.awt.Point point34 = froggerApp32.getMousePosition();
    int i35 = froggerApp10.checkImage((java.awt.Image)volatileImage31, (java.awt.image.ImageObserver)froggerApp32);
    froggerApp10.setAlwaysOnTop(false);
    javax.swing.JLayeredPane jLayeredPane38 = froggerApp10.getLayeredPane();
    frogger.FroggerApp froggerApp39 = new frogger.FroggerApp();
    java.awt.Container container40 = froggerApp39.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array41 = froggerApp39.getHierarchyListeners();
    froggerApp39.nextFocus();
    java.awt.MenuBar menuBar43 = froggerApp39.getMenuBar();
    java.awt.Point point44 = froggerApp39.location();
    java.awt.Component component45 = jLayeredPane38.findComponentAt(point44);
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.setComponentZOrder((java.awt.Component)jLayeredPane38, 128);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graphics8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component45);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    froggerApp0.setFocusCycleRoot(false);
    java.awt.GraphicsConfiguration graphicsConfiguration11 = froggerApp0.getGraphicsConfiguration();
    froggerApp0.repaint((long)4);
    froggerApp0.addNotify();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graphicsConfiguration11);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    java.awt.Shape shape12 = null;
    froggerApp0.setShape(shape12);
    froggerApp0.firePropertyChange("hi!", (byte)0, (byte)0);
    java.util.List<java.awt.Image> list_image18 = froggerApp0.getIconImages();
    frogger.FroggerApp froggerApp19 = new frogger.FroggerApp();
    froggerApp19.addNotify();
    boolean b21 = froggerApp19.isCursorSet();
    java.awt.Rectangle rectangle22 = null;
    froggerApp19.setMaximizedBounds(rectangle22);
    int i24 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp19);
    java.awt.Container container25 = froggerApp0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_image18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container25);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy9);
    froggerApp0.setTitle("");
    java.awt.image.ColorModel colorModel13 = froggerApp0.getColorModel();
    java.awt.dnd.DropTarget dropTarget14 = froggerApp0.getDropTarget();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dropTarget14);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    java.awt.Rectangle rectangle3 = null;
    froggerApp0.setMaximizedBounds(rectangle3);
    java.awt.FocusTraversalPolicy focusTraversalPolicy5 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy5);
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp0.getHierarchyListeners();
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    froggerApp8.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener10 = null;
    froggerApp8.addPropertyChangeListener(propertyChangeListener10);
    froggerApp8.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp16 = new frogger.FroggerApp();
    java.awt.Container container17 = froggerApp16.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array18 = froggerApp16.getHierarchyListeners();
    froggerApp16.nextFocus();
    java.awt.Dimension dimension20 = froggerApp16.getMaximumSize();
    java.awt.image.VolatileImage volatileImage23 = froggerApp16.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp26 = new frogger.FroggerApp();
    froggerApp26.addNotify();
    boolean b28 = froggerApp26.isCursorSet();
    boolean b29 = froggerApp8.prepareImage((java.awt.Image)volatileImage23, 4, (int)'4', (java.awt.image.ImageObserver)froggerApp26);
    froggerApp0.setIconImage((java.awt.Image)volatileImage23);
    frogger.FroggerApp froggerApp31 = new frogger.FroggerApp();
    java.awt.Container container32 = froggerApp31.getParent();
    froggerApp31.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension39 = froggerApp31.preferredSize();
    froggerApp31.toBack();
    boolean b41 = froggerApp31.isFocusTraversalPolicyProvider();
    froggerApp0.setLocationRelativeTo((java.awt.Component)froggerApp31);
    java.awt.event.ComponentListener componentListener43 = null;
    froggerApp0.removeComponentListener(componentListener43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    boolean b9 = froggerApp0.isValidateRoot();
    boolean b10 = froggerApp0.isResizable();
    froggerApp0.pack();
    java.awt.Font font12 = froggerApp0.getFont();
    java.awt.event.HierarchyListener hierarchyListener13 = null;
    froggerApp0.removeHierarchyListener(hierarchyListener13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font12);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    froggerApp0.setFocusTraversalKeysEnabled(false);
    java.awt.image.ImageProducer imageProducer10 = null;
    java.awt.Image image11 = froggerApp0.createImage(imageProducer10);
    java.awt.Window window12 = froggerApp0.getOwner();
    boolean b13 = froggerApp0.isFocusCycleRoot();
    java.awt.Event event14 = null;
    frogger.FroggerApp froggerApp15 = new frogger.FroggerApp();
    java.awt.Container container16 = froggerApp15.getParent();
    froggerApp15.repaint((long)5, 2, 1, 128, 11);
    boolean b23 = froggerApp15.getIgnoreRepaint();
    froggerApp15.setSize((int)(byte)-1, 100);
    int i27 = froggerApp15.getWidth();
    boolean b28 = froggerApp0.action(event14, (java.lang.Object)froggerApp15);
    java.awt.PopupMenu popupMenu29 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.add(popupMenu29);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(window12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    java.awt.Shape shape12 = null;
    froggerApp0.setShape(shape12);
    froggerApp0.firePropertyChange("hi!", (byte)0, (byte)0);
    java.util.List<java.awt.Image> list_image18 = froggerApp0.getIconImages();
    frogger.FroggerApp froggerApp19 = new frogger.FroggerApp();
    froggerApp19.addNotify();
    boolean b21 = froggerApp19.isCursorSet();
    java.awt.Rectangle rectangle22 = null;
    froggerApp19.setMaximizedBounds(rectangle22);
    int i24 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp19);
    boolean b25 = froggerApp19.isDoubleBuffered();
    froggerApp19.enable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_image18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.resize((int)(short)100, (int)(byte)-1);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.awt.event.MouseListener mouseListener2 = null;
    froggerApp0.removeMouseListener(mouseListener2);
    froggerApp0.enable(false);
    // The following exception was thrown during execution in test generation
    try {
    boolean b7 = froggerApp0.areFocusTraversalKeysSet((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.setSize(6, 12);
    java.awt.Point point6 = froggerApp0.getLocationOnScreen();
    javax.swing.TransferHandler transferHandler7 = null;
    froggerApp0.setTransferHandler(transferHandler7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point6);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.MenuBar menuBar4 = froggerApp0.getMenuBar();
    java.awt.event.InputMethodListener[] inputMethodListener_array5 = froggerApp0.getInputMethodListeners();
    boolean b6 = froggerApp0.isDisplayable();
    java.awt.event.HierarchyListener hierarchyListener7 = null;
    froggerApp0.removeHierarchyListener(hierarchyListener7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMethodListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy9);
    int i11 = froggerApp0.getDefaultCloseOperation();
    java.awt.Point point12 = froggerApp0.getLocationOnScreen();
    java.awt.Cursor cursor13 = null;
    froggerApp0.setCursor(cursor13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point12);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    java.awt.Shape shape12 = null;
    froggerApp0.setShape(shape12);
    int i14 = froggerApp0.getHeight();
    boolean b15 = froggerApp0.isFocusTraversalPolicyProvider();
    int i18 = froggerApp0.getBaseline((int)'4', 65535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 65535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.preferredSize();
    java.awt.Dimension dimension5 = froggerApp0.getMinimumSize();
    froggerApp0.setFocusCycleRoot(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension5);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.Dimension dimension18 = froggerApp14.getMaximumSize();
    java.awt.image.VolatileImage volatileImage21 = froggerApp14.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    froggerApp22.addNotify();
    java.awt.Point point24 = froggerApp22.getMousePosition();
    int i25 = froggerApp0.checkImage((java.awt.Image)volatileImage21, (java.awt.image.ImageObserver)froggerApp22);
    froggerApp0.move((int)(short)-1, (int)'a');
    java.awt.Color color29 = froggerApp0.getForeground();
    java.awt.Image image30 = froggerApp0.getIconImage();
    frogger.FroggerApp froggerApp31 = new frogger.FroggerApp();
    froggerApp31.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener33 = null;
    froggerApp31.addPropertyChangeListener(propertyChangeListener33);
    froggerApp31.firePropertyChange("", (short)(byte)10, (short)-1);
    froggerApp31.setFocusTraversalKeysEnabled(false);
    java.awt.image.ImageProducer imageProducer41 = null;
    java.awt.Image image42 = froggerApp31.createImage(imageProducer41);
    frogger.FroggerApp froggerApp45 = new frogger.FroggerApp();
    java.awt.Container container46 = froggerApp45.getParent();
    froggerApp45.repaint((long)5, 2, 1, 128, 11);
    boolean b53 = froggerApp45.getIgnoreRepaint();
    boolean b54 = froggerApp45.isValidateRoot();
    boolean b55 = froggerApp45.isResizable();
    // The following exception was thrown during execution in test generation
    try {
    boolean b56 = froggerApp0.prepareImage(image42, (int)' ', (int)(short)10, (java.awt.image.ImageObserver)froggerApp45);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(image30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    java.awt.image.VolatileImage volatileImage7 = froggerApp0.createVolatileImage((int)'a', 9);
    java.awt.Dialog.ModalExclusionType modalExclusionType8 = froggerApp0.getModalExclusionType();
    frogger.FroggerApp froggerApp9 = new frogger.FroggerApp();
    java.awt.Container container10 = froggerApp9.getParent();
    frogger.FroggerApp froggerApp11 = new frogger.FroggerApp();
    java.awt.Container container12 = froggerApp11.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array13 = froggerApp11.getHierarchyListeners();
    froggerApp11.nextFocus();
    java.awt.Dimension dimension15 = froggerApp11.getMaximumSize();
    frogger.FroggerApp froggerApp16 = new frogger.FroggerApp();
    java.awt.Container container17 = froggerApp16.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array18 = froggerApp16.getHierarchyListeners();
    froggerApp16.nextFocus();
    java.awt.Dimension dimension20 = froggerApp16.getMaximumSize();
    froggerApp11.setMinimumSize(dimension20);
    froggerApp9.setMinimumSize(dimension20);
    frogger.FroggerApp froggerApp23 = new frogger.FroggerApp();
    java.awt.Container container24 = froggerApp23.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array25 = froggerApp23.getHierarchyListeners();
    froggerApp23.nextFocus();
    java.awt.Dimension dimension27 = froggerApp23.getMaximumSize();
    java.awt.image.VolatileImage volatileImage30 = froggerApp23.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp31 = new frogger.FroggerApp();
    froggerApp31.addNotify();
    java.awt.Point point33 = froggerApp31.getMousePosition();
    int i34 = froggerApp9.checkImage((java.awt.Image)volatileImage30, (java.awt.image.ImageObserver)froggerApp31);
    frogger.FroggerApp froggerApp37 = new frogger.FroggerApp();
    froggerApp37.addNotify();
    java.awt.event.MouseListener mouseListener39 = null;
    froggerApp37.removeMouseListener(mouseListener39);
    java.awt.event.InputMethodListener inputMethodListener41 = null;
    froggerApp37.removeInputMethodListener(inputMethodListener41);
    java.awt.Dimension dimension43 = froggerApp37.getMaximumSize();
    boolean b44 = froggerApp0.prepareImage((java.awt.Image)volatileImage30, 11, (int)(short)10, (java.awt.image.ImageObserver)froggerApp37);
    java.awt.event.MouseMotionListener mouseMotionListener45 = null;
    froggerApp37.addMouseMotionListener(mouseMotionListener45);
    boolean b47 = froggerApp37.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage7);
    org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.Component component9 = froggerApp0.getFocusOwner();
    frogger.FroggerApp froggerApp10 = new frogger.FroggerApp();
    java.awt.Container container11 = froggerApp10.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array12 = froggerApp10.getHierarchyListeners();
    froggerApp10.nextFocus();
    java.awt.MenuBar menuBar14 = froggerApp10.getMenuBar();
    java.beans.PropertyChangeListener[] propertyChangeListener_array16 = froggerApp10.getPropertyChangeListeners("");
    froggerApp10.invalidate();
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.setComponentZOrder((java.awt.Component)froggerApp10, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array16);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    java.awt.Color color5 = froggerApp0.getBackground();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color5);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    froggerApp0.toBack();
    frogger.FroggerApp froggerApp10 = new frogger.FroggerApp();
    java.awt.Container container11 = froggerApp10.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array12 = froggerApp10.getHierarchyListeners();
    froggerApp10.nextFocus();
    java.awt.Dimension dimension14 = froggerApp10.getMaximumSize();
    frogger.FroggerApp froggerApp15 = new frogger.FroggerApp();
    java.awt.Container container16 = froggerApp15.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array17 = froggerApp15.getHierarchyListeners();
    froggerApp15.nextFocus();
    java.awt.Dimension dimension19 = froggerApp15.getMaximumSize();
    froggerApp10.setMinimumSize(dimension19);
    froggerApp0.setMaximumSize(dimension19);
    java.awt.Insets insets22 = froggerApp0.getInsets();
    java.io.PrintStream printStream23 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.list(printStream23);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets22);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array2 = froggerApp0.getMouseWheelListeners();
    java.awt.event.MouseListener[] mouseListener_array3 = froggerApp0.getMouseListeners();
    java.awt.Event event4 = null;
    boolean b7 = froggerApp0.mouseDrag(event4, 11, (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseListener_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    froggerApp0.setSize((int)(byte)-1, 100);
    int i12 = froggerApp0.getWidth();
    int i13 = froggerApp0.getComponentCount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    java.awt.event.ContainerListener containerListener14 = null;
    froggerApp0.addContainerListener(containerListener14);
    java.awt.dnd.DropTarget dropTarget16 = null;
    froggerApp0.setDropTarget(dropTarget16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    java.awt.Insets insets3 = froggerApp0.getInsets();
    java.awt.event.WindowFocusListener windowFocusListener4 = null;
    froggerApp0.removeWindowFocusListener(windowFocusListener4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    int i18 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp13);
    java.awt.Rectangle rectangle19 = froggerApp13.getMaximizedBounds();
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component21 = froggerApp13.getComponent((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle19);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.MenuBar menuBar4 = froggerApp0.getMenuBar();
    boolean b5 = froggerApp0.isCursorSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    // The following exception was thrown during execution in test generation
    try {
    frogger.Patroller patroller3 = new frogger.Patroller(0, 6, "hi!");
      org.junit.Assert.fail("Expected exception of type frogger.wrongDirectionException");
    } catch (frogger.wrongDirectionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy9);
    int i11 = froggerApp0.getDefaultCloseOperation();
    java.awt.image.ColorModel colorModel12 = froggerApp0.getColorModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel12);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.awt.Point point2 = froggerApp0.getMousePosition();
    java.awt.image.VolatileImage volatileImage5 = froggerApp0.createVolatileImage((int)(short)1, (int)' ');
    java.awt.LayoutManager layoutManager6 = froggerApp0.getLayout();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    froggerApp7.addNotify();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array9 = froggerApp7.getMouseWheelListeners();
    java.awt.event.MouseListener[] mouseListener_array10 = froggerApp7.getMouseListeners();
    java.awt.Window window11 = froggerApp7.getOwner();
    frogger.FroggerApp froggerApp12 = new frogger.FroggerApp();
    java.awt.Container container13 = froggerApp12.getParent();
    froggerApp12.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension20 = froggerApp12.preferredSize();
    froggerApp12.toBack();
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    java.awt.Container container23 = froggerApp22.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array24 = froggerApp22.getHierarchyListeners();
    froggerApp22.nextFocus();
    java.awt.Dimension dimension26 = froggerApp22.getMaximumSize();
    frogger.FroggerApp froggerApp27 = new frogger.FroggerApp();
    java.awt.Container container28 = froggerApp27.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array29 = froggerApp27.getHierarchyListeners();
    froggerApp27.nextFocus();
    java.awt.Dimension dimension31 = froggerApp27.getMaximumSize();
    froggerApp22.setMinimumSize(dimension31);
    froggerApp12.setMaximumSize(dimension31);
    java.awt.Font font34 = null;
    froggerApp12.setFont(font34);
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.add((java.awt.Component)froggerApp7, (java.lang.Object)font34, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(layoutManager6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(window11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension31);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    java.awt.Rectangle rectangle3 = null;
    froggerApp0.setMaximizedBounds(rectangle3);
    java.awt.FocusTraversalPolicy focusTraversalPolicy5 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy5);
    java.awt.Image image7 = froggerApp0.getIconImage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(image7);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = froggerApp0.getBaselineResizeBehavior();
    java.awt.peer.ComponentPeer componentPeer10 = froggerApp0.getPeer();
    frogger.FroggerApp froggerApp11 = new frogger.FroggerApp();
    java.awt.Container container12 = froggerApp11.getParent();
    froggerApp11.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension19 = froggerApp11.preferredSize();
    frogger.FroggerApp froggerApp20 = new frogger.FroggerApp();
    java.awt.Container container21 = froggerApp20.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array22 = froggerApp20.getHierarchyListeners();
    froggerApp20.nextFocus();
    java.awt.MenuBar menuBar24 = froggerApp20.getMenuBar();
    java.awt.Point point25 = froggerApp20.location();
    java.awt.Component component26 = froggerApp11.findComponentAt(point25);
    java.awt.Component component27 = froggerApp0.findComponentAt(point25);
    boolean b28 = froggerApp0.isFocusTraversable();
    java.awt.ImageCapabilities imageCapabilities31 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.awt.image.VolatileImage volatileImage32 = froggerApp0.createVolatileImage((int)(byte)-1, (int)(short)10, imageCapabilities31);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentPeer10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array2 = froggerApp0.getMouseWheelListeners();
    froggerApp0.setAlwaysOnTop(true);
    froggerApp0.hide();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array2);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    froggerApp0.setSize((int)(short)100, (int)(short)1);
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.applyResourceBundle("H");
      org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    froggerApp0.toBack();
    frogger.FroggerApp froggerApp10 = new frogger.FroggerApp();
    java.awt.Container container11 = froggerApp10.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array12 = froggerApp10.getHierarchyListeners();
    froggerApp10.nextFocus();
    java.awt.Dimension dimension14 = froggerApp10.getMaximumSize();
    frogger.FroggerApp froggerApp15 = new frogger.FroggerApp();
    java.awt.Container container16 = froggerApp15.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array17 = froggerApp15.getHierarchyListeners();
    froggerApp15.nextFocus();
    java.awt.Dimension dimension19 = froggerApp15.getMaximumSize();
    froggerApp10.setMinimumSize(dimension19);
    froggerApp0.setMaximumSize(dimension19);
    froggerApp0.setBounds(1092, (int)(short)0, (int)(byte)0, 100);
    javax.swing.TransferHandler transferHandler27 = null;
    froggerApp0.setTransferHandler(transferHandler27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension19);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    froggerApp0.setFocusCycleRoot(false);
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component12 = froggerApp0.getComponent(5);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.Dimension dimension18 = froggerApp14.getMaximumSize();
    java.awt.image.VolatileImage volatileImage21 = froggerApp14.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    froggerApp22.addNotify();
    java.awt.Point point24 = froggerApp22.getMousePosition();
    int i25 = froggerApp0.checkImage((java.awt.Image)volatileImage21, (java.awt.image.ImageObserver)froggerApp22);
    froggerApp0.move((int)(short)-1, (int)'a');
    java.awt.Color color29 = froggerApp0.getForeground();
    java.awt.Image image30 = froggerApp0.getIconImage();
    java.awt.GraphicsConfiguration graphicsConfiguration31 = froggerApp0.getGraphicsConfiguration();
    froggerApp0.setLocation(1092, (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(image30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graphicsConfiguration31);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.MenuBar menuBar4 = froggerApp0.getMenuBar();
    java.beans.PropertyChangeListener[] propertyChangeListener_array6 = froggerApp0.getPropertyChangeListeners("");
    froggerApp0.invalidate();
    boolean b8 = froggerApp0.isFocused();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array10 = froggerApp8.getHierarchyListeners();
    froggerApp8.nextFocus();
    java.awt.Dimension dimension12 = froggerApp8.getMaximumSize();
    java.awt.image.VolatileImage volatileImage15 = froggerApp8.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp18 = new frogger.FroggerApp();
    froggerApp18.addNotify();
    boolean b20 = froggerApp18.isCursorSet();
    boolean b21 = froggerApp0.prepareImage((java.awt.Image)volatileImage15, 4, (int)'4', (java.awt.image.ImageObserver)froggerApp18);
    boolean b22 = froggerApp18.isUndecorated();
    java.util.Locale locale23 = froggerApp18.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale23);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    froggerApp0.toBack();
    java.awt.Color color10 = froggerApp0.getForeground();
    java.awt.Point point11 = froggerApp0.getLocation();
    froggerApp0.reshape(11, (int)(byte)-1, 100, 12);
    froggerApp0.setEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point11);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.MenuBar menuBar4 = froggerApp0.getMenuBar();
    java.beans.PropertyChangeListener[] propertyChangeListener_array6 = froggerApp0.getPropertyChangeListeners("");
    froggerApp0.invalidate();
    java.awt.event.KeyListener keyListener8 = null;
    froggerApp0.addKeyListener(keyListener8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array6);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    froggerApp0.drawBoard();
    froggerApp0.setIgnoreRepaint(false);
    java.awt.Rectangle rectangle7 = froggerApp0.getBounds();
    boolean b8 = froggerApp0.isDoubleBuffered();
    froggerApp0.createGame();
    java.lang.String str10 = froggerApp0.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    // The following exception was thrown during execution in test generation
    try {
    frogger.Patroller patroller3 = new frogger.Patroller(65535, (int)'a', "hi!");
      org.junit.Assert.fail("Expected exception of type frogger.wrongDirectionException");
    } catch (frogger.wrongDirectionException e) {
      // Expected exception.
    }

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    froggerApp0.setSize((int)(byte)-1, 100);
    java.awt.Point point12 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b13 = froggerApp0.contains(point12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    froggerApp0.hide();
    boolean b10 = froggerApp0.isAlwaysOnTop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.Dimension dimension18 = froggerApp14.getMaximumSize();
    java.awt.image.VolatileImage volatileImage21 = froggerApp14.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    froggerApp22.addNotify();
    java.awt.Point point24 = froggerApp22.getMousePosition();
    int i25 = froggerApp0.checkImage((java.awt.Image)volatileImage21, (java.awt.image.ImageObserver)froggerApp22);
    froggerApp0.setAlwaysOnTop(false);
    javax.swing.JLayeredPane jLayeredPane28 = froggerApp0.getLayeredPane();
    boolean b31 = froggerApp0.contains(100, (int)(short)-1);
    java.awt.event.HierarchyListener[] hierarchyListener_array32 = froggerApp0.getHierarchyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array32);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.Dimension dimension18 = froggerApp14.getMaximumSize();
    java.awt.image.VolatileImage volatileImage21 = froggerApp14.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    froggerApp22.addNotify();
    java.awt.Point point24 = froggerApp22.getMousePosition();
    int i25 = froggerApp0.checkImage((java.awt.Image)volatileImage21, (java.awt.image.ImageObserver)froggerApp22);
    froggerApp0.move((int)(short)-1, (int)'a');
    froggerApp0.nextFocus();
    froggerApp0.firePropertyChange("", 'a', ' ');
    java.beans.PropertyChangeListener propertyChangeListener35 = null;
    froggerApp0.removePropertyChangeListener("H", propertyChangeListener35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    froggerApp0.setFocusTraversalKeysEnabled(false);
    java.awt.image.ImageProducer imageProducer10 = null;
    java.awt.Image image11 = froggerApp0.createImage(imageProducer10);
    java.awt.Window window12 = froggerApp0.getOwner();
    boolean b13 = froggerApp0.isFocusCycleRoot();
    java.awt.Dimension dimension14 = froggerApp0.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(window12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension14);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array10 = froggerApp8.getHierarchyListeners();
    froggerApp8.nextFocus();
    java.awt.Dimension dimension12 = froggerApp8.getMaximumSize();
    java.awt.image.VolatileImage volatileImage15 = froggerApp8.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp18 = new frogger.FroggerApp();
    froggerApp18.addNotify();
    boolean b20 = froggerApp18.isCursorSet();
    boolean b21 = froggerApp0.prepareImage((java.awt.Image)volatileImage15, 4, (int)'4', (java.awt.image.ImageObserver)froggerApp18);
    java.awt.dnd.DropTarget dropTarget22 = null;
    froggerApp0.setDropTarget(dropTarget22);
    frogger.FroggerApp froggerApp24 = new frogger.FroggerApp();
    froggerApp24.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener26 = null;
    froggerApp24.addPropertyChangeListener(propertyChangeListener26);
    froggerApp24.firePropertyChange("", (short)(byte)10, (short)-1);
    froggerApp24.setFocusTraversalKeysEnabled(false);
    java.awt.image.ImageProducer imageProducer34 = null;
    java.awt.Image image35 = froggerApp24.createImage(imageProducer34);
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.setIconImage(image35);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image35);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    froggerApp0.drawBoard();
    froggerApp0.setIgnoreRepaint(false);
    java.awt.Rectangle rectangle7 = froggerApp0.getBounds();
    boolean b8 = froggerApp0.isDoubleBuffered();
    froggerApp0.createGame();
    java.awt.Window window10 = froggerApp0.getOwner();
    java.awt.Event event11 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b14 = window10.mouseDrag(event11, (int)'4', 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(window10);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    int i18 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp13);
    java.awt.event.MouseMotionListener[] mouseMotionListener_array19 = froggerApp13.getMouseMotionListeners();
    java.awt.Dialog.ModalExclusionType modalExclusionType20 = null;
    froggerApp13.setModalExclusionType(modalExclusionType20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array19);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy9);
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener11 = null;
    froggerApp0.removeHierarchyBoundsListener(hierarchyBoundsListener11);
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    froggerApp13.repaint((long)5, 2, 1, 128, 11);
    boolean b21 = froggerApp13.getIgnoreRepaint();
    boolean b22 = froggerApp13.isValidateRoot();
    boolean b23 = froggerApp13.isResizable();
    froggerApp13.pack();
    java.awt.Font font25 = froggerApp13.getFont();
    java.awt.FontMetrics fontMetrics26 = froggerApp0.getFontMetrics(font25);
    java.awt.Shape shape27 = froggerApp0.getShape();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(fontMetrics26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(shape27);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.MenuBar menuBar4 = froggerApp0.getMenuBar();
    java.beans.PropertyChangeListener[] propertyChangeListener_array6 = froggerApp0.getPropertyChangeListeners("");
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    frogger.FroggerApp froggerApp12 = new frogger.FroggerApp();
    java.awt.Container container13 = froggerApp12.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array14 = froggerApp12.getHierarchyListeners();
    froggerApp12.nextFocus();
    java.awt.Dimension dimension16 = froggerApp12.getMaximumSize();
    froggerApp7.setMinimumSize(dimension16);
    boolean b18 = froggerApp7.isCursorSet();
    java.awt.Shape shape19 = null;
    froggerApp7.setShape(shape19);
    int i21 = froggerApp7.getHeight();
    java.awt.Rectangle rectangle22 = froggerApp7.getBounds();
    int i23 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 65535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    froggerApp0.setFocusTraversalKeysEnabled(false);
    java.awt.peer.ComponentPeer componentPeer10 = froggerApp0.getPeer();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentPeer10);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    java.awt.Shape shape12 = null;
    froggerApp0.setShape(shape12);
    froggerApp0.firePropertyChange("hi!", (byte)0, (byte)0);
    java.util.List<java.awt.Image> list_image18 = froggerApp0.getIconImages();
    frogger.FroggerApp froggerApp19 = new frogger.FroggerApp();
    froggerApp19.addNotify();
    boolean b21 = froggerApp19.isCursorSet();
    java.awt.Rectangle rectangle22 = null;
    froggerApp19.setMaximizedBounds(rectangle22);
    int i24 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp19);
    boolean b25 = froggerApp19.isDoubleBuffered();
    boolean b26 = froggerApp19.isBackgroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_image18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    java.awt.image.VolatileImage volatileImage7 = froggerApp0.createVolatileImage((int)'a', 9);
    java.awt.Dialog.ModalExclusionType modalExclusionType8 = froggerApp0.getModalExclusionType();
    frogger.FroggerApp froggerApp9 = new frogger.FroggerApp();
    java.awt.Container container10 = froggerApp9.getParent();
    frogger.FroggerApp froggerApp11 = new frogger.FroggerApp();
    java.awt.Container container12 = froggerApp11.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array13 = froggerApp11.getHierarchyListeners();
    froggerApp11.nextFocus();
    java.awt.Dimension dimension15 = froggerApp11.getMaximumSize();
    frogger.FroggerApp froggerApp16 = new frogger.FroggerApp();
    java.awt.Container container17 = froggerApp16.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array18 = froggerApp16.getHierarchyListeners();
    froggerApp16.nextFocus();
    java.awt.Dimension dimension20 = froggerApp16.getMaximumSize();
    froggerApp11.setMinimumSize(dimension20);
    froggerApp9.setMinimumSize(dimension20);
    frogger.FroggerApp froggerApp23 = new frogger.FroggerApp();
    java.awt.Container container24 = froggerApp23.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array25 = froggerApp23.getHierarchyListeners();
    froggerApp23.nextFocus();
    java.awt.Dimension dimension27 = froggerApp23.getMaximumSize();
    java.awt.image.VolatileImage volatileImage30 = froggerApp23.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp31 = new frogger.FroggerApp();
    froggerApp31.addNotify();
    java.awt.Point point33 = froggerApp31.getMousePosition();
    int i34 = froggerApp9.checkImage((java.awt.Image)volatileImage30, (java.awt.image.ImageObserver)froggerApp31);
    frogger.FroggerApp froggerApp37 = new frogger.FroggerApp();
    froggerApp37.addNotify();
    java.awt.event.MouseListener mouseListener39 = null;
    froggerApp37.removeMouseListener(mouseListener39);
    java.awt.event.InputMethodListener inputMethodListener41 = null;
    froggerApp37.removeInputMethodListener(inputMethodListener41);
    java.awt.Dimension dimension43 = froggerApp37.getMaximumSize();
    boolean b44 = froggerApp0.prepareImage((java.awt.Image)volatileImage30, 11, (int)(short)10, (java.awt.image.ImageObserver)froggerApp37);
    java.awt.Event event45 = null;
    boolean b47 = froggerApp0.keyUp(event45, 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage7);
    org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    froggerApp0.firePropertyChange("hi!", (byte)10, (byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    int i18 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp13);
    java.awt.Rectangle rectangle19 = froggerApp13.getMaximizedBounds();
    java.awt.event.MouseListener mouseListener20 = null;
    froggerApp13.removeMouseListener(mouseListener20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(rectangle19);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    java.awt.Shape shape12 = null;
    froggerApp0.setShape(shape12);
    java.awt.event.WindowListener[] windowListener_array14 = froggerApp0.getWindowListeners();
    frogger.FroggerApp froggerApp15 = new frogger.FroggerApp();
    java.awt.Container container16 = froggerApp15.getParent();
    froggerApp15.repaint((long)5, 2, 1, 128, 11);
    boolean b23 = froggerApp15.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy24 = null;
    froggerApp15.setFocusTraversalPolicy(focusTraversalPolicy24);
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
    froggerApp15.removeHierarchyBoundsListener(hierarchyBoundsListener26);
    frogger.FroggerApp froggerApp28 = new frogger.FroggerApp();
    java.awt.Container container29 = froggerApp28.getParent();
    froggerApp28.repaint((long)5, 2, 1, 128, 11);
    boolean b36 = froggerApp28.getIgnoreRepaint();
    boolean b37 = froggerApp28.isValidateRoot();
    boolean b38 = froggerApp28.isResizable();
    froggerApp28.pack();
    java.awt.Font font40 = froggerApp28.getFont();
    java.awt.FontMetrics fontMetrics41 = froggerApp15.getFontMetrics(font40);
    froggerApp0.setFont(font40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowListener_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(fontMetrics41);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.Dimension dimension18 = froggerApp14.getMaximumSize();
    java.awt.image.VolatileImage volatileImage21 = froggerApp14.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    froggerApp22.addNotify();
    java.awt.Point point24 = froggerApp22.getMousePosition();
    int i25 = froggerApp0.checkImage((java.awt.Image)volatileImage21, (java.awt.image.ImageObserver)froggerApp22);
    froggerApp0.setAlwaysOnTop(false);
    javax.swing.JLayeredPane jLayeredPane28 = froggerApp0.getLayeredPane();
    int i29 = froggerApp0.getX();
    java.awt.Component component32 = froggerApp0.findComponentAt(11, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component32);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    frogger.FroggerApp froggerApp1 = new frogger.FroggerApp();
    java.awt.Container container2 = froggerApp1.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array3 = froggerApp1.getHierarchyListeners();
    froggerApp1.nextFocus();
    java.awt.Dimension dimension5 = froggerApp1.preferredSize();
    java.awt.Dimension dimension6 = froggerApp1.getMinimumSize();
    froggerApp0.setSize(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    java.awt.Component component3 = froggerApp0.getFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component3);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = froggerApp0.getBaselineResizeBehavior();
    java.awt.peer.ComponentPeer componentPeer10 = froggerApp0.getPeer();
    java.lang.String str11 = froggerApp0.getWarningString();
    froggerApp0.setFocusTraversalPolicyProvider(true);
    boolean b14 = froggerApp0.isBackgroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentPeer10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    froggerApp0.setSize((int)(byte)-1, 100);
    frogger.FroggerApp froggerApp12 = new frogger.FroggerApp();
    java.awt.Container container13 = froggerApp12.getParent();
    froggerApp12.repaint((long)5, 2, 1, 128, 11);
    boolean b20 = froggerApp12.getIgnoreRepaint();
    boolean b21 = froggerApp12.isValidateRoot();
    java.awt.Cursor cursor22 = null;
    froggerApp12.setCursor(cursor22);
    frogger.FroggerApp froggerApp24 = new frogger.FroggerApp();
    froggerApp24.addNotify();
    java.awt.Point point26 = froggerApp24.getMousePosition();
    java.awt.image.VolatileImage volatileImage29 = froggerApp24.createVolatileImage((int)(short)1, (int)' ');
    frogger.FroggerApp froggerApp30 = new frogger.FroggerApp();
    java.awt.Container container31 = froggerApp30.getParent();
    froggerApp30.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension38 = froggerApp30.preferredSize();
    froggerApp30.setSize((int)(short)100, (int)(short)1);
    int i42 = froggerApp12.checkImage((java.awt.Image)volatileImage29, (java.awt.image.ImageObserver)froggerApp30);
    frogger.FroggerApp froggerApp45 = new frogger.FroggerApp();
    java.awt.Container container46 = froggerApp45.getParent();
    frogger.FroggerApp froggerApp47 = new frogger.FroggerApp();
    java.awt.Container container48 = froggerApp47.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array49 = froggerApp47.getHierarchyListeners();
    froggerApp47.nextFocus();
    java.awt.Dimension dimension51 = froggerApp47.getMaximumSize();
    frogger.FroggerApp froggerApp52 = new frogger.FroggerApp();
    java.awt.Container container53 = froggerApp52.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array54 = froggerApp52.getHierarchyListeners();
    froggerApp52.nextFocus();
    java.awt.Dimension dimension56 = froggerApp52.getMaximumSize();
    froggerApp47.setMinimumSize(dimension56);
    froggerApp45.setMinimumSize(dimension56);
    frogger.FroggerApp froggerApp59 = new frogger.FroggerApp();
    java.awt.Container container60 = froggerApp59.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array61 = froggerApp59.getHierarchyListeners();
    froggerApp59.nextFocus();
    java.awt.Dimension dimension63 = froggerApp59.getMaximumSize();
    java.awt.image.VolatileImage volatileImage66 = froggerApp59.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp67 = new frogger.FroggerApp();
    froggerApp67.addNotify();
    java.awt.Point point69 = froggerApp67.getMousePosition();
    int i70 = froggerApp45.checkImage((java.awt.Image)volatileImage66, (java.awt.image.ImageObserver)froggerApp67);
    froggerApp45.move((int)(short)-1, (int)'a');
    froggerApp45.nextFocus();
    froggerApp45.firePropertyChange("", 'a', ' ');
    int i79 = froggerApp0.checkImage((java.awt.Image)volatileImage29, 32, 4, (java.awt.image.ImageObserver)froggerApp45);
    java.io.PrintWriter printWriter80 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.list(printWriter80);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 32);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.setSize(6, 12);
    frogger.FroggerApp froggerApp6 = new frogger.FroggerApp();
    java.awt.Container container7 = froggerApp6.getParent();
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array10 = froggerApp8.getHierarchyListeners();
    froggerApp8.nextFocus();
    java.awt.Dimension dimension12 = froggerApp8.getMaximumSize();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    froggerApp8.setMinimumSize(dimension17);
    froggerApp6.setMinimumSize(dimension17);
    froggerApp0.setMaximumSize(dimension17);
    java.awt.event.FocusListener[] focusListener_array21 = froggerApp0.getFocusListeners();
    java.beans.PropertyChangeListener propertyChangeListener22 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array21);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.Dimension dimension18 = froggerApp14.getMaximumSize();
    java.awt.image.VolatileImage volatileImage21 = froggerApp14.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    froggerApp22.addNotify();
    java.awt.Point point24 = froggerApp22.getMousePosition();
    int i25 = froggerApp0.checkImage((java.awt.Image)volatileImage21, (java.awt.image.ImageObserver)froggerApp22);
    froggerApp0.setAlwaysOnTop(false);
    javax.swing.JLayeredPane jLayeredPane28 = froggerApp0.getLayeredPane();
    froggerApp0.firePropertyChange("hi!", (byte)10, (byte)0);
    java.awt.event.FocusListener[] focusListener_array33 = froggerApp0.getFocusListeners();
    boolean b34 = froggerApp0.isMaximumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    boolean b9 = froggerApp0.isValidateRoot();
    boolean b10 = froggerApp0.isResizable();
    froggerApp0.pack();
    froggerApp0.transferFocus();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    froggerApp13.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener15 = null;
    froggerApp13.addPropertyChangeListener(propertyChangeListener15);
    froggerApp13.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp21 = new frogger.FroggerApp();
    java.awt.Container container22 = froggerApp21.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array23 = froggerApp21.getHierarchyListeners();
    froggerApp21.nextFocus();
    java.awt.Dimension dimension25 = froggerApp21.getMaximumSize();
    java.awt.image.VolatileImage volatileImage28 = froggerApp21.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp31 = new frogger.FroggerApp();
    froggerApp31.addNotify();
    boolean b33 = froggerApp31.isCursorSet();
    boolean b34 = froggerApp13.prepareImage((java.awt.Image)volatileImage28, 4, (int)'4', (java.awt.image.ImageObserver)froggerApp31);
    frogger.FroggerApp froggerApp35 = new frogger.FroggerApp();
    java.awt.Container container36 = froggerApp35.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array37 = froggerApp35.getHierarchyListeners();
    froggerApp35.nextFocus();
    java.awt.Dimension dimension39 = froggerApp35.getMaximumSize();
    frogger.FroggerApp froggerApp40 = new frogger.FroggerApp();
    java.awt.Container container41 = froggerApp40.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array42 = froggerApp40.getHierarchyListeners();
    froggerApp40.nextFocus();
    java.awt.Dimension dimension44 = froggerApp40.getMaximumSize();
    froggerApp35.setMinimumSize(dimension44);
    froggerApp31.setSize(dimension44);
    froggerApp0.resize(dimension44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension44);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.awt.event.MouseListener mouseListener2 = null;
    froggerApp0.removeMouseListener(mouseListener2);
    boolean b4 = froggerApp0.isMinimumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.MenuBar menuBar4 = froggerApp0.getMenuBar();
    java.awt.event.InputMethodListener[] inputMethodListener_array5 = froggerApp0.getInputMethodListeners();
    boolean b6 = froggerApp0.isDisplayable();
    java.awt.Event event7 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b8 = froggerApp0.handleEvent(event7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMethodListener_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    froggerApp0.toFront();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    frogger.FroggerApp froggerApp9 = new frogger.FroggerApp();
    java.awt.Container container10 = froggerApp9.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array11 = froggerApp9.getHierarchyListeners();
    froggerApp9.nextFocus();
    java.awt.MenuBar menuBar13 = froggerApp9.getMenuBar();
    java.awt.Point point14 = froggerApp9.location();
    java.awt.Component component15 = froggerApp0.findComponentAt(point14);
    java.awt.event.MouseMotionListener mouseMotionListener16 = null;
    froggerApp0.addMouseMotionListener(mouseMotionListener16);
    java.awt.Color color18 = froggerApp0.getForeground();
    java.io.PrintStream printStream19 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.list(printStream19, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    int i14 = froggerApp0.getCursorType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    froggerApp0.drawBoard();
    froggerApp0.setIgnoreRepaint(false);
    froggerApp0.createGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    frogger.Jumper jumper2 = new frogger.Jumper(5, (int)(short)100);
    java.lang.String str3 = jumper2.getMarker();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "J"+ "'", str3.equals("J"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.awt.event.MouseListener mouseListener2 = null;
    froggerApp0.removeMouseListener(mouseListener2);
    frogger.FroggerApp froggerApp4 = new frogger.FroggerApp();
    java.awt.Container container5 = froggerApp4.getParent();
    froggerApp4.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension12 = froggerApp4.preferredSize();
    froggerApp4.toBack();
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    froggerApp14.repaint();
    frogger.FroggerApp froggerApp19 = new frogger.FroggerApp();
    froggerApp19.addNotify();
    boolean b21 = froggerApp19.isCursorSet();
    java.awt.Graphics graphics22 = froggerApp19.getGraphics();
    froggerApp14.update(graphics22);
    froggerApp4.paintComponents(graphics22);
    froggerApp0.paintComponents(graphics22);
    java.awt.event.FocusListener[] focusListener_array26 = froggerApp0.getFocusListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graphics22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array26);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    froggerApp0.setFocusTraversalKeysEnabled(false);
    java.awt.image.ImageProducer imageProducer10 = null;
    java.awt.Image image11 = froggerApp0.createImage(imageProducer10);
    froggerApp0.gameFinished();
    froggerApp0.setAutoRequestFocus(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image11);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    boolean b9 = froggerApp0.isValidateRoot();
    boolean b10 = froggerApp0.isResizable();
    froggerApp0.setResizable(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    froggerApp13.drawBoard();
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Component component18 = froggerApp0.add((java.awt.Component)froggerApp13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    froggerApp0.drawBoard();
    froggerApp0.setIgnoreRepaint(false);
    java.awt.Rectangle rectangle7 = froggerApp0.getBounds();
    boolean b8 = froggerApp0.isDoubleBuffered();
    java.awt.Color color9 = froggerApp0.getBackground();
    java.awt.Graphics graphics10 = froggerApp0.getGraphics();
    froggerApp0.invalidate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graphics10);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    froggerApp0.toBack();
    frogger.FroggerApp froggerApp10 = new frogger.FroggerApp();
    java.awt.Container container11 = froggerApp10.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array12 = froggerApp10.getHierarchyListeners();
    froggerApp10.nextFocus();
    java.awt.Dimension dimension14 = froggerApp10.getMaximumSize();
    frogger.FroggerApp froggerApp15 = new frogger.FroggerApp();
    java.awt.Container container16 = froggerApp15.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array17 = froggerApp15.getHierarchyListeners();
    froggerApp15.nextFocus();
    java.awt.Dimension dimension19 = froggerApp15.getMaximumSize();
    froggerApp10.setMinimumSize(dimension19);
    froggerApp0.setMaximumSize(dimension19);
    froggerApp0.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension19);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    int i18 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp13);
    java.awt.event.MouseMotionListener[] mouseMotionListener_array19 = froggerApp13.getMouseMotionListeners();
    java.awt.Insets insets20 = froggerApp13.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets20);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array10 = froggerApp8.getHierarchyListeners();
    froggerApp8.nextFocus();
    java.awt.Dimension dimension12 = froggerApp8.getMaximumSize();
    java.awt.image.VolatileImage volatileImage15 = froggerApp8.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp18 = new frogger.FroggerApp();
    froggerApp18.addNotify();
    boolean b20 = froggerApp18.isCursorSet();
    boolean b21 = froggerApp0.prepareImage((java.awt.Image)volatileImage15, 4, (int)'4', (java.awt.image.ImageObserver)froggerApp18);
    java.awt.dnd.DropTarget dropTarget22 = null;
    froggerApp0.setDropTarget(dropTarget22);
    java.awt.Font font24 = froggerApp0.getFont();
    java.awt.Container container25 = froggerApp0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container25);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    java.awt.Insets insets3 = froggerApp0.getInsets();
    java.awt.event.MouseMotionListener mouseMotionListener4 = null;
    froggerApp0.removeMouseMotionListener(mouseMotionListener4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets3);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    java.awt.Rectangle rectangle3 = null;
    froggerApp0.setMaximizedBounds(rectangle3);
    java.awt.FocusTraversalPolicy focusTraversalPolicy5 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy5);
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp0.getHierarchyListeners();
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    froggerApp8.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener10 = null;
    froggerApp8.addPropertyChangeListener(propertyChangeListener10);
    froggerApp8.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp16 = new frogger.FroggerApp();
    java.awt.Container container17 = froggerApp16.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array18 = froggerApp16.getHierarchyListeners();
    froggerApp16.nextFocus();
    java.awt.Dimension dimension20 = froggerApp16.getMaximumSize();
    java.awt.image.VolatileImage volatileImage23 = froggerApp16.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp26 = new frogger.FroggerApp();
    froggerApp26.addNotify();
    boolean b28 = froggerApp26.isCursorSet();
    boolean b29 = froggerApp8.prepareImage((java.awt.Image)volatileImage23, 4, (int)'4', (java.awt.image.ImageObserver)froggerApp26);
    froggerApp0.setIconImage((java.awt.Image)volatileImage23);
    frogger.FroggerApp froggerApp31 = new frogger.FroggerApp();
    java.awt.Container container32 = froggerApp31.getParent();
    froggerApp31.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension39 = froggerApp31.preferredSize();
    froggerApp31.toBack();
    boolean b41 = froggerApp31.isFocusTraversalPolicyProvider();
    froggerApp0.setLocationRelativeTo((java.awt.Component)froggerApp31);
    boolean b43 = froggerApp0.requestFocusInWindow();
    java.awt.event.WindowStateListener windowStateListener44 = null;
    froggerApp0.addWindowStateListener(windowStateListener44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.Dimension dimension18 = froggerApp14.getMaximumSize();
    java.awt.image.VolatileImage volatileImage21 = froggerApp14.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    froggerApp22.addNotify();
    java.awt.Point point24 = froggerApp22.getMousePosition();
    int i25 = froggerApp0.checkImage((java.awt.Image)volatileImage21, (java.awt.image.ImageObserver)froggerApp22);
    java.awt.event.KeyListener[] keyListener_array26 = froggerApp0.getKeyListeners();
    java.awt.event.ComponentListener componentListener27 = null;
    froggerApp0.addComponentListener(componentListener27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyListener_array26);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    java.awt.event.MouseListener[] mouseListener_array8 = froggerApp0.getMouseListeners();
    java.awt.Container container9 = froggerApp0.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseListener_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    java.awt.event.MouseListener[] mouseListener_array8 = froggerApp0.getMouseListeners();
    javax.swing.JLayeredPane jLayeredPane9 = froggerApp0.getLayeredPane();
    froggerApp0.revalidate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseListener_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane9);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    java.awt.image.VolatileImage volatileImage7 = froggerApp0.createVolatileImage((int)'a', 9);
    java.awt.Dialog.ModalExclusionType modalExclusionType8 = froggerApp0.getModalExclusionType();
    javax.swing.JLayeredPane jLayeredPane9 = froggerApp0.getLayeredPane();
    java.awt.Event event10 = null;
    boolean b13 = froggerApp0.mouseEnter(event10, 1092, 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage7);
    org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    java.awt.image.VolatileImage volatileImage7 = froggerApp0.createVolatileImage((int)'a', 9);
    java.awt.Dialog.ModalExclusionType modalExclusionType8 = froggerApp0.getModalExclusionType();
    frogger.FroggerApp froggerApp9 = new frogger.FroggerApp();
    java.awt.Container container10 = froggerApp9.getParent();
    frogger.FroggerApp froggerApp11 = new frogger.FroggerApp();
    java.awt.Container container12 = froggerApp11.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array13 = froggerApp11.getHierarchyListeners();
    froggerApp11.nextFocus();
    java.awt.Dimension dimension15 = froggerApp11.getMaximumSize();
    frogger.FroggerApp froggerApp16 = new frogger.FroggerApp();
    java.awt.Container container17 = froggerApp16.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array18 = froggerApp16.getHierarchyListeners();
    froggerApp16.nextFocus();
    java.awt.Dimension dimension20 = froggerApp16.getMaximumSize();
    froggerApp11.setMinimumSize(dimension20);
    froggerApp9.setMinimumSize(dimension20);
    frogger.FroggerApp froggerApp23 = new frogger.FroggerApp();
    java.awt.Container container24 = froggerApp23.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array25 = froggerApp23.getHierarchyListeners();
    froggerApp23.nextFocus();
    java.awt.Dimension dimension27 = froggerApp23.getMaximumSize();
    java.awt.image.VolatileImage volatileImage30 = froggerApp23.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp31 = new frogger.FroggerApp();
    froggerApp31.addNotify();
    java.awt.Point point33 = froggerApp31.getMousePosition();
    int i34 = froggerApp9.checkImage((java.awt.Image)volatileImage30, (java.awt.image.ImageObserver)froggerApp31);
    frogger.FroggerApp froggerApp37 = new frogger.FroggerApp();
    froggerApp37.addNotify();
    java.awt.event.MouseListener mouseListener39 = null;
    froggerApp37.removeMouseListener(mouseListener39);
    java.awt.event.InputMethodListener inputMethodListener41 = null;
    froggerApp37.removeInputMethodListener(inputMethodListener41);
    java.awt.Dimension dimension43 = froggerApp37.getMaximumSize();
    boolean b44 = froggerApp0.prepareImage((java.awt.Image)volatileImage30, 11, (int)(short)10, (java.awt.image.ImageObserver)froggerApp37);
    java.awt.Event event45 = null;
    boolean b47 = froggerApp37.action(event45, (java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage7);
    org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array10 = froggerApp8.getHierarchyListeners();
    froggerApp8.nextFocus();
    java.awt.Dimension dimension12 = froggerApp8.getMaximumSize();
    java.awt.image.VolatileImage volatileImage15 = froggerApp8.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp18 = new frogger.FroggerApp();
    froggerApp18.addNotify();
    boolean b20 = froggerApp18.isCursorSet();
    boolean b21 = froggerApp0.prepareImage((java.awt.Image)volatileImage15, 4, (int)'4', (java.awt.image.ImageObserver)froggerApp18);
    boolean b24 = froggerApp18.inside((int)'4', (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    java.awt.Shape shape12 = null;
    froggerApp0.setShape(shape12);
    froggerApp0.firePropertyChange("hi!", (byte)0, (byte)0);
    java.util.List<java.awt.Image> list_image18 = froggerApp0.getIconImages();
    frogger.FroggerApp froggerApp19 = new frogger.FroggerApp();
    froggerApp19.addNotify();
    boolean b21 = froggerApp19.isCursorSet();
    java.awt.Rectangle rectangle22 = null;
    froggerApp19.setMaximizedBounds(rectangle22);
    int i24 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp19);
    boolean b25 = froggerApp19.isDoubleBuffered();
    java.beans.PropertyChangeListener[] propertyChangeListener_array26 = froggerApp19.getPropertyChangeListeners();
    java.awt.Container container27 = froggerApp19.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_image18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container27);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.setSize(6, 12);
    frogger.FroggerApp froggerApp6 = new frogger.FroggerApp();
    java.awt.Container container7 = froggerApp6.getParent();
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array10 = froggerApp8.getHierarchyListeners();
    froggerApp8.nextFocus();
    java.awt.Dimension dimension12 = froggerApp8.getMaximumSize();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    froggerApp8.setMinimumSize(dimension17);
    froggerApp6.setMinimumSize(dimension17);
    froggerApp0.setMaximumSize(dimension17);
    boolean b21 = froggerApp0.isFocusOwner();
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    java.awt.Container container23 = froggerApp22.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array24 = froggerApp22.getHierarchyListeners();
    froggerApp22.nextFocus();
    java.awt.Dimension dimension26 = froggerApp22.getMaximumSize();
    java.awt.image.VolatileImage volatileImage29 = froggerApp22.createVolatileImage((int)'a', 9);
    java.awt.Dialog.ModalExclusionType modalExclusionType30 = froggerApp22.getModalExclusionType();
    frogger.FroggerApp froggerApp31 = new frogger.FroggerApp();
    java.awt.Container container32 = froggerApp31.getParent();
    frogger.FroggerApp froggerApp33 = new frogger.FroggerApp();
    java.awt.Container container34 = froggerApp33.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array35 = froggerApp33.getHierarchyListeners();
    froggerApp33.nextFocus();
    java.awt.Dimension dimension37 = froggerApp33.getMaximumSize();
    frogger.FroggerApp froggerApp38 = new frogger.FroggerApp();
    java.awt.Container container39 = froggerApp38.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array40 = froggerApp38.getHierarchyListeners();
    froggerApp38.nextFocus();
    java.awt.Dimension dimension42 = froggerApp38.getMaximumSize();
    froggerApp33.setMinimumSize(dimension42);
    froggerApp31.setMinimumSize(dimension42);
    frogger.FroggerApp froggerApp45 = new frogger.FroggerApp();
    java.awt.Container container46 = froggerApp45.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array47 = froggerApp45.getHierarchyListeners();
    froggerApp45.nextFocus();
    java.awt.Dimension dimension49 = froggerApp45.getMaximumSize();
    java.awt.image.VolatileImage volatileImage52 = froggerApp45.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp53 = new frogger.FroggerApp();
    froggerApp53.addNotify();
    java.awt.Point point55 = froggerApp53.getMousePosition();
    int i56 = froggerApp31.checkImage((java.awt.Image)volatileImage52, (java.awt.image.ImageObserver)froggerApp53);
    frogger.FroggerApp froggerApp59 = new frogger.FroggerApp();
    froggerApp59.addNotify();
    java.awt.event.MouseListener mouseListener61 = null;
    froggerApp59.removeMouseListener(mouseListener61);
    java.awt.event.InputMethodListener inputMethodListener63 = null;
    froggerApp59.removeInputMethodListener(inputMethodListener63);
    java.awt.Dimension dimension65 = froggerApp59.getMaximumSize();
    boolean b66 = froggerApp22.prepareImage((java.awt.Image)volatileImage52, 11, (int)(short)10, (java.awt.image.ImageObserver)froggerApp59);
    frogger.FroggerApp froggerApp69 = new frogger.FroggerApp();
    java.awt.Container container70 = froggerApp69.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array71 = froggerApp69.getHierarchyListeners();
    froggerApp69.nextFocus();
    java.awt.Dimension dimension73 = froggerApp69.getMaximumSize();
    frogger.FroggerApp froggerApp74 = new frogger.FroggerApp();
    java.awt.Container container75 = froggerApp74.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array76 = froggerApp74.getHierarchyListeners();
    froggerApp74.nextFocus();
    java.awt.Dimension dimension78 = froggerApp74.getMaximumSize();
    froggerApp69.setMinimumSize(dimension78);
    boolean b80 = froggerApp69.isCursorSet();
    boolean b81 = froggerApp69.isForegroundSet();
    frogger.FroggerApp froggerApp82 = new frogger.FroggerApp();
    java.awt.Container container83 = froggerApp82.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array84 = froggerApp82.getHierarchyListeners();
    froggerApp82.nextFocus();
    java.awt.Dimension dimension86 = froggerApp82.getMaximumSize();
    int i87 = froggerApp69.getComponentZOrder((java.awt.Component)froggerApp82);
    java.awt.event.MouseMotionListener[] mouseMotionListener_array88 = froggerApp82.getMouseMotionListeners();
    java.awt.Dialog.ModalExclusionType modalExclusionType89 = froggerApp82.getModalExclusionType();
    froggerApp82.setCursor((int)(short)1);
    boolean b92 = froggerApp82.isFocusTraversalPolicySet();
    java.awt.image.ColorModel colorModel93 = froggerApp82.getColorModel();
    int i94 = froggerApp0.checkImage((java.awt.Image)volatileImage52, 7, (int)' ', (java.awt.image.ImageObserver)froggerApp82);
    java.awt.event.KeyListener[] keyListener_array95 = froggerApp82.getKeyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage29);
    org.junit.Assert.assertTrue("'" + modalExclusionType30 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType30.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array88);
    org.junit.Assert.assertTrue("'" + modalExclusionType89 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType89.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyListener_array95);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    frogger.FroggerApp froggerApp9 = new frogger.FroggerApp();
    java.awt.Container container10 = froggerApp9.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array11 = froggerApp9.getHierarchyListeners();
    froggerApp9.nextFocus();
    java.awt.MenuBar menuBar13 = froggerApp9.getMenuBar();
    java.awt.Point point14 = froggerApp9.location();
    java.awt.Component component15 = froggerApp0.findComponentAt(point14);
    java.awt.event.MouseMotionListener mouseMotionListener16 = null;
    froggerApp0.addMouseMotionListener(mouseMotionListener16);
    java.awt.Color color18 = froggerApp0.getForeground();
    frogger.FroggerApp froggerApp19 = new frogger.FroggerApp();
    java.awt.Container container20 = froggerApp19.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array21 = froggerApp19.getHierarchyListeners();
    froggerApp19.nextFocus();
    java.awt.MenuBar menuBar23 = froggerApp19.getMenuBar();
    java.awt.Point point24 = froggerApp19.location();
    java.beans.PropertyChangeListener[] propertyChangeListener_array26 = froggerApp19.getPropertyChangeListeners("");
    frogger.FroggerApp froggerApp27 = new frogger.FroggerApp();
    froggerApp27.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener29 = null;
    froggerApp27.addPropertyChangeListener(propertyChangeListener29);
    java.awt.Dialog.ModalExclusionType modalExclusionType31 = froggerApp27.getModalExclusionType();
    froggerApp19.setModalExclusionType(modalExclusionType31);
    froggerApp0.setModalExclusionType(modalExclusionType31);
    java.util.Locale locale34 = null;
    froggerApp0.setLocale(locale34);
    java.awt.Window.Type type36 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.setType(type36);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array26);
    org.junit.Assert.assertTrue("'" + modalExclusionType31 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType31.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    java.awt.Rectangle rectangle3 = null;
    froggerApp0.setMaximizedBounds(rectangle3);
    java.awt.FocusTraversalPolicy focusTraversalPolicy5 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy5);
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp0.getHierarchyListeners();
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    froggerApp8.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener10 = null;
    froggerApp8.addPropertyChangeListener(propertyChangeListener10);
    froggerApp8.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp16 = new frogger.FroggerApp();
    java.awt.Container container17 = froggerApp16.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array18 = froggerApp16.getHierarchyListeners();
    froggerApp16.nextFocus();
    java.awt.Dimension dimension20 = froggerApp16.getMaximumSize();
    java.awt.image.VolatileImage volatileImage23 = froggerApp16.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp26 = new frogger.FroggerApp();
    froggerApp26.addNotify();
    boolean b28 = froggerApp26.isCursorSet();
    boolean b29 = froggerApp8.prepareImage((java.awt.Image)volatileImage23, 4, (int)'4', (java.awt.image.ImageObserver)froggerApp26);
    froggerApp0.setIconImage((java.awt.Image)volatileImage23);
    frogger.FroggerApp froggerApp31 = new frogger.FroggerApp();
    java.awt.Container container32 = froggerApp31.getParent();
    froggerApp31.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension39 = froggerApp31.preferredSize();
    froggerApp31.toBack();
    boolean b41 = froggerApp31.isFocusTraversalPolicyProvider();
    froggerApp0.setLocationRelativeTo((java.awt.Component)froggerApp31);
    boolean b43 = froggerApp0.requestFocusInWindow();
    java.lang.Object obj44 = froggerApp0.getTreeLock();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj44);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.setSize(6, 12);
    frogger.FroggerApp froggerApp6 = new frogger.FroggerApp();
    java.awt.Container container7 = froggerApp6.getParent();
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array10 = froggerApp8.getHierarchyListeners();
    froggerApp8.nextFocus();
    java.awt.Dimension dimension12 = froggerApp8.getMaximumSize();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    froggerApp8.setMinimumSize(dimension17);
    froggerApp6.setMinimumSize(dimension17);
    froggerApp0.setMaximumSize(dimension17);
    java.awt.event.MouseListener mouseListener21 = null;
    froggerApp0.removeMouseListener(mouseListener21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    java.awt.image.VolatileImage volatileImage7 = froggerApp0.createVolatileImage((int)'a', 9);
    java.awt.Dialog.ModalExclusionType modalExclusionType8 = froggerApp0.getModalExclusionType();
    javax.swing.JLayeredPane jLayeredPane9 = froggerApp0.getLayeredPane();
    froggerApp0.addNotify();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage7);
    org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane9);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.setSize(6, 12);
    frogger.FroggerApp froggerApp6 = new frogger.FroggerApp();
    java.awt.Container container7 = froggerApp6.getParent();
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array10 = froggerApp8.getHierarchyListeners();
    froggerApp8.nextFocus();
    java.awt.Dimension dimension12 = froggerApp8.getMaximumSize();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    froggerApp8.setMinimumSize(dimension17);
    froggerApp6.setMinimumSize(dimension17);
    froggerApp0.setMaximumSize(dimension17);
    boolean b21 = froggerApp0.isFocusOwner();
    java.awt.event.InputMethodListener inputMethodListener22 = null;
    froggerApp0.removeInputMethodListener(inputMethodListener22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    froggerApp0.setFocusTraversalKeysEnabled(false);
    java.awt.image.ImageProducer imageProducer10 = null;
    java.awt.Image image11 = froggerApp0.createImage(imageProducer10);
    java.awt.event.KeyListener[] keyListener_array12 = froggerApp0.getKeyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(keyListener_array12);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    int i18 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp13);
    froggerApp0.enableInputMethods(false);
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.setUndecorated(true);
      org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    int i4 = froggerApp0.getCursorType();
    java.awt.event.WindowListener windowListener5 = null;
    froggerApp0.removeWindowListener(windowListener5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    frogger.Chaser chaser2 = new frogger.Chaser(3, (int)'4');
    chaser2.act(8, (-1));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    froggerApp0.setSize((int)(byte)-1, 100);
    frogger.FroggerApp froggerApp12 = new frogger.FroggerApp();
    java.awt.Container container13 = froggerApp12.getParent();
    froggerApp12.repaint((long)5, 2, 1, 128, 11);
    boolean b20 = froggerApp12.getIgnoreRepaint();
    boolean b21 = froggerApp12.isValidateRoot();
    java.awt.Cursor cursor22 = null;
    froggerApp12.setCursor(cursor22);
    frogger.FroggerApp froggerApp24 = new frogger.FroggerApp();
    froggerApp24.addNotify();
    java.awt.Point point26 = froggerApp24.getMousePosition();
    java.awt.image.VolatileImage volatileImage29 = froggerApp24.createVolatileImage((int)(short)1, (int)' ');
    frogger.FroggerApp froggerApp30 = new frogger.FroggerApp();
    java.awt.Container container31 = froggerApp30.getParent();
    froggerApp30.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension38 = froggerApp30.preferredSize();
    froggerApp30.setSize((int)(short)100, (int)(short)1);
    int i42 = froggerApp12.checkImage((java.awt.Image)volatileImage29, (java.awt.image.ImageObserver)froggerApp30);
    frogger.FroggerApp froggerApp45 = new frogger.FroggerApp();
    java.awt.Container container46 = froggerApp45.getParent();
    frogger.FroggerApp froggerApp47 = new frogger.FroggerApp();
    java.awt.Container container48 = froggerApp47.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array49 = froggerApp47.getHierarchyListeners();
    froggerApp47.nextFocus();
    java.awt.Dimension dimension51 = froggerApp47.getMaximumSize();
    frogger.FroggerApp froggerApp52 = new frogger.FroggerApp();
    java.awt.Container container53 = froggerApp52.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array54 = froggerApp52.getHierarchyListeners();
    froggerApp52.nextFocus();
    java.awt.Dimension dimension56 = froggerApp52.getMaximumSize();
    froggerApp47.setMinimumSize(dimension56);
    froggerApp45.setMinimumSize(dimension56);
    frogger.FroggerApp froggerApp59 = new frogger.FroggerApp();
    java.awt.Container container60 = froggerApp59.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array61 = froggerApp59.getHierarchyListeners();
    froggerApp59.nextFocus();
    java.awt.Dimension dimension63 = froggerApp59.getMaximumSize();
    java.awt.image.VolatileImage volatileImage66 = froggerApp59.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp67 = new frogger.FroggerApp();
    froggerApp67.addNotify();
    java.awt.Point point69 = froggerApp67.getMousePosition();
    int i70 = froggerApp45.checkImage((java.awt.Image)volatileImage66, (java.awt.image.ImageObserver)froggerApp67);
    froggerApp45.move((int)(short)-1, (int)'a');
    froggerApp45.nextFocus();
    froggerApp45.firePropertyChange("", 'a', ' ');
    int i79 = froggerApp0.checkImage((java.awt.Image)volatileImage29, 32, 4, (java.awt.image.ImageObserver)froggerApp45);
    froggerApp0.hide();
    java.awt.event.MouseMotionListener mouseMotionListener81 = null;
    froggerApp0.addMouseMotionListener(mouseMotionListener81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 32);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.MenuBar menuBar4 = froggerApp0.getMenuBar();
    java.awt.Point point5 = froggerApp0.location();
    froggerApp0.pack();
    boolean b7 = froggerApp0.isAutoRequestFocus();
    java.awt.Event event8 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = froggerApp0.handleEvent(event8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    int i18 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp13);
    java.awt.Event event19 = null;
    boolean b22 = froggerApp0.mouseDown(event19, 64, (int)'#');
    frogger.FroggerApp froggerApp23 = new frogger.FroggerApp();
    java.awt.Container container24 = froggerApp23.getParent();
    froggerApp23.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension31 = froggerApp23.preferredSize();
    froggerApp23.toBack();
    java.awt.Color color33 = froggerApp23.getForeground();
    java.awt.Point point34 = froggerApp23.getLocation();
    boolean b35 = froggerApp0.contains(point34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    java.awt.Shape shape12 = null;
    froggerApp0.setShape(shape12);
    int i14 = froggerApp0.getHeight();
    java.awt.Cursor cursor15 = null;
    froggerApp0.setCursor(cursor15);
    java.awt.event.MouseMotionListener mouseMotionListener17 = null;
    froggerApp0.addMouseMotionListener(mouseMotionListener17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 65535);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    boolean b3 = froggerApp0.getFocusTraversalKeysEnabled();
    java.awt.Component component5 = froggerApp0.getComponent((int)(short)0);
    froggerApp0.setEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component5);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.MenuBar menuBar4 = froggerApp0.getMenuBar();
    java.awt.Point point5 = froggerApp0.location();
    froggerApp0.pack();
    java.awt.Dialog.ModalExclusionType modalExclusionType7 = froggerApp0.getModalExclusionType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point5);
    org.junit.Assert.assertTrue("'" + modalExclusionType7 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType7.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy9);
    froggerApp0.setTitle("");
    java.awt.image.ColorModel colorModel13 = froggerApp0.getColorModel();
    froggerApp0.setSize((int)'4', 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel13);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.Dimension dimension18 = froggerApp14.getMaximumSize();
    java.awt.image.VolatileImage volatileImage21 = froggerApp14.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    froggerApp22.addNotify();
    java.awt.Point point24 = froggerApp22.getMousePosition();
    int i25 = froggerApp0.checkImage((java.awt.Image)volatileImage21, (java.awt.image.ImageObserver)froggerApp22);
    froggerApp0.move((int)(short)-1, (int)'a');
    froggerApp0.nextFocus();
    java.awt.GraphicsConfiguration graphicsConfiguration30 = froggerApp0.getGraphicsConfiguration();
    boolean b31 = froggerApp0.isUndecorated();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graphicsConfiguration30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    java.lang.String str14 = froggerApp0.getTitle();
    boolean b15 = froggerApp0.isDoubleBuffered();
    boolean b16 = froggerApp0.isLightweight();
    frogger.FroggerApp froggerApp17 = new frogger.FroggerApp();
    java.awt.Container container18 = froggerApp17.getParent();
    froggerApp17.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension25 = froggerApp17.preferredSize();
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior26 = froggerApp17.getBaselineResizeBehavior();
    java.awt.peer.ComponentPeer componentPeer27 = froggerApp17.getPeer();
    frogger.FroggerApp froggerApp28 = new frogger.FroggerApp();
    java.awt.Container container29 = froggerApp28.getParent();
    froggerApp28.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension36 = froggerApp28.preferredSize();
    frogger.FroggerApp froggerApp37 = new frogger.FroggerApp();
    java.awt.Container container38 = froggerApp37.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array39 = froggerApp37.getHierarchyListeners();
    froggerApp37.nextFocus();
    java.awt.MenuBar menuBar41 = froggerApp37.getMenuBar();
    java.awt.Point point42 = froggerApp37.location();
    java.awt.Component component43 = froggerApp28.findComponentAt(point42);
    java.awt.Component component44 = froggerApp17.findComponentAt(point42);
    java.awt.Component component45 = froggerApp17.getMostRecentFocusOwner();
    frogger.FroggerApp froggerApp46 = new frogger.FroggerApp();
    froggerApp46.addNotify();
    java.awt.Point point48 = froggerApp46.getMousePosition();
    java.awt.image.VolatileImage volatileImage51 = froggerApp46.createVolatileImage((int)(short)1, (int)' ');
    frogger.FroggerApp froggerApp52 = new frogger.FroggerApp();
    java.awt.Container container53 = froggerApp52.getParent();
    froggerApp52.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension60 = froggerApp52.preferredSize();
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior61 = froggerApp52.getBaselineResizeBehavior();
    java.awt.peer.ComponentPeer componentPeer62 = froggerApp52.getPeer();
    frogger.FroggerApp froggerApp63 = new frogger.FroggerApp();
    java.awt.Container container64 = froggerApp63.getParent();
    froggerApp63.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension71 = froggerApp63.preferredSize();
    frogger.FroggerApp froggerApp72 = new frogger.FroggerApp();
    java.awt.Container container73 = froggerApp72.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array74 = froggerApp72.getHierarchyListeners();
    froggerApp72.nextFocus();
    java.awt.MenuBar menuBar76 = froggerApp72.getMenuBar();
    java.awt.Point point77 = froggerApp72.location();
    java.awt.Component component78 = froggerApp63.findComponentAt(point77);
    java.awt.Component component79 = froggerApp52.findComponentAt(point77);
    froggerApp52.setResizable(true);
    frogger.FroggerApp froggerApp82 = new frogger.FroggerApp();
    java.awt.Container container83 = froggerApp82.getParent();
    froggerApp82.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension90 = froggerApp82.preferredSize();
    froggerApp82.toBack();
    java.awt.Color color92 = froggerApp82.getForeground();
    froggerApp52.setForeground(color92);
    froggerApp46.setBackground(color92);
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.add((java.awt.Component)froggerApp17, (java.lang.Object)color92);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior26 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior26.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentPeer27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension60);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior61 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior61.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentPeer62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color92);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    java.awt.event.WindowStateListener windowStateListener5 = null;
    froggerApp0.removeWindowStateListener(windowStateListener5);
    java.awt.Insets insets7 = froggerApp0.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(insets7);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.setSize(6, 12);
    frogger.FroggerApp froggerApp6 = new frogger.FroggerApp();
    froggerApp6.addNotify();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array8 = froggerApp6.getMouseWheelListeners();
    java.awt.ComponentOrientation componentOrientation9 = froggerApp6.getComponentOrientation();
    froggerApp0.applyComponentOrientation(componentOrientation9);
    froggerApp0.transferFocusDownCycle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation9);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    boolean b9 = froggerApp0.isValidateRoot();
    java.awt.Cursor cursor10 = null;
    froggerApp0.setCursor(cursor10);
    frogger.FroggerApp froggerApp12 = new frogger.FroggerApp();
    froggerApp12.addNotify();
    java.awt.Point point14 = froggerApp12.getMousePosition();
    java.awt.image.VolatileImage volatileImage17 = froggerApp12.createVolatileImage((int)(short)1, (int)' ');
    frogger.FroggerApp froggerApp18 = new frogger.FroggerApp();
    java.awt.Container container19 = froggerApp18.getParent();
    froggerApp18.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension26 = froggerApp18.preferredSize();
    froggerApp18.setSize((int)(short)100, (int)(short)1);
    int i30 = froggerApp0.checkImage((java.awt.Image)volatileImage17, (java.awt.image.ImageObserver)froggerApp18);
    boolean b33 = froggerApp18.inside(10, 128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    froggerApp0.drawBoard();
    froggerApp0.setIgnoreRepaint(false);
    java.awt.Rectangle rectangle7 = froggerApp0.getBounds();
    boolean b8 = froggerApp0.isDoubleBuffered();
    froggerApp0.createGame();
    java.awt.Window window10 = froggerApp0.getOwner();
    // The following exception was thrown during execution in test generation
    try {
    java.awt.Rectangle rectangle11 = window10.bounds();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(window10);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    java.awt.image.VolatileImage volatileImage7 = froggerApp0.createVolatileImage((int)'a', 9);
    java.awt.Event event8 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.deliverEvent(event8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage7);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    int i0 = java.awt.Frame.MOVE_CURSOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 13);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    boolean b3 = froggerApp0.getFocusTraversalKeysEnabled();
    java.awt.Component component5 = froggerApp0.getComponent((int)(short)0);
    frogger.FroggerApp froggerApp6 = new frogger.FroggerApp();
    java.awt.Container container7 = froggerApp6.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array8 = froggerApp6.getHierarchyListeners();
    froggerApp6.nextFocus();
    java.awt.MenuBar menuBar10 = froggerApp6.getMenuBar();
    java.awt.Point point11 = froggerApp6.location();
    java.beans.PropertyChangeListener[] propertyChangeListener_array13 = froggerApp6.getPropertyChangeListeners("");
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    froggerApp14.drawBoard();
    froggerApp14.setIgnoreRepaint(false);
    java.awt.Rectangle rectangle21 = froggerApp14.getBounds();
    java.awt.Rectangle rectangle22 = froggerApp6.getBounds(rectangle21);
    java.awt.Rectangle rectangle23 = component5.getBounds(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle23);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.Dimension dimension18 = froggerApp14.getMaximumSize();
    java.awt.image.VolatileImage volatileImage21 = froggerApp14.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    froggerApp22.addNotify();
    java.awt.Point point24 = froggerApp22.getMousePosition();
    int i25 = froggerApp0.checkImage((java.awt.Image)volatileImage21, (java.awt.image.ImageObserver)froggerApp22);
    froggerApp0.move((int)(short)-1, (int)'a');
    froggerApp0.nextFocus();
    java.awt.event.MouseWheelListener mouseWheelListener30 = null;
    froggerApp0.addMouseWheelListener(mouseWheelListener30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    java.lang.String str14 = froggerApp0.getTitle();
    boolean b15 = froggerApp0.isDoubleBuffered();
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.setDefaultCloseOperation(4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    froggerApp0.drawBoard();
    froggerApp0.setIgnoreRepaint(false);
    boolean b7 = froggerApp0.isOpaque();
    froggerApp0.setState((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    froggerApp0.toBack();
    java.awt.Color color10 = froggerApp0.getForeground();
    java.awt.Point point11 = froggerApp0.getLocation();
    froggerApp0.disable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point11);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array10 = froggerApp8.getHierarchyListeners();
    froggerApp8.nextFocus();
    java.awt.Dimension dimension12 = froggerApp8.getMaximumSize();
    java.awt.image.VolatileImage volatileImage15 = froggerApp8.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp18 = new frogger.FroggerApp();
    froggerApp18.addNotify();
    boolean b20 = froggerApp18.isCursorSet();
    boolean b21 = froggerApp0.prepareImage((java.awt.Image)volatileImage15, 4, (int)'4', (java.awt.image.ImageObserver)froggerApp18);
    java.awt.dnd.DropTarget dropTarget22 = null;
    froggerApp0.setDropTarget(dropTarget22);
    froggerApp0.setVisible(true);
    java.awt.AWTEvent aWTEvent26 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.dispatchEvent(aWTEvent26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = froggerApp0.getBaselineResizeBehavior();
    java.awt.peer.ComponentPeer componentPeer10 = froggerApp0.getPeer();
    frogger.FroggerApp froggerApp11 = new frogger.FroggerApp();
    java.awt.Container container12 = froggerApp11.getParent();
    froggerApp11.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension19 = froggerApp11.preferredSize();
    frogger.FroggerApp froggerApp20 = new frogger.FroggerApp();
    java.awt.Container container21 = froggerApp20.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array22 = froggerApp20.getHierarchyListeners();
    froggerApp20.nextFocus();
    java.awt.MenuBar menuBar24 = froggerApp20.getMenuBar();
    java.awt.Point point25 = froggerApp20.location();
    java.awt.Component component26 = froggerApp11.findComponentAt(point25);
    java.awt.Component component27 = froggerApp0.findComponentAt(point25);
    froggerApp0.setResizable(true);
    frogger.FroggerApp froggerApp30 = new frogger.FroggerApp();
    java.awt.Container container31 = froggerApp30.getParent();
    froggerApp30.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension38 = froggerApp30.preferredSize();
    froggerApp30.toBack();
    java.awt.Color color40 = froggerApp30.getForeground();
    froggerApp0.setForeground(color40);
    froggerApp0.list();
    java.awt.event.WindowListener windowListener43 = null;
    froggerApp0.addWindowListener(windowListener43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentPeer10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color40);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    java.lang.String str14 = froggerApp0.getTitle();
    boolean b15 = froggerApp0.isDoubleBuffered();
    java.awt.ImageCapabilities imageCapabilities18 = null;
    java.awt.image.VolatileImage volatileImage19 = froggerApp0.createVolatileImage((int)'a', 12, imageCapabilities18);
    froggerApp0.show(true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage19);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.awt.event.MouseListener mouseListener2 = null;
    froggerApp0.removeMouseListener(mouseListener2);
    java.awt.event.InputMethodListener inputMethodListener4 = null;
    froggerApp0.removeInputMethodListener(inputMethodListener4);
    java.awt.Dimension dimension6 = froggerApp0.getMaximumSize();
    boolean b7 = froggerApp0.isAlwaysOnTop();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy9);
    int i11 = froggerApp0.getDefaultCloseOperation();
    java.awt.event.KeyListener keyListener12 = null;
    froggerApp0.removeKeyListener(keyListener12);
    java.awt.Event event14 = null;
    frogger.FroggerApp froggerApp15 = new frogger.FroggerApp();
    froggerApp15.addNotify();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array17 = froggerApp15.getMouseWheelListeners();
    froggerApp15.setAlwaysOnTop(true);
    int i20 = froggerApp15.getCursorType();
    boolean b21 = froggerApp0.gotFocus(event14, (java.lang.Object)i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.event.WindowListener windowListener1 = null;
    froggerApp0.removeWindowListener(windowListener1);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    froggerApp0.setFocusCycleRoot(false);
    java.awt.event.WindowListener windowListener11 = null;
    froggerApp0.addWindowListener(windowListener11);
    java.awt.Dimension dimension13 = froggerApp0.getMinimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension13);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    java.lang.String str14 = froggerApp0.getTitle();
    boolean b15 = froggerApp0.isDoubleBuffered();
    boolean b16 = froggerApp0.isLightweight();
    froggerApp0.firePropertyChange("J", (double)(byte)10, (double)10L);
    float f21 = froggerApp0.getOpacity();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f21 == 1.0f);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    java.awt.Shape shape12 = null;
    froggerApp0.setShape(shape12);
    int i14 = froggerApp0.getHeight();
    boolean b15 = froggerApp0.isFocusTraversalPolicyProvider();
    boolean b16 = froggerApp0.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 65535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    froggerApp0.setSize((int)(byte)-1, 100);
    frogger.FroggerApp froggerApp12 = new frogger.FroggerApp();
    java.awt.Container container13 = froggerApp12.getParent();
    froggerApp12.repaint((long)5, 2, 1, 128, 11);
    boolean b20 = froggerApp12.getIgnoreRepaint();
    boolean b21 = froggerApp12.isValidateRoot();
    java.awt.Cursor cursor22 = null;
    froggerApp12.setCursor(cursor22);
    frogger.FroggerApp froggerApp24 = new frogger.FroggerApp();
    froggerApp24.addNotify();
    java.awt.Point point26 = froggerApp24.getMousePosition();
    java.awt.image.VolatileImage volatileImage29 = froggerApp24.createVolatileImage((int)(short)1, (int)' ');
    frogger.FroggerApp froggerApp30 = new frogger.FroggerApp();
    java.awt.Container container31 = froggerApp30.getParent();
    froggerApp30.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension38 = froggerApp30.preferredSize();
    froggerApp30.setSize((int)(short)100, (int)(short)1);
    int i42 = froggerApp12.checkImage((java.awt.Image)volatileImage29, (java.awt.image.ImageObserver)froggerApp30);
    frogger.FroggerApp froggerApp45 = new frogger.FroggerApp();
    java.awt.Container container46 = froggerApp45.getParent();
    frogger.FroggerApp froggerApp47 = new frogger.FroggerApp();
    java.awt.Container container48 = froggerApp47.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array49 = froggerApp47.getHierarchyListeners();
    froggerApp47.nextFocus();
    java.awt.Dimension dimension51 = froggerApp47.getMaximumSize();
    frogger.FroggerApp froggerApp52 = new frogger.FroggerApp();
    java.awt.Container container53 = froggerApp52.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array54 = froggerApp52.getHierarchyListeners();
    froggerApp52.nextFocus();
    java.awt.Dimension dimension56 = froggerApp52.getMaximumSize();
    froggerApp47.setMinimumSize(dimension56);
    froggerApp45.setMinimumSize(dimension56);
    frogger.FroggerApp froggerApp59 = new frogger.FroggerApp();
    java.awt.Container container60 = froggerApp59.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array61 = froggerApp59.getHierarchyListeners();
    froggerApp59.nextFocus();
    java.awt.Dimension dimension63 = froggerApp59.getMaximumSize();
    java.awt.image.VolatileImage volatileImage66 = froggerApp59.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp67 = new frogger.FroggerApp();
    froggerApp67.addNotify();
    java.awt.Point point69 = froggerApp67.getMousePosition();
    int i70 = froggerApp45.checkImage((java.awt.Image)volatileImage66, (java.awt.image.ImageObserver)froggerApp67);
    froggerApp45.move((int)(short)-1, (int)'a');
    froggerApp45.nextFocus();
    froggerApp45.firePropertyChange("", 'a', ' ');
    int i79 = froggerApp0.checkImage((java.awt.Image)volatileImage29, 32, 4, (java.awt.image.ImageObserver)froggerApp45);
    froggerApp0.hide();
    java.awt.Component component83 = froggerApp0.getComponentAt((int)' ', (int)(short)-1);
    java.awt.Cursor cursor84 = null;
    froggerApp0.setCursor(cursor84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component83);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.MenuBar menuBar4 = froggerApp0.getMenuBar();
    java.awt.Point point5 = froggerApp0.location();
    java.beans.PropertyChangeListener[] propertyChangeListener_array7 = froggerApp0.getPropertyChangeListeners("");
    javax.swing.TransferHandler transferHandler8 = froggerApp0.getTransferHandler();
    frogger.FroggerApp froggerApp9 = new frogger.FroggerApp();
    froggerApp9.addNotify();
    java.awt.Point point11 = froggerApp9.getMousePosition();
    java.awt.image.VolatileImage volatileImage14 = froggerApp9.createVolatileImage((int)(short)1, (int)' ');
    java.awt.LayoutManager layoutManager15 = froggerApp9.getLayout();
    froggerApp0.setLayout(layoutManager15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(transferHandler8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(layoutManager15);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    int i18 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp13);
    froggerApp0.enableInputMethods(false);
    froggerApp0.repaint();
    boolean b22 = froggerApp0.isAutoRequestFocus();
    froggerApp0.drawBoard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = froggerApp0.getBaselineResizeBehavior();
    java.awt.peer.ComponentPeer componentPeer10 = froggerApp0.getPeer();
    java.lang.String str11 = froggerApp0.getWarningString();
    froggerApp0.setTitle("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentPeer10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    froggerApp0.transferFocusBackward();
    java.awt.Dialog.ModalExclusionType modalExclusionType3 = froggerApp0.getModalExclusionType();
    org.junit.Assert.assertTrue("'" + modalExclusionType3 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType3.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    java.awt.Event event9 = null;
    boolean b12 = froggerApp0.mouseExit(event9, (-1), 1092);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    froggerApp0.drawBoard();
    boolean b5 = froggerApp0.isVisible();
    frogger.FroggerApp froggerApp6 = new frogger.FroggerApp();
    java.awt.Container container7 = froggerApp6.getParent();
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array10 = froggerApp8.getHierarchyListeners();
    froggerApp8.nextFocus();
    java.awt.Dimension dimension12 = froggerApp8.getMaximumSize();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    froggerApp8.setMinimumSize(dimension17);
    froggerApp6.setMinimumSize(dimension17);
    frogger.FroggerApp froggerApp20 = new frogger.FroggerApp();
    java.awt.Container container21 = froggerApp20.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array22 = froggerApp20.getHierarchyListeners();
    froggerApp20.nextFocus();
    java.awt.Dimension dimension24 = froggerApp20.getMaximumSize();
    java.awt.image.VolatileImage volatileImage27 = froggerApp20.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp28 = new frogger.FroggerApp();
    froggerApp28.addNotify();
    java.awt.Point point30 = froggerApp28.getMousePosition();
    int i31 = froggerApp6.checkImage((java.awt.Image)volatileImage27, (java.awt.image.ImageObserver)froggerApp28);
    froggerApp6.setAlwaysOnTop(false);
    javax.swing.JLayeredPane jLayeredPane34 = froggerApp6.getLayeredPane();
    frogger.FroggerApp froggerApp35 = new frogger.FroggerApp();
    java.awt.Container container36 = froggerApp35.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array37 = froggerApp35.getHierarchyListeners();
    froggerApp35.nextFocus();
    java.awt.MenuBar menuBar39 = froggerApp35.getMenuBar();
    java.awt.Point point40 = froggerApp35.location();
    java.awt.Component component41 = jLayeredPane34.findComponentAt(point40);
    froggerApp0.setLayeredPane(jLayeredPane34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component41);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    boolean b3 = froggerApp0.getFocusTraversalKeysEnabled();
    java.awt.Component component5 = froggerApp0.getComponent((int)(short)0);
    java.awt.event.WindowFocusListener[] windowFocusListener_array6 = froggerApp0.getWindowFocusListeners();
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.setOpacity((float)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowFocusListener_array6);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    java.awt.Rectangle rectangle3 = null;
    froggerApp0.setMaximizedBounds(rectangle3);
    java.beans.PropertyChangeListener propertyChangeListener6 = null;
    froggerApp0.removePropertyChangeListener("", propertyChangeListener6);
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    froggerApp8.addNotify();
    java.awt.Point point10 = froggerApp8.getMousePosition();
    java.awt.image.VolatileImage volatileImage13 = froggerApp8.createVolatileImage((int)(short)1, (int)' ');
    java.awt.LayoutManager layoutManager14 = froggerApp8.getLayout();
    froggerApp0.setLayout(layoutManager14);
    boolean b16 = froggerApp0.isFocusable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(layoutManager14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.setSize(6, 12);
    frogger.FroggerApp froggerApp6 = new frogger.FroggerApp();
    java.awt.Container container7 = froggerApp6.getParent();
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array10 = froggerApp8.getHierarchyListeners();
    froggerApp8.nextFocus();
    java.awt.Dimension dimension12 = froggerApp8.getMaximumSize();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    froggerApp8.setMinimumSize(dimension17);
    froggerApp6.setMinimumSize(dimension17);
    froggerApp0.setMaximumSize(dimension17);
    boolean b21 = froggerApp0.isFocusOwner();
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    java.awt.Container container23 = froggerApp22.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array24 = froggerApp22.getHierarchyListeners();
    froggerApp22.nextFocus();
    java.awt.Dimension dimension26 = froggerApp22.getMaximumSize();
    java.awt.image.VolatileImage volatileImage29 = froggerApp22.createVolatileImage((int)'a', 9);
    java.awt.Dialog.ModalExclusionType modalExclusionType30 = froggerApp22.getModalExclusionType();
    frogger.FroggerApp froggerApp31 = new frogger.FroggerApp();
    java.awt.Container container32 = froggerApp31.getParent();
    frogger.FroggerApp froggerApp33 = new frogger.FroggerApp();
    java.awt.Container container34 = froggerApp33.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array35 = froggerApp33.getHierarchyListeners();
    froggerApp33.nextFocus();
    java.awt.Dimension dimension37 = froggerApp33.getMaximumSize();
    frogger.FroggerApp froggerApp38 = new frogger.FroggerApp();
    java.awt.Container container39 = froggerApp38.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array40 = froggerApp38.getHierarchyListeners();
    froggerApp38.nextFocus();
    java.awt.Dimension dimension42 = froggerApp38.getMaximumSize();
    froggerApp33.setMinimumSize(dimension42);
    froggerApp31.setMinimumSize(dimension42);
    frogger.FroggerApp froggerApp45 = new frogger.FroggerApp();
    java.awt.Container container46 = froggerApp45.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array47 = froggerApp45.getHierarchyListeners();
    froggerApp45.nextFocus();
    java.awt.Dimension dimension49 = froggerApp45.getMaximumSize();
    java.awt.image.VolatileImage volatileImage52 = froggerApp45.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp53 = new frogger.FroggerApp();
    froggerApp53.addNotify();
    java.awt.Point point55 = froggerApp53.getMousePosition();
    int i56 = froggerApp31.checkImage((java.awt.Image)volatileImage52, (java.awt.image.ImageObserver)froggerApp53);
    frogger.FroggerApp froggerApp59 = new frogger.FroggerApp();
    froggerApp59.addNotify();
    java.awt.event.MouseListener mouseListener61 = null;
    froggerApp59.removeMouseListener(mouseListener61);
    java.awt.event.InputMethodListener inputMethodListener63 = null;
    froggerApp59.removeInputMethodListener(inputMethodListener63);
    java.awt.Dimension dimension65 = froggerApp59.getMaximumSize();
    boolean b66 = froggerApp22.prepareImage((java.awt.Image)volatileImage52, 11, (int)(short)10, (java.awt.image.ImageObserver)froggerApp59);
    frogger.FroggerApp froggerApp69 = new frogger.FroggerApp();
    java.awt.Container container70 = froggerApp69.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array71 = froggerApp69.getHierarchyListeners();
    froggerApp69.nextFocus();
    java.awt.Dimension dimension73 = froggerApp69.getMaximumSize();
    frogger.FroggerApp froggerApp74 = new frogger.FroggerApp();
    java.awt.Container container75 = froggerApp74.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array76 = froggerApp74.getHierarchyListeners();
    froggerApp74.nextFocus();
    java.awt.Dimension dimension78 = froggerApp74.getMaximumSize();
    froggerApp69.setMinimumSize(dimension78);
    boolean b80 = froggerApp69.isCursorSet();
    boolean b81 = froggerApp69.isForegroundSet();
    frogger.FroggerApp froggerApp82 = new frogger.FroggerApp();
    java.awt.Container container83 = froggerApp82.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array84 = froggerApp82.getHierarchyListeners();
    froggerApp82.nextFocus();
    java.awt.Dimension dimension86 = froggerApp82.getMaximumSize();
    int i87 = froggerApp69.getComponentZOrder((java.awt.Component)froggerApp82);
    java.awt.event.MouseMotionListener[] mouseMotionListener_array88 = froggerApp82.getMouseMotionListeners();
    java.awt.Dialog.ModalExclusionType modalExclusionType89 = froggerApp82.getModalExclusionType();
    froggerApp82.setCursor((int)(short)1);
    boolean b92 = froggerApp82.isFocusTraversalPolicySet();
    java.awt.image.ColorModel colorModel93 = froggerApp82.getColorModel();
    int i94 = froggerApp0.checkImage((java.awt.Image)volatileImage52, 7, (int)' ', (java.awt.image.ImageObserver)froggerApp82);
    java.awt.Image image97 = froggerApp82.createImage(9, 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage29);
    org.junit.Assert.assertTrue("'" + modalExclusionType30 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType30.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array88);
    org.junit.Assert.assertTrue("'" + modalExclusionType89 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType89.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image97);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array10 = froggerApp8.getHierarchyListeners();
    froggerApp8.nextFocus();
    java.awt.Dimension dimension12 = froggerApp8.getMaximumSize();
    java.awt.image.VolatileImage volatileImage15 = froggerApp8.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp18 = new frogger.FroggerApp();
    froggerApp18.addNotify();
    boolean b20 = froggerApp18.isCursorSet();
    boolean b21 = froggerApp0.prepareImage((java.awt.Image)volatileImage15, 4, (int)'4', (java.awt.image.ImageObserver)froggerApp18);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    java.awt.Container container23 = froggerApp22.getParent();
    froggerApp22.repaint((long)5, 2, 1, 128, 11);
    boolean b30 = froggerApp22.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy31 = null;
    froggerApp22.setFocusTraversalPolicy(focusTraversalPolicy31);
    int i33 = froggerApp22.getDefaultCloseOperation();
    java.awt.Point point34 = froggerApp22.getLocationOnScreen();
    java.awt.Component component35 = froggerApp0.findComponentAt(point34);
    boolean b36 = component35.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    java.awt.Shape shape12 = null;
    froggerApp0.setShape(shape12);
    froggerApp0.firePropertyChange("hi!", (byte)0, (byte)0);
    java.util.List<java.awt.Image> list_image18 = froggerApp0.getIconImages();
    frogger.FroggerApp froggerApp19 = new frogger.FroggerApp();
    froggerApp19.addNotify();
    boolean b21 = froggerApp19.isCursorSet();
    java.awt.Rectangle rectangle22 = null;
    froggerApp19.setMaximizedBounds(rectangle22);
    int i24 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp19);
    frogger.FroggerApp froggerApp25 = new frogger.FroggerApp();
    java.awt.Container container26 = froggerApp25.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array27 = froggerApp25.getHierarchyListeners();
    froggerApp25.nextFocus();
    java.awt.MenuBar menuBar29 = froggerApp25.getMenuBar();
    java.awt.event.InputMethodListener[] inputMethodListener_array30 = froggerApp25.getInputMethodListeners();
    boolean b31 = froggerApp25.isDisplayable();
    java.awt.Color color32 = froggerApp25.getBackground();
    froggerApp19.setBackground(color32);
    java.awt.Image image34 = froggerApp19.getIconImage();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_image18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMethodListener_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(image34);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    froggerApp0.repaint();
    java.awt.MenuBar menuBar5 = null;
    froggerApp0.setMenuBar(menuBar5);
    java.awt.Point point7 = froggerApp0.getMousePosition();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point7);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    frogger.Chaser chaser2 = new frogger.Chaser(2, 10);
    int i3 = chaser2.getY();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy9);
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener11 = null;
    froggerApp0.removeHierarchyBoundsListener(hierarchyBoundsListener11);
    java.awt.Image image13 = froggerApp0.getIconImage();
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.MenuBar menuBar18 = froggerApp14.getMenuBar();
    java.awt.Point point19 = froggerApp14.location();
    froggerApp0.setLocation(point19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(image13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point19);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    frogger.FroggerApp froggerApp9 = new frogger.FroggerApp();
    java.awt.Container container10 = froggerApp9.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array11 = froggerApp9.getHierarchyListeners();
    froggerApp9.nextFocus();
    java.awt.MenuBar menuBar13 = froggerApp9.getMenuBar();
    java.awt.Point point14 = froggerApp9.location();
    java.awt.Component component15 = froggerApp0.findComponentAt(point14);
    java.awt.event.MouseListener mouseListener16 = null;
    froggerApp0.addMouseListener(mouseListener16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component15);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.awt.event.MouseListener mouseListener2 = null;
    froggerApp0.removeMouseListener(mouseListener2);
    java.awt.event.InputMethodListener inputMethodListener4 = null;
    froggerApp0.removeInputMethodListener(inputMethodListener4);
    java.awt.Dimension dimension6 = froggerApp0.getMaximumSize();
    froggerApp0.setAlwaysOnTop(false);
    java.awt.MenuBar menuBar9 = null;
    froggerApp0.setMenuBar(menuBar9);
    java.awt.Event event11 = null;
    boolean b14 = froggerApp0.mouseUp(event11, (-1), 65535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.MenuBar menuBar4 = froggerApp0.getMenuBar();
    java.awt.Point point5 = froggerApp0.location();
    froggerApp0.pack();
    boolean b7 = froggerApp0.isAutoRequestFocus();
    java.awt.Window window8 = froggerApp0.getOwner();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(window8);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    froggerApp0.setFocusTraversalKeysEnabled(false);
    java.awt.image.ImageProducer imageProducer10 = null;
    java.awt.Image image11 = froggerApp0.createImage(imageProducer10);
    java.awt.Window window12 = froggerApp0.getOwner();
    boolean b13 = froggerApp0.isFocusCycleRoot();
    java.awt.Event event14 = null;
    frogger.FroggerApp froggerApp15 = new frogger.FroggerApp();
    java.awt.Container container16 = froggerApp15.getParent();
    froggerApp15.repaint((long)5, 2, 1, 128, 11);
    boolean b23 = froggerApp15.getIgnoreRepaint();
    froggerApp15.setSize((int)(byte)-1, 100);
    int i27 = froggerApp15.getWidth();
    boolean b28 = froggerApp0.action(event14, (java.lang.Object)froggerApp15);
    java.awt.Dimension dimension29 = froggerApp0.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(window12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension29);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    java.awt.Rectangle rectangle3 = null;
    froggerApp0.setMaximizedBounds(rectangle3);
    java.awt.FocusTraversalPolicy focusTraversalPolicy5 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy5);
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp0.getHierarchyListeners();
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    froggerApp8.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener10 = null;
    froggerApp8.addPropertyChangeListener(propertyChangeListener10);
    froggerApp8.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp16 = new frogger.FroggerApp();
    java.awt.Container container17 = froggerApp16.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array18 = froggerApp16.getHierarchyListeners();
    froggerApp16.nextFocus();
    java.awt.Dimension dimension20 = froggerApp16.getMaximumSize();
    java.awt.image.VolatileImage volatileImage23 = froggerApp16.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp26 = new frogger.FroggerApp();
    froggerApp26.addNotify();
    boolean b28 = froggerApp26.isCursorSet();
    boolean b29 = froggerApp8.prepareImage((java.awt.Image)volatileImage23, 4, (int)'4', (java.awt.image.ImageObserver)froggerApp26);
    froggerApp0.setIconImage((java.awt.Image)volatileImage23);
    boolean b31 = froggerApp0.isLocationByPlatform();
    java.awt.Dimension dimension32 = froggerApp0.getMinimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension32);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    int i18 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp13);
    int i19 = froggerApp13.getCursorType();
    frogger.FroggerApp froggerApp20 = new frogger.FroggerApp();
    java.awt.Container container21 = froggerApp20.getParent();
    froggerApp20.repaint((long)5, 2, 1, 128, 11);
    boolean b28 = froggerApp20.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy29 = froggerApp20.getFocusTraversalPolicy();
    froggerApp13.setFocusTraversalPolicy(focusTraversalPolicy29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusTraversalPolicy29);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    froggerApp0.drawBoard();
    froggerApp0.setIgnoreRepaint(false);
    java.awt.Rectangle rectangle7 = froggerApp0.getBounds();
    boolean b8 = froggerApp0.isAlwaysOnTopSupported();
    frogger.FroggerApp froggerApp9 = new frogger.FroggerApp();
    java.awt.Container container10 = froggerApp9.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array11 = froggerApp9.getHierarchyListeners();
    froggerApp9.nextFocus();
    java.awt.Dimension dimension13 = froggerApp9.getMaximumSize();
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.Dimension dimension18 = froggerApp14.getMaximumSize();
    froggerApp9.setMinimumSize(dimension18);
    boolean b20 = froggerApp9.isCursorSet();
    boolean b21 = froggerApp9.isForegroundSet();
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    java.awt.Container container23 = froggerApp22.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array24 = froggerApp22.getHierarchyListeners();
    froggerApp22.nextFocus();
    java.awt.Dimension dimension26 = froggerApp22.getMaximumSize();
    int i27 = froggerApp9.getComponentZOrder((java.awt.Component)froggerApp22);
    java.awt.Event event28 = null;
    boolean b31 = froggerApp9.mouseDown(event28, 64, (int)'#');
    java.awt.Window window32 = froggerApp9.getOwner();
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.setContentPane((java.awt.Container)window32);
      org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(window32);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array10 = froggerApp8.getHierarchyListeners();
    froggerApp8.nextFocus();
    java.awt.Dimension dimension12 = froggerApp8.getMaximumSize();
    java.awt.image.VolatileImage volatileImage15 = froggerApp8.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp18 = new frogger.FroggerApp();
    froggerApp18.addNotify();
    boolean b20 = froggerApp18.isCursorSet();
    boolean b21 = froggerApp0.prepareImage((java.awt.Image)volatileImage15, 4, (int)'4', (java.awt.image.ImageObserver)froggerApp18);
    java.awt.Component component22 = froggerApp0.getGlassPane();
    int i23 = froggerApp0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array10 = froggerApp8.getHierarchyListeners();
    froggerApp8.nextFocus();
    java.awt.Dimension dimension12 = froggerApp8.getMaximumSize();
    froggerApp0.setMaximumSize(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.awt.Point point2 = froggerApp0.getMousePosition();
    java.awt.image.VolatileImage volatileImage5 = froggerApp0.createVolatileImage((int)(short)1, (int)' ');
    java.awt.LayoutManager layoutManager6 = froggerApp0.getLayout();
    java.awt.MenuBar menuBar7 = froggerApp0.getMenuBar();
    java.awt.GraphicsConfiguration graphicsConfiguration8 = froggerApp0.getGraphicsConfiguration();
    java.awt.event.MouseWheelListener mouseWheelListener9 = null;
    froggerApp0.addMouseWheelListener(mouseWheelListener9);
    froggerApp0.pack();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(layoutManager6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graphicsConfiguration8);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    java.awt.Shape shape12 = null;
    froggerApp0.setShape(shape12);
    int i14 = froggerApp0.getHeight();
    java.awt.Rectangle rectangle15 = froggerApp0.getBounds();
    froggerApp0.show();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 65535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle15);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = froggerApp0.getFocusTraversalPolicy();
    java.awt.Component component10 = froggerApp0.getMostRecentFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusTraversalPolicy9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component10);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.MenuBar menuBar4 = froggerApp0.getMenuBar();
    java.awt.Point point5 = froggerApp0.location();
    java.beans.PropertyChangeListener[] propertyChangeListener_array7 = froggerApp0.getPropertyChangeListeners("");
    java.awt.LayoutManager layoutManager8 = froggerApp0.getLayout();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(layoutManager8);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    int i18 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp13);
    java.awt.event.MouseMotionListener[] mouseMotionListener_array19 = froggerApp13.getMouseMotionListeners();
    java.awt.Dialog.ModalExclusionType modalExclusionType20 = froggerApp13.getModalExclusionType();
    froggerApp13.repaint((long)(short)1, 8, 0, 3, 13);
    boolean b27 = froggerApp13.isBackgroundSet();
    int i28 = froggerApp13.getDefaultCloseOperation();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array19);
    org.junit.Assert.assertTrue("'" + modalExclusionType20 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType20.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 3);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array10 = froggerApp8.getHierarchyListeners();
    froggerApp8.nextFocus();
    java.awt.Dimension dimension12 = froggerApp8.getMaximumSize();
    java.awt.image.VolatileImage volatileImage15 = froggerApp8.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp18 = new frogger.FroggerApp();
    froggerApp18.addNotify();
    boolean b20 = froggerApp18.isCursorSet();
    boolean b21 = froggerApp0.prepareImage((java.awt.Image)volatileImage15, 4, (int)'4', (java.awt.image.ImageObserver)froggerApp18);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    java.awt.Container container23 = froggerApp22.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array24 = froggerApp22.getHierarchyListeners();
    froggerApp22.nextFocus();
    java.awt.Dimension dimension26 = froggerApp22.getMaximumSize();
    frogger.FroggerApp froggerApp27 = new frogger.FroggerApp();
    java.awt.Container container28 = froggerApp27.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array29 = froggerApp27.getHierarchyListeners();
    froggerApp27.nextFocus();
    java.awt.Dimension dimension31 = froggerApp27.getMaximumSize();
    froggerApp22.setMinimumSize(dimension31);
    froggerApp18.setSize(dimension31);
    java.io.PrintStream printStream34 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp18.list(printStream34);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension31);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    froggerApp0.drawBoard();
    boolean b5 = froggerApp0.isVisible();
    java.awt.event.FocusListener focusListener6 = null;
    froggerApp0.addFocusListener(focusListener6);
    boolean b8 = froggerApp0.isFocusOwner();
    boolean b9 = froggerApp0.isAlwaysOnTopSupported();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.preferredSize();
    java.awt.event.WindowFocusListener windowFocusListener5 = null;
    froggerApp0.removeWindowFocusListener(windowFocusListener5);
    java.awt.GraphicsConfiguration graphicsConfiguration7 = froggerApp0.getGraphicsConfiguration();
    java.awt.Component component10 = froggerApp0.locate(65535, 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graphicsConfiguration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component10);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.preferredSize();
    int i5 = froggerApp0.getY();
    java.awt.Dialog.ModalExclusionType modalExclusionType6 = froggerApp0.getModalExclusionType();
    java.awt.event.WindowStateListener[] windowStateListener_array7 = froggerApp0.getWindowStateListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    org.junit.Assert.assertTrue("'" + modalExclusionType6 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType6.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowStateListener_array7);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy9);
    int i11 = froggerApp0.getDefaultCloseOperation();
    java.awt.event.KeyListener keyListener12 = null;
    froggerApp0.removeKeyListener(keyListener12);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    frogger.FroggerApp froggerApp16 = new frogger.FroggerApp();
    java.awt.Container container17 = froggerApp16.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array18 = froggerApp16.getHierarchyListeners();
    froggerApp16.nextFocus();
    java.awt.Dimension dimension20 = froggerApp16.getMaximumSize();
    frogger.FroggerApp froggerApp21 = new frogger.FroggerApp();
    java.awt.Container container22 = froggerApp21.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array23 = froggerApp21.getHierarchyListeners();
    froggerApp21.nextFocus();
    java.awt.Dimension dimension25 = froggerApp21.getMaximumSize();
    froggerApp16.setMinimumSize(dimension25);
    froggerApp14.setMinimumSize(dimension25);
    frogger.FroggerApp froggerApp28 = new frogger.FroggerApp();
    java.awt.Container container29 = froggerApp28.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array30 = froggerApp28.getHierarchyListeners();
    froggerApp28.nextFocus();
    java.awt.Dimension dimension32 = froggerApp28.getMaximumSize();
    java.awt.image.VolatileImage volatileImage35 = froggerApp28.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp36 = new frogger.FroggerApp();
    froggerApp36.addNotify();
    java.awt.Point point38 = froggerApp36.getMousePosition();
    int i39 = froggerApp14.checkImage((java.awt.Image)volatileImage35, (java.awt.image.ImageObserver)froggerApp36);
    froggerApp14.setAlwaysOnTop(false);
    javax.swing.JLayeredPane jLayeredPane42 = froggerApp14.getLayeredPane();
    java.awt.image.ColorModel colorModel43 = jLayeredPane42.getColorModel();
    froggerApp0.setLayeredPane(jLayeredPane42);
    froggerApp0.requestFocus();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel43);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.Dimension dimension18 = froggerApp14.getMaximumSize();
    java.awt.image.VolatileImage volatileImage21 = froggerApp14.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    froggerApp22.addNotify();
    java.awt.Point point24 = froggerApp22.getMousePosition();
    int i25 = froggerApp0.checkImage((java.awt.Image)volatileImage21, (java.awt.image.ImageObserver)froggerApp22);
    froggerApp0.setAlwaysOnTop(false);
    javax.swing.JLayeredPane jLayeredPane28 = froggerApp0.getLayeredPane();
    froggerApp0.firePropertyChange("hi!", (byte)10, (byte)0);
    java.awt.event.FocusListener[] focusListener_array33 = froggerApp0.getFocusListeners();
    javax.swing.JMenuBar jMenuBar34 = null;
    froggerApp0.setJMenuBar(jMenuBar34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array33);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = froggerApp0.getBaselineResizeBehavior();
    java.awt.peer.ComponentPeer componentPeer10 = froggerApp0.getPeer();
    frogger.FroggerApp froggerApp11 = new frogger.FroggerApp();
    java.awt.Container container12 = froggerApp11.getParent();
    froggerApp11.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension19 = froggerApp11.preferredSize();
    frogger.FroggerApp froggerApp20 = new frogger.FroggerApp();
    java.awt.Container container21 = froggerApp20.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array22 = froggerApp20.getHierarchyListeners();
    froggerApp20.nextFocus();
    java.awt.MenuBar menuBar24 = froggerApp20.getMenuBar();
    java.awt.Point point25 = froggerApp20.location();
    java.awt.Component component26 = froggerApp11.findComponentAt(point25);
    java.awt.Component component27 = froggerApp0.findComponentAt(point25);
    froggerApp0.setResizable(true);
    frogger.FroggerApp froggerApp30 = new frogger.FroggerApp();
    java.awt.Container container31 = froggerApp30.getParent();
    froggerApp30.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension38 = froggerApp30.preferredSize();
    froggerApp30.toBack();
    java.awt.Color color40 = froggerApp30.getForeground();
    froggerApp0.setForeground(color40);
    froggerApp0.repaint(0L, 4, (int)'4', 3, (int)(byte)1);
    froggerApp0.transferFocusBackward();
    boolean b49 = froggerApp0.isFocusOwner();
    java.awt.event.MouseMotionListener mouseMotionListener50 = null;
    froggerApp0.addMouseMotionListener(mouseMotionListener50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentPeer10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    froggerApp0.repaint();
    javax.swing.TransferHandler transferHandler5 = null;
    froggerApp0.setTransferHandler(transferHandler5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy9);
    froggerApp0.setTitle("");
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    froggerApp13.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension21 = froggerApp13.preferredSize();
    froggerApp13.toBack();
    frogger.FroggerApp froggerApp23 = new frogger.FroggerApp();
    java.awt.Container container24 = froggerApp23.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array25 = froggerApp23.getHierarchyListeners();
    froggerApp23.nextFocus();
    java.awt.Dimension dimension27 = froggerApp23.getMaximumSize();
    frogger.FroggerApp froggerApp28 = new frogger.FroggerApp();
    java.awt.Container container29 = froggerApp28.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array30 = froggerApp28.getHierarchyListeners();
    froggerApp28.nextFocus();
    java.awt.Dimension dimension32 = froggerApp28.getMaximumSize();
    froggerApp23.setMinimumSize(dimension32);
    froggerApp13.setMaximumSize(dimension32);
    froggerApp0.setSize(dimension32);
    boolean b36 = froggerApp0.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy9);
    java.awt.event.HierarchyBoundsListener hierarchyBoundsListener11 = null;
    froggerApp0.removeHierarchyBoundsListener(hierarchyBoundsListener11);
    boolean b13 = froggerApp0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy9);
    froggerApp0.setTitle("");
    java.awt.image.ColorModel colorModel13 = froggerApp0.getColorModel();
    java.lang.String str14 = froggerApp0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel13);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    java.lang.String str14 = froggerApp0.getTitle();
    boolean b15 = froggerApp0.isDoubleBuffered();
    froggerApp0.requestFocus();
    java.lang.String str17 = froggerApp0.getWarningString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    froggerApp0.drawBoard();
    boolean b5 = froggerApp0.isVisible();
    java.awt.event.FocusListener focusListener6 = null;
    froggerApp0.addFocusListener(focusListener6);
    boolean b8 = froggerApp0.isFocusOwner();
    java.awt.event.MouseListener mouseListener9 = null;
    froggerApp0.removeMouseListener(mouseListener9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.Dimension dimension18 = froggerApp14.getMaximumSize();
    java.awt.image.VolatileImage volatileImage21 = froggerApp14.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    froggerApp22.addNotify();
    java.awt.Point point24 = froggerApp22.getMousePosition();
    int i25 = froggerApp0.checkImage((java.awt.Image)volatileImage21, (java.awt.image.ImageObserver)froggerApp22);
    froggerApp0.move((int)(short)-1, (int)'a');
    int i29 = froggerApp0.getX();
    froggerApp0.layout();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == (-1));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    java.awt.event.WindowStateListener windowStateListener5 = null;
    froggerApp0.removeWindowStateListener(windowStateListener5);
    java.awt.Event event7 = null;
    boolean b10 = froggerApp0.mouseDown(event7, 10, (int)(short)100);
    froggerApp0.toFront();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    java.awt.event.MouseListener[] mouseListener_array8 = froggerApp0.getMouseListeners();
    javax.swing.JLayeredPane jLayeredPane9 = froggerApp0.getLayeredPane();
    java.io.PrintWriter printWriter10 = null;
    // The following exception was thrown during execution in test generation
    try {
    jLayeredPane9.list(printWriter10, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseListener_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane9);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    froggerApp14.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener16 = null;
    froggerApp14.addPropertyChangeListener(propertyChangeListener16);
    froggerApp14.firePropertyChange("", (short)(byte)10, (short)-1);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    java.awt.Container container23 = froggerApp22.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array24 = froggerApp22.getHierarchyListeners();
    froggerApp22.nextFocus();
    java.awt.Dimension dimension26 = froggerApp22.getMaximumSize();
    java.awt.image.VolatileImage volatileImage29 = froggerApp22.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp32 = new frogger.FroggerApp();
    froggerApp32.addNotify();
    boolean b34 = froggerApp32.isCursorSet();
    boolean b35 = froggerApp14.prepareImage((java.awt.Image)volatileImage29, 4, (int)'4', (java.awt.image.ImageObserver)froggerApp32);
    java.awt.dnd.DropTarget dropTarget36 = null;
    froggerApp14.setDropTarget(dropTarget36);
    froggerApp14.setVisible(true);
    boolean b40 = froggerApp0.isAncestorOf((java.awt.Component)froggerApp14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    java.awt.Component component9 = froggerApp0.getFocusOwner();
    java.awt.MenuComponent menuComponent10 = null;
    froggerApp0.remove(menuComponent10);
    java.awt.event.WindowFocusListener[] windowFocusListener_array12 = froggerApp0.getWindowFocusListeners();
    java.awt.image.ColorModel colorModel13 = froggerApp0.getColorModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowFocusListener_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(colorModel13);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    java.awt.Shape shape12 = null;
    froggerApp0.setShape(shape12);
    froggerApp0.firePropertyChange("hi!", (byte)0, (byte)0);
    java.util.List<java.awt.Image> list_image18 = froggerApp0.getIconImages();
    frogger.FroggerApp froggerApp19 = new frogger.FroggerApp();
    java.awt.Container container20 = froggerApp19.getParent();
    frogger.FroggerApp froggerApp21 = new frogger.FroggerApp();
    java.awt.Container container22 = froggerApp21.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array23 = froggerApp21.getHierarchyListeners();
    froggerApp21.nextFocus();
    java.awt.Dimension dimension25 = froggerApp21.getMaximumSize();
    frogger.FroggerApp froggerApp26 = new frogger.FroggerApp();
    java.awt.Container container27 = froggerApp26.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array28 = froggerApp26.getHierarchyListeners();
    froggerApp26.nextFocus();
    java.awt.Dimension dimension30 = froggerApp26.getMaximumSize();
    froggerApp21.setMinimumSize(dimension30);
    froggerApp19.setMinimumSize(dimension30);
    frogger.FroggerApp froggerApp33 = new frogger.FroggerApp();
    java.awt.Container container34 = froggerApp33.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array35 = froggerApp33.getHierarchyListeners();
    froggerApp33.nextFocus();
    java.awt.Dimension dimension37 = froggerApp33.getMaximumSize();
    java.awt.image.VolatileImage volatileImage40 = froggerApp33.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp41 = new frogger.FroggerApp();
    froggerApp41.addNotify();
    java.awt.Point point43 = froggerApp41.getMousePosition();
    int i44 = froggerApp19.checkImage((java.awt.Image)volatileImage40, (java.awt.image.ImageObserver)froggerApp41);
    froggerApp19.setAlwaysOnTop(false);
    javax.swing.JLayeredPane jLayeredPane47 = froggerApp19.getLayeredPane();
    frogger.FroggerApp froggerApp48 = new frogger.FroggerApp();
    java.awt.Container container49 = froggerApp48.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array50 = froggerApp48.getHierarchyListeners();
    froggerApp48.nextFocus();
    java.awt.MenuBar menuBar52 = froggerApp48.getMenuBar();
    java.awt.Point point53 = froggerApp48.location();
    java.awt.Component component54 = jLayeredPane47.findComponentAt(point53);
    froggerApp0.setLayeredPane(jLayeredPane47);
    float f56 = jLayeredPane47.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_image18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(f56 == 0.5f);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    int i18 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp13);
    java.awt.event.MouseMotionListener[] mouseMotionListener_array19 = froggerApp13.getMouseMotionListeners();
    java.awt.Dialog.ModalExclusionType modalExclusionType20 = froggerApp13.getModalExclusionType();
    froggerApp13.setCursor((int)(short)1);
    boolean b23 = froggerApp13.isFocusOwner();
    javax.swing.JRootPane jRootPane24 = froggerApp13.getRootPane();
    jRootPane24.validate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array19);
    org.junit.Assert.assertTrue("'" + modalExclusionType20 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType20.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jRootPane24);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    java.awt.image.VolatileImage volatileImage7 = froggerApp0.createVolatileImage((int)'a', 9);
    java.awt.Dialog.ModalExclusionType modalExclusionType8 = froggerApp0.getModalExclusionType();
    frogger.FroggerApp froggerApp9 = new frogger.FroggerApp();
    java.awt.Container container10 = froggerApp9.getParent();
    frogger.FroggerApp froggerApp11 = new frogger.FroggerApp();
    java.awt.Container container12 = froggerApp11.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array13 = froggerApp11.getHierarchyListeners();
    froggerApp11.nextFocus();
    java.awt.Dimension dimension15 = froggerApp11.getMaximumSize();
    frogger.FroggerApp froggerApp16 = new frogger.FroggerApp();
    java.awt.Container container17 = froggerApp16.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array18 = froggerApp16.getHierarchyListeners();
    froggerApp16.nextFocus();
    java.awt.Dimension dimension20 = froggerApp16.getMaximumSize();
    froggerApp11.setMinimumSize(dimension20);
    froggerApp9.setMinimumSize(dimension20);
    frogger.FroggerApp froggerApp23 = new frogger.FroggerApp();
    java.awt.Container container24 = froggerApp23.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array25 = froggerApp23.getHierarchyListeners();
    froggerApp23.nextFocus();
    java.awt.Dimension dimension27 = froggerApp23.getMaximumSize();
    java.awt.image.VolatileImage volatileImage30 = froggerApp23.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp31 = new frogger.FroggerApp();
    froggerApp31.addNotify();
    java.awt.Point point33 = froggerApp31.getMousePosition();
    int i34 = froggerApp9.checkImage((java.awt.Image)volatileImage30, (java.awt.image.ImageObserver)froggerApp31);
    frogger.FroggerApp froggerApp37 = new frogger.FroggerApp();
    froggerApp37.addNotify();
    java.awt.event.MouseListener mouseListener39 = null;
    froggerApp37.removeMouseListener(mouseListener39);
    java.awt.event.InputMethodListener inputMethodListener41 = null;
    froggerApp37.removeInputMethodListener(inputMethodListener41);
    java.awt.Dimension dimension43 = froggerApp37.getMaximumSize();
    boolean b44 = froggerApp0.prepareImage((java.awt.Image)volatileImage30, 11, (int)(short)10, (java.awt.image.ImageObserver)froggerApp37);
    java.awt.event.MouseMotionListener mouseMotionListener45 = null;
    froggerApp37.addMouseMotionListener(mouseMotionListener45);
    java.awt.Dialog.ModalExclusionType modalExclusionType47 = froggerApp37.getModalExclusionType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage7);
    org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    org.junit.Assert.assertTrue("'" + modalExclusionType47 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType47.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.awt.Point point2 = froggerApp0.getMousePosition();
    java.awt.image.VolatileImage volatileImage5 = froggerApp0.createVolatileImage((int)(short)1, (int)' ');
    frogger.FroggerApp froggerApp6 = new frogger.FroggerApp();
    java.awt.Container container7 = froggerApp6.getParent();
    froggerApp6.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension14 = froggerApp6.preferredSize();
    java.awt.Component.BaselineResizeBehavior baselineResizeBehavior15 = froggerApp6.getBaselineResizeBehavior();
    java.awt.peer.ComponentPeer componentPeer16 = froggerApp6.getPeer();
    frogger.FroggerApp froggerApp17 = new frogger.FroggerApp();
    java.awt.Container container18 = froggerApp17.getParent();
    froggerApp17.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension25 = froggerApp17.preferredSize();
    frogger.FroggerApp froggerApp26 = new frogger.FroggerApp();
    java.awt.Container container27 = froggerApp26.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array28 = froggerApp26.getHierarchyListeners();
    froggerApp26.nextFocus();
    java.awt.MenuBar menuBar30 = froggerApp26.getMenuBar();
    java.awt.Point point31 = froggerApp26.location();
    java.awt.Component component32 = froggerApp17.findComponentAt(point31);
    java.awt.Component component33 = froggerApp6.findComponentAt(point31);
    froggerApp6.setResizable(true);
    frogger.FroggerApp froggerApp36 = new frogger.FroggerApp();
    java.awt.Container container37 = froggerApp36.getParent();
    froggerApp36.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension44 = froggerApp36.preferredSize();
    froggerApp36.toBack();
    java.awt.Color color46 = froggerApp36.getForeground();
    froggerApp6.setForeground(color46);
    froggerApp0.setBackground(color46);
    java.awt.image.BufferStrategy bufferStrategy49 = froggerApp0.getBufferStrategy();
    java.lang.String str50 = froggerApp0.toString();
    frogger.FroggerApp froggerApp51 = new frogger.FroggerApp();
    froggerApp51.addNotify();
    java.awt.Point point53 = froggerApp51.getMousePosition();
    java.awt.image.VolatileImage volatileImage56 = froggerApp51.createVolatileImage((int)(short)1, (int)' ');
    java.awt.LayoutManager layoutManager57 = froggerApp51.getLayout();
    froggerApp0.setLayout(layoutManager57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension14);
    org.junit.Assert.assertTrue("'" + baselineResizeBehavior15 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior15.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentPeer16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(bufferStrategy49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(layoutManager57);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.beans.PropertyChangeListener propertyChangeListener2 = null;
    froggerApp0.addPropertyChangeListener(propertyChangeListener2);
    froggerApp0.firePropertyChange("", (short)(byte)10, (short)-1);
    froggerApp0.setFocusTraversalKeysEnabled(false);
    java.awt.image.ImageProducer imageProducer10 = null;
    java.awt.Image image11 = froggerApp0.createImage(imageProducer10);
    java.awt.Window window12 = froggerApp0.getOwner();
    boolean b13 = froggerApp0.isFocusCycleRoot();
    java.awt.Event event14 = null;
    frogger.FroggerApp froggerApp15 = new frogger.FroggerApp();
    java.awt.Container container16 = froggerApp15.getParent();
    froggerApp15.repaint((long)5, 2, 1, 128, 11);
    boolean b23 = froggerApp15.getIgnoreRepaint();
    froggerApp15.setSize((int)(byte)-1, 100);
    int i27 = froggerApp15.getWidth();
    boolean b28 = froggerApp0.action(event14, (java.lang.Object)froggerApp15);
    java.awt.Event event29 = null;
    boolean b32 = froggerApp15.mouseEnter(event29, 8, 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(image11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(window12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    frogger.Hider hider2 = new frogger.Hider(1, 9);
    hider2.act(5, 11);
    java.lang.String str6 = hider2.getMarker();
    java.lang.String str7 = hider2.getMarker();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "H"+ "'", str6.equals("H"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "H"+ "'", str7.equals("H"));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.MenuBar menuBar4 = froggerApp0.getMenuBar();
    java.awt.Point point5 = froggerApp0.location();
    frogger.FroggerApp froggerApp6 = new frogger.FroggerApp();
    java.awt.Container container7 = froggerApp6.getParent();
    froggerApp6.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension14 = froggerApp6.preferredSize();
    froggerApp6.toBack();
    frogger.FroggerApp froggerApp16 = new frogger.FroggerApp();
    java.awt.Container container17 = froggerApp16.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array18 = froggerApp16.getHierarchyListeners();
    froggerApp16.nextFocus();
    froggerApp16.repaint();
    frogger.FroggerApp froggerApp21 = new frogger.FroggerApp();
    froggerApp21.addNotify();
    boolean b23 = froggerApp21.isCursorSet();
    java.awt.Graphics graphics24 = froggerApp21.getGraphics();
    froggerApp16.update(graphics24);
    froggerApp6.paintComponents(graphics24);
    froggerApp0.paintComponents(graphics24);
    froggerApp0.transferFocusUpCycle();
    frogger.FroggerApp froggerApp29 = new frogger.FroggerApp();
    java.awt.Container container30 = froggerApp29.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array31 = froggerApp29.getHierarchyListeners();
    froggerApp29.nextFocus();
    java.awt.Dimension dimension33 = froggerApp29.preferredSize();
    java.awt.Dimension dimension34 = froggerApp29.getMinimumSize();
    froggerApp0.setMinimumSize(dimension34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graphics24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension34);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    java.awt.event.WindowListener windowListener13 = null;
    froggerApp0.addWindowListener(windowListener13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.preferredSize();
    int i5 = froggerApp0.getY();
    java.awt.Event event6 = null;
    boolean b9 = froggerApp0.mouseDrag(event6, (int)' ', 128);
    java.util.List<java.awt.Image> list_image10 = froggerApp0.getIconImages();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_image10);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    int i4 = froggerApp0.getCursorType();
    java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListener_array5 = froggerApp0.getHierarchyBoundsListeners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyBoundsListener_array5);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    frogger.Hider hider2 = new frogger.Hider(1, 9);
    java.lang.String str3 = hider2.getMarker();
    int i4 = hider2.getX();
    hider2.act(1, 65535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "H"+ "'", str3.equals("H"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    int i18 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp13);
    boolean b19 = froggerApp0.isVisible();
    java.awt.Event event20 = null;
    boolean b23 = froggerApp0.mouseMove(event20, 7, (int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    java.awt.Shape shape12 = null;
    froggerApp0.setShape(shape12);
    froggerApp0.firePropertyChange("hi!", (byte)0, (byte)0);
    java.util.List<java.awt.Image> list_image18 = froggerApp0.getIconImages();
    int i19 = froggerApp0.getExtendedState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_image18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    java.awt.image.VolatileImage volatileImage7 = froggerApp0.createVolatileImage((int)'a', 9);
    java.awt.Dialog.ModalExclusionType modalExclusionType8 = froggerApp0.getModalExclusionType();
    javax.swing.JLayeredPane jLayeredPane9 = froggerApp0.getLayeredPane();
    java.awt.Dialog.ModalExclusionType modalExclusionType10 = froggerApp0.getModalExclusionType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage7);
    org.junit.Assert.assertTrue("'" + modalExclusionType8 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType8.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jLayeredPane9);
    org.junit.Assert.assertTrue("'" + modalExclusionType10 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType10.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension8 = froggerApp0.preferredSize();
    frogger.FroggerApp froggerApp9 = new frogger.FroggerApp();
    java.awt.Container container10 = froggerApp9.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array11 = froggerApp9.getHierarchyListeners();
    froggerApp9.nextFocus();
    java.awt.MenuBar menuBar13 = froggerApp9.getMenuBar();
    java.awt.Point point14 = froggerApp9.location();
    java.awt.Component component15 = froggerApp0.findComponentAt(point14);
    java.awt.event.ActionEvent actionEvent16 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.actionPerformed(actionEvent16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(menuBar13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(point14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component15);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    java.awt.Event event5 = null;
    frogger.FroggerApp froggerApp6 = new frogger.FroggerApp();
    java.awt.Container container7 = froggerApp6.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array8 = froggerApp6.getHierarchyListeners();
    froggerApp6.nextFocus();
    java.awt.Dimension dimension10 = froggerApp6.getMaximumSize();
    frogger.FroggerApp froggerApp11 = new frogger.FroggerApp();
    java.awt.Container container12 = froggerApp11.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array13 = froggerApp11.getHierarchyListeners();
    froggerApp11.nextFocus();
    java.awt.Dimension dimension15 = froggerApp11.getMaximumSize();
    froggerApp6.setMinimumSize(dimension15);
    boolean b17 = froggerApp6.isCursorSet();
    boolean b18 = froggerApp6.isForegroundSet();
    frogger.FroggerApp froggerApp19 = new frogger.FroggerApp();
    java.awt.Container container20 = froggerApp19.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array21 = froggerApp19.getHierarchyListeners();
    froggerApp19.nextFocus();
    java.awt.Dimension dimension23 = froggerApp19.getMaximumSize();
    int i24 = froggerApp6.getComponentZOrder((java.awt.Component)froggerApp19);
    java.awt.event.MouseMotionListener[] mouseMotionListener_array25 = froggerApp19.getMouseMotionListeners();
    java.awt.Dialog.ModalExclusionType modalExclusionType26 = froggerApp19.getModalExclusionType();
    froggerApp19.setCursor((int)(short)1);
    boolean b29 = froggerApp19.isFocusTraversalPolicySet();
    froggerApp19.removeAll();
    boolean b31 = froggerApp0.lostFocus(event5, (java.lang.Object)froggerApp19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseMotionListener_array25);
    org.junit.Assert.assertTrue("'" + modalExclusionType26 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType26.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    frogger.FroggerApp froggerApp2 = new frogger.FroggerApp();
    java.awt.Container container3 = froggerApp2.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array4 = froggerApp2.getHierarchyListeners();
    froggerApp2.nextFocus();
    java.awt.Dimension dimension6 = froggerApp2.getMaximumSize();
    frogger.FroggerApp froggerApp7 = new frogger.FroggerApp();
    java.awt.Container container8 = froggerApp7.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array9 = froggerApp7.getHierarchyListeners();
    froggerApp7.nextFocus();
    java.awt.Dimension dimension11 = froggerApp7.getMaximumSize();
    froggerApp2.setMinimumSize(dimension11);
    froggerApp0.setMinimumSize(dimension11);
    frogger.FroggerApp froggerApp14 = new frogger.FroggerApp();
    java.awt.Container container15 = froggerApp14.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array16 = froggerApp14.getHierarchyListeners();
    froggerApp14.nextFocus();
    java.awt.Dimension dimension18 = froggerApp14.getMaximumSize();
    java.awt.image.VolatileImage volatileImage21 = froggerApp14.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp22 = new frogger.FroggerApp();
    froggerApp22.addNotify();
    java.awt.Point point24 = froggerApp22.getMousePosition();
    int i25 = froggerApp0.checkImage((java.awt.Image)volatileImage21, (java.awt.image.ImageObserver)froggerApp22);
    froggerApp0.move((int)(short)-1, (int)'a');
    java.awt.Color color29 = froggerApp0.getForeground();
    boolean b30 = froggerApp0.isCursorSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(point24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    boolean b2 = froggerApp0.isCursorSet();
    java.awt.Rectangle rectangle3 = null;
    froggerApp0.setMaximizedBounds(rectangle3);
    java.awt.FocusTraversalPolicy focusTraversalPolicy5 = null;
    froggerApp0.setFocusTraversalPolicy(focusTraversalPolicy5);
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp0.getHierarchyListeners();
    boolean b8 = froggerApp0.isMaximumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    boolean b12 = froggerApp0.isForegroundSet();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    int i18 = froggerApp0.getComponentZOrder((java.awt.Component)froggerApp13);
    froggerApp0.enableInputMethods(false);
    froggerApp0.enableInputMethods(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array2 = froggerApp0.getMouseWheelListeners();
    java.awt.ComponentOrientation componentOrientation3 = froggerApp0.getComponentOrientation();
    java.awt.AWTEvent aWTEvent4 = null;
    // The following exception was thrown during execution in test generation
    try {
    froggerApp0.dispatchEvent(aWTEvent4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation3);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    java.awt.Shape shape12 = null;
    froggerApp0.setShape(shape12);
    boolean b14 = froggerApp0.isUndecorated();
    java.awt.Container container15 = froggerApp0.getContentPane();
    java.awt.Dimension dimension16 = froggerApp0.preferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(container15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension16);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    boolean b9 = froggerApp0.isValidateRoot();
    boolean b10 = froggerApp0.isResizable();
    froggerApp0.pack();
    javax.accessibility.AccessibleContext accessibleContext12 = froggerApp0.getAccessibleContext();
    frogger.FroggerApp froggerApp13 = new frogger.FroggerApp();
    java.awt.Container container14 = froggerApp13.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array15 = froggerApp13.getHierarchyListeners();
    froggerApp13.nextFocus();
    java.awt.Dimension dimension17 = froggerApp13.getMaximumSize();
    frogger.FroggerApp froggerApp18 = new frogger.FroggerApp();
    java.awt.Container container19 = froggerApp18.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array20 = froggerApp18.getHierarchyListeners();
    froggerApp18.nextFocus();
    java.awt.Dimension dimension22 = froggerApp18.getMaximumSize();
    froggerApp13.setMinimumSize(dimension22);
    boolean b24 = froggerApp13.isCursorSet();
    java.awt.Shape shape25 = null;
    froggerApp13.setShape(shape25);
    froggerApp13.firePropertyChange("hi!", (byte)0, (byte)0);
    java.util.List<java.awt.Image> list_image31 = froggerApp13.getIconImages();
    frogger.FroggerApp froggerApp32 = new frogger.FroggerApp();
    java.awt.Container container33 = froggerApp32.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array34 = froggerApp32.getHierarchyListeners();
    froggerApp32.nextFocus();
    java.awt.Dimension dimension36 = froggerApp32.getMaximumSize();
    frogger.FroggerApp froggerApp37 = new frogger.FroggerApp();
    java.awt.Container container38 = froggerApp37.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array39 = froggerApp37.getHierarchyListeners();
    froggerApp37.nextFocus();
    java.awt.Dimension dimension41 = froggerApp37.getMaximumSize();
    froggerApp32.setMinimumSize(dimension41);
    boolean b43 = froggerApp32.isCursorSet();
    java.awt.Shape shape44 = null;
    froggerApp32.setShape(shape44);
    froggerApp32.firePropertyChange("hi!", (byte)0, (byte)0);
    java.util.List<java.awt.Image> list_image50 = froggerApp32.getIconImages();
    froggerApp13.setIconImages(list_image50);
    froggerApp0.setIconImages(list_image50);
    java.awt.Event event53 = null;
    boolean b56 = froggerApp0.mouseMove(event53, (int)(byte)-1, 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_image31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_image50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    java.awt.image.VolatileImage volatileImage7 = froggerApp0.createVolatileImage((int)'a', 9);
    frogger.FroggerApp froggerApp8 = new frogger.FroggerApp();
    java.awt.Container container9 = froggerApp8.getParent();
    froggerApp8.repaint((long)5, 2, 1, 128, 11);
    java.awt.Dimension dimension16 = froggerApp8.preferredSize();
    froggerApp8.toBack();
    frogger.FroggerApp froggerApp18 = new frogger.FroggerApp();
    java.awt.Container container19 = froggerApp18.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array20 = froggerApp18.getHierarchyListeners();
    froggerApp18.nextFocus();
    froggerApp18.repaint();
    frogger.FroggerApp froggerApp23 = new frogger.FroggerApp();
    froggerApp23.addNotify();
    boolean b25 = froggerApp23.isCursorSet();
    java.awt.Graphics graphics26 = froggerApp23.getGraphics();
    froggerApp18.update(graphics26);
    froggerApp8.paintComponents(graphics26);
    froggerApp0.printAll(graphics26);
    froggerApp0.hide();
    java.awt.Component component31 = froggerApp0.getFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(volatileImage7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(graphics26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component31);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array2 = froggerApp0.getHierarchyListeners();
    froggerApp0.nextFocus();
    java.awt.Dimension dimension4 = froggerApp0.getMaximumSize();
    frogger.FroggerApp froggerApp5 = new frogger.FroggerApp();
    java.awt.Container container6 = froggerApp5.getParent();
    java.awt.event.HierarchyListener[] hierarchyListener_array7 = froggerApp5.getHierarchyListeners();
    froggerApp5.nextFocus();
    java.awt.Dimension dimension9 = froggerApp5.getMaximumSize();
    froggerApp0.setMinimumSize(dimension9);
    boolean b11 = froggerApp0.isCursorSet();
    java.awt.Shape shape12 = null;
    froggerApp0.setShape(shape12);
    int i14 = froggerApp0.getHeight();
    java.awt.event.FocusListener[] focusListener_array15 = froggerApp0.getFocusListeners();
    java.awt.MenuComponent menuComponent16 = null;
    froggerApp0.remove(menuComponent16);
    java.awt.Event event18 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b19 = froggerApp0.postEvent(event18);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 65535);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array15);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    java.awt.Container container1 = froggerApp0.getParent();
    froggerApp0.repaint((long)5, 2, 1, 128, 11);
    boolean b8 = froggerApp0.getIgnoreRepaint();
    froggerApp0.setFocusCycleRoot(false);
    boolean b11 = froggerApp0.isFocusableWindow();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(container1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    frogger.FroggerApp froggerApp0 = new frogger.FroggerApp();
    froggerApp0.addNotify();
    java.awt.event.MouseWheelListener[] mouseWheelListener_array2 = froggerApp0.getMouseWheelListeners();
    java.awt.ComponentOrientation componentOrientation3 = froggerApp0.getComponentOrientation();
    boolean b4 = froggerApp0.isFocusableWindow();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mouseWheelListener_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(componentOrientation3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

}
