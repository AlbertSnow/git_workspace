package com.wandoujia.p4.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.log.Log;
import com.wandoujia.mvc.BaseController;
import com.wandoujia.mvc.BaseModel;
import com.wandoujia.mvc.BaseView;
import com.wandoujia.mvc.Unbindable;
import java.util.HashMap;
import java.util.List;

public abstract class a<M extends BaseModel> extends h<M>
{
  private static String b = a.class.getSimpleName();

  public a()
  {
    new HashMap();
  }

  protected abstract BaseController a();

  protected abstract BaseView a(ViewGroup paramViewGroup);

  public final void a(List<M> paramList)
  {
    super.a(paramList);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      Log.d(b, "set data : list is null or empty", new Object[0]);
      return;
    }
    Log.d(b, "set data : model class is " + ((BaseModel)paramList.get(0)).getClass().getSimpleName(), new Object[0]);
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    BaseView localBaseView;
    Object localObject;
    BaseController localBaseController1;
    if ((paramView instanceof BaseView))
    {
      localBaseView = (BaseView)paramView;
      View localView2 = localBaseView.getView();
      BaseController localBaseController2 = (BaseController)localView2.getTag(2131492878);
      localObject = localView2;
      localBaseController1 = localBaseController2;
    }
    while (true)
    {
      if (GlobalConfig.isDebug())
        Log.d(b, "get view position ：" + paramInt + " model : " + ((BaseModel)getItem(paramInt)).getClass() + " controller : " + localBaseController1.getClass(), new Object[0]);
      BaseModel localBaseModel = (BaseModel)getItem(paramInt);
      if ((localBaseController1 instanceof Unbindable))
        ((Unbindable)localBaseController1).unbind();
      localBaseController1.bind(localBaseView, localBaseModel);
      getItem(paramInt);
      return localObject;
      getItem(paramInt);
      localBaseView = a(paramViewGroup);
      if (localBaseView == null)
        return null;
      View localView1 = localBaseView.getView();
      getItem(paramInt);
      localBaseController1 = a();
      localView1.setTag(2131492878, localBaseController1);
      localObject = localView1;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.adapter.a
 * JD-Core Version:    0.6.0
 */