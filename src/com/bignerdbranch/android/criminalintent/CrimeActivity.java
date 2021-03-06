package com.bignerdbranch.android.criminalintent;

import java.util.UUID;

import android.support.v4.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity {	

	@Override
	protected Fragment createFragment() {
		// TODO Auto-generated method stub
		UUID crimeId = (UUID)getIntent().getSerializableExtra(CrimeFragment.EXTRA_CRIME_ID);
		return CrimeFragment.newInstance(crimeId);
	}

}
