package com.starterkit.springboot.brs.controller.v1.request.bootcamp;

import java.util.Date;
import java.util.List;

public class SessionRequest {
    String id;
    String name;
    Date SessionDate;
    List<SessionItemRequest> sessionItems;
}
