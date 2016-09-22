package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.webview.b;
import com.google.android.gms.ads.internal.webview.c;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@a
@TargetApi(8)
public class ad
{
  public static ad a(int paramInt)
  {
    if (paramInt >= 21)
      return new am();
    if (paramInt >= 19)
      return new al();
    if (paramInt >= 18)
      return new aj();
    if (paramInt >= 17)
      return new ai();
    if (paramInt >= 16)
      return new ak();
    if (paramInt >= 14)
      return new ah();
    if (paramInt >= 11)
      return new af();
    if (paramInt >= 9)
      return new ae();
    return new ad();
  }

  public static boolean a(b paramb)
  {
    if (paramb == null)
      return false;
    paramb.onPause();
    return true;
  }

  public static boolean b(b paramb)
  {
    if (paramb == null)
      return false;
    paramb.onResume();
    return true;
  }

  public int a()
  {
    return 0;
  }

  public Drawable a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean, float paramFloat)
  {
    return new BitmapDrawable(paramContext.getResources(), paramBitmap);
  }

  public c a(b paramb, boolean paramBoolean)
  {
    return new c(paramb, paramBoolean);
  }

  public String a(Context paramContext)
  {
    return "";
  }

  public String a(SslError paramSslError)
  {
    return "";
  }

  public Set a(Uri paramUri)
  {
    if (paramUri.isOpaque())
      return Collections.emptySet();
    String str = paramUri.getEncodedQuery();
    if (str == null)
      return Collections.emptySet();
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    int i = 0;
    do
    {
      int j = str.indexOf('&', i);
      if (j == -1)
        j = str.length();
      int k = str.indexOf('=', i);
      if ((k > j) || (k == -1))
        k = j;
      localLinkedHashSet.add(Uri.decode(str.substring(i, k)));
      i = j + 1;
    }
    while (i < str.length());
    return Collections.unmodifiableSet(localLinkedHashSet);
  }

  public void a(Activity paramActivity, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    Window localWindow = paramActivity.getWindow();
    if ((localWindow != null) && (localWindow.getDecorView() != null) && (localWindow.getDecorView().getViewTreeObserver() != null))
      a(localWindow.getDecorView().getViewTreeObserver(), paramOnGlobalLayoutListener);
  }

  public void a(View paramView, Drawable paramDrawable)
  {
    paramView.setBackgroundDrawable(paramDrawable);
  }

  public void a(ViewTreeObserver paramViewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    paramViewTreeObserver.removeGlobalOnLayoutListener(paramOnGlobalLayoutListener);
  }

  public boolean a(DownloadManager.Request paramRequest)
  {
    return false;
  }

  public boolean a(Context paramContext, WebSettings paramWebSettings)
  {
    return false;
  }

  public boolean a(View paramView)
  {
    return (paramView.getWindowToken() != null) || (paramView.getWindowVisibility() != 8);
  }

  public boolean a(Window paramWindow)
  {
    return false;
  }

  public int b()
  {
    return 1;
  }

  public CookieManager b(Context paramContext)
  {
    CookieSyncManager.createInstance(paramContext);
    return CookieManager.getInstance();
  }

  public boolean b(View paramView)
  {
    return false;
  }

  public int c()
  {
    return 5;
  }

  public WebChromeClient c(b paramb)
  {
    return null;
  }

  public boolean c(View paramView)
  {
    return false;
  }

  public ViewGroup.LayoutParams d()
  {
    return new ViewGroup.LayoutParams(-2, -2);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.ad
 * JD-Core Version:    0.6.0
 */