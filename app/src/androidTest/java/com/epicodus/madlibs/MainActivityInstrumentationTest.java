package com.epicodus.madlibs;


import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityInstrumentationTest {

//    @Rule
//    public ActivityTestRule<MainActivity> activityTestRule =
//            new ActivityTestRule<>(MainActivity.class);
//
//    @Test
//    public void validateEditText() {
//        onView(withId(R.id.nationality)).perform(typeText("Canadians"))
//                .check(matches(withText("Canadians")));
//    }
//
//    @Test
//    public void nationalityIsSentToResultsActivity() {
//        String nationality = "Canadians";
//        onView(withId(R.id.nationality)).perform(typeText(nationality));
//        onView(withId(R.id.button)).perform(click());
//        onView(withId(R.id.resultsTextView)).check(matches
//                (withText("All " + nationality + " are . They bring . We need to keep those clowns away from our . The only way to do that is to build a yuge . Also we need to get rid of that super loser . Have you seen their . Hey, if my wasn’t related to me I’d them.")));
//    }
}
