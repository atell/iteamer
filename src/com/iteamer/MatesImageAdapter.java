package com.iteamer;

import com.iteamer.model.Mate;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class MatesImageAdapter extends BaseAdapter {
	
	private Mate mate;
	
	
	private int matesGalleryItemBackground;
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
		
		Mate mate = new Mate();
		mate.setEmail(System.currentTimeMillis()+"@");
		mate.setPwd("123");
		mate.setName("atell");
		this.setMate(mate);
		
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

	public Mate getMate() {
		return mate;
	}

	public void setMate(Mate mate) {
		this.mate = mate;
	}
	
	
}