package com.wandoujia.jupiter.d;

import android.text.TextUtils;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class a
{
  private String a;
  private String b;
  private String c;
  private String d;
  private String e;
  private boolean f;
  private boolean g = true;

  public static a a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (TextUtils.isEmpty(paramString1))
      return null;
    a locala = new a();
    locala.a = paramString1;
    boolean bool = TextUtils.isEmpty(paramString2);
    String str = null;
    if (bool);
    while (true)
    {
      locala.b = str;
      locala.c = paramString3;
      locala.d = paramString4;
      locala.e = paramString5;
      locala.f = paramBoolean1;
      locala.g = paramBoolean2;
      return locala;
      str = paramString2.trim();
    }
  }

  public static a a(JSONObject paramJSONObject, String paramString)
  {
    boolean bool1 = true;
    String str1 = paramJSONObject.optString(paramString);
    JSONObject localJSONObject = paramJSONObject.optJSONObject(paramString);
    if ((localJSONObject != null) && (localJSONObject.has("name")))
      str1 = localJSONObject.optString("name");
    if ((localJSONObject != null) && (localJSONObject.has("host")));
    for (String str2 = localJSONObject.optString("host"); ; str2 = null)
    {
      if ((localJSONObject != null) && (localJSONObject.has("params")));
      for (String str3 = localJSONObject.optString("params"); ; str3 = null)
      {
        if ((localJSONObject != null) && (localJSONObject.has("enctype")));
        for (String str4 = localJSONObject.optString("enctype"); ; str4 = null)
        {
          String str5 = null;
          if (localJSONObject != null)
          {
            boolean bool3 = localJSONObject.has("request_param");
            str5 = null;
            if (bool3)
              str5 = localJSONObject.optString("request_param");
          }
          if ((localJSONObject != null) && (localJSONObject.has("validate")));
          for (boolean bool2 = localJSONObject.optBoolean("validate", bool1); ; bool2 = bool1)
          {
            if ((localJSONObject != null) && (localJSONObject.has("https")) && (localJSONObject.optBoolean("https")))
              bool1 = false;
            return a(str1, str2, str3, str4, str5, bool2, bool1);
          }
        }
      }
    }
  }

  public static com.wandoujia.nirvana.framework.network.page.e<Model> a()
  {
    return new h(0);
  }

  public static com.wandoujia.nirvana.framework.network.page.e<Model> a(int paramInt)
  {
    return new f(paramInt);
  }

  public static List<Model> a(List<Model> paramList, int paramInt)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Model localModel = (Model)localIterator.next();
      if ((localModel.F() != null) && (b(localModel.F().package_name)))
      {
        String str = localModel.F().package_name;
        if (((AppManager)i.k().a("app")).g(str))
        {
          localArrayList3.add(localModel);
          continue;
        }
        localArrayList2.add(localModel);
        continue;
      }
      localArrayList1.add(localModel);
      if (localArrayList1.size() >= paramInt)
        return localArrayList1;
    }
    if (localArrayList3.size() + localArrayList1.size() > paramInt)
    {
      localArrayList1.addAll(localArrayList3.subList(0, paramInt - localArrayList1.size()));
      if (localArrayList2.size() + localArrayList1.size() <= paramInt)
        break label246;
      localArrayList1.addAll(localArrayList2.subList(0, paramInt - localArrayList1.size()));
    }
    while (true)
    {
      return localArrayList1;
      localArrayList1.addAll(localArrayList3);
      break;
      label246: localArrayList1.addAll(localArrayList2);
    }
  }

  public static com.wandoujia.nirvana.framework.network.page.e<Model> b()
  {
    return com.wandoujia.ripple_framework.d.a.a(new d(0), new h(0));
  }

  private static boolean b(String paramString)
  {
    return ((AppManager)i.k().a("app")).h(paramString);
  }

  public static com.wandoujia.nirvana.framework.network.page.e<Model> c()
  {
    return new c(0);
  }

  public static com.wandoujia.nirvana.framework.network.page.e<Model> d()
  {
    return new f(2147483647);
  }

  public static com.wandoujia.nirvana.framework.network.page.e<Model> e()
  {
    return new e(0);
  }

  public static com.wandoujia.nirvana.framework.network.page.e<Model> f()
  {
    return new g(0);
  }

  public final String g()
  {
    return this.a;
  }

  public final String h()
  {
    if (TextUtils.isEmpty(this.b))
      this.b = com.wandoujia.image.c.a.a().c().h();
    return this.b;
  }

  public final String i()
  {
    return this.c;
  }

  public final JSONObject j()
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(this.c);
      return localJSONObject;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final String k()
  {
    return this.d;
  }

  public final String l()
  {
    return this.e;
  }

  public final boolean m()
  {
    return this.f;
  }

  public final boolean n()
  {
    return this.g;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.d.a
 * JD-Core Version:    0.6.0
 */