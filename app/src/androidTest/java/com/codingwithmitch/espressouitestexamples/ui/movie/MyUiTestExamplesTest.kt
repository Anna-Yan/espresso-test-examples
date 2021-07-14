package com.codingwithmitch.espressouitestexamples.ui.movie

import android.content.Context
import android.util.Log
import android.widget.Toast
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
import kotlin.coroutines.coroutineContext

@RunWith(AndroidJUnit4ClassRunner::class)
class MyUiTestExamplesTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)


    @Before
    fun setUp() {
        Log.d("MyTest", "in BEFORE")
    }

    @Test
    fun test_isActivityInView(){
        onView(withId(R.id.main)).check(matches(isDisplayed()))

    }

    @After
    fun tearDown() {
        Log.d("MyTest", "in AFTER")
    }
}