package com.google.android.gms.ads.internal.renderer.nativeads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.a;
import com.google.android.gms.ads.internal.util.c;
import java.util.List;

final class l
  implements com.google.android.gms.ads.internal.util.future.f
{
  l(f paramf, String paramString, Integer paramInteger1, Integer paramInteger2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  private a a(List paramList)
  {
    if (paramList != null)
      while (true)
      {
        try
        {
          if (paramList.isEmpty())
            break;
          String str = this.a;
          List localList = f.a(paramList);
          Integer localInteger1 = this.b;
          Integer localInteger2 = this.c;
          if (this.d > 0)
          {
            localInteger3 = Integer.valueOf(this.d);
            a locala = new a(str, localList, localInteger1, localInteger2, localInteger3, this.e + this.f, this.g);
            return locala;
          }
        }
        catch (RemoteException localRemoteException)
        {
          c.b("Could not get attribution icon", localRemoteException);
          return null;
        }
        Integer localInteger3 = null;
      }
    return null;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.nativeads.l
 * JD-Core Version:    0.6.0
 */