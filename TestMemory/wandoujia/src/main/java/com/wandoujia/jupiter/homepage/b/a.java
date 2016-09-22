package com.wandoujia.jupiter.homepage.b;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.wandoujia.api.proto.AdDetail;
import com.wandoujia.api.proto.Detail;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.n;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public final class a
{
  private Context a;
  private List<Entity> b;
  private Handler c;
  private Random d;
  private n e;

  // ERROR //
  public a(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 22	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: new 24	java/util/ArrayList
    //   8: dup
    //   9: invokespecial 25	java/util/ArrayList:<init>	()V
    //   12: putfield 27	com/wandoujia/jupiter/homepage/b/a:b	Ljava/util/List;
    //   15: aload_0
    //   16: new 29	android/os/Handler
    //   19: dup
    //   20: invokestatic 35	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   23: invokespecial 38	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   26: putfield 40	com/wandoujia/jupiter/homepage/b/a:c	Landroid/os/Handler;
    //   29: aload_0
    //   30: new 42	java/util/Random
    //   33: dup
    //   34: invokespecial 43	java/util/Random:<init>	()V
    //   37: putfield 45	com/wandoujia/jupiter/homepage/b/a:d	Ljava/util/Random;
    //   40: aload_0
    //   41: new 47	com/wandoujia/jupiter/homepage/b/b
    //   44: dup
    //   45: aload_0
    //   46: invokespecial 50	com/wandoujia/jupiter/homepage/b/b:<init>	(Lcom/wandoujia/jupiter/homepage/b/a;)V
    //   49: putfield 52	com/wandoujia/jupiter/homepage/b/a:e	Lcom/wandoujia/ripple_framework/n;
    //   52: aload_0
    //   53: aload_1
    //   54: putfield 54	com/wandoujia/jupiter/homepage/b/a:a	Landroid/content/Context;
    //   57: invokestatic 59	com/wandoujia/ripple_framework/ReceiverMonitor:a	()Lcom/wandoujia/ripple_framework/ReceiverMonitor;
    //   60: aload_0
    //   61: getfield 52	com/wandoujia/jupiter/homepage/b/a:e	Lcom/wandoujia/ripple_framework/n;
    //   64: invokevirtual 62	com/wandoujia/ripple_framework/ReceiverMonitor:a	(Lcom/wandoujia/ripple_framework/n;)V
    //   67: new 64	java/io/FileReader
    //   70: dup
    //   71: new 66	java/io/File
    //   74: dup
    //   75: aload_0
    //   76: getfield 54	com/wandoujia/jupiter/homepage/b/a:a	Landroid/content/Context;
    //   79: invokevirtual 72	android/content/Context:getFilesDir	()Ljava/io/File;
    //   82: ldc 74
    //   84: invokespecial 77	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   87: invokespecial 80	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   90: astore_2
    //   91: new 82	com/wandoujia/gson/c
    //   94: dup
    //   95: invokespecial 83	com/wandoujia/gson/c:<init>	()V
    //   98: aload_2
    //   99: new 85	com/wandoujia/jupiter/homepage/b/h
    //   102: dup
    //   103: invokespecial 86	com/wandoujia/jupiter/homepage/b/h:<init>	()V
    //   106: invokevirtual 90	com/wandoujia/jupiter/homepage/b/h:getType	()Ljava/lang/reflect/Type;
    //   109: invokevirtual 93	com/wandoujia/gson/c:a	(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    //   112: checkcast 95	java/util/List
    //   115: astore 10
    //   117: aload_2
    //   118: invokevirtual 98	java/io/FileReader:close	()V
    //   121: aload 10
    //   123: astore 5
    //   125: aload 5
    //   127: ifnull +15 -> 142
    //   130: aload_0
    //   131: getfield 27	com/wandoujia/jupiter/homepage/b/a:b	Ljava/util/List;
    //   134: aload 5
    //   136: invokeinterface 102 2 0
    //   141: pop
    //   142: return
    //   143: astore 11
    //   145: aload 10
    //   147: astore 5
    //   149: goto -24 -> 125
    //   152: astore 12
    //   154: aconst_null
    //   155: astore 4
    //   157: aconst_null
    //   158: astore 5
    //   160: aload 4
    //   162: ifnull -37 -> 125
    //   165: aload 4
    //   167: invokevirtual 98	java/io/FileReader:close	()V
    //   170: aconst_null
    //   171: astore 5
    //   173: goto -48 -> 125
    //   176: astore 6
    //   178: aconst_null
    //   179: astore 5
    //   181: goto -56 -> 125
    //   184: astore 8
    //   186: aconst_null
    //   187: astore_2
    //   188: aload_2
    //   189: ifnull +7 -> 196
    //   192: aload_2
    //   193: invokevirtual 98	java/io/FileReader:close	()V
    //   196: aload 8
    //   198: athrow
    //   199: astore 9
    //   201: goto -5 -> 196
    //   204: astore 8
    //   206: goto -18 -> 188
    //   209: astore_3
    //   210: aload_2
    //   211: astore 4
    //   213: goto -56 -> 157
    //
    // Exception table:
    //   from	to	target	type
    //   117	121	143	java/io/IOException
    //   67	91	152	java/io/IOException
    //   165	170	176	java/io/IOException
    //   67	91	184	finally
    //   192	196	199	java/io/IOException
    //   91	117	204	finally
    //   91	117	209	java/io/IOException
  }

  public static String a(String paramString)
  {
    return new File(new File(i.k().a(), "image"), String.valueOf(paramString.hashCode())).getPath();
  }

  public final void a()
  {
    this.c.post(new c(this));
  }

  public final Model b()
  {
    if (this.b.size() == 0)
      return null;
    int i = this.d.nextInt(this.b.size());
    int k;
    label293: label299: label305: label311: label313: for (int j = i; ; j = k)
    {
      Entity localEntity1 = (Entity)this.b.get(j);
      k = (j + 1) % this.b.size();
      int m;
      int n;
      if ((localEntity1.detail == null) || (localEntity1.detail.ad_detail == null) || (localEntity1.detail.ad_detail.start_time.longValue() == 0L) || (localEntity1.detail.ad_detail.end_time.longValue() == 0L))
      {
        m = 1;
        if (m != 0)
        {
          if ((localEntity1.image == null) || (localEntity1.image.size() <= 0))
            break label293;
          Iterator localIterator = localEntity1.image.iterator();
          Image localImage;
          do
          {
            if (!localIterator.hasNext())
              break;
            localImage = (Image)localIterator.next();
          }
          while ((!TextUtils.isEmpty(localImage.url)) && (FileUtil.exists(a(localImage.url))));
          n = 0;
          label203: if (n != 0)
            break label305;
        }
        if (k != i)
          break label299;
      }
      for (Entity localEntity2 = null; ; localEntity2 = localEntity1)
      {
        if (localEntity2 == null)
          break label311;
        return new Model(localEntity2);
        long l = System.currentTimeMillis();
        if ((l >= localEntity1.detail.ad_detail.start_time.longValue()) && (l <= localEntity1.detail.ad_detail.end_time.longValue()))
        {
          m = 1;
          break;
        }
        m = 0;
        break;
        n = 1;
        break label203;
        n = 0;
        break label203;
        if (k != i)
          break label313;
      }
      return null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.b.a
 * JD-Core Version:    0.6.0
 */