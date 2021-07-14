package com.codingwithmitch.espressouitestexamples.ui.movie

import android.util.Log
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.codingwithmitch.espressouitestexamples.R
import org.junit.After
import org.junit.Before
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MyUiTestExamplesTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)


    @Before
    fun setUp() {
        Log.d("Test", "in BEFORE: set up")
    }

    @Test
    fun test_isActivityInView(){
        onView(withId(R.id.main)).check(matches(isDisplayed()))
        Log.d("Test", "test_isActivityInView")
    }

    @After
    fun tearDown() {
        Log.d("Test", "in AFTER: tear down")
    }
}