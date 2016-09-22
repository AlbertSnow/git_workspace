package com.wandoujia.jupiter.onboard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ac;
import android.support.v4.app.q;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.wandoujia.api.proto.Action;
import com.wandoujia.api.proto.HttpResponse;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.multidex.MultiDex;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.a.b;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.fragment.BaseListFragment;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.List;

public class OnboardActivity extends BaseActivity
  implements l, o
{
  public List<Model> a;
  private int b = 0;
  private ArrayList<Model> c;
  private b d;
  private boolean e = false;

  public static boolean a(Context paramContext, Intent paramIntent)
  {
    if (!Config.M());
    while (true)
    {
      return false;
      if ((!NetworkUtil.isNetworkConnected()) || (Config.S()))
        continue;
      if ((paramIntent == null) || (paramIntent.getData() == null));
      for (int i = 1; i != 0; i = 0)
      {
        Config.L();
        paramContext.startActivity(new Intent(paramContext, OnboardActivity.class));
        return true;
      }
    }
  }

  public final void a()
  {
    if (this.e)
      return;
    this.b = (1 + this.b);
    if ((CollectionUtils.isEmpty(this.c)) || (this.c.size() <= this.b))
    {
      finish();
      return;
    }
    Model localModel = (Model)this.c.get(this.b);
    int j;
    OnboardFragmentCreator.OnboardFragment localOnboardFragment;
    String str;
    if ((localModel.t() != null) && (!TextUtils.isEmpty(localModel.t().intent)))
    {
      OnboardFragmentCreator.OnboardFragment[] arrayOfOnboardFragment = OnboardFragmentCreator.OnboardFragment.values();
      int i = arrayOfOnboardFragment.length;
      j = 0;
      if (j < i)
      {
        localOnboardFragment = arrayOfOnboardFragment[j];
        if (OnboardFragmentCreator.OnboardFragment.access$000(localOnboardFragment).equals(localModel.t().intent))
          if (TextUtils.isEmpty(localModel.t().url))
            str = OnboardFragmentCreator.OnboardFragment.access$100(localOnboardFragment);
      }
    }
    label147: for (Fragment localFragment = Fragment.instantiate(JupiterApplication.e(), OnboardFragmentCreator.OnboardFragment.access$200(localOnboardFragment).getName(), BaseListFragment.b(localModel.t().intent, str)); ; localFragment = null)
    {
      if (localFragment != null)
        break label206;
      finish();
      return;
      str = localModel.t().url;
      break label147;
      j++;
      break;
    }
    try
    {
      label206: getSupportFragmentManager().a().b(16908290, localFragment).b();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final boolean b()
  {
    return (CollectionUtils.isEmpty(this.c)) || (this.c.size() <= 1 + this.b);
  }

  public final void c()
  {
    StoryFragment localStoryFragment;
    if (this.e)
    {
      localStoryFragment = new StoryFragment();
      Bundle localBundle = new Bundle();
      localBundle.putParcelableArrayList("model_keys", this.c);
      localStoryFragment.setArguments(localBundle);
    }
    try
    {
      getSupportFragmentManager().a().b(16908290, localStoryFragment).b();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    overridePendingTransition(2130968605, 2130968605);
    if (!MultiDex.IS_VM_MULTIDEX_CAPABLE)
    {
      setContentView(2130903338);
      findViewById(2131493722).setVisibility(8);
      findViewById(2131492997).setVisibility(8);
    }
    this.d = new b("http://startpage.wandoujia.com/five/v1/nux/index", null, HttpResponse.class, new j(this), new k(this), 0);
    this.d.a(false);
    this.d.b(false);
    this.d.u();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return (paramInt == 4) || (super.onKeyDown(paramInt, paramKeyEvent));
  }

  protected void onStop()
  {
    super.onStop();
    if (this.d != null)
      this.d.f();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.onboard.OnboardActivity
 * JD-Core Version:    0.6.0
 */