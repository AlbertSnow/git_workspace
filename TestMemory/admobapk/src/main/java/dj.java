import android.os.Build.VERSION;

public final class dj
{
  public static final dk a;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new dn();
      return;
    }
    if (i >= 11)
    {
      a = new dm();
      return;
    }
    a = new dl();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     dj
 * JD-Core Version:    0.6.0
 */