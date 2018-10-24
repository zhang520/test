package com.yy.game.service;

import com.yy.game.service.impl.LinkServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class LinkServiceTest {

    LinkService linkService;

    @Before
    public void before() {
        linkService = new LinkServiceImpl();
    }

    @Test
    public void testList() {
        linkService.list();
    }
}
