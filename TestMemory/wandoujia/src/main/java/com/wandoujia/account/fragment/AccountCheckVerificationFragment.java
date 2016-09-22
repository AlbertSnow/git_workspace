package com.wandoujia.account.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wandoujia.account.R.color;
import com.wandoujia.account.R.id;
import com.wandoujia.account.R.layout;
import com.wandoujia.account.R.string;
import com.wandoujia.account.dto.AccountError;
import com.wandoujia.account.dto.AccountVerification;
import com.wandoujia.account.dto.AccountVerification.AccountVerificationMethod;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.account.g.w;

public class AccountCheckVerificationFragment extends AccountBaseFragment
{
  private static CountDownTimer D;
  private LinearLayout A;
  private TextView B;
  private EditText C;
  private final b E = new b(this);
  private String q;
  private String r;
  private String s;
  private AccountVerification.AccountVerificationMethod t;
  private AccountVerification u;
  private Button v;
  private TextView w;
  private LinearLayout x;
  private TextView y;
  private TextView z;

  private void g()
  {
    if ((this.s != null) && (this.t != null) && (this.t != AccountVerification.AccountVerificationMethod.PASSWORD))
    {
      b(getString(R.string.account_sdk_verification_send_waiting));
      h();
      if (this.t != AccountVerification.AccountVerificationMethod.EMAIL)
        break label194;
      TextView localTextView2 = this.B;
      int j = R.string.account_sdk_verification_email_resend_hint;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(30);
      localTextView2.setText(getString(j, arrayOfObject2));
    }
    while (true)
    {
      this.B.setTextColor(getResources().getColor(R.color.account_sdk_darker_grey));
      this.B.setVisibility(0);
      this.B.setClickable(false);
      if (D != null)
        D.cancel();
      q localq = new q(this, this);
      D = localq;
      localq.start();
      new Thread(new w("send", this.s, this.t.name(), this.E, this.f)).start();
      return;
      label194: TextView localTextView1 = this.B;
      int i = R.string.account_sdk_verification_tel_resend_hint;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(30);
      localTextView1.setText(getString(i, arrayOfObject1));
    }
  }

  private void h()
  {
    if (D != null)
      D.cancel();
    this.B.setVisibility(8);
    this.B.setClickable(false);
  }

  final void a(WandouResponse paramWandouResponse)
  {
  }

  protected final void b(WandouResponse paramWandouResponse)
  {
    if (paramWandouResponse.getError() == AccountError.VERIFICATION_TOKEN_EXPIRED.getError())
      getParentFragment();
    String str;
    Object localObject;
    do
    {
      do
      {
        return;
        if (paramWandouResponse.getError() == AccountError.PERMISSION_DENIED.getError())
        {
          ((e)getParentFragment()).a();
          return;
        }
        str = getString(R.string.account_sdk_verification_failure);
      }
      while (!isAdded());
      localObject = getActivity();
      if ((localObject == null) || (!getActivity().isFinishing()))
        continue;
      localObject = getActivity().getParent();
    }
    while (localObject == null);
    com.wandoujia.account.h.a.a((Context)localObject, paramWandouResponse.getMsg(), str, new r()).show();
  }

  protected final void c()
  {
    super.c();
    this.v = ((Button)this.a.findViewById(R.id.account_confirm));
    this.w = ((TextView)this.a.findViewById(R.id.account_verification_hint_textview));
    this.x = ((LinearLayout)this.a.findViewById(R.id.account_verification_target_container));
    this.y = ((TextView)this.a.findViewById(R.id.account_verification_target_type));
    this.z = ((TextView)this.a.findViewById(R.id.account_verification_target));
    this.C = ((EditText)this.a.findViewById(R.id.account_verification_code));
    this.B = ((TextView)this.a.findViewById(R.id.account_verification_resend));
    this.A = ((LinearLayout)this.a.findViewById(R.id.account_verification_qq));
    a(this.q);
    this.A.setVisibility(8);
    if (this.t == AccountVerification.AccountVerificationMethod.EMAIL)
    {
      this.w.setText(R.string.account_sdk_verification_email_input_hint);
      this.x.setVisibility(0);
      this.y.setText(R.string.account_sdk_verification_email_target_hint);
      this.z.setText(this.r);
      this.C.setVisibility(8);
      this.C.setInputType(1);
      if ((this.r != null) && (this.r.equals(com.wandoujia.account.a.q())))
        this.A.setVisibility(0);
    }
    while (true)
    {
      this.B.setOnClickListener(new n(this));
      this.v.setOnClickListener(new o(this));
      return;
      if (this.t == AccountVerification.AccountVerificationMethod.SMS)
      {
        this.w.setText(R.string.account_sdk_verification_tel_input_hint);
        this.x.setVisibility(0);
        this.y.setText(R.string.account_sdk_verification_tel_target_hint);
        this.z.setText(this.r);
        this.C.setVisibility(0);
        this.C.setHint(R.string.account_sdk_verification_code_hint);
        this.C.setInputType(3);
        if ((this.r == null) || (!this.r.equals(com.wandoujia.account.a.r())))
          continue;
        this.A.setVisibility(0);
        continue;
      }
      if (this.t != AccountVerification.AccountVerificationMethod.PASSWORD)
        continue;
      this.w.setText(R.string.account_sdk_verification_password_input_hint);
      this.x.setVisibility(8);
      this.C.setVisibility(0);
      this.C.setHint(R.string.account_sdk_password_hint);
      this.C.setInputType(129);
    }
  }

  protected final void d(String paramString)
  {
    if ("confirm".equals(paramString))
      ((e)getParentFragment()).b(this.s, this.u);
  }

  protected final void f()
  {
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    setHasOptionsMenu(false);
    this.a = paramLayoutInflater.inflate(R.layout.account_sdk_verification, paramViewGroup, false);
    Bundle localBundle = getArguments();
    if (localBundle != null)
    {
      this.q = localBundle.getString("account.intent.extra.ACCOUNT_VERIFICATION_TITLE");
      this.s = localBundle.getString("account.intent.extra.ACCOUNT_VERIFICATION_TOKEN");
      this.u = ((AccountVerification)localBundle.getSerializable("account.intent.extra.ACCOUNT_VERIFICATION"));
      if (this.u != null)
      {
        this.t = this.u.getMethod();
        this.r = this.u.getArg();
      }
    }
    c();
    if (this.u != null)
      g();
    return this.a;
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    if (D != null)
    {
      D.cancel();
      D = null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.AccountCheckVerificationFragment
 * JD-Core Version:    0.6.0
 */