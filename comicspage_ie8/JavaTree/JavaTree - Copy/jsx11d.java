import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Rectangle;

final class jsx11d
  extends Panel
{
  private jsx11 z0;
  private jsx11a z6;
  private jsx11f[] z10 = { null, null };
  private boolean[] z1 = { false, false };
  private int z4;
  private jsx11e z7;
  private Rectangle z9;
  private int z8;
  private int z2;
  private int z3;
  private int z5;
  final int q94 = 0;
  final int q93 = 1;
  
  jsx11d(jsx11 paramjsx11, jsx11a paramjsx11a, Rectangle paramRectangle)
  {
    this.z0 = paramjsx11;
    this.z6 = paramjsx11a;
    setLayout(null);
    setBackground(paramjsx11a.q13[9]);
    this.z3 = paramRectangle.width;
    this.z5 = paramRectangle.height;
    reshape(paramRectangle.x, paramRectangle.y, paramRectangle.width, paramRectangle.height);
    this.z8 = paramjsx11a.q18[15];
    this.z2 = paramjsx11a.q18[8];
    this.z9 = new Rectangle(this.z2, this.z2, paramRectangle.width - (this.z2 << 1), paramRectangle.height - (this.z2 << 1));
  }
  
  void q91()
  {
    this.z4 = this.z6.q18[1];
    this.z1[0] = (this.z6.q18[2] % 2 <= 0 ? 0 : true);
    this.z1[1] = (this.z6.q18[2] <= 1 ? 0 : true);
    if (this.z1[0] != 0) {
      this.z9.width -= this.z4;
    }
    if (this.z1[1] != 0) {
      this.z9.height -= this.z4;
    }
    this.z7 = new jsx11e(this.z0, this.z6, this, this.z9);
    add(this.z7);
    this.z7.q96();
    for (int i = 0; i <= 1; i++)
    {
      this.z10[i] = new jsx11f(i, 0, 1, 1);
      this.z10[i].setBackground(this.z6.q13[9]);
    }
    if (this.z1[0] != 0)
    {
      this.z10[0].reshape(this.z9.width + this.z2, this.z9.y, this.z4, this.z9.height);
      add(this.z10[0]);
      this.z10[0].q103(0, 1, 1);
    }
    if (this.z1[1] != 0)
    {
      this.z10[1].reshape(this.z9.x, this.z9.height + this.z2, this.z9.width, this.z4);
      add(this.z10[1]);
      this.z10[1].q103(0, 1, 1);
    }
    q92();
    repaint();
  }
  
  private void drawBorder(Graphics paramGraphics)
  {
    int i = 0;
    int j = this.z3 - 1;
    int k = this.z5 - 1;
    paramGraphics.setColor(this.z6.q13[10]);
    if ((this.z8 == 1) || (this.z8 == 4)) {
      paramGraphics.fillRect(0, 0, this.z3, this.z5);
    }
    while (i < this.z2)
    {
      switch (this.z8)
      {
      case 1: 
        return;
      case 2: 
        paramGraphics.draw3DRect(i, i, j, k, (i != this.z2 - 1) || (this.z2 <= 1));
        break;
      case 3: 
        paramGraphics.draw3DRect(i, i, j, k, (i == 0) && (this.z2 > 1));
        break;
      case 4: 
        if ((i == 0) && (this.z2 > 1)) {
          paramGraphics.draw3DRect(i, i, j, k, true);
        } else if ((i == this.z2 - 1) && (this.z2 > 1)) {
          paramGraphics.draw3DRect(i, i, j, k, false);
        }
        break;
      }
      i++;
      j -= 2;
      k -= 2;
    }
  }
  
  public void paint(Graphics paramGraphics)
  {
    if (this.z2 > 0) {
      drawBorder(paramGraphics);
    }
    if ((this.z1[0] != 0) && (this.z1[1] != 0))
    {
      int i = this.z4 + this.z2 + 1;
      paramGraphics.setColor(this.z6.q13[9]);
      paramGraphics.fillRect(this.z3 - i, this.z5 - i, this.z4, this.z4);
      paramGraphics.setColor(this.z6.q13[9].darker());
      this.z6.q7(paramGraphics, this.z3 - i, this.z5 - i, this.z4 + 1, this.z4 + 1);
    }
  }
  
  public void update(Graphics paramGraphics)
  {
    paint(paramGraphics);
  }
  
  void q92()
  {
    this.z7.q97(true);
  }
  
  jsx11f getScrollbar(int paramInt)
  {
    return this.z10[paramInt];
  }
  
  void q101()
  {
    this.z7.q101();
    if (this.z1[0] != 0) {
      this.z10[0].q101();
    }
    if (this.z1[1] != 0) {
      this.z10[1].q101();
    }
  }
  
  public boolean handleEvent(Event paramEvent)
  {
    if ((paramEvent.target instanceof jsx11f))
    {
      this.z7.q95(this.z1[0] != 0 ? this.z10[0].q104() : 0, this.z1[1] != 0 ? this.z10[1].q104() : 0);
      return true;
    }
    return super.handleEvent(paramEvent);
  }
}


/* Location:           C:\Users\spiderbob007\Desktop\JavaTree\
 * Qualified Name:     jsx11d
 * JD-Core Version:    0.7.0.1
 */