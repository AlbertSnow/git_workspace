package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.b;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.Spinner;
import android.widget.TextView;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.appmanager.LocalAppInfo.UpgradeInfo;
import com.wandoujia.appmanager.model.MarketAppInfo.ImportantUpgradeInfo;
import com.wandoujia.appmanager.model.MarketAppInfo.NotRecommendReason;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.p4.views.ExpandablePanel;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;

public final class al extends c
{
  protected final void a(Model paramModel)
  {
    LocalAppInfo localLocalAppInfo = (LocalAppInfo)paramModel.a(2131492915);
    h().a(2131493659).a(b.J(localLocalAppInfo.getUpgradeInfo().getVersionName()));
    com.wandoujia.nirvana.framework.ui.a.a locala;
    Object localObject;
    if (localLocalAppInfo.getUpgradeInfo().isPatchUpgradable())
    {
      h().a(2131493660).a(TextUtil.formatSizeInfo(localLocalAppInfo.getUpgradeInfo().getFullSize()));
      h().a(2131493661).a(TextUtil.formatSizeInfo(localLocalAppInfo.getUpgradeInfo().getPatchSize()));
      TextView localTextView2 = h().a(2131493660).j();
      localTextView2.setPaintFlags(0x10 | localTextView2.getPaintFlags());
      locala = h().a(2131493531);
      if (localLocalAppInfo.isUpgradable())
        break label275;
      localObject = "";
    }
    while (true)
    {
      locala.a((CharSequence)localObject);
      ExpandablePanel localExpandablePanel = (ExpandablePanel)h().a(2131493662).a();
      TextView localTextView1 = h().a(2131493531).j();
      localExpandablePanel.setCollapseHeight(5 * localTextView1.getLineHeight() + localTextView1.getPaddingTop() + localTextView1.getPaddingBottom());
      Spinner localSpinner = h().a(2131493658).k();
      localSpinner.setAdapter(new an(f(), 0));
      localSpinner.setOnItemSelectedListener(new am(localLocalAppInfo));
      return;
      h().a(2131493660).a(TextUtil.formatSizeInfo(localLocalAppInfo.getUpgradeInfo().getFullSize()));
      break;
      label275: if (localLocalAppInfo.isNotRecommendedUpgradable())
      {
        localObject = localLocalAppInfo.getUpgradeInfo().getNotRecommendReason().getDescription();
        continue;
      }
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
      Resources localResources = com.wandoujia.p4.a.a().getResources();
      if (localLocalAppInfo.isImportantUpgradable())
      {
        String str4 = localLocalAppInfo.getUpgradeInfo().getImportantUpdate().getDetail();
        if (!str4.endsWith("\n"))
          str4 = str4 + "\n";
        localSpannableStringBuilder.append(str4);
        localSpannableStringBuilder.append("\n");
      }
      String str1 = localLocalAppInfo.getUpgradeInfo().getChangeLog();
      if (!TextUtils.isEmpty(str1))
      {
        localSpannableStringBuilder.append(str1);
        if (!str1.endsWith("\n"))
          localSpannableStringBuilder.append("\n");
      }
      localSpannableStringBuilder.append("\n");
      String str2 = localLocalAppInfo.getUpgradeInfo().getLastModifiedTime();
      boolean bool = localLocalAppInfo.getUpgradeInfo().isSuperior();
      String str3 = localLocalAppInfo.getUpgradeInfo().getMarket();
      localSpannableStringBuilder.append(str2).append(localResources.getString(2131625544));
      if ((!bool) && (!TextUtils.isEmpty(str3)))
        localSpannableStringBuilder.append("\t").append(localResources.getString(2131624806)).append(str3);
      localObject = localSpannableStringBuilder;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.al
 * JD-Core Version:    0.6.0
 */