package com.wandoujia.p4.community.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Environment;
import com.alipay.ut.b.b.a;
import com.wandoujia.ripple_framework.view.a.h;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

public class a
{
  private String a;
  private String b;
  private boolean c;
  private boolean d;
  private SharedPreferences e;
  private com.alipay.ut.b.b f;
  private SharedPreferences.Editor g;
  private b.a h;
  private Context i;
  private com.alipay.ut.b.c j;
  private boolean k;

  // ERROR //
  public a(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 30	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: ldc 32
    //   7: putfield 34	com/wandoujia/p4/community/utils/a:a	Ljava/lang/String;
    //   10: aload_0
    //   11: ldc 32
    //   13: putfield 36	com/wandoujia/p4/community/utils/a:b	Ljava/lang/String;
    //   16: aload_0
    //   17: iconst_0
    //   18: putfield 38	com/wandoujia/p4/community/utils/a:c	Z
    //   21: aload_0
    //   22: iconst_0
    //   23: putfield 40	com/wandoujia/p4/community/utils/a:d	Z
    //   26: aload_0
    //   27: aconst_null
    //   28: putfield 42	com/wandoujia/p4/community/utils/a:e	Landroid/content/SharedPreferences;
    //   31: aload_0
    //   32: aconst_null
    //   33: putfield 44	com/wandoujia/p4/community/utils/a:f	Lcom/alipay/ut/b/b;
    //   36: aload_0
    //   37: aconst_null
    //   38: putfield 46	com/wandoujia/p4/community/utils/a:g	Landroid/content/SharedPreferences$Editor;
    //   41: aload_0
    //   42: aconst_null
    //   43: putfield 48	com/wandoujia/p4/community/utils/a:h	Lcom/alipay/ut/b/b$a;
    //   46: aload_0
    //   47: aconst_null
    //   48: putfield 50	com/wandoujia/p4/community/utils/a:i	Landroid/content/Context;
    //   51: aload_0
    //   52: aconst_null
    //   53: putfield 52	com/wandoujia/p4/community/utils/a:j	Lcom/alipay/ut/b/c;
    //   56: aload_0
    //   57: iconst_0
    //   58: putfield 54	com/wandoujia/p4/community/utils/a:k	Z
    //   61: aload_0
    //   62: iconst_1
    //   63: putfield 54	com/wandoujia/p4/community/utils/a:k	Z
    //   66: aload_0
    //   67: aload_3
    //   68: putfield 34	com/wandoujia/p4/community/utils/a:a	Ljava/lang/String;
    //   71: aload_0
    //   72: aload_2
    //   73: putfield 36	com/wandoujia/p4/community/utils/a:b	Ljava/lang/String;
    //   76: aload_0
    //   77: aload_1
    //   78: putfield 50	com/wandoujia/p4/community/utils/a:i	Landroid/content/Context;
    //   81: aload_1
    //   82: ifnull +571 -> 653
    //   85: aload_0
    //   86: aload_1
    //   87: aload_3
    //   88: iconst_0
    //   89: invokevirtual 60	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   92: putfield 42	com/wandoujia/p4/community/utils/a:e	Landroid/content/SharedPreferences;
    //   95: aload_0
    //   96: getfield 42	com/wandoujia/p4/community/utils/a:e	Landroid/content/SharedPreferences;
    //   99: ldc 62
    //   101: lconst_0
    //   102: invokeinterface 68 4 0
    //   107: lstore 4
    //   109: invokestatic 74	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   112: astore 6
    //   114: aload 6
    //   116: invokestatic 79	android/support/v4/app/b:i	(Ljava/lang/String;)Z
    //   119: ifne +319 -> 438
    //   122: aload 6
    //   124: ldc 81
    //   126: invokevirtual 87	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   129: ifeq +286 -> 415
    //   132: aload_0
    //   133: iconst_1
    //   134: putfield 40	com/wandoujia/p4/community/utils/a:d	Z
    //   137: aload_0
    //   138: iconst_1
    //   139: putfield 38	com/wandoujia/p4/community/utils/a:c	Z
    //   142: aload_0
    //   143: getfield 38	com/wandoujia/p4/community/utils/a:c	Z
    //   146: ifne +10 -> 156
    //   149: aload_0
    //   150: getfield 40	com/wandoujia/p4/community/utils/a:d	Z
    //   153: ifeq +490 -> 643
    //   156: aload_1
    //   157: ifnull +486 -> 643
    //   160: aload_2
    //   161: invokestatic 79	android/support/v4/app/b:i	(Ljava/lang/String;)Z
    //   164: ifne +479 -> 643
    //   167: aload_0
    //   168: aload_0
    //   169: aload_2
    //   170: invokespecial 90	com/wandoujia/p4/community/utils/a:c	(Ljava/lang/String;)Lcom/alipay/ut/b/c;
    //   173: putfield 52	com/wandoujia/p4/community/utils/a:j	Lcom/alipay/ut/b/c;
    //   176: aload_0
    //   177: getfield 52	com/wandoujia/p4/community/utils/a:j	Lcom/alipay/ut/b/c;
    //   180: ifnull +463 -> 643
    //   183: aload_0
    //   184: aload_0
    //   185: getfield 52	com/wandoujia/p4/community/utils/a:j	Lcom/alipay/ut/b/c;
    //   188: aload_3
    //   189: invokevirtual 95	com/alipay/ut/b/c:a	(Ljava/lang/String;)Lcom/alipay/ut/b/b;
    //   192: putfield 44	com/wandoujia/p4/community/utils/a:f	Lcom/alipay/ut/b/b;
    //   195: aload_0
    //   196: getfield 44	com/wandoujia/p4/community/utils/a:f	Lcom/alipay/ut/b/b;
    //   199: ldc 62
    //   201: lconst_0
    //   202: invokeinterface 98 4 0
    //   207: lstore 23
    //   209: aload_0
    //   210: getfield 42	com/wandoujia/p4/community/utils/a:e	Landroid/content/SharedPreferences;
    //   213: ldc 100
    //   215: lconst_0
    //   216: invokeinterface 68 4 0
    //   221: lstore 26
    //   223: lload 26
    //   225: lstore 7
    //   227: aload_0
    //   228: getfield 44	com/wandoujia/p4/community/utils/a:f	Lcom/alipay/ut/b/b;
    //   231: ldc 100
    //   233: lconst_0
    //   234: invokeinterface 98 4 0
    //   239: lstore 29
    //   241: lload 29
    //   243: lstore 9
    //   245: lload 7
    //   247: lload 9
    //   249: lcmp
    //   250: ifge +201 -> 451
    //   253: lload 7
    //   255: lconst_0
    //   256: lcmp
    //   257: ifle +194 -> 451
    //   260: aload_0
    //   261: getfield 42	com/wandoujia/p4/community/utils/a:e	Landroid/content/SharedPreferences;
    //   264: aload_0
    //   265: getfield 44	com/wandoujia/p4/community/utils/a:f	Lcom/alipay/ut/b/b;
    //   268: invokestatic 103	com/wandoujia/p4/community/utils/a:a	(Landroid/content/SharedPreferences;Lcom/alipay/ut/b/b;)V
    //   271: aload_0
    //   272: aload_0
    //   273: getfield 52	com/wandoujia/p4/community/utils/a:j	Lcom/alipay/ut/b/c;
    //   276: aload_3
    //   277: invokevirtual 95	com/alipay/ut/b/c:a	(Ljava/lang/String;)Lcom/alipay/ut/b/b;
    //   280: putfield 44	com/wandoujia/p4/community/utils/a:f	Lcom/alipay/ut/b/b;
    //   283: lload 7
    //   285: lload 9
    //   287: lcmp
    //   288: ifne +17 -> 305
    //   291: lload 7
    //   293: lconst_0
    //   294: lcmp
    //   295: ifne +119 -> 414
    //   298: lload 9
    //   300: lconst_0
    //   301: lcmp
    //   302: ifne +112 -> 414
    //   305: invokestatic 109	java/lang/System:currentTimeMillis	()J
    //   308: lstore 11
    //   310: aload_0
    //   311: getfield 54	com/wandoujia/p4/community/utils/a:k	Z
    //   314: ifeq +24 -> 338
    //   317: aload_0
    //   318: getfield 54	com/wandoujia/p4/community/utils/a:k	Z
    //   321: ifeq +93 -> 414
    //   324: lload 7
    //   326: lconst_0
    //   327: lcmp
    //   328: ifne +86 -> 414
    //   331: lload 9
    //   333: lconst_0
    //   334: lcmp
    //   335: ifne +79 -> 414
    //   338: aload_0
    //   339: getfield 42	com/wandoujia/p4/community/utils/a:e	Landroid/content/SharedPreferences;
    //   342: ifnull +34 -> 376
    //   345: aload_0
    //   346: getfield 42	com/wandoujia/p4/community/utils/a:e	Landroid/content/SharedPreferences;
    //   349: invokeinterface 113 1 0
    //   354: astore 17
    //   356: aload 17
    //   358: ldc 100
    //   360: lload 11
    //   362: invokeinterface 119 4 0
    //   367: pop
    //   368: aload 17
    //   370: invokeinterface 123 1 0
    //   375: pop
    //   376: aload_0
    //   377: getfield 44	com/wandoujia/p4/community/utils/a:f	Lcom/alipay/ut/b/b;
    //   380: ifnull +34 -> 414
    //   383: aload_0
    //   384: getfield 44	com/wandoujia/p4/community/utils/a:f	Lcom/alipay/ut/b/b;
    //   387: invokeinterface 127 1 0
    //   392: astore 14
    //   394: aload 14
    //   396: ldc 100
    //   398: lload 11
    //   400: invokeinterface 132 4 0
    //   405: pop
    //   406: aload 14
    //   408: invokeinterface 133 1 0
    //   413: pop
    //   414: return
    //   415: aload 6
    //   417: ldc 135
    //   419: invokevirtual 87	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   422: ifeq +16 -> 438
    //   425: aload_0
    //   426: iconst_1
    //   427: putfield 38	com/wandoujia/p4/community/utils/a:c	Z
    //   430: aload_0
    //   431: iconst_0
    //   432: putfield 40	com/wandoujia/p4/community/utils/a:d	Z
    //   435: goto -293 -> 142
    //   438: aload_0
    //   439: iconst_0
    //   440: putfield 40	com/wandoujia/p4/community/utils/a:d	Z
    //   443: aload_0
    //   444: iconst_0
    //   445: putfield 38	com/wandoujia/p4/community/utils/a:c	Z
    //   448: goto -306 -> 142
    //   451: lload 7
    //   453: lload 9
    //   455: lcmp
    //   456: ifle +34 -> 490
    //   459: lload 9
    //   461: lconst_0
    //   462: lcmp
    //   463: ifle +27 -> 490
    //   466: aload_0
    //   467: getfield 44	com/wandoujia/p4/community/utils/a:f	Lcom/alipay/ut/b/b;
    //   470: aload_0
    //   471: getfield 42	com/wandoujia/p4/community/utils/a:e	Landroid/content/SharedPreferences;
    //   474: invokestatic 138	com/wandoujia/p4/community/utils/a:a	(Lcom/alipay/ut/b/b;Landroid/content/SharedPreferences;)V
    //   477: aload_0
    //   478: aload_1
    //   479: aload_3
    //   480: iconst_0
    //   481: invokevirtual 60	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   484: putfield 42	com/wandoujia/p4/community/utils/a:e	Landroid/content/SharedPreferences;
    //   487: goto -204 -> 283
    //   490: lload 7
    //   492: lconst_0
    //   493: lcmp
    //   494: ifne +34 -> 528
    //   497: lload 9
    //   499: lconst_0
    //   500: lcmp
    //   501: ifle +27 -> 528
    //   504: aload_0
    //   505: getfield 44	com/wandoujia/p4/community/utils/a:f	Lcom/alipay/ut/b/b;
    //   508: aload_0
    //   509: getfield 42	com/wandoujia/p4/community/utils/a:e	Landroid/content/SharedPreferences;
    //   512: invokestatic 138	com/wandoujia/p4/community/utils/a:a	(Lcom/alipay/ut/b/b;Landroid/content/SharedPreferences;)V
    //   515: aload_0
    //   516: aload_1
    //   517: aload_3
    //   518: iconst_0
    //   519: invokevirtual 60	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   522: putfield 42	com/wandoujia/p4/community/utils/a:e	Landroid/content/SharedPreferences;
    //   525: goto -242 -> 283
    //   528: lload 9
    //   530: lconst_0
    //   531: lcmp
    //   532: ifne +36 -> 568
    //   535: lload 7
    //   537: lconst_0
    //   538: lcmp
    //   539: ifle +29 -> 568
    //   542: aload_0
    //   543: getfield 42	com/wandoujia/p4/community/utils/a:e	Landroid/content/SharedPreferences;
    //   546: aload_0
    //   547: getfield 44	com/wandoujia/p4/community/utils/a:f	Lcom/alipay/ut/b/b;
    //   550: invokestatic 103	com/wandoujia/p4/community/utils/a:a	(Landroid/content/SharedPreferences;Lcom/alipay/ut/b/b;)V
    //   553: aload_0
    //   554: aload_0
    //   555: getfield 52	com/wandoujia/p4/community/utils/a:j	Lcom/alipay/ut/b/c;
    //   558: aload_3
    //   559: invokevirtual 95	com/alipay/ut/b/c:a	(Ljava/lang/String;)Lcom/alipay/ut/b/b;
    //   562: putfield 44	com/wandoujia/p4/community/utils/a:f	Lcom/alipay/ut/b/b;
    //   565: goto -282 -> 283
    //   568: lload 7
    //   570: lload 9
    //   572: lcmp
    //   573: ifne -290 -> 283
    //   576: aload_0
    //   577: getfield 42	com/wandoujia/p4/community/utils/a:e	Landroid/content/SharedPreferences;
    //   580: aload_0
    //   581: getfield 44	com/wandoujia/p4/community/utils/a:f	Lcom/alipay/ut/b/b;
    //   584: invokestatic 103	com/wandoujia/p4/community/utils/a:a	(Landroid/content/SharedPreferences;Lcom/alipay/ut/b/b;)V
    //   587: aload_0
    //   588: aload_0
    //   589: getfield 52	com/wandoujia/p4/community/utils/a:j	Lcom/alipay/ut/b/c;
    //   592: aload_3
    //   593: invokevirtual 95	com/alipay/ut/b/c:a	(Ljava/lang/String;)Lcom/alipay/ut/b/b;
    //   596: putfield 44	com/wandoujia/p4/community/utils/a:f	Lcom/alipay/ut/b/b;
    //   599: goto -316 -> 283
    //   602: astore 13
    //   604: return
    //   605: astore 20
    //   607: lload 4
    //   609: lstore 21
    //   611: lconst_0
    //   612: lstore 9
    //   614: goto +51 -> 665
    //   617: astore 25
    //   619: lload 4
    //   621: lstore 21
    //   623: lload 23
    //   625: lstore 9
    //   627: goto +38 -> 665
    //   630: astore 28
    //   632: lload 23
    //   634: lstore 9
    //   636: lload 7
    //   638: lstore 21
    //   640: goto +25 -> 665
    //   643: lload 4
    //   645: lstore 7
    //   647: lconst_0
    //   648: lstore 9
    //   650: goto -367 -> 283
    //   653: lconst_0
    //   654: lstore 4
    //   656: goto -547 -> 109
    //   659: astore 31
    //   661: lload 7
    //   663: lstore 21
    //   665: lload 21
    //   667: lstore 7
    //   669: goto -386 -> 283
    //
    // Exception table:
    //   from	to	target	type
    //   376	414	602	java/lang/Exception
    //   183	209	605	java/lang/Exception
    //   209	223	617	java/lang/Exception
    //   227	241	630	java/lang/Exception
    //   260	283	659	java/lang/Exception
    //   466	487	659	java/lang/Exception
    //   504	525	659	java/lang/Exception
    //   542	565	659	java/lang/Exception
    //   576	599	659	java/lang/Exception
  }

