package com.wandoujia.jupiter.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.TextView;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.view.a.a;

public class JupiterDialogActivity extends BaseActivity
  implements View.OnClickListener
{
  private TextView a;
  private TextView b;
  private Button c;
  private Button d;
  private Button e;
  private View.OnClickListener f;
  private View.OnClickListener g;

  public final void a(String paramString)
  {
    this.a.setText(paramString);
  }

  public final void a(String paramString, View.OnClickListener paramOnClickListener)
  {
    this.c.setVisibility(0);
    this.c.setText(paramString);
    this.f = paramOnClickListener;
  }

  public final void b(String paramString)
  {
    this.b.setText(paramString);
  }

  public final void b(String paramString, View.OnClickListener paramOnClickListener)
  {
    this.e.setVisibility(0);
    this.e.setText(paramString);
    this.g = paramOnClickListener;
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    case 2131493271:
    default:
    case 2131493270:
    case 2131493272:
    }
    while (true)
    {
      finish();
      return;
      if (this.f == null)
        continue;
      this.f.onClick(paramView);
      continue;
      if (this.g == null)
        continue;
      this.g.onClick(paramView);
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    setTheme(2131689615);
    super.onCreate(paramBundle);
    setContentView(2130903513);
    Window localWindow = getWindow();
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    localLayoutParams.copyFrom(localWindow.getAttributes());
    localLayoutParams.width = a.a(this);
    localWindow.setAttributes(localLayoutParams);
    this.a = ((TextView)findViewById(2131493263));
    this.b = ((TextView)findViewById(2131493266));
    this.c = ((Button)findViewById(2131493270));
    this.c.setOnClickListener(this);
    this.d = ((Button)findViewById(2131493271));
    this.d.setOnClickListener(this);
    this.e = ((Button)findViewById(2131493272));
    this.e.setOnClickListener(this);
    this.c.setVisibility(8);
    this.d.setVisibility(8);
    this.e.setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.JupiterDialogActivity
 * JD-Core Version:    0.6.0
 */