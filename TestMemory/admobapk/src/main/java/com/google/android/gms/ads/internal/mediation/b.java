package com.google.android.gms.ads.internal.mediation;

import com.google.android.gms.ads.internal.report.client.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@a
public final class b
{
  public final String a;
  public final String b;
  public final List c;
  public final String d;
  public final String e;
  public final List f;
  public final List g;
  public final List h;
  public final String i;
  public final List j;
  public final List k;
  public final String l;
  public final String m;
  public final String n;
  public final List o;
  public final String p;

  public b(String paramString1, String paramString2, List paramList1, String paramString3, String paramString4, List paramList2, List paramList3, String paramString5, List paramList4, List paramList5, String paramString6, String paramString7, String paramString8, List paramList6, String paramString9, List paramList7)
  {
    this.a = paramString1;
    this.b = null;
    this.c = paramList1;
    this.d = null;
    this.e = null;
    this.f = paramList2;
    this.g = paramList3;
    this.i = paramString5;
    this.j = paramList4;
    this.k = paramList5;
    this.l = null;
    this.m = null;
    this.n = null;
    this.o = null;
    this.p = null;
    this.h = paramList7;
  }

  public b(JSONObject paramJSONObject)
  {
    this.b = paramJSONObject.getString("id");
    JSONArray localJSONArray = paramJSONObject.getJSONArray("adapters");
    ArrayList localArrayList = new ArrayList(localJSONArray.length());
    for (int i1 = 0; i1 < localJSONArray.length(); i1++)
      localArrayList.add(localJSONArray.getString(i1));
    this.c = Collections.unmodifiableList(localArrayList);
    this.d = paramJSONObject.optString("allocation_id", null);
    this.f = k.a(paramJSONObject, "clickurl");
    this.g = k.a(paramJSONObject, "imp_urls");
    this.h = k.a(paramJSONObject, "fill_urls");
    this.j = k.a(paramJSONObject, "video_start_urls");
    this.k = k.a(paramJSONObject, "video_complete_urls");
    JSONObject localJSONObject1 = paramJSONObject.optJSONObject("ad");
    String str1;
    String str2;
    label214: String str3;
    label234: JSONObject localJSONObject3;
    if (localJSONObject1 != null)
    {
      str1 = localJSONObject1.toString();
      this.a = str1;
      JSONObject localJSONObject2 = paramJSONObject.optJSONObject("data");
      if (localJSONObject2 == null)
        break label341;
      str2 = localJSONObject2.toString();
      this.i = str2;
      if (localJSONObject2 == null)
        break label347;
      str3 = localJSONObject2.optString("class_name");
      this.e = str3;
      this.l = paramJSONObject.optString("html_template", null);
      this.m = paramJSONObject.optString("ad_base_url", null);
      localJSONObject3 = paramJSONObject.optJSONObject("assets");
      if (localJSONObject3 == null)
        break label353;
    }
    label341: label347: label353: for (String str4 = localJSONObject3.toString(); ; str4 = null)
    {
      this.n = str4;
      this.o = k.a(paramJSONObject, "template_ids");
      JSONObject localJSONObject4 = paramJSONObject.optJSONObject("ad_loader_options");
      String str5 = null;
      if (localJSONObject4 != null)
        str5 = localJSONObject4.toString();
      this.p = str5;
      return;
      str1 = null;
      break;
      str2 = null;
      break label214;
      str3 = null;
      break label234;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.mediation.b
 * JD-Core Version:    0.6.0
 */