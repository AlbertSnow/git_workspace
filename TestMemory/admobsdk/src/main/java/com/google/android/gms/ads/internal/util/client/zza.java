package com.google.android.gms.ads.internal.util.client;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.zze;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzne;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.StringTokenizer;

@zzhb
public class zza
{
  public static final Handler zzMS = new Handler(Looper.getMainLooper());
  private static final String zzMT = AdView.class.getName();
  private static final String zzMU = InterstitialAd.class.getName();
  private static final String zzMV = PublisherAdView.class.getName();
  private static final String zzMW = PublisherInterstitialAd.class.getName();
  private static final String zzMX = SearchAdView.class.getName();
  private static final String zzMY = AdLoader.class.getName();

  public int zzb(Context paramContext, int paramInt)
  {
    return zza(paramContext.getResources().getDisplayMetrics(), paramInt);
  }

  public int zza(DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    return (int)TypedValue.applyDimension(1, paramInt, paramDisplayMetrics);
  }

  public int zzc(Context paramContext, int paramInt)
  {
    WindowManager localWindowManager = (WindowManager)paramContext.getSystemService("window");
    Display localDisplay = localWindowManager.getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplay.getMetrics(localDisplayMetrics);
    return zzb(localDisplayMetrics, paramInt);
  }

  public int zzb(DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    return Math.round(paramInt / paramDisplayMetrics.density);
  }

  public void zza(ViewGroup paramViewGroup, AdSizeParcel paramAdSizeParcel, String paramString1, String paramString2)
  {
    zzb.zzaK(paramString2);
    zza(paramViewGroup, paramAdSizeParcel, paramString1, -65536, -16777216);
  }

  public void zza(ViewGroup paramViewGroup, AdSizeParcel paramAdSizeParcel, String paramString)
  {
    zza(paramViewGroup, paramAdSizeParcel, paramString, -16777216, -1);
  }

  private void zza(ViewGroup paramViewGroup, AdSizeParcel paramAdSizeParcel, String paramString, int paramInt1, int paramInt2)
  {
    if (paramViewGroup.getChildCount() != 0)
      return;
    Context localContext = paramViewGroup.getContext();
    TextView localTextView = new TextView(localContext);
    localTextView.setGravity(17);
    localTextView.setText(paramString);
    localTextView.setTextColor(paramInt1);
    localTextView.setBackgroundColor(paramInt2);
    FrameLayout localFrameLayout = new FrameLayout(localContext);
    localFrameLayout.setBackgroundColor(paramInt1);
    int i = zzb(localContext, 3);
    localFrameLayout.addView(localTextView, new FrameLayout.LayoutParams(paramAdSizeParcel.widthPixels - i, paramAdSizeParcel.heightPixels - i, 17));
    paramViewGroup.addView(localFrameLayout, paramAdSizeParcel.widthPixels, paramAdSizeParcel.heightPixels);
  }

  public String zzT(Context paramContext)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    String str = localContentResolver == null ? null : Settings.Secure.getString(localContentResolver, "android_id");
    return zzaH((str == null) || (zzhI()) ? "emulator" : str);
  }

  public boolean zzhI()
  {
    return Build.DEVICE.startsWith("generic");
  }

  public boolean zzhJ()
  {
    return Looper.myLooper() == Looper.getMainLooper();
  }

  public String zzaH(String paramString)
  {
    int i = 0;
    while (i < 2)
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        localMessageDigest.update(paramString.getBytes());
        return String.format(Locale.US, "%032X", new Object[] { new BigInteger(1, localMessageDigest.digest()) });
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        i++;
      }
    return null;
  }

  public boolean zzU(Context paramContext)
  {
    return 0 == zze.isGooglePlayServicesAvailable(paramContext);
  }

  public boolean zzV(Context paramContext)
  {
    if (paramContext.getResources().getConfiguration().orientation != 2)
      return false;
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    return (int)(localDisplayMetrics.heightPixels / localDisplayMetrics.density) < 600;
  }

  public boolean zzW(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    WindowManager localWindowManager = (WindowManager)paramContext.getSystemService("window");
    Display localDisplay = localWindowManager.getDefaultDisplay();
    int i = 0;
    int j = 0;
    if (zzne.zzsi())
    {
      localDisplay.getRealMetrics(localDisplayMetrics);
      i = localDisplayMetrics.heightPixels;
      j = localDisplayMetrics.widthPixels;
    }
    else
    {
      try
      {
        i = ((Integer)Display.class.getMethod("getRawHeight", new Class[0]).invoke(localDisplay, new Object[0])).intValue();
        j = ((Integer)Display.class.getMethod("getRawWidth", new Class[0]).invoke(localDisplay, new Object[0])).intValue();
      }
      catch (Exception localException)
      {
        return false;
      }
    }
    localDisplay.getMetrics(localDisplayMetrics);
    int k = localDisplayMetrics.heightPixels;
    int m = localDisplayMetrics.widthPixels;
    return (k == i) && (m == j);
  }

  public int zzX(Context paramContext)
  {
    int i = paramContext.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
    if (i > 0)
      return paramContext.getResources().getDimensionPixelSize(i);
    return 0;
  }

  @Nullable
  public String zza(StackTraceElement[] paramArrayOfStackTraceElement, String paramString)
  {
    String str1 = null;
    for (int i = 0; i + 1 < paramArrayOfStackTraceElement.length; i++)
    {
      StackTraceElement localStackTraceElement = paramArrayOfStackTraceElement[i];
      String str3 = localStackTraceElement.getClassName();
      String str4 = localStackTraceElement.getMethodName();
      if ((!"loadAd".equalsIgnoreCase(str4)) || ((!zzMT.equalsIgnoreCase(str3)) && (!zzMU.equalsIgnoreCase(str3)) && (!zzMV.equalsIgnoreCase(str3)) && (!zzMW.equalsIgnoreCase(str3)) && (!zzMX.equalsIgnoreCase(str3)) && (!zzMY.equalsIgnoreCase(str3))))
        continue;
      str1 = paramArrayOfStackTraceElement[(i + 1)].getClassName();
      break;
    }
    if (paramString != null)
    {
      String str2 = zzb(paramString, ".", 3);
      if ((str1 != null) && (!str1.contains(str2)))
        return str1;
    }
    return null;
  }

  String zzb(String paramString1, String paramString2, int paramInt)
  {
    StringTokenizer localStringTokenizer = new StringTokenizer(paramString1, paramString2);
    StringBuilder localStringBuilder = new StringBuilder();
    if ((paramInt-- > 0) && (localStringTokenizer.hasMoreElements()))
      localStringBuilder.append(localStringTokenizer.nextToken());
    else
      return paramString1;
    while ((paramInt-- > 0) && (localStringTokenizer.hasMoreElements()))
      localStringBuilder.append(".").append(localStringTokenizer.nextToken());
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.client.zza
 * JD-Core Version:    0.6.0
 */