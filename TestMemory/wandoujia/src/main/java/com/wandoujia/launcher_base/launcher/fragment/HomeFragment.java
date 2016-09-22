package com.wandoujia.launcher_base.launcher.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.launcher_base.R.id;
import com.wandoujia.launcher_base.R.layout;
import com.wandoujia.launcher_base.launcher.c.d;
import com.wandoujia.launcher_base.launcher.view.WallpaperView;

public class HomeFragment extends Fragment
{
  protected View a;
  private d b;
  private View c;

  private LinearLayout d()
  {
    View localView = this.a.findViewById(R.id.pager_root);
    if ((localView instanceof LinearLayout))
      return (LinearLayout)localView;
    return null;
  }

  protected void a()
  {
    WallpaperView localWallpaperView = (WallpaperView)this.a.findViewById(R.id.wallpaper);
    localWallpaperView.a();
    localWallpaperView.setOnClickListener(new a(this));
    this.b = new d();
    this.b.a(this.a);
  }

  public final void a(View paramView)
  {
    c();
    LinearLayout localLinearLayout = d();
    if (localLinearLayout != null)
    {
      localLinearLayout.addView(paramView, 1);
      this.c = paramView;
    }
  }

  public final d b()
  {
    return this.b;
  }

  public final void c()
  {
    if (this.c != null)
    {
      LinearLayout localLinearLayout = d();
      if (localLinearLayout != null)
      {
        localLinearLayout.removeView(this.c);
        this.c = null;
      }
    }
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (!SystemUtil.aboveApiLevel(19))
    {
      View localView1 = this.a.findViewById(R.id.navigation_view);
      ViewGroup.LayoutParams localLayoutParams1 = localView1.getLayoutParams();
      localLayoutParams1.height = 1;
      localView1.setLayoutParams(localLayoutParams1);
      View localView2 = this.a.findViewById(R.id.status_bar);
      ViewGroup.LayoutParams localLayoutParams2 = localView2.getLayoutParams();
      localLayoutParams2.height = 1;
      localView2.setLayoutParams(localLayoutParams2);
    }
    a();
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = paramLayoutInflater.inflate(R.layout.launcher_home_fragment, paramViewGroup, false);
    return this.a;
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    if (this.b != null)
      this.b.a();
  }

  public void onStop()
  {
    super.onStop();
    if (this.b != null)
      this.b.b();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.fragment.HomeFragment
 * JD-Core Version:    0.6.0
 */