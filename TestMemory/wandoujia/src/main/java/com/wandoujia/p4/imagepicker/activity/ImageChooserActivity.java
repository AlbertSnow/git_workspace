package com.wandoujia.p4.imagepicker.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import com.wandoujia.jupiter.j;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class ImageChooserActivity extends BaseActivity
{
  private ImageChooserActivity.ImageManagerTabHostFragment a;
  private int b = 0;
  private Handler c = new a(this);

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramInt2 == -1))
    {
      setResult(-1, paramIntent);
      finish();
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    if (localIntent != null)
      this.b = localIntent.getIntExtra("default_tab_pos", 0);
    if (this.a == null)
    {
      this.a = new ImageChooserActivity.ImageManagerTabHostFragment();
      this.a.c(this.b);
      this.a.a(new b(this));
      getSupportFragmentManager().a().b(16908290, this.a).a();
    }
    setTitle(2131624949);
    j.a().j().a(this.c);
    j.a().j().c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.imagepicker.activity.ImageChooserActivity
 * JD-Core Version:    0.6.0
 */