package com.oop.IS_A;

public class RecordedCourse extends Course {

	int numberOfVideos;
	int pricePerVideo;

	public RecordedCourse(int courseId, String title, String instructor, int numberOfVideos, int pricePerVideo) {

		super(courseId, title, instructor);
		this.numberOfVideos = numberOfVideos;
		this.pricePerVideo = pricePerVideo;
	}

	double calculateFee() {
		return numberOfVideos * pricePerVideo;
	}

	String courseType() {
		return "Recorded";
	}

	public static void main(String[] args) {

		RecordedCourse recordedCourse = new RecordedCourse(111, "COREJAVA", "AADI", 40, 250);
		double fee = recordedCourse.calculateFee();
		System.out.println(fee);
		String type = recordedCourse.courseType();
		System.out.println(type);
		recordedCourse.show();
	}
}
