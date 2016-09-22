package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import apj;
import apn;
import com.google.android.gms.ads.internal.formats.d;
import com.google.android.gms.ads.internal.gmsg.t;
import com.google.android.gms.ads.internal.mediation.client.n;
import com.google.android.gms.ads.internal.mediation.i;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class af
{
  public static View a(com.google.android.gms.ads.internal.state.a parama)
  {
    if (parama == null)
    {
      com.google.android.gms.ads.internal.util.c.c("AdState is null");
      return null;
    }
    if ((b(parama)) && (parama.b != null))
      return parama.b.b();
    while (true)
    {
      try
      {
        if (parama.o != null)
        {
          localapj = parama.o.a();
          if (localapj != null)
            continue;
          com.google.android.gms.ads.internal.util.c.e("View in mediation adapter is null.");
          return null;
          View localView = (View)apn.a(localapj);
          return localView;
        }
      }
      catch (RemoteException localRemoteException)
      {
        com.google.android.gms.ads.internal.util.c.c("Could not get View from mediation adapter.", localRemoteException);
        return null;
      }
      apj localapj = null;
    }
  }

  static t a(n paramn, com.google.android.gms.ads.internal.mediation.client.q paramq, q paramq1)
  {
    return new ak(paramn, paramq1, paramq);
  }

  private static String a(Bitmap paramBitmap)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    if (paramBitmap == null)
    {
      com.google.android.gms.ads.internal.util.c.e("Bitmap is null. Returning empty string");
      return "";
    }
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
    String str1 = Base64.encodeToString(localByteArrayOutputStream.toByteArray(), 0);
    String str2 = String.valueOf("data:image/png;base64,");
    String str3 = String.valueOf(str1);
    if (str3.length() != 0)
      return str2.concat(str3);
    return new String(str2);
  }

  static String a(com.google.android.gms.ads.internal.formats.client.a parama)
  {
    if (parama == null)
    {
      com.google.android.gms.ads.internal.util.c.e("Image is null. Returning empty string");
      return "";
    }
    try
    {
      Uri localUri = parama.b();
      if (localUri != null)
      {
        String str = localUri.toString();
        return str;
      }
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.c.e("Unable to get image uri. Trying data uri next");
    }
    return b(parama);
  }

  static JSONObject a(Bundle paramBundle, String paramString)
  {
    JSONObject localJSONObject1 = new JSONObject();
    if ((paramBundle == null) || (TextUtils.isEmpty(paramString)))
      return localJSONObject1;
    JSONObject localJSONObject2 = new JSONObject(paramString);
    Iterator localIterator = localJSONObject2.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!paramBundle.containsKey(str))
        continue;
      if ("image".equals(localJSONObject2.getString(str)))
      {
        Object localObject = paramBundle.get(str);
        if ((localObject instanceof Bitmap))
        {
          localJSONObject1.put(str, a((Bitmap)localObject));
          continue;
        }
        com.google.android.gms.ads.internal.util.c.e("Invalid type. An image type extra should return a bitmap");
        continue;
      }
      if ((paramBundle.get(str) instanceof Bitmap))
      {
        com.google.android.gms.ads.internal.util.c.e("Invalid asset type. Bitmap should be returned only for image type");
        continue;
      }
      localJSONObject1.put(str, String.valueOf(paramBundle.get(str)));
    }
    return localJSONObject1;
  }

  public static boolean a(com.google.android.gms.ads.internal.webview.b paramb, i parami, CountDownLatch paramCountDownLatch)
  {
    while (true)
    {
      try
      {
        View localView = paramb.b();
        if (localView != null)
          continue;
        com.google.android.gms.ads.internal.util.c.e("AdWebView is null");
        i = 0;
        if (i != 0)
          continue;
        paramCountDownLatch.countDown();
        return i;
        localView.setVisibility(4);
        List localList = parami.b.o;
        if ((localList != null) && (!localList.isEmpty()))
          continue;
        com.google.android.gms.ads.internal.util.c.e("No template ids present in mediation response");
        i = 0;
        continue;
        paramb.l().a("/nativeExpressAssetsLoaded", new ai(paramCountDownLatch));
        paramb.l().a("/nativeExpressAssetsLoadingFailed", new aj(paramCountDownLatch));
        n localn = parami.c.h();
        com.google.android.gms.ads.internal.mediation.client.q localq = parami.c.i();
        if ((!localList.contains("2")) || (localn == null))
          continue;
        d locald = new d(localn.a(), localn.b(), localn.c(), localn.d(), localn.e(), localn.f(), localn.g(), localn.h(), null, localn.l());
        String str1 = parami.b.n;
        paramb.l().e = new ag(locald, str1, paramb);
        str2 = parami.b.l;
        String str3 = parami.b.m;
        if (str3 == null)
          continue;
        paramb.loadDataWithBaseURL(str3, str2, "text/html", "UTF-8", null);
        break label459;
        if ((!localList.contains("1")) || (localq == null))
          continue;
        com.google.android.gms.ads.internal.formats.e locale = new com.google.android.gms.ads.internal.formats.e(localq.a(), localq.b(), localq.c(), localq.d(), localq.e(), localq.f(), null, localq.j());
        String str4 = parami.b.n;
        paramb.l().e = new ah(locale, str4, paramb);
        continue;
      }
      catch (RemoteException localRemoteException)
      {
        String str2;
        com.google.android.gms.ads.internal.util.c.c("Unable to invoke load assets", localRemoteException);
        i = 0;
        continue;
        com.google.android.gms.ads.internal.util.c.e("No matching template id and mapper");
        i = 0;
        continue;
        paramb.loadData(str2, "text/html", "UTF-8");
      }
      catch (RuntimeException localRuntimeException)
      {
        paramCountDownLatch.countDown();
        throw localRuntimeException;
      }
      label459: int i = 1;
    }
  }

  private static String b(com.google.android.gms.ads.internal.formats.client.a parama)
  {
    Drawable localDrawable;
    try
    {
      apj localapj = parama.a();
      if (localapj == null)
      {
        com.google.android.gms.ads.internal.util.c.e("Drawable is null. Returning empty string");
        return "";
      }
      localDrawable = (Drawable)apn.a(localapj);
      if (!(localDrawable instanceof BitmapDrawable))
      {
        com.google.android.gms.ads.internal.util.c.e("Drawable is not an instance of BitmapDrawable. Returning empty string");
        return "";
      }
    }
    catch (RemoteException localRemoteException)
    {
      com.google.android.gms.ads.internal.util.c.e("Unable to get drawable. Returning empty string");
      return "";
    }
    return a(((BitmapDrawable)localDrawable).getBitmap());
  }

  public static boolean b(com.google.android.gms.ads.internal.state.a parama)
  {
    return (parama != null) && (parama.m) && (parama.n != null) && (parama.n.l != null);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.af
 * JD-Core Version:    0.6.0
 */