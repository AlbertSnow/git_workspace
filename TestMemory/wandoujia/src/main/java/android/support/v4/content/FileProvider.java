package android.support.v4.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider
{
  private static final String[] a = { "_display_name", "_size" };
  private static final File b = new File("/");
  private static HashMap<String, b> c = new HashMap();
  private b d;

  private static b a(Context paramContext, String paramString)
  {
    b localb;
    synchronized (c)
    {
      localb = (b)c.get(paramString);
      if (localb != null);
    }
    while (true)
    {
      String str1;
      String str3;
      try
      {
        localb = new b();
        localXmlResourceParser = paramContext.getPackageManager().resolveContentProvider(paramString, 128).loadXmlMetaData(paramContext.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (localXmlResourceParser != null)
          continue;
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
      }
      catch (IOException localIOException)
      {
        XmlResourceParser localXmlResourceParser;
        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", localIOException);
        localObject1 = finally;
        monitorexit;
        throw localObject1;
        int i = localXmlResourceParser.next();
        if (i == 1)
          break label296;
        if (i != 2)
          continue;
        str1 = localXmlResourceParser.getName();
        String str2 = localXmlResourceParser.getAttributeValue(null, "name");
        str3 = localXmlResourceParser.getAttributeValue(null, "path");
        if ("root-path".equals(str1))
        {
          localObject2 = a(b, new String[] { str3 });
          if (localObject2 == null)
            continue;
          localb.a(str2, (File)localObject2);
          continue;
        }
      }
      catch (XmlPullParserException localXmlPullParserException)
      {
        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", localXmlPullParserException);
      }
      if ("files-path".equals(str1))
      {
        localObject2 = a(paramContext.getFilesDir(), new String[] { str3 });
        continue;
      }
      if ("cache-path".equals(str1))
      {
        localObject2 = a(paramContext.getCacheDir(), new String[] { str3 });
        continue;
      }
      if ("external-path".equals(str1))
      {
        File localFile = a(Environment.getExternalStorageDirectory(), new String[] { str3 });
        localObject2 = localFile;
        continue;
        label296: c.put(paramString, localb);
        monitorexit;
        return localb;
      }
      Object localObject2 = null;
    }
  }

  private static File a(File paramFile, String[] paramArrayOfString)
  {
    int i = 0;
    Object localObject1 = paramFile;
    String str;
    if (i <= 0)
    {
      str = paramArrayOfString[0];
      if (str == null)
        break label41;
    }
    label41: for (Object localObject2 = new File((File)localObject1, str); ; localObject2 = localObject1)
    {
      i++;
      localObject1 = localObject2;
      break;
      return localObject1;
    }
  }

  public void attachInfo(Context paramContext, ProviderInfo paramProviderInfo)
  {
    super.attachInfo(paramContext, paramProviderInfo);
    if (paramProviderInfo.exported)
      throw new SecurityException("Provider must not be exported");
    if (!paramProviderInfo.grantUriPermissions)
      throw new SecurityException("Provider must grant uri permissions");
    this.d = a(paramContext, paramProviderInfo.authority);
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    if (this.d.a(paramUri).delete())
      return 1;
    return 0;
  }

  public String getType(Uri paramUri)
  {
    File localFile = this.d.a(paramUri);
    int i = localFile.getName().lastIndexOf('.');
    if (i >= 0)
    {
      String str1 = localFile.getName().substring(i + 1);
      String str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str1);
      if (str2 != null)
        return str2;
    }
    return "application/octet-stream";
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    throw new UnsupportedOperationException("No external inserts");
  }

  public boolean onCreate()
  {
    return true;
  }

  public ParcelFileDescriptor openFile(Uri paramUri, String paramString)
  {
    File localFile = this.d.a(paramUri);
    int i;
    if ("r".equals(paramString))
      i = 268435456;
    while (true)
    {
      return ParcelFileDescriptor.open(localFile, i);
      if (("w".equals(paramString)) || ("wt".equals(paramString)))
      {
        i = 738197504;
        continue;
      }
      if ("wa".equals(paramString))
      {
        i = 704643072;
        continue;
      }
      if ("rw".equals(paramString))
      {
        i = 939524096;
        continue;
      }
      if (!"rwt".equals(paramString))
        break;
      i = 1006632960;
    }
    throw new IllegalArgumentException("Invalid mode: " + paramString);
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    File localFile = this.d.a(paramUri);
    if (paramArrayOfString1 == null)
      paramArrayOfString1 = a;
    String[] arrayOfString1 = new String[paramArrayOfString1.length];
    Object[] arrayOfObject1 = new Object[paramArrayOfString1.length];
    int i = paramArrayOfString1.length;
    int j = 0;
    int k = 0;
    String str;
    int m;
    if (j < i)
    {
      str = paramArrayOfString1[j];
      if ("_display_name".equals(str))
      {
        arrayOfString1[k] = "_display_name";
        m = k + 1;
        arrayOfObject1[k] = localFile.getName();
      }
    }
    while (true)
    {
      j++;
      k = m;
      break;
      if ("_size".equals(str))
      {
        arrayOfString1[k] = "_size";
        m = k + 1;
        arrayOfObject1[k] = Long.valueOf(localFile.length());
        continue;
        String[] arrayOfString2 = new String[k];
        System.arraycopy(arrayOfString1, 0, arrayOfString2, 0, k);
        Object[] arrayOfObject2 = new Object[k];
        System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, k);
        MatrixCursor localMatrixCursor = new MatrixCursor(arrayOfString2, 1);
        localMatrixCursor.addRow(arrayOfObject2);
        return localMatrixCursor;
      }
      m = k;
    }
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    throw new UnsupportedOperationException("No external updates");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.content.FileProvider
 * JD-Core Version:    0.6.0
 */