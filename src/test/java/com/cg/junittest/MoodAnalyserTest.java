package com.cg.junittest;

import org.junit.*;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_whenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("This is a Sad Message");
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_whenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("This is a Happy Message");
		Assert.assertEquals("Happy", mood);
	}
}
