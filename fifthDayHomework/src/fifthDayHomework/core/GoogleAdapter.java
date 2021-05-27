package fifthDayHomework.core;

import fifthDayHomework.Google.Google;

public class GoogleAdapter implements GoogleService {

//	private Google google;
//
//	public GoogleAdapter(Google google) {
//		super();
//		this.google = google;
//	}
//	

	@Override
	public void registerToSystem(String message) {
		Google google = new Google();
		google.send(message);
		

		
	}

}
