package android.support.v4.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import com.unionpay.pboctransaction.AppIdentification;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.SharePrefSubmitor;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressLint({"CommitPrefEdits"})
public final class i<C extends com.google.android.gms.common.api.b>
{
  private static SharedPreferences e;
  public android.support.v4.e.a<String, String> a = new android.support.v4.e.a();
  public ArrayList<View> b = new ArrayList();
  public com.tencent.open.yyb.a c = new com.tencent.open.yyb.a();
  public View d;

  public static int a()
  {
    int i = com.tencent.open.utils.i.a(b.t(), null).a("Common_HttpRetryCount");
    if (i == 0)
      i = 2;
    return i;
  }

  public static int a(float paramFloat, Context paramContext)
  {
    return (int)(0.5F + paramFloat * paramContext.getResources().getDisplayMetrics().density);
  }

  public static int a(String paramString)
  {
    int i = com.tencent.open.utils.i.a(b.t(), paramString).a("Common_BusinessReportFrequency");
    if (i == 0)
      i = 100;
    return i;
  }

  public static String a(Context paramContext)
  {
    return paramContext.getSharedPreferences("UnionPayPluginEx.pref", 3).getString("uid", "");
  }

  private static String a(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString1.length() > paramString2.length()))
      while (paramString1.substring(paramString1.length() - paramString2.length(), paramString1.length()).equalsIgnoreCase(paramString2))
        paramString1 = paramString1.substring(0, paramString1.length() - paramString2.length());
    return paramString1;
  }

  public static String a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, paramArrayOfByte.length);
  }

  public static String a(byte[] paramArrayOfByte, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder("");
    if ((paramArrayOfByte == null) || (paramInt <= 0))
      return null;
    for (int i = 0; i < paramInt; i++)
    {
      String str = Integer.toHexString(0xFF & paramArrayOfByte[i]);
      if (str.length() < 2)
        localStringBuilder.append(0);
      localStringBuilder.append(str);
    }
    return localStringBuilder.toString().toUpperCase();
  }

  public static void a(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = b().edit();
    localEditor.putBoolean("IS_LAUNCHER_IN_WIHTELIST", paramBoolean);
    SharePrefSubmitor.submit(localEditor);
  }

  private static boolean a(ArrayList<AppIdentification> paramArrayList, String paramString)
  {
    if (paramString == null)
      return false;
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
      if (((AppIdentification)localIterator.next()).a().equalsIgnoreCase(paramString))
        return false;
    return true;
  }

  public static float b(Context paramContext)
  {
    return paramContext.getResources().getDisplayMetrics().widthPixels;
  }

  public static SharedPreferences b()
  {
    monitorenter;
    try
    {
      if (e == null)
        e = GlobalConfig.getAppContext().getSharedPreferences("com.wandoujia.phoenix2", 2);
      SharedPreferences localSharedPreferences = e;
      return localSharedPreferences;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public static byte[] b(String paramString)
  {
    byte[] arrayOfByte;
    if ((paramString == null) || (paramString.equals("")))
      arrayOfByte = null;
    while (true)
    {
      return arrayOfByte;
      String str = paramString.toUpperCase();
      int i = str.length() / 2;
      char[] arrayOfChar = str.toCharArray();
      arrayOfByte = new byte[i];
      for (int j = 0; j < i; j++)
      {
        int k = j * 2;
        arrayOfByte[j] = (byte)((byte)"0123456789ABCDEF".indexOf(arrayOfChar[k]) << 4 | (byte)"0123456789ABCDEF".indexOf(arrayOfChar[(k + 1)]));
      }
    }
  }

  public static ArrayList<AppIdentification> c(String paramString)
  {
    int i = 0;
    if ((paramString != null) && (paramString.length() > 4))
    {
      ArrayList localArrayList = new ArrayList();
      String str1 = paramString.substring(-4 + paramString.length());
      if ((str1 != null) && (str1.equalsIgnoreCase("9000")))
      {
        String str2 = paramString.substring(0, -4 + paramString.length());
        if ((str2 != null) && (str2.length() > 0) && (i != -1))
        {
          String str3 = "";
          int j = str2.indexOf("61", i);
          if (j != -1)
          {
            String str4 = str2.substring(j + 2, j + 4);
            String str5 = str2.substring(j + 4, j + 6);
            if (j + 6 + 2 * Integer.parseInt(str5, 16) < str2.length())
              str3 = str2.substring(j + 6, j + 6 + 2 * Integer.parseInt(str5, 16));
            i = j + 2 + 2 * Integer.parseInt(str4, 16);
            if (i <= str2.length());
            while (true)
            {
              String str6 = str3.trim();
              if ((str6.length() <= 0) || (str6.equalsIgnoreCase("A0000003334355502D4D4F42494C45")) || (!a(localArrayList, str6)))
                break;
              localArrayList.add(new AppIdentification(str6, null));
              break;
              i = j + 2;
            }
          }
        }
      }
      return localArrayList;
    }
    return null;
  }

  public static String d(String paramString)
  {
    return a(paramString, "F");
  }

  public static String e(String paramString)
  {
    return a(paramString, "00");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.i
 * JD-Core Version:    0.6.0
 */