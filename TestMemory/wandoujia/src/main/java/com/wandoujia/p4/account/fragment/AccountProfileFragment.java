package com.wandoujia.p4.account.fragment;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.b;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.p4.account.activity.AccountModifyProfileActivity;
import com.wandoujia.p4.pay.httpapi.GetPayParamsDelegate;
import com.wandoujia.p4.views.CircleAsyncImageView;

public class AccountProfileFragment extends AccountBaseFragment
{
  private TextView c;
  private TextView d;
  private TextView e;
  private CircleAsyncImageView f;
  private Button g;
  private Button h;
  private IntentFilter i;
  private BroadcastReceiver j;
  private ImageView k;
  private TextView l;
  private View m;
  private View n;
  private View o;
  private boolean p = false;
  private com.wandoujia.account.widget.a q;
  private boolean r = false;
  private View s;
  private View t;
  private TextView u;
  private final View.OnClickListener v = new d(this);

  private void b()
  {
    if (com.wandoujia.account.a.p())
      this.g.setVisibility(8);
    if (com.wandoujia.account.a.n())
      this.h.setVisibility(8);
    this.c.setText(com.wandoujia.account.a.l());
    String str1 = com.wandoujia.account.a.r();
    if (!TextUtils.isEmpty(str1))
      if (com.wandoujia.account.a.p())
      {
        this.g.setVisibility(8);
        this.s.setVisibility(0);
        this.d.setText(str1);
        this.m.setVisibility(0);
        label90: String str2 = com.wandoujia.account.a.q();
        if (TextUtils.isEmpty(str2))
          break label240;
        if (!com.wandoujia.account.a.n())
          break label229;
        this.h.setVisibility(8);
        this.t.setVisibility(0);
        label124: this.e.setText(str2);
        this.n.setVisibility(0);
        label140: if (((b.B()) && (!com.wandoujia.account.a.o())) || ((TextUtils.isEmpty(com.wandoujia.account.a.r())) && (TextUtils.isEmpty(com.wandoujia.account.a.q()))))
          break label277;
        this.o.setVisibility(0);
      }
    while (true)
    {
      this.c.setText(com.wandoujia.account.a.l());
      return;
      this.g.setVisibility(0);
      break;
      this.d.setText(2131625529);
      this.s.setVisibility(0);
      this.g.setVisibility(8);
      break label90;
      label229: this.h.setVisibility(0);
      break label124;
      label240: this.e.setText(2131625529);
      this.h.setVisibility(8);
      this.t.setVisibility(0);
      this.n.setVisibility(0);
      break label140;
      label277: this.o.setVisibility(8);
    }
  }

  private void c()
  {
    String str = com.wandoujia.account.a.k();
    new com.wandoujia.ripple_framework.view.e();
    com.wandoujia.ripple_framework.view.e.a(this.f, str, 2130837513);
  }

  public final void a()
  {
    this.c.setText(com.wandoujia.account.a.l());
  }

  final void a(WandouResponse paramWandouResponse)
  {
    if (!this.r)
    {
      a(getString(2131624160), paramWandouResponse);
      return;
    }
    a(getString(2131623966), paramWandouResponse);
  }

  final void a(String paramString)
  {
    if (paramString.equals("CHANGE_PASSWORD_TAG"))
    {
      b.a(com.wandoujia.p4.account.manager.d.a().d());
      getActivity().setResult(100);
      getActivity().finish();
      return;
    }
    if (this.q != null)
      this.q.dismiss();
    b();
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == 403)
    {
      b.a(com.wandoujia.p4.account.manager.d.a().d());
      getActivity().setResult(100);
      getActivity().finish();
    }
    do
    {
      return;
      if (paramInt1 != 10)
        continue;
      c();
      a();
      b();
      return;
    }
    while (paramInt1 != 11);
    com.wandoujia.p4.account.manager.d.a().a(this.b);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return b.a(paramViewGroup, 2130903044);
  }

  public void onDestroy()
  {
    if (this.a != null)
      this.a.dismiss();
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
    getActivity().unregisterReceiver(this.j);
    if (this.a != null)
      this.a.dismiss();
  }

  public void onResume()
  {
    super.onResume();
    getActivity().getWindow().setSoftInputMode(3);
    getActivity().registerReceiver(this.j, this.i);
    b();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    setTitle(getString(2131623996));
    if (com.wandoujia.account.a.y())
      startActivity(new Intent(getActivity(), AccountModifyProfileActivity.class));
    this.i = new IntentFilter("account.intent.action.MODIFY_SUCCESS");
    this.j = new AccountProfileFragment.ModifySuccessReceiver(this);
    this.c = ((TextView)paramView.findViewById(2131493102));
    this.d = ((TextView)paramView.findViewById(2131493115));
    this.e = ((TextView)paramView.findViewById(2131493109));
    this.f = ((CircleAsyncImageView)paramView.findViewById(2131493101));
    this.u = ((TextView)paramView.findViewById(2131493104));
    this.g = ((Button)paramView.findViewById(2131493117));
    this.h = ((Button)paramView.findViewById(2131493111));
    this.m = paramView.findViewById(2131493113);
    this.n = paramView.findViewById(2131493107);
    this.o = paramView.findViewById(2131493118);
    this.l = ((TextView)paramView.findViewById(2131493119));
    this.k = ((ImageView)paramView.findViewById(2131493087));
    this.t = paramView.findViewById(2131493110);
    this.s = paramView.findViewById(2131493116);
    paramView.findViewById(2131493103).setOnClickListener(new e(this));
    paramView.findViewById(2131493105).setOnClickListener(new f(this));
    paramView.findViewById(2131493106).setOnClickListener(new g(this));
    paramView.findViewById(2131493099).setOnClickListener(this.v);
    com.wandoujia.p4.account.manager.d.a().b();
    b();
    this.f.setOnClickListener(this.v);
    this.c.setOnClickListener(this.v);
    this.d.setOnClickListener(this.v);
    this.e.setOnClickListener(this.v);
    this.k.setOnClickListener(this.v);
    this.n.setOnClickListener(this.v);
    this.m.setOnClickListener(this.v);
    this.h.setOnClickListener(this.v);
    this.g.setOnClickListener(this.v);
    this.l.setOnClickListener(this.v);
    com.wandoujia.p4.a.b().executeAsync(new GetPayParamsDelegate("http://innerpay.wandoujia.com/pay/account/query?wdj_auth=" + com.wandoujia.account.a.i(), null), new h(this));
    c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.account.fragment.AccountProfileFragment
 * JD-Core Version:    0.6.0
 */