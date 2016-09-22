import android.content.Context;

final class apv
  implements aqa
{
  public final aqc a(Context paramContext, String paramString, aqb paramaqb)
  {
    aqc localaqc = new aqc();
    localaqc.a = paramaqb.a(paramContext, paramString);
    localaqc.b = paramaqb.a(paramContext, paramString, true);
    if ((localaqc.a == 0) && (localaqc.b == 0))
    {
      localaqc.c = 0;
      return localaqc;
    }
    if (localaqc.a >= localaqc.b)
    {
      localaqc.c = -1;
      return localaqc;
    }
    localaqc.c = 1;
    return localaqc;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     apv
 * JD-Core Version:    0.6.0
 */