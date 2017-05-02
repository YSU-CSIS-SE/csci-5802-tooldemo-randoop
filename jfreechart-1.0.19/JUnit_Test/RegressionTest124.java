
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest124 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest124.test1"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer0 = new org.jfree.ui.DateCellRenderer();
    int i1 = dateCellRenderer0.getDisplayedMnemonic();
    dateCellRenderer0.validate();
    javax.swing.Icon icon3 = dateCellRenderer0.getDisabledIcon();
    java.lang.String str4 = dateCellRenderer0.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(icon3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "LabelUI"+ "'", str4.equals("LabelUI"));

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest124.test2"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    boolean b3 = serialDateChooserPanel2.getIgnoreRepaint();
    serialDateChooserPanel2.resize(8, (int)(short)-1);
    serialDateChooserPanel2.firePropertyChange("Jan", ' ', ' ');
    java.io.PrintWriter printWriter11 = null;
    // The following exception was thrown during execution in test generation
    try {
    serialDateChooserPanel2.list(printWriter11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest124.test3"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    java.awt.Rectangle rectangle2 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle3 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b4 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle2, (java.awt.geom.Rectangle2D)rectangle3);
    rectangleInsets1.trim((java.awt.geom.Rectangle2D)rectangle3);
    double d6 = rectangleInsets1.getLeft();
    org.jfree.date.SerialDate serialDate7 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel9 = new org.jfree.ui.SerialDateChooserPanel(serialDate7, true);
    java.awt.Color color10 = serialDateChooserPanel9.getForeground();
    java.awt.Event event11 = null;
    boolean b14 = serialDateChooserPanel9.mouseUp(event11, (int)(byte)10, (int)(short)100);
    org.jfree.date.SerialDate serialDate15 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel17 = new org.jfree.ui.SerialDateChooserPanel(serialDate15, true);
    boolean b18 = serialDateChooserPanel17.getIgnoreRepaint();
    javax.swing.InputMap inputMap19 = serialDateChooserPanel17.getInputMap();
    java.awt.Dimension dimension20 = serialDateChooserPanel17.getMaximumSize();
    serialDateChooserPanel9.setMinimumSize(dimension20);
    org.jfree.date.SerialDate serialDate22 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel24 = new org.jfree.ui.SerialDateChooserPanel(serialDate22, true);
    serialDateChooserPanel24.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    boolean b29 = serialDateChooserPanel24.isFocusTraversable();
    java.awt.Image image30 = null;
    org.jfree.date.SerialDate serialDate31 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel33 = new org.jfree.ui.SerialDateChooserPanel(serialDate31, true);
    boolean b34 = serialDateChooserPanel33.getIgnoreRepaint();
    boolean b35 = serialDateChooserPanel33.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array36 = serialDateChooserPanel33.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate37 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel39 = new org.jfree.ui.SerialDateChooserPanel(serialDate37, true);
    boolean b40 = serialDateChooserPanel39.getIgnoreRepaint();
    serialDateChooserPanel39.setAlignmentX((float)(byte)10);
    java.awt.Component component43 = serialDateChooserPanel33.add((java.awt.Component)serialDateChooserPanel39);
    java.lang.String str44 = serialDateChooserPanel39.getUIClassID();
    boolean b45 = serialDateChooserPanel39.isBackgroundSet();
    int i46 = serialDateChooserPanel24.checkImage(image30, (java.awt.image.ImageObserver)serialDateChooserPanel39);
    java.lang.Object obj47 = serialDateChooserPanel9.getClientProperty((java.lang.Object)serialDateChooserPanel39);
    org.jfree.text.TextBox textBox48 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets49 = textBox48.getInteriorGap();
    org.jfree.date.SerialDate serialDate50 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel52 = new org.jfree.ui.SerialDateChooserPanel(serialDate50, true);
    java.beans.VetoableChangeListener vetoableChangeListener53 = null;
    serialDateChooserPanel52.removeVetoableChangeListener(vetoableChangeListener53);
    java.awt.Event event55 = null;
    org.jfree.date.SerialDate serialDate56 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel58 = new org.jfree.ui.SerialDateChooserPanel(serialDate56, true);
    boolean b59 = serialDateChooserPanel58.getIgnoreRepaint();
    javax.swing.InputMap inputMap60 = serialDateChooserPanel58.getInputMap();
    java.awt.Rectangle rectangle61 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle62 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b63 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle61, (java.awt.geom.Rectangle2D)rectangle62);
    java.awt.Rectangle rectangle64 = serialDateChooserPanel58.getBounds(rectangle62);
    org.jfree.date.SerialDate serialDate65 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel67 = new org.jfree.ui.SerialDateChooserPanel(serialDate65, true);
    boolean b68 = serialDateChooserPanel67.getIgnoreRepaint();
    java.awt.Rectangle rectangle69 = serialDateChooserPanel67.getVisibleRect();
    boolean b70 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle62, (java.awt.Shape)rectangle69);
    boolean b71 = serialDateChooserPanel52.lostFocus(event55, (java.lang.Object)rectangle69);
    java.awt.geom.Rectangle2D rectangle2D74 = rectangleInsets49.createOutsetRectangle((java.awt.geom.Rectangle2D)rectangle69, false, true);
    serialDateChooserPanel39.repaint(rectangle69);
    java.awt.geom.Rectangle2D rectangle2D78 = rectangleInsets1.createInsetRectangle((java.awt.geom.Rectangle2D)rectangle69, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "PanelUI"+ "'", str44.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D78);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest124.test4"); }

    org.jfree.date.SpreadsheetDate spreadsheetDate1 = new org.jfree.date.SpreadsheetDate(16);
    java.util.Date date2 = spreadsheetDate1.toDate();
    org.jfree.date.SerialDate serialDate5 = org.jfree.date.SerialDate.createInstance(5);
    org.jfree.date.SerialDate serialDate6 = org.jfree.date.SerialDate.addDays((int)(short)1, serialDate5);
    org.jfree.date.SerialDate serialDate8 = org.jfree.date.SerialDate.createInstance(5);
    boolean b9 = org.jfree.date.SerialDateUtilities.isLastDayOfFebruary(serialDate8);
    int i10 = org.jfree.date.SerialDateUtilities.dayCount30PSA(serialDate5, serialDate8);
    org.jfree.date.SerialDate serialDate13 = org.jfree.date.SerialDate.createInstance(5);
    boolean b14 = org.jfree.date.SerialDateUtilities.isLastDayOfFebruary(serialDate13);
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel16 = new org.jfree.ui.SerialDateChooserPanel(serialDate13, true);
    org.jfree.date.SerialDate serialDate17 = org.jfree.date.SerialDate.addYears(16, serialDate13);
    org.jfree.date.SerialDate serialDate18 = serialDate8.getEndOfCurrentMonth(serialDate17);
    org.jfree.date.SpreadsheetDate spreadsheetDate20 = new org.jfree.date.SpreadsheetDate(16);
    boolean b21 = spreadsheetDate1.isInRange(serialDate8, (org.jfree.date.SerialDate)spreadsheetDate20);
    org.jfree.date.SerialDate serialDate23 = spreadsheetDate20.getPreviousDayOfWeek(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(date2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(serialDate23);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest124.test5"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener2 = null;
    applicationFrame1.removeWindowStateListener(windowStateListener2);
    java.awt.Cursor cursor4 = null;
    applicationFrame1.setCursor(cursor4);
    boolean b6 = applicationFrame1.isAlwaysOnTopSupported();
    java.awt.Graphics graphics7 = null;
    applicationFrame1.paint(graphics7);
    java.awt.Event event9 = null;
    boolean b12 = applicationFrame1.mouseMove(event9, 10, 8);
    org.jfree.ui.ApplicationFrame applicationFrame14 = new org.jfree.ui.ApplicationFrame("");
    int i15 = applicationFrame14.getState();
    java.awt.event.WindowEvent windowEvent16 = null;
    applicationFrame14.windowIconified(windowEvent16);
    org.jfree.date.SerialDate serialDate18 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel20 = new org.jfree.ui.SerialDateChooserPanel(serialDate18, true);
    serialDateChooserPanel20.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext25 = serialDateChooserPanel20.getAccessibleContext();
    java.awt.Dimension dimension26 = serialDateChooserPanel20.getPreferredSize();
    org.jfree.date.SerialDate serialDate28 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel30 = new org.jfree.ui.SerialDateChooserPanel(serialDate28, true);
    boolean b31 = serialDateChooserPanel30.getIgnoreRepaint();
    javax.swing.InputMap inputMap32 = serialDateChooserPanel30.getInputMap();
    serialDateChooserPanel20.setInputMap((int)(byte)1, inputMap32);
    java.awt.event.FocusListener[] focusListener_array34 = serialDateChooserPanel20.getFocusListeners();
    applicationFrame14.remove((java.awt.Component)serialDateChooserPanel20);
    java.awt.Dimension dimension36 = serialDateChooserPanel20.getPreferredSize();
    java.awt.Dimension dimension37 = applicationFrame1.getSize(dimension36);
    applicationFrame1.setFocusCycleRoot(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension37);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest124.test6"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    serialDateChooserPanel2.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext7 = serialDateChooserPanel2.getAccessibleContext();
    java.awt.Dimension dimension8 = serialDateChooserPanel2.getPreferredSize();
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel12 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    boolean b13 = serialDateChooserPanel12.getIgnoreRepaint();
    javax.swing.InputMap inputMap14 = serialDateChooserPanel12.getInputMap();
    serialDateChooserPanel2.setInputMap((int)(byte)1, inputMap14);
    java.awt.event.FocusListener[] focusListener_array16 = serialDateChooserPanel2.getFocusListeners();
    org.jfree.ui.ApplicationFrame applicationFrame18 = new org.jfree.ui.ApplicationFrame("");
    int i19 = applicationFrame18.getState();
    java.awt.event.WindowEvent windowEvent20 = null;
    applicationFrame18.windowIconified(windowEvent20);
    applicationFrame18.show();
    javax.swing.JMenuBar jMenuBar23 = applicationFrame18.getJMenuBar();
    java.awt.event.WindowStateListener[] windowStateListener_array24 = applicationFrame18.getWindowStateListeners();
    org.jfree.ui.KeyedComboBoxModel keyedComboBoxModel25 = new org.jfree.ui.KeyedComboBoxModel((java.lang.Object[])focusListener_array16, (java.lang.Object[])windowStateListener_array24);
    org.jfree.ui.ApplicationFrame applicationFrame27 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener28 = null;
    applicationFrame27.removeWindowStateListener(windowStateListener28);
    boolean b30 = applicationFrame27.isValidateRoot();
    org.jfree.date.SerialDate serialDate31 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel33 = new org.jfree.ui.SerialDateChooserPanel(serialDate31, true);
    boolean b34 = serialDateChooserPanel33.getIgnoreRepaint();
    javax.swing.InputMap inputMap35 = serialDateChooserPanel33.getInputMap();
    java.awt.Rectangle rectangle36 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle37 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b38 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle36, (java.awt.geom.Rectangle2D)rectangle37);
    java.awt.Rectangle rectangle39 = serialDateChooserPanel33.getBounds(rectangle37);
    org.jfree.date.SerialDate serialDate40 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel42 = new org.jfree.ui.SerialDateChooserPanel(serialDate40, true);
    boolean b43 = serialDateChooserPanel42.getIgnoreRepaint();
    java.awt.Rectangle rectangle44 = serialDateChooserPanel42.getVisibleRect();
    boolean b45 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle37, (java.awt.Shape)rectangle44);
    applicationFrame27.setMaximizedBounds(rectangle37);
    javax.accessibility.AccessibleContext accessibleContext47 = applicationFrame27.getAccessibleContext();
    java.awt.event.WindowEvent windowEvent48 = null;
    applicationFrame27.windowDeiconified(windowEvent48);
    org.jfree.text.TextBox textBox50 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets51 = textBox50.getInteriorGap();
    java.awt.Rectangle rectangle52 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle53 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b54 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle52, (java.awt.geom.Rectangle2D)rectangle53);
    rectangleInsets51.trim((java.awt.geom.Rectangle2D)rectangle53);
    double d56 = rectangleInsets51.getLeft();
    org.jfree.text.TextBox textBox57 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets58 = textBox57.getInteriorGap();
    java.awt.Rectangle rectangle59 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle60 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b61 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle59, (java.awt.geom.Rectangle2D)rectangle60);
    rectangleInsets58.trim((java.awt.geom.Rectangle2D)rectangle60);
    rectangleInsets51.trim((java.awt.geom.Rectangle2D)rectangle60);
    applicationFrame27.setBounds(rectangle60);
    java.awt.Font font66 = org.jfree.text.TextFragment.DEFAULT_FONT;
    org.jfree.text.TextFragment textFragment68 = new org.jfree.text.TextFragment("PanelUI");
    java.awt.Paint paint69 = textFragment68.getPaint();
    org.jfree.text.TextFragment textFragment70 = new org.jfree.text.TextFragment("org.jfree.ui.SerialDateChooserPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", font66, paint69);
    keyedComboBoxModel25.add((java.lang.Object)rectangle60, (java.lang.Object)font66);
    org.jfree.date.SerialDate serialDate72 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel74 = new org.jfree.ui.SerialDateChooserPanel(serialDate72, true);
    boolean b75 = serialDateChooserPanel74.getIgnoreRepaint();
    boolean b76 = serialDateChooserPanel74.isCursorSet();
    java.beans.PropertyChangeListener[] propertyChangeListener_array77 = serialDateChooserPanel74.getPropertyChangeListeners();
    org.jfree.date.SerialDate serialDate78 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel80 = new org.jfree.ui.SerialDateChooserPanel(serialDate78, true);
    boolean b81 = serialDateChooserPanel80.getIgnoreRepaint();
    serialDateChooserPanel80.setAlignmentX((float)(byte)10);
    java.awt.Component component84 = serialDateChooserPanel74.add((java.awt.Component)serialDateChooserPanel80);
    java.lang.String str85 = serialDateChooserPanel80.getUIClassID();
    keyedComboBoxModel25.removeDataElement((java.lang.Object)str85);
    java.lang.Object obj87 = keyedComboBoxModel25.getSelectedKey();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(jMenuBar23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowStateListener_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d56 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(font66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(propertyChangeListener_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(component84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + "PanelUI"+ "'", str85.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj87);

  }

}
