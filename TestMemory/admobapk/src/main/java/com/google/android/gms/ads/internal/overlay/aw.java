package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.google.android.gms.ads.internal.client.q;

@com.google.android.gms.ads.internal.report.client.a
public final class aw extends FrameLayout
  implements View.OnClickListener
{
  private final ImageButton a;
  private final bh b;

  public aw(Context paramContext, int paramInt, bh parambh)
  {
    super(paramContext);
    this.b = parambh;
    setOnClickListener(this);
    this.a = new ImageButton(paramContext);
    this.a.setImageResource(17301527);
    this.a.setBackgroundColor(0);
    this.a.setOnClickListener(this);
    this.a.setPadding(0, 0, 0, 0);
    this.a.setContentDescription("Interstitial close button");
    int i = q.a().a.a(paramContext, paramInt);
    addView(this.a, new FrameLayout.LayoutParams(i, i, 17));
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2)
    {
      if (paramBoolean1)
      {
        this.a.setVisibility(4);
        return;
      }
      this.a.setVisibility(8);
      return;
    }
    this.a.setVisibility(0);
  }

  public final void onClick(View paramView)
  {
    if (this.b != null)
      this.b.c();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.aw
 * JD-Core Version:    0.6.0
 */