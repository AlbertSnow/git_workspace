package com.wandoujia.ripple_framework.view;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.volley.toolbox.j;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.image.ImageUri;
import com.wandoujia.image.ImageUri.ImageUriType;
import com.wandoujia.image.c.a;
import com.wandoujia.image.r;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.ripple_framework.R.anim;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.i;

public final class e
{
  public static final int a = R.anim.image_fade_in;
  public static final boolean b;

  static
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (boolean bool = true; ; bool = false)
    {
      b = bool;
      return;
    }
  }

  public e()
  {
  }

  public e(byte paramByte)
  {
    this('\000');
  }

  private e(char paramChar)
  {
  }

  public static String a(String paramString)
  {
    if (!b);
    do
      return paramString;
    while ((TextUtils.isEmpty(paramString)) || (!paramString.startsWith("http://img.wdjimg.com/mms/icon/")));
    String str = paramString.substring(1 + paramString.lastIndexOf("/"));
    return "http://img.wdjimg.com/image/mms/" + str;
  }

  private static void a(View paramView, int paramInt)
  {
    if ((paramView instanceof SmartImageView))
    {
      SmartImageView localSmartImageView = (SmartImageView)paramView;
      if (paramInt != 0)
        localSmartImageView.setDefaultImageResId(paramInt);
    }
    do
      return;
    while ((!(paramView instanceof ImageView)) || (paramInt == 0));
    ((ImageView)paramView).setImageResource(paramInt);
  }

  public static void a(View paramView, Bitmap paramBitmap)
  {
    if ((paramView instanceof SmartImageView))
      ((SmartImageView)paramView).setImageBitmap(paramBitmap);
    do
    {
      return;
      if (!(paramView instanceof AsyncImageView))
        continue;
      ((AsyncImageView)paramView).setStaticImageBitmap(paramBitmap);
      return;
    }
    while (!(paramView instanceof ImageView));
    ((ImageView)paramView).setImageBitmap(paramBitmap);
  }

  public static void a(View paramView, String paramString)
  {
    if ((paramView instanceof AsyncImageView))
      ((AsyncImageView)paramView).c(paramString, 2131361862);
    com.wandoujia.image.b localb;
    while (true)
    {
      return;
      localb = (com.wandoujia.image.b)i.k().a("image");
      if (localb != null)
        break;
      if (!GlobalConfig.isDebug())
        continue;
      throw new RuntimeException("you must add ImageManager in your context");
    }
    b(paramView, paramString);
    a(paramView, 2131361862);
    r localr = localb.c(paramString, new g(paramView));
    paramView.setTag(R.id.apk_icon_image_container, localr);
  }

  public static void a(View paramView, String paramString, int paramInt)
  {
    if ((paramView instanceof AsyncImageView))
      ((AsyncImageView)paramView).b(paramString, paramInt);
    com.wandoujia.image.b localb;
    while (true)
    {
      return;
      b(paramView, paramString);
      a(paramView, paramInt);
      localb = (com.wandoujia.image.b)i.k().a("image");
      if (localb != null)
        break;
      if (!GlobalConfig.isDebug())
        continue;
      throw new RuntimeException("you must add ImageManager in your context");
    }
    r localr = localb.b(paramString, new f(paramView));
    paramView.setTag(R.id.apk_icon_image_container, localr);
  }

  public static void a(ImageView paramImageView, String paramString)
  {
    a(paramImageView, paramString, 0, false, null);
  }

  public static void a(ImageView paramImageView, String paramString, int paramInt)
  {
    a(paramImageView, paramString, paramInt, false, null);
  }

  @TargetApi(11)
  public static void a(ImageView paramImageView, String paramString, int paramInt, boolean paramBoolean, h paramh)
  {
    int i = android.support.v4.app.b.m(paramInt);
    r localr = (r)paramImageView.getTag(R.id.apk_icon_image_container);
    if (localr != null)
    {
      localr.e();
      paramImageView.setTag(R.id.apk_icon_image_container, null);
    }
    if (TextUtils.isEmpty(paramString))
    {
      paramImageView.setImageResource(i);
      return;
    }
    if (android.support.v4.app.b.C(paramString));
    while (true)
    {
      try
      {
        String str3 = Uri.parse(paramString).getQueryParameter("url");
        localObject1 = str3;
        if (paramBoolean)
        {
          String str2 = android.support.v4.app.b.a((String)localObject1, paramImageView.getContext(), paramImageView.getWidth(), paramImageView.getHeight());
          localObject2 = localObject1;
          localObject1 = str2;
          if (!(paramImageView instanceof SmartImageView))
            continue;
          j localj = (j)i.k().a("image_load");
          if (localj != null)
            continue;
          if (!GlobalConfig.isDebug())
            break;
          throw new RuntimeException("you must add imageLoader in your context");
          SmartImageView localSmartImageView = (SmartImageView)paramImageView;
          if (i == 0)
            continue;
          localSmartImageView.setDefaultImageResId(i);
          aq localaq = null;
          if (paramh != null)
            continue;
          localSmartImageView.a((String)localObject1, localj, localObject2, localaq);
          return;
          localaq = new aq(paramh);
          continue;
          if (!(paramImageView instanceof AsyncImageView))
            continue;
          AsyncImageView localAsyncImageView = (AsyncImageView)paramImageView;
          Uri localUri = Uri.parse((String)localObject1);
          if (localUri != null)
            continue;
          String str1 = "";
          if (!"app".equals(str1))
            continue;
          a.a(localAsyncImageView, new ImageUri(localUri.getPath().substring(1), ImageUri.ImageUriType.APP_ICON), i);
          return;
          str1 = localUri.getScheme();
          continue;
          localAsyncImageView.a((String)localObject1, i);
          return;
          if (i == 0)
            break;
          paramImageView.setImageResource(i);
          return;
        }
      }
      catch (Exception localException)
      {
        return;
      }
      Object localObject2 = null;
      continue;
      Object localObject1 = paramString;
    }
  }

  private static void b(View paramView, String paramString)
  {
    r localr = (r)paramView.getTag(R.id.apk_icon_image_container);
    if ((localr != null) && (!TextUtils.equals(localr.c(), paramString)))
    {
      localr.e();
      paramView.setTag(R.id.apk_icon_image_container, null);
    }
  }

  public static void b(ImageView paramImageView, String paramString, int paramInt)
  {
    a(paramImageView, paramString, paramInt, true, null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.e
 * JD-Core Version:    0.6.0
 */