package com.alipay.android.mini.window.sdk;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.app.b;
import android.support.v4.app.d;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.alipay.wandoujia.bd;
import com.alipay.wandoujia.bt;
import com.alipay.wandoujia.bw;
import com.alipay.wandoujia.c;
import com.alipay.wandoujia.cv;
import com.alipay.wandoujia.f;
import com.alipay.wandoujia.r;
import com.alipay.wandoujia.ra;
import com.alipay.wandoujia.sg;
import com.alipay.wandoujia.sh;
import com.alipay.wandoujia.u;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class am extends au
{
  private boolean g = true;
  private Button h;
  private com.wandoujia.jupiter.d.a i;
  private JSONObject j;
  private String k;
  private com.wandoujia.jupiter.d.a l;
  private Button m;
  private com.wandoujia.jupiter.d.a n;
  private com.wandoujia.jupiter.d.a o;
  private String p;
  private View q;
  private ImageView r;
  private com.wandoujia.jupiter.d.a s;
  private boolean t;
  private boolean u;
  private String[] v = null;
  private String[] w = null;

  protected am(bd parambd)
  {
    super(parambd);
    new az();
    this.d.clear();
  }

  public void a(Activity paramActivity, ViewGroup paramViewGroup)
  {
    RelativeLayout localRelativeLayout = (RelativeLayout)paramViewGroup;
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localRelativeLayout.getLayoutParams();
    View localView1 = LayoutInflater.from(paramActivity).inflate(d.f("mini_activity_main"), paramViewGroup, false);
    ViewGroup.LayoutParams localLayoutParams1 = localView1.getLayoutParams();
    LinearLayout.LayoutParams localLayoutParams2 = (LinearLayout.LayoutParams)((LinearLayout)localView1.findViewById(d.a("mini_linBlocksConpent"))).getLayoutParams();
    View localView2;
    Object localObject;
    label242: LinearLayout localLinearLayout1;
    label344: ImageView localImageView;
    label407: LinearLayout.LayoutParams localLayoutParams3;
    if (this.f)
    {
      paramActivity.getWindow().setLayout(-1, -1);
      localLayoutParams.setMargins(0, 0, 0, 0);
      localRelativeLayout.setPadding(0, 0, 0, 0);
      localRelativeLayout.setGravity(49);
      localRelativeLayout.setBackgroundResource(d.c("mini_page_bg_color"));
      paramActivity.getWindow().setBackgroundDrawableResource(d.e("mini_win_background_draw"));
      localLayoutParams1.height = -1;
      localLayoutParams1.width = -1;
      localLayoutParams2.height = -2;
      paramViewGroup.removeAllViews();
      paramViewGroup.addView(localView1);
      paramActivity.findViewById(d.a("mini_root")).setBackgroundResource(0);
      if ((g() != null) && ((g().get(0) instanceof bt)))
      {
        sg localsg = (sg)g().get(0);
        localView2 = paramActivity.findViewById(d.a("mini_main_title"));
        localView2.setVisibility(0);
        localObject = localsg.m();
        if (!(localObject instanceof Drawable))
          break label940;
        localView2.setBackgroundDrawable((Drawable)localObject);
        LinearLayout localLinearLayout3 = (LinearLayout)localView2.findViewById(d.a("mini_linTitleContainer"));
        localLinearLayout3.removeAllViews();
        localLinearLayout3.addView((View)localsg.b(paramActivity, localLinearLayout3, this.f));
        this.q = paramActivity.findViewById(d.a("mini_form_btSwitch"));
        if (!this.t)
          break label998;
        Map localMap4 = this.d;
        int[] arrayOfInt4 = new int[1];
        arrayOfInt4[0] = d.a("mini_form_btSwitch");
        localMap4.put("mini_form_btSwitch", arrayOfInt4);
        this.q.setVisibility(0);
        this.r = ((ImageView)paramActivity.findViewById(d.a("mini_main_btBack")));
        if (!this.u)
          break label1010;
        Map localMap3 = this.d;
        int[] arrayOfInt3 = new int[1];
        arrayOfInt3[0] = d.a("mini_main_btBack");
        localMap3.put("mini_main_btBack", arrayOfInt3);
        this.r.setVisibility(0);
        g().remove(0);
      }
      super.a(paramActivity, (ViewGroup)localView1);
      localLinearLayout1 = (LinearLayout)paramActivity.findViewById(d.a("mini_main_bottom"));
      LinearLayout localLinearLayout2 = (LinearLayout)paramActivity.findViewById(d.a("mini_main_btn_container"));
      localImageView = (ImageView)paramActivity.findViewById(d.a("mini_main_bt_devider"));
      this.h = ((Button)paramActivity.findViewById(d.a("mini_main_btConfirm")));
      this.m = ((Button)paramActivity.findViewById(d.a("mini_main_btCancel")));
      localLayoutParams3 = (LinearLayout.LayoutParams)localLinearLayout2.getLayoutParams();
      if (!this.f)
        break label1022;
      localImageView.setVisibility(8);
      localLayoutParams3.leftMargin = paramActivity.getResources().getDimensionPixelSize(d.d("mini_margin_10"));
      localLayoutParams3.rightMargin = paramActivity.getResources().getDimensionPixelSize(d.d("mini_margin_10"));
      label562: if ((!this.g) || (TextUtils.isEmpty(this.k)))
        break label1067;
      Map localMap2 = this.d;
      int[] arrayOfInt2 = new int[1];
      arrayOfInt2[0] = d.a("mini_main_btConfirm");
      localMap2.put("mini_main_btConfirm", arrayOfInt2);
      this.h.setText(this.k);
      this.h.setVisibility(0);
      cv.a(paramActivity, this.v, this.w, this.h);
      label646: if (TextUtils.isEmpty(this.p))
        break label1079;
      Map localMap1 = this.d;
      int[] arrayOfInt1 = new int[1];
      arrayOfInt1[0] = d.a("mini_main_btCancel");
      localMap1.put("mini_main_btCancel", arrayOfInt1);
      this.m.setText(this.p);
      this.m.setVisibility(0);
      label707: if ((this.m.getVisibility() != 8) || (this.h.getVisibility() != 8))
        break label1091;
      localLinearLayout1.setVisibility(8);
    }
    while (true)
    {
      while (true)
      {
        ao localao = new ao(this);
        if (this.h != null)
          this.h.setOnClickListener(localao);
        if (this.q != null)
          this.q.setOnClickListener(localao);
        if (this.r != null)
          this.r.setOnClickListener(localao);
        if (this.m != null)
          this.m.setOnClickListener(localao);
        if (this.q != null)
          this.q.getViewTreeObserver().addOnGlobalLayoutListener(new an(this));
        return;
        paramActivity.getWindow().setLayout(-2, -2);
        localLayoutParams.width = -2;
        localLayoutParams.gravity = 17;
        localLayoutParams.height = -2;
        localRelativeLayout.setGravity(17);
        localRelativeLayout.setBackgroundResource(d.e("mini_bg"));
        paramActivity.getWindow().setBackgroundDrawableResource(d.e("mini_win_background_draw"));
        localLayoutParams1.height = paramActivity.getResources().getDimensionPixelSize(d.d("mini_win_default_height"));
        localLayoutParams1.width = cv.c(paramActivity);
        localLayoutParams2.height = 0;
        localLayoutParams2.weight = 1.0F;
        break;
        label940: if (!(localObject instanceof String))
          break label974;
        try
        {
          localView2.setBackgroundColor(cv.a((String)localObject));
        }
        catch (Exception localException)
        {
          b.b(localException);
        }
      }
      break label242;
      label974: if (!(localObject instanceof Integer))
        break label242;
      localView2.setBackgroundResource(((Integer)localObject).intValue());
      break label242;
      label998: this.q.setVisibility(8);
      break label344;
      label1010: this.r.setVisibility(8);
      break label407;
      label1022: localImageView.setVisibility(0);
      localLayoutParams3.leftMargin = paramActivity.getResources().getDimensionPixelSize(d.d("mini_margin_left"));
      localLayoutParams3.rightMargin = paramActivity.getResources().getDimensionPixelSize(d.d("mini_margin_right"));
      break label562;
      label1067: this.h.setVisibility(8);
      break label646;
      label1079: this.m.setVisibility(8);
      break label707;
      label1091: localLinearLayout1.setVisibility(0);
    }
  }

  protected boolean a(ra paramra)
  {
    List localList = super.f();
    Iterator localIterator;
    if (paramra.g())
      localIterator = localList.iterator();
    sh localsh;
    do
    {
      if (!localIterator.hasNext())
        return true;
      localsh = (sh)localIterator.next();
    }
    while (localsh.g());
    localsh.a(null);
    return false;
  }

  public boolean a(Object paramObject, com.alipay.wandoujia.am paramam)
  {
    if (paramam.b() == ra.o)
    {
      bw localbw = this.b.b();
      if (localbw != null)
        localbw.d();
      return true;
    }
    return super.a(paramObject, paramam);
  }

  public void b(JSONObject paramJSONObject)
  {
    super.b(paramJSONObject);
    if (paramJSONObject.has("confirm"))
    {
      JSONObject localJSONObject3 = paramJSONObject.optJSONObject("confirm");
      this.i = com.wandoujia.jupiter.d.a.a(localJSONObject3, "action");
      this.k = localJSONObject3.optString("value");
      this.g = localJSONObject3.optBoolean("display", true);
      this.j = localJSONObject3.optJSONObject("params");
      this.l = com.wandoujia.jupiter.d.a.a(localJSONObject3, "onclick");
      this.v = new String[3];
      this.w = new String[3];
      cv.a(this.v, this.w, localJSONObject3);
    }
    if (paramJSONObject.has("cancle"))
    {
      JSONObject localJSONObject2 = paramJSONObject.optJSONObject("cancle");
      this.p = localJSONObject2.optString("value");
      this.n = com.wandoujia.jupiter.d.a.a(localJSONObject2, "action");
    }
    if (paramJSONObject.has("back"))
    {
      this.u = true;
      this.s = com.wandoujia.jupiter.d.a.a(paramJSONObject.optJSONObject("back"), "action");
    }
    while (paramJSONObject.has("switch"))
    {
      this.t = true;
      JSONObject localJSONObject1 = paramJSONObject.optJSONObject("switch");
      localJSONObject1.optJSONObject("params");
      this.o = com.wandoujia.jupiter.d.a.a(localJSONObject1, "action");
      return;
      this.u = false;
    }
    this.t = false;
  }

  protected boolean b(ra paramra)
  {
    List localList = super.f();
    JSONObject localJSONObject1 = new JSONObject();
    Iterator localIterator = localList.iterator();
    for (JSONObject localJSONObject2 = localJSONObject1; ; localJSONObject2 = b.a(localJSONObject2, ((sh)localIterator.next()).h()))
    {
      if (localIterator.hasNext())
        continue;
      JSONObject localJSONObject3 = b.a(b.a(localJSONObject2, this.j), paramra.c());
      f localf = h().g();
      u localu = localf.e();
      localu.a(paramra.h());
      localu.a().c(paramra.a());
      localu.a().a(paramra.b());
      com.wandoujia.clean.b.a locala = h().m$24af20d5();
      locala.b(paramra.e());
      locala.c(paramra.f());
      localf.a(localJSONObject3);
      return h().c().d();
    }
  }

  protected boolean c()
  {
    Iterator localIterator = f().iterator();
    int i1;
    if (!localIterator.hasNext())
    {
      i1 = 1;
      label21: if ((i1 == 0) || (this.h == null))
        break label64;
      this.h.setEnabled(true);
    }
    label64: 
    do
    {
      return i1;
      if (((sh)localIterator.next()).f())
        break;
      i1 = 0;
      break label21;
    }
    while (this.h == null);
    this.h.setEnabled(false);
    return i1;
  }

  public void i()
  {
    super.i();
    this.i = null;
    this.n = null;
    this.h = null;
    this.q = null;
    this.k = null;
    this.j = null;
    this.s = null;
    this.r = null;
    this.m = null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.am
 * JD-Core Version:    0.6.0
 */