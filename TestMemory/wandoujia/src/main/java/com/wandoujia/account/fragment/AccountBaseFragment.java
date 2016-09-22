package com.wandoujia.account.fragment;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.q;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.widget.TextView;
import com.wandoujia.account.AccountParams;
import com.wandoujia.account.AccountParams.Page;
import com.wandoujia.account.R.id;
import com.wandoujia.account.constants.AccountParamConstants.FinishType;
import com.wandoujia.account.dto.Platform;
import com.wandoujia.account.dto.WandouResponse;
import com.wandoujia.account.f.b;
import com.wandoujia.base.utils.KeyboardUtils;
import com.wandoujia.logv3.toolkit.ak;
import com.wandoujia.logv3.toolkit.v;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AccountBaseFragment extends Fragment
{
  private static ConcurrentHashMap<String, b> q = new ConcurrentHashMap();
  protected View a;
  protected Bundle b;
  protected AccountParams c;
  protected String d;
  protected ProgressDialog e;
  protected b f;
  protected Platform g;
  protected final m h = new m(this);
  protected l i;
  protected g j;
  protected j k;
  protected k l;
  protected i m;
  protected f n;
  protected h o;
  protected c p;
  private View r;
  private TextView s;

  protected static String a(Bundle paramBundle, String paramString1, String paramString2)
  {
    String str = paramBundle.getString(paramString1);
    if (str == null)
      return paramString2;
    return str;
  }

  public static void a(b paramb)
  {
    if (paramb == null)
      throw new NullPointerException("wdjAccount Manager must not be null");
    q.put(paramb.a() + paramb.b(), paramb);
  }

  public static b c(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    return (b)q.get(paramString);
  }

  protected final void a()
  {
    try
    {
      v.b().a(getView(), new ak(b())).a(getActivity());
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
    }
  }

  protected final void a(AccountParamConstants.FinishType paramFinishType)
  {
    if (this.c.a() != null);
    try
    {
      this.c.a().send();
      label20: if ((getActivity() != null) && (this.p != null))
        this.p.a(getActivity(), paramFinishType, this.c);
      String str = this.d;
      if ((!TextUtils.isEmpty(str)) && (q.contains(str)))
        q.remove(str);
      if (getActivity() != null)
      {
        if (this.c.f() == -1)
          break label140;
        if (getActivity().getParent() == null)
          break label129;
        getActivity().getParent().setResult(-1);
      }
      while (true)
      {
        getActivity().finish();
        return;
        label129: getActivity().setResult(-1);
        continue;
        label140: getActivity().setResult(-1);
      }
    }
    catch (PendingIntent.CanceledException localCanceledException)
    {
      break label20;
    }
  }

  abstract void a(WandouResponse paramWandouResponse);

  protected final void a(String paramString)
  {
    if ((this.j != null) && (!this.c.s()))
      this.j.a(paramString);
    do
      return;
    while (this.s == null);
    this.s.setText(paramString);
  }

  protected String b()
  {
    return "";
  }

  protected abstract void b(WandouResponse paramWandouResponse);

  protected final void b(String paramString)
  {
    if (!isAdded())
      return;
    try
    {
      if (this.e != null)
        this.e.dismiss();
      this.e = ProgressDialog.show(getActivity(), "", paramString);
      return;
    }
    catch (WindowManager.BadTokenException localBadTokenException)
    {
    }
  }

  protected void c()
  {
    if (this.a != null)
    {
      this.r = this.a.findViewById(R.id.account_sdk_title_area);
      this.s = ((TextView)this.a.findViewById(R.id.account_sdk_fragment_title));
      if ((this.c != null) && (this.c.s()))
        this.r.setVisibility(0);
    }
  }

  protected final q d()
  {
    if (getActivity() == null)
      return null;
    return getActivity().getSupportFragmentManager();
  }

  protected abstract void d(String paramString);

  public final String e()
  {
    if (this.c == null)
      return "";
    return this.c.m();
  }

  protected abstract void f();

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    a();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getArguments();
    this.b = localBundle;
    if (localBundle != null)
    {
      this.d = localBundle.getString("account.intent.extra.ACCOUNT_MANAGER_KEY");
      this.c = ((AccountParams)localBundle.getParcelable("account.intent.extra.ACCOUNT_PARAMS"));
      if (this.c == null)
      {
        this.c = new AccountParams("unknown", 0);
        this.c.a(AccountParams.Page.TEL_REGISTER);
      }
      if (this.f == null)
      {
        this.f = c(this.d);
        if (this.f == null)
        {
          this.d = getActivity().getSharedPreferences("wdj.account", 0).getString("manager_key", "");
          if (!TextUtils.isEmpty(this.d))
            this.f = c(this.d);
        }
      }
      if (!(getActivity() instanceof l))
        break label344;
      this.i = ((l)getActivity());
      label168: if (!(getActivity() instanceof g))
        break label359;
      this.j = ((g)getActivity());
      label189: if (!(getActivity() instanceof j))
        break label374;
      this.k = ((j)getActivity());
      label210: if (!(getActivity() instanceof k))
        break label389;
      this.l = ((k)getActivity());
      label231: if (!(getActivity() instanceof i))
        break label404;
      this.m = ((i)getActivity());
      label252: if (!(getActivity() instanceof f))
        break label419;
      this.n = ((f)getActivity());
      label273: if (!(getActivity() instanceof h))
        break label434;
      this.o = ((h)getActivity());
      label294: if (!(getActivity() instanceof c))
        break label449;
      this.p = ((c)getActivity());
    }
    label344: label359: label374: 
    do
    {
      return;
      this.c = new AccountParams("unknown", 0);
      this.c.a(AccountParams.Page.TEL_REGISTER);
      break;
      if (this.f == null)
        break label168;
      this.i = null;
      break label168;
      if (this.f == null)
        break label189;
      this.j = null;
      break label189;
      if (this.f == null)
        break label210;
      this.k = null;
      break label210;
      if (this.f == null)
        break label231;
      this.l = null;
      break label231;
      if (this.f == null)
        break label252;
      this.m = null;
      break label252;
      if (this.f == null)
        break label273;
      this.n = null;
      break label273;
      if (this.f == null)
        break label294;
      this.o = null;
      break label294;
    }
    while (this.f == null);
    label389: label404: label419: label434: label449: this.p = null;
  }

  public void onPause()
  {
    if (this.e != null)
      this.e.dismiss();
    if (getActivity() != null)
      getActivity().getSharedPreferences("wdj.account", 0).edit().putString("manager_key", this.d).commit();
    super.onPause();
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    if (this.a != null)
    {
      this.a.setOnTouchListener(new a());
      KeyboardUtils.hideSoftInput(this.a);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.fragment.AccountBaseFragment
 * JD-Core Version:    0.6.0
 */