  public static com.wandoujia.ripple_framework.view.a.a a(Context paramContext, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, DialogInterface.OnClickListener paramOnClickListener1, CharSequence paramCharSequence4, DialogInterface.OnClickListener paramOnClickListener2)
  {
    return b(paramContext, paramCharSequence1, paramCharSequence2, paramCharSequence3, paramOnClickListener1, paramCharSequence4, paramOnClickListener2);
  }

  public static Object a(XmlPullParser paramXmlPullParser, String[] paramArrayOfString)
  {
    int m = paramXmlPullParser.getEventType();
    while (true)
    {
      if (m == 2)
        return b(paramXmlPullParser, paramArrayOfString);
      if (m == 3)
        throw new XmlPullParserException("Unexpected end tag at: " + paramXmlPullParser.getName());
      if (m == 4)
        throw new XmlPullParserException("Unexpected text: " + paramXmlPullParser.getText());
      try
      {
        int n = paramXmlPullParser.next();
        m = n;
        if (m != 1)
          continue;
        throw new XmlPullParserException("Unexpected end of document");
      }
      catch (Exception localException)
      {
      }
    }
    throw new XmlPullParserException("Unexpected call next(): " + paramXmlPullParser.getName());
  }

  private static HashMap a(XmlPullParser paramXmlPullParser, String paramString, String[] paramArrayOfString)
  {
    HashMap localHashMap = new HashMap();
    int m = paramXmlPullParser.getEventType();
    if (m == 2)
    {
      Object localObject = b(paramXmlPullParser, paramArrayOfString);
      if (paramArrayOfString[0] != null)
        localHashMap.put(paramArrayOfString[0], localObject);
    }
    do
    {
      m = paramXmlPullParser.next();
      if (m != 1)
        break;
      throw new XmlPullParserException("Document ended before " + paramString + " end tag");
      throw new XmlPullParserException("Map value without name attribute: " + paramXmlPullParser.getName());
    }
    while (m != 3);
    if (paramXmlPullParser.getName().equals(paramString))
      return localHashMap;
    throw new XmlPullParserException("Expected " + paramString + " end tag at: " + paramXmlPullParser.getName());
  }

