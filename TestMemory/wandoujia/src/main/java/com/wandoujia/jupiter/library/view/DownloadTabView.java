package com.wandoujia.jupiter.library.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.p4.utils.c;

public class DownloadTabView extends SelectTabView
{
  private ImageView a;
  private ImageView b;
  private TextView c;
  private View d;

  public DownloadTabView(Context paramContext)
  {
    super(paramContext);
  }

  public DownloadTabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public DownloadTabView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public DownloadTabView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }

  public static DownloadTabView a(Context paramContext)
  {
    return (DownloadTabView)c.a(paramContext, 2130903401);
  }

  public final void a(float paramFloat)
  {
    float f1 = 1.0F;
    float f2;
    label31: ImageView localImageView2;
    if (paramFloat == 0.0F)
    {
      this.d = this.a;
      ImageView localImageView1 = this.a;
      if (!isSelected())
        break label80;
      f2 = f1;
      ViewHelper.setAlpha(localImageView1, f2 * (f1 - paramFloat));
      localImageView2 = this.b;
      if (!isSelected())
        break label87;
    }
    while (true)
    {
      ViewHelper.setAlpha(localImageView2, f1 * paramFloat);
      return;
      if (paramFloat != f1)
        break;
      this.d = this.b;
      break;
      label80: f2 = 0.6F;
      break label31;
      label87: f1 = 0.6F;
    }
  }

  public ImageView getDarkIconView()
  {
    return this.b;
  }

  public ImageView getLightIconView()
  {
    return this.a;
  }

  public TextView getNumberView()
  {
    return this.c;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((ImageView)findViewById(2131493748));
    this.b = ((ImageView)findViewById(2131493749));
    this.c = ((TextView)findViewById(2131493750));
    a(0.0F);
  }

  public void setNumber(int paramInt)
  {
    if (paramInt <= 0)
    {
      this.c.setText("");
      return;
    }
    this.c.setText(String.valueOf(paramInt));
  }

  public void setSelected(boolean paramBoolean)
  {
    super.setSelected(paramBoolean);
    if (this.a == null)
      return;
    View localView = this.d;
    float f;
    if (paramBoolean)
      f = 1.0F;
    while (true)
    {
      ViewHelper.setAlpha(localView, f);
      return;
      f = 0.6F;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.view.DownloadTabView
 * JD-Core Version:    0.6.0
 */