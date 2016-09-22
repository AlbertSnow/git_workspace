package com.wandoujia.p4.connection.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.p4.connection.a.a;
import com.wandoujia.ripple_framework.fragment.BaseFragment;

public class ConnectionFragment extends BaseFragment
{
  private Button A;
  private Button B;
  private Button C;
  private Button D;
  private ImageButton E;
  private ImageButton F;
  private Context G;
  private View H;
  private final View.OnClickListener I = new c(this);
  private final View.OnClickListener J = new h(this);
  private final View.OnClickListener K = new i(this);
  private int a = 2;
  private View b;
  private View c;
  private View d;
  private View e;
  private com.wandoujia.p4.views.a.f f;
  private com.wandoujia.p4.views.a.f g;
  private Button h;
  private TextView i;
  private TextView j;
  private ImageView k;
  private Button l;
  private FrameLayout m;
  private LinearLayout n;
  private LinearLayout o;
  private LinearLayout p;
  private LinearLayout q;
  private LinearLayout r;
  private LinearLayout s;
  private LinearLayout t;
  private TextView u;
  private TextView v;
  private Button w;
  private Button x;
  private TextView y;
  private TextView z;

  private void a(String paramString, int paramInt)
  {
    this.H.setVisibility(0);
    this.b.setVisibility(0);
    this.c.setVisibility(8);
    this.j.setText(String.format(this.G.getString(2131624562), new Object[] { paramString }));
    this.k.setImageResource(paramInt);
    this.l.setEnabled(true);
    this.l.setText(String.format(this.G.getString(2131624622), new Object[0]));
    this.l.setOnClickListener(this.J);
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.s.setVisibility(8);
    this.t.setVisibility(8);
    if (paramBoolean1)
    {
      this.w.setVisibility(0);
      this.x.setVisibility(0);
      this.w.setEnabled(paramBoolean2);
      this.x.setEnabled(paramBoolean2);
      if (paramBoolean3)
        break label152;
      this.u.setText(2131624957);
      this.v.setText(2131624957);
      this.w.setText(2131624323);
      this.x.setText(2131624323);
    }
    while (true)
    {
      this.y.setVisibility(8);
      this.z.setVisibility(8);
      this.i.setVisibility(8);
      this.C.setText(2131624330);
      return;
      this.w.setVisibility(8);
      this.x.setVisibility(8);
      break;
      label152: this.u.setText(2131624959);
      this.v.setText(2131624959);
      this.w.setText(2131625436);
      this.x.setText(2131625436);
    }
  }

