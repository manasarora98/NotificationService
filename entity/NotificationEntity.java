package com.project.NotifcationService.NotificationService.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "notification")
public class NotificationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String notificationId;
    @CreationTimestamp
    private LocalDateTime timestamp;
    private String notificationBody;
    private String userId;

}
