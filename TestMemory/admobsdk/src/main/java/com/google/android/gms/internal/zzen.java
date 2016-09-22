package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzhb
public final class zzen
{
  public final String zzBz;
  public final String zzBA;
  public final List<String> zzBB;
  public final String zzBC;
  public final String zzBD;
  public final List<String> zzBE;
  public final List<String> zzBF;
  public final String zzBG;
  public final List<String> zzBH;
  public final List<String> zzBI;
  public final String zzBJ;
  public final String zzBK;
  public final String zzBL;
  public final List<String> zzBM;
  public final String zzBN;

  public zzen(String paramString1, String paramString2, List<String> paramList1, String paramString3, String paramString4, List<String> paramList2, List<String> paramList3, String paramString5, String paramString6, List<String> paramList4, List<String> paramList5, String paramString7, String paramString8, String paramString9, List<String> paramList6, String paramString10)
  {
    this.zzBz = paramString1;
    this.zzBA = paramString2;
    this.zzBB = paramList1;
    this.zzBC = paramString3;
    this.zzBD = paramString4;
    this.zzBE = paramList2;
    this.zzBF = paramList3;
    this.zzBG = paramString5;
    this.zzBH = paramList4;
    this.zzBI = paramList5;
    this.zzBJ = paramString7;
    this.zzBK = paramString8;
    this.zzBL = paramString9;
    this.zzBM = paramList6;
    this.zzBN = paramString10;
  }

  public zzen(JSONObject paramJSONObject)
    throws JSONException
  {
    this.zzBA = paramJSONObject.getString("id");
    JSONArray localJSONArray = paramJSONObject.getJSONArray("adapters");
    ArrayList localArrayList = new ArrayList(localJSONArray.length());
    for (int i = 0; i < localJSONArray.length(); i++)
      localArrayList.add(localJSONArray.getString(i));
    this.zzBB = Collections.unmodifiableList(localArrayList);
    this.zzBC = paramJSONObject.optString("allocation_id", null);
    this.zzBE = zzr.zzbP().zza(paramJSONObject, "clickurl");
    this.zzBF = zzr.zzbP().zza(paramJSONObject, "imp_urls");
    this.zzBH = zzr.zzbP().zza(paramJSONObject, "video_start_urls");
    this.zzBI = zzr.zzbP().zza(paramJSONObject, "video_complete_urls");
    JSONObject localJSONObject1 = paramJSONObject.optJSONObject("ad");
    this.zzBz = (localJSONObject1 != null ? localJSONObject1.toString() : null);
    JSONObject localJSONObject2 = paramJSONObject.optJSONObject("data");
    this.zzBG = (localJSONObject2 != null ? localJSONObject2.toString() : null);
    this.zzBD = (localJSONObject2 != null ? localJSONObject2.optString("class_name") : null);
    this.zzBJ = paramJSONObject.optString("html_template", null);
    this.zzBK = paramJSONObject.optString("ad_base_url", null);
    JSONObject localJSONObject3 = paramJSONObject.optJSONObject("assets");
    this.zzBL = (localJSONObject3 != null ? localJSONObject3.toString() : null);
    this.zzBM = zzr.zzbP().zza(paramJSONObject, "template_ids");
    JSONObject localJSONObject4 = paramJSONObject.optJSONObject("ad_loader_options");
    this.zzBN = (localJSONObject4 != null ? localJSONObject4.toString() : null);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzen
 * JD-Core Version:    0.6.0
 */