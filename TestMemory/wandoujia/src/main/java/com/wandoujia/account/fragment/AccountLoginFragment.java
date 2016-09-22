package com.wandoujia.account.fragment;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.wandoujia.account.AccountErrorType;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.AccountParams.Type;
import com.wandoujia.account.R.dimen;
import com.wandoujia.account.R.id;
import com.wandoujia.account.R.layout;
import com.wandoujia.account.R.string;
import com.wandoujia.account.R.style;
import com.wandoujia.account.constants.AccountParamConstants.FinishType;
import com.wandoujia.account.constants.AccountParamConstants.FragmentType;
import com.wandoujia.account.dto.AccountError;
import com.wandoujia.account.dto.Platform;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.account.j;
import com.wandoujia.account.widget.AccountEditText;
import com.wandoujia.account.widget.d;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import java.util.HashMap;

public class AccountLoginFragment extends AccountBaseFragment
{
  private TextView A;
  private View B;
  private CheckBox C;
  private final b D = new b(this);
  private j E;
  private String F = "LOGIN_TAG";
  private final TextWatcher G = new ad(this);
  private View q;
  private AccountEditText r;
  private AccountEditText s;
  private TextView t;
  private ImageButton u;
  private View v;
  private View w;
  private View x;
  private TextView y;
  private TextView z;

  public static final AccountLoginFragment a(Bundle paramBundle)
  {
    AccountLoginFragment localAccountLoginFragment = new AccountLoginFragment();
    localAccountLoginFragment.setArguments(paramBundle);
    return localAccountLoginFragment;
  }

