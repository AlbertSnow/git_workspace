package com.wandoujia.p4.app.detail.activity;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.widget.EditText;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.app.controller.a;

final class b
  implements DialogInterface.OnClickListener
{
  b(AppCommentCaptchaActivity paramAppCommentCaptchaActivity, EditText paramEditText)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str = this.a.getText().toString();
    if (!TextUtils.isEmpty(str))
    {
      a.a().a(AppCommentCaptchaActivity.a(this.b), str);
      this.b.finish();
      return;
    }
    p.a(this.b, 2131625586, p.b).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.activity.b
 * JD-Core Version:    0.6.0
 */