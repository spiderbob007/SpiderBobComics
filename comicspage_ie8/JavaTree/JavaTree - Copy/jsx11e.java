import java.awt.Canvas;
import java.awt.Component;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Enumeration;
import java.util.Vector;

final class jsx11e
  extends Canvas
{
  private jsx11 z9;
  private jsx11a z14;
  private jsx11d z11;
  private Rectangle z29;
  private Rectangle rc;
  private Vector z30;
  private Image z16;
  private Graphics z15;
  private int z13;
  private int z27;
  private int z32;
  private int z21;
  private int z25;
  private int z24 = -1;
  private int z28;
  private int z23;
  private int z22;
  private int z17;
  private int z18;
  private int z19;
  private int z20;
  private int z26;
  private boolean z10 = false;
  private final int z31 = 8;
  private final int z12 = 1;
  
  jsx11e(jsx11 paramjsx11, jsx11a paramjsx11a, jsx11d paramjsx11d, Rectangle paramRectangle)
  {
    this.z9 = paramjsx11;
    this.z14 = paramjsx11a;
    this.z11 = paramjsx11d;
    this.rc = paramRectangle;
    reshape(paramRectangle.x, paramRectangle.y, paramRectangle.width, paramRectangle.height);
    setBackground(paramjsx11a.q13[4]);
    this.z30 = new Vector(16, 8);
    this.z29 = new Rectangle(0, 1, paramRectangle.width, 0);
    this.z17 = (paramjsx11a.q19[1].x + paramRectangle.x);
    this.z18 = (paramjsx11a.q19[1].y + paramRectangle.y);
  }
  
  protected void finalize()
  {
    if (this.z15 != null) {
      this.z15.dispose();
    }
  }
  
  void q96()
  {
    int i = this.z14.q14[1];
    int j = this.z14.q18[19];
    this.z13 = ((i >> 8) + 1);
    if ((j > 0) && (this.z13 < j)) {
      this.z13 = j;
    }
    this.z13 += this.z13 % 2;
    this.z25 = ((this.z13 - (i >> 8)) / 2 + (i & 0xFF));
    this.z21 = ((this.z13 - j) / 2);
    this.z28 = ((this.rc.height - 1) / this.z13);
    this.z16 = this.z9.createImage(this.rc.width, this.rc.height + j);
    this.z15 = this.z16.getGraphics();
  }
  
  private void z6(Graphics paramGraphics)
  {
    if ((this.z24 > -1) && (this.z24 < this.z22))
    {
      jsx11b localjsx11b = (jsx11b)this.z30.elementAt(this.z24);
      int i = 1 + this.z13 * (this.z24 - this.z27);
      z1(paramGraphics, localjsx11b, i, true);
    }
  }
  
  public void paint(Graphics paramGraphics)
  {
    if (this.z16 != null)
    {
      paramGraphics.drawImage(this.z16, 0, 0, null);
      z6(paramGraphics);
    }
  }
  
  public void update(Graphics paramGraphics)
  {
    paint(paramGraphics);
  }
  
  private void z8()
  {
    this.z15.setColor(getBackground());
    this.z15.fillRect(0, 0, this.rc.width, this.rc.height);
    Image localImage;
    if (this.z14.q18[14] == 1)
    {
      localImage = this.z9.q2();
      if (localImage != null) {
        this.z15.drawImage(localImage, -(this.rc.x + this.z14.q19[1].x), -(this.rc.y + this.z14.q19[1].y), null);
      }
    }
    else if (this.z14.q18[14] == 2)
    {
      localImage = this.z14.q17[2];
      if (localImage != null)
      {
        int i = 0;
        while (i < this.rc.height)
        {
          int j = 0;
          while (j < this.rc.width)
          {
            this.z15.drawImage(localImage, j, i, null);
            j += this.z14.q18[23];
          }
          i += this.z14.q18[24];
        }
      }
    }
    this.z29.height = (z0() * this.z13);
  }
  
  private int z0()
  {
    int i = 0;
    int j = this.z27 + this.z22;
    int k = 1;
    int m = 0;
    Enumeration localEnumeration = this.z30.elements();
    while (localEnumeration.hasMoreElements())
    {
      jsx11b localjsx11b = (jsx11b)localEnumeration.nextElement();
      if ((i >= this.z27) && (i < j))
      {
        z1(this.z15, localjsx11b, k, false);
        m++;
        k += this.z13;
      }
      i++;
    }
    return m;
  }
  
  private void z1(Graphics paramGraphics, jsx11b paramjsx11b, int paramInt, boolean paramBoolean)
  {
    int i;
    int j;
    if (paramjsx11b.q85() == 1)
    {
      i = 1;
      j = 5;
    }
    else
    {
      i = 2;
      j = 6;
    }
    int k = paramjsx11b.q80() - this.z32 * 8;
    int m = paramBoolean ? 100 : paramjsx11b.q79();
    k = this.z14.q6(paramGraphics, m, k, paramInt + this.z21, this.rc.height);
    paramGraphics.setFont(this.z14.q16[i]);
    if (paramBoolean)
    {
      int n = this.z32 * 8 + (this.rc.width - k + 1);
      paramGraphics.setColor(this.z14.q13[6]);
      paramGraphics.fillRect(k - 2, paramInt, n, this.z13);
      paramGraphics.setColor(getBackground());
    }
    else
    {
      paramGraphics.setColor(this.z14.q13[j]);
    }
    paramGraphics.drawString(paramjsx11b.q75(), k, paramInt + this.z25);
  }
  
  private int z7(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int j = this.z14.q18[21] - 1;
    Vector localVector = (Vector)this.z14.q8().elementAt(j);
    while (paramInt1 < localVector.size())
    {
      jsx11b localjsx11b = (jsx11b)localVector.elementAt(paramInt1++);
      if (localjsx11b.q77() == j)
      {
        if ((paramBoolean) && (localjsx11b.q82() < paramInt2)) {
          return paramInt1 - 1;
        }
        if (localjsx11b.q82() == paramInt2)
        {
          this.z30.addElement(localjsx11b);
          int i = localjsx11b.q80() + localjsx11b.q76() + this.z14.q18[18];
          if (i > this.z23) {
            this.z23 = i;
          }
          if ((localjsx11b.q85() == 1) && (localjsx11b.q83() == 1)) {
            paramInt1 = z7(paramInt1, paramInt2 + 1, true);
          }
        }
      }
    }
    return paramInt1;
  }
  
  private void z4()
  {
    this.z30.removeAllElements();
    this.z23 = 0;
    z7(0, 0, false);
    this.z22 = this.z30.size();
  }
  
  void q97(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.z27 = 0;
      this.z32 = 0;
    }
    z4();
    if ((this.z27 > 0) && (this.z22 - this.z27 < this.z28))
    {
      this.z27 = 0;
      z4();
    }
    jsx11f localjsx11f;
    if ((localjsx11f = this.z11.getScrollbar(0)) != null) {
      localjsx11f.q103(this.z27, this.z28, this.z22);
    }
    if ((localjsx11f = this.z11.getScrollbar(1)) != null) {
      localjsx11f.q103(0, this.rc.width / 8, this.z23 / 8 + 1);
    }
    z8();
    repaint();
  }
  
  void q95(int paramInt1, int paramInt2)
  {
    if ((this.z27 != paramInt1) || (this.z32 != paramInt2))
    {
      this.z27 = paramInt1;
      this.z32 = paramInt2;
      z8();
      repaint();
    }
  }
  
  void q101()
  {
    if (this.z10)
    {
      this.z26 += 1;
      if ((this.z26 > 2) && (this.z24 != -1) && (!this.z9.q5)) {
        this.z9.q1(this, this.z30.elementAt(this.z24), this.z19, this.z20);
      }
    }
  }
  
  private void z5(boolean paramBoolean)
  {
    synchronized (this)
    {
      this.z10 = paramBoolean;
      this.z26 = 0;
    }
    if (this.z9.q5) {
      this.z9.q1(this, null, 0, this.z20);
    }
  }
  
  public boolean handleEvent(Event paramEvent)
  {
    switch (paramEvent.id)
    {
    case 501: 
      z2(paramEvent.x, paramEvent.y);
      break;
    case 504: 
      z3(paramEvent.x, paramEvent.y);
      break;
    case 505: 
      z3(-1, paramEvent.y);
      break;
    case 503: 
      z3(paramEvent.x, paramEvent.y);
      break;
    }
    return true;
  }
  
  private void z2(int paramInt1, int paramInt2)
  {
    if (this.z24 != -1)
    {
      jsx11b localjsx11b1 = (jsx11b)this.z30.elementAt(this.z24);
      int i = localjsx11b1.q85();
      if (i == 2)
      {
        localjsx11b1.q88(1);
      }
      else
      {
        localjsx11b1.q88(localjsx11b1.q83() == 1 ? 0 : 1);
        if ((this.z14.q18[10] > 0) && (localjsx11b1.q82() == 0))
        {
          int j = localjsx11b1.q81();
          Enumeration localEnumeration = this.z30.elements();
          while (localEnumeration.hasMoreElements())
          {
            jsx11b localjsx11b2 = (jsx11b)localEnumeration.nextElement();
            if ((localjsx11b2.q82() == 0) && (localjsx11b2.q83() == 1) && (localjsx11b2.q81() != j)) {
              localjsx11b2.q88(0);
            }
          }
        }
      }
      z5(false);
      this.z32 = 0;
      q97(false);
      repaint();
      this.z14.q10(i == 2 ? 2 : 1);
      this.z14.q11(localjsx11b1);
    }
  }
  
  private void z3(int paramInt1, int paramInt2)
  {
    if (paramInt1 == -1)
    {
      this.z24 = paramInt1;
      repaint();
      this.z9.q4(null);
    }
    else if (this.z29.inside(paramInt1, paramInt2))
    {
      int i = this.z27 + (paramInt2 - 1) / this.z13;
      if (i != this.z24)
      {
        this.z24 = i;
        repaint();
        this.z9.q4(this.z30.elementAt(this.z24));
      }
    }
    else if (this.z24 != -1)
    {
      this.z24 = -1;
      repaint();
      this.z9.q4(null);
    }
    if ((this.z24 != -1) && (((jsx11b)this.z30.elementAt(this.z24)).q86().length() > 0)) {
      this.z9.q3(true);
    } else {
      this.z9.q3(false);
    }
    if ((this.z19 != this.z17 + paramInt1) || (this.z20 != this.z18 + paramInt2))
    {
      this.z19 = (this.z17 + paramInt1);
      this.z20 = (this.z18 + paramInt2);
      z5(paramInt1 > 0);
    }
  }
}


/* Location:           C:\Users\spiderbob007\Desktop\JavaTree\
 * Qualified Name:     jsx11e
 * JD-Core Version:    0.7.0.1
 */