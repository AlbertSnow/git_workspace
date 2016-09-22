package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.R.string;
import com.google.android.gms.ads.internal.zzr;
import java.util.Map;

@zzhb
public class zzfp extends zzfs
{
  private final Map<String, String> zzxA;
  private final Context mContext;

  public zzfp(zzjp paramzzjp, Map<String, String> paramMap)
  {
    super(paramzzjp, "storePicture");
    this.zzxA = paramMap;
    this.mContext = paramzzjp.zzhP();
  }

  public void execute()
  {
    if (this.mContext == null)
    {
      zzam("Activity context is not available");
      return;
    }
    zzbl localzzbl = zzr.zzbC().zzM(this.mContext);
    if (!localzzbl.zzdl())
    {
      zzam("Feature is not supported by the device.");
      return;
    }
    String str1 = (String)this.zzxA.get("iurl");
    if (TextUtils.isEmpty(str1))
    {
      zzam("Image url cannot be empty.");
      return;
    }
    if (!URLUtil.isValidUrl(str1))
    {
      zzam("Invalid image url: " + str1);
      return;
    }
    String str2 = zzal(str1);
    if (!zzr.zzbC().zzaE(str2))
    {
      zzam("Image type not recognized: " + str2);
      return;
    }
    AlertDialog.Builder localBuilder = zzr.zzbC().zzL(this.mContext);
    localBuilder.setTitle(zzr.zzbF().zzd(R.string.store_picture_title, "Save image"));
    localBuilder.setMessage(zzr.zzbF().zzd(R.string.store_picture_message, "Allow Ad to store image in Picture gallery?"));
    localBuilder.setPositiveButton(zzr.zzbF().zzd(R.string.accept, "Accept"), new DialogInterface.OnClickListener(str1, str2)
    {
      public void onClick(DialogInterface dialog, int which)
      {
        DownloadManager localDownloadManager = (DownloadManager)zzfp.zza(zzfp.this).getSystemService("download");
        try
        {
          DownloadManager.Request localRequest = zzfp.this.zzf(this.zzDr, this.zzDs);
          localDownloadManager.enqueue(localRequest);
        }
        catch (IllegalStateException localIllegalStateException1)
        {
          zzfp.this.zzam("Could not store picture.");
        }
      }
    });
    localBuilder.setNegativeButton(zzr.zzbF().zzd(R.string.decline, "Decline"), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface dialog, int which)
      {
        zzfp.this.zzam("User canceled the download.");
      }
    });
    AlertDialog localAlertDialog = localBuilder.create();
    localAlertDialog.show();
  }

  DownloadManager.Request zzf(String paramString1, String paramString2)
  {
    DownloadManager.Request localRequest = new DownloadManager.Request(Uri.parse(paramString1));
    localRequest.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, paramString2);
    zzr.zzbE().zza(localRequest);
    return localRequest;
  }

  String zzal(String paramString)
  {
    Uri localUri = Uri.parse(paramString);
    return localUri.getLastPathSegment();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzfp
 * JD-Core Version:    0.6.0
 */