  public static void a(Activity paramActivity, String paramString)
  {
    a(paramActivity, paramActivity.getString(2131624474), paramString, paramActivity.getString(2131624330), new b(), paramActivity.getString(2131624157), new c(paramActivity));
  }

  public static void a(Activity paramActivity, String paramString1, String paramString2)
  {
    a(paramActivity, paramActivity.getString(2131624465), paramString1, paramActivity.getString(2131624466), new d(), paramActivity.getString(2131624465), new e(paramString2, paramActivity));
  }

  private static void a(SharedPreferences paramSharedPreferences, com.alipay.ut.b.b paramb)
  {
    if ((paramSharedPreferences != null) && (paramb != null))
    {
      b.a locala = paramb.m();
      if (locala != null)
      {
        locala.n();
        Iterator localIterator = paramSharedPreferences.getAll().entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          String str = (String)localEntry.getKey();
          Object localObject = localEntry.getValue();
          if ((localObject instanceof String))
          {
            locala.b(str, (String)localObject);
            continue;
          }
          if ((localObject instanceof Integer))
          {
            locala.a(str, ((Integer)localObject).intValue());
            continue;
          }
          if ((localObject instanceof Long))
          {
            locala.a(str, ((Long)localObject).longValue());
            continue;
          }
          if ((localObject instanceof Float))
          {
            locala.a(str, ((Float)localObject).floatValue());
            continue;
          }
          if (!(localObject instanceof Boolean))
            continue;
          locala.a(str, ((Boolean)localObject).booleanValue());
        }
        locala.commit();
      }
    }
  }

  private static void a(com.alipay.ut.b.b paramb, SharedPreferences paramSharedPreferences)
  {
    if ((paramb != null) && (paramSharedPreferences != null))
    {
      SharedPreferences.Editor localEditor = paramSharedPreferences.edit();
      if (localEditor != null)
      {
        localEditor.clear();
        Iterator localIterator = paramb.getAll().entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          String str = (String)localEntry.getKey();
          Object localObject = localEntry.getValue();
          if ((localObject instanceof String))
          {
            localEditor.putString(str, (String)localObject);
            continue;
          }
          if ((localObject instanceof Integer))
          {
            localEditor.putInt(str, ((Integer)localObject).intValue());
            continue;
          }
          if ((localObject instanceof Long))
          {
            localEditor.putLong(str, ((Long)localObject).longValue());
            continue;
          }
          if ((localObject instanceof Float))
          {
            localEditor.putFloat(str, ((Float)localObject).floatValue());
            continue;
          }
          if (!(localObject instanceof Boolean))
            continue;
          localEditor.putBoolean(str, ((Boolean)localObject).booleanValue());
        }
        localEditor.commit();
      }
    }
  }

  private static void a(Object paramObject, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramObject == null)
    {
      paramXmlSerializer.startTag(null, "null");
      if (paramString != null)
        paramXmlSerializer.attribute(null, "name", paramString);
      paramXmlSerializer.endTag(null, "null");
      return;
    }
    if ((paramObject instanceof String))
    {
      paramXmlSerializer.startTag(null, "string");
      if (paramString != null)
        paramXmlSerializer.attribute(null, "name", paramString);
      paramXmlSerializer.text(paramObject.toString());
      paramXmlSerializer.endTag(null, "string");
      return;
    }
    String str;
    if ((paramObject instanceof Integer))
      str = "int";
    while (true)
    {
      paramXmlSerializer.startTag(null, str);
      if (paramString != null)
        paramXmlSerializer.attribute(null, "name", paramString);
      paramXmlSerializer.attribute(null, "value", paramObject.toString());
      paramXmlSerializer.endTag(null, str);
      return;
      if ((paramObject instanceof Long))
      {
        str = "long";
        continue;
      }
      if ((paramObject instanceof Float))
      {
        str = "float";
        continue;
      }
      if ((paramObject instanceof Double))
      {
        str = "double";
        continue;
      }
      if (!(paramObject instanceof Boolean))
        break;
      str = "boolean";
    }
    if ((paramObject instanceof byte[]))
    {
      byte[] arrayOfByte = (byte[])paramObject;
      if (arrayOfByte == null)
      {
        paramXmlSerializer.startTag(null, "null");
        paramXmlSerializer.endTag(null, "null");
        return;
      }
      paramXmlSerializer.startTag(null, "byte-array");
      if (paramString != null)
        paramXmlSerializer.attribute(null, "name", paramString);
      int m = arrayOfByte.length;
      paramXmlSerializer.attribute(null, "num", Integer.toString(m));
      StringBuilder localStringBuilder = new StringBuilder(2 * arrayOfByte.length);
      int n = 0;
      if (n < m)
      {
        int i1 = arrayOfByte[n];
        int i2 = i1 >> 4;
        int i3;
        label367: int i4;
        if (i2 >= 10)
        {
          i3 = -10 + (i2 + 97);
          localStringBuilder.append(i3);
          i4 = i1 & 0xFF;
          if (i4 < 10)
            break label424;
        }
        label424: for (int i5 = -10 + (i4 + 97); ; i5 = i4 + 48)
        {
          localStringBuilder.append(i5);
          n++;
          break;
          i3 = i2 + 48;
          break label367;
        }
      }
      paramXmlSerializer.text(localStringBuilder.toString());
      paramXmlSerializer.endTag(null, "byte-array");
      return;
    }
    if ((paramObject instanceof int[]))
    {
      a((int[])paramObject, paramString, paramXmlSerializer);
      return;
    }
    if ((paramObject instanceof Map))
    {
      a((Map)paramObject, paramString, paramXmlSerializer);
      return;
    }
    if ((paramObject instanceof List))
    {
      a((List)paramObject, paramString, paramXmlSerializer);
      return;
    }
    if ((paramObject instanceof CharSequence))
    {
      paramXmlSerializer.startTag(null, "string");
      if (paramString != null)
        paramXmlSerializer.attribute(null, "name", paramString);
      paramXmlSerializer.text(paramObject.toString());
      paramXmlSerializer.endTag(null, "string");
      return;
    }
    throw new RuntimeException("writeValueXml: unable to write value " + paramObject);
  }

  private static void a(List paramList, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramList == null)
    {
      paramXmlSerializer.startTag(null, "null");
      paramXmlSerializer.endTag(null, "null");
      return;
    }
    paramXmlSerializer.startTag(null, "list");
    if (paramString != null)
      paramXmlSerializer.attribute(null, "name", paramString);
    int m = paramList.size();
    for (int n = 0; n < m; n++)
      a(paramList.get(n), null, paramXmlSerializer);
    paramXmlSerializer.endTag(null, "list");
  }

  public static void a(Map paramMap, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramMap == null)
    {
      paramXmlSerializer.startTag(null, "null");
      paramXmlSerializer.endTag(null, "null");
      return;
    }
    Iterator localIterator = paramMap.entrySet().iterator();
    paramXmlSerializer.startTag(null, "map");
    if (paramString != null)
      paramXmlSerializer.attribute(null, "name", paramString);
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      a(localEntry.getValue(), (String)localEntry.getKey(), paramXmlSerializer);
    }
    paramXmlSerializer.endTag(null, "map");
  }

  private static void a(int[] paramArrayOfInt, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramArrayOfInt == null)
    {
      paramXmlSerializer.startTag(null, "null");
      paramXmlSerializer.endTag(null, "null");
      return;
    }
    paramXmlSerializer.startTag(null, "int-array");
    if (paramString != null)
      paramXmlSerializer.attribute(null, "name", paramString);
    int m = paramArrayOfInt.length;
    paramXmlSerializer.attribute(null, "num", Integer.toString(m));
    for (int n = 0; n < m; n++)
    {
      paramXmlSerializer.startTag(null, "item");
      paramXmlSerializer.attribute(null, "value", Integer.toString(paramArrayOfInt[n]));
      paramXmlSerializer.endTag(null, "item");
    }
    paramXmlSerializer.endTag(null, "int-array");
  }

  // ERROR //
  private static int[] a(XmlPullParser paramXmlPullParser, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: ldc_w 364
    //   5: invokeinterface 421 3 0
    //   10: invokestatic 425	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   13: istore 4
    //   15: iload 4
    //   17: newarray int
    //   19: astore 5
    //   21: aload_0
    //   22: invokeinterface 148 1 0
    //   27: istore 6
    //   29: iconst_0
    //   30: istore 7
    //   32: iload 6
    //   34: istore 8
    //   36: iload 8
    //   38: iconst_2
    //   39: if_icmpne +159 -> 198
    //   42: aload_0
    //   43: invokeinterface 162 1 0
    //   48: ldc_w 412
    //   51: invokevirtual 87	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   54: ifeq +114 -> 168
    //   57: aload 5
    //   59: iload 7
    //   61: aload_0
    //   62: aconst_null
    //   63: ldc_w 348
    //   66: invokeinterface 421 3 0
    //   71: invokestatic 425	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   74: iastore
    //   75: aload_0
    //   76: invokeinterface 178 1 0
    //   81: istore 8
    //   83: iload 8
    //   85: iconst_1
    //   86: if_icmpne -50 -> 36
    //   89: new 152	org/xmlpull/v1/XmlPullParserException
    //   92: dup
    //   93: new 154	java/lang/StringBuilder
    //   96: dup
    //   97: ldc 192
    //   99: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   102: aload_1
    //   103: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: ldc 194
    //   108: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: invokespecial 170	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   117: athrow
    //   118: astore_3
    //   119: new 152	org/xmlpull/v1/XmlPullParserException
    //   122: dup
    //   123: ldc_w 427
    //   126: invokespecial 170	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   129: athrow
    //   130: astore_2
    //   131: new 152	org/xmlpull/v1/XmlPullParserException
    //   134: dup
    //   135: ldc_w 429
    //   138: invokespecial 170	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   141: athrow
    //   142: astore 10
    //   144: new 152	org/xmlpull/v1/XmlPullParserException
    //   147: dup
    //   148: ldc_w 431
    //   151: invokespecial 170	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   154: athrow
    //   155: astore 9
    //   157: new 152	org/xmlpull/v1/XmlPullParserException
    //   160: dup
    //   161: ldc_w 433
    //   164: invokespecial 170	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   167: athrow
    //   168: new 152	org/xmlpull/v1/XmlPullParserException
    //   171: dup
    //   172: new 154	java/lang/StringBuilder
    //   175: dup
    //   176: ldc_w 435
    //   179: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   182: aload_0
    //   183: invokeinterface 162 1 0
    //   188: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   194: invokespecial 170	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   197: athrow
    //   198: iload 8
    //   200: iconst_3
    //   201: if_icmpne -126 -> 75
    //   204: aload_0
    //   205: invokeinterface 162 1 0
    //   210: aload_1
    //   211: invokevirtual 87	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   214: ifeq +6 -> 220
    //   217: aload 5
    //   219: areturn
    //   220: aload_0
    //   221: invokeinterface 162 1 0
    //   226: ldc_w 412
    //   229: invokevirtual 87	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   232: ifeq +9 -> 241
    //   235: iinc 7 1
    //   238: goto -163 -> 75
    //   241: new 152	org/xmlpull/v1/XmlPullParserException
    //   244: dup
    //   245: new 154	java/lang/StringBuilder
    //   248: dup
    //   249: ldc 198
    //   251: invokespecial 159	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   254: aload_1
    //   255: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: ldc 200
    //   260: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: aload_0
    //   264: invokeinterface 162 1 0
    //   269: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   275: invokespecial 170	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   278: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   0	15	118	java/lang/NullPointerException
    //   0	15	130	java/lang/NumberFormatException
    //   57	75	142	java/lang/NullPointerException
    //   57	75	155	java/lang/NumberFormatException
  }

  private static com.wandoujia.ripple_framework.view.a.a b(Context paramContext, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, DialogInterface.OnClickListener paramOnClickListener1, CharSequence paramCharSequence4, DialogInterface.OnClickListener paramOnClickListener2)
  {
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()));
    for (int m = 1; m != 0; m = 0)
      return null;
    h localh = new h(paramContext);
    if (paramCharSequence1 != null)
      localh.a(paramCharSequence1);
    if (paramCharSequence2 != null)
      localh.b(paramCharSequence2);
    if (paramCharSequence3 != null)
      localh.b(paramCharSequence3, paramOnClickListener1);
    if (paramCharSequence4 != null)
      localh.a(paramCharSequence4, paramOnClickListener2);
    localh.a(true);
    localh.a(new j());
    try
    {
      com.wandoujia.ripple_framework.view.a.a locala = localh.b();
      return locala;
    }
    catch (Throwable localThrowable)
    {
    }
    return null;
  }

  private static Object b(XmlPullParser paramXmlPullParser, String[] paramArrayOfString)
  {
    String str1 = paramXmlPullParser.getAttributeValue(null, "name");
    String str2 = paramXmlPullParser.getName();
    boolean bool = str2.equals("null");
    Object localObject = null;
    if (bool);
    while (true)
    {
      int m = paramXmlPullParser.next();
      if (m == 1)
        break;
      if (m == 3)
      {
        if (paramXmlPullParser.getName().equals(str2))
        {
          paramArrayOfString[0] = str1;
          return localObject;
          if (str2.equals("string"))
          {
            String str3 = "";
            while (true)
            {
              int n = paramXmlPullParser.next();
              if (n == 1)
                break;
              if (n == 3)
              {
                if (paramXmlPullParser.getName().equals("string"))
                {
                  paramArrayOfString[0] = str1;
                  return str3;
                }
                throw new XmlPullParserException("Unexpected end tag in <string>: " + paramXmlPullParser.getName());
              }
              if (n == 4)
              {
                str3 = str3 + paramXmlPullParser.getText();
                continue;
              }
              if (n != 2)
                continue;
              throw new XmlPullParserException("Unexpected start tag in <string>: " + paramXmlPullParser.getName());
            }
            throw new XmlPullParserException("Unexpected end of document in <string>");
          }
          if (str2.equals("int"))
          {
            localObject = Integer.valueOf(Integer.parseInt(paramXmlPullParser.getAttributeValue(null, "value")));
            continue;
          }
          if (str2.equals("long"))
          {
            localObject = Long.valueOf(paramXmlPullParser.getAttributeValue(null, "value"));
            continue;
          }
          if (str2.equals("float"))
          {
            localObject = new Float(paramXmlPullParser.getAttributeValue(null, "value"));
            continue;
          }
          if (str2.equals("double"))
          {
            localObject = new Double(paramXmlPullParser.getAttributeValue(null, "value"));
            continue;
          }
          if (str2.equals("boolean"))
          {
            localObject = Boolean.valueOf(paramXmlPullParser.getAttributeValue(null, "value"));
            continue;
          }
          if (str2.equals("int-array"))
          {
            paramXmlPullParser.next();
            int[] arrayOfInt = a(paramXmlPullParser, "int-array");
            paramArrayOfString[0] = str1;
            return arrayOfInt;
          }
          if (str2.equals("map"))
          {
            paramXmlPullParser.next();
            HashMap localHashMap = a(paramXmlPullParser, "map", paramArrayOfString);
            paramArrayOfString[0] = str1;
            return localHashMap;
          }
          if (str2.equals("list"))
          {
            paramXmlPullParser.next();
            ArrayList localArrayList = b(paramXmlPullParser, "list", paramArrayOfString);
            paramArrayOfString[0] = str1;
            return localArrayList;
          }
          throw new XmlPullParserException("Unknown tag: " + str2);
        }
        throw new XmlPullParserException("Unexpected end tag in <" + str2 + ">: " + paramXmlPullParser.getName());
      }
      if (m == 4)
        throw new XmlPullParserException("Unexpected text in <" + str2 + ">: " + paramXmlPullParser.getName());
      if (m != 2)
        continue;
      throw new XmlPullParserException("Unexpected start tag in <" + str2 + ">: " + paramXmlPullParser.getName());
    }
    throw new XmlPullParserException("Unexpected end of document in <" + str2 + ">");
  }

  private static ArrayList b(XmlPullParser paramXmlPullParser, String paramString, String[] paramArrayOfString)
  {
    ArrayList localArrayList = new ArrayList();
    int m = paramXmlPullParser.getEventType();
    if (m == 2)
      localArrayList.add(b(paramXmlPullParser, paramArrayOfString));
    do
    {
      m = paramXmlPullParser.next();
      if (m != 1)
        break;
      throw new XmlPullParserException("Document ended before " + paramString + " end tag");
    }
    while (m != 3);
    if (paramXmlPullParser.getName().equals(paramString))
      return localArrayList;
    throw new XmlPullParserException("Expected " + paramString + " end tag at: " + paramXmlPullParser.getName());
  }

  private com.alipay.ut.b.c c(String paramString)
  {
    File localFile1 = Environment.getExternalStorageDirectory();
    File localFile2;
    if (localFile1 != null)
    {
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = localFile1.getAbsolutePath();
      arrayOfObject[1] = File.separator;
      arrayOfObject[2] = paramString;
      localFile2 = new File(String.format("%s%s%s", arrayOfObject));
      if (!localFile2.exists())
        localFile2.mkdirs();
    }
    while (true)
    {
      com.alipay.ut.b.c localc = null;
      if (localFile2 != null)
      {
        this.j = new com.alipay.ut.b.c(localFile2.getAbsolutePath());
        localc = this.j;
      }
      return localc;
      localFile2 = null;
    }
  }

  private boolean c()
  {
    if (this.f != null)
    {
      boolean bool = this.f.l();
      if (!bool)
        b();
      return bool;
    }
    return false;
  }

  private void d()
  {
    if ((this.g == null) && (this.e != null))
      this.g = this.e.edit();
    if ((this.d) && (this.h == null) && (this.f != null))
      this.h = this.f.m();
    c();
  }

  public String a(String paramString)
  {
    c();
    if (this.e != null)
    {
      String str = this.e.getString(paramString, "");
      if (!android.support.v4.app.b.i(str))
        return str;
    }
    if (this.f != null)
      return this.f.getString(paramString, "");
    return "";
  }

  public void a()
  {
    d();
    long l = System.currentTimeMillis();
    if (this.g != null)
    {
      this.g.clear();
      this.g.putLong("t", l);
    }
    if (this.h != null)
    {
      this.h.n();
      this.h.a("t", l);
    }
  }

  public void a(String paramString, long paramLong)
  {
    if ((!android.support.v4.app.b.i(paramString)) && (!paramString.equals("t")))
    {
      d();
      if (this.g != null)
        this.g.putLong(paramString, paramLong);
      if (this.h != null)
        this.h.a(paramString, paramLong);
    }
  }

  public void a(String paramString1, String paramString2)
  {
    if ((!android.support.v4.app.b.i(paramString1)) && (!paramString1.equals("t")))
    {
      d();
      if (this.g != null)
        this.g.putString(paramString1, paramString2);
      if (this.h != null)
        this.h.b(paramString1, paramString2);
    }
  }

  public long b(String paramString)
  {
    long l = 0L;
    c();
    if (this.e != null)
      l = this.e.getLong(paramString, l);
    do
      return l;
    while (this.f == null);
    return this.f.getLong(paramString, l);
  }

  public boolean b()
  {
    int m = 1;
    long l = System.currentTimeMillis();
    if (this.g != null)
    {
      if ((!this.k) && (this.e != null))
        this.g.putLong("t", l);
      if (!this.g.commit())
        m = 0;
    }
    if ((this.e != null) && (this.i != null))
      this.e = this.i.getSharedPreferences(this.a, 0);
    String str = Environment.getExternalStorageState();
    if (!android.support.v4.app.b.i(str))
      if (str.equals("mounted"))
      {
        if (this.f != null)
          break label238;
        com.alipay.ut.b.c localc = c(this.b);
        if (localc != null)
        {
          this.f = localc.a(this.a);
          if (this.k)
            break label224;
          a(this.e, this.f);
        }
      }
    while (true)
    {
      this.h = this.f.m();
      label173: if ((str.equals("mounted")) || ((str.equals("mounted_ro")) && (this.f != null)));
      try
      {
        if (this.j != null)
          this.f = this.j.a(this.a);
        return m;
        label224: a(this.f, this.e);
        continue;
        label238: if ((this.h == null) || (this.h.commit()))
          break label173;
        m = 0;
      }
      catch (Exception localException)
      {
      }
    }
    return m;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.utils.a
 * JD-Core Version:    0.6.0
 */