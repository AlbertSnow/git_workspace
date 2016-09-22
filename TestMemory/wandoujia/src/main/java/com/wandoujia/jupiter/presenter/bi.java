package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.k;
import com.wandoujia.ripple_framework.model.Model;

public final class bi extends c
{
  private k a;

  public bi(k paramk)
  {
    this.a = paramk;
  }

  private void a(Model paramModel, boolean paramBoolean)
  {
    TextView localTextView = (TextView)h().b(2131492998).a();
    Resources localResources = i.k().g().getResources();
    int i;
    if (paramBoolean)
    {
      i = 2130837712;
      Drawable localDrawable = localResources.getDrawable(i);
      if (localDrawable != null)
      {
        localDrawable.setBounds(0, 0, localDrawable.getMinimumWidth(), localDrawable.getMinimumHeight());
        localTextView.setCompoundDrawables(localDrawable, null, null, null);
      }
      if (!paramBoolean)
        break label112;
    }
    label112: for (String str = i.k().g().getString(2131624799); ; str = (String)paramModel.a(2))
    {
      paramModel.a(str);
      localTextView.setText(str);
      return;
      i = 2130837711;
      break;
    }
  }

  protected final void a(Model paramModel)
  {
    a(paramModel, ((Boolean)paramModel.a(1)).booleanValue());
    e().setOnClickListener(new bj(this, paramModel, paramModel));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.bi
 * JD-Core Version:    0.6.0
 */