package com.wandoujia.p4.community.utils;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.p4.utils.c;
import com.wandoujia.p4.views.FlowLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class k
{
  private Context a;
  private List<TextView> b;
  private View c;
  private Set<String> d;
  private com.wandoujia.p4.adapter.m e;
  private String[] f;
  private m g;

  public k(Context paramContext)
  {
    this.a = paramContext;
    this.d = new HashSet();
  }

  private void a(TextView paramTextView)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
      ((TextView)localIterator.next()).setSelected(false);
    paramTextView.setSelected(true);
  }

  public final void a(com.wandoujia.p4.adapter.m paramm, String[] paramArrayOfString)
  {
    if ((paramm == null) || (paramArrayOfString == null) || (paramArrayOfString.length == 0))
      return;
    this.e = paramm;
    this.f = paramArrayOfString;
    if (this.c == null)
      this.c = c.a(this.a, 2130903488);
    FlowLayout localFlowLayout = (FlowLayout)this.c.findViewById(2131493909);
    this.b = new ArrayList();
    localFlowLayout.removeAllViews();
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      String str = paramArrayOfString[i];
      TextView localTextView = (TextView)c.a(localFlowLayout, 2130903190);
      localTextView.setText(str);
      localTextView.setOnClickListener(new l(this, i, localTextView));
      if (this.d.contains(str))
        continue;
      localFlowLayout.addView(localTextView);
      this.b.add(localTextView);
    }
    paramm.a(0, this.c);
    a((TextView)this.b.get(0));
  }

  public final void a(m paramm)
  {
    this.g = paramm;
  }

  public final void a(String paramString)
  {
    this.d.add(paramString);
    a(this.e, this.f);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.utils.k
 * JD-Core Version:    0.6.0
 */