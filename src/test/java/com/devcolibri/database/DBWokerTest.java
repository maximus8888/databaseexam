package com.devcolibri.database;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by admin on 1/21/19.
 */
@RunWith(Arquillian.class)
public class DBWokerTest {
    @Test
    public void getConnection1() throws Exception {
    }

    @org.junit.Test
    public void getConnection() throws Exception {
    }

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(DBWoker.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
