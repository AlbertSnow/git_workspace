package com.wandoujia.account.fragment;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.wandoujia.account.AccountErrorResponse;
import com.wandoujia.account.AccountErrorType;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.AccountParams.Page;
import com.wandoujia.account.R.dimen;
import com.wandoujia.account.R.id;
import com.wandoujia.account.R.layout;
import com.wandoujia.account.R.string;
import com.wandoujia.account.R.style;
import com.wandoujia.account.constants.AccountParamConstants.FragmentType;
import com.wandoujia.account.dto.AccountError;
import com.wandoujia.account.dto.RegisterSource;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.account.j;
import com.wandoujia.account.widget.AccountEditText;
import com.wandoujia.account.widget.d;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import java.util.HashMap;

public class AccountRegisterFragment extends AccountBaseFragment
{
  private static boolean D = false;
  private TextView A;
  private Boolean B = Boolean.valueOf(false);
  private j C;
  private View E;
  private View F;
  private View G;
  private View H;
  private final cb I = new cb(this);
  private final TextWatcher J = new bh(this);
  private AccountEditText q;
  private AccountEditText r;
  private TextView s;
  private TextView t;
  private TextView u;
  private ImageButton v;
  private boolean w = true;
  private TextView x;
  private CheckBox y;
  private LinearLayout z;

  public static final AccountRegisterFragment a(Bundle paramBundle)
  {
    AccountRegisterFragment localAccountRegisterFragment = new AccountRegisterFragment();
    localAccountRegisterFragment.setArguments(paramBundle);
    return localAccountRegisterFragment;
  }

  public static final AccountRegisterFragment b(Bundle paramBundle)
  {
    AccountRegisterFragment localAccountRegisterFragment = new AccountRegisterFragment();
    localAccountRegisterFragment.setArguments(paramBundle);
    D = true;
    return localAccountRegisterFragment;
  }

  private void c(WandouResponse paramWandouResponse)
  {
    FragmentActivity localFragmentActivity = getActivity();
    if (localFragmentActivity == null)
      return;
    Object localObject;
    if (getActivity().isFinishing())
      localObject = getActivity().getParent();
    while (true)
    {
      if (paramWandouResponse != null);
      try
      {
        if (paramWandouResponse.getError() == AccountError.USER_ALREADY_EXIST.getError())
        {
          this.B = Boolean.valueOf(true);
          this.f.a(this.q.getText().toString(), this.r.getText().toString(), null, this.c.m(), "REGISTER_TAG", this.I);
          if (this.e != null)
            this.e.dismiss();
          this.e = ProgressDialog.show(getActivity(), "", getActivity().getString(R.string.account_sdk_netop_submitting_login));
          this.e.show();
          return;
        }
        if (paramWandouResponse.getError() == AccountError.USERNAME_DUPLICATED.getError())
        {
          String str2 = this.q.getText().toString();
          String str3 = getActivity().getString(R.string.account_sdk_reset_password);
          if (android.support.v4.app.b.t(str2) != AccountErrorType.OK)
          {
            d locald = new d(getActivity());
            int i = R.string.account_sdk_username_exist;
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = this.q.getText().toString();
            locald.b(getString(i, arrayOfObject)).a(getString(R.string.account_sdk_register_failure)).b(getString(R.string.account_sdk_cancel), new br(this)).a(getString(R.string.account_sdk_login), new bq(this)).a(true);
            locald.b();
            return;
          }
          AccountResetPasswordFragment localAccountResetPasswordFragment = AccountResetPasswordFragment.a(str2, str3, String.format(getActivity().getString(R.string.account_sdk_account_was_register_tips), new Object[] { str2 }), this.d, true, getArguments(), "account_register_fragment");
          ac localac = d().a();
          if (d().e() > 0)
            d().d();
          localac.b(R.id.account_fragment_layout, localAccountResetPasswordFragment, "resetPassword");
          localac.a();
          return;
        }
        if (paramWandouResponse.getError() == AccountError.NEED_SECCODE.getError())
        {
          com.wandoujia.account.h.a.a((Context)localObject, new bm(this), new bn()).show();
          return;
        }
        String str1 = paramWandouResponse.getMsg();
        if (TextUtils.isEmpty(str1))
          str1 = getString(R.string.account_sdk_netop_server_error);
        com.wandoujia.account.h.a.a((Context)localObject, str1, getString(R.string.account_sdk_register_failure), new bo(this, paramWandouResponse)).show();
        return;
        com.wandoujia.account.h.a.a((Context)localObject, getString(R.string.account_sdk_netop_network_error), getString(R.string.account_sdk_register_failure), new bp()).show();
        return;
        localObject = localFragmentActivity;
      }
      catch (Exception localException)
      {
      }
    }
  }

