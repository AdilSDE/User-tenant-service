package com.sourcefuse.userintentservice.DTO;

import jakarta.persistence.*;

import com.sourcefuse.userintentservice.commons.UserModifiableEntity;
import com.sourcefuse.userintentservice.enums.UserConfigKey;
import lombok.*;

@Entity(name = "user_tenant_prefs")
@NoArgsConstructor
@AllArgsConstructor
public class UserTenantPrefs extends UserModifiableEntity {
    
    @Id
    @Column(name = "id")
    private String id;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "config_key", nullable = false)
    private UserConfigKey configKey;
    //doubt:
//    @Column(name = "config_value", nullable = false)
//    private Object configValue;
    
    @ManyToOne(optional = true)
    @JoinColumn(name = "user_tenant_id")
    private UserTenant userTenantId;

}
