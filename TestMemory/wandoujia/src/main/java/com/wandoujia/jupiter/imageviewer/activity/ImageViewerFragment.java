package com.wandoujia.jupiter.imageviewer.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.imageviewer.views.GalleryViewPager;
import com.wandoujia.ripple_framework.fragment.BaseFragment;
import java.io.File;
import java.util.ArrayList;

public class ImageViewerFragment extends BaseFragment
{
  private GalleryViewPager a;
  private com.wandoujia.jupiter.imageviewer.a.a b;
  private TextView c;
  private ArrayList<String> d;
  private int e;
  private String f;
  private c g;

  private void a()
  {
    if ((this.a == null) || (this.b == null))
      return;
    this.c.setText(1 + this.a.getCurrentItem() + "/" + this.b.a());
  }

  protected boolean initializePageUri(View paramView)
  {
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getArguments();
    if (localBundle != null)
    {
      this.d = localBundle.getStringArrayList("image_paths");
      this.e = localBundle.getInt("default_position");
      this.f = localBundle.getString("save_directory");
    }
    if ((this.d == null) || (this.d.isEmpty()))
      getActivity().finish();
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903497, paramViewGroup, false);
    this.c = ((TextView)localView.findViewById(2131493693));
    this.a = ((GalleryViewPager)localView.findViewById(2131493933));
    this.a.setOffscreenPageLimit(3);
    this.a.setOnPageChangeListener(new b(this));
    this.b = new com.wandoujia.jupiter.imageviewer.a.a(getActivity(), this.d);
    this.a.setAdapter(this.b);
    this.a.setPageTransformer$382b7817(new com.wandoujia.jupiter.imageviewer.b.a());
    this.a.setCurrentItem(this.e);
    if (!SystemUtil.aboveApiLevel(19))
      ((RelativeLayout.LayoutParams)this.c.getLayoutParams()).topMargin = 0;
    return localView;
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    a();
    if (TextUtils.isEmpty(this.f));
    File localFile;
    do
    {
      return;
      localFile = new File(this.f);
    }
    while ((!localFile.exists()) && (!localFile.mkdirs()));
    if (localFile.isDirectory())
    {
      paramView.findViewById(2131493932).setOnClickListener(new a(this));
      return;
    }
    paramView.findViewById(2131493932).setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.imageviewer.activity.ImageViewerFragment
 * JD-Core Version:    0.6.0
 */