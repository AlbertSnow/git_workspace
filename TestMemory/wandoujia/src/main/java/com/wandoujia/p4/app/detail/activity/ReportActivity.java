package com.wandoujia.p4.app.detail.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import com.wandoujia.jupiter.activity.BaseToolBarActivity;
import java.util.ArrayList;
import java.util.List;

public class ReportActivity extends BaseToolBarActivity
{
  private GridView a;
  private EditText b;
  private Button c;
  private ReportActivity.ReportInfo d;
  private List<g> e = new ArrayList();

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903482);
    setTitle(getString(2131624267));
    Intent localIntent = getIntent();
    if (localIntent != null)
      this.d = ((ReportActivity.ReportInfo)localIntent.getSerializableExtra("report_info"));
    this.a = ((GridView)findViewById(2131493907));
    this.b = ((EditText)findViewById(2131493908));
    this.c = ((Button)findViewById(2131493465));
    this.c.setOnClickListener(new f(this));
    this.e.add(new g(1, getString(2131624260)));
    this.e.add(new g(2, getString(2131624254)));
    this.e.add(new g(3, getString(2131624259)));
    this.e.add(new g(4, getString(2131624253)));
    this.e.add(new g(5, getString(2131624263)));
    this.e.add(new g(6, getString(2131624252)));
    this.e.add(new g(7, getString(2131624258)));
    this.e.add(new g(8, getString(2131624255)));
    this.e.add(new g(0, getString(2131624257)));
    h localh = new h(this, 0);
    localh.a(this.e);
    this.a.setAdapter(localh);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.activity.ReportActivity
 * JD-Core Version:    0.6.0
 */