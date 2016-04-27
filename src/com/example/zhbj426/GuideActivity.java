package com.example.zhbj426;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class GuideActivity extends Activity {
	
		private static final int[] mIMAGEIDS
									= new int[]{R.drawable.guide_1
											,R.drawable.guide_2
											,R.drawable.guide_3};
	    private ViewPager vpguide;
		private ArrayList<ImageView> mImageViewList;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			
			setContentView(R.layout.activity_guide);
			
			vpguide = (ViewPager) findViewById(R.id.vp_guide);
			initViews();
			vpguide.setAdapter(new GuideAdapter());
		}
		
		//加载引导页的3个页面
		private void initViews(){
			mImageViewList = new ArrayList<ImageView>();
			
			for(int i=0;i<mIMAGEIDS.length;i++){
			ImageView imageview = new ImageView(this);
			imageview.setBackgroundResource(mIMAGEIDS[i]);
			
			mImageViewList.add(imageview);
			}
		}
		
		/**
		 * viewPager数据适配器
		 * @author Administrator
		 *
		 */
		class GuideAdapter extends PagerAdapter{

			@Override
			public int getCount() {
				return mIMAGEIDS.length;
			}

			@Override
			public boolean isViewFromObject(View arg0, Object arg1) {
				return arg0 == arg1;
			}
			
			@Override
			public Object instantiateItem(ViewGroup container, int position) {
				container.addView(mImageViewList.get(position));
				return mImageViewList.get(position);
			}
			
			@Override
			public void destroyItem(ViewGroup container, int position, Object object) {
				container.removeView((View)object);
			}
			
		}
}
