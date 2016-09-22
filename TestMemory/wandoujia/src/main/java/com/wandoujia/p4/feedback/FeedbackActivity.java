package com.wandoujia.p4.feedback;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.b;
import android.support.v4.view.af;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.base.utils.TextUtil;
import com.wandoujia.p4.feedback.zendesk.ZendeskModels.TicketCategoryItem;
import com.wandoujia.ripple_framework.activity.BaseActivity;
import com.wandoujia.ripple_framework.log.Logger;
import java.util.HashMap;
import java.util.List;

public class FeedbackActivity extends BaseActivity
{
  private Toolbar a;
  private View b;
  private FeedbackCategorySpinner c;
  private Button d;
  private EditText e;
  private EditText f;
  private ImageView g;
  private List<ZendeskModels.TicketCategoryItem> h;
  private List<ZendeskModels.TicketCategoryItem> i;
  private String j;
  private List<List<String>> k;
  private Menu l;
  private HashMap<String, String> m;
  private com.wandoujia.p4.feedback.zendesk.k n = new k(this, 0);

  private void a(int paramInt)
  {
    if ((this.l != null) && (this.l.getItem(1) != null))
    {
      if (paramInt > 0)
        this.l.getItem(1).setIcon(new BitmapDrawable(getResources(), b.c(this, paramInt)));
    }
    else
      return;
    this.l.getItem(1).setIcon(2130838053);
  }

  public static void a(Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, FeedbackActivity.class);
    if (!(paramContext instanceof Activity))
      localIntent.setFlags(268435456);
    paramContext.startActivity(localIntent);
  }

  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    Intent localIntent = new Intent(paramContext, FeedbackActivity.class);
    if (!(paramContext instanceof Activity))
      localIntent.setFlags(268435456);
    localIntent.setAction("ACTION_FEEDBACK_SEARCH");
    localIntent.putExtra("PARAM_DATA_TYPE", paramString1);
    localIntent.putExtra("PARAM_DATA_NAME", paramString2);
    paramContext.startActivity(localIntent);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903068);
    findViewById(2131493000);
    this.a = ((Toolbar)findViewById(2131492999));
    findViewById(2131493001);
    this.b = findViewById(2131493002);
    if (this.a != null)
    {
      this.a.setTitle(2131624742);
      this.a.setNavigationIcon(2130838122);
      this.a.setBackgroundColor(Color.parseColor("#24aa42"));
      this.a.setTitleTextColor(Color.parseColor("#ffffffff"));
      this.a.setNavigationOnClickListener(new c(this));
      if ((SystemUtil.aboveApiLevel(19)) && (this.b != null))
        this.b.setVisibility(0);
    }
    this.c = ((FeedbackCategorySpinner)findViewById(2131493175));
    this.c.setOnChildClickListener(new j(this));
    this.d = ((Button)findViewById(2131493178));
    this.e = ((EditText)findViewById(2131493177));
    this.f = ((EditText)findViewById(2131493176));
    this.f.setOnFocusChangeListener(new d(this));
    this.d.setOnClickListener(new e(this));
    b.a(new g(this), new Void[0]);
    String str = com.wandoujia.account.a.j();
    if (TextUtil.checkEmail(str))
      this.f.append(str);
    com.wandoujia.p4.feedback.zendesk.a.a().a(this.n);
    com.wandoujia.p4.feedback.zendesk.a.a().e();
    setTitle(2131624734);
    com.wandoujia.ripple_framework.i.k().h().a(this, "wdj://feedback").a(this);
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    View localView = com.wandoujia.p4.utils.c.a(this, 2130903082);
    ((ImageButton)localView.findViewById(2131493205)).setOnClickListener(new i(this));
    if (SystemUtil.aboveApiLevel(11))
      af.a(paramMenu.add(getString(2131625172)).setActionView(localView), 1);
    int i1 = com.wandoujia.p4.feedback.zendesk.a.a().b();
    if (i1 > 0)
    {
      BitmapDrawable localBitmapDrawable = new BitmapDrawable(getResources(), b.c(this, i1));
      af.a(paramMenu.add(getString(2131624760)).setIcon(localBitmapDrawable), 1);
    }
    while (true)
    {
      this.l = paramMenu;
      return true;
      af.a(paramMenu.add(0, 2131492932, 0, getString(2131624760)).setIcon(2130838053), 1);
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131492932)
    {
      startActivity(new Intent(this, FeedbackListActivity.class));
      return true;
    }
    if (getString(2131624296).equals(paramMenuItem.getTitle()))
    {
      finish();
      return true;
    }
    if (paramMenuItem.getItemId() == 16908332)
    {
      onBackPressed();
      return true;
    }
    return false;
  }

  protected void onResume()
  {
    super.onResume();
    a(com.wandoujia.p4.feedback.zendesk.a.a().b());
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    View localView = getLayoutInflater().inflate(2130903088, null);
    localView.setVisibility(8);
    this.g = ((ImageView)localView.findViewById(2131493234));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.FeedbackActivity
 * JD-Core Version:    0.6.0
 */