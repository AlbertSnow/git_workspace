import android.content.Context;

final class apu
  implements aqa
{
  public final aqc a(Context paramContext, String paramString, aqb paramaqb)
  {
    aqc localaqc = new aqc();
    localaqc.a = paramaqb.a(paramContext, paramString);
    if (localaqc.a != 0)
      localaqc.c = -1;
    do
    {
      return localaqc;
      localaqc.b = paramaqb.a(paramContext, paramString, true);
    }
    while (localaqc.b == 0);
    localaqc.c = 1;
    return localaqc;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     apu
 * JD-Core Version:    0.6.0
 */