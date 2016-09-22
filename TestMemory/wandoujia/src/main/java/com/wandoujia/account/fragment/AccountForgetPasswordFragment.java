package com.wandoujia.account.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.wandoujia.account.AccountErrorType;
import com.wandoujia.account.R.id;
import com.wandoujia.account.R.layout;
import com.wandoujia.account.R.string;
import com.wandoujia.account.dto.AccountError;
import com.wandoujia.account.dto.WandouResponse;

public class AccountForgetPasswordFragment extends AccountBaseFragment
{
  private EditText q;
  private TextView r;
  private TextView s;
  private String t;
  private ImageButton u;
  private final b v = new b(this);

  public static AccountForgetPasswordFragment a(String paramString1, String paramString2, Bundle paramBundle)
  {
    AccountForgetPasswordFragment localAccountForgetPasswordFragment = new AccountForgetPasswordFragment();
    Bundle localBundle = new Bundle(paramBundle);
    localBundle.putString("username", paramString1);
    localBundle.putString("account.intent.extra.ACCOUNT_MANAGER_KEY", paramString2);
    localAccountForgetPasswordFragment.setArguments(localBundle);
    return localAccountForgetPasswordFragment;
  }

  final void a(WandouResponse paramWandouResponse)
  {
  }

  protected final String b()
  {
    return "wdj://account/forgot";
  }

  protected final void b(WandouResponse paramWandouResponse)
  {
    Object localObject = getActivity();
    if ((localObject != null) && (getActivity().isFinishing()))
      localObject = getActivity().getParent();
    if ((localObject == null) || (paramWandouResponse == null) || (!isAdded()))
      return;
    this.r.setEnabled(true);
    try
    {
      if ((paramWandouResponse.getError() == AccountError.USER_NOT_EXIST.getError()) || (paramWandouResponse.getError() == AccountError.USER_NOT_FOUND.getError()))
      {
        this.s.setText(this.s.getResources().getString(R.string.account_sdk_user_not_exist));
        this.s.setVisibility(0);
        return;
      }
      com.wandoujia.account.h.a.a((Context)localObject, paramWandouResponse.getMsg(), getString(R.string.account_sdk_forget_password_failed), new x()).show();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  protected final void d(String paramString)
  {
    if ((getActivity() != null) && (isAdded()))
    {
      this.r.setEnabled(true);
      if (android.support.v4.app.b.t(this.t) != AccountErrorType.OK)
        break label141;
      String str2 = this.t;
      String str3 = String.format(getActivity().getString(R.string.account_sdk_activation_code_send_tips), new Object[] { str2 });
      AccountResetPasswordFragment localAccountResetPasswordFragment = AccountResetPasswordFragment.a(str2, getActivity().getString(R.string.account_sdk_forget_password), str3, this.d, getArguments(), "forget_password_fragment");
      ac localac2 = d().a();
      if (d().e() > 0)
        d().d();
      localac2.b(R.id.account_fragment_layout, localAccountResetPasswordFragment, "resetPassword");
      localac2.a();
    }
    label141: 
    do
      return;
    while (android.support.v4.app.b.s(this.t) != AccountErrorType.OK);
    String str1 = this.t;
    AccountResetEmailFragment localAccountResetEmailFragment = AccountResetEmailFragment.a(String.format(getActivity().getString(R.string.account_sdk_activation_code_send_email_tips), new Object[] { str1 }), str1, this.d, getArguments());
    ac localac1 = d().a();
    if (d().e() > 0)
      d().d();
    localac1.b(R.id.account_fragment_layout, localAccountResetEmailFragment, "resetEmailPassword");
    localac1.a();
  }

  protected final void f()
  {
    if (!isAdded())
      return;
    this.r.setEnabled(true);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.t = a(getArguments(), "username", "");
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = paramLayoutInflater.inflate(R.layout.account_sdk_forget_password, paramViewGroup, false);
    this.q = ((EditText)this.a.findViewById(R.id.user_name));
    this.r = ((TextView)this.a.findViewById(R.id.send_activation));
    this.s = ((TextView)this.a.findViewById(R.id.user_name_tips));
    this.u = ((ImageButton)this.a.findViewById(R.id.account_clear));
    c();
    a(getActivity().getString(R.string.account_sdk_forget_password));
    this.r.setOnClickListener(new u(this));
    this.q.addTextChangedListener(new v(this));
    this.q.setText(this.t);
    this.u.setOnClickListener(new w(this));
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.AccountForgetPasswordFragment
 * JD-Core Version:    0.6.0
 */