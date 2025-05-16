package org.foodee.noti_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Notification {

    @Id
    private Long notificationId;

    private String notificationTitle;

    private String notificationMessage;

    private Boolean notificationIsRead;

    private LocalDateTime notificationCreatedAt;

    private String notificationCreatedBy;

    private LocalDateTime notificationUpdatedAt;

    private String notificationUpdatedBy;

    private String userId;
}
