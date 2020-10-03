package com.example.myapplication;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static java.util.regex.Pattern.matches;

public class MainActivityInstrumentedTest {
    @Rule
    public ActivityTestRule activityTestRule = new ActivityTestRule(MainActivity.class);

    MainActivity mainActivity;

    @Before
    public void setUp() {
        mainActivity = (MainActivity) activityTestRule.getActivity();
    }

    @Test
    public void test_text_view() {
        onView(withId(R.id.et_number)).perform(typeText("4"), closeSoftKeyboard());
        onView(withId(R.id.b_go)).perform(click());
        onView(withId(R.id.tv_show)).check(matches(withText("EVEN")));
    }

    @After
    public void tearDown(){}
}
