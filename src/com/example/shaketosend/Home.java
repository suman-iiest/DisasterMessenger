package com.example.shaketosend;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Home extends Fragment{
	
	public Home()
	{
		//  empty constructor
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
		View vfrag=inflater.inflate(R.layout.activity_main,container,false);
		return vfrag;
	}

}
