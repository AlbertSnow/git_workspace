package com.wandoujia.p4.app.detail.activity;

import android.content.Intent;
import android.text.TextUtils;
import android.widget.EditText;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.app.controller.AppCommenter.Enjoy;

final class k
  implements Action
{
  k(SendCommentActivity paramSendCommentActivity)
  {
  }

  public final void execute()
  {
    if (TextUtils.isEmpty(SendCommentActivity.a(this.a).getText()))
    {
      p.a(this.a, 2131624363, p.b).a();
      return;
    }
    SendCommentActivity.MockComment localMockComment = new SendCommentActivity.MockComment();
    AppCommenter.Enjoy localEnjoy;
    if (SendCommentActivity.b(this.a) == null)
      localEnjoy = AppCommenter.Enjoy.UNKNOWN;
    while (true)
    {
      localMockComment.comment = SendCommentActivity.a(this.a).getText().toString();
      localMockComment.enjoy = localEnjoy.name();
      localMockComment.versionCode = SendCommentActivity.c(this.a);
      localMockComment.packageName = SendCommentActivity.d(this.a);
      Intent localIntent = new Intent();
      localIntent.putExtra("KEY_MOCK_COMMENT", localMockComment);
      if (SendCommentActivity.e(this.a) != null)
        localIntent.putExtra("KEY_OLD_COMMENT", SendCommentActivity.e(this.a));
      this.a.setResult(-1, localIntent);
      this.a.finish();
      return;
      if (SendCommentActivity.b(this.a).booleanValue())
      {
        localEnjoy = AppCommenter.Enjoy.YES;
        continue;
      }
      localEnjoy = AppCommenter.Enjoy.NO;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.activity.k
 * JD-Core Version:    0.6.0
 */