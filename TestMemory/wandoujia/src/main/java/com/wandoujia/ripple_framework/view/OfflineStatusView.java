package com.wandoujia.ripple_framework.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.R.layout;

public class OfflineStatusView extends FrameLayout
{
  private ImageView a;

  public OfflineStatusView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }

  public OfflineStatusView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }

  private void a(Context paramContext)
  {
    LayoutInflater.from(paramContext).inflate(R.layout.rip_layout_offline_status_view, this, true);
  }

  public ImageView getReadyView()
  {
    return this.a;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((ImageView)findViewById(R.id.offline_ready));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.OfflineStatusView
 * JD-Core Version:    0.6.0
 */