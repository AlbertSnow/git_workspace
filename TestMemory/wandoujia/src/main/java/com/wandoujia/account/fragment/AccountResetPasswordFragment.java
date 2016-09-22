package com.wandoujia.account.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.R.color;
import com.wandoujia.account.R.id;
import com.wandoujia.account.R.layout;
import com.wandoujia.account.R.string;
import com.wandoujia.account.constants.AccountParamConstants.FinishType;
import com.wandoujia.account.dto.AccountError;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;

public class AccountResetPasswordFragment extends AccountBaseFragment
{
  private String A;
  private CountDownTimer B;
  private boolean C;
  private String D;
  private ImageButton E;
  private ImageButton F;
  private final b G = new b(this);
  private TextView q;
  private EditText r;
  private TextView s;
  private TextView t;
  private EditText u;
  private TextView v;
  private TextView w;
  private TextView x;
  private String y = "reset_password";
  private String z;

  public static AccountResetPasswordFragment a(String paramString1, String paramString2, String paramString3, String paramString4, Bundle paramBundle, String paramString5)
  {
    return a(paramString1, paramString2, paramString3, paramString4, false, paramBundle, paramString5);
  }

  public static AccountResetPasswordFragment a(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, Bundle paramBundle, String paramString5)
  {
    AccountResetPasswordFragment localAccountResetPasswordFragment = new AccountResetPasswordFragment();
    Bundle localBundle = new Bundle(paramBundle);
    localBundle.putString("phone_number", paramString1);
    localBundle.putString("title", paramString2);
    localBundle.putString("tips", paramString3);
    localBundle.putString("source", paramString5);
    localBundle.putBoolean("send_activation", paramBoolean);
    localBundle.putString("account.intent.extra.ACCOUNT_MANAGER_KEY", paramString4);
    localAccountResetPasswordFragment.setArguments(localBundle);
    return localAccountResetPasswordFragment;
  }

  private void h()
  {
    this.s.setEnabled(false);
    this.s.setTextColor(getResources().getColor(R.color.account_sdk_activation_text));
    this.B = new cq(this);
    this.B.start();
  }

  private void i()
  {
    this.s.setEnabled(true);
    this.s.setText(R.string.account_sdk_resend_activation_code);
    this.s.setTextColor(getResources().getColor(R.color.account_sdk_activation_text_highlight));
  }

  private void j()
  {
    this.f.a(this.z, "request_code", this.G);
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
      i();
      if (this.B != null)
      {
        this.B.cancel();
        this.B = null;
      }
      if (paramWandouResponse != null)
        if (paramWandouResponse.getError() == AccountError.CODE_NOT_FOUND.getError())
          this.t.setVisibility(0);
      label80: 
      while (TextUtils.equals(this.y, "reset_password"))
      {
        com.wandoujia.account.d.b.b(TaskEvent.Action.RESET, TaskEvent.Result.FAIL, this.D);
        return;
        if (paramWandouResponse.getError() == AccountError.PASSWORD_INVALID.getError())
        {
          this.u.setText("");
          this.v.setVisibility(0);
          continue;
        }
        com.wandoujia.account.h.a.a((Context)localObject, paramWandouResponse.getMsg(), getString(R.string.account_sdk_reset_password_failed), new cr()).show();
        continue;
        com.wandoujia.account.h.a.a((Context)localObject, getString(R.string.account_sdk_netop_server_error), getString(R.string.account_sdk_login_failure), new cj()).show();
      }
      com.wandoujia.account.d.b.b(TaskEvent.Action.LOGIN_IN, TaskEvent.Result.FAIL, this.D);
      return;
    }
    catch (Exception localException)
    {
      break label80;
    }
  }

  protected final String b()
  {
    return "wdj://account/forgot/mobile";
  }

  protected final void b(WandouResponse paramWandouResponse)
  {
    a(paramWandouResponse);
  }

  protected final void d(String paramString)
  {
    FragmentActivity localFragmentActivity = getActivity();
    if ((paramString == null) || (!isAdded()) || (localFragmentActivity == null));
    do
    {
      return;
      if (!"reset_password".equals(paramString))
        continue;
      String str = this.u.getText().toString();
      this.f.a(this.z, str, null, this.c.m(), "LOGIN_TAG", this.G);
      this.y = "LOGIN_TAG";
      com.wandoujia.account.d.b.b(TaskEvent.Action.RESET, TaskEvent.Result.SUCCESS, this.D);
      com.wandoujia.account.d.b.a(TaskEvent.Action.LOGIN_IN, TaskEvent.Result.SUCCESS, this.D);
      return;
    }
    while (!"LOGIN_TAG".equals(paramString));
    Toast.makeText(localFragmentActivity, localFragmentActivity.getString(R.string.account_sdk_reset_password_success), 0).show();
    a(AccountParamConstants.FinishType.RESET_PASSWORD);
    com.wandoujia.account.d.b.b(TaskEvent.Action.LOGIN_IN, TaskEvent.Result.SUCCESS, this.D);
  }

  protected final void f()
  {
    if (TextUtils.equals(this.y, "LOGIN_TAG"))
    {
      com.wandoujia.account.d.b.b(TaskEvent.Action.RESET, TaskEvent.Result.CANCEL, e());
      return;
    }
    com.wandoujia.account.d.b.b(TaskEvent.Action.LOGIN_IN, TaskEvent.Result.CANCEL, this.D);
  }

  protected final String g()
  {
    return this.D;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getArguments();
    this.z = localBundle.getString("phone_number");
    this.A = localBundle.getString("tips");
    this.C = localBundle.getBoolean("send_activation");
    this.D = a(localBundle, "source", "");
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = paramLayoutInflater.inflate(R.layout.account_sdk_reset_password, paramViewGroup, false);
    this.q = ((TextView)this.a.findViewById(R.id.tips));
    this.r = ((EditText)this.a.findViewById(R.id.activation_code));
    this.s = ((TextView)this.a.findViewById(R.id.activation_trigger));
    this.t = ((TextView)this.a.findViewById(R.id.activation_code_error_tips));
    this.u = ((EditText)this.a.findViewById(R.id.account_password));
    this.v = ((TextView)this.a.findViewById(R.id.newpassword_error_tips));
    this.w = ((TextView)this.a.findViewById(R.id.account_login));
    this.x = ((TextView)this.a.findViewById(R.id.remember_password));
    this.E = ((ImageButton)this.a.findViewById(R.id.account_clear));
    this.F = ((ImageButton)this.a.findViewById(R.id.clear_password));
    this.q.setText(this.A);
    c();
    String str = getArguments().getString("title");
    if (!TextUtils.isEmpty(str))
      a(str);
    this.s.setOnClickListener(new ci(this));
    this.w.setOnClickListener(new ck(this));
    this.r.addTextChangedListener(new cl(this));
    this.E.setOnClickListener(new cm(this));
    this.u.addTextChangedListener(new cn(this));
    this.F.setOnClickListener(new co(this));
    this.x.setOnClickListener(new cp(this));
    if (this.C)
      j();
    h();
    return this.a;
  }

  public void onDestroy()
  {
    super.onDestroy();
    if (this.B != null)
      this.B.cancel();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.AccountResetPasswordFragment
 * JD-Core Version:    0.6.0
 */