  private static void d()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("phoenix.intent.extra.USER_AGENT", "phoenix");
    localIntent.putExtra("phoenix.intent.extra.SOURCE", 2);
    a.a(GlobalConfig.getAppContext(), localIntent);
  }

  private void e()
  {
    if ((com.wandoujia.p4.b.l.c().d()) && (com.wandoujia.p4.b.l.c().f()))
    {
      a("USB", 2130837527);
      return;
    }
    if (com.wandoujia.p4.b.l.c().e())
    {
      if (com.wandoujia.p4.b.l.c().g())
      {
        a("Wi-Fi", 2130837529);
        return;
      }
      this.b.setVisibility(8);
      this.c.setVisibility(0);
      this.h.setEnabled(true);
      this.h.setText(this.G.getString(2131624357));
      this.a = 2;
      this.s.setVisibility(0);
      this.t.setVisibility(0);
      this.u.setText(2131624959);
      this.v.setText(2131624959);
      this.w.setVisibility(8);
      this.x.setVisibility(8);
      this.y.setVisibility(0);
      this.z.setVisibility(0);
      this.i.setVisibility(0);
      this.C.setVisibility(0);
      this.C.setText(2131624564);
      return;
    }
    this.H.setVisibility(0);
    this.b.setVisibility(8);
    this.c.setVisibility(0);
    if (a.b(this.G))
    {
      if (NetworkUtil.isWifiConnected(this.G))
      {
        this.h.setText(this.G.getString(2131625436));
        this.h.setEnabled(true);
        this.a = 1;
        a(true, true, true);
        return;
      }
      this.h.setText(this.G.getString(2131624565));
      this.h.setEnabled(true);
      this.a = 3;
      a(false, false, true);
      return;
    }
    a(true, true, false);
  }

  private void f()
  {
    String str = com.wandoujia.p4.b.l.c().h();
    this.i.setText(str);
    this.y.setText(str);
    this.z.setText(str);
  }

  public final void a(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      return;
    case 26:
    case 27:
    case 48:
      e();
      return;
    case 25:
    }
    f();
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.G = paramActivity;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (paramConfiguration.orientation == 2)
      if (this.m != null)
      {
        this.m.setVisibility(0);
        this.n.setVisibility(8);
      }
    do
      return;
    while (this.m == null);
    this.m.setVisibility(8);
    this.n.setVisibility(0);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.H = paramLayoutInflater.inflate(2130903054, null);
    this.n = ((LinearLayout)this.H.findViewById(2131493157));
    this.m = ((FrameLayout)this.H.findViewById(2131493147));
    this.b = this.H.findViewById(2131493140);
    this.c = this.H.findViewById(2131493139);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.G.getSystemService("layout_inflater");
    this.d = localLayoutInflater.inflate(2130903107, null);
    this.e = localLayoutInflater.inflate(2130903106, null);
    this.C = ((Button)this.d.findViewById(2131493277));
    this.D = ((Button)this.e.findViewById(2131493274));
    this.i = ((TextView)this.d.findViewById(2131493275));
    this.j = ((TextView)this.b.findViewById(2131493143));
    this.k = ((ImageView)this.b.findViewById(2131493144));
    this.l = ((Button)this.b.findViewById(2131493145));
    this.s = ((LinearLayout)this.m.findViewById(2131493153));
    this.t = ((LinearLayout)this.n.findViewById(2131493153));
    this.u = ((TextView)this.m.findViewById(2131493152));
    this.v = ((TextView)this.n.findViewById(2131493152));
    this.w = ((Button)this.m.findViewById(2131493156));
    this.x = ((Button)this.n.findViewById(2131493156));
    this.y = ((TextView)this.m.findViewById(2131493154));
    this.z = ((TextView)this.n.findViewById(2131493154));
    this.A = ((Button)this.m.findViewById(2131493151));
    this.B = ((Button)this.n.findViewById(2131493151));
    this.E = ((ImageButton)this.m.findViewById(2131493155));
    this.F = ((ImageButton)this.n.findViewById(2131493155));
    this.E.setOnClickListener(new j(this));
    this.F.setOnClickListener(new k(this));
    this.o = ((LinearLayout)this.m.findViewById(2131493148));
    this.q = ((LinearLayout)this.n.findViewById(2131493148));
    this.p = ((LinearLayout)this.m.findViewById(2131493149));
    this.r = ((LinearLayout)this.n.findViewById(2131493149));
    this.f = new com.wandoujia.p4.views.a.f(this.G);
    this.f.setContentView(this.d);
    this.g = new com.wandoujia.p4.views.a.f(this.G);
    this.g.setContentView(this.e);
    this.p.setOnClickListener(this.K);
    this.r.setOnClickListener(this.K);
    this.o.setOnClickListener(this.I);
    this.q.setOnClickListener(this.I);
    this.C.setOnClickListener(new l(this));
    this.D.setOnClickListener(new m(this));
    this.h = ((Button)this.d.findViewById(2131493276));
    this.h.setOnClickListener(new n(this));
    this.w.setOnClickListener(new o(this));
    this.x.setOnClickListener(new d(this));
    this.A.setOnClickListener(new e());
    this.B.setOnClickListener(new f());
    return this.H;
  }

  public void onResume()
  {
    super.onResume();
    e();
    f();
    this.A.setVisibility(4);
    this.B.setVisibility(4);
    if ((a.b(getActivity())) && (a.a(getActivity())))
    {
      this.A.setVisibility(0);
      this.B.setVisibility(0);
    }
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    setTitle(getString(2131625523));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.connection.ui.ConnectionFragment
 * JD-Core Version:    0.6.0
 */