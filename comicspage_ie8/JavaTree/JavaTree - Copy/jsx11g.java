import java.awt.Canvas;
import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.Vector;

final class jsx11g
  extends Canvas
{
  private jsx11a z4;
  private int z2;
  private int z1;
  private int z3;
  private int z5;
  private Vector z6;
  
  jsx11g(jsx11a paramjsx11a, int paramInt)
  {
    this.z4 = paramjsx11a;
    this.z2 = paramInt;
    this.z1 = this.z2;
    this.z3 = 16;
    this.z6 = new Vector(4);
    this.z5 = ((paramjsx11a.q14[3] & 0xFF) + 1);
    reshape(0, 0, this.z1, this.z3);
  }
  
  boolean q100(Object paramObject, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    boolean bool = false;
    if (paramObject != null)
    {
      String str1 = ((jsx11b)paramObject).q78() + " ";
      if (str1.length() > 2)
      {
        this.z6.removeAllElements();
        while ((j = z0(i, this.z2 - 8, str1)) != -1)
        {
          String str2 = str1.substring(i, j).trim();
          this.z6.addElement(str2);
          k = Math.max(k, this.z4.q15[3].stringWidth(str2));
          j++;
          i = j;
        }
        if ((bool = this.z6.size() <= 0 ? 0 : 1) != 0)
        {
          this.z1 = (k + 6);
          this.z3 = (this.z6.size() * this.z5 + this.z5 / 2 - 1);
          int m = this.z2 - this.z1;
          if (m > paramInt1) {
            m = paramInt1;
          }
          reshape(m, paramInt2 + 20, this.z1, this.z3);
        }
      }
    }
    return bool;
  }
  
  private int z0(int paramInt1, int paramInt2, String paramString)
  {
    char c2 = ' ';
    int i = paramInt1;
    int j = paramString.length() - 1;
    if (i > j) {
      return -1;
    }
    StringBuffer localStringBuffer = new StringBuffer(64);
    while (i <= j)
    {
      char c1 = paramString.charAt(i);
      localStringBuffer.append(c1);
      if (((c1 == c2) || (i == j)) && (this.z4.q15[3].stringWidth(localStringBuffer.toString()) > paramInt2))
      {
        while ((paramString.charAt(i - 1) != c2) && (i > paramInt1 + 2)) {
          i--;
        }
        return i - 1;
      }
      i++;
    }
    return i;
  }
  
  public void paint(Graphics paramGraphics)
  {
    paramGraphics.setColor(this.z4.q13[7]);
    paramGraphics.fillRect(0, 0, this.z1, this.z3);
    paramGraphics.setColor(this.z4.q13[8]);
    paramGraphics.setFont(this.z4.q16[3]);
    int i = this.z5;
    for (int j = 0; j < this.z6.size(); j++)
    {
      paramGraphics.drawString(this.z6.elementAt(j).toString(), 4, i);
      i += this.z5;
    }
    this.z4.q7(paramGraphics, 0, 0, this.z1, this.z3);
  }
  
  public void update(Graphics paramGraphics)
  {
    paint(paramGraphics);
  }
}


/* Location:           C:\Users\spiderbob007\Desktop\JavaTree\
 * Qualified Name:     jsx11g
 * JD-Core Version:    0.7.0.1
 */