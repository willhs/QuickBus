package team.awesome.quickbus;

import android.os.AsyncTask;

import java.util.List;

import team.awesome.quickbus.bus.Arrival;

public class GetArrivalsTask extends AsyncTask<Integer, Void, List<Arrival>>{

	@Override
	protected List<Arrival> doInBackground(Integer... stopNumbers) {
		return Parser.fetchStopInfo(1);
	}

}
