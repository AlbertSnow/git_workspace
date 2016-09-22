package com.wandoujia.jupiter.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.Developer;
import com.wandoujia.api.proto.DownloadUrl;
import com.wandoujia.api.proto.Tag;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.DateUtil;
import com.wandoujia.entities.game.GameDetailInfoType.GameTagType;
import com.wandoujia.entities.game.GameDetailInfoType.InAppPurchaseType;
import com.wandoujia.entities.game.GameDetailInfoType.LanguageType;
import com.wandoujia.p4.campaign.CampaignActivity;
import com.wandoujia.ripple_framework.model.Model;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class b
{
  private static final SimpleDateFormat a = new SimpleDateFormat("yyyy.MM.dd");

  public static Point a(String paramString, Context paramContext)
  {
    int i = paramContext.getResources().getDimensionPixelSize(2131427471);
    int j = paramContext.getResources().getDimensionPixelSize(2131427472);
    String[] arrayOfString = paramString.split("\\.");
    if (arrayOfString.length > 1)
      arrayOfString = arrayOfString[(-2 + arrayOfString.length)].split("_");
    if (arrayOfString.length > 2);
    while (true)
    {
      try
      {
        i = Integer.valueOf(arrayOfString[(-1 + arrayOfString.length)]).intValue();
        j = Integer.valueOf(arrayOfString[(-2 + arrayOfString.length)]).intValue();
        if (j > i)
        {
          k = paramContext.getResources().getDimensionPixelSize(2131427470);
          m = k * i / j;
          return new Point(k, m);
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        k = j;
        m = i;
        continue;
      }
      int k = j;
      int m = i;
    }
  }

  private static String a(int paramInt, Context paramContext)
  {
    if (paramInt == GameDetailInfoType.InAppPurchaseType.YES.getPurchase())
      return paramContext.getString(2131624834);
    return null;
  }

  public static String a(AppDetail paramAppDetail)
  {
    if (CollectionUtils.isEmpty(paramAppDetail.apk))
      return "";
    if (((ApkDetail)paramAppDetail.apk.get(0)).download_url == null)
      return "";
    return ((ApkDetail)paramAppDetail.apk.get(0)).download_url.market;
  }

  public static String a(String paramString, int paramInt)
  {
    if (paramInt < 208)
      return String.format("http://www.wandoujia.com/award/blog/%s", new Object[] { paramString });
    return String.format("http://www.wandoujia.com/award/blog/%s?version=2", new Object[] { paramString });
  }

  private static String a(boolean paramBoolean, Context paramContext)
  {
    if (paramBoolean)
      return paramContext.getString(2131624833);
    return paramContext.getString(2131624832);
  }

  public static List<Pair<CharSequence, CharSequence>> a(AppDetail paramAppDetail, Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    if (!TextUtils.isEmpty(paramAppDetail.language))
    {
      String str8 = b(paramAppDetail.language, paramContext);
      if (!TextUtils.isEmpty(str8))
        localArrayList.add(new Pair(paramContext.getString(2131624820), str8));
    }
    if (paramAppDetail.is_online_game != null)
    {
      String str7 = a(paramAppDetail.is_online_game.booleanValue(), paramContext);
      if (!TextUtils.isEmpty(str7))
        localArrayList.add(new Pair(paramContext.getString(2131624824), str7));
    }
    if (paramAppDetail.need_network != null)
    {
      String str6 = b(paramAppDetail.need_network.booleanValue(), paramContext);
      if (!TextUtils.isEmpty(str6))
        localArrayList.add(new Pair(paramContext.getString(2131624821), str6));
    }
    if (paramAppDetail.in_app_purchase != null)
    {
      String str5 = a(paramAppDetail.in_app_purchase.intValue(), paramContext);
      if (!TextUtils.isEmpty(str5))
        localArrayList.add(new Pair(paramContext.getString(2131624822), str5));
    }
    long l = c(paramAppDetail);
    if (l > 0L)
      localArrayList.add(new Pair(paramContext.getString(2131624829), DateUtil.timeStamp2Date(l, a)));
    String str1 = d(paramAppDetail);
    if (!TextUtils.isEmpty(str1))
      localArrayList.add(new Pair(paramContext.getString(2131624830), str1));
    String str2 = a(paramAppDetail);
    if (!TextUtils.isEmpty(str2))
      localArrayList.add(new Pair(paramContext.getString(2131624825), str2));
    if (paramAppDetail.developer != null)
    {
      String str4 = paramAppDetail.developer.name;
      if (!TextUtils.isEmpty(str4))
        localArrayList.add(new Pair(paramContext.getString(2131624818), str4));
    }
    if (CollectionUtils.isEmpty(paramAppDetail.apk));
    for (String str3 = ""; ; str3 = ((ApkDetail)paramAppDetail.apk.get(0)).permission_group)
    {
      if (!TextUtils.isEmpty(str3))
      {
        if (str3.length() > 6)
          str3 = str3.substring(0, 6) + "...";
        localArrayList.add(new Pair(paramContext.getString(2131624823), str3));
      }
      return localArrayList;
    }
  }

  public static void a(View paramView, Context paramContext, Model paramModel)
  {
    String str1 = paramView.getResources().getString(2131625587);
    Object localObject = paramModel.F().title;
    if (TextUtils.isEmpty((CharSequence)localObject))
      localObject = paramModel.n();
    try
    {
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        String str2 = URLEncoder.encode((String)localObject, "UTF-8");
        localObject = str2;
      }
      label54: Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = paramModel.F().package_name;
      arrayOfObject[1] = localObject;
      arrayOfObject[2] = f(paramModel.F());
      arrayOfObject[3] = d(paramModel.F());
      android.support.v4.app.b.d(paramContext, CampaignActivity.a(String.format("http://www.wandoujia.com/manual_testing?from=P5&packageName=%1$s&title=%2$s&defaultApk=%3$s&versionName=%4$s", arrayOfObject), str1), str1);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      break label54;
    }
  }

  public static boolean a(String paramString)
  {
    return (TextUtils.isEmpty(paramString)) || (TextUtils.equals(paramString, Character.toString(' ')));
  }

  public static String b(AppDetail paramAppDetail)
  {
    if (CollectionUtils.isEmpty(paramAppDetail.apk))
      return "";
    return ((ApkDetail)paramAppDetail.apk.get(0)).size;
  }

  private static String b(String paramString, Context paramContext)
  {
    if (paramString.equals(GameDetailInfoType.LanguageType.EN.getCode()))
      return paramContext.getString(2131624811);
    if (paramString.equals(GameDetailInfoType.LanguageType.CHS.getCode()))
      return paramContext.getString(2131624816);
    if (paramString.equals(GameDetailInfoType.LanguageType.CHT.getCode()))
      return paramContext.getString(2131624815);
    if (paramString.equals(GameDetailInfoType.LanguageType.JA.getCode()))
      return paramContext.getString(2131624812);
    if (paramString.equals(GameDetailInfoType.LanguageType.KO.getCode()))
      return paramContext.getString(2131624813);
    if (paramString.equals(GameDetailInfoType.LanguageType.OTHER.getCode()))
      return paramContext.getString(2131624814);
    return null;
  }

  private static String b(boolean paramBoolean, Context paramContext)
  {
    if (paramBoolean)
      return paramContext.getString(2131624810);
    return paramContext.getString(2131624809);
  }

  public static List<Pair<String, String>> b(AppDetail paramAppDetail, Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    if (!TextUtils.isEmpty(paramAppDetail.title_en))
      localArrayList.add(new Pair(paramContext.getString(2131624819), paramAppDetail.title_en));
    Object localObject2;
    String str8;
    String str9;
    Tag localTag;
    if (!CollectionUtils.isEmpty(paramAppDetail.tag))
    {
      Iterator localIterator = paramAppDetail.tag.iterator();
      localObject2 = null;
      str8 = null;
      str9 = null;
      while (true)
      {
        if (!localIterator.hasNext())
          break label305;
        localTag = (Tag)localIterator.next();
        if (localTag.type == null)
          continue;
        if (localTag.type.intValue() == GameDetailInfoType.GameTagType.GAME_TYPE.getTagType())
        {
          if (str9 != null)
          {
            str9 = str9 + "/" + localTag.tag_name;
            continue;
          }
          str9 = localTag.tag_name;
          continue;
        }
        if (localTag.type.intValue() == GameDetailInfoType.GameTagType.GAME_THEME.getTagType())
        {
          if (str8 != null)
          {
            str8 = str8 + "/" + localTag.tag_name;
            continue;
          }
          str8 = localTag.tag_name;
          continue;
        }
        if (localTag.type.intValue() != GameDetailInfoType.GameTagType.GAME_STYLE.getTagType())
          break label830;
        if (localObject2 == null)
          break;
        localObject2 = (String)localObject2 + "/" + localTag.tag_name;
      }
    }
    label305: label830: for (Object localObject3 = localTag.tag_name; ; localObject3 = localObject2)
    {
      localObject2 = localObject3;
      break;
      if (!TextUtils.isEmpty(str9))
        localArrayList.add(new Pair(paramContext.getString(2131624828), str9));
      if (!TextUtils.isEmpty(str8))
        localArrayList.add(new Pair(paramContext.getString(2131624827), str8));
      if (!TextUtils.isEmpty((CharSequence)localObject2))
        localArrayList.add(new Pair(paramContext.getString(2131624826), localObject2));
      if (!TextUtils.isEmpty(paramAppDetail.language))
      {
        String str7 = b(paramAppDetail.language, paramContext);
        if (!TextUtils.isEmpty(str7))
          localArrayList.add(new Pair(paramContext.getString(2131624820), str7));
      }
      if (paramAppDetail.is_online_game != null)
      {
        String str6 = a(paramAppDetail.is_online_game.booleanValue(), paramContext);
        if (!TextUtils.isEmpty(str6))
          localArrayList.add(new Pair(paramContext.getString(2131624824), str6));
      }
      if (paramAppDetail.need_network != null)
      {
        String str5 = b(paramAppDetail.need_network.booleanValue(), paramContext);
        if (!TextUtils.isEmpty(str5))
          localArrayList.add(new Pair(paramContext.getString(2131624821), str5));
      }
      if (paramAppDetail.in_app_purchase != null)
      {
        String str4 = a(paramAppDetail.in_app_purchase.intValue(), paramContext);
        if (!TextUtils.isEmpty(str4))
          localArrayList.add(new Pair(paramContext.getString(2131624822), str4));
      }
      long l = c(paramAppDetail);
      if (l > 0L)
        localArrayList.add(new Pair(paramContext.getString(2131624829), DateUtil.timeStamp2Date(l, a)));
      String str1 = d(paramAppDetail);
      if (!TextUtils.isEmpty(str1))
        localArrayList.add(new Pair(paramContext.getString(2131624830), str1));
      String str2 = a(paramAppDetail);
      if (!TextUtils.isEmpty(str2))
        localArrayList.add(new Pair(paramContext.getString(2131624825), str2));
      if (paramAppDetail.developer != null)
      {
        String str3 = paramAppDetail.developer.name;
        if (!TextUtils.isEmpty(str3))
          localArrayList.add(new Pair(paramContext.getString(2131624818), str3));
      }
      boolean bool = CollectionUtils.isEmpty(paramAppDetail.apk);
      Object localObject1 = null;
      if (bool);
      while (true)
      {
        if (!CollectionUtils.isEmpty((Collection)localObject1))
          localArrayList.add(new Pair(paramContext.getString(2131624823), TextUtils.join("\n", (Iterable)localObject1)));
        return localArrayList;
        localObject1 = ((ApkDetail)paramAppDetail.apk.get(0)).permission;
      }
    }
  }

  public static long c(AppDetail paramAppDetail)
  {
    if ((!CollectionUtils.isEmpty(paramAppDetail.apk)) && (((ApkDetail)paramAppDetail.apk.get(0)).creation.longValue() > 0L))
      return ((ApkDetail)paramAppDetail.apk.get(0)).creation.longValue();
    if ((paramAppDetail.updated_date != null) && (paramAppDetail.updated_date.longValue() > 0L))
      return paramAppDetail.updated_date.longValue();
    return 0L;
  }

  public static String d(AppDetail paramAppDetail)
  {
    if (!CollectionUtils.isEmpty(paramAppDetail.apk))
      return ((ApkDetail)paramAppDetail.apk.get(0)).version_name;
    return "";
  }

  public static long e(AppDetail paramAppDetail)
  {
    if (!CollectionUtils.isEmpty(paramAppDetail.apk))
      return ((ApkDetail)paramAppDetail.apk.get(0)).version_code.intValue();
    return 0L;
  }

  public static String f(AppDetail paramAppDetail)
  {
    if (!CollectionUtils.isEmpty(paramAppDetail.apk))
      return ((ApkDetail)paramAppDetail.apk.get(0)).md5;
    return "";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.b
 * JD-Core Version:    0.6.0
 */