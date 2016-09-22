import android.content.Context;

final class apx
  implements aqa
{
  public final aqc a(Context paramContext, String paramString, aqb paramaqb)
  {
    aqc localaqc = new aqc();
    localaqc.a = paramaqb.a(paramContext, paramString);
    if (localaqc.a != 0);
    for (localaqc.b = paramaqb.a(paramContext, paramString, false); (localaqc.a == 0) && (localaqc.b == 0); localaqc.b = paramaqb.a(paramContext, paramString, true))
    {
      localaqc.c = 0;
      return localaqc;
    }
    if (localaqc.b >= localaqc.a)
    {
      localaqc.c = 1;
      return localaqc;
    }
    localaqc.c = -1;
    return localaqc;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     apx
 * JD-Core Version:    0.6.0
 */