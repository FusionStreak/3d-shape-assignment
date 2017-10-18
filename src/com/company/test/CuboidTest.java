package com.company.test;

import com.company.Cuboid;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CuboidTest {
    private Cuboid myCube;
    private Cuboid myCuboid;

    @Before
    public void setUp() throws Exception {
        myCube = new Cuboid(25,25,25);
        myCuboid = new Cuboid(20,(float)15.25,(float)18.36);
    }

    @Test
    public void getVolume() throws Exception {
        float volume = myCube.getVolume();
        assertEquals (15625, volume, 0.0);
        float volume2 = myCuboid.getVolume();
        assertEquals (5599.8, volume2, 0.01);
    }


    @Test
    public void volumeExplain() throws Exception {

    }
}