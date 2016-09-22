package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.b;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.entities.game.GameDetailInfoType.CrashWithoutGsf;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;

public final class s extends c
{
  protected final void a(Model paramModel)
  {
    AppDetail localAppDetail = paramModel.F();
    View localView = e();
    TextView localTextView = (TextView)localView.findViewById(2131493536);
    String str1 = "";
    if ((localAppDetail.crash_without_gsf != null) && (localAppDetail.crash_without_gsf.intValue() == GameDetailInfoType.CrashWithoutGsf.CRASH.getCode()))
      str1 = f().getString(2131624836);
    String str2 = "";
    if (!TextUtils.isEmpty(localAppDetail.user_notice))
      str2 = localAppDetail.user_notice;
    String str3;
    label227: int i;
    label236: RelativeLayout localRelativeLayout;
    if ((!TextUtils.isEmpty(str1)) || (!TextUtils.isEmpty(str2)))
      if ((!TextUtils.isEmpty(str1)) && (!TextUtils.isEmpty(str2)))
      {
        str3 = str1 + "<br>" + str2.replaceAll("\\n", "<br>");
        if (TextUtils.isEmpty(str1))
          break label361;
        Context localContext = f();
        localTextView.setLinkTextColor(localContext.getResources().getColor(2131361989));
        localTextView.setTextColor(localContext.getResources().getColor(2131362132));
        localTextView.setTextSize(1, 13.0F);
        Spannable localSpannable = (Spannable)Html.fromHtml(str3);
        TextUtil.removeUnderlines(localSpannable);
        localTextView.setText(localSpannable);
        localTextView.setMovementMethod(LinkMovementMethod.getInstance());
        localTextView.setVisibility(0);
        i = 1;
        localRelativeLayout = (RelativeLayout)localView.findViewById(2131493534);
        if (i == 0)
          break label384;
        localRelativeLayout.setVisibility(0);
      }
    while (true)
    {
      if (!((AppManager)i.k().a("app")).h(localAppDetail.package_name))
      {
        localView.setBackgroundResource(2131361920);
        ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
        if ((localLayoutParams instanceof RecyclerView.LayoutParams))
        {
          RecyclerView.LayoutParams localLayoutParams1 = (RecyclerView.LayoutParams)localLayoutParams;
          int j = (int)b.c(localView.getContext(), 16.0F);
          localLayoutParams1.setMargins(0, j, 0, j);
          localView.setLayoutParams(localLayoutParams1);
        }
      }
      return;
      str3 = str1 + str2;
      break;
      label361: localTextView.setText(str3);
      break label227;
      localTextView.setVisibility(8);
      i = 0;
      break label236;
      label384: localRelativeLayout.setVisibility(8);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.s
 * JD-Core Version:    0.6.0
 */