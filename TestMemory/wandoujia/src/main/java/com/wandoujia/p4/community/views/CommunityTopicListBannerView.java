package com.wandoujia.p4.community.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.p4.a;
import com.wandoujia.p4.community.http.model.CommunityGroupModel;
import com.wandoujia.p4.community.http.model.CommunityImageInfo;
import com.wandoujia.phoenix2.av.view.PagePointsBox;

public class CommunityTopicListBannerView extends FrameLayout
{
  private ViewPager a;
  private CommunityTopicBannerImageView b;
  private PagePointsBox c;
  private TextView d;
  private View e;
  private ImageView f;

  public CommunityTopicListBannerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void onFinishInflate()
  {
    this.a = ((ViewPager)findViewById(2131493444));
    this.b = ((CommunityTopicBannerImageView)findViewById(2131493442));
    this.c = ((PagePointsBox)findViewById(2131493130));
    this.d = ((TextView)findViewById(2131492998));
    this.f = ((ImageView)findViewById(2131493443));
    this.e = findViewById(2131493417);
  }

  public void setGroupModel(CommunityGroupModel paramCommunityGroupModel)
  {
    n localn = new n(paramCommunityGroupModel, 0);
    this.b.a(paramCommunityGroupModel.getBanner().url, 2131361864);
    this.a.setAdapter(localn);
    this.a.setOnPageChangeListener(new j(this));
    this.c.a();
    TextView localTextView = this.d;
    String str = a.a().getString(2131624461);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramCommunityGroupModel.getTitle();
    localTextView.setText(String.format(str, arrayOfObject));
    this.d.setOnClickListener(new k(this));
    this.e.setOnClickListener(new l(this));
    this.f.setOnClickListener(new m(this, paramCommunityGroupModel));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.CommunityTopicListBannerView
 * JD-Core Version:    0.6.0
 */