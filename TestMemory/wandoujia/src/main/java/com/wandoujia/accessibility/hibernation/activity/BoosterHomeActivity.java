package com.wandoujia.accessibility.hibernation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.view.KeyEvent;
import com.wandoujia.accessibility.a.a;
import com.wandoujia.accessibility.hibernation.fragment.BoosterHomeFragment;
import com.wandoujia.accessibility.hibernation.fragment.OnBoardFragment;
import com.wandoujia.ripple_framework.accessibility.R.color;

public class BoosterHomeActivity extends FragmentActivity
  implements b
{
  private OnBoardFragment a;
  private BoosterHomeFragment b;
  private q c;

  public static void a(Context paramContext, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramContext, paramContext.getClass());
    localIntent.setFlags(67108864);
    if (paramBoolean)
      localIntent.putExtra("EXTRA_FINISH_SELF", true);
    paramContext.startActivity(localIntent);
  }

  public final void a()
  {
    if (this.a == null)
      this.a = new OnBoardFragment();
    this.c.a().a(OnBoardFragment.class.getName()).a(16908290, this.a).a();
  }

  public final void b()
  {
    if (this.b == null)
      this.b = new BoosterHomeFragment();
    if (!this.b.isAdded())
      this.c.a().a(BoosterHomeFragment.class.getName()).a(16908290, this.b).a();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 19)
    {
      com.wandoujia.accessibility.a.b localb = new com.wandoujia.accessibility.a.b(this);
      localb.a();
      localb.a(R.color.black_20_transparency);
    }
    this.c = getSupportFragmentManager();
    if (!a.g())
    {
      a();
      a.f();
      return;
    }
    b();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (getSupportFragmentManager().e() == 1))
    {
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    if (paramIntent.getBooleanExtra("EXTRA_FINISH_SELF", false))
      finish();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.activity.BoosterHomeActivity
 * JD-Core Version:    0.6.0
 */