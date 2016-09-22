package com.alipay.android.mini.window.sdk;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.support.v4.app.d;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.mini.widget.CustomEditText;
import com.alipay.android.mini.widget.CustomEditText.a;
import com.alipay.android.mini.widget.CustomEditText.c;
import com.alipay.android.mini.widget.CustomScrollView;
import com.alipay.android.mini.widget.MiniLabelInput;
import com.alipay.android.mini.widget.e;
import com.alipay.android.mini.widget.g;
import com.alipay.test.ui.core.EventObject;
import com.alipay.wandoujia.bd;
import com.alipay.wandoujia.bm;
import com.alipay.wandoujia.c;
import com.alipay.wandoujia.cv;
import com.alipay.wandoujia.f;
import com.alipay.wandoujia.ra;
import com.alipay.wandoujia.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class q extends b
{
  private boolean A;
  private boolean B;
  private boolean C;
  private boolean D;
  private boolean E;
  private boolean F;
  private bm G;
  private String H;
  private String I;
  private String J;
  private String K;
  private String L;
  private String M;
  private String[] N;
  private String[] O;
  private String[] P;
  private String[] Q;
  private Activity R;
  private com.wandoujia.account.e.a S;
  private String T;
  private String U;
  private String V;
  private e W;
  private CustomScrollView X;
  private DialogInterface.OnClickListener Y = new r(this);
  private CustomEditText.c Z;
  private CustomEditText.a aa;
  private LinearLayout c;
  private LinearLayout d;
  private LinearLayout e;
  private MiniLabelInput f;
  private MiniLabelInput g;
  private MiniLabelInput h;
  private MiniLabelInput i;
  private MiniLabelInput j;
  private MiniLabelInput k;
  private LinearLayout l;
  private TextView m;
  private TextView n;
  private TextView o;
  private ImageView p;
  private ImageView q;
  private Button r;
  private String s;
  private com.wandoujia.jupiter.d.a t;
  private boolean u;
  private boolean v;
  private boolean w;
  private boolean x;
  private boolean y;
  private boolean z;

  protected q(bd parambd)
  {
    super(parambd);
    new v(this);
    this.Z = new w(this);
    this.aa = new x(this);
  }

  protected final void a(int paramInt1, int paramInt2)
  {
    this.h.e().setText(paramInt1 + 1 + new StringBuilder(String.valueOf(paramInt2)).toString().substring(2, 4));
  }

  protected final void a(Activity paramActivity, View paramView)
  {
    this.R = paramActivity;
    HashMap localHashMap = new HashMap();
    int[] arrayOfInt1 = new int[1];
    arrayOfInt1[0] = d.a("mini_page_msg_title");
    localHashMap.put("page_title", arrayOfInt1);
    this.o = ((TextView)paramView.findViewById(d.a("mini_page_msg_account")));
    this.X = ((CustomScrollView)paramView.findViewById(d.a("mini_ui_custom_scrollview")));
    String str1;
    String str2;
    if (this.F)
    {
      this.o.setVisibility(0);
      this.o.setText(this.M);
      this.l = ((LinearLayout)paramView.findViewById(d.a("mini_page_msg_input_type")));
      if ((TextUtils.isEmpty(this.s)) || (this.s.length() <= 3))
        break label2232;
      String str5 = this.s.substring(0, -3 + this.s.length());
      String str6 = this.s.substring(-3 + this.s.length());
      str1 = str5;
      str2 = str6;
      label180: ((TextView)this.l.findViewById(d.a("mini_page_msg_input_type_bank"))).setText(str1);
      ((TextView)this.l.findViewById(d.a("mini_page_msg_input_type_cardtype"))).setText(str2);
      int[] arrayOfInt2 = new int[1];
      arrayOfInt2[0] = d.a("mini_page_msg_input_type");
      localHashMap.put("msg_input_type", arrayOfInt2);
      int[] arrayOfInt3 = new int[1];
      arrayOfInt3[0] = d.a("mini_page_msg_name_tip");
      localHashMap.put("msg_name_tip", arrayOfInt3);
      int[] arrayOfInt4 = new int[1];
      arrayOfInt4[0] = d.a("mini_page_msg_choose_link");
      localHashMap.put("msg_choose_link", arrayOfInt4);
      this.f = ((MiniLabelInput)paramView.findViewById(d.a("mini_page_msg_input_name")));
      this.f.a(paramActivity.getString(d.g("mini_page_name")));
      this.f.b(paramActivity.getString(d.g("mini_page_input_name_hint")));
      this.f.b();
      if (!this.w)
        break label1969;
      this.f.c("姓名    ");
      this.f.setVisibility(0);
      int[] arrayOfInt12 = new int[1];
      arrayOfInt12[0] = d.a("mini_page_msg_input_name");
      localHashMap.put("msg_input_name", arrayOfInt12);
      if (!TextUtils.isEmpty(this.H))
      {
        this.f.d();
        if (this.C)
          this.f.h();
        this.f.d(this.H);
      }
      label453: this.n = ((TextView)paramView.findViewById(d.a("mini_page_msg_choose_link")));
      if (!this.B)
        break label1981;
      this.n.setVisibility(0);
      label485: this.g = ((MiniLabelInput)paramView.findViewById(d.a("mini_page_msg_input_cert")));
      this.g.a(paramActivity.getString(d.g("mini_id_no")));
      this.g.b(paramActivity.getString(d.g("mini_page_input_id_hint")));
      this.g.a(20);
      this.g.b();
      if (!this.x)
        break label1993;
      this.g.setVisibility(0);
      if (TextUtils.equals("A", this.K))
      {
        this.g.c(20);
        if (this.W == null)
          this.W = new e(this.g.e());
      }
      this.g.e(this.L + "号码");
      int[] arrayOfInt11 = new int[1];
      arrayOfInt11[0] = d.a("mini_page_msg_input_cert");
      localHashMap.put("msg_input_cert", arrayOfInt11);
      if (!TextUtils.isEmpty(this.I))
      {
        this.g.d();
        if (this.D)
          this.g.h();
        this.g.d(this.I);
      }
      label713: this.p = ((ImageView)paramView.findViewById(d.a("mini_page_msg_name_line")));
      if ((!this.x) || (!this.w))
        break label2005;
      this.p.setVisibility(0);
      label752: this.e = ((LinearLayout)paramView.findViewById(d.a("mini_page_msg_lin_name")));
      if ((this.x) || (this.w))
        break label2017;
      this.e.setVisibility(8);
      label792: this.h = ((MiniLabelInput)paramView.findViewById(d.a("mini_page_msg_input_validate")));
      this.h.a(paramActivity.getString(d.g("mini_date")));
      this.h.b(paramActivity.getString(d.g("mini_date_hint")));
      this.h.a(5);
      this.h.b();
      this.h.b(4);
      if (!this.z)
        break label2028;
      int[] arrayOfInt10 = new int[1];
      arrayOfInt10[0] = d.a("mini_page_msg_input_validate");
      localHashMap.put("msg_input_validate", arrayOfInt10);
      this.h.setVisibility(0);
      label908: this.h.e().setFocusable(false);
      this.h.e().setFocusableInTouchMode(false);
      this.h.e().setCursorVisible(false);
      this.h.e().setOnClickListener(new y(this));
      this.i = ((MiniLabelInput)paramView.findViewById(d.a("mini_page_msg_input_safe")));
      this.i.a(paramActivity.getString(d.g("mini_safe_no")));
      this.i.b(paramActivity.getString(d.g("mini_safe_no_hint")));
      this.i.a(4);
      this.i.a(paramActivity.getResources().getDrawable(d.e("mini_icon_info")));
      this.i.b();
      this.i.b(2);
      if (!this.A)
        break label2040;
      int[] arrayOfInt9 = new int[1];
      arrayOfInt9[0] = d.a("mini_page_msg_input_safe");
      localHashMap.put("msg_input_safe", arrayOfInt9);
      this.i.setVisibility(0);
      this.i.a(null);
      label1103: this.i.a(this.Z);
      this.q = ((ImageView)paramView.findViewById(d.a("mini_page_msg_credit_line")));
      if ((!this.A) || (!this.z))
        break label2052;
      this.q.setVisibility(0);
      label1153: this.j = ((MiniLabelInput)paramView.findViewById(d.a("mini_page_msg_input_mobile")));
      this.j.a(paramActivity.getString(d.g("mini_phone_no")));
      this.j.b(paramActivity.getString(d.g("mini_phone_no_hint")));
      this.j.a(13);
      this.j.b();
      if (!this.y)
        break label2064;
      int[] arrayOfInt8 = new int[1];
      arrayOfInt8[0] = d.a("mini_page_msg_input_mobile");
      localHashMap.put("msg_input_mobile", arrayOfInt8);
      new g().a(this.j.e());
      if (!TextUtils.isEmpty(this.J))
      {
        this.j.d();
        if (this.E)
          this.j.h();
        this.j.d(this.J);
      }
      this.j.setVisibility(0);
      label1321: this.j.b(2);
      this.m = ((TextView)paramView.findViewById(d.a("mini_page_msg_protocol_link")));
      int[] arrayOfInt5 = new int[1];
      arrayOfInt5[0] = d.a("mini_page_msg_protocol_link");
      localHashMap.put("msg_protocol_link", arrayOfInt5);
      this.k = ((MiniLabelInput)paramView.findViewById(d.a("mini_page_msg_input_pwd")));
      this.k.a(paramActivity.getString(d.g("mini_password")));
      this.k.b(paramActivity.getString(d.g("mini_password_hint")));
      this.k.a();
      this.k.b();
      if (!this.u)
        break label2076;
      int[] arrayOfInt7 = new int[1];
      arrayOfInt7[0] = d.a("mini_page_msg_input_pwd");
      localHashMap.put("msg_input_pwd", arrayOfInt7);
      this.k.e("密码    ");
      this.k.setVisibility(0);
      label1490: this.c = ((LinearLayout)paramView.findViewById(d.a("mini_page_msg_credit")));
      if ((this.A) || (this.z))
        break label2088;
      this.c.setVisibility(8);
      label1530: this.d = ((LinearLayout)paramView.findViewById(d.a("mini_page_msg_spwd_panel")));
      if (!this.v)
        break label2099;
      this.d.setVisibility(0);
      this.G = new bm();
      this.G.b();
      this.d.addView(this.G.a(paramActivity, this.d, true));
      label1600: this.r = ((Button)paramView.findViewById(d.a("mini_page_msg_btConfirm")));
      cv.a(this.R, this.a, this.b, this.r);
      int[] arrayOfInt6 = new int[1];
      arrayOfInt6[0] = d.a("mini_page_msg_btConfirm");
      localHashMap.put("confirm", arrayOfInt6);
      this.r.setEnabled(false);
      z localz = new z(this);
      this.r.setOnClickListener(localz);
      this.m.setOnClickListener(localz);
      this.n.setOnClickListener(localz);
      aa localaa = new aa(this);
      this.g.a(localaa);
      this.j.a(localaa);
      this.f.a(localaa);
      this.i.a(localaa);
      this.h.a(localaa);
      this.k.a(localaa);
      if (this.v)
        this.G.a(localaa);
    }
    while (true)
    {
      label1969: label1981: label1993: label2005: label2017: label2028: label2040: Object localObject2;
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
        e();
        this.f.e().a(this.aa);
        this.h.e().a(this.aa);
        this.j.e().a(new s(this));
        this.g.e().a(new t(this));
        if (!this.f.e().isEnabled())
          continue;
        this.f.e().requestFocus();
        return;
        this.o.setVisibility(8);
        break;
        this.f.setVisibility(8);
        break label453;
        this.n.setVisibility(8);
        break label485;
        this.g.setVisibility(8);
        break label713;
        this.p.setVisibility(8);
        break label752;
        this.e.setVisibility(0);
        break label792;
        this.h.setVisibility(8);
        break label908;
        this.i.setVisibility(8);
        break label1103;
        label2052: this.q.setVisibility(8);
        break label1153;
        label2064: this.j.setVisibility(8);
        break label1321;
        label2076: this.k.setVisibility(8);
        break label1490;
        label2088: this.c.setVisibility(0);
        break label1530;
        label2099: this.d.setVisibility(8);
        break label1600;
        String str3 = (String)localIterator.next();
        if (localObject1 != null)
          continue;
        localObject2 = str3 + ":" + ((int[])localHashMap.get(str3))[0];
        break label2245;
        String str4 = localObject1 + "," + str3 + ":" + ((int[])localHashMap.get(str3))[0];
        localObject2 = str4;
      }
      catch (Exception localException)
      {
        continue;
      }
      label2232: str1 = "";
      str2 = "";
      break label180;
      label2245: Object localObject1 = localObject2;
    }
  }

  protected final boolean a(ra paramra)
  {
    JSONObject localJSONObject1 = new JSONObject();
    try
    {
      String str1 = this.g.g().toString();
      localJSONObject1.put("cardname", this.s);
      if ((this.x) && (!this.D) && (!TextUtils.equals(str1, this.I)))
        if (!TextUtils.equals(this.K, "A"))
          break label423;
      label423: String str4;
      for (Object localObject = this.g.g().toUpperCase(Locale.getDefault()); ; localObject = str4)
      {
        localJSONObject1.put("certno", localObject);
        String str2 = this.j.g();
        if ((this.y) && (!this.E) && (!TextUtils.equals(str2, this.J)))
          localJSONObject1.put("bankmobile", this.j.g());
        String str3 = this.f.g();
        if ((this.w) && (!this.C) && (!TextUtils.equals(str3, this.H)))
          localJSONObject1.put("username", this.f.g());
        if (this.A)
          localJSONObject1.put("cvv2", this.i.g());
        if (this.z)
          localJSONObject1.put("validate", this.T + this.V);
        if (this.u)
          localJSONObject1.put("pwd", this.k.g());
        if (this.v)
          localJSONObject1.put("spwd", this.G.l());
        localJSONObject1.put("certtype", this.K);
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
        str4 = this.g.g();
      }
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
    JSONObject localJSONObject1 = paramJSONObject.optJSONObject("form");
    this.t = com.wandoujia.jupiter.d.a.a(localJSONObject1.optJSONObject("confirm"), "action");
    try
    {
      JSONArray localJSONArray = localJSONObject1.getJSONArray("menu");
      int i2 = localJSONArray.length();
      int i3;
      label79: JSONObject localJSONObject2;
      JSONObject localJSONObject5;
      Iterator localIterator;
      if (i2 > 0)
      {
        this.P = new String[i2];
        this.Q = new String[i2];
        i3 = 0;
        if (i3 < i2);
      }
      else
      {
        this.F = false;
        if (TextUtils.equals("mc", paramJSONObject.optString("app_name")))
        {
          this.F = true;
          this.M = paramJSONObject.optString("hidden_logon_id");
        }
        localJSONObject2 = paramJSONObject.optJSONObject("needinput");
        if (localJSONObject2 != null)
        {
          if (localJSONObject2.has("cardname"))
          {
            JSONObject localJSONObject8 = localJSONObject2.optJSONObject("cardname");
            if (localJSONObject8.optBoolean("display"))
              this.s = localJSONObject8.optString("value");
          }
          if ((localJSONObject2.has("pwd")) && (localJSONObject2.optJSONObject("pwd").optBoolean("display")))
            this.u = true;
          if ((localJSONObject2.has("spwd")) && (localJSONObject2.optJSONObject("spwd").optBoolean("display")))
            this.v = true;
          if (localJSONObject2.has("certno"))
          {
            JSONObject localJSONObject7 = localJSONObject2.optJSONObject("certno");
            if (localJSONObject7.optBoolean("display"))
            {
              this.x = true;
              this.I = localJSONObject7.optString("value");
              this.D = localJSONObject7.optBoolean("disable");
            }
          }
          if (localJSONObject2.has("bankmobile"))
          {
            JSONObject localJSONObject6 = localJSONObject2.optJSONObject("bankmobile");
            if (localJSONObject6.optBoolean("display"))
            {
              this.y = true;
              this.J = localJSONObject6.optString("value");
              this.E = localJSONObject6.optBoolean("disable");
            }
          }
          if (localJSONObject2.has("certtype"))
          {
            JSONObject localJSONObject4 = localJSONObject2.optJSONObject("certtype");
            if (localJSONObject4.optBoolean("display"))
            {
              this.B = true;
              localJSONObject5 = localJSONObject4.optJSONObject("value");
              this.K = localJSONObject4.optString("default");
              this.N = new String[localJSONObject5.length()];
              this.O = new String[localJSONObject5.length()];
              localIterator = localJSONObject5.keys();
            }
          }
        }
      }
      for (int i1 = 0; ; i1++)
      {
        if (!localIterator.hasNext())
        {
          if ((localJSONObject2.has("validate")) && (localJSONObject2.optJSONObject("validate").optBoolean("display")))
            this.z = true;
          if ((localJSONObject2.has("cvv2")) && (localJSONObject2.optJSONObject("cvv2").optBoolean("display")))
            this.A = true;
          if (localJSONObject2.has("username"))
          {
            JSONObject localJSONObject3 = localJSONObject2.optJSONObject("username");
            if (localJSONObject3.optBoolean("display"))
            {
              this.w = true;
              this.H = localJSONObject3.optString("value");
              this.C = localJSONObject3.optBoolean("disable");
            }
          }
          return;
          JSONObject localJSONObject9 = localJSONArray.getJSONObject(i3);
          if (localJSONObject9 != null)
          {
            this.P[i3] = localJSONObject9.optString("value");
            this.Q[i3] = localJSONObject9.optString("link");
          }
          i3++;
          break;
        }
        String str = (String)localIterator.next();
        this.N[i1] = str;
        this.O[i1] = localJSONObject5.optString(str);
        if (!TextUtils.equals(this.K, this.O[i1]))
          continue;
        this.L = this.N[i1];
      }
    }
    catch (JSONException localJSONException)
    {
      break label79;
    }
  }

  protected final int d()
  {
    return d.f("mini_ui_page_card_msg");
  }

  protected final boolean e()
  {
    if ((this.x) && (this.g.g().length() <= 0))
    {
      this.r.setEnabled(false);
      return false;
    }
    if ((this.y) && (this.j.g().length() <= 0))
    {
      this.r.setEnabled(false);
      return false;
    }
    if ((this.w) && (this.f.g().length() <= 0))
    {
      this.r.setEnabled(false);
      return false;
    }
    if ((this.A) && (this.i.g().length() <= 0))
    {
      this.r.setEnabled(false);
      return false;
    }
    if ((this.z) && (this.h.g().length() <= 0))
    {
      this.r.setEnabled(false);
      return false;
    }
    if ((this.u) && (this.k.g().length() <= 0))
    {
      this.r.setEnabled(false);
      return false;
    }
    if ((this.v) && (!this.G.g()))
    {
      this.r.setEnabled(false);
      return false;
    }
    this.r.setEnabled(true);
    return true;
  }

  protected final boolean f()
  {
    if (e())
    {
      String str1 = this.g.g().toString().toUpperCase(Locale.getDefault());
      boolean bool1;
      boolean bool2;
      TextView localTextView1;
      if ((this.x) && (!this.D) && (!TextUtils.equals(str1, this.I)))
        if (!TextUtils.equals("A", this.K))
          if (TextUtils.isEmpty(str1))
          {
            bool1 = false;
            if (!bool1)
              break label280;
            String str2 = this.j.g();
            if ((!this.y) || (this.E) || (TextUtils.equals(str2, this.J)))
              break label274;
            bool2 = Pattern.compile("^1[3|4|5|8][0-9]\\d{8}$").matcher(this.j.g()).matches();
            localTextView1 = this.j.f();
            if (bool2)
              break label250;
            localTextView1.setTextColor(-65536);
            android.support.v4.app.b.a(this.R, "手机号码格式错误");
          }
      while (true)
      {
        if (!bool2)
          break label280;
        return true;
        bool1 = true;
        break;
        bool1 = Pattern.compile("(^\\d{15}$)|(^\\d{17}([0-9]|X)$)").matcher(str1).matches();
        TextView localTextView2 = this.g.f();
        if (!bool1)
        {
          localTextView2.setTextColor(-65536);
          android.support.v4.app.b.a(this.R, "身份证号码为15位或18位数字、字母");
          break;
        }
        localTextView2.setTextColor(this.R.getResources().getColor(d.c("mini_text_color_gray")));
        break;
        bool1 = true;
        break;
        label250: localTextView1.setTextColor(this.R.getResources().getColor(d.c("mini_text_color_gray")));
        continue;
        label274: bool2 = true;
      }
    }
    label280: return false;
  }

  public final void g()
  {
    this.S = new com.wandoujia.account.e.a("有效期", this.R);
    this.S.a(new ab(this));
    this.S.b(new ac());
    if ((this.U == null) || (this.U.length() <= 0))
      this.S.a();
    while (true)
    {
      this.S.b();
      return;
      this.S.b(Integer.valueOf(this.U).intValue(), Integer.valueOf(this.T).intValue());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.q
 * JD-Core Version:    0.6.0
 */