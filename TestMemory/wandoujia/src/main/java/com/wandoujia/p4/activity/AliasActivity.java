package com.wandoujia.p4.activity;

import android.app.Activity;
import android.os.Bundle;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.ripple_framework.i;

public class AliasActivity extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    i.k().a("navigation");
    NavigationManager.a(this);
    finish();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.activity.AliasActivity
 * JD-Core Version:    0.6.0
 */