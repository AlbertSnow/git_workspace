package com.wandoujia.jupiter.library.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import com.wandoujia.jupiter.library.fragment.LibFragment;
import com.wandoujia.p4.app.upgrade.a;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.j;
import de.greenrobot.event.c;

public class LibActivity extends BaseActivity
{
  private String a;
  private boolean b = false;
  private String c;

  private void a(Intent paramIntent)
  {
    if ((paramIntent != null) && (paramIntent.getExtras() != null))
      this.a = paramIntent.getExtras().getString("page_intent_uri");
    if ((this.a == null) && (paramIntent != null) && (paramIntent.getData() != null))
      this.a = paramIntent.getDataString();
    LibFragment localLibFragment = new LibFragment();
    if (!TextUtils.isEmpty(this.a))
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("page_intent_uri", this.a);
      localLibFragment.setArguments(localBundle);
    }
    this.c = paramIntent.getStringExtra("upgrade_package_name");
    getSupportFragmentManager().a().b(16908290, localLibFragment).a();
  }

  public final boolean a()
  {
    return this.b;
  }

  public final String b()
  {
    return this.c;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a(getIntent());
    ((c)i.k().a("event_bus")).a(this);
    a.a(false, false);
  }

  protected void onDestroy()
  {
    super.onDestroy();
    ((c)i.k().a("event_bus")).c(this);
  }

  public void onEventMainThread(j paramj)
  {
    if ((paramj.a == EventBusManager.Type.MULTI_UNINSTALL) && ((paramj.b instanceof Boolean)))
      this.b = ((Boolean)paramj.b).booleanValue();
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    a(paramIntent);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.activity.LibActivity
 * JD-Core Version:    0.6.0
 */