import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

final class jsx11f
  extends Canvas
{
  private Image z8;
  private Image z9;
  private Event z7;
  private boolean z4 = true;
  private boolean z3 = false;
  private boolean z23 = false;
  private int z5 = 15;
  private int z6 = 100;
  private int z16;
  private int z17;
  private int z12;
  private int z13;
  private int z14;
  private int z15;
  private int z10;
  private int z21;
  private Rectangle rt;
  static final int q99 = 0;
  static final int q98 = 1;
  private int z11;
  
  jsx11f(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.z12 = paramInt1;
    this.rt = new Rectangle();
    this.z7 = new Event(this, 1, null);
    setBackground(Color.lightGray);
    z2(paramInt2, paramInt3, paramInt4);
  }
  
  public void reshape(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.z5 = paramInt3;
    this.z6 = paramInt4;
    if (this.z8 != null) {
      this.z8 = createImage(this.z5, this.z6);
    }
    super.reshape(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private void z0()
  {
    this.z9 = createImage(this.z5, this.z6);
    Graphics localGraphics = this.z9.getGraphics();
    localGraphics.setColor(getBackground());
    localGraphics.fillRect(0, 0, this.z5, this.z6);
    localGraphics.setColor(getBackground().brighter());
    for (int i = 1; i < this.z9.getWidth(null); i++) {
      for (int j = 1; j < this.z9.getHeight(null); j++) {
        if (i % 2 == 0)
        {
          if (j % 2 > 0) {
            localGraphics.drawLine(i, j, i, j);
          }
        }
        else if (j % 2 == 0) {
          localGraphics.drawLine(i, j, i, j);
        }
      }
    }
    localGraphics.setColor(getBackground().darker());
    localGraphics.drawRect(-1, -1, this.z5, this.z6);
    localGraphics.dispose();
  }
  
  public void paint(Graphics paramGraphics)
  {
    if (this.z8 == null) {
      this.z8 = createImage(this.z5, this.z6);
    }
    if (this.z9 == null) {
      z0();
    }
    Graphics localGraphics = this.z8.getGraphics();
    localGraphics.drawImage(this.z9, 0, 0, null);
    localGraphics.setColor(Color.black);
    localGraphics.drawRect(this.rt.x, this.rt.y, this.rt.width, this.rt.height);
    localGraphics.setColor(getBackground());
    localGraphics.fillRect(this.rt.x, this.rt.y, this.rt.width, this.rt.height);
    localGraphics.draw3DRect(this.rt.x + 1, this.rt.y + 1, this.rt.width - 2, this.rt.height - 2, true);
    if (this.z4) {
      localGraphics.setColor(this.z3 ? Color.white : Color.black);
    } else {
      localGraphics.setColor(getBackground().darker());
    }
    int m;
    int j;
    int k;
    int i;
    if (this.z12 == 0)
    {
      m = 7;
      j = (this.z5 - m) / 2;
      k = this.rt.y + 7;
      for (i = 0; i < 4; i++)
      {
        localGraphics.drawLine(j, k, j + m, k);
        j++;
        k--;
        m -= 2;
      }
      m = 7;
      j = (this.z5 - m) / 2;
      k = this.rt.y + this.rt.height - 7;
      for (i = 0; i < 4; i++)
      {
        localGraphics.drawLine(j, k, j + m, k);
        j++;
        k++;
        m -= 2;
      }
    }
    else
    {
      m = 7;
      j = this.rt.x + 7;
      k = (this.z6 - m) / 2;
      for (i = 0; i < 4; i++)
      {
        localGraphics.drawLine(j, k, j, k + m);
        j--;
        k++;
        m -= 2;
      }
      m = 7;
      j = this.rt.x + this.rt.width - 7;
      k = (this.z6 - m) / 2;
      for (i = 0; i < 4; i++)
      {
        localGraphics.drawLine(j, k, j, k + m);
        j++;
        k++;
        m -= 2;
      }
    }
    localGraphics.dispose();
    paramGraphics.drawImage(this.z8, 0, 0, null);
  }
  
  public void update(Graphics paramGraphics)
  {
    paint(paramGraphics);
  }
  
  private int z24(int paramInt)
  {
    int j = this.z10 + this.z15;
    int i = paramInt + 1 - 16;
    if ((this.z10 > 1) && (i > 0))
    {
      while (j / this.z21 > i) {
        this.z21 += 1;
      }
      this.z13 = (i / (j / this.z21));
      paramInt -= (this.z10 - 1) / this.z21 * this.z13;
    }
    return paramInt;
  }
  
  private void z2(int paramInt1, int paramInt2, int paramInt3)
  {
    this.z15 = (paramInt2 < 1 ? 1 : paramInt2);
    this.z10 = (paramInt3 - paramInt2 < 1 ? 1 : paramInt3 - paramInt2 + 1);
    this.z14 = (paramInt1 > this.z10 ? this.z10 : paramInt1);
    this.z13 = 1;
    this.z21 = 1;
    int i;
    if (this.z12 == 0)
    {
      i = z24(this.z6 - 1);
      this.rt.reshape(0, this.z14 / this.z21 * this.z13, this.z5 - 1, i);
    }
    else
    {
      i = z24(this.z5 - 1);
      this.rt.reshape(this.z14 / this.z21 * this.z13, 0, i, this.z6 - 1);
    }
    this.z4 = (this.rt.height < this.z6 - 1);
  }
  
  void q103(int paramInt1, int paramInt2, int paramInt3)
  {
    z2(paramInt1, paramInt2, paramInt3);
    repaint();
  }
  
  private void z1(int paramInt)
  {
    this.z14 = paramInt;
    if (this.z14 < 0) {
      this.z14 = 0;
    } else if (this.z14 >= this.z10) {
      this.z14 = (this.z10 - 1);
    }
    int i = this.z14 / this.z21 * this.z13;
    if (this.z12 == 0) {
      this.rt.move(0, i);
    } else {
      this.rt.move(i, 0);
    }
    Graphics localGraphics = getGraphics();
    paint(localGraphics);
    localGraphics.dispose();
    postEvent(this.z7);
  }
  
  int q104()
  {
    return this.z14;
  }
  
  void q101()
  {
    int i = 0;
    if ((this.z23) && (!this.rt.inside(this.z16, this.z17)))
    {
      if (this.z12 == 0) {
        i = this.z17 < this.rt.y ? this.z14 - this.z21 : this.z14 + this.z21;
      } else {
        i = this.z16 < this.rt.x ? this.z14 - this.z21 : this.z14 + this.z21;
      }
      z1(i);
    }
  }
  
  public boolean mouseDown(Event paramEvent, int paramInt1, int paramInt2)
  {
    int i = -1;
    this.z16 = paramInt1;
    this.z17 = paramInt2;
    if (this.z4) {
      if (this.rt.inside(paramInt1, paramInt2))
      {
        this.z3 = true;
        this.z11 = (this.z12 == 0 ? paramInt2 - this.rt.y : paramInt1 - this.rt.x);
        repaint();
      }
      else
      {
        if ((this.z12 == 0) && (paramInt1 < this.rt.width)) {
          i = paramInt2 < this.rt.y ? this.z14 - this.z21 : this.z14 + this.z21;
        } else if ((this.z12 == 1) && (paramInt2 < this.rt.height)) {
          i = paramInt1 < this.rt.x ? this.z14 - this.z21 : this.z14 + this.z21;
        }
        if (i >= 0)
        {
          z1(i);
          this.z23 = true;
        }
      }
    }
    return true;
  }
  
  public boolean mouseUp(Event paramEvent, int paramInt1, int paramInt2)
  {
    this.z23 = false;
    if (this.z3)
    {
      this.z3 = false;
      repaint();
    }
    return true;
  }
  
  public boolean mouseDrag(Event paramEvent, int paramInt1, int paramInt2)
  {
    int i = 0;
    this.z16 = paramInt1;
    this.z17 = paramInt2;
    if (this.z3)
    {
      i = this.z12 == 0 ? (paramInt2 - this.z11) / this.z13 : (paramInt1 - this.z11) / this.z13;
      z1(i * this.z21);
    }
    return true;
  }
  
  public boolean mouseMove(Event paramEvent, int paramInt1, int paramInt2)
  {
    return true;
  }
  
  public boolean mouseEnter(Event paramEvent, int paramInt1, int paramInt2)
  {
    return true;
  }
  
  public boolean mouseExit(Event paramEvent, int paramInt1, int paramInt2)
  {
    return true;
  }
}


/* Location:           C:\Users\spiderbob007\Desktop\JavaTree\
 * Qualified Name:     jsx11f
 * JD-Core Version:    0.7.0.1
 */