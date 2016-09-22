package com.wandoujia.morph.engine;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils.TruncateAt;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView.ScaleType;
import com.wandoujia.morph.a;
import com.wandoujia.morph.a.p;

public class e
{
  private static int a;

  static
  {
    e.class.getSimpleName();
    a = -1792606208;
  }

  private static int a(String paramString)
  {
    if (paramString.startsWith("#"))
    {
      int j = paramString.length();
      if (j == 7)
        return (int)Long.decode(paramString.replace("#", "#FF")).longValue();
      if (j == 9)
        return (int)Long.decode(paramString).longValue();
    }
    else
    {
      h localh = a.a().d();
      Integer localInteger1 = localh.d(paramString);
      if (localInteger1 != null)
        return localInteger1.intValue();
      if (paramString.startsWith("@color/"))
      {
        int i = b(paramString.substring(7), "color");
        Integer localInteger2 = Integer.valueOf(a.a().b().getResources().getColor(i));
        localh.a(paramString, localInteger2.intValue());
        return localInteger2.intValue();
      }
    }
    return -1;
  }

  public static g a(MoWidgetType paramMoWidgetType1, MoWidgetType paramMoWidgetType2, String paramString1, String paramString2)
  {
    int i = -1;
    int j = 1;
    g localg = new g();
    a.a();
    localg.b = h.b(paramString1);
    MoAttrType localMoAttrType1;
    label638: MoStyleable localMoStyleable;
    if (localg.b != null)
    {
      localMoAttrType1 = localg.b;
      switch (f.b[localMoAttrType1.ordinal()])
      {
      case 5:
      case 20:
      case 21:
      default:
        paramString2 = null;
      case 1:
      case 30:
      case 47:
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 60:
      case 62:
      case 67:
      case 68:
      case 69:
      case 70:
      case 73:
      case 83:
      case 84:
      case 85:
      case 86:
      case 87:
      case 88:
      case 89:
      case 90:
      case 91:
      case 92:
      case 93:
      case 3:
      case 94:
      case 37:
      case 38:
      case 7:
      case 12:
      case 95:
      case 8:
      case 15:
      case 17:
      case 18:
      case 22:
      case 39:
      case 40:
      case 41:
      case 42:
      case 43:
      case 44:
      case 45:
      case 81:
      case 96:
      case 97:
      case 98:
      case 99:
      case 100:
      case 101:
      case 102:
      case 103:
      case 104:
      case 105:
      case 106:
      case 107:
      case 6:
      case 10:
      case 14:
      case 16:
      case 23:
      case 24:
      case 25:
      case 26:
      case 28:
      case 29:
      case 32:
      case 33:
      case 35:
      case 36:
      case 54:
      case 55:
      case 56:
      case 57:
      case 58:
      case 59:
      case 61:
      case 63:
      case 64:
      case 65:
      case 72:
      case 75:
      case 78:
      case 82:
      case 108:
      case 109:
      case 110:
      case 111:
      case 112:
      case 113:
      case 114:
      case 115:
      case 116:
      case 117:
      case 118:
      case 119:
      case 120:
      case 121:
      case 27:
      case 77:
      case 122:
      case 11:
      case 71:
      case 76:
      case 123:
      case 124:
      case 125:
      case 126:
      case 127:
      case 128:
      case 13:
      case 79:
      case 129:
      case 130:
      case 46:
      case 66:
      case 131:
      case 132:
      case 133:
      case 134:
      case 2:
      case 135:
      case 136:
      case 137:
      case 138:
      case 139:
      case 140:
      case 141:
      case 4:
      case 19:
      case 34:
      case 31:
      case 74:
      case 80:
        while (true)
        {
          localg.c = paramString2;
          MoAttrType localMoAttrType2 = localg.b;
          switch (f.b[localMoAttrType2.ordinal()])
          {
          default:
            localMoStyleable = MoStyleable.View;
            localg.a = localMoStyleable;
            return localg;
            h localh5 = a.a().d();
            Integer localInteger7 = localh5.d(paramString2);
            int i16;
            if ((localInteger7 != null) && (localInteger7.intValue() > 0))
              i16 = localInteger7.intValue();
            while (true)
            {
              paramString2 = Integer.valueOf(i16);
              break;
              boolean bool4 = paramString2.startsWith("@");
              i16 = 0;
              if (!bool4)
                continue;
              Integer localInteger8 = Integer.valueOf(b(paramString2.substring(3 + paramString2.indexOf("id/")), "id"));
              if (localInteger8.intValue() == 0)
              {
                int i17 = 1 + a;
                a = i17;
                localInteger8 = Integer.valueOf(i17);
              }
              localh5.a(paramString2, localInteger8.intValue());
              i16 = localInteger8.intValue();
            }
            if (!paramString2.startsWith("@string/"))
              continue;
            h localh4 = a.a().d();
            String str3 = localh4.e(paramString2);
            if (str3 != null)
            {
              paramString2 = str3;
              continue;
            }
            int i15 = b(paramString2.substring(8), "string");
            String str4 = a.a().b().getResources().getString(i15);
            localh4.a(paramString2, str4);
            paramString2 = str4;
            continue;
            int i13;
            int i14;
            switch (paramString2.hashCode())
            {
            default:
              i13 = i;
              switch (i13)
              {
              default:
                i14 = b(paramString2);
              case 0:
              case 1:
              case 2:
              }
            case 1386124388:
            case 1261922022:
            case 343327108:
            }
            while (true)
            {
              paramString2 = Integer.valueOf(i14);
              break;
              if (!paramString2.equals("match_parent"))
                break label1268;
              i13 = 0;
              break label1272;
              if (!paramString2.equals("fill_parent"))
                break label1268;
              i13 = j;
              break label1272;
              if (!paramString2.equals("wrap_content"))
                break label1268;
              i13 = 2;
              break label1272;
              i14 = i;
              continue;
              i14 = -2;
            }
            paramString2 = Integer.valueOf(a(paramString2));
            continue;
            h localh3 = a.a().d();
            Integer localInteger5 = localh3.d(paramString2);
            int i12;
            if ((localInteger5 != null) && (localInteger5.intValue() > 0))
              i12 = localInteger5.intValue();
            while (true)
            {
              paramString2 = Integer.valueOf(i12);
              break;
              boolean bool3 = paramString2.startsWith("@style/");
              i12 = 0;
              if (!bool3)
                continue;
              Integer localInteger6 = Integer.valueOf(b(paramString2.substring(7), "style"));
              localh3.a(paramString2, localInteger6.intValue());
              i12 = localInteger6.intValue();
            }
            h localh2 = a.a().d();
            Integer localInteger3 = localh2.d(paramString2);
            int i11;
            if ((localInteger3 != null) && (localInteger3.intValue() > 0))
              i11 = localInteger3.intValue();
            while (true)
            {
              paramString2 = Integer.valueOf(i11);
              break;
              boolean bool2 = paramString2.startsWith("@anim/");
              i11 = 0;
              if (!bool2)
                continue;
              Integer localInteger4 = Integer.valueOf(b(paramString2.substring(7), "anim"));
              localh2.a(paramString2, localInteger4.intValue());
              i11 = localInteger4.intValue();
            }
            paramString2 = Integer.valueOf(b(paramString2));
            continue;
            paramString2 = Boolean.valueOf(paramString2);
            continue;
            paramString2 = Integer.valueOf(paramString2);
            continue;
            paramString2 = Float.valueOf(paramString2);
            continue;
            h localh1 = a.a().d();
            Integer localInteger1 = localh1.d(paramString2);
            int i10;
            if ((localInteger1 != null) && (localInteger1.intValue() > 0))
              i10 = localInteger1.intValue();
            while (true)
            {
              if (i10 <= 0)
                break label1725;
              paramString2 = new c(j, i10);
              break;
              if (paramString2.startsWith("@drawable/"))
              {
                Integer localInteger2 = Integer.valueOf(b(paramString2.substring(10), "drawable"));
                localh1.a(paramString2, localInteger2.intValue());
                i10 = localInteger2.intValue();
                continue;
              }
              i10 = 0;
            }
            label1725: paramString2 = new c(false, a(paramString2));
            continue;
            String[] arrayOfString2 = paramString2.split("\\|");
            int i6 = arrayOfString2.length;
            int i7 = 0;
            int i8 = 0;
            if (i7 < i6)
            {
              String str2 = arrayOfString2[i7];
              label1900: int i9;
              switch (str2.hashCode())
              {
              default:
                i9 = i;
                label1904: switch (i9)
                {
                default:
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                }
              case 115029:
              case -1383228885:
              case 3317767:
              case 108511772:
              case -348726240:
              case -1633016142:
              case 1063616078:
              case -483365792:
              case -1364013995:
              case 3143043:
              case -55726203:
              case -831189901:
              case 109757538:
              case 100571:
              }
              while (true)
              {
                i7++;
                break;
                if (!str2.equals("top"))
                  break label1900;
                i9 = 0;
                break label1904;
                if (!str2.equals("bottom"))
                  break label1900;
                i9 = j;
                break label1904;
                if (!str2.equals("left"))
                  break label1900;
                i9 = 2;
                break label1904;
                if (!str2.equals("right"))
                  break label1900;
                i9 = 3;
                break label1904;
                if (!str2.equals("center_vertical"))
                  break label1900;
                i9 = 4;
                break label1904;
                if (!str2.equals("fill_vertical"))
                  break label1900;
                i9 = 5;
                break label1904;
                if (!str2.equals("center_horizontal"))
                  break label1900;
                i9 = 6;
                break label1904;
                if (!str2.equals("fill_horizontal"))
                  break label1900;
                i9 = 7;
                break label1904;
                if (!str2.equals("center"))
                  break label1900;
                i9 = 8;
                break label1904;
                if (!str2.equals("fill"))
                  break label1900;
                i9 = 9;
                break label1904;
                if (!str2.equals("clip_vertical"))
                  break label1900;
                i9 = 10;
                break label1904;
                if (!str2.equals("clip_horizontal"))
                  break label1900;
                i9 = 11;
                break label1904;
                if (!str2.equals("start"))
                  break label1900;
                i9 = 12;
                break label1904;
                if (!str2.equals("end"))
                  break label1900;
                i9 = 13;
                break label1904;
                i8 |= 48;
                continue;
                i8 |= 80;
                continue;
                i8 |= 3;
                continue;
                i8 |= 5;
                continue;
                i8 |= 16;
                continue;
                i8 |= 112;
                continue;
                i8 |= 1;
                continue;
                i8 |= 7;
                continue;
                i8 |= 17;
                continue;
                i8 |= 119;
                continue;
                i8 |= 128;
                continue;
                i8 |= 8;
                continue;
                i8 |= 8388611;
                continue;
                i8 |= 8388613;
              }
            }
            paramString2 = Integer.valueOf(i8);
            continue;
            paramString2 = Integer.valueOf(p.d(paramString2));
            continue;
            paramString2 = Integer.valueOf(p.c(paramString2));
            continue;
            paramString2 = Integer.valueOf(p.e(paramString2));
            continue;
            paramString2 = Integer.valueOf(p.a(paramString2));
            continue;
            paramString2 = Integer.valueOf(p.b(paramString2));
            continue;
            paramString2 = Integer.valueOf(p.f(paramString2));
            continue;
            paramString2 = Integer.valueOf(p.g(paramString2));
            continue;
            paramString2 = Integer.valueOf(p.h(paramString2));
            continue;
            paramString2 = Integer.valueOf(p.i(paramString2));
            continue;
            paramString2 = Integer.valueOf(p.j(paramString2));
            continue;
            paramString2 = Integer.valueOf(p.k(paramString2));
            continue;
            switch (paramString2.hashCode())
            {
            default:
            case 109757538:
            case -1074341483:
            case 100571:
            case 839444514:
            }
            while (true)
              switch (i)
              {
              default:
                paramString2 = null;
                break label638;
                if (!paramString2.equals("start"))
                  continue;
                i = 0;
                continue;
                if (!paramString2.equals("middle"))
                  continue;
                i = j;
                continue;
                if (!paramString2.equals("end"))
                  continue;
                i = 2;
                continue;
                if (!paramString2.equals("marquee"))
                  continue;
                i = 3;
              case 0:
              case 1:
              case 2:
              case 3:
              }
            paramString2 = TextUtils.TruncateAt.START;
            continue;
            paramString2 = TextUtils.TruncateAt.MIDDLE;
            continue;
            paramString2 = TextUtils.TruncateAt.END;
            continue;
            paramString2 = TextUtils.TruncateAt.MARQUEE;
            continue;
            switch (paramString2.hashCode())
            {
            default:
            case 97445334:
            case -522179887:
            case 520762310:
            case -1274298614:
            case -1364013995:
            case 1161480325:
            case -340708175:
            }
            while (true)
              switch (i)
              {
              default:
                paramString2 = ImageView.ScaleType.MATRIX;
                break label638;
                if (!paramString2.equals("fixXY"))
                  continue;
                i = 0;
                continue;
                if (!paramString2.equals("fitStart"))
                  continue;
                i = j;
                continue;
                if (!paramString2.equals("fitCenter"))
                  continue;
                i = 2;
                continue;
                if (!paramString2.equals("fitEnd"))
                  continue;
                i = 3;
                continue;
                if (!paramString2.equals("center"))
                  continue;
                i = 4;
                continue;
                if (!paramString2.equals("centerCrop"))
                  continue;
                i = 5;
                continue;
                if (!paramString2.equals("centerInside"))
                  continue;
                i = 6;
              case 0:
              case 1:
              case 2:
              case 3:
              case 4:
              case 5:
              case 6:
              }
            paramString2 = ImageView.ScaleType.FIT_XY;
            continue;
            paramString2 = ImageView.ScaleType.FIT_START;
            continue;
            paramString2 = ImageView.ScaleType.FIT_CENTER;
            continue;
            paramString2 = ImageView.ScaleType.FIT_END;
            continue;
            paramString2 = ImageView.ScaleType.CENTER;
            continue;
            paramString2 = ImageView.ScaleType.CENTER_CROP;
            continue;
            paramString2 = ImageView.ScaleType.CENTER_INSIDE;
            continue;
            label2972: int i5;
            switch (paramString2.hashCode())
            {
            default:
              i5 = 0;
              switch (i)
              {
              case 0:
              default:
              case 1:
              }
            case 1011730981:
            case -316317491:
            }
            while (true)
            {
              paramString2 = Integer.valueOf(i5);
              break;
              if (!paramString2.equals("clipBounds"))
                break label2972;
              i = 0;
              break label2972;
              if (!paramString2.equals("opticalBounds"))
                break label2972;
              i = j;
              break label2972;
              i5 = j;
            }
            label3088: int i4;
            switch (paramString2.hashCode())
            {
            default:
              i4 = 0;
              switch (i)
              {
              default:
              case 0:
              case 1:
              case 2:
              }
            case 811476503:
            case 2042803098:
            case -741450320:
            }
            while (true)
            {
              paramString2 = Integer.valueOf(i4);
              break;
              if (!paramString2.equals("beforeDescendants"))
                break label3088;
              i = 0;
              break label3088;
              if (!paramString2.equals("afterDescendants"))
                break label3088;
              i = j;
              break label3088;
              if (!paramString2.equals("blocksDescendants"))
                break label3088;
              i = 2;
              break label3088;
              i4 = 131072;
              continue;
              i4 = 262144;
              continue;
              i4 = 393216;
            }
            boolean bool1 = paramString2.equals("horizontal");
            int i3 = 0;
            if (bool1);
            while (true)
            {
              paramString2 = Integer.valueOf(i3);
              break;
              i3 = j;
            }
            String[] arrayOfString1 = paramString2.split("\\|");
            int m = arrayOfString1.length;
            int n = 0;
            int i1 = 0;
            if (n < m)
            {
              String str1 = arrayOfString1[n];
              label3308: int i2;
              switch (str1.hashCode())
              {
              default:
                i2 = i;
                label3312: switch (i2)
                {
                default:
                case 0:
                case 1:
                case 2:
                }
              case -1072065315:
              case -1074341483:
              case 100571:
              }
              while (true)
              {
                n++;
                break;
                if (!str1.equals("beginning"))
                  break label3308;
                i2 = 0;
                break label3312;
                if (!str1.equals("middle"))
                  break label3308;
                i2 = j;
                break label3312;
                if (!str1.equals("end"))
                  break label3308;
                i2 = 2;
                break label3312;
                i1 |= 1;
                continue;
                i1 |= 2;
                continue;
                i1 |= 4;
              }
            }
            paramString2 = Integer.valueOf(i1);
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
          case 10:
          case 11:
          case 12:
          case 13:
          case 14:
          case 15:
          case 16:
          case 17:
          case 18:
          case 19:
          case 20:
          case 21:
          case 22:
          case 23:
          case 24:
          case 25:
          case 26:
          case 27:
          case 28:
          case 29:
          case 30:
          case 31:
          case 32:
          case 33:
          case 34:
          case 35:
          case 36:
          case 37:
          case 38:
          case 39:
          case 40:
          case 41:
          case 42:
          case 43:
          case 44:
          case 45:
          case 46:
          case 47:
          case 48:
          case 49:
          case 50:
          case 51:
          case 52:
          case 53:
          case 54:
          case 55:
          case 56:
          case 57:
          case 58:
          case 59:
          case 60:
          case 61:
          case 62:
          case 63:
          case 64:
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          }
        }
      case 9:
        label1009: label1268: label1272: if (!paramString2.contains("bold"))
          break;
      case 142:
      }
    }
    while (true)
    {
      int k;
      if (paramString2.contains("italic"))
        j |= 2;
      paramString2 = Typeface.defaultFromStyle(k);
      break label638;
      new StringBuilder("attr:").append(localMoAttrType1.name()).append(" not support!");
      break;
      localMoStyleable = MoStyleable.View;
      break label1009;
      localMoStyleable = MoStyleable.TextView;
      break label1009;
      localMoStyleable = MoStyleable.TextView_style;
      break label1009;
      localMoStyleable = MoStyleable.ImageView;
      break label1009;
      localMoStyleable = MoStyleable.ViewGroup;
      break label1009;
      localMoStyleable = MoStyleable.ViewGroup_Layout;
      break label1009;
      localMoStyleable = MoStyleable.ViewGroup_MarginLayout;
      break label1009;
      switch (f.a[paramMoWidgetType2.ordinal()])
      {
      default:
        break;
      case 1:
        localMoStyleable = MoStyleable.RelativeLayout;
        break;
      case 2:
        localMoStyleable = MoStyleable.LinearLayout;
        break;
      case 3:
        localMoStyleable = MoStyleable.TextView;
        break label1009;
        if (paramMoWidgetType1 == null)
          break;
        switch (f.a[paramMoWidgetType1.ordinal()])
        {
        case 3:
        default:
          break;
        case 1:
          localMoStyleable = MoStyleable.RelativeLayout_Layout;
          break;
        case 4:
          localMoStyleable = MoStyleable.FrameLayout_Layout;
          break;
        case 2:
          localMoStyleable = MoStyleable.LinearLayout_Layout;
          break label1009;
          localMoStyleable = MoStyleable.FrameLayout;
          break label1009;
          localMoStyleable = MoStyleable.RelativeLayout;
          break label1009;
          localMoStyleable = MoStyleable.LinearLayout;
          break label1009;
          localMoStyleable = MoStyleable.ScrollView;
          break label1009;
          new StringBuilder("unknown ").append(paramMoWidgetType2).append(" attr: ").append(paramString1);
          return localg;
          k = 0;
        }
      }
    }
  }

