package com.iteamer;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class MatesImageAdapter extends BaseAdapter {
	int matesGalleryItemBackground;
	private Context context;

	private Integer[] matesImageIds = { R.drawable.mates_1, R.drawable.mates_2,
			R.drawable.mates_3 };

	public MatesImageAdapter(Context context) {
		this.context = context;
		TypedArray arrt = context
				.obtainStyledAttributes(R.styleable.mates_gallery);
		matesGalleryItemBackground = arrt.getResourceId(
				R.styleable.mates_gallery_android_galleryItemBackground, 0);
		arrt.recycle();
	}

	public int getCount() {
		return matesImageIds.length;
	}

	public Object getItem(int position) {
		return position;
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView i = new ImageView(context);

		i.setImageResource(matesImageIds[position]);
		i.setLayoutParams(new Gallery.LayoutParams(150, 100));
		i.setScaleType(ImageView.ScaleType.FIT_XY);
		i.setBackgroundResource(matesGalleryItemBackground);

		return i;
	}
}