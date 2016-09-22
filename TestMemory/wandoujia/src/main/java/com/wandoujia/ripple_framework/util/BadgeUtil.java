package com.wandoujia.ripple_framework.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.preference.PreferenceManager;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.DynamicDrawableSpan;
import com.wandoujia.api.proto.BadgeEnum.Badge;
import com.wandoujia.api.proto.Entity;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.base.utils.SharePrefSubmitor;
import com.wandoujia.base.utils.SystemUtil.InstallOption;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"CommitPrefEdits"})
public final class BadgeUtil
{
  private final byte[] a;
  private final String b;
  private final List<byte[]> c;
  private final String d;
  private Object e;
  private final int f;
  private final int g;

  public BadgeUtil(byte[] paramArrayOfByte, String paramString1, List<byte[]> paramList, String paramString2)
  {
    this(paramArrayOfByte, paramString1, paramList, paramString2, -1, -1);
  }

  public BadgeUtil(byte[] paramArrayOfByte, String paramString1, List<byte[]> paramList, String paramString2, int paramInt1, int paramInt2)
  {
    this.a = paramArrayOfByte;
    this.b = paramString1;
    this.c = paramList;
    this.d = paramString2;
    this.f = paramInt2;
    this.g = paramInt1;
  }

  public static DynamicDrawableSpan a(int paramInt1, int paramInt2)
  {
    Drawable localDrawable = i.k().g().getResources().getDrawable(paramInt2);
    if ((localDrawable != null) && (localDrawable.getIntrinsicHeight() != 0))
    {
      float f1 = paramInt1;
      localDrawable.setBounds(0, 0, (int)(f1 * localDrawable.getIntrinsicWidth() / localDrawable.getIntrinsicHeight()), (int)f1);
    }
    return new h(localDrawable);
  }

  public static BadgeUtil.BadgeType a(Model paramModel)
  {
    if ((paramModel.b() == null) || (paramModel.b().badge == null));
    int i;
    do
    {
      return null;
      i = paramModel.b().badge.intValue();
      if ((i & BadgeEnum.Badge.NEW_PRODUCT.getValue()) == BadgeEnum.Badge.NEW_PRODUCT.getValue())
        return BadgeUtil.BadgeType.NEW_PRODUCT;
      if ((i & BadgeEnum.Badge.GIFT.getValue()) == BadgeEnum.Badge.GIFT.getValue())
        return BadgeUtil.BadgeType.GIFT;
      if ((i & BadgeEnum.Badge.AWARD.getValue()) == BadgeEnum.Badge.AWARD.getValue())
        return BadgeUtil.BadgeType.DESIGN_AWARD;
    }
    while ((i & BadgeEnum.Badge.PUBLISH.getValue()) != BadgeEnum.Badge.PUBLISH.getValue());
    return BadgeUtil.BadgeType.PUBLISH;
  }

  public static CharSequence a(int paramInt, BadgeUtil.SubBadgeType paramSubBadgeType)
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder("  ");
    localSpannableStringBuilder.setSpan(a(paramInt, paramSubBadgeType.getImageResId()), 0, 1, 17);
    return localSpannableStringBuilder;
  }

  public static void a(Context paramContext, SystemUtil.InstallOption paramInstallOption)
  {
    int i = -1;
    switch (l.a[paramInstallOption.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
      if (localSharedPreferences != null)
      {
        SharedPreferences.Editor localEditor = localSharedPreferences.edit();
        localEditor.putInt("setting_root_install_location", i);
        SharePrefSubmitor.submit(localEditor);
      }
      return;
      i = 0;
      continue;
      i = 1;
      continue;
      i = 2;
    }
  }

  public static void a(Context paramContext, boolean paramBoolean)
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    if (localSharedPreferences != null)
    {
      SharedPreferences.Editor localEditor = localSharedPreferences.edit();
      localEditor.putBoolean("setting_root_install", paramBoolean);
      SharePrefSubmitor.submit(localEditor);
    }
  }

  public static void a(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(i.k().g()).edit();
    localEditor.putBoolean("setting_upload_contacts", paramBoolean);
    SharePrefSubmitor.submit(localEditor);
  }

  public static boolean a(Context paramContext)
  {
    return PreferenceManager.getDefaultSharedPreferences(paramContext).getBoolean("key_first_setting", true);
  }

  public static List<BadgeUtil.SubBadgeType> b(Model paramModel)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramModel.b() == null) || (paramModel.b().badge == null));
    int i;
    do
    {
      return localArrayList;
      i = paramModel.b().badge.intValue();
      if ((i & BadgeEnum.Badge.SPREAD.getValue()) != BadgeEnum.Badge.SPREAD.getValue())
        continue;
      localArrayList.add(BadgeUtil.SubBadgeType.SPREAD);
    }
    while ((i & BadgeEnum.Badge.VERIFIED.getValue()) != BadgeEnum.Badge.VERIFIED.getValue());
    localArrayList.add(BadgeUtil.SubBadgeType.VERIFIED);
    return localArrayList;
  }

  public static boolean b(Context paramContext)
  {
    try
    {
      boolean bool = PreferenceManager.getDefaultSharedPreferences(paramContext).getBoolean("setting_root_install", OemUtil.showRootInstall());
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean c(Context paramContext)
  {
    return PreferenceManager.getDefaultSharedPreferences(paramContext).contains("setting_root_install");
  }

  public static boolean c(Model paramModel)
  {
    return b(paramModel).contains(BadgeUtil.SubBadgeType.VERIFIED);
  }

  public static boolean d(Context paramContext)
  {
    return PreferenceManager.getDefaultSharedPreferences(paramContext).getBoolean("setting_alert_update", OemUtil.enableAlertUpdate());
  }

  public static boolean e(Context paramContext)
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    if (localSharedPreferences != null)
      return localSharedPreferences.getBoolean("setting_auto_check_app_upgrade", OemUtil.enableAutoCheckAppUpgrade());
    return true;
  }

  public static SystemUtil.InstallOption f(Context paramContext)
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    if (localSharedPreferences != null);
    switch (localSharedPreferences.getInt("setting_root_install_location", 0))
    {
    default:
      return SystemUtil.InstallOption.ERROR;
    case 0:
      return SystemUtil.InstallOption.AUTO;
    case 1:
      return SystemUtil.InstallOption.EXTERNAL;
    case 2:
    }
    return SystemUtil.InstallOption.INTERNAL;
  }

  public static boolean g(Context paramContext)
  {
    return PreferenceManager.getDefaultSharedPreferences(paramContext).getBoolean("setting_custom_font", true);
  }

  public final void a(Object paramObject)
  {
    this.e = paramObject;
  }

  public final byte[] a()
  {
    return this.a;
  }

  public final String b()
  {
    return this.b;
  }

  public final List<byte[]> c()
  {
    return this.c;
  }

  public final String d()
  {
    return this.d;
  }

  public final Object e()
  {
    return this.e;
  }

  public final boolean f()
  {
    return (this.f >= 0) && (this.g >= 0);
  }

  public final int g()
  {
    return this.f;
  }

  public final int h()
  {
    return this.g;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.util.BadgeUtil
 * JD-Core Version:    0.6.0
 */