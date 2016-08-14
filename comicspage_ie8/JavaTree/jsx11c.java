import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Vector;

final class jsx11c
  extends Canvas
{
  private jsx11 z3;
  private jsx11a z9;
  private int z7;
  private int z8;
  private boolean z4;
  private Image z10;
  private int z13;
  private jsx11b z15;
  private Point pt;
  private int z11;
  private int z12;
  private int z14;
  private boolean z5 = false;
  private Color z6;
  
  jsx11c(jsx11 paramjsx11, jsx11a paramjsx11a, Rectangle paramRectangle, int paramInt)
  {
    this.z3 = paramjsx11;
    this.z9 = paramjsx11a;
    this.z13 = paramInt;
    this.z7 = paramRectangle.width;
    this.z8 = paramRectangle.height;
    setBackground(paramjsx11a.q13[1]);
    this.z6 = paramjsx11a.q13[1].brighter();
    this.pt = new Point(paramRectangle.x, paramRectangle.y + (paramRectangle.height + paramjsx11a.q18[4]) * paramInt);
    reshape(paramRectangle.x, this.pt.y, this.z7, this.z8);
    this.z4 = (paramjsx11a.q18[3] > 1);
    Vector localVector = paramjsx11a.q9();
    this.z15 = ((jsx11b)localVector.elementAt(this.z13));
  }
  
  void q89()
  {
    this.z10 = createImage(this.z7, (this.z8 << 1) + this.z9.q18[19]);
    Graphics localGraphics = this.z10.getGraphics();
    int i = this.z8 - this.z9.q18[19] >> 1;
    int j = this.z9.q14[0];
    int k = (this.z8 - (j >> 8)) / 2 + (j & 0xFF);
    localGraphics.setColor(getBackground().darker());
    localGraphics.fillRect(0, 0, this.z7, this.z8 * 2);
    z0(localGraphics, 0, i, k, true);
    z0(localGraphics, this.z8, i, k, false);
    localGraphics.dispose();
    q88(this.z9.q18[21] - 1 == this.z13 ? 1 : 0, true);
  }
  
  private void z0(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    paramGraphics.setColor(getBackground());
    if (paramBoolean)
    {
      paramGraphics.fillRect(0, paramInt1, this.z7 - 2, this.z8 - 2);
      paramGraphics.setColor(this.z6);
      paramGraphics.fillRect(1, paramInt1 + 1, this.z7 - 2, 1);
      paramGraphics.fillRect(1, paramInt1 + 1, 1, this.z8 - 2);
    }
    else
    {
      paramGraphics.fillRect(2, paramInt1 + 2, this.z7 - 3, this.z8 - 3);
      paramGraphics.setColor(this.z6);
      paramGraphics.fillRect(1, paramInt1 + this.z8 - 1, this.z7, 1);
      paramGraphics.fillRect(this.z7 - 1, paramInt1 + 1, 1, this.z8);
    }
    if (this.z4)
    {
      int j = paramBoolean ? -1 : 0;
      paramGraphics.setColor(Color.black);
      this.z9.q7(paramGraphics, j, paramInt1 + j, this.z7 + 1, this.z8 + 1);
    }
    int j = paramBoolean ? 0 : 1;
    this.z15.q88(paramBoolean ? 0 : 1);
    int i = this.z9.q6(paramGraphics, this.z15.q79(), this.z15.q80() + j, paramInt1 + paramInt2 + j, this.z8 << 1);
    paramGraphics.setFont(this.z9.q16[0]);
    paramGraphics.setColor(this.z9.q13[3]);
    paramGraphics.drawString(this.z15.q75(), i, paramInt1 + paramInt3 + j);
  }
  
  public void paint(Graphics paramGraphics)
  {
    paramGraphics.drawImage(this.z10, 0, this.z15.q83() == 1 ? -this.z8 : 0, null);
  }
  
  public void update(Graphics paramGraphics)
  {
    paint(paramGraphics);
  }
  
  void q88(int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) || (paramInt != this.z15.q83()))
    {
      this.z15.q88(paramInt);
      repaint();
    }
  }
  
  void q101()
  {
    if (this.z5)
    {
      this.z14 += 1;
      if ((this.z14 > 2) && (!this.z3.q5)) {
        this.z3.q1(this, this.z15, this.z11, this.z12);
      }
    }
  }
  
  private void z2(boolean paramBoolean)
  {
    synchronized (this)
    {
      this.z5 = paramBoolean;
      this.z14 = 0;
    }
    if (this.z3.q5) {
      this.z3.q1(this, null, 0, this.z12);
    }
  }
  
  public boolean handleEvent(Event paramEvent)
  {
    switch (paramEvent.id)
    {
    case 501: 
      if (this.z15.q83() != 1)
      {
        this.z3.postEvent(new Event(this, this.z13, null));
        this.z9.q10(0);
        this.z9.q11(this.z15);
      }
      z1(-2, paramEvent.y);
      break;
    case 504: 
      z1(paramEvent.x, paramEvent.y);
      this.z3.q4(this.z15);
      break;
    case 505: 
      z1(-1, paramEvent.y);
      this.z3.q4(null);
      break;
    case 503: 
      z1(paramEvent.x, paramEvent.y);
      break;
    }
    return true;
  }
  
  private void z1(int paramInt1, int paramInt2)
  {
    if ((this.z11 != this.pt.x + paramInt1) || (this.z12 != this.pt.y + paramInt2))
    {
      this.z11 = (this.pt.x + paramInt1);
      this.z12 = (this.pt.y + paramInt2);
      z2(paramInt1 > 0);
    }
  }
}