package com.wandoujia.ripple_framework.c;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.b;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.Image;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.ripple_framework.R.color;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.R.layout;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Iterator;
import java.util.List;

public final class al extends c
{
  protected final void a(Model paramModel)
  {
    LinearLayout localLinearLayout = (LinearLayout)e();
    localLinearLayout.removeAllViews();
    Iterator localIterator = paramModel.B().iterator();
    if (localIterator.hasNext())
    {
      Model localModel = (Model)localIterator.next();
      View localView = b.a(localLinearLayout, R.layout.explore_single_highlight);
      h.a((ViewGroup)localView, null).a(new a()).a(localModel);
      int i;
      label112: TextView localTextView;
      if ((localModel.k() != null) && (localModel.k().rgbs != null) && (localModel.k().rgbs.intValue() != -1))
      {
        i = 1;
        if (i == 0)
          break label254;
        localView.findViewById(R.id.root).setBackgroundColor(localModel.k().rgbs.intValue());
        label139: localTextView = (TextView)localView.findViewById(R.id.sub_title);
        if (!TextUtils.isEmpty(localModel.F().editor_comment))
          break label281;
        localTextView.setText(TextUtil.fromHtml(localModel.q()));
      }
      while (true)
      {
        ((TextView)localView.findViewById(R.id.title)).setText(localModel.n());
        ((TextView)localView.findViewById(R.id.app_size)).setText(localModel.o());
        ((AsyncImageView)localView.findViewById(R.id.icon)).a(localModel.i(), R.color.bg_image_loading);
        localLinearLayout.addView(localView);
        break;
        i = 0;
        break label112;
        label254: localView.findViewById(R.id.root).setBackgroundColor(f().getResources().getColor(R.color.explore_highlight_default_color));
        break label139;
        label281: localTextView.setText(localModel.F().editor_comment);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.c.al
 * JD-Core Version:    0.6.0
 */