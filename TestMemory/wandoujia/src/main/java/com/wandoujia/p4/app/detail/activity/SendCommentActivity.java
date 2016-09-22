package com.wandoujia.p4.app.detail.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.wandoujia.account.a;
import com.wandoujia.p4.app.detail.model.CommentJson;
import com.wandoujia.p4.app.detail.model.CommentSummary;
import com.wandoujia.p4.views.CircleAsyncImageView;
import com.wandoujia.ripple_framework.activity.BaseActivity;

public class SendCommentActivity extends BaseActivity
{
  private CircleAsyncImageView a;
  private EditText b;
  private TextView c;
  private TextView d;
  private ImageView e;
  private TextView f;
  private Boolean g = null;
  private CommentSummary h;
  private String i;
  private long j;
  private TextWatcher k;

  public SendCommentActivity()
  {
    new k(this);
    this.k = new l(this);
  }

  private void a(boolean paramBoolean)
  {
    int m = 2130837848;
    this.g = Boolean.valueOf(paramBoolean);
    ImageView localImageView = this.e;
    int n;
    int i1;
    label43: int i2;
    label67: int i3;
    label95: int i4;
    label116: TextView localTextView6;
    if (paramBoolean)
    {
      n = 0;
      localImageView.setVisibility(n);
      TextView localTextView1 = this.c;
      if (!paramBoolean)
        break label177;
      i1 = 2130838263;
      localTextView1.setCompoundDrawablesWithIntrinsicBounds(i1, 0, 0, 0);
      TextView localTextView2 = this.c;
      if (!paramBoolean)
        break label184;
      i2 = 2130837847;
      localTextView2.setBackgroundResource(i2);
      TextView localTextView3 = this.c;
      if (!paramBoolean)
        break label190;
      i3 = getResources().getColor(2131362219);
      localTextView3.setTextColor(i3);
      TextView localTextView4 = this.d;
      if (!paramBoolean)
        break label204;
      i4 = 2130838151;
      localTextView4.setCompoundDrawablesWithIntrinsicBounds(i4, 0, 0, 0);
      TextView localTextView5 = this.d;
      if (!paramBoolean)
        break label211;
      label136: localTextView5.setBackgroundResource(m);
      localTextView6 = this.d;
      if (!paramBoolean)
        break label217;
    }
    label177: label184: label190: label204: label211: label217: for (int i5 = getResources().getColor(2131362166); ; i5 = getResources().getColor(2131362219))
    {
      localTextView6.setTextColor(i5);
      return;
      n = 4;
      break;
      i1 = 2130838261;
      break label43;
      i2 = m;
      break label67;
      i3 = getResources().getColor(2131362166);
      break label95;
      i4 = 2130838153;
      break label116;
      m = 2130837846;
      break label136;
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903501);
    this.a = ((CircleAsyncImageView)findViewById(2131493936));
    this.b = ((EditText)findViewById(2131493616));
    this.c = ((TextView)findViewById(2131493613));
    this.d = ((TextView)findViewById(2131493615));
    this.e = ((ImageView)findViewById(2131493937));
    this.f = ((TextView)findViewById(2131492997));
    this.c.setOnClickListener(new m(this));
    this.d.setOnClickListener(new n(this));
    this.b.addTextChangedListener(this.k);
    Intent localIntent = getIntent();
    if (localIntent != null)
    {
      this.h = ((CommentSummary)localIntent.getSerializableExtra("KEY_OLD_COMMENT"));
      if ((this.h != null) && (!TextUtils.isEmpty(this.h.getSavedComment().getContent())) && (!TextUtils.isEmpty(this.h.getSavedComment().getAuthorId())))
      {
        this.b.setText(this.h.getSavedComment().getContent());
        this.b.setSelection(this.h.getSavedComment().getContent().length());
        if (this.h.getSavedComment().getEnjoy() != null)
          a(this.h.getSavedComment().getEnjoy().booleanValue());
      }
      this.i = localIntent.getStringExtra("KEY_PACKAGE_NAME");
      this.j = localIntent.getLongExtra("KEY_VERSION_CODE", 0L);
      if (localIntent.getBooleanExtra("KEY_HAS_SET_LIKE_STATE", false))
        a(localIntent.getBooleanExtra("KEY_LIKE_STATE", false));
    }
    String str = a.k();
    if (!TextUtils.isEmpty(str))
      this.a.a(str, 2130838109);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.detail.activity.SendCommentActivity
 * JD-Core Version:    0.6.0
 */