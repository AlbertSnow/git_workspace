package com.wandoujia.jupiter.library.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.b;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;
import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.appmanager.LocalAppInfo.UpgradeInfo;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.p4.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public final class t extends c
{
  protected final void a(Model paramModel)
  {
    TextView localTextView = (TextView)e();
    Resources localResources = a.a().getResources();
    LocalAppInfo.UpgradeInfo localUpgradeInfo = b.a(paramModel);
    if (localUpgradeInfo == null)
    {
      String str2 = b.J(((ApkDetail)paramModel.F().apk.get(0)).version_name);
      long l = ((ApkDetail)paramModel.F().apk.get(0)).bytes_.intValue();
      localSpannableStringBuilder = new SpannableStringBuilder();
      localSpannableStringBuilder.append(TextUtil.formatSizeInfo(l));
      localSpannableStringBuilder.append("  ");
      localSpannableStringBuilder.append(localResources.getString(2131624609));
      localSpannableStringBuilder.append("  ");
      localSpannableStringBuilder.append(b.J(str2));
      localTextView.setText(localSpannableStringBuilder);
      return;
    }
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    if (localUpgradeInfo.hasPatch())
    {
      String str1 = TextUtil.formatSizeInfo(localUpgradeInfo.getFullSize());
      localSpannableStringBuilder.append(str1);
      localSpannableStringBuilder.setSpan(new StrikethroughSpan(), 0, str1.length(), 17);
      localSpannableStringBuilder.append("  ");
      localSpannableStringBuilder.append(TextUtil.formatSizeInfo(localUpgradeInfo.getPatchSize()));
      localSpannableStringBuilder.setSpan(new StrikethroughSpan(), 0, str1.length(), 17);
      localSpannableStringBuilder.append("  ");
    }
    while (true)
    {
      localSpannableStringBuilder.append(localResources.getString(2131624609));
      localSpannableStringBuilder.append("  ");
      localSpannableStringBuilder.append(b.J(localUpgradeInfo.getVersionName()));
      break;
      localSpannableStringBuilder.append(TextUtil.formatSizeInfo(localUpgradeInfo.getFullSize()));
      localSpannableStringBuilder.append("  ");
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.presenter.t
 * JD-Core Version:    0.6.0
 */