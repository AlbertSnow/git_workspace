import android.net.Uri;

public final class kv
{
  public final Uri a;
  public final long b;
  public final long c;
  public final int d;
  private long e;
  private String f;

  private kv(Uri paramUri, long paramLong1, long paramLong2, long paramLong3, String paramString, int paramInt)
  {
    boolean bool2;
    boolean bool3;
    if (paramLong1 >= 0L)
    {
      bool2 = bool1;
      lp.a(bool2);
      if (paramLong2 < 0L)
        break label99;
      bool3 = bool1;
      label33: lp.a(bool3);
      if ((paramLong3 <= 0L) && (paramLong3 != -1L))
        break label105;
    }
    while (true)
    {
      lp.a(bool1);
      this.a = paramUri;
      this.e = paramLong1;
      this.b = paramLong2;
      this.c = paramLong3;
      this.f = paramString;
      this.d = 0;
      return;
      bool2 = false;
      break;
      label99: bool3 = false;
      break label33;
      label105: bool1 = false;
    }
  }

  public kv(Uri paramUri, long paramLong1, long paramLong2, String paramString)
  {
    this(paramUri, paramLong1, paramLong1, -1L, null, 0);
  }

  public final String toString()
  {
    String str1 = String.valueOf(this.a);
    long l1 = this.e;
    long l2 = this.b;
    long l3 = this.c;
    String str2 = this.f;
    int i = this.d;
    return 91 + String.valueOf(str1).length() + String.valueOf(str2).length() + "DataSpec[" + str1 + ", " + l1 + ", " + l2 + ", " + l3 + ", " + str2 + ", " + i + "]";
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     kv
 * JD-Core Version:    0.6.0
 */