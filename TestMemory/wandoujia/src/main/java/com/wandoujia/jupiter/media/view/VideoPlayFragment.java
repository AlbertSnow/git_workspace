package com.wandoujia.jupiter.media.view;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wandoujia.jupiter.media.controller.h;
import com.wandoujia.ripple_framework.fragment.BaseFragment;

public class VideoPlayFragment extends BaseFragment
{
  private VideoSurfaceView a;
  private h b;

  public static VideoPlayFragment a(String paramString)
  {
    VideoPlayFragment localVideoPlayFragment = new VideoPlayFragment();
    Bundle localBundle = new Bundle();
    localBundle.putString("videoUrl", paramString);
    localVideoPlayFragment.setArguments(localBundle);
    return localVideoPlayFragment;
  }

  protected void finish()
  {
    if (!isAdded())
      return;
    getActivity().finish();
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (getArguments() == null)
    {
      getActivity().finish();
      return;
    }
    this.b = new a(this, this.a);
    this.b.a();
    String str = getArguments().getString("videoUrl");
    this.a.i();
    this.a.a();
    this.a.setUrl(str);
    this.a.h();
    if (this.b != null)
      this.b.h();
    this.a.findViewById(2131492885).setOnClickListener(new b(this));
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = ((VideoSurfaceView)paramLayoutInflater.inflate(2130903592, paramViewGroup, false));
    return this.a;
  }

  public void onPause()
  {
    super.onPause();
    this.a.d();
  }

  public void onResume()
  {
    super.onResume();
    this.a.e();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.view.VideoPlayFragment
 * JD-Core Version:    0.6.0
 */