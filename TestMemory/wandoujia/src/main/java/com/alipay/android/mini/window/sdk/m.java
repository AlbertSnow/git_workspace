package com.alipay.android.mini.window.sdk;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v4.app.d;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.alipay.android.mini.widget.CustomEditText;
import com.alipay.android.mini.widget.MiniLabelInput;
import com.alipay.test.ui.core.EventObject;
import com.alipay.wandoujia.bd;
import com.alipay.wandoujia.cv;
import com.alipay.wandoujia.f;
import com.alipay.wandoujia.r;
import com.alipay.wandoujia.ra;
import com.alipay.wandoujia.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class m extends b
{
  private Button c;
  private TextView d;
  private boolean e;
  private String f;
  private com.wandoujia.jupiter.d.a g;
  private com.alipay.android.mini.widget.c h;
  private MiniLabelInput i;
  private Activity j;

  protected m(bd parambd)
  {
    super(parambd);
  }

  protected final void a(Activity paramActivity, View paramView)
  {
    this.j = paramActivity;
    HashMap localHashMap = new HashMap();
    this.d = ((TextView)paramView.findViewById(d.a("mini_page_add_account")));
    if (this.e)
    {
      this.d.setVisibility(0);
      this.d.setText(this.f);
      this.i = ((MiniLabelInput)paramActivity.findViewById(d.a("mini_page_add_input")));
      this.i.a(paramActivity.getString(d.g("mini_card_no")));
      this.i.b(paramActivity.getString(d.g("mini_page_add_hint")));
      this.i.a(23);
      this.i.b();
      if (TextUtils.equals(paramActivity.getPackageName(), com.alipay.android.app.pay.c.m))
        this.i.c();
      this.i.b(2);
      int[] arrayOfInt1 = new int[1];
      arrayOfInt1[0] = d.a("mini_page_add_title");
      localHashMap.put("page_title", arrayOfInt1);
      int[] arrayOfInt2 = new int[1];
      arrayOfInt2[0] = d.a("mini_widget_label_input_label");
      localHashMap.put("bank_card_no_lable", arrayOfInt2);
      int[] arrayOfInt3 = new int[1];
      arrayOfInt3[0] = d.a("mini_widget_label_input_input");
      localHashMap.put("bank_card_no", arrayOfInt3);
      this.c = ((Button)paramActivity.findViewById(d.a("mini_page_add_confirm")));
      cv.a(this.j, this.a, this.b, this.c);
      int[] arrayOfInt4 = new int[1];
      arrayOfInt4[0] = d.a("mini_page_add_tips");
      localHashMap.put("notify_tips", arrayOfInt4);
      int[] arrayOfInt5 = new int[1];
      arrayOfInt5[0] = d.a("mini_page_add_confirm");
      localHashMap.put("next_step", arrayOfInt5);
      this.c.setEnabled(false);
      this.h = new com.alipay.android.mini.widget.c();
      this.h.a(this.i.e());
      this.i.a(new n(this));
      this.c.setOnClickListener(new o(this));
    }
    while (true)
    {
      Object localObject2;
      try
      {
        Iterator localIterator = localHashMap.keySet().iterator();
        localObject1 = null;
        if (localIterator.hasNext())
          continue;
        com.alipay.a.a.a locala = com.alipay.a.a.a.a();
        EventObject localEventObject = EventObject.OnResume;
        Object[] arrayOfObject = new Object[4];
        arrayOfObject[0] = paramActivity;
        arrayOfObject[1] = a();
        arrayOfObject[2] = localObject1;
        arrayOfObject[3] = localHashMap;
        locala.onChangeEvent(localEventObject, arrayOfObject);
        this.i.e().a(new p(this));
        this.i.e().requestFocus();
        cv.a(this.i.e());
        return;
        this.d.setVisibility(8);
        break;
        String str1 = (String)localIterator.next();
        if (localObject1 != null)
          continue;
        localObject2 = str1 + ":" + ((int[])localHashMap.get(str1))[0];
        break label616;
        String str2 = localObject1 + "," + str1 + ":" + ((int[])localHashMap.get(str1))[0];
        localObject2 = str2;
      }
      catch (Exception localException)
      {
        continue;
      }
      label616: Object localObject1 = localObject2;
    }
  }

  protected final boolean a(ra paramra)
  {
    JSONObject localJSONObject1 = new JSONObject();
    try
    {
      localJSONObject1.put("cardno", this.i.g());
      JSONObject localJSONObject2 = android.support.v4.app.b.a(localJSONObject1, paramra.c());
      f localf = c().g();
      u localu = localf.e();
      localu.a().c(paramra.a());
      localu.a().a(paramra.b());
      localu.a(paramra.h());
      com.wandoujia.clean.b.a locala = c().m$24af20d5();
      locala.b(paramra.e());
      locala.c(paramra.f());
      localf.a(localJSONObject2);
      return c().c().d();
    }
    catch (JSONException localJSONException)
    {
      while (true)
        android.support.v4.app.b.b(localJSONException);
    }
  }

  public final void b(JSONObject paramJSONObject)
  {
    super.b(paramJSONObject);
    this.g = com.wandoujia.jupiter.d.a.a(paramJSONObject.optJSONObject("form").optJSONObject("confirm"), "action");
    this.e = false;
    if (TextUtils.equals("mc", paramJSONObject.optString("app_name")))
    {
      this.e = true;
      this.f = paramJSONObject.optString("hidden_logon_id");
    }
  }

  protected final int d()
  {
    return d.f("mini_ui_page_add_card");
  }

  protected final boolean e()
  {
    return this.i.g().length() > 0;
  }

  protected final boolean f()
  {
    TextView localTextView;
    if (e())
    {
      boolean bool = Pattern.compile("^\\d{12,19}$").matcher(this.i.g()).matches();
      localTextView = this.i.f();
      if (!bool)
      {
        localTextView.setTextColor(-65536);
        cv.b(this.i.e());
        android.support.v4.app.b.a(this.j, "银行卡格式错误");
      }
    }
    else
    {
      return false;
    }
    localTextView.setTextColor(this.j.getResources().getColor(d.c("mini_text_color_gray")));
    return true;
  }

  public final void i()
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.m
 * JD-Core Version:    0.6.0
 */