package com.wandoujia.p4.community.http.c;

import android.app.Activity;
import android.app.ProgressDialog;
import android.text.TextUtils;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.base.utils.ThreadPool.Priority;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class a
{
  final Activity a;
  final int b;
  final int c;
  ProgressDialog d;
  f e;
  Map<String, String> f = new HashMap();
  protected final String g;
  protected List<String> h;
  private com.wandoujia.p4.community.http.e.a i;
  private final com.wandoujia.p4.community.http.e.b j = new b(this);

  public a(Activity paramActivity, String paramString, int paramInt1, int paramInt2)
  {
    this.a = paramActivity;
    this.g = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
  }

  private void c()
  {
    ThreadPool.execute(new g(this, 0), ThreadPool.Priority.NORMAL);
  }

  protected final String a()
  {
    if ((this.h == null) || (this.h.isEmpty()))
      return null;
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.h.iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = (String)this.f.get(str1);
      if (TextUtils.isEmpty(str2))
        continue;
      if (localStringBuilder.length() == 0)
      {
        localStringBuilder.append(str2);
        continue;
      }
      localStringBuilder.append(",").append(str2);
    }
    return localStringBuilder.toString();
  }

  public final void a(f paramf)
  {
    this.e = paramf;
    this.d = ProgressDialog.show(this.a, this.a.getString(2131625498), this.a.getString(2131624532));
    if ((this.h == null) || (this.h.isEmpty()))
    {
      c();
      return;
    }
    this.i = new com.wandoujia.p4.community.http.e.a(this.j);
    Iterator localIterator = this.h.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (TextUtils.isEmpty(str))
        continue;
      this.i.a(str);
    }
    this.i.start();
  }

  protected final void a(String paramString)
  {
    if (this.i != null)
      this.i = null;
    if ((this.a == null) || (this.a.isFinishing()))
      return;
    this.a.runOnUiThread(new d(this, paramString));
  }

  protected final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.i != null)
      this.i = null;
    if ((this.a == null) || (this.a.isFinishing()))
      return;
    this.a.runOnUiThread(new e(this, paramBoolean1, paramBoolean2));
  }

  protected abstract void b();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.c.a
 * JD-Core Version:    0.6.0
 */