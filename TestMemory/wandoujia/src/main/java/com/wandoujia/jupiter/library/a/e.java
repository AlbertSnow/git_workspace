package com.wandoujia.jupiter.library.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.p4.utils.c;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.view.a.h;
import com.wandoujia.ripple_framework.view.ba;
import com.wandoujia.rootkit.b;
import java.util.ArrayList;
import java.util.List;

public final class e extends ba
{
  private List<String> b = new ArrayList();
  private boolean c = false;
  private String d;
  private String e;

  public e(View paramView)
  {
    super(paramView);
  }

  public final void a(String paramString)
  {
    this.d = paramString;
  }

  public final void a(List<String> paramList)
  {
    this.b.addAll(paramList);
  }

  public final void b(String paramString)
  {
    this.e = paramString;
  }

  public final int getCount()
  {
    return this.b.size();
  }

  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject;
    if (paramInt == 0)
    {
      localObject = c.a(paramViewGroup, 2130903322);
      this.c = true;
      return localObject;
    }
    View localView = c.a(paramViewGroup, 2130903321);
    TextView localTextView = (TextView)localView.findViewById(2131493602);
    if ((paramInt >= 0) && (paramInt < this.b.size()));
    for (String str = (String)this.b.get(paramInt); ; str = "")
    {
      localTextView.setText(str);
      localObject = localView;
      break;
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView == null) || (!paramView.getTag().toString().equals("NON_DROPDOWN")))
    {
      paramView = c.a(paramViewGroup, 2130903320);
      paramView.setTag("NON_DROPDOWN");
    }
    if (this.c)
      this.c = false;
    switch (paramInt)
    {
    default:
      return paramView;
    case 1:
      i.k().a("app");
      AppManager.b(this.d);
      a(Logger.Module.APPS, ViewLogPackage.Action.OPEN, this.d);
      return paramView;
    case 2:
      if (b.a().c())
      {
        h localh = new h(paramView.getContext());
        Context localContext = paramView.getContext();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.e;
        localh.a(localContext.getString(2131625533, arrayOfObject));
        localh.a(2131625532, new f(this));
        localh.b(2131624330, null);
        localh.b();
        return paramView;
      }
      ((AppTaskManager)i.k().a("app_task")).b(this.d);
      a(Logger.Module.APPS, ViewLogPackage.Action.UNINSTALL, this.d);
      return paramView;
    case 3:
    }
    ((AppManager)i.k().a("app")).e(this.d);
    a(Logger.Module.APPS, ViewLogPackage.Action.RESUME_UPGRADE, this.d);
    return paramView;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.a.e
 * JD-Core Version:    0.6.0
 */