package com.example.cargo;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import android.content.Context;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule(MainActivity.class);

    @Test
    public void BackBtnClickedType1() {

        onView(withId(R.id.type1)).perform(click());
        onView(withId(R.id.ImageButtonBackArrow)).perform(click());
        onView(withId(R.id.ArgosFragmentId)).check(matches(isDisplayed()));

    }


    @Test
    public void BackBtnClickedSearchPage() {
        onView(withId(R.id.search)).perform(click());
        onView(withId(R.id.back_arrow_search_fragment)).perform(click());
        onView(withId(R.id.contact_click)).check(matches(isDisplayed()));
    }

    @Test
    // test if recyclerview comes into view when the activity is launched
    public void ListOfMessages_Visible_onLaunch(){
        onView(withId(R.id.search)).perform(click());
        onView(withId(R.id.productRecyclerView)).check(matches(isDisplayed()));
    }
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.cargo", appContext.getPackageName());
    }

}