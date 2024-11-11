package com.endava.grocy;

import com.endava.grocy.client.EntityClient;
import com.endava.grocy.data.DataProvider;

public class TestBaseClass {

    protected EntityClient entityClient = new EntityClient();
    protected DataProvider dataProvider = new DataProvider();
}
