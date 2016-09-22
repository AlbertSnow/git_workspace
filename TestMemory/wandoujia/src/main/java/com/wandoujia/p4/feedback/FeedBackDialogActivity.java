package com.wandoujia.p4.feedback;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.b;
import android.support.v4.view.af;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.activity.BaseToolBarActivity;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.p4.feedback.zendesk.ZendeskModels.Audits;
import com.wandoujia.p4.feedback.zendesk.ZendeskModels.AuditsBundle;
import java.util.List;

public class FeedBackDialogActivity extends BaseToolBarActivity
{
  private List<ZendeskModels.Audits> a;
  private EditText b;
  private ListView c;
  private boolean d;

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903069);
    setTitle(2131624742);
    Bundle localBundle = getIntent().getBundleExtra("comments");
    if (localBundle != null)
    {
      this.a = ((ZendeskModels.AuditsBundle)localBundle.get("comments")).getAudits();
      this.d = ((ZendeskModels.AuditsBundle)localBundle.get("comments")).isClosed();
    }
    if ((this.a != null) && (!this.a.isEmpty()))
    {
      if (Config.d(((ZendeskModels.Audits)this.a.get(0)).getTicket_id()) < this.a.size())
      {
        Config.a(((ZendeskModels.Audits)this.a.get(0)).getTicket_id(), this.a.size());
        com.wandoujia.p4.feedback.zendesk.a.a().c();
      }
      l locall = new l(this.a);
      this.c = ((ListView)findViewById(2131493182));
      this.c.setAdapter(locall);
      this.b = ((EditText)findViewById(2131493180));
      getWindow().setSoftInputMode(3);
      Button localButton = (Button)findViewById(2131493181);
      if (this.d)
        ((RelativeLayout)findViewById(2131493179)).setVisibility(8);
      localButton.setOnClickListener(new a(this));
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    int i = com.wandoujia.p4.feedback.zendesk.a.a().b();
    if (i > 0)
    {
      BitmapDrawable localBitmapDrawable = new BitmapDrawable(getResources(), b.c(this, i));
      af.a(paramMenu.add(getString(2131624760)).setIcon(localBitmapDrawable), 1);
      return true;
    }
    af.a(paramMenu.add(0, 2131492932, 0, getString(2131624760)).setIcon(2130838053), 1);
    return true;
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131492932)
    {
      startActivity(new Intent(this, FeedbackListActivity.class));
      return true;
    }
    if (getString(2131624742).equals(paramMenuItem.getTitle()))
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
    if (SystemUtil.aboveApiLevel(11))
      invalidateOptionsMenu();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.feedback.FeedBackDialogActivity
 * JD-Core Version:    0.6.0
 */