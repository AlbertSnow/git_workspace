package com.sina.weibo.sdk.a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.StateSet;
import java.util.Locale;

public class g
{
  private static final String[] a;

  static
  {
    g.class.getName();
    a = new String[] { "drawable-xxhdpi", "drawable-xhdpi", "drawable-hdpi", "drawable-mdpi", "drawable-ldpi", "drawable" };
  }

  public static int a(Context paramContext, int paramInt)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    return (int)(0.5D + paramInt * localDisplayMetrics.density);
  }

  public static ColorStateList a()
  {
    int[] arrayOfInt = { 1728020992, 1728020992, 1728020992, -32256 };
    int[][] arrayOfInt1 = new int[4][];
    arrayOfInt1[0] = { 16842919 };
    arrayOfInt1[1] = { 16842913 };
    arrayOfInt1[2] = { 16842908 };
    arrayOfInt1[3] = StateSet.WILD_CARD;
    return new ColorStateList(arrayOfInt1, arrayOfInt);
  }

  public static Drawable a(Context paramContext, String paramString)
  {
    return a(paramContext, c(paramContext, paramString), false);
  }

  // ERROR //
  private static Drawable a(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 85	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   4: astore_3
    //   5: aload_3
    //   6: aload_1
    //   7: invokevirtual 91	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   10: astore 10
    //   12: aload 10
    //   14: astore 8
    //   16: aload 8
    //   18: ifnull +181 -> 199
    //   21: aload 8
    //   23: invokestatic 97	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   26: astore 14
    //   28: aload_0
    //   29: invokevirtual 40	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   32: invokevirtual 46	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   35: astore 15
    //   37: iload_2
    //   38: ifeq +68 -> 106
    //   41: aload_0
    //   42: invokevirtual 40	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   45: invokevirtual 101	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   48: astore 16
    //   50: new 103	android/graphics/drawable/NinePatchDrawable
    //   53: dup
    //   54: new 42	android/content/res/Resources
    //   57: dup
    //   58: aload_0
    //   59: invokevirtual 85	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   62: aload 15
    //   64: aload 16
    //   66: invokespecial 106	android/content/res/Resources:<init>	(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V
    //   69: aload 14
    //   71: aload 14
    //   73: invokevirtual 112	android/graphics/Bitmap:getNinePatchChunk	()[B
    //   76: new 114	android/graphics/Rect
    //   79: dup
    //   80: iconst_0
    //   81: iconst_0
    //   82: iconst_0
    //   83: iconst_0
    //   84: invokespecial 117	android/graphics/Rect:<init>	(IIII)V
    //   87: aconst_null
    //   88: invokespecial 120	android/graphics/drawable/NinePatchDrawable:<init>	(Landroid/content/res/Resources;Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;Ljava/lang/String;)V
    //   91: astore 11
    //   93: aload 8
    //   95: ifnull +8 -> 103
    //   98: aload 8
    //   100: invokevirtual 125	java/io/InputStream:close	()V
    //   103: aload 11
    //   105: areturn
    //   106: aload 14
    //   108: aload 15
    //   110: getfield 129	android/util/DisplayMetrics:densityDpi	I
    //   113: invokevirtual 133	android/graphics/Bitmap:setDensity	(I)V
    //   116: new 135	android/graphics/drawable/BitmapDrawable
    //   119: dup
    //   120: aload_0
    //   121: invokevirtual 40	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   124: aload 14
    //   126: invokespecial 138	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    //   129: astore 11
    //   131: goto -38 -> 93
    //   134: astore 13
    //   136: aload 8
    //   138: astore 5
    //   140: aload 5
    //   142: ifnull +55 -> 197
    //   145: aload 5
    //   147: invokevirtual 125	java/io/InputStream:close	()V
    //   150: aconst_null
    //   151: areturn
    //   152: astore 6
    //   154: aconst_null
    //   155: areturn
    //   156: astore 7
    //   158: aconst_null
    //   159: astore 8
    //   161: aload 8
    //   163: ifnull +8 -> 171
    //   166: aload 8
    //   168: invokevirtual 125	java/io/InputStream:close	()V
    //   171: aload 7
    //   173: athrow
    //   174: astore 9
    //   176: goto -5 -> 171
    //   179: astore 12
    //   181: aload 11
    //   183: areturn
    //   184: astore 7
    //   186: goto -25 -> 161
    //   189: astore 4
    //   191: aconst_null
    //   192: astore 5
    //   194: goto -54 -> 140
    //   197: aconst_null
    //   198: areturn
    //   199: aconst_null
    //   200: astore 11
    //   202: goto -109 -> 93
    //
    // Exception table:
    //   from	to	target	type
    //   21	37	134	java/io/IOException
    //   41	93	134	java/io/IOException
    //   106	131	134	java/io/IOException
    //   145	150	152	java/io/IOException
    //   5	12	156	finally
    //   166	171	174	java/io/IOException
    //   98	103	179	java/io/IOException
    //   21	37	184	finally
    //   41	93	184	finally
    //   106	131	184	finally
    //   5	12	189	java/io/IOException
  }

  public static StateListDrawable a(Context paramContext, String paramString1, String paramString2)
  {
    Drawable localDrawable1;
    if (paramString1.indexOf(".9") >= 0)
    {
      localDrawable1 = b(paramContext, paramString1);
      if (paramString2.indexOf(".9") < 0)
        break label106;
    }
    label106: for (Drawable localDrawable2 = b(paramContext, paramString2); ; localDrawable2 = a(paramContext, paramString2))
    {
      StateListDrawable localStateListDrawable = new StateListDrawable();
      localStateListDrawable.addState(new int[] { 16842919 }, localDrawable2);
      localStateListDrawable.addState(new int[] { 16842913 }, localDrawable2);
      localStateListDrawable.addState(new int[] { 16842908 }, localDrawable2);
      localStateListDrawable.addState(StateSet.WILD_CARD, localDrawable1);
      return localStateListDrawable;
      localDrawable1 = a(paramContext, paramString1);
      break;
    }
  }

  public static String a(String paramString1, String paramString2, String paramString3)
  {
    Locale localLocale = Locale.getDefault();
    if ((Locale.SIMPLIFIED_CHINESE.equals(localLocale)) || (Locale.TRADITIONAL_CHINESE.equals(localLocale)));
    while (Locale.SIMPLIFIED_CHINESE.equals(localLocale))
    {
      return paramString2;
      localLocale = Locale.ENGLISH;
    }
    if (Locale.TRADITIONAL_CHINESE.equals(localLocale))
      return paramString3;
    return paramString1;
  }

  public static Drawable b(Context paramContext, String paramString)
  {
    return a(paramContext, c(paramContext, paramString), true);
  }

  private static String c(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    int i = paramContext.getResources().getDisplayMetrics().densityDpi;
    String str1;
    int j;
    int k;
    int m;
    label38: int n;
    if (i <= 120)
    {
      str1 = "drawable-ldpi";
      j = 0;
      k = -1;
      m = -1;
      if (j < 6)
        break label153;
      n = -1;
      label48: if ((m <= 0) || (n <= 0))
        break label241;
      if (Math.abs(k - n) <= Math.abs(k - m))
        m = n;
    }
    while (true)
    {
      if (m >= 0)
        break label274;
      return null;
      if ((i > 120) && (i <= 160))
      {
        str1 = "drawable-mdpi";
        break;
      }
      if ((i > 160) && (i <= 240))
      {
        str1 = "drawable-hdpi";
        break;
      }
      if ((i > 240) && (i <= 320))
      {
        str1 = "drawable-xhdpi";
        break;
      }
      str1 = "drawable-xxhdpi";
      break;
      label153: if (a[j].equals(str1))
        k = j;
      String str2 = a[j] + "/" + paramString;
      if (d(paramContext, str2))
      {
        if (k == j)
          return str2;
        if (k < 0)
          m = j;
      }
      else
      {
        j++;
        break label38;
      }
      n = j;
      break label48;
      label241: if ((m > 0) && (n < 0))
        continue;
      if ((m < 0) && (n > 0))
      {
        m = n;
        continue;
      }
      m = -1;
    }
    label274: return a[m] + "/" + paramString;
  }

  // ERROR //
  private static boolean d(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +10 -> 11
    //   4: aload_1
    //   5: invokestatic 184	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   8: ifeq +5 -> 13
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_0
    //   14: invokevirtual 85	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   17: astore_2
    //   18: aconst_null
    //   19: astore_3
    //   20: aload_2
    //   21: aload_1
    //   22: invokevirtual 91	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   25: astore_3
    //   26: new 193	java/lang/StringBuilder
    //   29: dup
    //   30: ldc 215
    //   32: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   35: aload_1
    //   36: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: ldc 217
    //   41: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: pop
    //   45: aload_3
    //   46: ifnull +7 -> 53
    //   49: aload_3
    //   50: invokevirtual 125	java/io/InputStream:close	()V
    //   53: iconst_1
    //   54: ireturn
    //   55: astore 6
    //   57: new 193	java/lang/StringBuilder
    //   60: dup
    //   61: ldc 215
    //   63: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   66: aload_1
    //   67: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: ldc 219
    //   72: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: aload_3
    //   77: ifnull -66 -> 11
    //   80: aload_3
    //   81: invokevirtual 125	java/io/InputStream:close	()V
    //   84: iconst_0
    //   85: ireturn
    //   86: astore 8
    //   88: iconst_0
    //   89: ireturn
    //   90: astore 4
    //   92: aload_3
    //   93: ifnull +7 -> 100
    //   96: aload_3
    //   97: invokevirtual 125	java/io/InputStream:close	()V
    //   100: aload 4
    //   102: athrow
    //   103: astore 10
    //   105: goto -52 -> 53
    //   108: astore 5
    //   110: goto -10 -> 100
    //
    // Exception table:
    //   from	to	target	type
    //   20	45	55	java/io/IOException
    //   80	84	86	java/io/IOException
    //   20	45	90	finally
    //   57	76	90	finally
    //   49	53	103	java/io/IOException
    //   96	100	108	java/io/IOException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.a.g
 * JD-Core Version:    0.6.0
 */