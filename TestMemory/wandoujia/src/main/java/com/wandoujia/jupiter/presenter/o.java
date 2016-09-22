package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.jupiter.app.model.AppType;
import com.wandoujia.jupiter.util.b;
import com.wandoujia.p4.views.ExpandablePanel;
import com.wandoujia.phoenix2.av.view.PairTextContainer;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import java.util.Iterator;
import java.util.List;

public final class o extends c
{
  private AppDetail a;

  protected final void a(Model paramModel)
  {
    AppDetail localAppDetail1;
    View localView1;
    TextView localTextView1;
    TextView localTextView2;
    View localView3;
    if ((this.a == null) || (!this.a.equals(paramModel.F())))
    {
      localAppDetail1 = paramModel.F();
      localView1 = e();
      ExpandablePanel localExpandablePanel = (ExpandablePanel)localView1.findViewById(2131493530);
      localTextView1 = (TextView)localExpandablePanel.findViewById(2131493531);
      localExpandablePanel.setCollapseHeight(5 * localTextView1.getLineHeight() + localTextView1.getPaddingTop() + localTextView1.getPaddingBottom());
      localTextView2 = (TextView)localView1.findViewById(2131493529);
      if (!AppType.GAME.getName().equalsIgnoreCase(localAppDetail1.app_type))
        break label438;
      localTextView2.setText(2131624808);
      if (!TextUtils.isEmpty(localAppDetail1.description))
        break label472;
      localTextView1.setText(localView1.getContext().getString(2131624807));
      AppDetail localAppDetail2 = paramModel.F();
      View localView2 = e();
      PairTextContainer localPairTextContainer = (PairTextContainer)localView2.findViewById(2131493538);
      localPairTextContainer.setLeftMiniWidth(localView2.getContext().getResources().getDimensionPixelSize(2131427613));
      List localList = b.a(localAppDetail2, f());
      localPairTextContainer.setData(localList);
      if (AppType.APP.getName().equalsIgnoreCase(localAppDetail2.app_type))
      {
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
        {
          Pair localPair = (Pair)localIterator.next();
          if ((localPair == null) || (localPair.first == null) || (!((CharSequence)localPair.first).toString().equals(f().getString(2131624830))))
            continue;
          localPairTextContainer.a(localList.indexOf(localPair), f().getString(2131625096), new p(this));
        }
      }
      localView2.findViewById(2131493022).setOnClickListener(new q());
      localView3 = localView2.findViewById(2131493006);
      if (!BadgeUtil.c(i()))
        break label487;
      localView3.setVisibility(0);
      TextView localTextView3 = (TextView)localView2.findViewById(2131493539);
      Spannable localSpannable = Spannable.Factory.getInstance().newSpannable(localView2.getResources().getString(2131625590));
      localSpannable.setSpan(new r(this), 17, localSpannable.length(), 33);
      localTextView3.setMovementMethod(LinkMovementMethod.getInstance());
      localTextView3.setText(localSpannable);
    }
    while (true)
    {
      this.a = paramModel.F();
      return;
      label438: localTextView2.setText(2131624241);
      if (TextUtils.isEmpty(localAppDetail1.description))
      {
        localTextView1.setText(localView1.getContext().getString(2131624242));
        break;
      }
      label472: localTextView1.setText(Html.fromHtml(localAppDetail1.description));
      break;
      label487: localView3.setVisibility(8);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.o
 * JD-Core Version:    0.6.0
 */