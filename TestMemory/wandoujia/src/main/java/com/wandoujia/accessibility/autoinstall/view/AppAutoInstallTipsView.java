package com.wandoujia.accessibility.autoinstall.view;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.ripple_framework.accessibility.R.drawable;
import com.wandoujia.ripple_framework.accessibility.R.id;
import com.wandoujia.ripple_framework.accessibility.R.string;

public class AppAutoInstallTipsView extends LinearLayout
{
  private TextView a;
  private ImageView b;
  private AnimationDrawable c;
  private View d;

  public AppAutoInstallTipsView(Context paramContext)
  {
    super(paramContext);
  }

  public AppAutoInstallTipsView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public AppAutoInstallTipsView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public View getContentContainer()
  {
    return this.d;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.d = findViewById(R.id.content_container);
    this.a = ((TextView)findViewById(R.id.tips));
    this.b = ((ImageView)findViewById(R.id.image));
    this.b.setBackgroundResource(R.drawable.auto_install_tip);
    this.c = ((AnimationDrawable)this.b.getBackground());
    this.c.start();
  }

  public void setNum(String paramString)
  {
    String str = GlobalConfig.getAppContext().getString(R.string.app_auto_install_steps, new Object[] { paramString });
    int i = str.indexOf(paramString);
    SpannableString localSpannableString = new SpannableString(str);
    localSpannableString.setSpan(new StyleSpan(1), i, i + paramString.length(), 0);
    this.a.setText(localSpannableString);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.autoinstall.view.AppAutoInstallTipsView
 * JD-Core Version:    0.6.0
 */