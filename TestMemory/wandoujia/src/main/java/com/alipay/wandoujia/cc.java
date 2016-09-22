package com.alipay.wandoujia;

import android.os.CountDownTimer;
import android.support.v4.app.d;
import android.view.View;
import android.widget.Button;
import com.wandoujia.jupiter.d.a;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class cc extends bw
{
  private a b;
  private int c;
  private int d;
  private CountDownTimer e;
  private Button f;
  private a g;
  private String[] h;
  private String[] i;

  protected final int a()
  {
    return d.f("mini_ui_button");
  }

  public final void a(JSONObject paramJSONObject)
  {
    super.a(paramJSONObject);
    this.g = a.a(paramJSONObject, "onclick");
    this.b = a.a(paramJSONObject, "onload");
    this.d = paramJSONObject.optInt("time", 1000);
    this.h = new String[3];
    this.i = new String[3];
    cv.a(this.h, this.i, paramJSONObject);
  }

  public final void b()
  {
    if ((this.f == null) || (this.c == 0))
      return;
    this.f.post(new cg(this));
  }

  public final int e()
  {
    Button localButton = this.f;
    bz.a(localButton);
    if (localButton != null)
      return localButton.getId();
    return 0;
  }

  public final JSONObject h()
  {
    return v();
  }

  public final void i()
  {
    super.i();
    this.e = null;
    this.f = null;
  }

  protected final void j()
  {
    if (this.b == null);
    ra localra;
    do
    {
      return;
      localra = ra.a$65b37f89(this.b);
    }
    while (localra != ra.t);
    ap localap = (ap)m();
    Iterator localIterator;
    if (localap != null)
    {
      localIterator = localap.a.iterator();
      if (localIterator.hasNext())
        break label125;
    }
    while (true)
    {
      this.c = (1000 * Integer.valueOf(cs.a(localra.a())[0]).intValue());
      this.d = 1000;
      this.f.setEnabled(false);
      this.e = new cf(this, this.c, this.d);
      this.e.start();
      return;
      label125: sh localsh = (sh)localIterator.next();
      if (!(localsh instanceof co))
        break;
      cv.a(((co)localsh).l());
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.cc
 * JD-Core Version:    0.6.0
 */