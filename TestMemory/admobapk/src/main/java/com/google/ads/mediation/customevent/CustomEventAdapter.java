package com.google.ads.mediation.customevent;

import android.view.View;
import com.google.ads.mediation.j;
import com.google.ads.mediation.l;
import com.google.android.gms.ads.mediation.customevent.f;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class CustomEventAdapter
  implements j, l
{
  private c a;
  private d b;

  private static Object a(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString).newInstance();
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      String str = String.valueOf(localThrowable.getMessage());
      com.google.android.gms.ads.internal.util.client.e.e(46 + String.valueOf(paramString).length() + String.valueOf(str).length() + "Could not instantiate custom event adapter: " + paramString + ". " + str);
    }
    return null;
  }

  public final Class a()
  {
    return f.class;
  }

  public final Class b()
  {
    return e.class;
  }

  public final View c()
  {
    return null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.customevent.CustomEventAdapter
 * JD-Core Version:    0.6.0
 */