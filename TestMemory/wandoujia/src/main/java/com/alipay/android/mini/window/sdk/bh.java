package com.alipay.android.mini.window.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.d;
import com.alipay.android.app.exception.AppErrorException;
import com.alipay.wandoujia.bw;
import com.alipay.wandoujia.bz;
import com.alipay.wandoujia.rg;
import com.alipay.wandoujia.sf;
import com.alipay.wandoujia.sg;
import com.wandoujia.image.c.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class bh
{
  protected Map a = new HashMap();
  private List b = new ArrayList();
  private bw c;
  private rg d;

  private void a(sg paramsg, JSONObject paramJSONObject)
  {
    JSONArray localJSONArray1 = paramJSONObject.optJSONArray("value");
    Resources localResources1 = a.a().b().getResources();
    int i = localJSONArray1.length();
    int j = 0;
    if (j >= i)
      return;
    JSONObject localJSONObject = localJSONArray1.optJSONObject(j);
    int k = (int)localResources1.getDimension(d.d("mini_margin_top"));
    float f1;
    label70: int m;
    int n;
    label93: sg localsg;
    JSONArray localJSONArray2;
    Resources localResources2;
    int i2;
    if (j < -1 + localJSONArray1.length())
    {
      f1 = 0.0F;
      m = (int)f1;
      if (!"component".equals(localJSONObject.optString("type")))
        break label202;
      n = 1;
      if (n == 0)
        break label284;
      localsg = (sg)bz.a(localJSONObject);
      localJSONArray2 = localJSONObject.optJSONArray("value");
      localsg.a(localJSONObject);
      localResources2 = a.a().b().getResources();
      int i1 = localJSONArray2.length();
      i2 = 0;
      if (i2 < i1)
        break label208;
      paramsg.a(localsg);
      this.a.put(localsg.c(), localsg);
    }
    while (true)
    {
      j++;
      break;
      f1 = localResources1.getDimension(d.d("mini_margin_bottom"));
      break label70;
      label202: n = 0;
      break label93;
      label208: float f2;
      if (i2 < -1 + localJSONArray2.length())
        f2 = 0.0F;
      while (true)
      {
        int i3 = (int)f2;
        int i4 = (int)localResources2.getDimension(d.d("mini_margin_left"));
        a(localsg, localJSONArray2.optJSONObject(i2), 0, i4, k, i3, m);
        i2++;
        break;
        f2 = localResources2.getDimension(d.d("mini_margin_right"));
      }
      label284: a(paramsg, localJSONObject, 1, 0, k, 0, m);
    }
  }

  private void a(sg paramsg, JSONObject paramJSONObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    String str = paramJSONObject.optString("type");
    sf localsf = sf.a(str);
    if (localsf == null)
      throw new AppErrorException(getClass(), "no such control type:" + str);
    bw localbw = (bw)bz.a(localsf);
    if (localbw != null)
    {
      localbw.a(paramsg);
      localbw.a(paramInt2, paramInt3, paramInt4, paramInt5);
      if (paramInt1 == 1)
        localbw.w();
      localbw.a(paramJSONObject);
      paramsg.a(localbw);
      this.a.put(localbw.c(), localbw);
      this.b.add(localbw);
      if ((this.c == null) && ((localsf == sf.c) || (localsf == sf.e) || (localsf == sf.f)))
        this.c = localbw;
      localbw.a(this.d);
      return;
    }
    throw new AppErrorException(bh.class, "element type is null,resp data error");
  }

  public final List a()
  {
    return this.b;
  }

  public final List a(rg paramrg, JSONArray paramJSONArray)
  {
    if (paramJSONArray == null)
      throw new AppErrorException(bh.class, "data is no blocks");
    this.d = paramrg;
    Resources localResources = a.a().b().getResources();
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; ; i++)
    {
      if (i >= paramJSONArray.length())
        return localArrayList;
      JSONObject localJSONObject = paramJSONArray.optJSONObject(i);
      sg localsg = (sg)bz.a(localJSONObject);
      localsg.a((int)localResources.getDimension(d.d("mini_margin_left")), 0, (int)localResources.getDimension(d.d("mini_margin_right")), 0);
      localsg.a(localJSONObject);
      a(localsg, localJSONObject);
      localArrayList.add(localsg);
      this.a.put(localsg.c(), localsg);
    }
  }

  public final bw b()
  {
    return this.c;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.mini.window.sdk.bh
 * JD-Core Version:    0.6.0
 */