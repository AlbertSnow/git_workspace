package com.google.android.gms.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.media.AudioManager;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.zze;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public class zzir
{
  public static final Handler zzMc = new zzio(Looper.getMainLooper());
  private final Object zzpV = new Object();
  private boolean zzMd = true;
  private String zzzN;
  private boolean zzMe = false;

  public void zza(Context paramContext, String paramString, boolean paramBoolean, HttpURLConnection paramHttpURLConnection)
  {
    zza(paramContext, paramString, paramBoolean, paramHttpURLConnection, false);
  }

  public void zza(Context paramContext, String paramString, boolean paramBoolean1, HttpURLConnection paramHttpURLConnection, boolean paramBoolean2)
  {
    paramHttpURLConnection.setConnectTimeout(60000);
    paramHttpURLConnection.setInstanceFollowRedirects(paramBoolean1);
    paramHttpURLConnection.setReadTimeout(60000);
    paramHttpURLConnection.setRequestProperty("User-Agent", zze(paramContext, paramString));
    paramHttpURLConnection.setUseCaches(paramBoolean2);
  }

  public void zza(Context paramContext, String paramString1, boolean paramBoolean, HttpURLConnection paramHttpURLConnection, String paramString2)
  {
    paramHttpURLConnection.setConnectTimeout(60000);
    paramHttpURLConnection.setInstanceFollowRedirects(paramBoolean);
    paramHttpURLConnection.setReadTimeout(60000);
    paramHttpURLConnection.setRequestProperty("User-Agent", paramString2);
    paramHttpURLConnection.setUseCaches(false);
  }

  public boolean zzI(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    PackageManager localPackageManager = paramContext.getPackageManager();
    ResolveInfo localResolveInfo = localPackageManager.resolveActivity(localIntent, 65536);
    int i = 1;
    if ((localResolveInfo == null) || (localResolveInfo.activityInfo == null))
    {
      zzin.zzaK("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
      i = 0;
    }
    else
    {
      String str = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
      if ((localResolveInfo.activityInfo.configChanges & 0x10) == 0)
      {
        zzin.zzaK(String.format(str, new Object[] { "keyboard" }));
        i = 0;
      }
      if ((localResolveInfo.activityInfo.configChanges & 0x20) == 0)
      {
        zzin.zzaK(String.format(str, new Object[] { "keyboardHidden" }));
        i = 0;
      }
      if ((localResolveInfo.activityInfo.configChanges & 0x80) == 0)
      {
        zzin.zzaK(String.format(str, new Object[] { "orientation" }));
        i = 0;
      }
      if ((localResolveInfo.activityInfo.configChanges & 0x100) == 0)
      {
        zzin.zzaK(String.format(str, new Object[] { "screenLayout" }));
        i = 0;
      }
      if ((localResolveInfo.activityInfo.configChanges & 0x200) == 0)
      {
        zzin.zzaK(String.format(str, new Object[] { "uiMode" }));
        i = 0;
      }
      if ((localResolveInfo.activityInfo.configChanges & 0x400) == 0)
      {
        zzin.zzaK(String.format(str, new Object[] { "screenSize" }));
        i = 0;
      }
      if ((localResolveInfo.activityInfo.configChanges & 0x800) == 0)
      {
        zzin.zzaK(String.format(str, new Object[] { "smallestScreenSize" }));
        i = 0;
      }
    }
    return i;
  }

  public boolean zza(PackageManager paramPackageManager, String paramString1, String paramString2)
  {
    return paramPackageManager.checkPermission(paramString2, paramString1) == 0;
  }

  public boolean zzhq()
  {
    return this.zzMd;
  }

  public void zza(Context paramContext, String paramString, List<String> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      new zziy(paramContext, paramString, str).zzhn();
    }
  }

  public void zzc(Context paramContext, String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString2);
    zza(paramContext, paramString1, localArrayList);
  }

  public void zza(Context paramContext, String paramString1, List<String> paramList, String paramString2)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      new zziy(paramContext, paramString1, str, paramString2).zzhn();
    }
  }

  public String zza(InputStreamReader paramInputStreamReader)
    throws IOException
  {
    StringBuilder localStringBuilder = new StringBuilder(8192);
    char[] arrayOfChar = new char[2048];
    int i;
    while ((i = paramInputStreamReader.read(arrayOfChar)) != -1)
      localStringBuilder.append(arrayOfChar, 0, i);
    return localStringBuilder.toString();
  }

  public boolean zzJ(Context paramContext)
  {
    if (this.zzMe)
      return false;
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.USER_PRESENT");
    localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
    paramContext.getApplicationContext().registerReceiver(new zza(null), localIntentFilter);
    this.zzMe = true;
    return true;
  }

  public void zza(Context paramContext, String paramString, WebSettings paramWebSettings)
  {
    paramWebSettings.setUserAgentString(zze(paramContext, paramString));
  }

  String zzhr()
  {
    StringBuffer localStringBuffer = new StringBuffer(256);
    localStringBuffer.append("Mozilla/5.0 (Linux; U; Android");
    if (Build.VERSION.RELEASE != null)
      localStringBuffer.append(" ").append(Build.VERSION.RELEASE);
    localStringBuffer.append("; ").append(Locale.getDefault());
    if (Build.DEVICE != null)
    {
      localStringBuffer.append("; ").append(Build.DEVICE);
      if (Build.DISPLAY != null)
        localStringBuffer.append(" Build/").append(Build.DISPLAY);
    }
    localStringBuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
    return localStringBuffer.toString();
  }

  public String zze(Context paramContext, String paramString)
  {
    synchronized (this.zzpV)
    {
      if (this.zzzN != null)
        return this.zzzN;
      try
      {
        this.zzzN = zzr.zzbE().getDefaultUserAgent(paramContext);
      }
      catch (Exception localException1)
      {
      }
      if (TextUtils.isEmpty(this.zzzN))
      {
        if (!com.google.android.gms.ads.internal.client.zzn.zzcS().zzhJ())
        {
          this.zzzN = null;
          zzMc.post(new Runnable(paramContext)
          {
            public void run()
            {
              synchronized (zzir.zza(zzir.this))
              {
                zzir.zza(zzir.this, zzir.this.zzK(this.zzxh));
                zzir.zza(zzir.this).notifyAll();
              }
            }
          });
          while (this.zzzN == null)
            try
            {
              this.zzpV.wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              this.zzzN = zzhr();
              zzin.zzaK("Interrupted, use default user agent: " + this.zzzN);
            }
        }
        try
        {
          this.zzzN = zzK(paramContext);
        }
        catch (Exception localException2)
        {
          this.zzzN = zzhr();
        }
      }
      this.zzzN = (this.zzzN + " (Mobile; " + paramString + ")");
      return this.zzzN;
    }
  }

  protected String zzK(Context paramContext)
  {
    return new WebView(paramContext).getSettings().getUserAgentString();
  }

  public boolean zza(ClassLoader paramClassLoader, Class<?> paramClass, String paramString)
  {
    try
    {
      Class localClass = Class.forName(paramString, false, paramClassLoader);
      return paramClass.isAssignableFrom(localClass);
    }
    catch (Throwable localThrowable)
    {
    }
    return false;
  }

  public String zzaC(String paramString)
  {
    return Uri.parse(paramString).buildUpon().query(null).build().toString();
  }

  public JSONObject zzG(Map<String, ?> paramMap)
    throws JSONException
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        zza(localJSONObject, str, paramMap.get(str));
      }
      return localJSONObject;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    throw new JSONException("Could not convert map to JSON: " + localClassCastException.getMessage());
  }

  private JSONObject zzf(Bundle paramBundle)
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      zza(localJSONObject, str, paramBundle.get(str));
    }
    return localJSONObject;
  }

  private JSONArray zza(Collection<?> paramCollection)
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      zza(localJSONArray, localObject);
    }
    return localJSONArray;
  }

  JSONArray zza(Object[] paramArrayOfObject)
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    for (Object localObject : paramArrayOfObject)
      zza(localJSONArray, localObject);
    return localJSONArray;
  }

  private void zza(JSONArray paramJSONArray, Object paramObject)
    throws JSONException
  {
    if ((paramObject instanceof Bundle))
    {
      paramJSONArray.put(zzf((Bundle)paramObject));
    }
    else if ((paramObject instanceof Map))
    {
      Map localMap = (Map)paramObject;
      paramJSONArray.put(zzG(localMap));
    }
    else if ((paramObject instanceof Collection))
    {
      paramJSONArray.put(zza((Collection)paramObject));
    }
    else if ((paramObject instanceof Object[]))
    {
      paramJSONArray.put(zza((Object[])(Object[])paramObject));
    }
    else
    {
      paramJSONArray.put(paramObject);
    }
  }

  private void zza(JSONObject paramJSONObject, String paramString, Object paramObject)
    throws JSONException
  {
    if ((paramObject instanceof Bundle))
    {
      paramJSONObject.put(paramString, zzf((Bundle)paramObject));
    }
    else if ((paramObject instanceof Map))
    {
      Map localMap = (Map)paramObject;
      paramJSONObject.put(paramString, zzG(localMap));
    }
    else if ((paramObject instanceof Collection))
    {
      paramJSONObject.put(paramString != null ? paramString : "null", zza((Collection)paramObject));
    }
    else if ((paramObject instanceof Object[]))
    {
      paramJSONObject.put(paramString, zza(Arrays.asList((Object[])(Object[])paramObject)));
    }
    else
    {
      paramJSONObject.put(paramString, paramObject);
    }
  }

  public Map<String, String> zze(Uri paramUri)
  {
    if (paramUri == null)
      return null;
    HashMap localHashMap = new HashMap();
    Set localSet = zzr.zzbE().zzf(paramUri);
    Iterator localIterator = localSet.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, paramUri.getQueryParameter(str));
    }
    return localHashMap;
  }

  public String zzhs()
  {
    UUID localUUID = UUID.randomUUID();
    byte[] arrayOfByte1 = BigInteger.valueOf(localUUID.getLeastSignificantBits()).toByteArray();
    byte[] arrayOfByte2 = BigInteger.valueOf(localUUID.getMostSignificantBits()).toByteArray();
    String str = new BigInteger(1, arrayOfByte1).toString();
    for (int i = 0; i < 2; i++)
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        localMessageDigest.update(arrayOfByte1);
        localMessageDigest.update(arrayOfByte2);
        byte[] arrayOfByte3 = new byte[8];
        System.arraycopy(localMessageDigest.digest(), 0, arrayOfByte3, 0, 8);
        str = new BigInteger(1, arrayOfByte3).toString();
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
      }
    return str;
  }

  public int zzaD(String paramString)
  {
    try
    {
      return Integer.parseInt(paramString);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      zzin.zzaK("Could not parse value:" + localNumberFormatException);
    }
    return 0;
  }

  public String zzht()
  {
    String str1 = Build.MANUFACTURER;
    String str2 = Build.MODEL;
    return str1 + " " + str2;
  }

  protected int[] zzhu()
  {
    return new int[] { 0, 0 };
  }

  public int[] zze(Activity paramActivity)
  {
    Window localWindow = paramActivity.getWindow();
    if (localWindow != null)
    {
      View localView = localWindow.findViewById(16908290);
      if (localView != null)
        return new int[] { localView.getWidth(), localView.getHeight() };
    }
    return zzhu();
  }

  public int[] zzf(Activity paramActivity)
  {
    int[] arrayOfInt = zze(paramActivity);
    return new int[] { com.google.android.gms.ads.internal.client.zzn.zzcS().zzc(paramActivity, arrayOfInt[0]), com.google.android.gms.ads.internal.client.zzn.zzcS().zzc(paramActivity, arrayOfInt[1]) };
  }

  public int[] zzg(Activity paramActivity)
  {
    Window localWindow = paramActivity.getWindow();
    if (localWindow != null)
    {
      View localView = localWindow.findViewById(16908290);
      if (localView != null)
        return new int[] { localView.getTop(), localView.getBottom() };
    }
    return zzhu();
  }

  public int[] zzh(Activity paramActivity)
  {
    int[] arrayOfInt = zzg(paramActivity);
    return new int[] { com.google.android.gms.ads.internal.client.zzn.zzcS().zzc(paramActivity, arrayOfInt[0]), com.google.android.gms.ads.internal.client.zzn.zzcS().zzc(paramActivity, arrayOfInt[1]) };
  }

  public boolean zzaE(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return false;
    return paramString.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
  }

  public void zza(Activity paramActivity, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    Window localWindow = paramActivity.getWindow();
    if ((localWindow != null) && (localWindow.getDecorView() != null) && (localWindow.getDecorView().getViewTreeObserver() != null))
      localWindow.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(paramOnGlobalLayoutListener);
  }

  public void zza(Activity paramActivity, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    Window localWindow = paramActivity.getWindow();
    if ((localWindow != null) && (localWindow.getDecorView() != null) && (localWindow.getDecorView().getViewTreeObserver() != null))
      localWindow.getDecorView().getViewTreeObserver().addOnScrollChangedListener(paramOnScrollChangedListener);
  }

  public void zzb(Activity paramActivity, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    Window localWindow = paramActivity.getWindow();
    if ((localWindow != null) && (localWindow.getDecorView() != null) && (localWindow.getDecorView().getViewTreeObserver() != null))
      localWindow.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(paramOnScrollChangedListener);
  }

  public DisplayMetrics zza(WindowManager paramWindowManager)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    Display localDisplay = paramWindowManager.getDefaultDisplay();
    localDisplay.getMetrics(localDisplayMetrics);
    return localDisplayMetrics;
  }

  public AlertDialog.Builder zzL(Context paramContext)
  {
    return new AlertDialog.Builder(paramContext);
  }

  public zzbl zzM(Context paramContext)
  {
    return new zzbl(paramContext);
  }

  public Bitmap zzk(View paramView)
  {
    paramView.setDrawingCacheEnabled(true);
    Bitmap localBitmap = Bitmap.createBitmap(paramView.getDrawingCache());
    paramView.setDrawingCacheEnabled(false);
    return localBitmap;
  }

  public PopupWindow zza(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return new PopupWindow(paramView, paramInt1, paramInt2, paramBoolean);
  }

  public String zzN(Context paramContext)
  {
    try
    {
      ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
      if (localActivityManager == null)
        return null;
      List localList = localActivityManager.getRunningTasks(1);
      if ((localList != null) && (!localList.isEmpty()))
      {
        ActivityManager.RunningTaskInfo localRunningTaskInfo = (ActivityManager.RunningTaskInfo)localList.get(0);
        if ((localRunningTaskInfo != null) && (localRunningTaskInfo.topActivity != null))
          return localRunningTaskInfo.topActivity.getClassName();
      }
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public String zza(Context paramContext, View paramView, AdSizeParcel paramAdSizeParcel)
  {
    if (!((Boolean)zzbt.zzwz.get()).booleanValue())
      return null;
    try
    {
      JSONObject localJSONObject1 = new JSONObject();
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put("width", paramAdSizeParcel.width);
      localJSONObject2.put("height", paramAdSizeParcel.height);
      localJSONObject1.put("size", localJSONObject2);
      localJSONObject1.put("activity", zzN(paramContext));
      if (!paramAdSizeParcel.zzui)
      {
        JSONArray localJSONArray = new JSONArray();
        View localView = paramView;
        while (localView != null)
        {
          ViewParent localViewParent = localView.getParent();
          if (localViewParent != null)
          {
            int i = -1;
            if ((localViewParent instanceof ViewGroup))
              i = ((ViewGroup)localViewParent).indexOfChild(localView);
            JSONObject localJSONObject3 = new JSONObject();
            localJSONObject3.put("type", localViewParent.getClass().getName());
            localJSONObject3.put("index_of_child", i);
            localJSONArray.put(localJSONObject3);
          }
          if ((localViewParent != null) && ((localViewParent instanceof View)))
            localView = (View)localViewParent;
          else
            localView = null;
        }
        if (localJSONArray.length() > 0)
          localJSONObject1.put("parents", localJSONArray);
      }
      return localJSONObject1.toString();
    }
    catch (JSONException localJSONException)
    {
      zzin.zzd("Fail to get view hierarchy json", localJSONException);
    }
    return null;
  }

  public String zza(zzjp paramzzjp, String paramString)
  {
    return zza(paramzzjp.getContext(), paramzzjp.zzhW(), paramString);
  }

  public String zza(Context paramContext, zzan paramzzan, String paramString)
  {
    if (paramzzan == null)
      return paramString;
    try
    {
      Uri localUri = Uri.parse(paramString);
      if (paramzzan.zzc(localUri))
        localUri = paramzzan.zza(localUri, paramContext);
      return localUri.toString();
    }
    catch (Exception localException)
    {
    }
    return paramString;
  }

  public boolean zzO(Context paramContext)
  {
    try
    {
      ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
      KeyguardManager localKeyguardManager = (KeyguardManager)paramContext.getSystemService("keyguard");
      if ((localActivityManager == null) || (localKeyguardManager == null))
        return false;
      List localList = localActivityManager.getRunningAppProcesses();
      if (localList == null)
        return false;
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
        if (Process.myPid() == localRunningAppProcessInfo.pid)
        {
          if ((localRunningAppProcessInfo.importance != 100) || (localKeyguardManager.inKeyguardRestrictedInputMode()) || (!zzs(paramContext)))
            break;
          return true;
        }
      }
      return false;
    }
    catch (Throwable localThrowable)
    {
    }
    return false;
  }

  private boolean zzs(Context paramContext)
  {
    PowerManager localPowerManager = (PowerManager)paramContext.getSystemService("power");
    if (localPowerManager == null)
      return false;
    return localPowerManager.isScreenOn();
  }

  public void zza(Context paramContext, @Nullable String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      localObject = paramContext.getApplicationContext();
      if (localObject == null)
        localObject = paramContext;
      paramBundle.putString("os", Build.VERSION.RELEASE);
      paramBundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
      paramBundle.putString("device", zzr.zzbC().zzht());
      paramBundle.putString("appid", ((Context)localObject).getPackageName());
      paramBundle.putString("eids", TextUtils.join(",", zzbt.zzdr()));
      if (paramString1 != null)
        paramBundle.putString("js", paramString1);
      else
        paramBundle.putString("gmscore_version", Integer.toString(zze.zzaj(paramContext)));
    }
    Object localObject = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", paramString2);
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ((Uri.Builder)localObject).appendQueryParameter(str, paramBundle.getString(str));
    }
    zzr.zzbC().zzc(paramContext, paramString1, ((Uri.Builder)localObject).toString());
  }

  public void zzb(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    if (((Boolean)zzbt.zzwN.get()).booleanValue())
      zza(paramContext, paramString1, paramString2, paramBundle, paramBoolean);
  }

  public static void runOnUiThread(Runnable runnable)
  {
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
      runnable.run();
    else
      zzMc.post(runnable);
  }

  public Bitmap zzP(Context paramContext)
  {
    if (!(paramContext instanceof Activity))
      return null;
    try
    {
      View localView = ((Activity)paramContext).getWindow().getDecorView();
      Bitmap localBitmap = Bitmap.createBitmap(localView.getWidth(), localView.getHeight(), Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap);
      localView.layout(0, 0, localView.getWidth(), localView.getHeight());
      localView.draw(localCanvas);
      return localBitmap;
    }
    catch (RuntimeException localRuntimeException)
    {
      zzin.zzb("Fail to capture screen shot", localRuntimeException);
    }
    return null;
  }

  public boolean zza(Context paramContext, Bitmap paramBitmap, String paramString)
  {
    zzx.zzcE("saveImageToFile must not be called on the main UI thread.");
    try
    {
      FileOutputStream localFileOutputStream = paramContext.openFileOutput(paramString, 0);
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localFileOutputStream);
      localFileOutputStream.close();
      paramBitmap.recycle();
      return true;
    }
    catch (Exception localException)
    {
      zzin.zzb("Fail to save file", localException);
    }
    return false;
  }

  public Bitmap zzf(Context paramContext, String paramString)
  {
    zzx.zzcE("getBackgroundImage must not be called on the main UI thread.");
    try
    {
      FileInputStream localFileInputStream = paramContext.openFileInput(paramString);
      Bitmap localBitmap = BitmapFactory.decodeStream(localFileInputStream);
      localFileInputStream.close();
      return localBitmap;
    }
    catch (Exception localException)
    {
      zzin.e("Fail to get background image");
    }
    return null;
  }

  public void zzg(Context paramContext, String paramString)
  {
    zzx.zzcE("deleteFile must not be called on the main UI thread.");
    paramContext.deleteFile(paramString);
  }

  public void zzb(Context paramContext, Intent paramIntent)
  {
    try
    {
      paramContext.startActivity(paramIntent);
    }
    catch (Throwable localThrowable)
    {
      paramIntent.addFlags(268435456);
      paramContext.startActivity(paramIntent);
    }
  }

  public float zzbt()
  {
    com.google.android.gms.ads.internal.zzn localzzn = zzr.zzbQ().zzbs();
    return (localzzn != null) && (localzzn.zzbu()) ? localzzn.zzbt() : 1.0F;
  }

  public float zzQ(Context paramContext)
  {
    AudioManager localAudioManager = (AudioManager)paramContext.getSystemService("audio");
    if (localAudioManager == null)
      return 0.0F;
    int i = localAudioManager.getStreamMaxVolume(3);
    int j = localAudioManager.getStreamVolume(3);
    return i == 0 ? 0.0F : j / i;
  }

  public int zzR(Context paramContext)
  {
    ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
    return localApplicationInfo == null ? 0 : localApplicationInfo.targetSdkVersion;
  }

  public boolean zza(View paramView, Context paramContext)
  {
    PowerManager localPowerManager = null;
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null)
      localPowerManager = (PowerManager)localContext.getSystemService("power");
    KeyguardManager localKeyguardManager = null;
    Object localObject = paramContext.getSystemService("keyguard");
    if ((localObject != null) && ((localObject instanceof KeyguardManager)))
      localKeyguardManager = (KeyguardManager)localObject;
    return zza(paramView, localPowerManager, localKeyguardManager);
  }

  public boolean zza(View paramView, PowerManager paramPowerManager, KeyguardManager paramKeyguardManager)
  {
    return (paramView.getVisibility() == 0) && (paramView.isShown()) && (zza(paramPowerManager)) && ((zzr.zzbC().zzhq()) || (!zza(paramKeyguardManager)));
  }

  private boolean zza(PowerManager paramPowerManager)
  {
    return (paramPowerManager == null) || (paramPowerManager.isScreenOn());
  }

  private boolean zza(KeyguardManager paramKeyguardManager)
  {
    if (paramKeyguardManager == null)
      return false;
    return paramKeyguardManager.inKeyguardRestrictedInputMode();
  }

  public int zzl(@Nullable View paramView)
  {
    if (paramView == null)
      return -1;
    for (ViewParent localViewParent = paramView.getParent(); (localViewParent != null) && (!(localViewParent instanceof AdapterView)); localViewParent = localViewParent.getParent());
    if (localViewParent == null)
      return -1;
    return ((AdapterView)localViewParent).getPositionForView(paramView);
  }

  private final class zza extends BroadcastReceiver
  {
    private zza()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
      if ("android.intent.action.USER_PRESENT".equals(intent.getAction()))
        zzir.zza(zzir.this, true);
      else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
        zzir.zza(zzir.this, false);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzir
 * JD-Core Version:    0.6.0
 */