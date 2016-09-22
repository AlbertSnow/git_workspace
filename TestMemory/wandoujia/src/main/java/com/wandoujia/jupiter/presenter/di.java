package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.api.proto.MorphData;
import com.wandoujia.jupiter.view.i;
import com.wandoujia.nirvana.framework.ui.a.a;
import com.wandoujia.ripple_framework.model.Model;
import java.util.HashMap;

final class di extends com.wandoujia.ripple_framework.c.c
{
  protected final void a(Model paramModel)
  {
    if (paramModel.t() != null)
    {
      View localView = h().b(2131493413).a();
      if ((localView != null) && ((localView instanceof TextView)))
      {
        TextView localTextView = (TextView)localView;
        HashMap localHashMap = com.wandoujia.jupiter.morph.c.a(paramModel);
        if (localHashMap.containsKey("description"))
        {
          String str1 = ((MorphData)localHashMap.get("description")).value;
          String str2 = f().getString(2131624723);
          SpannableString localSpannableString = new SpannableString(str1 + " " + str2);
          localSpannableString.setSpan(new i(f()), localSpannableString.length() - str2.length(), localSpannableString.length(), 17);
          localTextView.setText(localSpannableString);
        }
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.di
 * JD-Core Version:    0.6.0
 */