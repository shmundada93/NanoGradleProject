package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.test.AndroidTestCase;
import android.test.InstrumentationTestCase;
import android.util.Log;


import java.util.concurrent.TimeUnit;

/**
 * Created by shmundad on 8/31/2016.
 */
public class AsyncTest extends InstrumentationTestCase {

    public void testAsynTask(){
        try {
            JokeAsyncTask jokeTask = new JokeAsyncTask();
            jokeTask.execute();
            String joke = jokeTask.get(60, TimeUnit.SECONDS);
            Log.d("AsyncTest", "Joke: " + joke);
            assertNotNull(joke);
        } catch (Exception e){
            fail("Timed out");
        }
    }
}
