import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Vector;

public final class jsx11
  extends Applet
  implements Runnable
{
  private Dimension d;
  private Thread z8;
  private Image z5;
  private boolean z2 = false;
  private boolean z1 = false;
  private String s_message = "";
  private jsx11a z4;
  private jsx11d z6;
  private Vector z9;
  private Frame fr;
  private boolean z0;
  private jsx11g z3;
  boolean q5 = false;
  char[] q102 = { '{', '}', '+', ',' };
  private final int z7 = 200;
  
  public void init()
  {
    setLayout(null);
    this.d = size();
    try
    {
      this.fr = ((Frame)getParent());
    }
    catch (Exception localException) {}
    this.z0 = ((!System.getProperty("java.version").substring(0, 3).equals("1.0")) && (this.fr != null));
  }
  
  public String getAppletInfo()
  {
    return "Java Site Explorer 1.1 build 001\r\n(c) Java hermit\r\nwww.celticedge.com/hermit";
  }
  
  private void z11(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      z10("initialising...");
      Object localObject;
      if (this.z5 != null)
      {
        Graphics localGraphics = this.z5.getGraphics();
        localGraphics.setColor(this.z4.q13[0]);
        localGraphics.fillRect(0, 0, this.d.width, this.d.height);
        localObject = this.z4.q17[1];
        if (localObject != null)
        {
          int k = this.z4.q18[16];
          int m = this.z4.q18[17];
          switch (this.z4.q18[7])
          {
          case 0: 
            localGraphics.drawImage((Image)localObject, 0, 0, null);
            break;
          case 1: 
            localGraphics.drawImage((Image)localObject, (this.d.width - k) / 2, (this.d.height - m) / 2, null);
            break;
          case 2: 
            int n = -this.z4.q18[12];
            while (n < this.d.height)
            {
              int i1 = -this.z4.q18[13];
              while (i1 < this.d.width)
              {
                localGraphics.drawImage((Image)localObject, i1, n, null);
                i1 += k;
              }
              n += m;
            }
          }
        }
        localGraphics.dispose();
      }
      this.z3 = new jsx11g(this.z4, this.d.width);
      add(this.z3);
      this.z3.hide();
      int i = this.z4.q18[22];
      Rectangle localRectangle = this.z4.q19[1];
      if ((i > 0) && (localRectangle.width > 0) && (localRectangle.height > 0))
      {
        this.z6 = new jsx11d(this, this.z4, localRectangle);
        add(this.z6);
        this.z6.q91();
      }
      i = this.z4.q18[20];
      localRectangle = this.z4.q19[0];
      if ((i > 1) && (localRectangle.width > 0) && (localRectangle.height > 0))
      {
        this.z9 = new Vector(i);
        for (int j = 0; j < i; j++)
        {
          localObject = new jsx11c(this, this.z4, localRectangle, j);
          this.z9.addElement(localObject);
          add((Component)localObject);
          ((jsx11c)localObject).q89();
        }
      }
      this.z1 = true;
      repaint();
      return;
    }
    z10("applet error");
  }
  
  private void z10(String paramString)
  {
    this.s_message = paramString;
    repaint();
  }
  
  public void start()
  {
    z10("applet loading...");
    this.z2 = true;
    (this.z8 = new Thread(this)).start();
  }
  
  public void stop()
  {
    this.z2 = false;
  }
  
  public void run()
  {
    if (!this.z1)
    {
      if (this.z5 == null) {
        this.z5 = createImage(this.d.width, this.d.height);
      }
      this.z4 = new jsx11a(this);
      try
      {
        z11(this.z4.q0());
      }
      catch (Exception localException1) {}
    }
    while (this.z2) {
      try
      {
        Thread.sleep(200L);
        if (this.z1)
        {
          this.z6.q101();
          for (int i = 0; i < this.z9.size(); i++) {
            ((jsx11c)this.z9.elementAt(i)).q101();
          }
        }
      }
      catch (Exception localException2) {}
    }
  }
  
  public final void paint(Graphics paramGraphics)
  {
    if (!this.z1)
    {
      paramGraphics.setColor(Color.white);
      paramGraphics.fillRect(0, 0, this.d.width, this.d.height);
      paramGraphics.setColor(Color.black);
      paramGraphics.drawRect(0, 0, this.d.width - 1, this.d.height - 1);
      paramGraphics.drawString(this.s_message, 8, 16);
      return;
    }
    if (this.z5 != null) {
      paramGraphics.drawImage(this.z5, 0, 0, null);
    }
  }
  
  public final void update(Graphics paramGraphics)
  {
    paint(paramGraphics);
  }
  
  Image q2()
  {
    return this.z5;
  }
  
  void q3(boolean paramBoolean)
  {
    if (this.z0) {
      this.fr.setCursor(paramBoolean ? 12 : 0);
    }
  }
  
  void q1(Object paramObject1, Object paramObject2, int paramInt1, int paramInt2)
  {
    if (this.z4.q18[9] > 2)
    {
      if ((paramInt1 > 0) && (paramObject2 != null)) {
        this.q5 = this.z3.q100(paramObject2, paramInt1, paramInt2);
      } else {
        this.q5 = false;
      }
      this.z3.show(this.q5);
      this.z3.repaint();
    }
  }
  
  void q4(Object paramObject)
  {
    if (paramObject == null)
    {
      showStatus("");
      return;
    }
    if (this.z4.q18[9] > 0)
    {
      String str;
      switch (this.z4.q18[9])
      {
      case 1: 
      case 3: 
        str = ((jsx11b)paramObject).q78();
        break;
      case 2: 
      default: 
        str = ((jsx11b)paramObject).q86();
      }
      showStatus(str);
    }
  }
  
  public final boolean handleEvent(Event paramEvent)
  {
    if ((paramEvent.target instanceof jsx11c)) {
      for (int i = 0; i < this.z9.size(); i++)
      {
        jsx11c localjsx11c = (jsx11c)this.z9.elementAt(i);
        if (paramEvent.id == i)
        {
          localjsx11c.q88(1, false);
          this.z4.q18[21] = (i + 1);
          this.z6.q92();
        }
        else
        {
          localjsx11c.q88(0, false);
        }
      }
    }
    return true;
  }
}


/* Location:           C:\Users\spiderbob007\Desktop\JavaTree\
 * Qualified Name:     jsx11
 * JD-Core Version:    0.7.0.1
 */