  private boolean e(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      String str1 = RegisterSource.TELEPHONE.name();
      if (!this.w)
        str1 = RegisterSource.EMAIL.name();
      String str2 = this.q.getText().toString();
      String str3 = this.c.m();
      HashMap localHashMap = new HashMap();
      localHashMap.put("account_register_type", str1);
      localHashMap.put("account_register_user_input", str2);
      localHashMap.put("account_register_src", str3);
      localHashMap.put("account_register_failed_reason", paramString);
      com.wandoujia.account.d.b.a();
      com.wandoujia.account.h.a.a(getActivity(), paramString, getString(R.string.account_sdk_register_failure), new bt()).show();
      return false;
    }
    return true;
  }

  private void g()
  {
    if (this.f == null)
      return;
    if (this.e != null)
      this.e.dismiss();
    this.e = ProgressDialog.show(getActivity(), "", getActivity().getString(R.string.account_sdk_netop_submitting_register));
    this.e.show();
    TaskEvent.Action localAction;
    TaskEvent.Result localResult;
    if (!this.w)
    {
      this.f.a(this.q.getText().toString(), this.r.getText().toString(), this.c.m(), "REGISTER_TAG", this.I);
      if (this.l != null)
        this.l.b();
      localAction = TaskEvent.Action.SIGN_UP;
      localResult = TaskEvent.Result.SUCCESS;
      if (!this.w)
        break label176;
    }
    label176: for (String str = "telephone_reg"; ; str = "email_reg")
    {
      com.wandoujia.account.d.b.a(localAction, localResult, str);
      return;
      this.f.b(this.q.getText().toString(), this.c.m(), "", "REGISTER_TAG", this.I);
      break;
    }
  }

  private void h()
  {
    boolean bool;
    label166: TextView localTextView;
    ViewLogPackage.Element localElement;
    ViewLogPackage.Action localAction;
    if (!this.w)
    {
      bool = true;
      this.w = bool;
      this.r.setText("");
      String str1 = android.support.v4.app.b.m(getActivity());
      if (this.w)
        break label257;
      new HashMap().put("account_view_type", "email");
      getActivity();
      com.wandoujia.account.d.b.a();
      str1 = android.support.v4.app.b.n(getActivity());
      this.z.setVisibility(0);
      this.x.setVisibility(8);
      this.u.setText(R.string.account_sdk_register_tel);
      this.q.setHint(R.string.account_sdk_email_big);
      if (Build.VERSION.SDK_INT > 9)
      {
        this.q.setRawInputType(48);
        this.q.setInputType(48);
      }
      a(getActivity().getString(R.string.account_sdk_register_email));
      this.s.setText(R.string.account_sdk_register);
      this.r.setVisibility(0);
      this.r.setText("");
      this.q.setText(str1);
      if (!TextUtils.isEmpty(str1))
        this.r.requestFocus();
      localTextView = this.u;
      localElement = ViewLogPackage.Element.BUTTON;
      localAction = ViewLogPackage.Action.REDIRECT;
      if (!this.w)
        break label362;
    }
    label257: label362: for (String str2 = "type_telephone"; ; str2 = "type_email")
    {
      com.wandoujia.account.d.b.a(localTextView, "Account", localElement, localAction, str2);
      if (getView() != null)
        a();
      return;
      bool = false;
      break;
      new HashMap().put("account_view_type", "telView");
      getActivity();
      com.wandoujia.account.d.b.a();
      this.u.setText(R.string.account_sdk_register_email);
      this.q.setHint(R.string.account_sdk_tel_register_hint);
      if (Build.VERSION.SDK_INT > 9)
        this.q.setRawInputType(3);
      this.q.requestFocus();
      this.r.setVisibility(8);
      this.s.setText(R.string.account_sdk_one_key_register);
      a(getActivity().getString(R.string.account_sdk_register_tel));
      break label166;
    }
  }

  final void a(WandouResponse paramWandouResponse)
  {
    c(paramWandouResponse);
  }

  protected final String b()
  {
    if (this.w)
      return "wdj://account/signup/mobile";
    return "wdj://account/signup/email";
  }

  protected final void b(WandouResponse paramWandouResponse)
  {
  }

  protected final void c()
  {
    super.c();
    this.s = ((TextView)this.a.findViewById(R.id.account_register));
    this.q = ((AccountEditText)this.a.findViewById(R.id.account_username));
    this.v = ((ImageButton)this.a.findViewById(R.id.account_clear));
    this.r = ((AccountEditText)this.a.findViewById(R.id.account_password));
    this.z = ((LinearLayout)this.a.findViewById(R.id.account_username_area));
    this.t = ((TextView)this.a.findViewById(R.id.account_login));
    this.u = ((TextView)this.a.findViewById(R.id.account_register_type));
    this.x = ((TextView)this.a.findViewById(R.id.account_username_textview));
    this.y = ((CheckBox)this.a.findViewById(R.id.account_contact_checkBox));
    this.E = this.a.findViewById(R.id.account_sdk_sina_login_area);
    this.F = this.a.findViewById(R.id.account_sdk_qq_login_area);
    this.G = this.a.findViewById(R.id.account_sdk_wechat_login_area);
    this.H = this.a.findViewById(R.id.third_login_area);
    this.A = ((TextView)this.a.findViewById(R.id.account_legal_hint));
    if (getActivity() != null)
    {
      String str5 = this.A.getText().toString();
      SpannableString localSpannableString = new SpannableString(getActivity().getString(R.string.account_sdk_register_agree));
      int i = str5.indexOf(getActivity().getString(R.string.account_sdk_title_terms));
      TextAppearanceSpan localTextAppearanceSpan = new TextAppearanceSpan(getActivity(), R.style.account_sdk_term_style);
      if (i != -1)
        localSpannableString.setSpan(localTextAppearanceSpan, i, i + getActivity().getString(R.string.account_sdk_title_terms).length(), 33);
      this.A.setText(localSpannableString);
    }
    label383: String str2;
    if (!this.c.i())
    {
      this.F.setVisibility(8);
      if (this.c.j())
        break label1055;
      this.E.setVisibility(8);
      if (this.c.k())
        break label1066;
      this.G.setVisibility(8);
      LinearLayout.LayoutParams localLayoutParams2 = (LinearLayout.LayoutParams)this.F.getLayoutParams();
      localLayoutParams2.rightMargin = getActivity().getResources().getDimensionPixelOffset(R.dimen.account_sdk_large_margin);
      this.F.setLayoutParams(localLayoutParams2);
      label441: if ((!this.c.i()) && (!this.c.j()) && (!this.c.j()))
        this.H.setVisibility(8);
      if (this.c.l())
        break label1113;
      this.u.setVisibility(8);
      this.t.setGravity(17);
      label508: if (this.c.r())
      {
        ViewGroup.LayoutParams localLayoutParams = this.a.getLayoutParams();
        localLayoutParams.height = -1;
        this.a.setLayoutParams(localLayoutParams);
      }
      this.E.setOnClickListener(new bs(this));
      this.F.setOnClickListener(new bu(this));
      this.G.setOnClickListener(new bv(this));
      this.s.setOnClickListener(new bw(this));
      this.t.setOnClickListener(new bx(this));
      this.u.setOnClickListener(new by(this));
      this.v.setOnClickListener(new bz(this));
      this.A.setOnClickListener(new ca(this));
      if (this.c == null)
      {
        this.c = new AccountParams("unknown", 0);
        this.c.a(AccountParams.Page.TEL_REGISTER);
      }
      String str1 = this.c.e();
      if ((TextUtils.isEmpty(str1)) && (getActivity() != null))
        str1 = getActivity().getString(R.string.account_sdk_register_tel);
      a(str1);
      str2 = this.c.d();
      if (this.c.p() != AccountParams.Page.TEL_REGISTER)
        break label1125;
      if (TextUtils.isEmpty(str2))
        str2 = android.support.v4.app.b.m(getActivity());
      HashMap localHashMap2 = new HashMap();
      localHashMap2.put("account_view_type", "telView");
      String str4 = "unknown";
      if (this.c != null)
        str4 = this.c.m();
      localHashMap2.put("account_source", str4);
      getActivity();
      com.wandoujia.account.d.b.a();
      this.s.setText(R.string.account_sdk_one_key_register);
      this.r.setVisibility(8);
      label848: if (TextUtils.isEmpty(str2))
        break label1226;
      this.v.setVisibility(0);
      this.r.requestFocus();
    }
    while (true)
    {
      if (!TextUtils.isEmpty(str2))
        this.q.setText(str2);
      this.q.addTextChangedListener(this.J);
      if (this.n != null)
        this.y.setVisibility(8);
      if (Build.VERSION.SDK_INT > 9)
        this.q.setOnTouchListener(new bi(this));
      this.y.setOnCheckedChangeListener(new bj(this));
      this.r.setOnEditorActionListener(new bk(this));
      this.r.setOnFocusChangeListener(new bl(this));
      if (D)
      {
        if (this.c.b() != null)
        {
          this.q.setText(this.c.d());
          this.r.setText(this.c.c());
          c(this.c.b().a());
        }
        D = false;
      }
      return;
      this.F.setVisibility(0);
      break;
      label1055: this.E.setVisibility(0);
      break label383;
      label1066: this.G.setVisibility(0);
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)this.F.getLayoutParams();
      localLayoutParams1.rightMargin = getActivity().getResources().getDimensionPixelOffset(R.dimen.account_sdk_xsmall_margin);
      this.F.setLayoutParams(localLayoutParams1);
      break label441;
      label1113: this.t.setGravity(21);
      break label508;
      label1125: if (this.c.p() != AccountParams.Page.EMAIL_REGISTER)
        break label848;
      if (TextUtils.isEmpty(str2))
        str2 = android.support.v4.app.b.n(getActivity());
      this.w = true;
      h();
      HashMap localHashMap1 = new HashMap();
      localHashMap1.put("account_view_type", "email");
      String str3 = "unknown";
      if (this.c != null)
        str3 = this.c.m();
      localHashMap1.put("account_source", str3);
      getActivity();
      com.wandoujia.account.d.b.a();
      break label848;
      label1226: this.q.requestFocus();
    }
  }

  protected final void d(String paramString)
  {
  }

  protected final void f()
  {
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == 10001)
      this.y.setChecked(true);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = paramLayoutInflater.inflate(R.layout.account_sdk_aa_account_register, paramViewGroup, false);
    this.C = new j(getActivity());
    this.C.a(this.c, getActivity());
    c();
    if (this.e != null)
      this.e.dismiss();
    if (this.j != null)
      this.j.a(AccountParamConstants.FragmentType.REGISTER);
    return this.a;
  }

  public void onDestroy()
  {
    if (this.e != null)
      this.e.dismiss();
    this.f = null;
    this.C = null;
    super.onDestroy();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.AccountRegisterFragment
 * JD-Core Version:    0.6.0
 */