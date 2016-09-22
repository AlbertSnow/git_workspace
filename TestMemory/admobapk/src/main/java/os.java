import android.content.ContentResolver;
import android.content.Context;

final class os
{
  final ContentResolver a;

  os(Context paramContext)
  {
    if (paramContext != null)
      if (or.a == null)
        if (paramContext.checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") != 0)
          break label47;
    label47: for (boolean bool = true; ; bool = false)
    {
      or.a = Boolean.valueOf(bool);
      if (or.a.booleanValue())
        break;
      this.a = null;
      return;
    }
    this.a = paramContext.getContentResolver();
    ase.a(this.a, new String[] { "gms:playlog:service:sampling_" });
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     os
 * JD-Core Version:    0.6.0
 */