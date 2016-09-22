package com.alipay.wandoujia;

import android.support.v4.app.b;
import android.support.v4.app.d;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bg extends bw
{
  private ListView b;
  private View c;
  private List d;
  private List e;
  private String f;

  protected final int a()
  {
    return d.f("mini_ui_select_button");
  }

  public final void a(JSONObject paramJSONObject)
  {
    super.a(paramJSONObject);
    JSONArray localJSONArray;
    if (n() == null)
    {
      localJSONArray = null;
      if (localJSONArray != null)
      {
        this.e = new ArrayList();
        this.d = new ArrayList();
      }
    }
    for (int i = 0; ; i++)
    {
      if (i >= localJSONArray.length())
      {
        return;
        localJSONArray = (JSONArray)n();
        break;
      }
      JSONObject localJSONObject = localJSONArray.optJSONObject(i);
      this.d.add(localJSONObject.optString("text"));
      this.e.add(localJSONObject.optString("val"));
    }
  }

  public final int e()
  {
    ListView localListView = this.b;
    bz.a(localListView);
    if (localListView != null)
      return localListView.getId();
    return 0;
  }

  public final JSONObject h()
  {
    JSONObject localJSONObject = v();
    try
    {
      localJSONObject.put(c(), this.f);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      b.b(localJSONException);
    }
    return localJSONObject;
  }

  public final void i()
  {
    super.i();
    this.b = null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.bg
 * JD-Core Version:    0.6.0
 */