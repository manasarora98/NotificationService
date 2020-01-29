package com.project.NotifcationService.NotificationService.controller;

import com.project.NotifcationService.NotificationService.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/notification")
public class NotificationController {
    @Autowired
    NotificationService notificationService;



}
