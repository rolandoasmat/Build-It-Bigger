package com.udacity.gradle.builditbigger;

import static org.junit.Assert.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import android.support.test.annotation.UiThreadTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.mock.MockContext;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    @UiThreadTest
    public final void testAsyncTask() throws Throwable {
        final CountDownLatch signal = new CountDownLatch(1);

        new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String response) {
                assertFalse("Make sure response is not empty", response.equals(""));
                signal.countDown();
            }
        }.execute(new MockContext());
        signal.await(10, TimeUnit.SECONDS);
    }
}