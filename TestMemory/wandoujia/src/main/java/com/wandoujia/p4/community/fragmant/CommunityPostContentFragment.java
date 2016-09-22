package com.wandoujia.p4.community.fragmant;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import com.wandoujia.p4.button.views.StatefulButton;
import com.wandoujia.p4.community.c.e;
import com.wandoujia.p4.imagepicker.activity.ImageChooserActivity;
import com.wandoujia.ripple_framework.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;

public abstract class CommunityPostContentFragment extends BaseFragment
{
  private View a;
  private EditText b;
  private TextView c;
  private GridView d;
  private e e;
  private StatefulButton f;
  private int g;
  private int h;
  private List<String> i = new ArrayList();
  private int j = -1;
  private x k = new x(this, 0);

  protected abstract CharSequence a();

  protected final void a(int paramInt1, int paramInt2)
  {
    Intent localIntent = new Intent(getActivity(), ImageChooserActivity.class);
    localIntent.putExtra("max_count", paramInt1);
    localIntent.putExtra("default_tab_pos", paramInt2);
    startActivityForResult(localIntent, 1);
  }

  protected final void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
      setTitle(paramString);
  }

  protected abstract CharSequence b();

  protected abstract y c();

  protected abstract void d();

  protected int e()
  {
    return 1000;
  }

  protected int f()
  {
    return 9;
  }

  protected void g()
  {
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.i.add("");
    this.f.setState(new com.wandoujia.p4.button.a.a(String.valueOf(b()), this.k));
    setTitle(a().toString());
    this.g = e();
    this.h = f();
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    default:
    case 1:
    case 2:
    }
    label256: 
    do
    {
      ArrayList localArrayList;
      do
      {
        return;
        if ((paramInt2 != -1) || (paramIntent == null))
        {
          g();
          return;
        }
        localArrayList = paramIntent.getStringArrayListExtra("path_list");
      }
      while (localArrayList == null);
      if ((this.j >= 0) && (localArrayList.size() == 1))
      {
        this.i.set(this.j, localArrayList.get(0));
        this.j = -1;
        if (this.i.isEmpty())
          break label256;
        this.b.setHint(2131624493);
      }
      while (true)
      {
        this.e.a(this.i);
        return;
        int m = this.i.size();
        if (m + localArrayList.size() > this.h)
        {
          String str = (String)this.i.get(m - 1);
          if (TextUtils.isEmpty(str))
            this.i.remove(str);
          this.i.addAll(m - 1, localArrayList);
          break;
        }
        List localList = this.i;
        int n = m - 1;
        int i1 = 0;
        if (n >= 0)
          i1 = m - 1;
        localList.addAll(i1, localArrayList);
        break;
        g();
      }
    }
    while ((com.wandoujia.account.a.m()) || (this.k == null));
    this.k.execute();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    d();
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = paramLayoutInflater.inflate(2130903490, null);
    this.c = ((TextView)this.a.findViewById(2131492997));
    this.b = ((EditText)this.a.findViewById(2131493913));
    this.f = ((StatefulButton)this.a.findViewById(2131493912));
    this.b.addTextChangedListener(new v(this));
    this.d = ((GridView)this.a.findViewById(2131493914));
    this.e = new e(getActivity(), this.i, this.d);
    this.d.setAdapter(this.e);
    this.d.setOnItemClickListener(new w(this));
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.fragmant.CommunityPostContentFragment
 * JD-Core Version:    0.6.0
 */