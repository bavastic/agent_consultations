/*
 * *************************************************************************************************
 *  Copyright (C) 2021-2022 Xempus AG - info@xempus.com
 *  Copyright (C) 2015-2021 xbAV AG - info@xbav.de
 *
 *  All rights reserved. This file is part of the XEMPUS platform.
 *  The XEMPUS platform or any parts of it may not be reproduced,
 *  distributed or transmitted in any form or by any means without
 *  prior permission in writing of:
 *
 *  Xempus AG, Arnulfstr. 126, 80636 Munich, Germany
 * *************************************************************************************************
 */
package com.xempus.codinginterview

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.post
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.context.WebApplicationContext
import java.util.*

@SpringBootTest
@Transactional
class MvcTest {

    private lateinit var mockMvc: MockMvc

    @Autowired
    private lateinit var applicationContext: WebApplicationContext

    @BeforeEach
    fun init() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.applicationContext).build();
    }

    @Test
    fun testConsultationsGetCreated() {

        var agentId = UUID.fromString("4ba4ec9c-d737-4390-aac8-f5db42dcaab9")
        var consultationId = UUID.fromString("4ba4ec9c-d737-4390-aac8-f5db42dcaab9")


        /*
        * Please provide a rest controller, accepting a POST Request to
        *
        * /consultations/{consultationId}?clientId={clientId}&agentId={agentId}&insurer={insurerName}
        *
        * Persist the consultation.
        *
        * Structure to code as you would in a real project.
        *
        * Feel free to use any library you want.
        *
        * Make sure it is easily testable.
        *
        * Feel free to think out loud and have fun.
        * */
        mockMvc?.post("/consultations/$consultationId") {
            this.param("client", UUID.randomUUID().toString())
            // you can safely assume agent 4ba4ec9c-d737-4390-aac8-f5db42dcaab9 to be available in the database.
            this.param("agentId", agentId.toString())
            this.param("insurer", "HDI")
        }.andExpect { status { isOk() } }

    }
}
