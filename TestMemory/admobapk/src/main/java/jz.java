import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class jz extends jy
{
  public final long N;
  public final List O = new ArrayList();
  public final List P = new ArrayList();

  public jz(int paramInt, long paramLong)
  {
    super(paramInt);
    this.N = paramLong;
  }

  public final ka c(int paramInt)
  {
    int i = this.O.size();
    for (int j = 0; j < i; j++)
    {
      ka localka = (ka)this.O.get(j);
      if (localka.M == paramInt)
        return localka;
    }
    return null;
  }

  public final jz d(int paramInt)
  {
    int i = this.P.size();
    for (int j = 0; j < i; j++)
    {
      jz localjz = (jz)this.P.get(j);
      if (localjz.M == paramInt)
        return localjz;
    }
    return null;
  }

  public final String toString()
  {
    String str1 = b(this.M);
    String str2 = String.valueOf(Arrays.toString(this.O.toArray(new ka[0])));
    String str3 = String.valueOf(Arrays.toString(this.P.toArray(new jz[0])));
    return 22 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + str1 + " leaves: " + str2 + " containers: " + str3;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     jz
 * JD-Core Version:    0.6.0
 */