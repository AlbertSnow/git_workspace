package com.wandoujia.p4.account.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.R.id;
import com.wandoujia.account.constants.AccountParamConstants.FinishType;
import com.wandoujia.account.constants.AccountParamConstants.FragmentType;
import com.wandoujia.account.dto.Role;
import com.wandoujia.account.fragment.AccountFragment;
import com.wandoujia.account.fragment.c;
import com.wandoujia.account.fragment.f;
import com.wandoujia.account.fragment.g;
import com.wandoujia.account.fragment.h;
import com.wandoujia.account.fragment.i;
import com.wandoujia.account.fragment.j;
import com.wandoujia.account.fragment.k;
import com.wandoujia.account.fragment.l;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.activity.BaseToolBarActivity;
import com.wandoujia.p4.account.manager.AccountUtil;
import com.wandoujia.p4.account.manager.d;
import com.wandoujia.p4.tips.TipsType;
import com.wandoujia.ripple_framework.util.BadgeUtil;

public class PhoenixAccountActivity extends BaseToolBarActivity
  implements c, f, g, h, i, j, k, l
{
  private boolean a = true;

  public final void a()
  {
    BadgeUtil.a(this.a);
  }

  public final void a(Context paramContext, AccountParamConstants.FinishType paramFinishType, AccountParams paramAccountParams)
  {
    com.wandoujia.account.a.a(Role.ROLE_SUBSCRIBER);
    AccountUtil.a(paramAccountParams, paramFinishType, paramContext);
    d.a().d().a(paramFinishType);
    finish();
  }

  public final void a(WebView paramWebView)
  {
    com.wandoujia.p4.tips.a.a(paramWebView, TipsType.LOADING);
  }

  public final void a(AccountParamConstants.FragmentType paramFragmentType)
  {
    if (SystemUtil.aboveApiLevel(11))
    {
      if ((paramFragmentType == AccountParamConstants.FragmentType.FORGET_PASSWORD) || (paramFragmentType == AccountParamConstants.FragmentType.USER_LEGAL))
        invalidateOptionsMenu();
    }
    else
      return;
    invalidateOptionsMenu();
  }

  public final void a(String paramString)
  {
    setTitle(paramString);
  }

  public final void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }

  public final void b()
  {
    BadgeUtil.a(this.a);
  }

  public final void b(WebView paramWebView)
  {
    TipsType[] arrayOfTipsType = new TipsType[1];
    arrayOfTipsType[0] = TipsType.LOADING;
    com.wandoujia.p4.tips.a.a(paramWebView, arrayOfTipsType);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    android.support.v4.app.b.a(this, paramInt1, paramInt2, paramIntent);
  }

  public void onBackPressed()
  {
    a(this, AccountParamConstants.FinishType.CANCEL, null);
    super.onBackPressed();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (this != null)
    {
      setContentView(2130903137);
      ac localac = getSupportFragmentManager().a();
      AccountFragment localAccountFragment = (AccountFragment)AccountFragment.instantiate(this, AccountFragment.class.getName());
      AccountParams localAccountParams = (AccountParams)getIntent().getParcelableExtra("account.intent.extra.ACCOUNT_PARAMS");
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("account.intent.extra.ACCOUNT_PARAMS", localAccountParams);
      localBundle.putString("account.intent.extra.ACCOUNT_MANAGER_KEY", getIntent().getStringExtra("account.intent.extra.ACCOUNT_MANAGER_KEY"));
      localAccountFragment.setArguments(localBundle);
      if (R.id.account_fragment_layout == 0)
        throw new IllegalArgumentException("layout must have id name of account_fragment_layout");
      localac.b(R.id.account_fragment_layout, localAccountFragment, "accountContainer");
      localac.a();
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (android.support.v4.app.b.a(this, paramInt, paramKeyEvent))
      return true;
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onViewWidgetClicked(View paramView)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.activity.PhoenixAccountActivity
 * JD-Core Version:    0.6.0
 */