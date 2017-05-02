
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest117 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest117.test01"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    int i2 = applicationFrame1.getState();
    applicationFrame1.setLocationByPlatform(false);
    int i5 = applicationFrame1.getExtendedState();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest117.test02"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    java.awt.Rectangle rectangle2 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle3 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b4 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle2, (java.awt.geom.Rectangle2D)rectangle3);
    rectangleInsets1.trim((java.awt.geom.Rectangle2D)rectangle3);
    org.jfree.text.TextBox textBox6 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets7 = textBox6.getInteriorGap();
    java.awt.Rectangle rectangle8 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle9 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b10 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle8, (java.awt.geom.Rectangle2D)rectangle9);
    rectangleInsets7.trim((java.awt.geom.Rectangle2D)rectangle9);
    org.jfree.date.SerialDate serialDate12 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel14 = new org.jfree.ui.SerialDateChooserPanel(serialDate12, true);
    boolean b15 = serialDateChooserPanel14.getIgnoreRepaint();
    javax.swing.InputMap inputMap16 = serialDateChooserPanel14.getInputMap();
    java.awt.Rectangle rectangle17 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle18 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b19 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle17, (java.awt.geom.Rectangle2D)rectangle18);
    java.awt.Rectangle rectangle20 = serialDateChooserPanel14.getBounds(rectangle18);
    java.awt.geom.Rectangle2D rectangle2D23 = rectangleInsets7.createInsetRectangle((java.awt.geom.Rectangle2D)rectangle20, false, true);
    org.jfree.ui.ApplicationFrame applicationFrame25 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent26 = null;
    applicationFrame25.windowDeiconified(windowEvent26);
    java.awt.LayoutManager layoutManager28 = null;
    applicationFrame25.setLayout(layoutManager28);
    java.beans.PropertyChangeListener propertyChangeListener30 = null;
    applicationFrame25.removePropertyChangeListener(propertyChangeListener30);
    java.awt.Image image32 = null;
    org.jfree.ui.DateCellRenderer dateCellRenderer33 = new org.jfree.ui.DateCellRenderer();
    int i34 = dateCellRenderer33.getDisplayedMnemonic();
    dateCellRenderer33.validate();
    int i36 = applicationFrame25.checkImage(image32, (java.awt.image.ImageObserver)dateCellRenderer33);
    dateCellRenderer33.updateUI();
    boolean b38 = rectangleInsets7.equals((java.lang.Object)dateCellRenderer33);
    org.jfree.date.SerialDate serialDate39 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel41 = new org.jfree.ui.SerialDateChooserPanel(serialDate39, true);
    boolean b42 = serialDateChooserPanel41.getIgnoreRepaint();
    javax.swing.InputMap inputMap43 = serialDateChooserPanel41.getInputMap();
    java.awt.Rectangle rectangle44 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle45 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b46 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle44, (java.awt.geom.Rectangle2D)rectangle45);
    java.awt.Rectangle rectangle47 = serialDateChooserPanel41.getBounds(rectangle45);
    java.awt.geom.Rectangle2D rectangle2D50 = rectangleInsets7.createOutsetRectangle((java.awt.geom.Rectangle2D)rectangle45, true, true);
    org.jfree.ui.Align.align((java.awt.geom.Rectangle2D)rectangle3, (java.awt.geom.Rectangle2D)rectangle45, (-458));
    org.jfree.text.TextBox textBox53 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets54 = textBox53.getInteriorGap();
    java.awt.Rectangle rectangle55 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle56 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b57 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle55, (java.awt.geom.Rectangle2D)rectangle56);
    rectangleInsets54.trim((java.awt.geom.Rectangle2D)rectangle56);
    double d59 = rectangleInsets54.getLeft();
    org.jfree.text.TextBox textBox60 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets61 = textBox60.getInteriorGap();
    java.awt.Rectangle rectangle62 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle63 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b64 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle62, (java.awt.geom.Rectangle2D)rectangle63);
    rectangleInsets61.trim((java.awt.geom.Rectangle2D)rectangle63);
    rectangleInsets54.trim((java.awt.geom.Rectangle2D)rectangle63);
    boolean b67 = org.jfree.util.ShapeUtilities.equal((java.awt.Shape)rectangle3, (java.awt.Shape)rectangle63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d59 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangleInsets61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest117.test03"); }

    org.jfree.ui.ApplicationFrame applicationFrame1 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowEvent windowEvent2 = null;
    applicationFrame1.windowDeiconified(windowEvent2);
    applicationFrame1.firePropertyChange("hi!", '#', '4');
    boolean b8 = applicationFrame1.isFocusableWindow();
    applicationFrame1.setFocusableWindowState(false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest117.test04"); }

    org.jfree.ui.DateCellRenderer dateCellRenderer1 = new org.jfree.ui.DateCellRenderer();
    dateCellRenderer1.setIconTextGap(5);
    dateCellRenderer1.validate();
    boolean b5 = dateCellRenderer1.isEnabled();
    dateCellRenderer1.validate();
    org.jfree.date.DayOfWeekInMonthRule dayOfWeekInMonthRule7 = new org.jfree.date.DayOfWeekInMonthRule();
    int i8 = dayOfWeekInMonthRule7.getCount();
    int i9 = dayOfWeekInMonthRule7.getCount();
    org.jfree.date.RelativeDayOfWeekRule relativeDayOfWeekRule12 = new org.jfree.date.RelativeDayOfWeekRule((org.jfree.date.AnnualDateRule)dayOfWeekInMonthRule7, 12, (-1));
    org.jfree.date.AnnualDateRule annualDateRule13 = relativeDayOfWeekRule12.getSubrule();
    int i14 = relativeDayOfWeekRule12.getDayOfWeek();
    relativeDayOfWeekRule12.setRelative(31);
    org.jfree.ui.L1R1ButtonPanel l1R1ButtonPanel19 = new org.jfree.ui.L1R1ButtonPanel("ToolTipText", "");
    org.jfree.util.Log.SimpleMessage simpleMessage20 = new org.jfree.util.Log.SimpleMessage("org.jfree.base.BaseBoot", (java.lang.Object)dateCellRenderer1, (java.lang.Object)relativeDayOfWeekRule12, (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(annualDateRule13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 12);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest117.test05"); }

    org.jfree.date.SerialDate serialDate0 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel2 = new org.jfree.ui.SerialDateChooserPanel(serialDate0, true);
    java.awt.Color color3 = serialDateChooserPanel2.getForeground();
    org.jfree.ui.ApplicationFrame applicationFrame5 = new org.jfree.ui.ApplicationFrame("");
    java.awt.event.WindowStateListener windowStateListener6 = null;
    applicationFrame5.removeWindowStateListener(windowStateListener6);
    applicationFrame5.setCursor(0);
    org.jfree.date.SerialDate serialDate10 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel12 = new org.jfree.ui.SerialDateChooserPanel(serialDate10, true);
    java.awt.Color color13 = serialDateChooserPanel12.getForeground();
    applicationFrame5.setBackground(color13);
    boolean b15 = org.jfree.util.PaintUtilities.equal((java.awt.Paint)color3, (java.awt.Paint)color13);
    org.jfree.ui.PaintSample paintSample16 = new org.jfree.ui.PaintSample((java.awt.Paint)color13);
    java.awt.event.ComponentListener componentListener17 = null;
    paintSample16.addComponentListener(componentListener17);
    java.awt.Paint paint19 = paintSample16.getPaint();
    java.lang.String str20 = paintSample16.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(color13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(paint19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "org.jfree.ui.PaintSample[,0,0,0str20,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]"+ "'", str20.equals("org.jfree.ui.PaintSample[,0,0,0str20,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]"));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest117.test06"); }

    org.jfree.base.config.ModifiableConfiguration modifiableConfiguration0 = org.jfree.base.BaseBoot.getConfiguration();
    org.jfree.util.ExtendedConfigurationWrapper extendedConfigurationWrapper1 = new org.jfree.util.ExtendedConfigurationWrapper((org.jfree.util.Configuration)modifiableConfiguration0);
    boolean b3 = extendedConfigurationWrapper1.getBoolProperty("black");
    java.lang.String str6 = extendedConfigurationWrapper1.getConfigProperty("section", "RectangleAnchor.TOP_LEFT");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(modifiableConfiguration0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "RectangleAnchor.TOP_LEFT"+ "'", str6.equals("RectangleAnchor.TOP_LEFT"));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest117.test07"); }

    java.awt.Image image0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.jfree.util.WaitingImageObserver waitingImageObserver1 = new org.jfree.util.WaitingImageObserver(image0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest117.test08"); }

    org.jfree.text.TextBox textBox0 = new org.jfree.text.TextBox();
    org.jfree.ui.RectangleInsets rectangleInsets1 = textBox0.getInteriorGap();
    java.awt.Rectangle rectangle2 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    java.awt.Rectangle rectangle3 = org.jfree.ui.RefineryUtilities.getMaximumWindowBounds();
    boolean b4 = org.jfree.util.ShapeUtilities.intersects((java.awt.geom.Rectangle2D)rectangle2, (java.awt.geom.Rectangle2D)rectangle3);
    rectangleInsets1.trim((java.awt.geom.Rectangle2D)rectangle3);
    double d6 = rectangleInsets1.getLeft();
    org.jfree.ui.ApplicationFrame applicationFrame8 = new org.jfree.ui.ApplicationFrame("");
    java.awt.Rectangle rectangle9 = applicationFrame8.getMaximizedBounds();
    java.awt.event.MouseWheelListener mouseWheelListener10 = null;
    applicationFrame8.removeMouseWheelListener(mouseWheelListener10);
    applicationFrame8.setAutoRequestFocus(true);
    java.awt.event.KeyListener keyListener14 = null;
    applicationFrame8.addKeyListener(keyListener14);
    java.awt.Rectangle rectangle16 = applicationFrame8.bounds();
    java.awt.geom.Rectangle2D rectangle2D17 = rectangleInsets1.createInsetRectangle((java.awt.geom.Rectangle2D)rectangle16);
    double d19 = rectangleInsets1.calculateRightInset((double)10L);
    
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
    org.junit.Assert.assertNull(rectangle9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(rectangle2D17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 3.0d);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest117.test09"); }

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
    boolean b14 = serialDateChooserPanel8.isBackgroundSet();
    java.awt.event.FocusListener focusListener15 = null;
    serialDateChooserPanel8.addFocusListener(focusListener15);
    org.jfree.ui.ApplicationFrame applicationFrame18 = new org.jfree.ui.ApplicationFrame("");
    int i19 = applicationFrame18.getState();
    java.awt.event.WindowEvent windowEvent20 = null;
    applicationFrame18.windowIconified(windowEvent20);
    org.jfree.date.SerialDate serialDate22 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel24 = new org.jfree.ui.SerialDateChooserPanel(serialDate22, true);
    serialDateChooserPanel24.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext29 = serialDateChooserPanel24.getAccessibleContext();
    java.awt.Dimension dimension30 = serialDateChooserPanel24.getPreferredSize();
    org.jfree.date.SerialDate serialDate32 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel34 = new org.jfree.ui.SerialDateChooserPanel(serialDate32, true);
    boolean b35 = serialDateChooserPanel34.getIgnoreRepaint();
    javax.swing.InputMap inputMap36 = serialDateChooserPanel34.getInputMap();
    serialDateChooserPanel24.setInputMap((int)(byte)1, inputMap36);
    java.awt.event.FocusListener[] focusListener_array38 = serialDateChooserPanel24.getFocusListeners();
    applicationFrame18.remove((java.awt.Component)serialDateChooserPanel24);
    java.awt.Event event40 = null;
    boolean b43 = applicationFrame18.mouseUp(event40, (int)(short)10, (int)'#');
    applicationFrame18.setExtendedState(4);
    javax.swing.JRootPane jRootPane46 = applicationFrame18.getRootPane();
    boolean b47 = applicationFrame18.isOpaque();
    java.awt.event.WindowListener[] windowListener_array48 = applicationFrame18.getWindowListeners();
    org.jfree.util.LogContext logContext50 = new org.jfree.util.LogContext("NO_CHANGE");
    org.jfree.ui.ApplicationFrame applicationFrame52 = new org.jfree.ui.ApplicationFrame("");
    int i53 = applicationFrame52.getState();
    java.util.Locale locale54 = applicationFrame52.getLocale();
    applicationFrame52.transferFocusUpCycle();
    java.awt.Component component56 = applicationFrame52.getFocusOwner();
    logContext50.debug((java.lang.Object)applicationFrame52);
    org.jfree.date.SerialDate serialDate58 = null;
    org.jfree.ui.SerialDateChooserPanel serialDateChooserPanel60 = new org.jfree.ui.SerialDateChooserPanel(serialDate58, true);
    serialDateChooserPanel60.firePropertyChange("notify-field-accept", (short)0, (short)(byte)0);
    javax.accessibility.AccessibleContext accessibleContext65 = serialDateChooserPanel60.getAccessibleContext();
    serialDateChooserPanel60.invalidate();
    serialDateChooserPanel60.grabFocus();
    java.awt.event.HierarchyListener[] hierarchyListener_array68 = serialDateChooserPanel60.getHierarchyListeners();
    logContext50.info((java.lang.Object)serialDateChooserPanel60);
    // The following exception was thrown during execution in test generation
    try {
    serialDateChooserPanel8.add((java.awt.Component)applicationFrame18, (java.lang.Object)serialDateChooserPanel60);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dimension30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputMap36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(focusListener_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(jRootPane46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(windowListener_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(locale54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(component56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hierarchyListener_array68);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest117.test10"); }

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
    javax.swing.text.NavigationFilter navigationFilter63 = fontDisplayField62.getNavigationFilter();
    javax.accessibility.AccessibleContext accessibleContext64 = fontDisplayField62.getAccessibleContext();
    java.awt.event.MouseEvent mouseEvent65 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str66 = fontDisplayField62.getToolTipText(mouseEvent65);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
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
    org.junit.Assert.assertNull(navigationFilter63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(accessibleContext64);

  }

}
