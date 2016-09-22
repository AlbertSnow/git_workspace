package com.wandoujia.account.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.wandoujia.account.R.color;
import com.wandoujia.account.R.id;
import com.wandoujia.account.R.layout;
import com.wandoujia.account.R.string;
import com.wandoujia.account.dto.WandouResponse;

public class AccountResetEmailFragment extends AccountBaseFragment
{
  private String q;
  private String r;
  private TextView s;
  private TextView t;
  private TextView u;
  private TextView v;
  private boolean w;
  private CountDownTimer x;
  private final b y = new b(this);

  public static AccountResetEmailFragment a(String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    AccountResetEmailFragment localAccountResetEmailFragment = new AccountResetEmailFragment();
    Bundle localBundle = new Bundle(paramBundle);
    localBundle.putString("tips", paramString1);
    localBundle.putString("username", paramString2);
    localBundle.putBoolean("send_activation", false);
    localBundle.putString("account.intent.extra.ACCOUNT_MANAGER_KEY", paramString3);
    localAccountResetEmailFragment.setArguments(localBundle);
    return localAccountResetEmailFragment;
  }

  private void g()
  {
    if (this.x != null)
    {
      i();
      this.x.cancel();
      this.x = null;
    }
  }

  private void h()
  {
    this.u.setEnabled(false);
    this.u.setTextColor(getResources().getColor(R.color.account_sdk_activation_text));
    this.x = new cf(this);
    this.x.start();
  }

  private void i()
  {
    this.u.setEnabled(true);
    this.u.setText(R.string.account_sdk_resend_email);
    this.u.setTextColor(getResources().getColor(R.color.base_alert_dialog_highlight));
  }

  private void j()
  {
    this.f.a(this.r, "RESET_EMAIL", this.y);
  }

  final void a(WandouResponse paramWandouResponse)
  {
    Object localObject = getActivity();
    if ((localObject != null) && (getActivity().isFinishing()))
      localObject = getActivity().getParent();
    if (localObject == null)
      return;
    try
    {
      g();
      if (paramWandouResponse != null)
      {
        com.wandoujia.account.h.a.a((Context)localObject, paramWandouResponse.getMsg(), getString(R.string.account_sdk_reset_password_failed), new cg()).show();
        return;
      }
      com.wandoujia.account.h.a.a((Context)localObject, getString(R.string.account_sdk_netop_server_error), getString(R.string.account_sdk_login_failure), new ch()).show();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  protected final String b()
  {
    return "wdj://account/forgot/email";
  }

  protected final void b(WandouResponse paramWandouResponse)
  {
    a(paramWandouResponse);
  }

  protected final void d(String paramString)
  {
    if (getActivity() != null)
      Toast.makeText(getActivity(), R.string.account_sdk_email_was_send, 0).show();
  }

  protected final void f()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getArguments();
    this.q = a(localBundle, "tips", "");
    this.r = a(localBundle, "username", "");
    this.w = localBundle.getBoolean("send_activation", false);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = paramLayoutInflater.inflate(R.layout.account_sdk_reset_email_password, paramViewGroup, false);
    this.s = ((TextView)this.a.findViewById(R.id.tips));
    this.t = ((TextView)this.a.findViewById(R.id.open_browser));
    this.u = ((TextView)this.a.findViewById(R.id.activation_trigger));
    this.v = ((TextView)this.a.findViewById(R.id.relogin));
    this.s.setText(this.q);
    c();
    a(getActivity().getString(R.string.account_sdk_forget_password));
    this.t.setOnClickListener(new cc(this));
    this.u.setOnClickListener(new cd(this));
    this.v.setOnClickListener(new ce(this));
    if (this.w)
      j();
    h();
    return this.a;
  }

  public void onDestroy()
  {
    super.onDestroy();
    g();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.AccountResetEmailFragment
 * JD-Core Version:    0.6.0
 */