import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Rectangle;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.Vector;

final class jsx11a
{
  private jsx11 z0;
  private String z13;
  private String s_deftarget;
  private Vector z17;
  private Vector z18;
  private final int z15 = 3;
  private MediaTracker mt;
  final int q72 = 0;
  final int q73 = 1;
  final int q74 = 2;
  final int q67 = 0;
  final int q69 = 1;
  final int q70 = 0;
  final int q68 = 1;
  final int q63 = 0;
  final int q64 = 1;
  private final String[] z12 = { "button", "menu" };
  Rectangle[] q19 = { null, null };
  final int q30 = 0;
  final int q31 = 1;
  final int q33 = 2;
  final int q32 = 3;
  final int q36 = 4;
  final int q38 = 5;
  final int q39 = 6;
  final int q34 = 7;
  final int q35 = 8;
  final int q40 = 9;
  final int q37 = 10;
  private final String[] z7 = { "back", "buttonface", "buttonlo", "buttonhi", "menuback", "menufolder", "menuitem", "hintback", "hinttext", "scrollbar", "menuborder" };
  private final int[] z1 = { 0, 13421772, 0, 16777215, 16777215, 0, 0, 16776960, 0, 13421772, 13421772 };
  Color[] q13 = { null, null, null, null, null, null, null, null, null, null, null };
  final int q47 = 0;
  final int q48 = 1;
  final int q50 = 2;
  final int q49 = 3;
  private final String[] z9 = { "button", "folder", "item", "hint" };
  Font[] q16 = { null, null, null, null };
  FontMetrics[] q15 = { null, null, null, null };
  int[] q14 = { 0, 0, 0, 0 };
  final int q54 = 0;
  final int q53 = 1;
  final int q55 = 2;
  private final String[] z10 = { "icons", "back", "menu" };
  Image[] q17 = { null, null, null };
  final int q20 = 0;
  final int q21 = 1;
  final int q22 = 2;
  private final String[] z6 = { "button", "folder", "item" };
  AudioClip[] q12 = { null, null, null };
  final int q52 = 0;
  final int q65 = 1;
  final int q66 = 2;
  final int q29 = 3;
  final int q28 = 4;
  final int q27 = 5;
  final int q62 = 6;
  final int q24 = 7;
  final int q60 = 8;
  final int q51 = 9;
  final int q23 = 10;
  final int q57 = 11;
  final int q71 = 12;
  final int q56 = 13;
  final int q58 = 14;
  final int q59 = 15;
  final int q42 = 16;
  final int q45 = 17;
  final int q41 = 18;
  final int q44 = 19;
  final int q25 = 20;
  final int q26 = 21;
  final int q61 = 22;
  final int q43 = 23;
  final int q46 = 24;
  private final String[] z11 = { "iconcount", "scrollsize", "scrollstyle", "buttonstyle", "buttonspace", "buttonindent", "menuindent", "backstyle", "menuborderwidth", "hintoptions", "autoclose", "levelindent", "topmargin", "leftmargin", "menubackstyle", "menuborderstyle" };
  private final int[] z4 = { 0, 8, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
  private final int[] z3 = { 50, 24, 3, 2, 50, 50, 50, 2, 9, 4, 1, 50, 99, 99, 2, 4 };
  int[] q18 = { 0, 15, 0, 1, 4, 8, 8, 2, 1, 4, 0, 12, 0, 0, 2, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0 };
  
  jsx11a(jsx11 paramjsx11)
  {
    this.z0 = paramjsx11;
    this.z17 = new Vector(8, 4);
    this.z18 = new Vector(8, 4);
    this.mt = new MediaTracker(paramjsx11);
  }
  
  boolean q0()
  {
    boolean bool;
    if (((bool = z26())) && ((bool = z20())))
    {
      if ((bool = z23())) {
        for (int i = 0; i < this.z18.size(); i++)
        {
          Enumeration localEnumeration = ((Vector)this.z18.elementAt(i)).elements();
          for (int j = 1; localEnumeration.hasMoreElements(); j = ((jsx11b)localEnumeration.nextElement()).q87(this.q18[10], this.q18[11], this.q18[6], j)) {}
        }
      }
      if ((this.q18[21] > this.q18[20]) || (this.q18[21] < 1)) {
        this.q18[21] = 1;
      }
    }
    return bool;
  }
  
  private int z25(Font paramFont, FontMetrics paramFontMetrics)
  {
    int i = paramFontMetrics.getAscent();
    int j = paramFontMetrics.getDescent();
    int k = paramFont.getSize();
    if (i > k) {
      i = k;
    }
    if (i / 4 < j) {
      j = i / 4;
    }
    return (j + i << 8) + i;
  }
  
  Vector q9()
  {
    return this.z17;
  }
  
  int q6(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((this.q18[0] > 0) && (paramGraphics != null) && (paramInt1 > -1))
    {
      if ((paramInt1 < 100) && (paramInt2 > -this.q18[18]))
      {
        paramGraphics.copyArea(paramInt2, paramInt3, this.q18[18], this.q18[19], -paramInt2, paramInt4 - paramInt3);
        paramGraphics.drawImage(this.q17[0], -(paramInt1 * this.q18[18]), paramInt4, null);
        paramGraphics.copyArea(0, paramInt4, this.q18[18], this.q18[19], paramInt2, -(paramInt4 - paramInt3));
      }
      paramInt2 += this.q18[18] + 3;
    }
    return paramInt2;
  }
  
  private boolean z23()
  {
    int j = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    String[] arrayOfString = new String[3];
    int i4 = 1;
    while ((i4 != 0) && (j < this.z13.length()))
    {
      int i;
      if (((i = this.z13.indexOf(this.z0.q102[0], j)) != -1) && ((j = this.z13.indexOf(this.z0.q102[1], i)) != -1) && (j - i > 5))
      {
        i++;
        String str = this.z13.substring(i, i + 5).toUpperCase().trim();
        if (str.length() > 2)
        {
          int i3 = 1;
          if (str.startsWith("/B"))
          {
            i1++;
            n = 0;
            i3 = 0;
          }
          else if (str.startsWith("BU"))
          {
            i2 = 0;
          }
          else if (str.startsWith("/F"))
          {
            if (n > 0) {
              n--;
            }
            i3 = 0;
          }
          else if (str.startsWith("FO"))
          {
            i2 = 1;
            n++;
          }
          else if (str.startsWith("IT"))
          {
            i2 = 2;
          }
          else
          {
            i3 = 0;
          }
          if (i3 != 0)
          {
            while ((i < this.z13.length()) && (this.z13.charAt(i) != ' ')) {
              i++;
            }
            if (j > i + 1)
            {
              for (int k = 0; k < 3; k++) {
                arrayOfString[k] = "";
              }
              StringTokenizer localStringTokenizer = new StringTokenizer(this.z13.substring(i, j), String.valueOf(this.z0.q102[2]));
              k = 0;
              while ((localStringTokenizer.hasMoreTokens()) && (k < 3)) {
                arrayOfString[(k++)] = localStringTokenizer.nextToken().trim();
              }
              if (this.z18.size() < i1 + 1)
              {
                this.z18.addElement(new Vector(16, 8));
                m = 0;
              }
              jsx11b localjsx11b = new jsx11b(this.z0, this, arrayOfString, i1, i2, n, m);
              if (i2 == 0)
              {
                this.z17.addElement(localjsx11b);
                this.q18[20] += 1;
              }
              else
              {
                m++;
                ((Vector)this.z18.elementAt(i1)).addElement(localjsx11b);
                this.q18[22] += 1;
              }
            }
          }
        }
        i = j;
      }
      else
      {
        i4 = 0;
      }
    }
    return (this.q18[20] > 0) || (this.q18[22] > 0);
  }
  
  private boolean z20()
  {
    for (int i = 0; i < this.z12.length; i++)
    {
      this.q19[i] = z24(z27("rect_" + this.z12[i]));
      if (this.q19[i] == null) {
        return false;
      }
    }
    for (i = 0; i < this.z11.length; i++) {
      this.q18[i] = z22(i, z27(this.z11[i]));
    }
    String str;
    try
    {
      for (i = 0; i < this.q17.length; i++)
      {
        str = z27("image_" + this.z10[i]);
        if ((str != null) && (str.length() > 4))
        {
          this.q17[i] = this.z0.getImage(this.z0.getCodeBase(), str);
          this.mt.addImage(this.q17[i], i);
        }
      }
      try
      {
        this.mt.waitForAll();
      }
      catch (InterruptedException localInterruptedException) {}
    }
    catch (Exception localException) {}
    if ((str = z27("deftarget")) != null) {
      this.s_deftarget = new String(str);
    } else {
      this.s_deftarget = "_blank";
    }
    for (i = 0; i < this.z6.length; i++)
    {
      str = z27("audio_" + this.z6[i]);
      if ((str != null) && (str.length() > 3)) {
        this.q12[i] = this.z0.getAudioClip(this.z0.getCodeBase(), str);
      }
    }
    for (i = 0; i < this.z7.length; i++) {
      this.q13[i] = z19(i, z27("color_" + this.z7[i]));
    }
    for (i = 0; i < this.z9.length; i++)
    {
      this.q16[i] = z21(z27("font_" + this.z9[i]));
      this.q15[i] = this.z0.getFontMetrics(this.q16[i]);
      this.q14[i] = z25(this.q16[i], this.q15[i]);
    }
    if (this.q17[1] != null)
    {
      this.q18[16] = this.q17[1].getWidth(null);
      this.q18[17] = this.q17[1].getHeight(null);
    }
    if (this.q17[2] != null)
    {
      this.q18[23] = this.q17[2].getWidth(null);
      this.q18[24] = this.q17[2].getHeight(null);
    }
    if (this.q17[0] != null)
    {
      i = this.q18[0];
      if (i > 0)
      {
        this.q18[18] = (this.q17[0].getWidth(null) / i);
        this.q18[19] = this.q17[0].getHeight(null);
      }
    }
    else
    {
      this.q18[0] = 0;
    }
    return true;
  }
  
  private Color z19(int paramInt, String paramString)
  {
    int i;
    if (paramString != null) {
      try
      {
        if (paramString.startsWith("0x")) {
          i = Integer.parseInt(paramString.substring(2), 16);
        } else if (paramString.startsWith("#")) {
          i = Integer.parseInt(paramString.substring(1), 16);
        } else {
          i = Integer.parseInt(paramString, 10);
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        i = this.z1[paramInt];
      }
    } else {
      i = this.z1[paramInt];
    }
    return new Color(i);
  }
  
  private Font z21(String paramString)
  {
    if (paramString != null) {
      try
      {
        StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ",");
        if (localStringTokenizer.countTokens() == 3) {
          return new Font(localStringTokenizer.nextToken().trim(), Integer.parseInt(localStringTokenizer.nextToken().trim()), Integer.parseInt(localStringTokenizer.nextToken().trim()));
        }
      }
      catch (NumberFormatException localNumberFormatException) {}
    }
    return this.z0.getFont();
  }
  
  private int z22(int paramInt, String paramString)
  {
    int i = 0;
    if (paramString != null)
    {
      try
      {
        i = Integer.parseInt(paramString);
      }
      catch (NumberFormatException localNumberFormatException) {}
      if (i < this.z4[paramInt]) {
        i = this.z4[paramInt];
      } else if (i > this.z3[paramInt]) {
        i = this.z3[paramInt];
      }
    }
    else
    {
      i = this.q18[paramInt];
    }
    return i;
  }
  
  private Rectangle z24(String paramString)
  {
    if (paramString != null)
    {
      StringTokenizer localStringTokenizer = new StringTokenizer(paramString, ",");
      if (localStringTokenizer.countTokens() == 4) {
        try
        {
          return new Rectangle(Integer.parseInt(localStringTokenizer.nextToken().trim()), Integer.parseInt(localStringTokenizer.nextToken().trim()), Integer.parseInt(localStringTokenizer.nextToken().trim()), Integer.parseInt(localStringTokenizer.nextToken().trim()));
        }
        catch (NumberFormatException localNumberFormatException) {}
      }
    }
    return null;
  }
  
  private String z27(String paramString)
  {
    String str = this.z0.getParameter(paramString);
    if (str == null) {
      return null;
    }
    return str.trim();
  }
  
  private boolean z26()
  {
    String str = z27("delimiters");
    if ((str != null) && (str.length() >= 4)) {
      for (int i = 0; i < 4; i++) {
        this.z0.q102[i] = str.charAt(i);
      }
    }
    str = z27("appletdata");
    if ((str != null) && (str.length() > 3)) {
      if (str.indexOf(this.z0.q102[0]) == -1)
      {
        StringBuffer localStringBuffer = new StringBuffer();
        try
        {
          URL localURL = new URL(this.z0.getCodeBase(), str);
          try
          {
            InputStream localInputStream = localURL.openStream();
            DataInputStream localDataInputStream = new DataInputStream(localInputStream);
            while ((str = localDataInputStream.readLine()) != null) {
              localStringBuffer.append(str);
            }
            localDataInputStream.close();
            this.z13 = new String(localStringBuffer);
          }
          catch (IOException localIOException) {}
        }
        catch (MalformedURLException localMalformedURLException) {}
      }
      else
      {
        this.z13 = new String(str);
      }
    }
    return this.z13 != null;
  }
  
  Vector q8()
  {
    return this.z18;
  }
  
  void q10(int paramInt)
  {
    if (this.q12[paramInt] != null) {
      this.q12[paramInt].play();
    }
  }
  
  void q7(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt1 + paramInt3 - 1;
    int j = paramInt2 + paramInt4 - 1;
    paramGraphics.drawLine(paramInt1, paramInt2, i, paramInt2);
    paramGraphics.drawLine(paramInt1, paramInt2, paramInt1, j);
    paramGraphics.drawLine(paramInt1, j, i, j);
    paramGraphics.drawLine(i, paramInt2, i, j);
  }
  
  void q11(jsx11b paramjsx11b)
  {
    URL localURL = null;
    String str1 = paramjsx11b.q86();
    if (str1.length() > 1)
    {
      String str2 = paramjsx11b.q84();
      if (str2.length() < 2) {
        str2 = this.s_deftarget;
      }
      try
      {
        if (str1.indexOf("://") > 0) {
          localURL = new URL(str1);
        } else if ((str1.charAt(0) == 'w') && (str1.charAt(3) == '.')) {
          localURL = new URL("http://" + str1);
        } else {
          localURL = new URL(this.z0.getDocumentBase(), str1);
        }
        this.z0.getAppletContext().showDocument(localURL, str2);
        return;
      }
      catch (Exception localException)
      {
        this.z0.showStatus("URL error");
        return;
      }
    }
  }
}


/* Location:           C:\Users\spiderbob007\Desktop\JavaTree\
 * Qualified Name:     jsx11a
 * JD-Core Version:    0.7.0.1
 */