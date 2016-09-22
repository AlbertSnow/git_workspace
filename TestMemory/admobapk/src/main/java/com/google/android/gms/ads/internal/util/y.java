package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.media.AudioManager;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
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
import aww;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.al;
import com.google.android.gms.ads.internal.bc;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.q;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.js.n;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.webview.b;
import ha;
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
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@com.google.android.gms.ads.internal.report.client.a
public final class y
{
  public static final Handler a = new d(Looper.getMainLooper());
  final Object b = new Object();
  boolean c = true;
  String d;
  public boolean e = false;
  private n f;

  public static Bitmap a(View paramView)
  {
    paramView.setDrawingCacheEnabled(true);
    Bitmap localBitmap = Bitmap.createBitmap(paramView.getDrawingCache());
    paramView.setDrawingCacheEnabled(false);
    return localBitmap;
  }

  public static DisplayMetrics a(WindowManager paramWindowManager)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    paramWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics;
  }

  public static PopupWindow a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return new PopupWindow(paramView, paramInt1, paramInt2, false);
  }

  public static String a()
  {
    return UUID.randomUUID().toString();
  }

  private static String a(Context paramContext, ha paramha, String paramString)
  {
    if (paramha == null)
      return paramString;
    try
    {
      Uri localUri = Uri.parse(paramString);
      boolean bool = paramha.b(localUri);
      int i = 0;
      String[] arrayOfString;
      int j;
      if (bool)
      {
        arrayOfString = ha.d;
        j = arrayOfString.length;
      }
      for (int k = 0; ; k++)
      {
        i = 0;
        if (k < j)
        {
          String str1 = arrayOfString[k];
          if (!localUri.getPath().endsWith(str1))
            continue;
          i = 1;
        }
        if (i != 0)
          localUri = paramha.a(localUri, paramContext);
        String str2 = localUri.toString();
        return str2;
      }
    }
    catch (Exception localException)
    {
    }
    return paramString;
  }

  public static String a(InputStreamReader paramInputStreamReader)
  {
    StringBuilder localStringBuilder = new StringBuilder(8192);
    char[] arrayOfChar = new char[2048];
    while (true)
    {
      int i = paramInputStreamReader.read(arrayOfChar);
      if (i == -1)
        break;
      localStringBuilder.append(arrayOfChar, 0, i);
    }
    return localStringBuilder.toString();
  }

  public static String a(String paramString)
  {
    return Uri.parse(paramString).buildUpon().query(null).build().toString();
  }

  public static Map a(Uri paramUri)
  {
    if (paramUri == null)
      return null;
    HashMap localHashMap = new HashMap();
    Iterator localIterator = bc.a().g.a(paramUri).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, paramUri.getQueryParameter(str));
    }
    return localHashMap;
  }

  private final JSONArray a(Collection paramCollection)
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
      a(localJSONArray, localIterator.next());
    return localJSONArray;
  }

  private final JSONObject a(Bundle paramBundle)
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      a(localJSONObject, str, paramBundle.get(str));
    }
    return localJSONObject;
  }

  public static void a(Activity paramActivity, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    Window localWindow = paramActivity.getWindow();
    if ((localWindow != null) && (localWindow.getDecorView() != null) && (localWindow.getDecorView().getViewTreeObserver() != null))
      localWindow.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(paramOnGlobalLayoutListener);
  }

  public static void a(Activity paramActivity, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    Window localWindow = paramActivity.getWindow();
    if ((localWindow != null) && (localWindow.getDecorView() != null) && (localWindow.getDecorView().getViewTreeObserver() != null))
      localWindow.getDecorView().getViewTreeObserver().addOnScrollChangedListener(paramOnScrollChangedListener);
  }

  public static void a(Context paramContext, Intent paramIntent)
  {
    try
    {
      paramContext.startActivity(paramIntent);
      return;
    }
    catch (Throwable localThrowable)
    {
      paramIntent.addFlags(268435456);
      paramContext.startActivity(paramIntent);
    }
  }

  public static void a(Context paramContext, String paramString, List paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      ((Future)new bg(paramContext, paramString, (String)localIterator.next()).d());
  }

  public static void a(Runnable paramRunnable)
  {
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      paramRunnable.run();
      return;
    }
    a.post(paramRunnable);
  }

  public static void a(List paramList, String paramString)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      ((Future)new bg((String)localIterator.next(), paramString).d());
  }

  private final void a(JSONArray paramJSONArray, Object paramObject)
  {
    if ((paramObject instanceof Bundle))
    {
      paramJSONArray.put(a((Bundle)paramObject));
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramJSONArray.put(a((Map)paramObject));
      return;
    }
    if ((paramObject instanceof Collection))
    {
      paramJSONArray.put(a((Collection)paramObject));
      return;
    }
    if ((paramObject instanceof Object[]))
    {
      Object[] arrayOfObject = (Object[])paramObject;
      JSONArray localJSONArray = new JSONArray();
      int i = arrayOfObject.length;
      for (int j = 0; j < i; j++)
        a(localJSONArray, arrayOfObject[j]);
      paramJSONArray.put(localJSONArray);
      return;
    }
    paramJSONArray.put(paramObject);
  }

  private final void a(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    if ((paramObject instanceof Bundle))
    {
      paramJSONObject.put(paramString, a((Bundle)paramObject));
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramJSONObject.put(paramString, a((Map)paramObject));
      return;
    }
    if ((paramObject instanceof Collection))
    {
      if (paramString != null);
      while (true)
      {
        paramJSONObject.put(paramString, a((Collection)paramObject));
        return;
        paramString = "null";
      }
    }
    if ((paramObject instanceof Object[]))
    {
      paramJSONObject.put(paramString, a(Arrays.asList((Object[])paramObject)));
      return;
    }
    paramJSONObject.put(paramString, paramObject);
  }

  public static boolean a(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    ResolveInfo localResolveInfo = paramContext.getPackageManager().resolveActivity(localIntent, 65536);
    if ((localResolveInfo == null) || (localResolveInfo.activityInfo == null))
    {
      c.e("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
      return false;
    }
    if ((0x10 & localResolveInfo.activityInfo.configChanges) == 0)
      c.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "keyboard" }));
    for (int i = 0; ; i = 1)
    {
      if ((0x20 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        c.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "keyboardHidden" }));
        i = 0;
      }
      if ((0x80 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        c.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "orientation" }));
        i = 0;
      }
      if ((0x100 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        c.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "screenLayout" }));
        i = 0;
      }
      if ((0x200 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        c.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "uiMode" }));
        i = 0;
      }
      if ((0x400 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        c.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "screenSize" }));
        i = 0;
      }
      if ((0x800 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        c.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "smallestScreenSize" }));
        return false;
      }
      return i;
    }
  }

  public static boolean a(PackageManager paramPackageManager, String paramString1, String paramString2)
  {
    return paramPackageManager.checkPermission(paramString2, paramString1) == 0;
  }

  public static boolean a(ClassLoader paramClassLoader, Class paramClass, String paramString)
  {
    try
    {
      boolean bool = paramClass.isAssignableFrom(Class.forName(paramString, false, paramClassLoader));
      return bool;
    }
    catch (Throwable localThrowable)
    {
    }
    return false;
  }

  public static int b(String paramString)
  {
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      String str = String.valueOf(localNumberFormatException);
      c.e(22 + String.valueOf(str).length() + "Could not parse value:" + str);
    }
    return 0;
  }

  public static Bitmap b(View paramView)
  {
    try
    {
      int i = paramView.getWidth();
      int j = paramView.getHeight();
      if ((i == 0) || (j == 0))
      {
        c.e("Width or height of view is zero");
        return null;
      }
      Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.RGB_565);
      Canvas localCanvas = new Canvas(localBitmap);
      paramView.layout(0, 0, i, j);
      paramView.draw(localCanvas);
      return localBitmap;
    }
    catch (RuntimeException localRuntimeException)
    {
      c.b("Fail to capture the webview", localRuntimeException);
    }
    return null;
  }

  public static String b()
  {
    UUID localUUID = UUID.randomUUID();
    byte[] arrayOfByte1 = BigInteger.valueOf(localUUID.getLeastSignificantBits()).toByteArray();
    byte[] arrayOfByte2 = BigInteger.valueOf(localUUID.getMostSignificantBits()).toByteArray();
    Object localObject = new BigInteger(1, arrayOfByte1).toString();
    int i = 0;
    while (true)
    {
      if (i < 2);
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        localMessageDigest.update(arrayOfByte1);
        localMessageDigest.update(arrayOfByte2);
        byte[] arrayOfByte3 = new byte[8];
        System.arraycopy(localMessageDigest.digest(), 0, arrayOfByte3, 0, 8);
        String str = new BigInteger(1, arrayOfByte3).toString();
        localObject = str;
        label106: i++;
        continue;
        return localObject;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        break label106;
      }
    }
  }

  protected static String b(Context paramContext)
  {
    return new WebView(paramContext).getSettings().getUserAgentString();
  }

  public static void b(Activity paramActivity, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    Window localWindow = paramActivity.getWindow();
    if ((localWindow != null) && (localWindow.getDecorView() != null) && (localWindow.getDecorView().getViewTreeObserver() != null))
      localWindow.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(paramOnScrollChangedListener);
  }

  public static void b(Runnable paramRunnable)
  {
    if (Looper.getMainLooper().getThread() != Thread.currentThread())
    {
      paramRunnable.run();
      return;
    }
    s.a(paramRunnable);
  }

  public static AlertDialog.Builder c(Context paramContext)
  {
    return new AlertDialog.Builder(paramContext);
  }

  // ERROR //
  public static Bitmap c(View paramView)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 533	android/view/View:isDrawingCacheEnabled	()Z
    //   4: istore 4
    //   6: aload_0
    //   7: iconst_1
    //   8: invokevirtual 47	android/view/View:setDrawingCacheEnabled	(Z)V
    //   11: aload_0
    //   12: invokevirtual 51	android/view/View:getDrawingCache	()Landroid/graphics/Bitmap;
    //   15: astore 5
    //   17: aload 5
    //   19: ifnull +39 -> 58
    //   22: aload 5
    //   24: invokestatic 57	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   27: astore 6
    //   29: aload 6
    //   31: astore_2
    //   32: aload_0
    //   33: iload 4
    //   35: invokevirtual 47	android/view/View:setDrawingCacheEnabled	(Z)V
    //   38: aload_2
    //   39: areturn
    //   40: astore_1
    //   41: aconst_null
    //   42: astore_2
    //   43: aload_1
    //   44: astore_3
    //   45: ldc_w 535
    //   48: aload_3
    //   49: invokestatic 460	com/google/android/gms/ads/internal/util/c:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   52: aload_2
    //   53: areturn
    //   54: astore_3
    //   55: goto -10 -> 45
    //   58: aconst_null
    //   59: astore_2
    //   60: goto -28 -> 32
    //
    // Exception table:
    //   from	to	target	type
    //   0	17	40	java/lang/RuntimeException
    //   22	29	40	java/lang/RuntimeException
    //   32	38	54	java/lang/RuntimeException
  }

  public static String c()
  {
    String str1 = Build.MANUFACTURER;
    String str2 = Build.MODEL;
    if (str2.startsWith(str1))
      return str2;
    return 1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + " " + str2;
  }

  public static boolean c(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return false;
    return paramString.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
  }

  public static float d()
  {
    al localal = al.a();
    if ((localal != null) && (localal.d()))
      return localal.c();
    return 1.0F;
  }

  public static int d(View paramView)
  {
    if (paramView == null)
      return -1;
    for (ViewParent localViewParent = paramView.getParent(); (localViewParent != null) && (!(localViewParent instanceof AdapterView)); localViewParent = localViewParent.getParent());
    if (localViewParent == null)
      return -1;
    return ((AdapterView)localViewParent).getPositionForView(paramView);
  }

  public static com.google.android.gms.ads.internal.common.a d(Context paramContext)
  {
    return new com.google.android.gms.ads.internal.common.a(paramContext);
  }

  public static boolean e()
  {
    al localal = al.a();
    if (localal != null)
      return localal.e();
    return false;
  }

  public static Bundle f()
  {
    Bundle localBundle = new Bundle();
    try
    {
      Debug.MemoryInfo localMemoryInfo = new Debug.MemoryInfo();
      Debug.getMemoryInfo(localMemoryInfo);
      localBundle.putParcelable("debug_memory_info", localMemoryInfo);
      Runtime localRuntime = Runtime.getRuntime();
      localBundle.putLong("runtime_free_memory", localRuntime.freeMemory());
      localBundle.putLong("runtime_max_memory", localRuntime.maxMemory());
      localBundle.putLong("runtime_total_memory", localRuntime.totalMemory());
      return localBundle;
    }
    catch (Exception localException)
    {
      c.c("Unable to gather memory stats", localException);
    }
    return localBundle;
  }

  public static AudioManager g(Context paramContext)
  {
    return (AudioManager)paramContext.getSystemService("audio");
  }

  private static String g()
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

  public static int h(Context paramContext)
  {
    ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
    if (localApplicationInfo == null)
      return 0;
    return localApplicationInfo.targetSdkVersion;
  }

  private static int[] h()
  {
    return new int[] { 0, 0 };
  }

  public static boolean i(Context paramContext)
  {
    try
    {
      paramContext.getClassLoader().loadClass(ClientApi.class.getName());
      return false;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
    }
    return true;
  }

  private static String j(Context paramContext)
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
        {
          String str = localRunningTaskInfo.topActivity.getClassName();
          return str;
        }
      }
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final n a(Context paramContext, VersionInfoParcel paramVersionInfoParcel)
  {
    synchronized (this.b)
    {
      if (this.f == null)
      {
        if (paramContext.getApplicationContext() != null)
          paramContext = paramContext.getApplicationContext();
        this.f = new n(paramContext, paramVersionInfoParcel, (String)m.a.a());
      }
      n localn = this.f;
      return localn;
    }
  }

  public final String a(Context paramContext, View paramView, AdSizeParcel paramAdSizeParcel)
  {
    if (!((Boolean)m.K.a()).booleanValue())
      return null;
    while (true)
    {
      try
      {
        JSONObject localJSONObject1 = new JSONObject();
        JSONObject localJSONObject2 = new JSONObject();
        localJSONObject2.put("width", paramAdSizeParcel.f);
        localJSONObject2.put("height", paramAdSizeParcel.c);
        localJSONObject1.put("size", localJSONObject2);
        localJSONObject1.put("activity", j(paramContext));
        if (paramAdSizeParcel.e)
          continue;
        JSONArray localJSONArray = new JSONArray();
        if (paramView == null)
          continue;
        ViewParent localViewParent = paramView.getParent();
        if (localViewParent == null)
          continue;
        int i = -1;
        if (!(localViewParent instanceof ViewGroup))
          continue;
        i = ((ViewGroup)localViewParent).indexOfChild(paramView);
        JSONObject localJSONObject3 = new JSONObject();
        localJSONObject3.put("type", localViewParent.getClass().getName());
        localJSONObject3.put("index_of_child", i);
        localJSONArray.put(localJSONObject3);
        if ((localViewParent != null) && ((localViewParent instanceof View)))
        {
          paramView = (View)localViewParent;
          continue;
          if (localJSONArray.length() <= 0)
            continue;
          localJSONObject1.put("parents", localJSONArray);
          String str = localJSONObject1.toString();
          return str;
        }
      }
      catch (JSONException localJSONException)
      {
        c.c("Fail to get view hierarchy json", localJSONException);
        return null;
      }
      paramView = null;
    }
  }

  public final String a(Context paramContext, String paramString)
  {
    synchronized (this.b)
    {
      if (this.d != null)
      {
        String str6 = this.d;
        return str6;
      }
    }
    try
    {
      this.d = bc.a().g.a(paramContext);
      label39: if (TextUtils.isEmpty(this.d))
        if (!com.google.android.gms.ads.internal.util.client.a.b())
        {
          this.d = null;
          a.post(new aa(this, paramContext));
          String str4;
          while (true)
          {
            String str3 = this.d;
            if (str3 != null)
              break label178;
            try
            {
              this.b.wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              this.d = g();
              str4 = String.valueOf(this.d);
              if (str4.length() == 0);
            }
          }
          for (String str5 = "Interrupted, use default user agent: ".concat(str4); ; str5 = new String("Interrupted, use default user agent: "))
          {
            c.e(str5);
            break;
            localObject2 = finally;
            monitorexit;
            throw localObject2;
          }
        }
      try
      {
        this.d = b(paramContext);
        label178: String str1 = String.valueOf(this.d);
        this.d = (11 + String.valueOf(str1).length() + String.valueOf(paramString).length() + str1 + " (Mobile; " + paramString + ")");
        String str2 = this.d;
        monitorexit;
        return str2;
      }
      catch (Exception localException2)
      {
        while (true)
          this.d = g();
      }
    }
    catch (Exception localException1)
    {
      break label39;
    }
  }

  public final String a(b paramb, String paramString)
  {
    return a(paramb.getContext(), paramb.n(), paramString);
  }

  public final JSONObject a(Map paramMap)
  {
    JSONObject localJSONObject;
    try
    {
      localJSONObject = new JSONObject();
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str3 = (String)localIterator.next();
        a(localJSONObject, str3, paramMap.get(str3));
      }
    }
    catch (ClassCastException localClassCastException)
    {
      String str1 = String.valueOf(localClassCastException.getMessage());
      if (str1.length() != 0);
      for (String str2 = "Could not convert map to JSON: ".concat(str1); ; str2 = new String("Could not convert map to JSON: "))
        throw new JSONException(str2);
    }
    return localJSONObject;
  }

  public final void a(Context paramContext, String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString2);
    a(paramContext, paramString1, localArrayList);
  }

  public final void a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramBundle.putString("device", c());
      paramBundle.putString("eids", TextUtils.join(",", m.a()));
    }
    com.google.android.gms.ads.internal.util.client.a.a(paramContext, paramString1, paramString2, paramBundle, paramBoolean, new ab(this, paramContext, paramString1));
  }

  public final void a(Context paramContext, String paramString, boolean paramBoolean, HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection.setConnectTimeout(60000);
    paramHttpURLConnection.setInstanceFollowRedirects(false);
    paramHttpURLConnection.setReadTimeout(60000);
    paramHttpURLConnection.setRequestProperty("User-Agent", a(paramContext, paramString));
    paramHttpURLConnection.setUseCaches(false);
  }

  public final void a(Context paramContext, List paramList)
  {
    if (!(paramContext instanceof Activity));
    do
      return;
    while (TextUtils.isEmpty(aww.a((Activity)paramContext)));
    if (paramList == null)
    {
      c.a("Cannot ping urls: empty list.");
      return;
    }
    if (!com.google.android.gms.ads.internal.customtabs.a.a(paramContext))
    {
      c.a("Cannot ping url because custom tabs is not supported");
      return;
    }
    com.google.android.gms.ads.internal.customtabs.a locala = new com.google.android.gms.ads.internal.customtabs.a();
    locala.b = new z(this, paramList, locala, paramContext);
    locala.b((Activity)paramContext);
  }

  public final boolean a(View paramView, Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null);
    for (PowerManager localPowerManager = (PowerManager)localContext.getSystemService("power"); ; localPowerManager = null)
    {
      Object localObject = paramContext.getSystemService("keyguard");
      KeyguardManager localKeyguardManager = null;
      if (localObject != null)
      {
        boolean bool = localObject instanceof KeyguardManager;
        localKeyguardManager = null;
        if (bool)
          localKeyguardManager = (KeyguardManager)localObject;
      }
      return a(paramView, localPowerManager, localKeyguardManager);
    }
  }

  public final boolean a(View paramView, PowerManager paramPowerManager, KeyguardManager paramKeyguardManager)
  {
    boolean bool;
    int i;
    if (!bc.a().e.c)
    {
      if (paramKeyguardManager == null)
      {
        bool = false;
        if (bool)
          break label119;
      }
    }
    else
    {
      i = 1;
      label27: if ((paramView.getVisibility() != 0) || (!paramView.isShown()))
        break label131;
      if ((paramPowerManager != null) && (!paramPowerManager.isScreenOn()))
        break label125;
    }
    label119: label125: for (int j = 1; ; j = 0)
    {
      if ((j == 0) || (i == 0) || ((((Boolean)m.Z.a()).booleanValue()) && (!paramView.getLocalVisibleRect(new Rect())) && (!paramView.getGlobalVisibleRect(new Rect()))))
        break label131;
      return true;
      bool = paramKeyguardManager.inKeyguardRestrictedInputMode();
      break;
      i = 0;
      break label27;
    }
    label131: return false;
  }

  public final int[] a(Activity paramActivity)
  {
    Window localWindow = paramActivity.getWindow();
    if (localWindow != null)
    {
      View localView = localWindow.findViewById(16908290);
      if (localView != null)
      {
        int[] arrayOfInt = new int[2];
        arrayOfInt[0] = localView.getWidth();
        arrayOfInt[1] = localView.getHeight();
        return arrayOfInt;
      }
    }
    return h();
  }

  public final void b(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    if (((Boolean)m.ac.a()).booleanValue())
      a(paramContext, paramString1, paramString2, paramBundle, paramBoolean);
  }

  public final int[] b(Activity paramActivity)
  {
    int[] arrayOfInt1 = a(paramActivity);
    int[] arrayOfInt2 = new int[2];
    arrayOfInt2[0] = q.a().a.b(paramActivity, arrayOfInt1[0]);
    arrayOfInt2[1] = q.a().a.b(paramActivity, arrayOfInt1[1]);
    return arrayOfInt2;
  }

  public final int[] c(Activity paramActivity)
  {
    Window localWindow = paramActivity.getWindow();
    int[] arrayOfInt1;
    if (localWindow != null)
    {
      View localView = localWindow.findViewById(16908290);
      if (localView != null)
      {
        arrayOfInt1 = new int[2];
        arrayOfInt1[0] = localView.getTop();
        arrayOfInt1[1] = localView.getBottom();
      }
    }
    while (true)
    {
      int[] arrayOfInt2 = new int[2];
      arrayOfInt2[0] = q.a().a.b(paramActivity, arrayOfInt1[0]);
      arrayOfInt2[1] = q.a().a.b(paramActivity, arrayOfInt1[1]);
      return arrayOfInt2;
      arrayOfInt1 = h();
    }
  }

  public final boolean e(Context paramContext)
  {
    int i;
    label152: 
    do
    {
      try
      {
        ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
        KeyguardManager localKeyguardManager = (KeyguardManager)paramContext.getSystemService("keyguard");
        if ((localActivityManager != null) && (localKeyguardManager != null))
        {
          List localList = localActivityManager.getRunningAppProcesses();
          if (localList == null)
            return false;
          Iterator localIterator = localList.iterator();
          while (localIterator.hasNext())
          {
            ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
            if (Process.myPid() != localRunningAppProcessInfo.pid)
              continue;
            if ((localRunningAppProcessInfo.importance != 100) || (localKeyguardManager.inKeyguardRestrictedInputMode()))
              break;
            PowerManager localPowerManager = (PowerManager)paramContext.getSystemService("power");
            if (localPowerManager == null)
            {
              i = 0;
              break label152;
            }
            boolean bool = localPowerManager.isScreenOn();
            i = bool;
            break label152;
          }
          return false;
        }
      }
      catch (Throwable localThrowable)
      {
        return false;
      }
      return false;
    }
    while (i == 0);
    return true;
  }

  public final Bitmap f(Context paramContext)
  {
    if (!(paramContext instanceof Activity))
      return null;
    Object localObject;
    try
    {
      if (((Boolean)m.au.a()).booleanValue())
      {
        Window localWindow = ((Activity)paramContext).getWindow();
        if (localWindow != null)
        {
          localObject = c(localWindow.getDecorView().getRootView());
          break label84;
        }
      }
      else
      {
        Bitmap localBitmap = b(((Activity)paramContext).getWindow().getDecorView());
        localObject = localBitmap;
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      c.b("Fail to capture screen shot", localRuntimeException);
      localObject = null;
    }
    label84: return (Bitmap)localObject;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.y
 * JD-Core Version:    0.6.0
 */