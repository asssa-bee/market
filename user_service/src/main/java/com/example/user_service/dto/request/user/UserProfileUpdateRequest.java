package com.example.user_service.dto.request.user;

import lombok.*;

import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserProfileUpdateRequest {
    private String surname;
    private String name;
    private String patronymic;

    @Pattern(regexp = "\\+?[1-9]\\d{1,14}", message = "Номер телефона должен быть валидным")
    private String phoneNumber;
}
