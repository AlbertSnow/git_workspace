package com.wandoujia.jupiter.notification;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.activity.HomeActivity;
import java.lang.reflect.Method;

public final class NotificationActionHandler
{
  private static int a;
  private static String b;
  private static String c;
  private boolean d = false;
  private long e;

  public static void a(Context paramContext)
  {
    int i = Build.VERSION.SDK_INT;
    try
    {
      Object localObject1 = paramContext.getSystemService("statusbar");
      Class localClass = Class.forName("android.app.StatusBarManager");
      if (localObject1 != null)
      {
        if (i <= 16);
        Method localMethod;
        for (Object localObject2 = localClass.getMethod("collapse", new Class[0]); ; localObject2 = localMethod)
        {
          ((Method)localObject2).setAccessible(true);
          ((Method)localObject2).invoke(localObject1, new Object[0]);
          return;
          localMethod = localClass.getMethod("collapsePanels", new Class[0]);
        }
      }
    }
    catch (Exception localException)
    {
    }
  }

  public static boolean a(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null);
    String str1;
    do
    {
      return false;
      str1 = paramIntent.getAction();
      b = paramIntent.getStringExtra("launch_from");
      c = paramIntent.getStringExtra("launch_keyword");
      a = paramIntent.getIntExtra("notification_id", 0);
      if (!"phoenix.intent.action.NAVIGATE_TO_ACTIVITY".equals(str1))
        continue;
      String str2 = paramIntent.getStringExtra("intent");
      String str3;
      if (str2 == null)
        str3 = null;
      while (true)
      {
        e.a().a(a);
        a(paramContext);
        try
        {
          Intent localIntent2 = Intent.parseUri(str3, 268435456);
          localIntent2.addFlags(268435456);
          localIntent2.putExtra("launch_from", b);
          localIntent2.putExtra("launch_keyword", c);
          paramContext.startActivity(localIntent2);
          return true;
          str3 = str2.replace("?", "#").replace("&", ";");
        }
        catch (Exception localException)
        {
          while (true)
          {
            Intent localIntent1 = new Intent(paramContext, HomeActivity.class);
            localIntent1.addFlags(268435456);
            localIntent1.putExtra("launch_from", b);
            localIntent1.putExtra("launch_keyword", c);
            paramContext.startActivity(localIntent1);
          }
        }
      }
    }
    while (!"phoenix.intent.action.GEN_NOTIFY_CARD".equals(str1));
    JupiterApplication.d().g().a();
    return true;
  }

  // ERROR //
  public final String a(Context paramContext, String[] paramArrayOfString, String paramString, int paramInt, com.alipay.wandoujia.f paramf)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload 5
    //   3: invokevirtual 165	com/alipay/wandoujia/f:g	()J
    //   6: putfield 167	com/wandoujia/jupiter/notification/NotificationActionHandler:e	J
    //   9: aload_3
    //   10: invokestatic 173	java/util/regex/Pattern:compile	(Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   13: astore 9
    //   15: ldc 175
    //   17: invokestatic 181	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   20: astore 10
    //   22: bipush 8
    //   24: anewarray 92	java/lang/String
    //   27: dup
    //   28: iconst_0
    //   29: ldc 183
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: ldc 185
    //   36: aastore
    //   37: dup
    //   38: iconst_2
    //   39: ldc 187
    //   41: aastore
    //   42: dup
    //   43: iconst_3
    //   44: ldc 189
    //   46: aastore
    //   47: dup
    //   48: iconst_4
    //   49: ldc 191
    //   51: aastore
    //   52: dup
    //   53: iconst_5
    //   54: ldc 193
    //   56: aastore
    //   57: dup
    //   58: bipush 6
    //   60: ldc 195
    //   62: aastore
    //   63: dup
    //   64: bipush 7
    //   66: ldc 197
    //   68: aastore
    //   69: astore 11
    //   71: aload_1
    //   72: invokevirtual 201	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   75: aload 10
    //   77: aload 11
    //   79: aconst_null
    //   80: aconst_null
    //   81: ldc 203
    //   83: invokevirtual 209	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   86: astore 12
    //   88: aload 12
    //   90: astore 7
    //   92: aload 7
    //   94: invokeinterface 215 1 0
    //   99: ifeq +366 -> 465
    //   102: aload 7
    //   104: ldc 185
    //   106: invokeinterface 219 2 0
    //   111: istore 14
    //   113: aload 7
    //   115: ldc 189
    //   117: invokeinterface 219 2 0
    //   122: istore 15
    //   124: aload 7
    //   126: ldc 191
    //   128: invokeinterface 219 2 0
    //   133: istore 16
    //   135: aload 7
    //   137: ldc 193
    //   139: invokeinterface 219 2 0
    //   144: pop
    //   145: aload 7
    //   147: ldc 195
    //   149: invokeinterface 219 2 0
    //   154: istore 18
    //   156: aload 7
    //   158: ldc 197
    //   160: invokeinterface 219 2 0
    //   165: istore 19
    //   167: aconst_null
    //   168: astore 13
    //   170: aload_0
    //   171: getfield 19	com/wandoujia/jupiter/notification/NotificationActionHandler:d	Z
    //   174: ifne +144 -> 318
    //   177: aload 7
    //   179: iload 14
    //   181: invokeinterface 223 2 0
    //   186: astore 20
    //   188: aload 7
    //   190: iload 15
    //   192: invokeinterface 223 2 0
    //   197: astore 21
    //   199: aload 7
    //   201: iload 16
    //   203: invokeinterface 227 2 0
    //   208: lstore 22
    //   210: aload 7
    //   212: iload 18
    //   214: invokeinterface 231 2 0
    //   219: istore 24
    //   221: aload 7
    //   223: iload 19
    //   225: invokeinterface 231 2 0
    //   230: istore 25
    //   232: lload 22
    //   234: aload_0
    //   235: getfield 167	com/wandoujia/jupiter/notification/NotificationActionHandler:e	J
    //   238: lsub
    //   239: lconst_0
    //   240: lcmp
    //   241: ifle +55 -> 296
    //   244: aload_2
    //   245: arraylength
    //   246: istore 27
    //   248: iconst_0
    //   249: istore 28
    //   251: goto +220 -> 471
    //   254: iload 29
    //   256: ifeq +40 -> 296
    //   259: iload 24
    //   261: iconst_1
    //   262: if_icmpne +34 -> 296
    //   265: iload 25
    //   267: ifne +29 -> 296
    //   270: aload 9
    //   272: aload 21
    //   274: invokevirtual 235	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   277: astore 30
    //   279: aload 30
    //   281: invokevirtual 240	java/util/regex/Matcher:find	()Z
    //   284: ifeq +12 -> 296
    //   287: aload 30
    //   289: iload 4
    //   291: invokevirtual 243	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   294: astore 13
    //   296: aload 13
    //   298: invokestatic 249	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   301: ifeq +17 -> 318
    //   304: aload 7
    //   306: invokeinterface 252 1 0
    //   311: istore 26
    //   313: iload 26
    //   315: ifne -145 -> 170
    //   318: aload 7
    //   320: ifnull +20 -> 340
    //   323: aload 7
    //   325: invokeinterface 255 1 0
    //   330: ifne +10 -> 340
    //   333: aload 7
    //   335: invokeinterface 258 1 0
    //   340: aload 13
    //   342: areturn
    //   343: aload_2
    //   344: iload 28
    //   346: aaload
    //   347: astore 31
    //   349: aload 20
    //   351: invokestatic 249	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   354: ifne +23 -> 377
    //   357: aload 20
    //   359: aload 31
    //   361: invokevirtual 262	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   364: istore 32
    //   366: iload 32
    //   368: ifeq +9 -> 377
    //   371: iconst_1
    //   372: istore 29
    //   374: goto -120 -> 254
    //   377: iinc 28 1
    //   380: goto +91 -> 471
    //   383: astore 8
    //   385: aconst_null
    //   386: astore 7
    //   388: invokestatic 267	com/alipay/wandoujia/i:a	()Lcom/alipay/wandoujia/i;
    //   391: aload 8
    //   393: ldc_w 269
    //   396: invokevirtual 272	com/alipay/wandoujia/i:a	(Ljava/lang/Throwable;Ljava/lang/String;)V
    //   399: aload 7
    //   401: ifnull +62 -> 463
    //   404: aload 7
    //   406: invokeinterface 255 1 0
    //   411: ifne +52 -> 463
    //   414: aload 7
    //   416: invokeinterface 258 1 0
    //   421: aconst_null
    //   422: areturn
    //   423: astore 6
    //   425: aconst_null
    //   426: astore 7
    //   428: aload 7
    //   430: ifnull +20 -> 450
    //   433: aload 7
    //   435: invokeinterface 255 1 0
    //   440: ifne +10 -> 450
    //   443: aload 7
    //   445: invokeinterface 258 1 0
    //   450: aload 6
    //   452: athrow
    //   453: astore 6
    //   455: goto -27 -> 428
    //   458: astore 8
    //   460: goto -72 -> 388
    //   463: aconst_null
    //   464: areturn
    //   465: aconst_null
    //   466: astore 13
    //   468: goto -150 -> 318
    //   471: iload 28
    //   473: iload 27
    //   475: if_icmplt -132 -> 343
    //   478: iconst_0
    //   479: istore 29
    //   481: goto -227 -> 254
    //
    // Exception table:
    //   from	to	target	type
    //   9	88	383	android/database/sqlite/SQLiteException
    //   9	88	423	finally
    //   92	167	453	finally
    //   170	248	453	finally
    //   270	296	453	finally
    //   296	313	453	finally
    //   343	366	453	finally
    //   388	399	453	finally
    //   92	167	458	android/database/sqlite/SQLiteException
    //   170	248	458	android/database/sqlite/SQLiteException
    //   270	296	458	android/database/sqlite/SQLiteException
    //   296	313	458	android/database/sqlite/SQLiteException
    //   343	366	458	android/database/sqlite/SQLiteException
  }

  public final void a()
  {
    this.d = true;
  }

  public final boolean b()
  {
    return this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.notification.NotificationActionHandler
 * JD-Core Version:    0.6.0
 */