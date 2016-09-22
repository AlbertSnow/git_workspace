package com.wandoujia.p4.utils;

import android.content.Context;
import com.wandoujia.image.ae;
import com.wandoujia.p4.model.a;
import com.wandoujia.p4.search.utils.SearchConst.ShareType;
import java.io.File;

final class m
  implements ae
{
  m(File paramFile, Context paramContext, SearchConst.ShareType paramShareType, a parama)
  {
  }

  // ERROR //
  public final void a(android.graphics.Bitmap paramBitmap, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aconst_null
    //   6: astore_3
    //   7: new 32	java/io/FileOutputStream
    //   10: dup
    //   11: aload_0
    //   12: getfield 18	com/wandoujia/p4/utils/m:a	Ljava/io/File;
    //   15: invokespecial 35	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   18: astore 4
    //   20: aload_1
    //   21: getstatic 41	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   24: bipush 100
    //   26: aload 4
    //   28: invokevirtual 47	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   31: pop
    //   32: aload 4
    //   34: invokevirtual 50	java/io/FileOutputStream:flush	()V
    //   37: aload_0
    //   38: getfield 20	com/wandoujia/p4/utils/m:b	Landroid/content/Context;
    //   41: aload_0
    //   42: getfield 22	com/wandoujia/p4/utils/m:c	Lcom/wandoujia/p4/search/utils/SearchConst$ShareType;
    //   45: aload_0
    //   46: getfield 24	com/wandoujia/p4/utils/m:d	Lcom/wandoujia/p4/model/a;
    //   49: aload_0
    //   50: getfield 18	com/wandoujia/p4/utils/m:a	Ljava/io/File;
    //   53: invokestatic 56	android/net/Uri:fromFile	(Ljava/io/File;)Landroid/net/Uri;
    //   56: invokestatic 61	com/wandoujia/p4/utils/l:a	(Landroid/content/Context;Lcom/wandoujia/p4/search/utils/SearchConst$ShareType;Lcom/wandoujia/p4/model/a;Landroid/net/Uri;)V
    //   59: aload 4
    //   61: invokevirtual 64	java/io/FileOutputStream:close	()V
    //   64: return
    //   65: astore 11
    //   67: return
    //   68: astore 12
    //   70: aconst_null
    //   71: astore 4
    //   73: aload 4
    //   75: ifnull -71 -> 4
    //   78: aload 4
    //   80: invokevirtual 64	java/io/FileOutputStream:close	()V
    //   83: return
    //   84: astore 6
    //   86: return
    //   87: astore 8
    //   89: aload_3
    //   90: ifnull +7 -> 97
    //   93: aload_3
    //   94: invokevirtual 64	java/io/FileOutputStream:close	()V
    //   97: aload 8
    //   99: athrow
    //   100: astore 9
    //   102: goto -5 -> 97
    //   105: astore 7
    //   107: aload 4
    //   109: astore_3
    //   110: aload 7
    //   112: astore 8
    //   114: goto -25 -> 89
    //   117: astore 5
    //   119: goto -46 -> 73
    //
    // Exception table:
    //   from	to	target	type
    //   59	64	65	java/io/IOException
    //   7	20	68	java/io/IOException
    //   78	83	84	java/io/IOException
    //   7	20	87	finally
    //   93	97	100	java/io/IOException
    //   20	59	105	finally
    //   20	59	117	java/io/IOException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.m
 * JD-Core Version:    0.6.0
 */