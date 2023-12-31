package com.jfecm.bankaccountmanagement.dto.request;

import com.jfecm.bankaccountmanagement.entity.enums.UserStatus;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RequestCreateClient {
    private String dni;
    private String name;
    private String email;
    private String password;
    private String address;
    private UserStatus userStatus;
}
