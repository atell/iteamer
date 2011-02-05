package com.iteamer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class MatesActivity extends Activity {

	protected final static String tag = "MatesActivity";

	private Gallery matesGallery;
	private TextView matesTextViewName;
	private TextView matesTextViewEmail;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mates);

		this.matesGallery = (Gallery) findViewById(R.id.mates_gallery);
		matesGallery.setAdapter(new MatesImageAdapter(this));

		this.matesTextViewName = (TextView) findViewById(R.id.mates_name_value);
		this.matesTextViewEmail = (TextView) findViewById(R.id.mates_email_value);

		matesGallery.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				MatesImageAdapter matesImageAdapter = (MatesImageAdapter) parent
						.getAdapter();
				matesTextViewName
						.setText(matesImageAdapter.getMate().getName());
				matesTextViewEmail.setText(matesImageAdapter.getMate()
						.getEmail());
			}
		});
	}
}