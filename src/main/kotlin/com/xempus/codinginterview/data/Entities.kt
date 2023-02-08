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
package com.xempus.codinginterview.data

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToOne


@Entity
class Consultation(@Id val id:UUID, @OneToOne val agent: Agent, @OneToOne val client: Client, insurer:String)
@Entity
class Agent(@Id val id: UUID, val name:String)
@Entity
class Client(@Id val id: UUID, val name:String)