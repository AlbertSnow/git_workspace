package com.wandoujia.jupiter.library.presenter;

import android.text.Html;
import android.widget.TextView;
import com.wandoujia.p4.views.j;
import com.wandoujia.ripple_framework.model.Model;

final class r
  implements j
{
  r(q paramq, TextView paramTextView, Model paramModel)
  {
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
      this.a.setText(Html.fromHtml(q.a(false, this.b)));
  }

  public final void b(boolean paramBoolean)
  {
    if (!paramBoolean)
      this.a.setText(Html.fromHtml(q.a(true, this.b)));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.presenter.r
 * JD-Core Version:    0.6.0
 */