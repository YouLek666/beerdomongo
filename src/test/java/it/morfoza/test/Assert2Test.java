package it.morfoza.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


import static org.assertj.core.api.Assertions.*;

/**
 * Created by widzew on 2016-08-12.
 */
public class Assert2Test {

    @Test
    public void should() {

        Object kiełbasa = new Object();
        Object kaszanka = new Object();

        Assert.assertNotEquals(kiełbasa, kaszanka);
        Assert.assertFalse(false);


    }
}
