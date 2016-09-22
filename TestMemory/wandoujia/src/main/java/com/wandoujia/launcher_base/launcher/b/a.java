package com.wandoujia.launcher_base.launcher.b;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.launcher_base.R.id;
import com.wandoujia.launcher_base.R.layout;
import com.wandoujia.launcher_base.launcher.c.b;
import com.wandoujia.launcher_base.utils.g;

public final class a extends com.wandoujia.launcher_base.launcher.c.a
{
  private int a = -1;
  private String b;
  private View.OnClickListener c;
  private int d = -1;
  private String e;
  private View.OnClickListener f;
  private boolean g = true;
  private View h;

  public final View a(View paramView, ViewGroup paramViewGroup)
  {
    if (paramView != null)
      return paramView;
    this.h = LayoutInflater.from(paramViewGroup.getContext()).inflate(R.layout.launcher_end_cell, paramViewGroup, false);
    if ((this.a != -1) && (!TextUtils.isEmpty(this.b)) && (this.c != null))
    {
      ((ImageView)this.h.findViewById(R.id.left_icon)).setImageResource(this.a);
      ((TextView)this.h.findViewById(R.id.left_title)).setText(this.b);
      this.h.findViewById(R.id.left_panel).setOnClickListener(this.c);
    }
    if ((this.d != -1) && (!TextUtils.isEmpty(this.e)) && (this.f != null))
    {
      ((ImageView)this.h.findViewById(R.id.right_icon)).setImageResource(this.d);
      ((TextView)this.h.findViewById(R.id.right_title)).setText(this.e);
      this.h.findViewById(R.id.right_panel).setOnClickListener(this.f);
    }
    return this.h;
  }

  public final void a()
  {
    View localView;
    if (this.h != null)
    {
      localView = this.h.findViewById(R.id.end_divider);
      if (!this.g)
        break label33;
    }
    label33: for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }

  public final void a(int paramInt, String paramString, View.OnClickListener paramOnClickListener)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramOnClickListener;
  }

  protected final void a(b paramb)
  {
    int i = paramb.b();
    int j = 0;
    if (j < i)
    {
      com.wandoujia.launcher_base.launcher.c.a locala = paramb.b(j);
      if ((locala == null) || (locala.e() <= 0));
    }
    for (int k = 1; ; k = 0)
    {
      if (k == 0)
      {
        a(new g(4, 4));
        this.g = false;
        return;
        j++;
        break;
      }
      a(new g(4, 1));
      this.g = true;
      return;
    }
  }

  public final void b(int paramInt, String paramString, View.OnClickListener paramOnClickListener)
  {
    this.d = paramInt;
    this.e = paramString;
    this.f = paramOnClickListener;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.b.a
 * JD-Core Version:    0.6.0
 */