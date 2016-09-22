package com.wandoujia.p4.gift.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.support.v7.app.AppCompatActivity;
import com.wandoujia.entities.app.IAppLiteInfo.AppType;
import com.wandoujia.p4.gift.fragment.MyGiftListFragment;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.view.a.h;

public class MyGiftBeansActivity extends AppCompatActivity
{
  public static void a(Context paramContext, IAppLiteInfo.AppType paramAppType)
  {
    if (paramContext == null)
      return;
    if (!com.wandoujia.account.a.z())
    {
      h localh = new h(paramContext);
      localh.a(paramContext.getString(2131624879)).b(paramContext.getString(2131624873)).b(paramContext.getString(2131624330), null).c(paramContext.getString(2131624156), new b()).a(paramContext.getString(2131624158), new a());
      localh.b();
      return;
    }
    Intent localIntent = new Intent(paramContext, MyGiftBeansActivity.class);
    if (paramContext == paramContext.getApplicationContext())
      localIntent.addFlags(268435456);
    localIntent.putExtra("argumentHeaderView", true);
    localIntent.putExtra("argumentType", paramAppType);
    paramContext.startActivity(localIntent);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903213);
    MyGiftListFragment localMyGiftListFragment = new MyGiftListFragment();
    Bundle localBundle = new Bundle();
    localBundle.putSerializable("argumentType", getIntent().getSerializableExtra("argumentType"));
    localBundle.putBoolean("argumentHeaderView", getIntent().getBooleanExtra("argumentHeaderView", true));
    localMyGiftListFragment.setArguments(localBundle);
    getSupportFragmentManager().a().b(2131493502, localMyGiftListFragment).a();
    i.k().h().a(this, "wdj://me/gifts").a(this);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.activity.MyGiftBeansActivity
 * JD-Core Version:    0.6.0
 */