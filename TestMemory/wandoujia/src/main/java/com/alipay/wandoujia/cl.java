package com.alipay.wandoujia;

import android.app.Activity;
import android.support.v4.app.d;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.json.JSONObject;

public final class cl extends bw
{
  private View b;

  protected final int a()
  {
    if (!TextUtils.isEmpty(u()))
      return d.f("mini_ui_image");
    return d.f("mini_ui_icon");
  }

  protected final void a(Activity paramActivity, View paramView)
  {
    this.b = paramView;
    if (!TextUtils.isEmpty(u()))
    {
      ImageView localImageView = (ImageView)paramView;
      cv.a(u(), new cm(localImageView));
    }
    while (true)
    {
      if (r() != null)
        paramView.setOnClickListener(new cn(this));
      return;
      TextView localTextView = (TextView)paramView;
      if (n() == null)
        continue;
      localTextView.setText(Html.fromHtml(n().toString()));
    }
  }

  public final int e()
  {
    View localView = this.b;
    bz.a(localView);
    if (localView != null)
      return localView.getId();
    return 0;
  }

  public final JSONObject h()
  {
    return v();
  }

  public final void i()
  {
    super.i();
    this.b = null;
  }

  protected final void j()
  {
    if ((this.b != null) && (this.b.getVisibility() == 0) && (r() != null))
      a(this.b, new an("info"));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.cl
 * JD-Core Version:    0.6.0
 */