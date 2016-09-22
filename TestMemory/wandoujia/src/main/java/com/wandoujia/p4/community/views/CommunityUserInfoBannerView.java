package com.wandoujia.p4.community.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.p4.community.http.model.CommunityUserStatModel;
import com.wandoujia.p4.utils.c;

public class CommunityUserInfoBannerView extends LinearLayout
{
  private View a;
  private View b;
  private View c;

  public CommunityUserInfoBannerView(Context paramContext)
  {
    super(paramContext);
  }

  public CommunityUserInfoBannerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CommunityUserInfoBannerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static CommunityUserInfoBannerView a(Context paramContext)
  {
    return (CommunityUserInfoBannerView)c.a(paramContext, 2130903491);
  }

  public final void a()
  {
    ((AsyncImageView)this.c.findViewById(2131493101)).a(com.wandoujia.account.a.k(), 2130837513);
    ((TextView)this.c.findViewById(2131493494)).setText(com.wandoujia.account.a.l());
    String str1 = com.wandoujia.account.a.q();
    if (TextUtils.isEmpty(str1))
      str1 = com.wandoujia.account.a.r();
    if (TextUtils.isEmpty(str1));
    for (String str2 = ""; ; str2 = str1)
    {
      ((TextView)this.c.findViewById(2131493917)).setText(str2);
      this.c.setOnClickListener(new s(this));
      return;
    }
  }

  public final void a(CommunityUserStatModel paramCommunityUserStatModel)
  {
    a();
    TextView localTextView1 = (TextView)this.b.findViewById(2131493920);
    TextView localTextView2 = (TextView)this.a.findViewById(2131493923);
    if (paramCommunityUserStatModel == null)
    {
      localTextView1.setText(com.wandoujia.p4.a.a().getString(2131624485));
      localTextView2.setText(com.wandoujia.p4.a.a().getString(2131624488));
      return;
    }
    if (paramCommunityUserStatModel.getTopicsCount() != 0)
    {
      Context localContext2 = com.wandoujia.p4.a.a();
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramCommunityUserStatModel.getTopicsCount());
      localTextView1.setText(localContext2.getString(2131624543, arrayOfObject2));
      this.b.setOnClickListener(new q(this));
      if (paramCommunityUserStatModel.getRepliedTopicsCount() == 0)
        break label189;
      Context localContext1 = com.wandoujia.p4.a.a();
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(paramCommunityUserStatModel.getRepliedTopicsCount());
      localTextView2.setText(localContext1.getString(2131624543, arrayOfObject1));
    }
    while (true)
    {
      this.a.setOnClickListener(new r(this));
      return;
      localTextView1.setText(com.wandoujia.p4.a.a().getString(2131624485));
      break;
      label189: localTextView2.setText(com.wandoujia.p4.a.a().getString(2131624488));
    }
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = findViewById(2131493921);
    this.b = findViewById(2131493918);
    this.c = findViewById(2131493915);
    a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.views.CommunityUserInfoBannerView
 * JD-Core Version:    0.6.0
 */