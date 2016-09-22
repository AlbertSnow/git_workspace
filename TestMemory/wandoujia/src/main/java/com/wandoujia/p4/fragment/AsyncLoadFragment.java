package com.wandoujia.p4.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.base.log.Log;
import com.wandoujia.ripple_framework.fragment.BaseFragment;

public abstract class AsyncLoadFragment extends BaseFragment
{
  private static final String TAG = "AsyncLoadFragment";
  private boolean allowLoading = true;
  private View contentView;
  protected boolean isInflated;
  private boolean pendingToLoad = false;

  public View getContentView()
  {
    return this.contentView;
  }

  protected abstract int getLayoutResId();

  protected boolean needToLoadData()
  {
    return this.isInflated;
  }

  public final void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    Log.i("AsyncLoadFragment", this + "onActivityCreated", new Object[0]);
    if (this.contentView != null)
    {
      onInflated(this.contentView, paramBundle);
      this.isInflated = true;
    }
    if (!needToLoadData())
      return;
    onPrepareLoading();
    this.contentView.post(new a(this));
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (this.contentView == null)
      this.contentView = paramLayoutInflater.inflate(getLayoutResId(), paramViewGroup, false);
    while (true)
    {
      return this.contentView;
      ViewGroup localViewGroup = (ViewGroup)this.contentView.getParent();
      if (localViewGroup == null)
        continue;
      localViewGroup.removeView(this.contentView);
    }
  }

  protected abstract void onInflated(View paramView, Bundle paramBundle);

  protected abstract void onPrepareLoading();

  protected abstract void onStartLoading();

  protected final void requestLoad()
  {
    Log.i("AsyncLoadFragment", this + "requestLoad", new Object[0]);
    if (!needToLoadData())
      return;
    onPrepareLoading();
    if (this.allowLoading)
    {
      onStartLoading();
      return;
    }
    this.pendingToLoad = true;
  }

  final void setAllowLoading(boolean paramBoolean)
  {
    this.allowLoading = paramBoolean;
    if ((paramBoolean) && (this.pendingToLoad))
    {
      this.pendingToLoad = false;
      requestLoad();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.fragment.AsyncLoadFragment
 * JD-Core Version:    0.6.0
 */