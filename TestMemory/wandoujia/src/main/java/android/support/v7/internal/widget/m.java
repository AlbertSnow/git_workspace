package android.support.v7.internal.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;

public class m extends DataSetObservable
{
  private static final String a = m.class.getSimpleName();
  private final Object b;
  private final List<n> c;
  private final List<o> d;
  private final Context e;
  private final String f;
  private boolean g;
  private boolean h;
  private boolean i;

  static
  {
    new Object();
    new HashMap();
  }

  private void f()
  {
    boolean bool = true;
    if ((this.g) && (this.i) && (!TextUtils.isEmpty(this.f)))
    {
      this.g = false;
      this.h = bool;
      h();
    }
    while (true)
    {
      int j = bool | false;
      g();
      if (j != 0)
        notifyChanged();
      return;
      bool = false;
    }
  }

  private void g()
  {
    int j = 0 + this.d.size();
    if (j <= 0);
    while (true)
    {
      return;
      this.i = true;
      for (int k = 0; k < j; k++)
        this.d.remove(0);
    }
  }

  // ERROR //
  private void h()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 41	android/support/v7/internal/widget/m:e	Landroid/content/Context;
    //   4: aload_0
    //   5: getfield 44	android/support/v7/internal/widget/m:f	Ljava/lang/String;
    //   8: invokevirtual 88	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   11: astore_2
    //   12: invokestatic 94	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   15: astore 11
    //   17: aload 11
    //   19: aload_2
    //   20: aconst_null
    //   21: invokeinterface 100 3 0
    //   26: iconst_0
    //   27: istore 12
    //   29: iload 12
    //   31: iconst_1
    //   32: if_icmpeq +21 -> 53
    //   35: iload 12
    //   37: iconst_2
    //   38: if_icmpeq +15 -> 53
    //   41: aload 11
    //   43: invokeinterface 103 1 0
    //   48: istore 12
    //   50: goto -21 -> 29
    //   53: ldc 105
    //   55: aload 11
    //   57: invokeinterface 108 1 0
    //   62: invokevirtual 114	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   65: ifne +41 -> 106
    //   68: new 80	org/xmlpull/v1/XmlPullParserException
    //   71: dup
    //   72: ldc 116
    //   74: invokespecial 119	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   77: athrow
    //   78: astore 8
    //   80: new 121	java/lang/StringBuilder
    //   83: dup
    //   84: ldc 123
    //   86: invokespecial 124	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   89: aload_0
    //   90: getfield 44	android/support/v7/internal/widget/m:f	Ljava/lang/String;
    //   93: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload_2
    //   98: ifnull +7 -> 105
    //   101: aload_2
    //   102: invokevirtual 133	java/io/FileInputStream:close	()V
    //   105: return
    //   106: aload_0
    //   107: getfield 66	android/support/v7/internal/widget/m:d	Ljava/util/List;
    //   110: astore 13
    //   112: aload 13
    //   114: invokeinterface 136 1 0
    //   119: aload 11
    //   121: invokeinterface 103 1 0
    //   126: istore 14
    //   128: iload 14
    //   130: iconst_1
    //   131: if_icmpeq +136 -> 267
    //   134: iload 14
    //   136: iconst_3
    //   137: if_icmpeq -18 -> 119
    //   140: iload 14
    //   142: iconst_4
    //   143: if_icmpeq -24 -> 119
    //   146: ldc 138
    //   148: aload 11
    //   150: invokeinterface 108 1 0
    //   155: invokevirtual 114	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   158: ifne +44 -> 202
    //   161: new 80	org/xmlpull/v1/XmlPullParserException
    //   164: dup
    //   165: ldc 140
    //   167: invokespecial 119	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   170: athrow
    //   171: astore 5
    //   173: new 121	java/lang/StringBuilder
    //   176: dup
    //   177: ldc 123
    //   179: invokespecial 124	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   182: aload_0
    //   183: getfield 44	android/support/v7/internal/widget/m:f	Ljava/lang/String;
    //   186: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: pop
    //   190: aload_2
    //   191: ifnull -86 -> 105
    //   194: aload_2
    //   195: invokevirtual 133	java/io/FileInputStream:close	()V
    //   198: return
    //   199: astore 7
    //   201: return
    //   202: aload 13
    //   204: new 142	android/support/v7/internal/widget/o
    //   207: dup
    //   208: aload 11
    //   210: aconst_null
    //   211: ldc 144
    //   213: invokeinterface 148 3 0
    //   218: aload 11
    //   220: aconst_null
    //   221: ldc 150
    //   223: invokeinterface 148 3 0
    //   228: invokestatic 156	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   231: aload 11
    //   233: aconst_null
    //   234: ldc 158
    //   236: invokeinterface 148 3 0
    //   241: invokestatic 164	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   244: invokespecial 167	android/support/v7/internal/widget/o:<init>	(Ljava/lang/String;JF)V
    //   247: invokeinterface 170 2 0
    //   252: pop
    //   253: goto -134 -> 119
    //   256: astore_3
    //   257: aload_2
    //   258: ifnull +7 -> 265
    //   261: aload_2
    //   262: invokevirtual 133	java/io/FileInputStream:close	()V
    //   265: aload_3
    //   266: athrow
    //   267: aload_2
    //   268: ifnull -163 -> 105
    //   271: aload_2
    //   272: invokevirtual 133	java/io/FileInputStream:close	()V
    //   275: return
    //   276: astore 15
    //   278: return
    //   279: astore 10
    //   281: return
    //   282: astore 4
    //   284: goto -19 -> 265
    //   287: astore_1
    //   288: return
    //
    // Exception table:
    //   from	to	target	type
    //   12	26	78	org/xmlpull/v1/XmlPullParserException
    //   41	50	78	org/xmlpull/v1/XmlPullParserException
    //   53	78	78	org/xmlpull/v1/XmlPullParserException
    //   106	119	78	org/xmlpull/v1/XmlPullParserException
    //   119	128	78	org/xmlpull/v1/XmlPullParserException
    //   146	171	78	org/xmlpull/v1/XmlPullParserException
    //   202	253	78	org/xmlpull/v1/XmlPullParserException
    //   12	26	171	java/io/IOException
    //   41	50	171	java/io/IOException
    //   53	78	171	java/io/IOException
    //   106	119	171	java/io/IOException
    //   119	128	171	java/io/IOException
    //   146	171	171	java/io/IOException
    //   202	253	171	java/io/IOException
    //   194	198	199	java/io/IOException
    //   12	26	256	finally
    //   41	50	256	finally
    //   53	78	256	finally
    //   80	97	256	finally
    //   106	119	256	finally
    //   119	128	256	finally
    //   146	171	256	finally
    //   173	190	256	finally
    //   202	253	256	finally
    //   271	275	276	java/io/IOException
    //   101	105	279	java/io/IOException
    //   261	265	282	java/io/IOException
    //   0	12	287	java/io/FileNotFoundException
  }

  public final int a()
  {
    synchronized (this.b)
    {
      f();
      int j = this.c.size();
      return j;
    }
  }

  public final int a(ResolveInfo paramResolveInfo)
  {
    while (true)
    {
      int k;
      synchronized (this.b)
      {
        f();
        List localList = this.c;
        int j = localList.size();
        k = 0;
        if (k >= j)
          continue;
        if (((n)localList.get(k)).a == paramResolveInfo)
        {
          return k;
          return -1;
        }
      }
      k++;
    }
  }

  public final ResolveInfo a(int paramInt)
  {
    synchronized (this.b)
    {
      f();
      ResolveInfo localResolveInfo = ((n)this.c.get(paramInt)).a;
      return localResolveInfo;
    }
  }

  public final Intent b()
  {
    synchronized (this.b)
    {
      return null;
    }
  }

  public final void b(int paramInt)
  {
    label140: p localp;
    Object[] arrayOfObject;
    while (true)
    {
      synchronized (this.b)
      {
        f();
        n localn = (n)this.c.get(paramInt);
        if ((n)this.c.get(0) != null)
        {
          f1 = 5.0F;
          o localo = new o(new ComponentName(localn.a.activityInfo.packageName, localn.a.activityInfo.name), System.currentTimeMillis(), f1);
          if (!this.d.add(localo))
            break label218;
          this.i = true;
          g();
          if (this.h)
            break label140;
          throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
      }
      float f1 = 1.0F;
      continue;
      if (!this.i)
        break;
      this.i = false;
      if (TextUtils.isEmpty(this.f))
        break;
      localp = new p(this, 0);
      arrayOfObject = new Object[2];
      arrayOfObject[0] = this.d;
      arrayOfObject[1] = this.f;
      if (Build.VERSION.SDK_INT < 11)
        break label221;
      localp.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, arrayOfObject);
    }
    while (true)
    {
      notifyChanged();
      label218: monitorexit;
      return;
      label221: localp.execute(arrayOfObject);
    }
  }

  public final ResolveInfo c()
  {
    synchronized (this.b)
    {
      f();
      if (!this.c.isEmpty())
      {
        ResolveInfo localResolveInfo = ((n)this.c.get(0)).a;
        return localResolveInfo;
      }
      return null;
    }
  }

  public final int d()
  {
    synchronized (this.b)
    {
      f();
      int j = this.d.size();
      return j;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v7.internal.widget.m
 * JD-Core Version:    0.6.0
 */