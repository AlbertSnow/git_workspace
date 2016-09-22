package com.wandoujia.image;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.wandoujia.base.log.Log;
import com.wandoujia.image.view.AsyncImageView;
import java.io.Serializable;
import java.util.List;

public class ImageUri
  implements Serializable
{
  private static final long serialVersionUID = 5590979328379052735L;
  public String imageUri;
  public ImageUri.ImageUriType imageUriType;
  public List<String> imageUris;

  public ImageUri()
  {
  }

  public ImageUri(String paramString, ImageUri.ImageUriType paramImageUriType)
  {
    this.imageUri = paramString;
    this.imageUriType = paramImageUriType;
  }

  public ImageUri(List<String> paramList)
  {
    this.imageUris = paramList;
    this.imageUriType = ImageUri.ImageUriType.MULTI_ICONS;
  }

  private void setImageView(ImageView paramImageView, int paramInt)
  {
    if ((this.imageUri == null) || (this.imageUriType == null))
    {
      setStaticImageResource(paramImageView, paramInt);
      return;
    }
    switch (ad.a[this.imageUriType.ordinal()])
    {
    default:
      setStaticImageResource(paramImageView, paramInt);
      return;
    case 1:
      ((AsyncImageView)paramImageView).a(this.imageUri, paramInt);
      return;
    case 2:
      while (true)
      {
        try
        {
          i = Integer.parseInt(this.imageUri);
          if (i <= 0)
            break label112;
          setStaticImageResource(paramImageView, i);
          return;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          Log.printStackTrace(localNumberFormatException);
        }
        break;
        int i = paramInt;
      }
    case 3:
      ((AsyncImageView)paramImageView).d(this.imageUri, paramInt);
      return;
    case 4:
      label112: ((AsyncImageView)paramImageView).c(this.imageUri, paramInt);
      return;
    case 5:
    }
    ((AsyncImageView)paramImageView).b(this.imageUri, paramInt);
  }

  private static void setStaticImageResource(ImageView paramImageView, int paramInt)
  {
    if ((paramImageView instanceof AsyncImageView))
    {
      ((AsyncImageView)paramImageView).setStaticImageResource(paramInt);
      return;
    }
    paramImageView.setImageResource(paramInt);
  }

  public void apply(ImageView paramImageView, int paramInt)
  {
    setImageView(paramImageView, paramInt);
  }

  public void apply(List<ImageView> paramList, int paramInt)
  {
    if (this.imageUriType != ImageUri.ImageUriType.MULTI_ICONS)
      Log.w("ImageView", "wrong type", new Object[0]);
    while (true)
    {
      return;
      int i = Math.min(this.imageUris.size(), paramList.size());
      for (int j = 0; j < i; j++)
        ((AsyncImageView)paramList.get(j)).a((String)this.imageUris.get(j), paramInt);
    }
  }

  public String getImageUri()
  {
    return this.imageUri;
  }

  public ImageUri.ImageUriType getImageUriType()
  {
    return this.imageUriType;
  }

  public Drawable load(int paramInt)
  {
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.ImageUri
 * JD-Core Version:    0.6.0
 */