import java.awt.FontMetrics;
import java.util.StringTokenizer;

final class jsx11b
{
  private jsx11 app;
  private jsx11a z2;
  private int z3;
  private int z9;
  private int z7;
  private int z6;
  private int z8;
  private int z5;
  private int z0;
  private int z1;
  private int[] z4 = { -1, -1 };
  private String z10;
  private String z13;
  private String z12;
  private String z11;
  
  jsx11b(jsx11 paramjsx11, jsx11a paramjsx11a, String[] paramArrayOfString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.app = paramjsx11;
    this.z2 = paramjsx11a;
    this.z3 = paramInt1;
    this.z9 = paramInt2;
    this.z7 = (paramInt2 == 1 ? paramInt3 - 1 : paramInt3);
    this.z6 = paramInt4;
    this.z8 = 0;
    StringTokenizer localStringTokenizer = new StringTokenizer(paramArrayOfString[0], String.valueOf(paramjsx11.q102[3]));
    int j = localStringTokenizer.countTokens();
    String str;
    for (int i = 0; i < j; i++)
    {
      str = localStringTokenizer.nextToken().trim();
      if (i == 0)
      {
        if (str.startsWith("~"))
        {
          if (paramInt2 == 0) {
            paramjsx11a.q18[21] = (paramjsx11a.q18[20] + 1);
          }
          this.z8 = 1;
        }
        this.z10 = new String(str.substring(this.z8));
      }
      else if (i < 3)
      {
        try
        {
          this.z4[(i - 1)] = (Integer.parseInt(str) - 1);
        }
        catch (NumberFormatException localNumberFormatException)
        {
          this.z4[(i - 1)] = -1;
        }
      }
    }
    this.z0 = (paramjsx11a.q15[paramInt2].stringWidth(this.z10) + 4);
    if ((this.z4[0] > -1) && (this.z4[1] == -1)) {
      this.z4[1] = this.z4[0];
    }
    localStringTokenizer = new StringTokenizer(paramArrayOfString[1], ",");
    j = localStringTokenizer.countTokens();
    for (i = 0; i < j; i++)
    {
      str = localStringTokenizer.nextToken().trim();
      if (i == 0) {
        this.z13 = new String(str);
      } else {
        this.z12 = new String(str);
      }
    }
    this.z11 = new String(paramArrayOfString[2]);
    this.z1 = (paramjsx11a.q15[3].stringWidth(this.z11) + 4);
    if (paramInt2 == 0) {
      this.z5 = paramjsx11a.q18[5];
    }
  }
  
  int q87(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.z5 = (paramInt3 + this.z7 * paramInt2);
    if ((this.z9 == 1) && (this.z8 == 1) && (this.z7 == 0))
    {
      this.z8 = paramInt4;
      if (paramInt1 > 0) {
        paramInt4 = 0;
      }
    }
    return paramInt4;
  }
  
  private String checkStr(String paramString)
  {
    if ((paramString == null) || (paramString.length() < 2)) {
      return "";
    }
    return paramString;
  }
  
  String q78()
  {
    if (this.z11.equals("=")) {
      return checkStr(this.z10);
    }
    return checkStr(this.z11);
  }
  
  int q77()
  {
    return this.z3;
  }
  
  int q85()
  {
    return this.z9;
  }
  
  int q76()
  {
    return this.z0;
  }
  
  String q75()
  {
    return checkStr(this.z10);
  }
  
  int q83()
  {
    return this.z8;
  }
  
  void q88(int paramInt)
  {
    this.z8 = paramInt;
  }
  
  String q86()
  {
    return checkStr(this.z13);
  }
  
  String q84()
  {
    return checkStr(this.z12);
  }
  
  int q79()
  {
    return this.z4[this.z8];
  }
  
  int q80()
  {
    return this.z5;
  }
  
  int q82()
  {
    return this.z7;
  }
  
  int q81()
  {
    return this.z6;
  }
}


/* Location:           C:\Users\spiderbob007\Desktop\JavaTree\
 * Qualified Name:     jsx11b
 * JD-Core Version:    0.7.0.1
 */