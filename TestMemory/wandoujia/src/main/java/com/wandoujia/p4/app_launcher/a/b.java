package com.wandoujia.p4.app_launcher.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.mvc.Action;
import com.wandoujia.p4.a;
import com.wandoujia.p4.app_launcher.model.ALSuggestion.Extra;
import com.wandoujia.p4.app_launcher.model.ALSuggestion.FunctionInfo;
import com.wandoujia.p4.app_launcher.model.ALSuggestion.Intent;
import java.util.Iterator;
import java.util.List;

public final class b
  implements Action
{
  private ALSuggestion.FunctionInfo a;

  public b(ALSuggestion.FunctionInfo paramFunctionInfo)
  {
    this.a = paramFunctionInfo;
  }

  public final void execute()
  {
    if ((this.a == null) || (this.a.intent == null));
    while (true)
    {
      return;
      Object localObject;
      if (!TextUtils.isEmpty(this.a.intent.uri))
      {
        Intent localIntent1 = new Intent("android.intent.action.VIEW", Uri.parse(this.a.intent.uri));
        localIntent1.addFlags(268435456);
        localObject = localIntent1;
      }
      while (localObject != null)
      {
        if (!CollectionUtils.isEmpty(this.a.intent.intentExtrasList))
        {
          Iterator localIterator = this.a.intent.intentExtrasList.iterator();
          while (true)
          {
            if (!localIterator.hasNext())
              break label405;
            ALSuggestion.Extra localExtra = (ALSuggestion.Extra)localIterator.next();
            if ((TextUtils.isEmpty(localExtra.key)) || (TextUtils.isEmpty(localExtra.value)))
              continue;
            if (!TextUtils.isEmpty(localExtra.type))
            {
              if ("int".equals(localExtra.type))
              {
                ((Intent)localObject).putExtra(localExtra.key, Integer.parseInt(localExtra.value));
                continue;
                if ((TextUtils.isEmpty(this.a.intent.componentPackage)) || (TextUtils.isEmpty(this.a.intent.componentClass)))
                  break label463;
                Intent localIntent2 = new Intent();
                ComponentName localComponentName = new ComponentName(this.a.intent.componentPackage, this.a.intent.componentClass);
                if (TextUtils.isEmpty(this.a.intent.action))
                  localIntent2.setAction("android.intent.action.MAIN");
                while (true)
                {
                  localIntent2.addCategory("android.intent.category.LAUNCHER");
                  localIntent2.addFlags(268435456);
                  localIntent2.setComponent(localComponentName);
                  localObject = localIntent2;
                  break;
                  localIntent2.setAction(this.a.intent.action);
                }
              }
              if ("boolean".equals(localExtra.type))
              {
                ((Intent)localObject).putExtra(localExtra.key, Boolean.parseBoolean(localExtra.value));
                continue;
              }
              ((Intent)localObject).putExtra(localExtra.key, localExtra.value);
              continue;
            }
            ((Intent)localObject).putExtra(localExtra.key, localExtra.value);
          }
        }
        label405: Context localContext = a.a();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.a.title;
        String str = localContext.getString(2131624288, arrayOfObject);
        try
        {
          a.a().startActivity((Intent)localObject);
          label445: Toast.makeText(a.a(), str, 0).show();
          return;
        }
        catch (Exception localException)
        {
          break label445;
        }
        label463: localObject = null;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.a.b
 * JD-Core Version:    0.6.0
 */