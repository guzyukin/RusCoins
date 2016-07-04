package com.gzkn.coins.fragment;
import com.gzkn.coins.*;
import android.app.*;
import android.view.*;
import android.os.*;
import android.widget.*;

public class CategoriesFragment extends Fragment
{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		ViewGroup view = (ViewGroup)inflater.inflate(R.layout.categories_fragment_layout,
			container, false);
		Button btn = new Button(view.getContext(), null, R.style.CategoryButton);
		btn.setText("my btn");
		btn.setTextColor(0x333333);
		view.addView(btn);
		return view;
	}
	

}
