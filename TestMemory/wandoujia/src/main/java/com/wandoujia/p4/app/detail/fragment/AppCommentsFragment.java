package com.wandoujia.p4.app.detail.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.wandoujia.jupiter.presenter.t;
import com.wandoujia.p4.adapter.m;
import com.wandoujia.p4.app.detail.model.CommentJson;
import com.wandoujia.p4.app.detail.model.EnjoySummary;
import com.wandoujia.p4.c.k;
import com.wandoujia.p4.fragment.NetworkListAsyncloadFragment;
import com.wandoujia.p4.tips.TipsType;
import com.wandoujia.p4.views.ContentListView;
import com.wandoujia.ripple_framework.log.Logger;

public class AppCommentsFragment extends NetworkListAsyncloadFragment<com.wandoujia.p4.app.detail.model.a>
{
  private String c;
  private long d;
  private com.wandoujia.p4.app.detail.b.c e;
  private String f;
  private String g;
  private String h;
  private String i;
  private boolean j;
  private Boolean k = null;
  private boolean l;
  private View m;
  private EditText n;
  private TextView o;
  private TextView p;
  private View q;
  private View r;
  private TextView s;
  private FrameLayout t;
  private boolean u = false;
  private final TextWatcher v = new a(this);
  private final com.wandoujia.p4.app.controller.h w = new b(this);

  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = 2131362232;
    this.k = Boolean.valueOf(paramBoolean1);
    TextView localTextView1 = this.o;
    int i2;
    int i3;
    label49: int i4;
    if (paramBoolean1)
    {
      i2 = 2130838263;
      localTextView1.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
      View localView1 = this.q;
      if (!paramBoolean1)
        break label124;
      i3 = 2131362002;
      localView1.setBackgroundResource(i3);
      TextView localTextView2 = this.p;
      if (!paramBoolean1)
        break label130;
      i4 = 2130838151;
      label70: localTextView2.setCompoundDrawablesWithIntrinsicBounds(i4, 0, 0, 0);
      View localView2 = this.r;
      if (!paramBoolean1)
        break label137;
      label90: localView2.setBackgroundResource(i1);
      if ((!paramBoolean2) && (!this.l))
        break label143;
    }
    label130: label137: label143: for (boolean bool = true; ; bool = false)
    {
      this.l = bool;
      return;
      i2 = 2130838261;
      break;
      label124: i3 = i1;
      break label49;
      i4 = 2130838153;
      break label70;
      i1 = 2131362002;
      break label90;
    }
  }

  private void d()
  {
    getActivity().getWindow().setSoftInputMode(2);
    ((InputMethodManager)getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.n.getWindowToken(), 2);
  }

  protected final com.wandoujia.p4.c.a<com.wandoujia.p4.app.detail.model.a> a()
  {
    this.e = new com.wandoujia.p4.app.detail.b.c(this.c);
    return this.e;
  }

  protected final void a(int paramInt1, int paramInt2, k<com.wandoujia.p4.app.detail.model.a> paramk)
  {
    super.a(paramInt1, paramInt2, paramk);
    if (!isAdded())
      return;
    EnjoySummary localEnjoySummary = this.e.b();
    if (localEnjoySummary != null)
    {
      if (this.m != null)
        break label246;
      ContentListView localContentListView = m();
      View localView = com.wandoujia.p4.utils.c.a(localContentListView, 2130903281);
      localView.setBackgroundResource(2131361862);
      t.a(localContentListView.getContext(), new com.wandoujia.nirvana.framework.ui.a.a(localView), localEnjoySummary.likeCount, localEnjoySummary.dislikeCount);
      this.m = localView;
      l().a(this.m);
    }
    while (true)
    {
      CommentJson localCommentJson = this.e.c();
      if (localCommentJson != null)
      {
        if ((TextUtils.isEmpty(this.n.getText())) && (!TextUtils.isEmpty(localCommentJson.getContent())))
        {
          this.n.setText(localCommentJson.getContent());
          this.n.setSelection(localCommentJson.getContent().length());
        }
        if ((!this.l) && (localCommentJson.getEnjoy() != null))
          a(localCommentJson.getEnjoy().booleanValue(), false);
      }
      if ((!this.u) || (this.k == null) || (this.k.booleanValue()))
        break;
      this.u = false;
      this.a.postDelayed(new g(this), 1000L);
      return;
      label246: t.a(this.m.getContext(), new com.wandoujia.nirvana.framework.ui.a.a(this.m), localEnjoySummary.likeCount, localEnjoySummary.dislikeCount);
    }
  }

  protected final com.wandoujia.p4.adapter.h<com.wandoujia.p4.app.detail.model.a> b()
  {
    return new i();
  }

  protected final void c()
  {
    com.wandoujia.p4.tips.a.a(getContentView().findViewById(2131493123), TipsType.NO_COMMENTS);
  }

  protected int getLayoutResId()
  {
    return 2130903047;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.c = getArguments().getString("packageName");
    this.d = getArguments().getLong("vc");
    this.g = getArguments().getString("appType");
    this.f = getArguments().getString("title");
    this.h = getArguments().getString("vn");
    this.i = getArguments().getString("defaultApkMd5");
    this.j = getArguments().getBoolean("editMode", false);
  }

  protected void onInflated(View paramView, Bundle paramBundle)
  {
    super.onInflated(paramView, paramBundle);
    this.t = ((FrameLayout)paramView.findViewById(2131493122));
    this.n = ((EditText)paramView.findViewById(2131493616));
    this.o = ((TextView)paramView.findViewById(2131493613));
    this.p = ((TextView)paramView.findViewById(2131493615));
    this.q = paramView.findViewById(2131493612);
    this.r = paramView.findViewById(2131493614);
    paramView.findViewById(2131493610);
    this.s = ((TextView)paramView.findViewById(2131493617));
    Logger localLogger;
    StringBuilder localStringBuilder;
    if (this.j)
    {
      this.n.requestFocus();
      getActivity().getWindow().setSoftInputMode(5);
      ((InputMethodManager)getActivity().getSystemService("input_method")).showSoftInput(this.n, 1);
      this.q.setOnClickListener(new d(this));
      this.r.setOnClickListener(new e(this));
      this.s.setOnClickListener(new f(this));
      this.n.addTextChangedListener(this.v);
      localLogger = com.wandoujia.ripple_framework.i.k().h();
      localStringBuilder = new StringBuilder();
      if (!"APP".equals(this.g))
        break label294;
    }
    label294: for (String str = "wdj://apps"; ; str = "wdj://games")
    {
      localLogger.a(paramView, str + "/" + this.c + "/comments").a(getActivity());
      return;
      d();
      break;
    }
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    setTitle(this.f);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.fragment.AppCommentsFragment
 * JD-Core Version:    0.6.0
 */