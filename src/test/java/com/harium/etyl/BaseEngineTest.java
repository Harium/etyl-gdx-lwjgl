package com.harium.etyl;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BaseEngineTest {

    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;

    @Before
    public void setUp() {
        Gdx.app = mock(Application.class);
        when(Gdx.app.getType()).thenReturn(Application.ApplicationType.Desktop);
    }

    @Test
    public void testInit() {
        LwjglApplicationConfiguration configuration = new LwjglApplicationConfiguration();
        Assert.assertNotNull(configuration);
    }

}
