package com.wandoujia.p4.feedback;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.activity.BaseToolBarActivity;
import com.wandoujia.p4.feedback.zendesk.ZendeskModels.AuditsBundle;
import com.wandoujia.p4.tips.TipsType;
import com.wandoujia.p4.tips.a;
import java.util.List;

public class FeedbackListActivity extends BaseToolBarActivity
{
  private Toolbar a;
  private View b;
  private ListView c;
  private List<ZendeskModels.AuditsBundle> d;
  private z e;
  private LinearLayout f;

  protected final void c()
  {
    findViewById(2131493000);
    this.a = ((Toolbar)findViewById(2131492999));
    findViewById(2131493001);
    this.b = findViewById(2131493002);
    if (this.a == null);
    do
    {
      return;
      this.a.setTitle(2131624742);
      this.a.setNavigationIcon(2130838122);
      this.a.setBackgroundColor(Color.parseColor("#24aa42"));
      this.a.setTitleTextColor(Color.parseColor("#ffffffff"));
      this.a.setNavigationOnClickListener(new y(this));
    }
    while ((!SystemUtil.aboveApiLevel(19)) || (this.b == null));
    this.b.setVisibility(0);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903071);
    c();
    FrameLayout localFrameLayout = (FrameLayout)findViewById(2131493186);
    localFrameLayout.setVisibility(0);
    this.f = ((LinearLayout)LayoutInflater.from(this).inflate(2130903105, null, false));
    localFrameLayout.addView(this.f, new LinearLayout.LayoutParams(-1, -1));
    ((RelativeLayout)findViewById(2131493187)).setOnClickListener(new x(this));
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 16908332)
    {
      onBackPressed();
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }

  protected void onResume()
  {
    super.onResume();
    if (this.c != null)
      this.c.setVisibility(8);
    if (!NetworkUtil.isNetworkConnected(this))
    {
      a.a(this.f, TipsType.NO_NETWORK);
      return;
    }
    LinearLayout localLinearLayout = this.f;
    TipsType[] arrayOfTipsType = new TipsType[1];
    arrayOfTipsType[0] = TipsType.NO_NETWORK;
    a.a(localLinearLayout, arrayOfTipsType);
    if (this.e != null)
      this.e.cancel(true);
    this.e = new z(this, 0);
    this.e.execute(new Void[0]);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.FeedbackListActivity
 * JD-Core Version:    0.6.0
 */