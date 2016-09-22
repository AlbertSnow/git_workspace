package com.wandoujia.jupiter.homepage.b;

import android.os.AsyncTask;
import com.wandoujia.api.proto.Entity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class j extends AsyncTask<Void, Void, Void>
{
  private List<Entity> a = new ArrayList();

  public j(List<Entity> paramList)
  {
    Collection localCollection;
    if (localCollection != null)
      this.a.addAll(localCollection);
  }

  // ERROR //
  private Void a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 35	java/io/FileWriter
    //   5: dup
    //   6: new 37	java/io/File
    //   9: dup
    //   10: aload_0
    //   11: getfield 14	com/wandoujia/jupiter/homepage/b/j:b	Lcom/wandoujia/jupiter/homepage/b/a;
    //   14: invokestatic 42	com/wandoujia/jupiter/homepage/b/a:a	(Lcom/wandoujia/jupiter/homepage/b/a;)Landroid/content/Context;
    //   17: invokevirtual 48	android/content/Context:getFilesDir	()Ljava/io/File;
    //   20: ldc 50
    //   22: invokespecial 53	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   25: invokespecial 56	java/io/FileWriter:<init>	(Ljava/io/File;)V
    //   28: astore_2
    //   29: aload_2
    //   30: new 58	com/wandoujia/gson/c
    //   33: dup
    //   34: invokespecial 59	com/wandoujia/gson/c:<init>	()V
    //   37: aload_0
    //   38: getfield 22	com/wandoujia/jupiter/homepage/b/j:a	Ljava/util/List;
    //   41: invokevirtual 62	com/wandoujia/gson/c:a	(Ljava/lang/Object;)Ljava/lang/String;
    //   44: invokevirtual 66	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   47: aload_2
    //   48: invokevirtual 69	java/io/FileWriter:close	()V
    //   51: aconst_null
    //   52: areturn
    //   53: astore 12
    //   55: aconst_null
    //   56: astore_2
    //   57: aload_2
    //   58: ifnull -7 -> 51
    //   61: aload_2
    //   62: invokevirtual 69	java/io/FileWriter:close	()V
    //   65: aconst_null
    //   66: areturn
    //   67: astore 4
    //   69: aconst_null
    //   70: areturn
    //   71: astore 11
    //   73: aconst_null
    //   74: astore_2
    //   75: aload_2
    //   76: ifnull -25 -> 51
    //   79: aload_2
    //   80: invokevirtual 69	java/io/FileWriter:close	()V
    //   83: aconst_null
    //   84: areturn
    //   85: astore 6
    //   87: aconst_null
    //   88: areturn
    //   89: astore 8
    //   91: aload_1
    //   92: ifnull +7 -> 99
    //   95: aload_1
    //   96: invokevirtual 69	java/io/FileWriter:close	()V
    //   99: aload 8
    //   101: athrow
    //   102: astore 10
    //   104: aconst_null
    //   105: areturn
    //   106: astore 9
    //   108: goto -9 -> 99
    //   111: astore 7
    //   113: aload_2
    //   114: astore_1
    //   115: aload 7
    //   117: astore 8
    //   119: goto -28 -> 91
    //   122: astore 5
    //   124: goto -49 -> 75
    //   127: astore_3
    //   128: goto -71 -> 57
    //
    // Exception table:
    //   from	to	target	type
    //   2	29	53	java/io/IOException
    //   61	65	67	java/io/IOException
    //   2	29	71	java/lang/Throwable
    //   79	83	85	java/io/IOException
    //   2	29	89	finally
    //   47	51	102	java/io/IOException
    //   95	99	106	java/io/IOException
    //   29	47	111	finally
    //   29	47	122	java/lang/Throwable
    //   29	47	127	java/io/IOException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.b.j
 * JD-Core Version:    0.6.0
 */