  private boolean f(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      com.wandoujia.account.h.a.a(getActivity(), paramString, getString(R.string.account_sdk_login_failure), new ae()).show();
      return false;
    }
    return true;
  }

  final void a(WandouResponse paramWandouResponse)
  {
    int i = 1;
    Object localObject = getActivity();
    if ((localObject != null) && (getActivity().isFinishing()))
      localObject = getActivity().getParent();
    if (localObject == null)
      return;
    if (paramWandouResponse != null);
    while (true)
    {
      try
      {
        if (paramWandouResponse.getError() != AccountError.NEED_SECCODE.getError())
          continue;
        com.wandoujia.account.h.a.a((Context)localObject, new af(this), new ag()).show();
        return;
        if (paramWandouResponse.getError() != AccountError.USER_NOT_EXIST.getError())
          continue;
        if (!android.support.v4.app.b.u(this.r.getText().toString()))
          continue;
        int k = R.string.account_sdk_user_not_register;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = this.r.getText().toString();
        com.wandoujia.account.h.a.a((Context)localObject, getString(k, arrayOfObject2), getString(R.string.account_sdk_register), getString(R.string.account_sdk_one_key_register), new ah(this), new ai(this)).show();
        return;
        if (android.support.v4.app.b.s(this.r.getText().toString()) == AccountErrorType.OK)
        {
          if (i == 0)
            break;
          int j = R.string.account_sdk_user_not_register;
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = this.r.getText().toString();
          com.wandoujia.account.h.a.a((Context)localObject, getString(j, arrayOfObject1), getString(R.string.account_sdk_register), getString(R.string.account_sdk_register), new aj(this), new ak()).show();
          return;
          if (paramWandouResponse.getError() != AccountError.USERNAME_PASSWORD_WRONG.getError())
            continue;
          this.s.setText("");
          String str1 = paramWandouResponse.getMsg();
          if ((!TextUtils.isEmpty(str1)) && (paramWandouResponse.getError() != AccountError.SUCCESS.getError()))
            continue;
          str1 = getActivity().getString(R.string.account_sdk_netop_server_error);
          String str2 = getString(R.string.account_sdk_login_failure);
          String str3 = getString(R.string.account_sdk_try_again);
          al localal = new al(this);
          String str4 = getString(R.string.account_sdk_find_password);
          an localan = new an(this);
          d locald = new d((Context)localObject);
          locald.b(str1).a(str2).b(str4, localan).a(str3, localal).a(false);
          locald.a().show();
          com.wandoujia.account.d.b.a("Account", ViewLogPackage.Action.POPUP, "login_failed_dialog", Long.valueOf(0L));
          return;
          com.wandoujia.account.h.a.a((Context)localObject, getString(R.string.account_sdk_netop_server_error), getString(R.string.account_sdk_login_failure), new ao()).show();
          return;
        }
      }
      catch (Exception localException)
      {
        return;
      }
      i = 0;
    }
  }

  protected final String b()
  {
    return "wdj://account/signin";
  }

  protected final void b(WandouResponse paramWandouResponse)
  {
    if (this.E != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("account_login_type", "account_normal_login");
      localHashMap.put("account_login_status", "failed");
      com.wandoujia.account.d.b.a();
    }
    a(paramWandouResponse);
    if (TextUtils.equals(this.F, "LOGIN_TAG"))
    {
      String str2 = "login_fragment";
      if (paramWandouResponse != null)
        str2 = str2 + " " + paramWandouResponse.toString();
      com.wandoujia.account.d.b.b(TaskEvent.Action.LOGIN_IN, TaskEvent.Result.FAIL, str2);
      return;
    }
    String str1 = "login_fragment_one_key_register";
    if (paramWandouResponse != null)
      str1 = str1 + " " + paramWandouResponse.toString();
    com.wandoujia.account.d.b.b(TaskEvent.Action.SIGN_UP, TaskEvent.Result.FAIL, str1);
  }

  protected final void c()
  {
    super.c();
    this.q = this.a;
    this.r = ((AccountEditText)this.q.findViewById(R.id.account_username));
    this.u = ((ImageButton)this.q.findViewById(R.id.account_clear));
    this.s = ((AccountEditText)this.q.findViewById(R.id.account_password));
    this.t = ((TextView)this.q.findViewById(R.id.account_login));
    this.y = ((TextView)this.q.findViewById(R.id.account_register));
    this.z = ((TextView)this.q.findViewById(R.id.account_forget_password));
    this.v = this.q.findViewById(R.id.account_sdk_sina_login_area);
    this.w = this.q.findViewById(R.id.account_sdk_qq_login_area);
    this.x = this.q.findViewById(R.id.account_sdk_wechat_login_area);
    this.A = ((TextView)this.a.findViewById(R.id.account_legal_hint));
    this.C = ((CheckBox)this.a.findViewById(R.id.account_contact_checkBox));
    this.B = this.a.findViewById(R.id.third_login_area);
    this.r.addTextChangedListener(this.G);
    this.s.addTextChangedListener(this.G);
    if (getActivity() != null)
    {
      String str = this.A.getText().toString();
      SpannableString localSpannableString = new SpannableString(getActivity().getString(R.string.account_sdk_register_agree));
      int i = str.indexOf(getActivity().getString(R.string.account_sdk_title_terms));
      TextAppearanceSpan localTextAppearanceSpan = new TextAppearanceSpan(getActivity(), R.style.account_sdk_term_style);
      if (i != -1)
        localSpannableString.setSpan(localTextAppearanceSpan, i, i + getActivity().getString(R.string.account_sdk_title_terms).length(), 33);
      this.A.setText(localSpannableString);
    }
    label416: label435: label493: ViewGroup.LayoutParams localLayoutParams;
    if ((!TextUtils.isEmpty(this.c.d())) && (android.support.v4.app.b.r(this.c.d())))
    {
      this.r.setText(this.c.d());
      this.s.requestFocus();
      this.u.setVisibility(0);
      if (this.c.i())
        break label855;
      this.w.setVisibility(8);
      if (this.c.j())
        break label866;
      this.v.setVisibility(8);
      if (this.c.k())
        break label877;
      this.x.setVisibility(8);
      LinearLayout.LayoutParams localLayoutParams2 = (LinearLayout.LayoutParams)this.w.getLayoutParams();
      localLayoutParams2.rightMargin = getActivity().getResources().getDimensionPixelOffset(R.dimen.account_sdk_large_margin);
      this.w.setLayoutParams(localLayoutParams2);
      if (this.c.r())
      {
        localLayoutParams = this.q.getLayoutParams();
        if (localLayoutParams != null)
          break label924;
        localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
        label525: this.q.setLayoutParams(localLayoutParams);
      }
      if ((!this.c.i()) && (!this.c.j()) && (!this.c.j()))
        this.B.setVisibility(8);
      this.C.setOnCheckedChangeListener(new ab(this));
      if (this.n != null)
        this.C.setVisibility(8);
      if (!TextUtils.isEmpty(this.c.e()))
        break label960;
      if (this.c.q() != AccountParams.Type.SDK)
        break label946;
      if (getActivity() == null)
        break label932;
      a(getString(R.string.account_sdk_login_with_wdj));
    }
    while (true)
    {
      this.t.setOnClickListener(new am(this));
      this.y.setOnClickListener(new ap(this));
      this.z.setOnClickListener(new aq(this));
      this.v.setOnClickListener(new ar(this));
      this.w.setOnClickListener(new as(this));
      this.x.setOnClickListener(new at(this));
      this.u.setOnClickListener(new au(this));
      this.A.setOnClickListener(new av(this));
      this.s.setOnEditorActionListener(new ac(this));
      return;
      if ((!TextUtils.isEmpty(com.wandoujia.account.a.c())) && (android.support.v4.app.b.r(com.wandoujia.account.a.c())))
      {
        this.r.setText(com.wandoujia.account.a.c());
        this.s.requestFocus();
        this.u.setVisibility(0);
        break;
      }
      this.r.setText(android.support.v4.app.b.m(getActivity()));
      this.r.requestFocus();
      break;
      label855: this.w.setVisibility(0);
      break label416;
      label866: this.v.setVisibility(0);
      break label435;
      label877: this.x.setVisibility(0);
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)this.w.getLayoutParams();
      localLayoutParams1.rightMargin = getActivity().getResources().getDimensionPixelOffset(R.dimen.account_sdk_xsmall_margin);
      this.w.setLayoutParams(localLayoutParams1);
      break label493;
      label924: localLayoutParams.height = -1;
      break label525;
      label932: a(getString(R.string.account_sdk_login));
      continue;
      label946: a(getString(R.string.account_sdk_login));
      continue;
      label960: if (getActivity() == null)
        continue;
      a(this.c.e());
    }
  }

  protected final void d(String paramString)
  {
    if (paramString.equals("LOGIN_TAG"))
    {
      if (this.E != null)
        this.E.a(getActivity());
      a(AccountParamConstants.FinishType.LOGIN);
      com.wandoujia.account.d.b.b(TaskEvent.Action.LOGIN_IN, TaskEvent.Result.SUCCESS, "login_fragment");
    }
    do
      return;
    while (!paramString.equals("REGISTER_TAG"));
    if (this.E != null)
      this.E.a(getActivity(), Boolean.valueOf(false), false);
    Toast.makeText(getActivity(), getString(R.string.account_sdk_register_success), 0).show();
    a(AccountParamConstants.FinishType.TEL_REGISTER);
    com.wandoujia.account.d.b.b(TaskEvent.Action.SIGN_UP, TaskEvent.Result.SUCCESS, "login_fragment_one_key_register");
  }

  public final void e(String paramString)
  {
    if (this.r != null)
      this.r.setText(paramString);
  }

  protected final void f()
  {
    if (this.E != null)
      this.E.b();
    if (TextUtils.equals(this.F, "LOGIN_TAG"))
    {
      com.wandoujia.account.d.b.b(TaskEvent.Action.LOGIN_IN, TaskEvent.Result.CANCEL, "login_fragment");
      return;
    }
    com.wandoujia.account.d.b.b(TaskEvent.Action.LOGIN_IN, TaskEvent.Result.CANCEL, "login_fragment_one_key_register");
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == 10001)
      this.C.setChecked(true);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    setHasOptionsMenu(true);
    this.a = paramLayoutInflater.inflate(R.layout.account_sdk_aa_account_login, paramViewGroup, false);
    this.E = new j(getActivity());
    this.E.a(this.c, getActivity());
    c();
    if (this.e != null)
      this.e.dismiss();
    HashMap localHashMap = new HashMap();
    localHashMap.put("account_view_type", "account_login");
    String str = "unknown";
    if (this.c != null)
      str = this.c.m();
    localHashMap.put("account_source", str);
    getActivity();
    com.wandoujia.account.d.b.a();
    if (this.j != null)
      this.j.a(AccountParamConstants.FragmentType.LOGIN);
    return this.a;
  }

  public void onDestroy()
  {
    if (this.e != null)
      this.e.dismiss();
    this.f = null;
    this.E = null;
    super.onDestroy();
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (getString(R.string.account_sdk_renren_login).equals(paramMenuItem.getTitle()))
    {
      this.g = Platform.RENREN;
      if ((this.f == null) || (getActivity() == null))
        return super.onOptionsItemSelected(paramMenuItem);
      this.f.b(Platform.RENREN, getActivity(), this.h, this.c.m());
      HashMap localHashMap = new HashMap();
      localHashMap.put("account_view_type", "account_renren_login");
      String str = "unknown";
      if (this.c != null)
        str = this.c.m();
      localHashMap.put("account_source", str);
      getActivity();
      com.wandoujia.account.d.b.a();
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.AccountLoginFragment
 * JD-Core Version:    0.6.0
 */