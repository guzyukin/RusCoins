package com.gzkn.coins.fragment;
import com.gzkn.coins.*;
import android.app.*;
import android.view.*;
import android.os.*;

public class CategoriesFragment extends Fragment
{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View view = inflater.inflate(R.layout.categories_fragment_layout,
			container, false);
		return view;
	}
	

}
