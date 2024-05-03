package com.cinema.domain.dto;


import lombok.*;

@Builder
@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
public class ClientDto {
    private String id;
    private String name;
    private String phone;
    private String email;
}
