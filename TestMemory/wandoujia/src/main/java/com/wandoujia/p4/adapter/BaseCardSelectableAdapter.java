package com.wandoujia.p4.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.wandoujia.base.log.Log;
import com.wandoujia.mvc.BaseController;
import com.wandoujia.mvc.BaseModel;
import com.wandoujia.mvc.BaseView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class BaseCardSelectableAdapter<M extends BaseModel> extends BaseAdapter
{
  protected final Context a;
  private View b;
  private ViewGroup c;
  private final Set<Long> d;
  private List<M> e;

  protected BaseCardSelectableAdapter(Context paramContext)
  {
    this.a = paramContext;
    this.d = new HashSet();
    if ((paramContext instanceof Activity))
      this.c = ((ViewGroup)((Activity)paramContext).findViewById(16908290));
  }

  private void d(long paramLong)
  {
    if (this.d.contains(Long.valueOf(paramLong)))
      if (this.d.contains(Long.valueOf(paramLong)))
      {
        this.d.remove(Long.valueOf(paramLong));
        if (!this.d.isEmpty())
          break label75;
        a();
        m();
        notifyDataSetChanged();
      }
    while (true)
    {
      notifyDataSetChanged();
      return;
      label75: notifyDataSetChanged();
      break;
      if (this.d.contains(Long.valueOf(paramLong)))
        continue;
      this.d.add(Long.valueOf(paramLong));
      m();
      notifyDataSetChanged();
    }
  }

  private void m()
  {
    if (this.b != null)
    {
      if (this.d.size() != this.e.size())
        break label98;
      ((TextView)this.b.findViewById(2131493699)).setText(2131625013);
    }
    while (true)
    {
      TextView localTextView = (TextView)this.b.findViewById(2131493698);
      String str = this.a.getString(2131625011);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.d.size());
      localTextView.setText(String.format(str, arrayOfObject));
      return;
      label98: ((TextView)this.b.findViewById(2131493699)).setText(2131625009);
    }
  }

  private boolean n()
  {
    return this.b != null;
  }

  public final M a(int paramInt)
  {
    return (BaseModel)this.e.get(paramInt);
  }

  protected abstract BaseView a(ViewGroup paramViewGroup);

  public final void a()
  {
    if ((this.c != null) && (this.b != null))
    {
      this.c.removeView(this.b);
      this.b = null;
    }
  }

  protected void a(long paramLong)
  {
    d(paramLong);
  }

  public final void a(List<M> paramList)
  {
    this.e = paramList;
    notifyDataSetChanged();
    if ((paramList == null) || (paramList.isEmpty()))
    {
      Log.d("BaseCardAdapter", "set data : list is null or empty", new Object[0]);
      return;
    }
    Log.d("BaseCardAdapter", "set data : model class is " + ((BaseModel)paramList.get(0)).getClass().getSimpleName(), new Object[0]);
  }

  public final List<M> b()
  {
    return this.e;
  }

  protected void b(long paramLong)
  {
    if (n())
      d(paramLong);
  }

  protected final int c()
  {
    return this.d.size();
  }

  protected final boolean c(long paramLong)
  {
    return this.d.contains(Long.valueOf(paramLong));
  }

  protected final void d()
  {
    for (int i = 0; i < getCount(); i++)
      this.d.add(Long.valueOf(getItemId(i)));
    m();
    notifyDataSetChanged();
  }

  protected final void e()
  {
    this.d.clear();
    m();
    notifyDataSetChanged();
  }

  protected View f()
  {
    FrameLayout localFrameLayout = new FrameLayout(this.a);
    localFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    Drawable localDrawable = this.a.getResources().getDrawable(2130837921);
    if (Build.VERSION.SDK_INT >= 16)
    {
      localFrameLayout.setBackground(localDrawable);
      return localFrameLayout;
    }
    localFrameLayout.setBackgroundDrawable(localDrawable);
    return localFrameLayout;
  }

  protected abstract BaseController g();

  public int getCount()
  {
    if (this.e != null)
      return this.e.size();
    return 0;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView2;
    Object localObject3;
    Object localObject2;
    View localView1;
    Object localObject1;
    if ((paramView instanceof BaseCardSelectableAdapter.ContainerView))
    {
      localView2 = ((BaseCardSelectableAdapter.ContainerView)paramView).getOriginView();
      if (!(localView2 instanceof BaseView))
        break label287;
      BaseView localBaseView2 = (BaseView)localView2;
      BaseController localBaseController2 = (BaseController)localView2.getTag(2131492878);
      localObject3 = localBaseView2;
      localObject2 = localBaseController2;
      localView1 = localView2;
      localObject1 = paramView;
    }
    while (true)
    {
      if ((localObject2 != null) && (localObject3 != null))
        ((BaseController)localObject2).bind((BaseView)localObject3, a(paramInt));
      BaseCardSelectableAdapter.ContainerView.a((BaseCardSelectableAdapter.ContainerView)localObject1, n());
      if (c(getItemId(paramInt)))
        BaseCardSelectableAdapter.ContainerView.a((BaseCardSelectableAdapter.ContainerView)localObject1);
      while (true)
      {
        long l = getItemId(paramInt);
        localView1.setOnLongClickListener(new b(this, l));
        ((View)localObject1).setOnLongClickListener(new c(this, l));
        ((View)localObject1).setOnClickListener(new d(this, l));
        return localObject1;
        localObject1 = new BaseCardSelectableAdapter.ContainerView(this.a, 0);
        a(paramInt);
        BaseView localBaseView1 = a((BaseCardSelectableAdapter.ContainerView)localObject1);
        a(paramInt);
        BaseController localBaseController1 = g();
        localView1 = localBaseView1.getView();
        if (localView1.isLongClickable())
          throw new IllegalStateException("The origin view in SelectableAdapter can't be longClickable.");
        localView1.setTag(2131492878, localBaseController1);
        BaseCardSelectableAdapter.ContainerView.a((BaseCardSelectableAdapter.ContainerView)localObject1, localView1, f());
        localObject2 = localBaseController1;
        localObject3 = localBaseView1;
        break;
        BaseCardSelectableAdapter.ContainerView.b((BaseCardSelectableAdapter.ContainerView)localObject1);
      }
      label287: localView1 = localView2;
      localObject1 = paramView;
      localObject2 = null;
      localObject3 = null;
    }
  }

  protected boolean h()
  {
    return true;
  }

  protected abstract int i();

  protected abstract int j();

  protected abstract void k();

  public final List<M> l()
  {
    if ((this.e == null) || (this.e.isEmpty()))
      return Collections.EMPTY_LIST;
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < getCount(); i++)
    {
      if (!c(getItemId(i)))
        continue;
      localArrayList.add(a(i));
    }
    return localArrayList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.adapter.BaseCardSelectableAdapter
 * JD-Core Version:    0.6.0
 */