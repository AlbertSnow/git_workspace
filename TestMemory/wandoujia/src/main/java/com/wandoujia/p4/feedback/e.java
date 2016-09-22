package com.wandoujia.p4.feedback;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.p4.feedback.zendesk.a;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;

final class e extends h
{
  e(FeedbackActivity paramFeedbackActivity)
  {
  }

  public final boolean a(View paramView)
  {
    if (!NetworkUtil.isNetworkConnected(this.a.getApplicationContext()))
    {
      p.a(this.a, this.a.getString(2131625187), p.b).a();
      return false;
    }
    String str1 = FeedbackActivity.b(this.a).getText().toString();
    String str2 = FeedbackActivity.a(this.a).getText().toString().replace(" ", "");
    FeedbackActivity.a(this.a).setText(str2);
    if (TextUtils.isEmpty(FeedbackActivity.c(this.a)))
    {
      FeedbackActivity.b(this.a, 0);
      return false;
    }
    if (TextUtils.isEmpty(str2))
    {
      FeedbackActivity.b(this.a, 1);
      return false;
    }
    if (!TextUtil.checkEmail(str2))
    {
      FeedbackActivity.b(this.a, 3);
      return false;
    }
    if (TextUtils.isEmpty(str1))
    {
      FeedbackActivity.b(this.a, 2);
      return false;
    }
    a.a().a(this.a, FeedbackActivity.c(this.a), str2, str1, FeedbackActivity.d(this.a));
    this.a.finish();
    a(paramView, Logger.Module.FEEDBACK, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.SUBMIT, null, null);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.e
 * JD-Core Version:    0.6.0
 */