  // ERROR //
  public static i a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: invokestatic 54	com/wandoujia/morph/a:a	()Lcom/wandoujia/morph/a;
    //   3: pop
    //   4: aload_0
    //   5: invokestatic 429	com/wandoujia/morph/engine/h:c	(Ljava/lang/String;)Lcom/wandoujia/morph/engine/i;
    //   8: astore_3
    //   9: aload_3
    //   10: ifnonnull +70 -> 80
    //   13: aload_1
    //   14: invokestatic 434	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   17: ifne +63 -> 80
    //   20: invokestatic 440	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   23: astore 4
    //   25: aload 4
    //   27: new 442	java/io/ByteArrayInputStream
    //   30: dup
    //   31: aload_1
    //   32: invokevirtual 446	java/lang/String:getBytes	()[B
    //   35: invokespecial 449	java/io/ByteArrayInputStream:<init>	([B)V
    //   38: ldc_w 451
    //   41: invokeinterface 457 3 0
    //   46: new 459	com/wandoujia/morph/engine/i
    //   49: dup
    //   50: aconst_null
    //   51: aload 4
    //   53: invokespecial 462	com/wandoujia/morph/engine/i:<init>	(Lcom/wandoujia/morph/engine/MoWidgetType;Lorg/xmlpull/v1/XmlPullParser;)V
    //   56: astore 6
    //   58: invokestatic 54	com/wandoujia/morph/a:a	()Lcom/wandoujia/morph/a;
    //   61: pop
    //   62: aload_0
    //   63: aload 6
    //   65: invokestatic 465	com/wandoujia/morph/engine/h:a	(Ljava/lang/String;Lcom/wandoujia/morph/engine/i;)V
    //   68: aload 6
    //   70: areturn
    //   71: astore 5
    //   73: aload_3
    //   74: areturn
    //   75: astore 7
    //   77: aload 6
    //   79: areturn
    //   80: aload_3
    //   81: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   25	58	71	java/lang/Exception
    //   58	68	75	java/lang/Exception
  }

  private static int b(String paramString)
  {
    if (paramString.startsWith("@dimen/"))
    {
      h localh = a.a().d();
      Integer localInteger1 = localh.d(paramString);
      if (localInteger1 != null)
        return localInteger1.intValue();
      int i = b(paramString.substring(7), "dimen");
      Integer localInteger2 = Integer.valueOf(a.a().b().getResources().getDimensionPixelSize(i));
      localh.a(paramString, localInteger2.intValue());
      return localInteger2.intValue();
    }
    if (paramString.endsWith("px"))
      return Integer.parseInt(paramString.replaceAll("[a-zA-Z]", ""));
    Context localContext = a.a().b();
    float f = Integer.parseInt(paramString.replaceAll("[a-zA-Z]", ""));
    Display localDisplay = ((WindowManager)localContext.getSystemService("window")).getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplay.getMetrics(localDisplayMetrics);
    return (int)(0.5F + f * localDisplayMetrics.density);
  }

  private static int b(String paramString1, String paramString2)
  {
    Context localContext = a.a().b();
    return localContext.getResources().getIdentifier(paramString1, paramString2, localContext.getPackageName());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.morph.engine.e
 * JD-Core Version:    0.6.0
 */